package l6c;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6c.k f192391a;

    public e(u6c.k kVar) {
        this.f192391a = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f192391a == ((e) obj2).f192391a;
    }

    public final int hashCode() {
        u6c.k kVar = this.f192391a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
