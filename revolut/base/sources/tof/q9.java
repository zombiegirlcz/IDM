package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class q9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f273013a;

    public q9(c cVar) {
        this.f273013a = cVar;
    }

    public final c a() {
        return this.f273013a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q9) && this.f273013a == ((q9) obj2).f273013a;
    }

    public final int hashCode() {
        c cVar = this.f273013a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
