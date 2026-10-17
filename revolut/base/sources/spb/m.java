package spb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a3;
import com.revolut.core.ui_kit.delegates.widgets.c3;
import com.revolut.core.ui_kit.delegates.widgets.f3;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import sek.q;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends pri.c implements csh.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mjb.a f264939h;
    public final k39.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final uc7.a f264940j;
    public final Class k;

    public m(mjb.a savingsNavigationProvider, k39.b navigationCommandsDispatcher, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f264939h = savingsNavigationProvider;
        this.i = navigationCommandsDispatcher;
        this.f264940j = homeFeedWidgetsEventDispatcher;
        this.k = HomeFeedWidgetContext.Savings.class;
    }

    public static MainContainerScreenDestination.JustShow N(String str) {
        return new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.SAVINGS), null), (AccountCreationTransitionAnimation) null, 12);
    }

    public final efm.b O(p pVar) {
        if (pVar != null) {
            return pd.b.n(p0.f264003c, new q(this, pVar, null, 14));
        }
        pfm.h hVar = new pfm.h(new bji.a(9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return this.k;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Object objL;
        Object objL2;
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof c3;
        mjb.a aVar = this.f264939h;
        if (z) {
            Object obj2 = ((c3) event).f55316c.f55221j;
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            if (pVar instanceof o) {
                s sVar = ((o) pVar).f264942a;
                objL2 = ((hob.d) aVar).g(new SavingsNavigationProvider$TopUpConfig(sVar, sVar.e(), null, false, false, false, 508));
            } else if (pVar instanceof n) {
                objL2 = d0.m(vhi.c.c(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectTopUpAccount(null)), yhi.b.SOLID, null, false, 12));
                Intrinsics.checkNotNullExpressionValue(objL2, "just(...)");
            } else {
                if (pVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                objL2 = d0.l(new IllegalStateException("Model.parcel is not instance of TransferWidgetParcel"));
            }
            pfm.a aVar2 = new pfm.a(objL2, new sp5.h(7, new l(this, 0)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        if (!(event instanceof f3)) {
            if (event instanceof a3) {
                Object obj3 = ((a3) event).f55292c.f55221j;
                return O(obj3 instanceof p ? (p) obj3 : null);
            }
            if (!(event instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            koi.j jVar = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            qv0.p pVar2 = jVar instanceof qv0.p ? (qv0.p) jVar : null;
            Object f = pVar2 != null ? pVar2.getF54982q() : null;
            return O(f instanceof p ? (p) f : null);
        }
        QuickActionWidgetDelegate.Model model = ((f3) event).f55356c;
        Object obj4 = model.f55221j;
        p pVar3 = obj4 instanceof p ? (p) obj4 : null;
        if (pVar3 instanceof o) {
            objL = ((hob.d) aVar).h(((o) pVar3).f264942a);
        } else if (pVar3 instanceof n) {
            objL = d0.m(vhi.c.c(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectWithdrawAccount.f83178a), yhi.b.SOLID, null, false, 12));
            Intrinsics.checkNotNullExpressionValue(objL, "just(...)");
        } else {
            if (pVar3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            objL = d0.l(new IllegalStateException(j6.a.q("Unhandled click even, modelListId=", model.f55217b)));
        }
        pfm.a aVar3 = new pfm.a(objL, new sp5.h(8, new l(this, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        return aVar3;
    }
}
