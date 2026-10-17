package b1c;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11780b;

    public h(boolean z, boolean z3) {
        this.f11779a = z;
        this.f11780b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f11779a == hVar.f11779a && this.f11780b == hVar.f11780b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11780b) + (Boolean.hashCode(this.f11779a) * 31);
    }
}
