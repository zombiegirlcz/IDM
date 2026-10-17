package sqd;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f265074a;

    public q(hel.b bVar) {
        this.f265074a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f265074a == ((q) obj2).f265074a;
    }

    public final int hashCode() {
        hel.b bVar = this.f265074a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
