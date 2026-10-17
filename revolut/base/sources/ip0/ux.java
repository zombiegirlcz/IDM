package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166736c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166738h;

    public ux(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166734a = z;
        this.f166735b = z3;
        this.f166736c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166737g = z29;
        this.f166738h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj2;
        return this.f166734a == uxVar.f166734a && this.f166735b == uxVar.f166735b && this.f166736c == uxVar.f166736c && this.d == uxVar.d && this.e == uxVar.e && this.f == uxVar.f && this.f166737g == uxVar.f166737g && this.f166738h == uxVar.f166738h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166738h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166734a) * 31, 31, this.f166735b), 31, this.f166736c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166737g);
    }
}
