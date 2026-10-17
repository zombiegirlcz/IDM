package yxa;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f317603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f317604c;
    public final int d;

    public a(int i, int i2, int i3, int i5) {
        this.f317602a = i;
        this.f317603b = i2;
        this.f317604c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f317602a == aVar.f317602a && this.f317603b == aVar.f317603b && this.f317604c == aVar.f317604c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f317604c, j6.a.b(this.f317603b, Integer.hashCode(this.f317602a) * 31, 31), 31);
    }
}
