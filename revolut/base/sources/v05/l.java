package v05;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284751c;

    public l(int i, int i2, int i3) {
        this.f284749a = i;
        this.f284750b = i2;
        this.f284751c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f284749a == lVar.f284749a && this.f284750b == lVar.f284750b && this.f284751c == lVar.f284751c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284751c) + j6.a.b(this.f284750b, Integer.hashCode(this.f284749a) * 31, 31);
    }
}
