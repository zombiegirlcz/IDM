package l6c;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6c.k f192392a;

    public f(u6c.k kVar) {
        this.f192392a = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f192392a == ((f) obj2).f192392a;
    }

    public final int hashCode() {
        u6c.k kVar = this.f192392a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
