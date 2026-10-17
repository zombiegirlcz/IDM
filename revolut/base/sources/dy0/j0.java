package dy0;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f120996a;

    public j0(float f) {
        this.f120996a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Float.compare(this.f120996a, ((j0) obj2).f120996a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120996a);
    }
}
