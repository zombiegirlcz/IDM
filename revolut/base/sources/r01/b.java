package r01;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f250678a;

    public b(int i) {
        this.f250678a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f250678a == ((b) obj2).f250678a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250678a);
    }
}
