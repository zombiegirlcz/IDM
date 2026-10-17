package dmb;

import cli.q;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115887c;
    public final boolean d;

    public k() {
        this(true, true, true, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f115885a == kVar.f115885a && this.f115886b == kVar.f115886b && this.f115887c == kVar.f115887c && this.d == kVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f115885a) * 31, 31, this.f115886b), 31, this.f115887c);
    }

    public k(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f115885a = z;
        this.f115886b = z3;
        this.f115887c = z4;
        this.d = z6;
    }
}
