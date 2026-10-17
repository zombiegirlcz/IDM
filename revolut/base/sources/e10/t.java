package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f121843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121844b;

    public t(boolean z, float f) {
        this.f121843a = z;
        this.f121844b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f121843a == tVar.f121843a && Float.compare(this.f121844b, tVar.f121844b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121844b) + (Boolean.hashCode(this.f121843a) * 31);
    }
}
