package ec5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124428a;

    public a(boolean z) {
        this.f124428a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f124428a == ((a) obj2).f124428a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124428a);
    }
}
