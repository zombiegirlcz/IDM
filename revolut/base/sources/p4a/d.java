package p4a;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qla.a f232867a;

    public d(qla.a aVar) {
        this.f232867a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f232867a == ((d) obj2).f232867a;
    }

    public final int hashCode() {
        qla.a aVar = this.f232867a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
