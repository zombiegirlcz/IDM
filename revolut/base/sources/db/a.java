package db;

import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlow;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112598b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f112597a = i;
        this.f112598b = obj2;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int i2 = this.f112597a;
        boolean z = false;
        Object obj2 = this.f112598b;
        switch (i2) {
            case 0:
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj2;
                KProperty[] kPropertyArr = UserDetailsController.V;
                if (navBarWithToolbar.getExpandRatio() == BitmapDescriptorFactory.HUE_RED && navBarWithToolbar.getVisibility() == 0) {
                    z = true;
                }
                navBarWithToolbar.setShadowVisible(!z);
                break;
            case 1:
                ValuatorsListScreen valuatorsListScreen = (ValuatorsListScreen) obj2;
                KProperty[] kPropertyArr2 = ValuatorsListScreen.U;
                SlidingFromTopViewContainer slidingFromTopViewContainer = valuatorsListScreen.d3().e;
                if (valuatorsListScreen.d3().f10704b.getExpandRatio() == BitmapDescriptorFactory.HUE_RED && valuatorsListScreen.d3().d.getVisibility() == 0) {
                    z = true;
                }
                slidingFromTopViewContainer.a(z);
                break;
            case 2:
                KProperty[] kPropertyArr3 = LoanRepaymentsListScreen.f70576e0;
                ((LoanRepaymentsListScreen) obj2).i3();
                break;
            case 3:
                KProperty[] kPropertyArr4 = RevPointsTransactionsListScreen.f83871e0;
                ((RevPointsTransactionsListScreen) obj2).g3();
                break;
            case 4:
                KProperty[] kPropertyArr5 = SelectorScreen.f65290n0;
                ((SelectorScreen) obj2).l3();
                break;
            case 5:
                KProperty[] kPropertyArr6 = TransactionListFlow.R;
                jgf.a aVarD3 = ((TransactionListFlow) obj2).d3();
                if (aVarD3.f174035c.getExpandRatio() == BitmapDescriptorFactory.HUE_RED) {
                    Tabs flowTransactionListMonthTabs = aVarD3.f174034b;
                    Intrinsics.checkNotNullExpressionValue(flowTransactionListMonthTabs, "flowTransactionListMonthTabs");
                    if (flowTransactionListMonthTabs.getVisibility() == 0) {
                        z = true;
                    }
                }
                aVarD3.d.a(z);
                aVarD3.f174035c.setShadowVisible(!z);
                break;
            default:
                ActivityScreen.Companion aVar = ActivityScreen.INSTANCE;
                ((ActivityScreen) obj2).j3();
                break;
        }
    }
}
