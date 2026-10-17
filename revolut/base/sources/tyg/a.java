package tyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9j.e f275567a;

    public a(w9j.e cryptoDisclaimerInteractor) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerInteractor, "cryptoDisclaimerInteractor");
        this.f275567a = cryptoDisclaimerInteractor;
    }

    public final Flow a(WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if (Intrinsics.f(analyticsType, WidgetisedAnalyticsType.AllInvestments.f95143a) || Intrinsics.f(analyticsType, WidgetisedAnalyticsType.Crypto.f95147a)) {
            return new v1(new w3k.i(this.f275567a, (Continuation) null, 14));
        }
        if ((analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Robo) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd)) {
            return vkm.i.f290039a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
