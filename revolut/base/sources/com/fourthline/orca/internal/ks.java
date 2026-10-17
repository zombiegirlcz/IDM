package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public interface ks extends bt {

    public static final class a implements ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30373a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 840967849;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class b implements ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30374a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 399114691;
        }

        public String toString() {
            return "Forward";
        }
    }
}
