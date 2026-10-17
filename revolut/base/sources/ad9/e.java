package ad9;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3294a;

    public e(boolean z) {
        this.f3294a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f3294a == ((e) obj2).f3294a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3294a);
    }
}
