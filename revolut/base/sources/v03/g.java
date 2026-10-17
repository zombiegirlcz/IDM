package v03;

import cli.q;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f284719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f284721c;

    public g(boolean z, boolean z3, boolean z4) {
        this.f284719a = z;
        this.f284720b = z3;
        this.f284721c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f284719a == gVar.f284719a && this.f284720b == gVar.f284720b && this.f284721c == gVar.f284721c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284721c) + j6.a.c(Boolean.hashCode(this.f284719a) * 31, 31, this.f284720b);
    }
}
