package su;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265622a;

    public e() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f265622a == ((e) obj2).f265622a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265622a);
    }

    public e(boolean z) {
        this.f265622a = z;
    }
}
