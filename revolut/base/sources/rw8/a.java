package rw8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257843a;

    public a(int i) {
        this.f257843a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f257843a == ((a) obj2).f257843a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257843a);
    }
}
