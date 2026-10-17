package od3;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.y3;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CashbackProductScreen cashbackProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0VarT2 = this.v.T2();
        Intrinsics.h(action);
        s0 s0Var = (s0) g0VarT2;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        String str = action.f58316a;
        Object[] objArr = 0;
        switch (str.hashCode()) {
            case -1561390245:
                if (str.equals("ID_ACTION_CHANGE_CURRENCY")) {
                    s0Var.n2(new q0(action, null, s0Var), new whi.b(6));
                }
                break;
            case -894161543:
                if (str.equals("ID_ACTION_EXPLORE_SHOPPING")) {
                    s0Var.C1(new BridgeDestination(new FeatureCommand(new ShopsFeatureConfig.Home(null))));
                }
                break;
            case -281698353:
                if (str.equals("ID_ACTION_WITHDRAW")) {
                    Object obj3 = action.f58324n;
                    uc3.a aVar2 = obj3 instanceof uc3.a ? (uc3.a) obj3 : null;
                    if (aVar2 == null) {
                        throw new NullPointerException("Parcel should be CashbackBox");
                    }
                    s0Var.v2(new p(new YourCashbackFlowContract$Step.WithdrawMetal(aVar2)));
                }
                break;
            case 113086675:
                if (str.equals("ID_ACTION_EXPLORE_REWARDS")) {
                    s0Var.C1(new BridgeDestination(new FeatureCommand(new ShopsFeatureConfig.Home(null))));
                }
                break;
            case 887418382:
                if (str.equals("ID_ACTION_EXPLORE_CREDIT_CARDS")) {
                    n33.r0 r0Var = new n33.r0(mo3.a.g(((y3) s0Var.z).e(w4l.h.f294642c, true), null, new ob2.a(15), 1), 16);
                    Intrinsics.checkNotNullParameter(r0Var, "<this>");
                    Intrinsics.checkNotNullParameter("show_credit_card_home", "taskId");
                    yji.l.a1(s0Var, pu7.a.C(r0Var, s0Var.k, "show_credit_card_home"), null, null, new j0(s0Var, objArr == true ? 1 : 0, 2), 3);
                }
                break;
            case 1036997783:
                if (str.equals("ID_ACTION_UPGRADE")) {
                    s0Var.n2(new n0(action, null, s0Var), new whi.b(6));
                }
                break;
            case 1246586973:
                if (str.equals("ID_ACTION_SHOW_ALL_SOURCES")) {
                    s0Var.v2(new p(new YourCashbackFlowContract$Step.Home(false)));
                }
                break;
            case 1596297067:
                if (str.equals("ID_ACTION_EXPLORE_TRAVEL")) {
                    s0Var.C1(new BridgeDestination(new FeatureCommand(TravelHotelsKompotFeatureConfig.Home.f93634g)));
                }
                break;
            case 1851400620:
                if (str.equals("ID_ACTION_EXPLORE_SHOPS")) {
                    s0Var.C1(new BridgeDestination(new FeatureCommand(new ShopsFeatureConfig.Home(null))));
                }
                break;
            case 1851744937:
                if (str.equals("ID_ACTION_EXPLORE_STAYS")) {
                    s0Var.l2(new o0(s0Var, null), new yi5.b(26));
                }
                break;
            case 2115888092:
                if (str.equals("ID_ACTION_EXPLORE_PRO")) {
                    s0Var.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId("ALL_PRO_POCKETS_ACCOUNT_ID", null), ProductId.PRO), null), null, 4)))));
                }
                break;
        }
        return Unit.f186387a;
    }
}
