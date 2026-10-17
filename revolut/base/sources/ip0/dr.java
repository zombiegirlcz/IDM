package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163940b;

    public dr(boolean z, boolean z3) {
        this.f163939a = z;
        this.f163940b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dr)) {
            return false;
        }
        dr drVar = (dr) obj2;
        return this.f163939a == drVar.f163939a && this.f163940b == drVar.f163940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163940b) + (Boolean.hashCode(this.f163939a) * 31);
    }
}
