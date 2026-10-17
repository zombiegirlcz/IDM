package m8b;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203469b;

    public p(int i, int i2) {
        this.f203468a = i;
        this.f203469b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f203468a == pVar.f203468a && this.f203469b == pVar.f203469b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203469b) + (Integer.hashCode(this.f203468a) * 31);
    }
}
