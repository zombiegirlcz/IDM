package jr6;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177939a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return this.f177939a == ((e) obj2).f177939a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177939a);
    }

    public final String toString() {
        return j6.a.l(this.f177939a, "Step(progressPercentage=", ")");
    }
}
