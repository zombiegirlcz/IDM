package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class kq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165062c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165064h;

    public kq(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165060a = z;
        this.f165061b = z3;
        this.f165062c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165063g = z29;
        this.f165064h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj2;
        return this.f165060a == kqVar.f165060a && this.f165061b == kqVar.f165061b && this.f165062c == kqVar.f165062c && this.d == kqVar.d && this.e == kqVar.e && this.f == kqVar.f && this.f165063g == kqVar.f165063g && this.f165064h == kqVar.f165064h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165064h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165060a) * 31, 31, this.f165061b), 31, this.f165062c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165063g);
    }
}
