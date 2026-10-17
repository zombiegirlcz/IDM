package mle;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.feature.wealth.ui.api.navigation.currencychanger.WealthCurrencyChangerDestination;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = InvestSettingsScreen.f0;
        z zVar = (z) iVar;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.u instanceof kih.a) {
            zVar.C1(WealthCurrencyChangerDestination.f95929b);
        }
        wlh.k kVar = (wlh.k) zVar.u;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof n4l.e) {
            d1e.a aVar = kVar.u;
            n4l.e stockLendingStatus = (n4l.e) obj4;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
            NaviCommand naviCommandB = aVar.b(stockLendingStatus);
            BridgeDestination bridgeDestinationB = naviCommandB != null ? u0.b(naviCommandB) : null;
            if (bridgeDestinationB != null) {
                kVar.A2(bridgeDestinationB);
            }
        } else if (Intrinsics.f(model.f53228a, "COMPLEX_BONDS_ASSESSMENT_LIST_ID")) {
            j60.a aVar2 = kVar.f298504s;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.trading_settings_bonds_assessment_dialog_title, null, null, 14), new TextLocalisedClause(R$string.trading_settings_bonds_assessment_dialog_description, null, null, 14), null, 28);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("COMPLEX_BONDS_ASSESSMENT_DIALOG_PRIMARY_ACTION_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.trading_settings_bonds_assessment_dialog_primary_action, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("COMPLEX_BONDS_ASSESSMENT_DIALOG_SECONDARY_ACTION_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.trading_settings_bonds_assessment_dialog_secondary_action, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model3, 0, R$attr.uikit_dp24, 0, 0, 13);
            aVar2.x(new rp0.y(zhm.v.k(model2, model3), tVar, null, null, null, null, 1020));
        }
        zVar.f206704t.b3(model);
        zVar.f206703s.b3(model);
        return Unit.f186387a;
    }
}
