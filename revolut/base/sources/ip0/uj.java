package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166688a;

    public uj(boolean z) {
        this.f166688a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof uj) && this.f166688a == ((uj) obj2).f166688a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166688a);
    }
}
