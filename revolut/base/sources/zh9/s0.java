package zh9;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f322343a;

    public s0(boolean z) {
        this.f322343a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && this.f322343a == ((s0) obj2).f322343a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322343a);
    }
}
