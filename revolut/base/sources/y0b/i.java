package y0b;

import cli.q;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f310180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f310181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f310182c;
    public final boolean d;
    public final boolean e;

    public i(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f310180a = z;
        this.f310181b = z3;
        this.f310182c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f310180a == iVar.f310180a && this.f310181b == iVar.f310181b && this.f310182c == iVar.f310182c && this.d == iVar.d && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f310180a) * 31, 31, this.f310181b), 31, this.f310182c), 31, this.d);
    }
}
