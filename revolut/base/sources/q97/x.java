package q97;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f243816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f243817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f243818c;
    public final kpj.f d;
    public final llh.a e;

    public x(t97.c productCellProvider, xoj.a featuresInteractor, ybl.l tradingConfigInteractor, tzg.m wealthAccountsInteractor, kpj.f wealthAccountHeaderUiMapper, llh.a wealthCfdAccountCommandProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthCfdAccountCommandProvider, "wealthCfdAccountCommandProvider");
        this.f243816a = featuresInteractor;
        this.f243817b = tradingConfigInteractor;
        this.f243818c = wealthAccountsInteractor;
        this.d = wealthAccountHeaderUiMapper;
        this.e = wealthCfdAccountCommandProvider;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.CFD;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarFlatMap = ((cpj.b) this.f243816a).l(yoj.c.WEALTH_TRADING).flatMap(new q3d.c(28, new q56.o(this, 16)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        llh.a aVar = this.e;
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(ybl.k.b(aVar.f196801a, TradingAccountType.Margin.f105271a, 6), null, null, 3), kotlin.coroutines.g.f186406a).firstOrError();
        lhi.v vVar = new lhi.v(25, new lk4.g(aVar, 6));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, vVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new q3d.c(27, new h(4)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
