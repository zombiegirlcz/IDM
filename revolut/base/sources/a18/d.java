package a18;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f559a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f559a == ((d) obj2).f559a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f559a);
    }

    public d(int i) {
        this.f559a = 4;
    }
}
