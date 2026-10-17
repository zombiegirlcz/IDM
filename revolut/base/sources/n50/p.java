package n50;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212501c;
    public final boolean d;

    public p(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f212499a = z;
        this.f212500b = z3;
        this.f212501c = z4;
        this.d = z6;
    }

    @Override // n50.s
    public final boolean a() {
        return this.f212500b;
    }

    @Override // n50.s
    public final int b() {
        return R$attr.uikit_dp0;
    }

    @Override // n50.s
    public final int c() {
        return (this.d && this.f212501c) ? R$attr.uikit_dp12 : R$attr.uikit_dp2;
    }

    @Override // n50.s
    public final boolean d() {
        return this.f212499a;
    }

    @Override // n50.s
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f212499a == pVar.f212499a && this.f212500b == pVar.f212500b && this.f212501c == pVar.f212501c && this.d == pVar.d;
    }

    @Override // n50.s
    public final boolean f() {
        return this.f212501c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f212499a) * 31, 31, this.f212500b), 31, this.f212501c);
    }
}
