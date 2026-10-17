package gcg;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k implements aii.r {

    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f142456a = new a();

        private a() {
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f142457a = new b();

        private b() {
        }
    }

    public static final class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f142459a = new d();

        private d() {
        }
    }

    private k() {
    }

    public static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f142458a;

        public c(boolean z) {
            this.f142458a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f142458a == ((c) obj2).f142458a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f142458a);
        }

        public c() {
            this(false);
        }
    }
}
