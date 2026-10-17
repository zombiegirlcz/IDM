package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164063c;
    public final boolean d;
    public final boolean e;

    public ed(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f164061a = z;
        this.f164062b = z3;
        this.f164063c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj2;
        return this.f164061a == edVar.f164061a && this.f164062b == edVar.f164062b && this.f164063c == edVar.f164063c && this.d == edVar.d && this.e == edVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164061a) * 31, 31, this.f164062b), 31, this.f164063c), 31, this.d);
    }
}
