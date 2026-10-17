package uk2;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280649a;

    public f(int i) {
        this.f280649a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f280649a == ((f) obj2).f280649a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280649a);
    }
}
