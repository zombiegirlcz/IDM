package ebg;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124341a;

    public h(boolean z) {
        this.f124341a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f124341a == ((h) obj2).f124341a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124341a);
    }
}
