package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165370b;

    public mf(boolean z, boolean z3) {
        this.f165369a = z;
        this.f165370b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj2;
        return this.f165369a == mfVar.f165369a && this.f165370b == mfVar.f165370b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165370b) + (Boolean.hashCode(this.f165369a) * 31);
    }
}
