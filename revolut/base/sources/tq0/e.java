package tq0;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273453c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f273454g;

    public e(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f273451a = z;
        this.f273452b = z3;
        this.f273453c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f273454g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f273451a == eVar.f273451a && this.f273452b == eVar.f273452b && this.f273453c == eVar.f273453c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.f273454g == eVar.f273454g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273454g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f273451a) * 31, 31, this.f273452b), 31, this.f273453c), 31, this.d), 31, this.e), 31, this.f);
    }
}
