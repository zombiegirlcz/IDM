package aw0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class y8 {
    private y8() {
    }

    public static final class a extends y8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10632a;

        public a(boolean z) {
            this.f10632a = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f10632a == ((a) obj2).f10632a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10632a);
        }

        public a() {
            this(true);
        }
    }
}
