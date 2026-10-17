package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240083c;
    public final String d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240085h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ko3.b f240086j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f240087l;

    public b0(eel.c timeSpan, iwg.a analyticsProductType, String currency, String portfolioId, String asset, String str, String str2, jo3.b pnlFifo, jo3.b pnlAverage, ko3.b bVar, LocalDate sellDate) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(sellDate, "sellDate");
        Intrinsics.checkNotNullParameter(pnlFifo, "pnlFifo");
        Intrinsics.checkNotNullParameter(pnlAverage, "pnlAverage");
        this.f240081a = analyticsProductType;
        this.f240082b = timeSpan;
        this.f240083c = currency;
        this.d = portfolioId;
        this.e = asset;
        this.f = sellDate;
        this.f240084g = pnlFifo;
        this.f240085h = pnlAverage;
        this.i = str;
        this.f240086j = bVar;
        this.k = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f240081a == b0Var.f240081a && this.f240082b == b0Var.f240082b && Intrinsics.f(this.f240083c, b0Var.f240083c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e) && Intrinsics.f(this.f, b0Var.f) && Intrinsics.f(this.f240084g, b0Var.f240084g) && Intrinsics.f(this.f240085h, b0Var.f240085h) && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f240086j, b0Var.f240086j) && Intrinsics.f(this.k, b0Var.k);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240085h, wp5.y.e(this.f240084g, com.revolut.data.database.models.openbanking.d.g(this.f, p.a.c(p.a.c(p.a.c(prk.o.c(this.f240082b, this.f240081a.hashCode() * 31, 31), 31, this.f240083c), 31, this.d), 31, this.e), 31), 31), 31);
        String str = this.i;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240086j;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
