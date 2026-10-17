package zn5;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f323665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f323666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f323667c;

    public b(int i, int i2, int i3) {
        this.f323665a = i;
        this.f323666b = i2;
        this.f323667c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f323665a == bVar.f323665a && this.f323666b == bVar.f323666b && this.f323667c == bVar.f323667c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323667c) + j6.a.b(this.f323666b, Integer.hashCode(this.f323665a) * 31, 31);
    }
}
