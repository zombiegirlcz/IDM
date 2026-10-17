package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class xm implements ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167195a;

    public xm(int i) {
        this.f167195a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xm) && this.f167195a == ((xm) obj2).f167195a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167195a);
    }
}
