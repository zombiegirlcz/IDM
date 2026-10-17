package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167366c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public yx(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f167364a = z;
        this.f167365b = z3;
        this.f167366c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yx)) {
            return false;
        }
        yx yxVar = (yx) obj2;
        return this.f167364a == yxVar.f167364a && this.f167365b == yxVar.f167365b && this.f167366c == yxVar.f167366c && this.d == yxVar.d && this.e == yxVar.e && this.f == yxVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167364a) * 31, 31, this.f167365b), 31, this.f167366c), 31, this.d), 31, this.e);
    }
}
