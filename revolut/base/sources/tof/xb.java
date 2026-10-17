package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class xb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f273168a;

    public xb(c cVar) {
        this.f273168a = cVar;
    }

    public final c a() {
        return this.f273168a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xb) && this.f273168a == ((xb) obj2).f273168a;
    }

    public final int hashCode() {
        c cVar = this.f273168a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
