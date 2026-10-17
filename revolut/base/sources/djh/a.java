package djh;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115386a;

    public a(boolean z) {
        this.f115386a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f115386a == ((a) obj2).f115386a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115386a);
    }
}
