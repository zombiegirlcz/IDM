package k86;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f182092a;

    public e(boolean z) {
        this.f182092a = z;
    }

    public final String a() {
        return "Params(activeOnly=" + this.f182092a + ")";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f182092a == ((e) obj2).f182092a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182092a);
    }
}
