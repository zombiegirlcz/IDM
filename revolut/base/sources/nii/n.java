package nii;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f216194c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f216196h;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f216192a == nVar.f216192a && this.f216193b == nVar.f216193b && this.f216194c == nVar.f216194c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f && this.f216195g == nVar.f216195g && this.f216196h == nVar.f216196h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216196h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f216192a) * 31, 31, this.f216193b), 31, this.f216194c), 31, this.d), 31, this.e), 31, this.f), 31, this.f216195g);
    }

    public /* synthetic */ n(int i) {
        this(true, true, true, true, true, true, true, true);
    }

    public n(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f216192a = z;
        this.f216193b = z3;
        this.f216194c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f216195g = z29;
        this.f216196h = z31;
    }
}
