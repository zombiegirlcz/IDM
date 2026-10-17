package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167327b;

    public yk(boolean z, boolean z3) {
        this.f167326a = z;
        this.f167327b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj2;
        return this.f167326a == ykVar.f167326a && this.f167327b == ykVar.f167327b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167327b) + (Boolean.hashCode(this.f167326a) * 31);
    }
}
