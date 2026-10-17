package t61;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f268133a;

    public d(int i) {
        this.f268133a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f268133a == ((d) obj2).f268133a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f268133a);
    }
}
