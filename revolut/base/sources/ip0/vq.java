package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166871c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166873h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166874j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f166875l;

    public vq(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f166869a = z;
        this.f166870b = z3;
        this.f166871c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166872g = z29;
        this.f166873h = z31;
        this.i = z41;
        this.f166874j = z49;
        this.k = z54;
        this.f166875l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vq)) {
            return false;
        }
        vq vqVar = (vq) obj2;
        return this.f166869a == vqVar.f166869a && this.f166870b == vqVar.f166870b && this.f166871c == vqVar.f166871c && this.d == vqVar.d && this.e == vqVar.e && this.f == vqVar.f && this.f166872g == vqVar.f166872g && this.f166873h == vqVar.f166873h && this.i == vqVar.i && this.f166874j == vqVar.f166874j && this.k == vqVar.k && this.f166875l == vqVar.f166875l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166875l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166869a) * 31, 31, this.f166870b), 31, this.f166871c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166872g), 31, this.f166873h), 31, this.i), 31, this.f166874j), 31, this.k);
    }
}
