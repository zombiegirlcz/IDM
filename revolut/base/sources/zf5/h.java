package zf5;

import cli.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f321869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f321871c;
    public final boolean d;
    public final boolean e;

    public h(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f321869a = z;
        this.f321870b = z3;
        this.f321871c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f321869a == hVar.f321869a && this.f321870b == hVar.f321870b && this.f321871c == hVar.f321871c && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f321869a) * 31, 31, this.f321870b), 31, this.f321871c), 31, this.d);
    }
}
