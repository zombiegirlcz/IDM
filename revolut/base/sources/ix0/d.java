package ix0;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169225a;

    public d(int i) {
        this.f169225a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f169225a == ((d) obj2).f169225a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f169225a);
    }
}
