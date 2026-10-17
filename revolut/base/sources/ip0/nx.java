package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class nx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165586c;
    public final boolean d;
    public final boolean e;

    public nx(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f165584a = z;
        this.f165585b = z3;
        this.f165586c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj2;
        return this.f165584a == nxVar.f165584a && this.f165585b == nxVar.f165585b && this.f165586c == nxVar.f165586c && this.d == nxVar.d && this.e == nxVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165584a) * 31, 31, this.f165585b), 31, this.f165586c), 31, this.d);
    }
}
