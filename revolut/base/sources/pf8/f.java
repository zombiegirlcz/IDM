package pf8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f235513a;

    public f(int i) {
        this.f235513a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f235513a == ((f) obj2).f235513a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f235513a);
    }
}
