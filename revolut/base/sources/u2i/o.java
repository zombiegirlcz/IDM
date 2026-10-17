package u2i;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f276685a;

    public o() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f276685a == ((o) obj2).f276685a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276685a);
    }

    public o(boolean z) {
        this.f276685a = z;
    }
}
