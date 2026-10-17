package jsl;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements rri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178204a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ForecastDelegate f178205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FixedTabsDelegate f178206c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public d(BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen) {
        this.f178205b = (ForecastDelegate) baseInvestOrderDetailsScreen.T.getValue();
        this.f178206c = (FixedTabsDelegate) baseInvestOrderDetailsScreen.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public d(InvestmentProjectionsScreen investmentProjectionsScreen) {
        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
        this.f178205b = (ForecastDelegate) investmentProjectionsScreen.O.getValue();
        this.f178206c = investmentProjectionsScreen.T;
    }
}
