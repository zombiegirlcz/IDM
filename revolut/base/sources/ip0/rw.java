package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166250c;
    public final boolean d;
    public final boolean e;

    public rw(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166248a = z;
        this.f166249b = z3;
        this.f166250c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rw)) {
            return false;
        }
        rw rwVar = (rw) obj2;
        return this.f166248a == rwVar.f166248a && this.f166249b == rwVar.f166249b && this.f166250c == rwVar.f166250c && this.d == rwVar.d && this.e == rwVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166248a) * 31, 31, this.f166249b), 31, this.f166250c), 31, this.d);
    }
}
