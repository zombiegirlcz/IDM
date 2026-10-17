package g05;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139347a;

    public a(int i) {
        this.f139347a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f139347a == ((a) obj2).f139347a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139347a);
    }
}
