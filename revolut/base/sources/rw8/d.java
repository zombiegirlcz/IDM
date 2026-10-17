package rw8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257848a;

    public d(int i) {
        this.f257848a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f257848a == ((d) obj2).f257848a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257848a);
    }
}
