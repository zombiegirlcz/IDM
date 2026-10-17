package jxg;

import akg.n;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import d4f.p;
import java.util.List;
import jid.z;
import jxb.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lu5.r;
import pd.b;
import rd0.e;
import w4l.h;
import z2f.f;
import zh9.u0;
import zhm.c0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2f.a f179201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f179202b;

    public a(y2f.a tradingTransactionsInteractor, z cryptoTransactionInteractor) {
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(cryptoTransactionInteractor, "cryptoTransactionInteractor");
        this.f179201a = tradingTransactionsInteractor;
        this.f179202b = cryptoTransactionInteractor;
    }

    public final n a(List accountTypes) {
        InvestTransactionsFilter.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        return nim.a.v(((p) this.f179201a).j(new f(new InvestTransactionsFilter.InvestTransactionsFilterImpl(c0.O(accountTypes), null, null, null, null, null, null, 126)), h.f294642c), new g(16));
    }

    public final n b(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if (Intrinsics.f(analyticsType, WidgetisedAnalyticsType.AllInvestAccounts.f95142a)) {
            return a(v.k(WealthAccountType.SECURITIES, WealthAccountType.COMMODITIES, WealthAccountType.ROBO));
        }
        boolean z = analyticsType instanceof WidgetisedAnalyticsType.Cfd;
        h loadingStrategy = h.f294642c;
        if (z || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Robo) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage)) {
            return nim.a.v(((p) this.f179201a).j(new f(InvestTransactionsFilter.Companion.d(InvestTransactionsFilter.INSTANCE, ((kzg.a) analyticsType).getF95154a())), loadingStrategy), new g(16));
        }
        if (Intrinsics.f(analyticsType, WidgetisedAnalyticsType.Commodities.f95146a)) {
            return a(u.c(WealthAccountType.COMMODITIES));
        }
        WidgetisedAnalyticsType.Crypto crypto = WidgetisedAnalyticsType.Crypto.f95147a;
        if (!Intrinsics.f(analyticsType, crypto)) {
            if (Intrinsics.f(analyticsType, WidgetisedAnalyticsType.AllInvestments.f95143a)) {
                return nim.a.v(u0.m(b(crypto), a(v.k(WealthAccountType.SECURITIES, WealthAccountType.COMMODITIES, WealthAccountType.ROBO))), new g(14));
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        z zVar = this.f179202b;
        return nim.a.v(e.b(b.r(e.c(ft5.b.a((r) zVar.f174461b, loadingStrategy, null, 2), kotlin.coroutines.g.f186406a), new nrd.g(zVar, 18))), new g(15));
    }
}
