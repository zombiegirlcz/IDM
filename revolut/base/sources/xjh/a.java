package xjh;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qmc.h;
import tzg.m;
import ybl.l;
import yjh.a0;
import yjh.j;
import yjh.k0;
import yjh.y;
import zhm.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzg.a f306523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.f f306524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f306525c;
    public final qmc.b d;
    public final m e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yjh.c f306526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cjh.a f306527h;
    public final tzg.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f306528j;
    public final tzg.h k;

    public a(wzg.a cashHoldingsInteractor, zjh.f roboPortfolioInteractor, h roboPortfolioInfoProvider, qmc.b roboContextProvider, m wealthAccountsInteractor, l tradingConfigInteractor, yjh.c marginTransferAccountsProvider, cjh.a navigationCreator, tzg.l wealthAccountsBalanceInteractor, y wealthDocumentsActionHandler, tzg.h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(marginTransferAccountsProvider, "marginTransferAccountsProvider");
        Intrinsics.checkNotNullParameter(navigationCreator, "navigationCreator");
        Intrinsics.checkNotNullParameter(wealthAccountsBalanceInteractor, "wealthAccountsBalanceInteractor");
        Intrinsics.checkNotNullParameter(wealthDocumentsActionHandler, "wealthDocumentsActionHandler");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.f306523a = cashHoldingsInteractor;
        this.f306524b = roboPortfolioInteractor;
        this.f306525c = roboPortfolioInfoProvider;
        this.d = roboContextProvider;
        this.e = wealthAccountsInteractor;
        this.f = tradingConfigInteractor;
        this.f306526g = marginTransferAccountsProvider;
        this.f306527h = navigationCreator;
        this.i = wealthAccountsBalanceInteractor;
        this.f306528j = wealthDocumentsActionHandler;
        this.k = investWithdrawToMoveMoneyChecker;
    }

    public final b a(iih.a wealthActionTransferDestinationProvider, Set customActionHandlers, Map productsExcludedFromUnspecifiedTransfersByRoboContext) {
        Intrinsics.checkNotNullParameter(wealthActionTransferDestinationProvider, "wealthActionTransferDestinationProvider");
        Intrinsics.checkNotNullParameter(customActionHandlers, "customActionHandlers");
        Intrinsics.checkNotNullParameter(productsExcludedFromUnspecifiedTransfersByRoboContext, "productsExcludedFromUnspecifiedTransfersByRoboContext");
        yjh.c cVar = this.f306526g;
        tzg.h hVar = this.k;
        wzg.a aVar = this.f306523a;
        zjh.f fVar = this.f306524b;
        h hVar2 = this.f306525c;
        qmc.b bVar = this.d;
        m mVar = this.e;
        return new b(a1.m(a1.m(a1.m(a1.m(customActionHandlers, new k0(wealthActionTransferDestinationProvider, aVar, fVar, hVar2, bVar, mVar, this.f, cVar, productsExcludedFromUnspecifiedTransfersByRoboContext, hVar)), this.f306528j), new a0()), new j(mVar, this.i, this.f306527h)));
    }
}
