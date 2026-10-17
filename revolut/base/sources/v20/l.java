package v20;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f285455a;

    public l(boolean z) {
        this.f285455a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f285455a == ((l) obj2).f285455a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285455a);
    }
}
