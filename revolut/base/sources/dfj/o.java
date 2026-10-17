package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114056a;

    public o() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f114056a == ((o) obj2).f114056a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114056a);
    }

    public o(boolean z) {
        this.f114056a = z;
    }
}
