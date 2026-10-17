package wm;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b {

    public static final class a extends b {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }
    }

    /* JADX INFO: renamed from: wm.b$b, reason: collision with other inner class name */
    public static final class C1647b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1647b f298570a = new C1647b();

        private C1647b() {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f298571a = new c();

        private c() {
        }
    }

    private b() {
    }
}
