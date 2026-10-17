package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class k3 extends j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164952a;

    public k3(int i) {
        this.f164952a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k3) && this.f164952a == ((k3) obj2).f164952a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164952a);
    }
}
