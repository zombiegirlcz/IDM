package xzg;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f310037a;

    public y() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f310037a == ((y) obj2).f310037a;
    }

    public final int hashCode() {
        x xVar = this.f310037a;
        if (xVar == null) {
            return 0;
        }
        return xVar.hashCode();
    }

    public y(x xVar) {
        this.f310037a = xVar;
    }
}
