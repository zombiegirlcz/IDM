package hha;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152281c;
    public final int d;

    public a(int i, int i2, int i3, int i5) {
        this.f152279a = i;
        this.f152280b = i2;
        this.f152281c = i3;
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
        return this.f152279a == aVar.f152279a && this.f152280b == aVar.f152280b && this.f152281c == aVar.f152281c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f152281c, j6.a.b(this.f152280b, Integer.hashCode(this.f152279a) * 31, 31), 31);
    }
}
