package vlc;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290364b;

    public i(int i) {
        super(a0.d.h(i, "D"));
        this.f290364b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f290364b == ((i) obj2).f290364b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f290364b);
    }
}
