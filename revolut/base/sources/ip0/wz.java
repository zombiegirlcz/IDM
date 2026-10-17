package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167073c;
    public final boolean d;

    public wz(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167071a = z;
        this.f167072b = z3;
        this.f167073c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj2;
        return this.f167071a == wzVar.f167071a && this.f167072b == wzVar.f167072b && this.f167073c == wzVar.f167073c && this.d == wzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f167071a) * 31, 31, this.f167072b), 31, this.f167073c);
    }
}
