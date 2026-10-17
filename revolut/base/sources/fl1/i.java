package fl1;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135892a;

    public i(int i) {
        this.f135892a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f135892a == ((i) obj2).f135892a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135892a);
    }
}
