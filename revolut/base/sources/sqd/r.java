package sqd;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f265075a;

    public r(hel.b bVar) {
        this.f265075a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f265075a == ((r) obj2).f265075a;
    }

    public final int hashCode() {
        hel.b bVar = this.f265075a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
