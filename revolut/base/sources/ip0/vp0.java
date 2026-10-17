package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166868c;
    public final boolean d;
    public final boolean e;

    public vp0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166866a = z;
        this.f166867b = z3;
        this.f166868c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vp0)) {
            return false;
        }
        vp0 vp0Var = (vp0) obj2;
        return this.f166866a == vp0Var.f166866a && this.f166867b == vp0Var.f166867b && this.f166868c == vp0Var.f166868c && this.d == vp0Var.d && this.e == vp0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166866a) * 31, 31, this.f166867b), 31, this.f166868c), 31, this.d);
    }
}
