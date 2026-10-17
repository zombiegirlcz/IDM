package wjh;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298090b;

    public b(boolean z) {
        super("COMMODITIES");
        this.f298090b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f298090b == ((b) obj2).f298090b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298090b);
    }
}
