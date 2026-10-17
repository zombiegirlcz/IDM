package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public interface zt extends he1 {

    public static final class a implements zt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35713a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1649860188;
        }

        public String toString() {
            return "ClearInput";
        }
    }

    public static final class b implements zt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35714a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -192357272;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends zt, bt {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35715a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f35716a = new b();

            private b() {
            }
        }
    }
}
