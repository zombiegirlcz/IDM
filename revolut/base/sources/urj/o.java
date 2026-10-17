package urj;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f282345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f282346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f282347c;

    public o(int i, int i2, int i3) {
        this.f282345a = i;
        this.f282346b = i2;
        this.f282347c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f282345a == oVar.f282345a && this.f282346b == oVar.f282346b && this.f282347c == oVar.f282347c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282347c) + j6.a.b(this.f282346b, Integer.hashCode(this.f282345a) * 31, 31);
    }
}
