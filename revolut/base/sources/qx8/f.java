package qx8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250035b;

    public f(boolean z, boolean z3) {
        this.f250034a = z;
        this.f250035b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f250034a == fVar.f250034a && this.f250035b == fVar.f250035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250035b) + (Boolean.hashCode(this.f250034a) * 31);
    }
}
