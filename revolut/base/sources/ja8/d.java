package ja8;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f172460a;

    public d(bj0.b bVar) {
        this.f172460a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f172460a == ((d) obj2).f172460a;
    }

    public final int hashCode() {
        bj0.b bVar = this.f172460a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
