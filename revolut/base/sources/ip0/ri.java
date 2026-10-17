package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166193b;

    public ri(boolean z, boolean z3) {
        this.f166192a = z;
        this.f166193b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj2;
        return this.f166192a == riVar.f166192a && this.f166193b == riVar.f166193b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166193b) + (Boolean.hashCode(this.f166192a) * 31);
    }
}
