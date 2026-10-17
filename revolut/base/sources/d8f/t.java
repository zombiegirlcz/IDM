package d8f;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112256a;

    public t(boolean z) {
        this.f112256a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f112256a == ((t) obj2).f112256a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112256a);
    }
}
