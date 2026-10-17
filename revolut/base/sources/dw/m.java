package dw;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118198c;

    public m(int i, int i2, int i3) {
        this.f118196a = i;
        this.f118197b = i2;
        this.f118198c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f118196a == mVar.f118196a && this.f118197b == mVar.f118197b && this.f118198c == mVar.f118198c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118198c) + j6.a.b(this.f118197b, Integer.hashCode(this.f118196a) * 31, 31);
    }
}
