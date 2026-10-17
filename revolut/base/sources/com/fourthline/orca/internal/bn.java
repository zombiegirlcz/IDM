package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public interface bn extends he1, ee1 {

    public static final class a implements bn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27170a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 1720455951;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class b implements bn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f27171a;

        public b(boolean z) {
            this.f27171a = z;
        }

        public final boolean c() {
            return this.f27171a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f27171a == ((b) obj2).f27171a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f27171a);
        }

        public String toString() {
            return "Forward(skipPermissionRationale=" + this.f27171a + ")";
        }
    }
}
