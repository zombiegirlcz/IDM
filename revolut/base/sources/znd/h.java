package znd;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f323756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323758c;

    public h(boolean z, boolean z3, boolean z4) {
        this.f323756a = z;
        this.f323757b = z3;
        this.f323758c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f323756a == hVar.f323756a && this.f323757b == hVar.f323757b && this.f323758c == hVar.f323758c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f323758c) + j6.a.c(Boolean.hashCode(this.f323756a) * 31, 31, this.f323757b);
    }
}
