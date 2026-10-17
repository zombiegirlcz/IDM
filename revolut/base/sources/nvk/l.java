package nvk;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f219719a;

    public l(boolean z) {
        this.f219719a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f219719a == ((l) obj2).f219719a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f219719a);
    }
}
