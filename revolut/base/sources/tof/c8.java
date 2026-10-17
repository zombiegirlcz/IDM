package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class c8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f272670a;

    public c8(r rVar) {
        this.f272670a = rVar;
    }

    public final r a() {
        return this.f272670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c8) && this.f272670a == ((c8) obj2).f272670a;
    }

    public final int hashCode() {
        r rVar = this.f272670a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }
}
