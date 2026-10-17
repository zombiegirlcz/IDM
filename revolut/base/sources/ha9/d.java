package ha9;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150477a;

    public d(boolean z) {
        this.f150477a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f150477a == ((d) obj2).f150477a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150477a);
    }
}
