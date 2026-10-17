package hbl;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150758a;

    public b(boolean z) {
        this.f150758a = z;
    }

    @Override // hbl.c
    public final boolean a() {
        return this.f150758a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f150758a == ((b) obj2).f150758a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150758a);
    }
}
