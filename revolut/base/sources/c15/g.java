package c15;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20384c;
    public final int d;

    public g(int i, int i2, int i3, int i5) {
        this.f20382a = i;
        this.f20383b = i2;
        this.f20384c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f20382a == gVar.f20382a && this.f20383b == gVar.f20383b && this.f20384c == gVar.f20384c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f20384c, j6.a.b(this.f20383b, Integer.hashCode(this.f20382a) * 31, 31), 31);
    }
}
