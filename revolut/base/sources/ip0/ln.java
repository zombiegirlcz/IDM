package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165230c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165232h;
    public final boolean i;

    public ln(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f165228a = z;
        this.f165229b = z3;
        this.f165230c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165231g = z29;
        this.f165232h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj2;
        return this.f165228a == lnVar.f165228a && this.f165229b == lnVar.f165229b && this.f165230c == lnVar.f165230c && this.d == lnVar.d && this.e == lnVar.e && this.f == lnVar.f && this.f165231g == lnVar.f165231g && this.f165232h == lnVar.f165232h && this.i == lnVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165228a) * 31, 31, this.f165229b), 31, this.f165230c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165231g), 31, this.f165232h);
    }
}
