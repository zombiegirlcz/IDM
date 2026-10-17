package my0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g {
    private g() {
    }

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f210289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f210290b;

        public a(int i, boolean z) {
            this.f210289a = i;
            this.f210290b = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f210289a == aVar.f210289a && this.f210290b == aVar.f210290b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f210290b) + (Integer.hashCode(this.f210289a) * 31);
        }

        public a() {
            this(4, true);
        }
    }
}
