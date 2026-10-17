package kjd;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f184379c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f184380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f184381h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f184382j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f184383l;

    public i(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f184377a = z;
        this.f184378b = z3;
        this.f184379c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f184380g = z29;
        this.f184381h = z31;
        this.i = z41;
        this.f184382j = z49;
        this.k = z54;
        this.f184383l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f184377a == iVar.f184377a && this.f184378b == iVar.f184378b && this.f184379c == iVar.f184379c && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && this.f184380g == iVar.f184380g && this.f184381h == iVar.f184381h && this.i == iVar.i && this.f184382j == iVar.f184382j && this.k == iVar.k && this.f184383l == iVar.f184383l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184383l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f184377a) * 31, 31, this.f184378b), 31, this.f184379c), 31, this.d), 31, this.e), 31, this.f), 31, this.f184380g), 31, this.f184381h), 31, this.i), 31, this.f184382j), 31, this.k);
    }
}
