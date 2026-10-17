package ft0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137756b;

    public f(boolean z, boolean z3) {
        this.f137755a = z;
        this.f137756b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f137755a == fVar.f137755a && this.f137756b == fVar.f137756b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137756b) + (Boolean.hashCode(this.f137755a) * 31);
    }
}
