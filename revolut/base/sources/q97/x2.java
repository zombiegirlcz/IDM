package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x2 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f243821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f243822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oih.k f243823c;
    public final ybl.l d;
    public final kpj.f e;

    public x2(t97.c productCellProvider, xoj.a featuresInteractor, tzg.m wealthAccountsInteractor, oih.k wealthTaxAdvantageAccountCommandProvider, ybl.l tradingConfigInteractor, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageAccountCommandProvider, "wealthTaxAdvantageAccountCommandProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f243821a = featuresInteractor;
        this.f243822b = wealthAccountsInteractor;
        this.f243823c = wealthTaxAdvantageAccountCommandProvider;
        this.d = tradingConfigInteractor;
        this.e = wealthAccountHeaderUiMapper;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.STOCKS_TAA_ISA;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarFlatMap = ((cpj.b) this.f243821a).l(yoj.c.WEALTH_TRADING).flatMap(new h2(8, new q56.o(this, 20)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        efm.d0 d0VarFirstOrError = rd0.e.c(new v2(mo3.a.g(tzg.m.c(this.f243822b, null, null, 3), null, new q2(2), 1), this, 0), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
