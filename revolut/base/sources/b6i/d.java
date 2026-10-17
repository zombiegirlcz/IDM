package b6i;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12771a;

    public d(boolean z) {
        this.f12771a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f12771a == ((d) obj2).f12771a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12771a);
    }
}
