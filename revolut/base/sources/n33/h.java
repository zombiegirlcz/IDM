package n33;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f211725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f211726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f211727c;

    public h(int i, int i2, boolean z) {
        this.f211725a = i;
        this.f211726b = i2;
        this.f211727c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f211725a == hVar.f211725a && this.f211726b == hVar.f211726b && this.f211727c == hVar.f211727c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211727c) + j6.a.b(this.f211726b, Integer.hashCode(this.f211725a) * 31, 31);
    }
}
