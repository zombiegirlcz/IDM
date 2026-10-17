package gec;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f143278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f143279b;

    public e(d dVar, d dVar2) {
        this.f143278a = dVar;
        this.f143279b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f143278a == eVar.f143278a && this.f143279b == eVar.f143279b;
    }

    public final int hashCode() {
        d dVar = this.f143278a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f143279b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
