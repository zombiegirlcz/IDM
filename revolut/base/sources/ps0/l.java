package ps0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f239376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f239378c;
    public final int d;

    public l(int i, int i2, int i3, int i5) {
        this.f239376a = i;
        this.f239377b = i2;
        this.f239378c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f239376a == lVar.f239376a && this.f239377b == lVar.f239377b && this.f239378c == lVar.f239378c && this.d == lVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f239378c, j6.a.b(this.f239377b, Integer.hashCode(this.f239376a) * 31, 31), 31);
    }
}
