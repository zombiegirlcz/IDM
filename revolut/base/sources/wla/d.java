package wla;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298466a;

    public d(boolean z) {
        this.f298466a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f298466a == ((d) obj2).f298466a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298466a);
    }
}
