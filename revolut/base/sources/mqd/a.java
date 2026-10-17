package mqd;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f207973a;

    public a(hel.b bVar) {
        this.f207973a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f207973a == ((a) obj2).f207973a;
    }

    public final int hashCode() {
        hel.b bVar = this.f207973a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
