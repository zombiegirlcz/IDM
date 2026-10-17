package gzg;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f148119a;

    public q(boolean z) {
        this.f148119a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f148119a == ((q) obj2).f148119a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148119a);
    }
}
