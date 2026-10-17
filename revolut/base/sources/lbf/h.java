package lbf;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f193676a;

    public h(l lVar) {
        this.f193676a = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f193676a == ((h) obj2).f193676a;
    }

    public final int hashCode() {
        l lVar = this.f193676a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }
}
