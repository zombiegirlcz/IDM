package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166356b;

    public sh(boolean z, boolean z3) {
        this.f166355a = z;
        this.f166356b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj2;
        return this.f166355a == shVar.f166355a && this.f166356b == shVar.f166356b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166356b) + (Boolean.hashCode(this.f166355a) * 31);
    }
}
