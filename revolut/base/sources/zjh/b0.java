package zjh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fsl.k f322824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zgh.e f322825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5h.e f322826c;
    public final u5h.e d;
    public final q1 e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1h.h f322827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w6h.g f322828h;
    public final tzg.h i;

    public b0(fsl.k investOrdersWidgetMapper, zgh.e wealthTaxAdvantageLimitWidgetMapper, y5h.e wealthGiaMarginOnboardingWidgetMapper, u5h.e wealthMarginBorrowingInterestRateWidgetMapper, q1 wealthDisclaimersMapper, gte.a featureToggleInteractor, d1h.h wealthRemoteDisclaimersMapper, w6h.g wealthMarginStatusWidgetMapper, tzg.h investWithdrawToMoveMoneyChecker) {
        Intrinsics.checkNotNullParameter(investOrdersWidgetMapper, "investOrdersWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageLimitWidgetMapper, "wealthTaxAdvantageLimitWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthGiaMarginOnboardingWidgetMapper, "wealthGiaMarginOnboardingWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterestRateWidgetMapper, "wealthMarginBorrowingInterestRateWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthMarginStatusWidgetMapper, "wealthMarginStatusWidgetMapper");
        Intrinsics.checkNotNullParameter(investWithdrawToMoveMoneyChecker, "investWithdrawToMoveMoneyChecker");
        this.f322824a = investOrdersWidgetMapper;
        this.f322825b = wealthTaxAdvantageLimitWidgetMapper;
        this.f322826c = wealthGiaMarginOnboardingWidgetMapper;
        this.d = wealthMarginBorrowingInterestRateWidgetMapper;
        this.e = wealthDisclaimersMapper;
        this.f = featureToggleInteractor;
        this.f322827g = wealthRemoteDisclaimersMapper;
        this.f322828h = wealthMarginStatusWidgetMapper;
        this.i = investWithdrawToMoveMoneyChecker;
    }

    public static TextLocalisedClause a(TradingLegalEntityInformation tradingLegalEntityInformation) {
        hel.b bVar = tradingLegalEntityInformation.f105106a;
        switch (bVar == null ? -1 : a0.f322823a[bVar.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new TextLocalisedClause(R$string.trading_cash_balance_pockets_title, null, null, 14);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new TextLocalisedClause(R$string.trading_cash_balance_pockets_title_mx, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0163  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r22) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.b0.c(cli.j):cli.o");
    }
}
