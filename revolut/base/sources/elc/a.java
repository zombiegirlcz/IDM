package elc;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127286b;

    public a(int i, int i2) {
        this.f127285a = i;
        this.f127286b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f127285a == aVar.f127285a && this.f127286b == aVar.f127286b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127286b) + (Integer.hashCode(this.f127285a) * 31);
    }
}
