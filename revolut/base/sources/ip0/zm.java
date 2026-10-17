package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167498c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167500h;

    public zm(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f167496a = z;
        this.f167497b = z3;
        this.f167498c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167499g = z29;
        this.f167500h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zm)) {
            return false;
        }
        zm zmVar = (zm) obj2;
        return this.f167496a == zmVar.f167496a && this.f167497b == zmVar.f167497b && this.f167498c == zmVar.f167498c && this.d == zmVar.d && this.e == zmVar.e && this.f == zmVar.f && this.f167499g == zmVar.f167499g && this.f167500h == zmVar.f167500h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167500h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167496a) * 31, 31, this.f167497b), 31, this.f167498c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167499g);
    }
}
