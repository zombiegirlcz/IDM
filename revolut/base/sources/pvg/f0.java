package pvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwg.c f240127c;
    public final a3 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240129h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f240130j;
    public final String k;

    public f0(iwg.a analyticsProductType, eel.c timeSpan, iwg.c method, a3 sector, String portfolioId, String currency, String asset, jo3.b pnl2, float f, LocalDate localDate, String str) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f240125a = analyticsProductType;
        this.f240126b = timeSpan;
        this.f240127c = method;
        this.d = sector;
        this.e = portfolioId;
        this.f = currency;
        this.f240128g = asset;
        this.f240129h = pnl2;
        this.i = f;
        this.f240130j = localDate;
        this.k = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f240125a == f0Var.f240125a && this.f240126b == f0Var.f240126b && this.f240127c == f0Var.f240127c && this.d == f0Var.d && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && Intrinsics.f(this.f240128g, f0Var.f240128g) && Intrinsics.f(this.f240129h, f0Var.f240129h) && Float.compare(this.i, f0Var.i) == 0 && Intrinsics.f(this.f240130j, f0Var.f240130j) && Intrinsics.f(this.k, f0Var.k);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.i, wp5.y.e(this.f240129h, p.a.c(p.a.c(p.a.c((this.d.hashCode() + prk.o.d(this.f240127c, prk.o.c(this.f240126b, this.f240125a.hashCode() * 31, 31), 31)) * 31, 31, this.e), 31, this.f), 31, this.f240128g), 31), 31);
        LocalDate localDate = this.f240130j;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
