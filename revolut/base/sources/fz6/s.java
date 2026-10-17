package fz6;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9d.b f139131a;

    public s(u9d.b bVar) {
        this.f139131a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f139131a == ((s) obj2).f139131a;
    }

    public final int hashCode() {
        u9d.b bVar = this.f139131a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
