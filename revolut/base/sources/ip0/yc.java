package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167301c;

    public yc(boolean z, boolean z3, boolean z4) {
        this.f167299a = z;
        this.f167300b = z3;
        this.f167301c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj2;
        return this.f167299a == ycVar.f167299a && this.f167300b == ycVar.f167300b && this.f167301c == ycVar.f167301c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167301c) + j6.a.c(Boolean.hashCode(this.f167299a) * 31, 31, this.f167300b);
    }
}
