package q88;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f243044a;

    public a(boolean z) {
        this.f243044a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f243044a == ((a) obj2).f243044a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243044a);
    }
}
