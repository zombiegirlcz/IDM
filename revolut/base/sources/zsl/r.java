package zsl;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f324982b;

    public r(boolean z) {
        super(false);
        this.f324982b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f324982b == ((r) obj2).f324982b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324982b);
    }
}
