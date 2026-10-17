package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164160b;

    public ew(boolean z, boolean z3) {
        this.f164159a = z;
        this.f164160b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj2;
        return this.f164159a == ewVar.f164159a && this.f164160b == ewVar.f164160b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164160b) + (Boolean.hashCode(this.f164159a) * 31);
    }
}
