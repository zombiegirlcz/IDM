package vmh;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f290583a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f290583a == ((c) obj2).f290583a;
    }

    public final int hashCode() {
        f fVar = this.f290583a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public c(f fVar) {
        this.f290583a = fVar;
    }
}
