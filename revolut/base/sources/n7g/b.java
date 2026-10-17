package n7g;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f213089a;

    public b(boolean z) {
        this.f213089a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f213089a == ((b) obj2).f213089a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213089a);
    }
}
