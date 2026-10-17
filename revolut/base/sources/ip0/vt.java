package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166892c;
    public final boolean d;

    public vt(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166890a = z;
        this.f166891b = z3;
        this.f166892c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) obj2;
        return this.f166890a == vtVar.f166890a && this.f166891b == vtVar.f166891b && this.f166892c == vtVar.f166892c && this.d == vtVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166890a) * 31, 31, this.f166891b), 31, this.f166892c);
    }
}
