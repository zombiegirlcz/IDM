package az6;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11393a;

    public b(int i) {
        this.f11393a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f11393a == ((b) obj2).f11393a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11393a);
    }
}
