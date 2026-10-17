package q31;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f241767a;

    public a(int i) {
        this.f241767a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f241767a == ((a) obj2).f241767a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241767a);
    }
}
