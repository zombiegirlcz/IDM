package q62;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz1.e f242449a;

    public b(zz1.e eVar) {
        this.f242449a = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f242449a == ((b) obj2).f242449a;
    }

    public final int hashCode() {
        zz1.e eVar = this.f242449a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }
}
