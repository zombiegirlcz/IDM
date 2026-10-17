package fag;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffi.a f133399a;

    public x0(ffi.a aVar) {
        this.f133399a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && this.f133399a == ((x0) obj2).f133399a;
    }

    public final int hashCode() {
        ffi.a aVar = this.f133399a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
