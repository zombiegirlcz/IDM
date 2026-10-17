package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165245c;
    public final boolean d;

    public lo(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165243a = z;
        this.f165244b = z3;
        this.f165245c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj2;
        return this.f165243a == loVar.f165243a && this.f165244b == loVar.f165244b && this.f165245c == loVar.f165245c && this.d == loVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165243a) * 31, 31, this.f165244b), 31, this.f165245c);
    }
}
