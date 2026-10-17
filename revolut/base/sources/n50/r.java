package n50;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212507c;
    public final boolean d;

    public r(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f212505a = z;
        this.f212506b = z3;
        this.f212507c = z4;
        this.d = z6;
    }

    @Override // n50.s
    public final boolean a() {
        return this.f212506b;
    }

    @Override // n50.s
    public final int b() {
        return R$attr.uikit_dp0;
    }

    @Override // n50.s
    public final int c() {
        return this.d ? R$attr.uikit_dp12 : R$attr.uikit_dp4;
    }

    @Override // n50.s
    public final boolean d() {
        return this.f212505a;
    }

    @Override // n50.s
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f212505a == rVar.f212505a && this.f212506b == rVar.f212506b && this.f212507c == rVar.f212507c && this.d == rVar.d;
    }

    @Override // n50.s
    public final boolean f() {
        return this.f212507c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f212505a) * 31, 31, this.f212506b), 31, this.f212507c);
    }
}
