package azl;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11479c = 1;

    public a(int i, int i2, int i3) {
        this.f11477a = i;
        this.f11478b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f11477a == aVar.f11477a && this.f11478b == aVar.f11478b && this.f11479c == aVar.f11479c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.b(this.f11479c, j6.a.b(this.f11478b, Integer.hashCode(this.f11477a) * 31, 31), 31);
    }
}
