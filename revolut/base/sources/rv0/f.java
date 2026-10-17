package rv0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f257638a = new a();

        private a() {
        }

        @Override // rv0.f
        public final int a() {
            return 0;
        }
    }

    private f() {
    }

    public abstract int a();

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f257639a;

        public b(int i) {
            this.f257639a = i;
        }

        @Override // rv0.f
        public final int a() {
            return this.f257639a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f257639a == ((b) obj2).f257639a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f257639a);
        }

        public b() {
            this(0);
        }
    }
}
