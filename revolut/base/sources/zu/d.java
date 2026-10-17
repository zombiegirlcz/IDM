package zu;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f325184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325186c;
    public final int d;
    public final int e;
    public final int f;

    public d(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f325184a = i;
        this.f325185b = i2;
        this.f325186c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f325184a == dVar.f325184a && this.f325185b == dVar.f325185b && this.f325186c == dVar.f325186c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f325186c, j6.a.b(this.f325185b, Integer.hashCode(this.f325184a) * 31, 31), 31), 31), 31);
    }
}
