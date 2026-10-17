package bbg;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14295b;

    public q(boolean z, boolean z3) {
        this.f14294a = z;
        this.f14295b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f14294a == qVar.f14294a && this.f14295b == qVar.f14295b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14295b) + (Boolean.hashCode(this.f14294a) * 31);
    }
}
