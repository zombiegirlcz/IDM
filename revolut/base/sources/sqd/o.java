package sqd;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f265072a;

    public o(hel.b bVar) {
        this.f265072a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f265072a == ((o) obj2).f265072a;
    }

    public final int hashCode() {
        hel.b bVar = this.f265072a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
