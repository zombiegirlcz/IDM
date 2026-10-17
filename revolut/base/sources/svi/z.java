package svi;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z {

    public static final class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f266017a = new a();

        private a() {
        }
    }

    public static final class b extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f266018a = new b();

        private b() {
        }
    }

    private z() {
    }

    public static final class c extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f266019a;

        public c(int i) {
            this.f266019a = i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f266019a == ((c) obj2).f266019a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f266019a);
        }

        public c() {
            this(0);
        }
    }
}
