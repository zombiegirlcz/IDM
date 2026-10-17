package jec;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6c.k f173262a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f173262a == ((g) obj2).f173262a;
    }

    public final int hashCode() {
        u6c.k kVar = this.f173262a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public g(u6c.k kVar) {
        this.f173262a = kVar;
    }
}
