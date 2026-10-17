package wuh;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f300149a;

    public d() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f300149a == ((d) obj2).f300149a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f300149a);
    }

    public d(boolean z) {
        this.f300149a = z;
    }
}
