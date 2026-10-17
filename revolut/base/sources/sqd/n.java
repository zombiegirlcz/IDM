package sqd;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f265071a;

    public n(hel.b bVar) {
        this.f265071a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f265071a == ((n) obj2).f265071a;
    }

    public final int hashCode() {
        hel.b bVar = this.f265071a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
