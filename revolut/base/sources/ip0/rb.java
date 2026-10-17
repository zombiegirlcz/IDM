package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166157b;

    public rb(boolean z, boolean z3) {
        this.f166156a = z;
        this.f166157b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj2;
        return this.f166156a == rbVar.f166156a && this.f166157b == rbVar.f166157b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166157b) + (Boolean.hashCode(this.f166156a) * 31);
    }
}
