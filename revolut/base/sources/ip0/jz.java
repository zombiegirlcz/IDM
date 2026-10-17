package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class jz implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164928c;
    public final boolean d;

    public jz(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164926a = z;
        this.f164927b = z3;
        this.f164928c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj2;
        return this.f164926a == jzVar.f164926a && this.f164927b == jzVar.f164927b && this.f164928c == jzVar.f164928c && this.d == jzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164926a) * 31, 31, this.f164927b), 31, this.f164928c);
    }
}
