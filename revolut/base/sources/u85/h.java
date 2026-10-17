package u85;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278113a;

    public h(boolean z) {
        this.f278113a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f278113a == ((h) obj2).f278113a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278113a);
    }
}
