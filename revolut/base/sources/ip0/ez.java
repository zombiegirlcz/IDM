package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164166c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164167g;

    public ez(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164164a = z;
        this.f164165b = z3;
        this.f164166c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164167g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj2;
        return this.f164164a == ezVar.f164164a && this.f164165b == ezVar.f164165b && this.f164166c == ezVar.f164166c && this.d == ezVar.d && this.e == ezVar.e && this.f == ezVar.f && this.f164167g == ezVar.f164167g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164167g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164164a) * 31, 31, this.f164165b), 31, this.f164166c), 31, this.d), 31, this.e), 31, this.f);
    }
}
