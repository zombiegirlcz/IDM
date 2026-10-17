package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166214c;
    public final boolean d;

    public rn(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166212a = z;
        this.f166213b = z3;
        this.f166214c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rn)) {
            return false;
        }
        rn rnVar = (rn) obj2;
        return this.f166212a == rnVar.f166212a && this.f166213b == rnVar.f166213b && this.f166214c == rnVar.f166214c && this.d == rnVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166212a) * 31, 31, this.f166213b), 31, this.f166214c);
    }
}
