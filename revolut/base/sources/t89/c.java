package t89;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f268862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f268863b;

    public c(boolean z, b bVar) {
        this.f268862a = z;
        this.f268863b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f268862a == cVar.f268862a && this.f268863b == cVar.f268863b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f268862a) * 31;
        b bVar = this.f268863b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
