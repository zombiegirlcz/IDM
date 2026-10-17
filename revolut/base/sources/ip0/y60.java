package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class y60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167258b;

    public y60(boolean z, boolean z3) {
        this.f167257a = z;
        this.f167258b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj2;
        return this.f167257a == y60Var.f167257a && this.f167258b == y60Var.f167258b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167258b) + (Boolean.hashCode(this.f167257a) * 31);
    }
}
