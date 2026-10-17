package hqi;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k {

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f154719a = new a();

        private a() {
        }
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f154721a = new c();

        private c() {
        }
    }

    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f154722a = new d();

        private d() {
        }
    }

    private k() {
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f154720a;

        public b(boolean z) {
            this.f154720a = z;
        }

        public final boolean a() {
            return this.f154720a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f154720a == ((b) obj2).f154720a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f154720a);
        }

        public b() {
            this(true);
        }
    }
}
