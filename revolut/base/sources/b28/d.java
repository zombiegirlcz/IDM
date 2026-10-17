package b28;

import a2f.q;
import aim.e;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    @Override // cli.n
    public final o c(j jVar) {
        ?? K;
        b28.a domainState = (b28.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(domainState.f11921a ? R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_title : R$string.profile_notification_settings_trading_insights_alerts_info_essential_alerts_title, null, null, 14), null, null, null, false, 30);
        if (domainState.f11921a) {
            e eVarB = u.b();
            eVarB.add(new PlainTextDelegate.Model("ADVANCED_INFO_PRICE_VOLATILITY", (UrlImage) null, new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_price_volatility_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_price_volatility_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
            eVarB.add(new PlainTextDelegate.Model("ADVANCED_INFO_EARNING_CALLS", (UrlImage) null, new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_earning_calls_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_earning_calls_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
            eVarB.addAll((List) iii.c.f(domainState.f11923c, new auj.o(domainState, 27), new axd.e(19), new q(24, domainState, this)));
            eVarB.add(new PlainTextDelegate.Model("ADVANCED_INFO_FUNDAMENTAL_METRICS", (UrlImage) null, new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_fundamental_metrics_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_advanced_alerts_fundamental_metrics_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
            e eVarA = u.a(eVarB);
            K = new ArrayList(w.t(eVarA, 10));
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar = (aim.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                i iVar = (i) bVar.next();
                yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
                K.add(iVar);
            }
        } else {
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("ESSENTIAL_INFO_PRICE_VOLATILITY", (UrlImage) null, new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_essential_alerts_price_volatility_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_essential_alerts_price_volatility_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("ESSENTIAL_INFO_EARNING_CALLS", (UrlImage) null, new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_essential_alerts_earning_calls_title, null, null, 14), new TextLocalisedClause(R$string.profile_notification_settings_trading_insights_alerts_info_essential_alerts_earning_calls_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            K = v.k(model, model2);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), K, aVar);
    }
}
