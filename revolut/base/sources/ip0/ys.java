package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167351c;
    public final boolean d;
    public final boolean e;

    public ys(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167349a = z;
        this.f167350b = z3;
        this.f167351c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj2;
        return this.f167349a == ysVar.f167349a && this.f167350b == ysVar.f167350b && this.f167351c == ysVar.f167351c && this.d == ysVar.d && this.e == ysVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167349a) * 31, 31, this.f167350b), 31, this.f167351c), 31, this.d);
    }
}
