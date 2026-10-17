package pvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f240098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240099c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f240100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240101h;

    public c0(iwg.a analyticsProductType, a3 sector, String currency, String asset, String quantity, jo3.b value, float f, String str) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240097a = analyticsProductType;
        this.f240098b = sector;
        this.f240099c = currency;
        this.d = asset;
        this.e = quantity;
        this.f = value;
        this.f240100g = f;
        this.f240101h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f240097a == c0Var.f240097a && this.f240098b == c0Var.f240098b && Intrinsics.f(this.f240099c, c0Var.f240099c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Float.compare(this.f240100g, c0Var.f240100g) == 0 && Intrinsics.f(this.f240101h, c0Var.f240101h);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240100g, wp5.y.e(this.f, p.a.c(p.a.c(p.a.c((this.f240098b.hashCode() + (this.f240097a.hashCode() * 31)) * 31, 31, this.f240099c), 31, this.d), 31, this.e), 31), 31);
        String str = this.f240101h;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
