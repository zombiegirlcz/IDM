package jyg;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends oki.h implements f {
    public final AccountPickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kpj.f f179437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jwg.h f179438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f179439r;

    public n(AccountPickerContract$InputData inputData, kpj.f productTypeEnabledInteractor, jwg.h netWorthInteractor, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productTypeEnabledInteractor, "productTypeEnabledInteractor");
        Intrinsics.checkNotNullParameter(netWorthInteractor, "netWorthInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f179437p = productTypeEnabledInteractor;
        this.f179438q = netWorthInteractor;
        this.f179439r = mra.d.b(this, new c(inputData.f95073b, inputData.f95074c, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static final yhh.a I2(n nVar, WidgetisedAnalyticsType widgetisedAnalyticsType) {
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Brokerage) {
            return yhh.a.SECURITIES;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Isa) {
            return yhh.a.ISA;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) {
            return yhh.a.SECURITIES_JOINT;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Pea) {
            return yhh.a.PEA;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Robo) {
            return yhh.a.ROBO;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Commodities) {
            return yhh.a.COMMODITIES;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa) {
            return yhh.a.JISA;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Cfd) {
            return yhh.a.MARGIN;
        }
        if ((widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Crypto)) {
            return yhh.a.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static a J2(WidgetisedAnalyticsType widgetisedAnalyticsType) {
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestments) {
            return a.ALL;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Crypto) {
            return a.CRYPTO;
        }
        if ((widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Isa) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Pea) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Commodities) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Robo) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Cfd)) {
            return a.INVEST;
        }
        if (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa) {
            return a.JISA;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f179437p.d(), new eh9.j(continuation, this, 29)), null, null, new jv.o(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f179439r;
    }
}
