package vd7;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f287811a;

    public d(int i) {
        this.f287811a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f287811a == ((d) obj2).f287811a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f287811a);
    }
}
