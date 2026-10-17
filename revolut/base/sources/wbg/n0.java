package wbg;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f296188a;

    public n0(boolean z) {
        this.f296188a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && this.f296188a == ((n0) obj2).f296188a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f296188a);
    }
}
