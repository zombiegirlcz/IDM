package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167293c;

    public ya0(boolean z, boolean z3, boolean z4) {
        this.f167291a = z;
        this.f167292b = z3;
        this.f167293c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ya0)) {
            return false;
        }
        ya0 ya0Var = (ya0) obj2;
        return this.f167291a == ya0Var.f167291a && this.f167292b == ya0Var.f167292b && this.f167293c == ya0Var.f167293c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167293c) + j6.a.c(Boolean.hashCode(this.f167291a) * 31, 31, this.f167292b);
    }
}
