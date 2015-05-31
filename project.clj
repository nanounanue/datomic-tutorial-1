(defproject datomic-tutorial "0.1.0-SNAPSHOT"
  :description "Clojure code for playing with the Datomic tutorial."
  :url "http://github.com/jamesmartin/datomic-tutorial"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot datomic-tutorial.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
