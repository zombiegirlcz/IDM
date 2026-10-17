package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167174c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167175g;

    public xh(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f167172a = z;
        this.f167173b = z3;
        this.f167174c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167175g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xh)) {
            return false;
        }
        xh xhVar = (xh) obj2;
        return this.f167172a == xhVar.f167172a && this.f167173b == xhVar.f167173b && this.f167174c == xhVar.f167174c && this.d == xhVar.d && this.e == xhVar.e && this.f == xhVar.f && this.f167175g == xhVar.f167175g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167175g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167172a) * 31, 31, this.f167173b), 31, this.f167174c), 31, this.d), 31, this.e), 31, this.f);
    }
}
