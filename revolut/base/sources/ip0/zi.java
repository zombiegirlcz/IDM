package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167471c;

    public zi(boolean z, boolean z3, boolean z4) {
        this.f167469a = z;
        this.f167470b = z3;
        this.f167471c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj2;
        return this.f167469a == ziVar.f167469a && this.f167470b == ziVar.f167470b && this.f167471c == ziVar.f167471c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167471c) + j6.a.c(Boolean.hashCode(this.f167469a) * 31, 31, this.f167470b);
    }
}
