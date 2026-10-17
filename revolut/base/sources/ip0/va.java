package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166799c;

    public va(boolean z, boolean z3, boolean z4) {
        this.f166797a = z;
        this.f166798b = z3;
        this.f166799c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof va)) {
            return false;
        }
        va vaVar = (va) obj2;
        return this.f166797a == vaVar.f166797a && this.f166798b == vaVar.f166798b && this.f166799c == vaVar.f166799c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166799c) + j6.a.c(Boolean.hashCode(this.f166797a) * 31, 31, this.f166798b);
    }
}
