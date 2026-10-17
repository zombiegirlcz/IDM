package bej;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14855a;

    public j(boolean z) {
        this.f14855a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f14855a == ((j) obj2).f14855a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14855a);
    }
}
