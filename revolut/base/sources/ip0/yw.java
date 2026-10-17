package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167363c;
    public final boolean d;
    public final boolean e;

    public yw(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167361a = z;
        this.f167362b = z3;
        this.f167363c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yw)) {
            return false;
        }
        yw ywVar = (yw) obj2;
        return this.f167361a == ywVar.f167361a && this.f167362b == ywVar.f167362b && this.f167363c == ywVar.f167363c && this.d == ywVar.d && this.e == ywVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167361a) * 31, 31, this.f167362b), 31, this.f167363c), 31, this.d);
    }
}
