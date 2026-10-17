package zuj;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f325509a;

    public v(boolean z) {
        this.f325509a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f325509a == ((v) obj2).f325509a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325509a);
    }
}
