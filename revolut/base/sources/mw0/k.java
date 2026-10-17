package mw0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f209290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209292c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f209293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209294h;
    public final boolean i;

    public k(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f209290a = z;
        this.f209291b = z3;
        this.f209292c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f209293g = z29;
        this.f209294h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f209290a == kVar.f209290a && this.f209291b == kVar.f209291b && this.f209292c == kVar.f209292c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.f209293g == kVar.f209293g && this.f209294h == kVar.f209294h && this.i == kVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f209290a) * 31, 31, this.f209291b), 31, this.f209292c), 31, this.d), 31, this.e), 31, this.f), 31, this.f209293g), 31, this.f209294h);
    }
}
