package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163445b;

    public ah(boolean z, boolean z3) {
        this.f163444a = z;
        this.f163445b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj2;
        return this.f163444a == ahVar.f163444a && this.f163445b == ahVar.f163445b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163445b) + (Boolean.hashCode(this.f163444a) * 31);
    }
}
