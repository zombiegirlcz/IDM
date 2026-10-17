package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class eb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.l f272740a;

    public eb(io3.l lVar) {
        this.f272740a = lVar;
    }

    public final io3.l a() {
        return this.f272740a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof eb) && this.f272740a == ((eb) obj2).f272740a;
    }

    public final int hashCode() {
        io3.l lVar = this.f272740a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }
}
