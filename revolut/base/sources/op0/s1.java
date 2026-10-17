package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227410a;

    public s1(boolean z) {
        this.f227410a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s1) && this.f227410a == ((s1) obj2).f227410a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227410a);
    }
}
