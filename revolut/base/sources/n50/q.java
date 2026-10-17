package n50;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212504c;
    public final boolean d;

    public q(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f212502a = z;
        this.f212503b = z3;
        this.f212504c = z4;
        this.d = z6;
    }

    @Override // n50.s
    public final boolean a() {
        return this.f212503b;
    }

    @Override // n50.s
    public final int b() {
        return this.d ? R$attr.uikit_dp12 : R$attr.uikit_dp4;
    }

    @Override // n50.s
    public final int c() {
        return this.d ? R$attr.uikit_dp12 : R$attr.uikit_dp4;
    }

    @Override // n50.s
    public final boolean d() {
        return this.f212502a;
    }

    @Override // n50.s
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f212502a == qVar.f212502a && this.f212503b == qVar.f212503b && this.f212504c == qVar.f212504c && this.d == qVar.d;
    }

    @Override // n50.s
    public final boolean f() {
        return this.f212504c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f212502a) * 31, 31, this.f212503b), 31, this.f212504c);
    }
}
