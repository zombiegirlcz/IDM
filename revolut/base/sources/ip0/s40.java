package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166293c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166295h;

    public s40(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166291a = z;
        this.f166292b = z3;
        this.f166293c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166294g = z29;
        this.f166295h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s40)) {
            return false;
        }
        s40 s40Var = (s40) obj2;
        return this.f166291a == s40Var.f166291a && this.f166292b == s40Var.f166292b && this.f166293c == s40Var.f166293c && this.d == s40Var.d && this.e == s40Var.e && this.f == s40Var.f && this.f166294g == s40Var.f166294g && this.f166295h == s40Var.f166295h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166295h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166291a) * 31, 31, this.f166292b), 31, this.f166293c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166294g);
    }
}
