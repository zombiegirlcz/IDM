package n50;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212498c;
    public final boolean d;

    public o(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f212496a = z;
        this.f212497b = z3;
        this.f212498c = z4;
        this.d = z6;
    }

    @Override // n50.s
    public final boolean a() {
        return this.f212497b;
    }

    @Override // n50.s
    public final int b() {
        return this.d ? R$attr.uikit_dp12 : R$attr.uikit_dp4;
    }

    @Override // n50.s
    public final int c() {
        return (this.d && this.f212498c) ? R$attr.uikit_dp12 : R$attr.uikit_dp2;
    }

    @Override // n50.s
    public final boolean d() {
        return this.f212496a;
    }

    @Override // n50.s
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f212496a == oVar.f212496a && this.f212497b == oVar.f212497b && this.f212498c == oVar.f212498c && this.d == oVar.d;
    }

    @Override // n50.s
    public final boolean f() {
        return this.f212498c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f212496a) * 31, 31, this.f212497b), 31, this.f212498c);
    }
}
