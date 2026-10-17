package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164541b;

    public he(boolean z, boolean z3) {
        this.f164540a = z;
        this.f164541b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof he)) {
            return false;
        }
        he heVar = (he) obj2;
        return this.f164540a == heVar.f164540a && this.f164541b == heVar.f164541b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164541b) + (Boolean.hashCode(this.f164540a) * 31);
    }
}
