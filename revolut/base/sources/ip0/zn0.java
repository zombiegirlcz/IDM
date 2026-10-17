package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167507c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167509h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f167510j;

    public zn0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f167505a = z;
        this.f167506b = z3;
        this.f167507c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167508g = z29;
        this.f167509h = z31;
        this.i = z41;
        this.f167510j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zn0)) {
            return false;
        }
        zn0 zn0Var = (zn0) obj2;
        return this.f167505a == zn0Var.f167505a && this.f167506b == zn0Var.f167506b && this.f167507c == zn0Var.f167507c && this.d == zn0Var.d && this.e == zn0Var.e && this.f == zn0Var.f && this.f167508g == zn0Var.f167508g && this.f167509h == zn0Var.f167509h && this.i == zn0Var.i && this.f167510j == zn0Var.f167510j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167510j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167505a) * 31, 31, this.f167506b), 31, this.f167507c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167508g), 31, this.f167509h), 31, this.i);
    }
}
