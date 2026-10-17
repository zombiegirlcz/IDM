package t60;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f268120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f268121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f268122c;
    public final int d;
    public final int e;

    public a(int i, int i2, int i3, int i5, int i6) {
        this.f268120a = i;
        this.f268121b = i2;
        this.f268122c = i3;
        this.d = i5;
        this.e = i6;
    }

    public final boolean a() {
        return this.f268120a > -1 && this.f268121b > -1 && this.f268122c > -1 && this.d > -1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f268120a == aVar.f268120a && this.f268121b == aVar.f268121b && this.f268122c == aVar.f268122c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f268122c, j6.a.b(this.f268121b, Integer.hashCode(this.f268120a) * 31, 31), 31), 31);
    }
}
