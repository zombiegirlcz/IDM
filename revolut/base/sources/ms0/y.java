package ms0;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f208490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208492c;

    public y(int i, int i2, int i3) {
        this.f208490a = i;
        this.f208491b = i2;
        this.f208492c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f208490a == yVar.f208490a && this.f208491b == yVar.f208491b && this.f208492c == yVar.f208492c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208492c) + j6.a.b(this.f208491b, Integer.hashCode(this.f208490a) * 31, 31);
    }
}
