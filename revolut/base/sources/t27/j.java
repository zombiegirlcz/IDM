package t27;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f267434a;

    public j(float f) {
        this.f267434a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Float.compare(this.f267434a, ((j) obj2).f267434a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f267434a);
    }
}
