package r01;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f250677a;

    public a(int i) {
        this.f250677a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f250677a == ((a) obj2).f250677a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250677a);
    }
}
