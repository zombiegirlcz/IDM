package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class jo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164898a;

    public jo0(int i) {
        this.f164898a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof jo0) && this.f164898a == ((jo0) obj2).f164898a;
    }

    public final int hashCode() {
        return Integer.hashCode(100) + (Integer.hashCode(this.f164898a) * 31);
    }
}
