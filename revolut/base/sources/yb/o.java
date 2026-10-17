package yb;

/* JADX INFO: loaded from: classes.dex */
public final class o extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f312123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f312124b;

    public o(y yVar, m mVar) {
        this.f312123a = yVar;
        this.f312124b = mVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        y yVar = this.f312123a;
        if (yVar == null) {
            if (((o) zVar).f312123a != null) {
                return false;
            }
        } else if (!yVar.equals(((o) zVar).f312123a)) {
            return false;
        }
        return this.f312124b.equals(((o) zVar).f312124b);
    }

    public final int hashCode() {
        y yVar = this.f312123a;
        return (((yVar == null ? 0 : yVar.hashCode()) ^ 1000003) * 1000003) ^ this.f312124b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f312123a + ", androidClientInfo=" + this.f312124b + "}";
    }
}
