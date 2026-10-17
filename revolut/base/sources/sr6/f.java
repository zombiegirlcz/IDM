package sr6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265129a;

    public f(int i) {
        this.f265129a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f265129a == ((f) obj2).f265129a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265129a);
    }
}
