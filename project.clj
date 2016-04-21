(defproject com.apa512/rethinkdb "0.15.14"
  :description "RethinkDB client"
  :url "http://github.com/apa512/clj-rethinkdb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :codox {:defaults {:doc/format :markdown}
          :src-dir-uri "https://github.com/apa512/clj-rethinkdb/blob/master/"
          :src-linenum-anchor-prefix "L"}
  :global-vars {*warn-on-reflection* true}
  :plugins [[codox "0.9.4"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48" :scope "provided"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [aleph "0.4.1"]
                 [gloss "0.2.5"]
                 [cheshire "5.6.1"]
                 [rethinkdb-protobuf "2.2.0.1"]
                 [com.google.protobuf/protobuf-java "3.0.0-alpha-3.1"]
                 [clj-time "0.11.0"]]
  :profiles {:dev {:resource-paths ["test-resources"]
                   :dependencies [[ch.qos.logback/logback-classic "1.1.7"]]}}
  :jvm-opts ["-Xmx512m"]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
