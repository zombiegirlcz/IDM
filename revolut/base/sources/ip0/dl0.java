package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163921b;

    public dl0(boolean z, boolean z3) {
        this.f163920a = z;
        this.f163921b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dl0)) {
            return false;
        }
        dl0 dl0Var = (dl0) obj2;
        return this.f163920a == dl0Var.f163920a && this.f163921b == dl0Var.f163921b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163921b) + (Boolean.hashCode(this.f163920a) * 31);
    }
}
