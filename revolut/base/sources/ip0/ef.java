package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164076c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164078h;

    public ef(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f164074a = z;
        this.f164075b = z3;
        this.f164076c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164077g = z29;
        this.f164078h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj2;
        return this.f164074a == efVar.f164074a && this.f164075b == efVar.f164075b && this.f164076c == efVar.f164076c && this.d == efVar.d && this.e == efVar.e && this.f == efVar.f && this.f164077g == efVar.f164077g && this.f164078h == efVar.f164078h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164078h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164074a) * 31, 31, this.f164075b), 31, this.f164076c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164077g);
    }
}
