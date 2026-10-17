package qc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a3;
import com.revolut.core.ui_kit.delegates.widgets.c3;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.api.navigation.CardsListDestination;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.r2;
import h93.f0;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f244600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.d f244601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f244602c;
    public final uc7.a d;
    public final pf7.b e;
    public final pf7.a f;

    public h(k39.b navigationCommandsDispatcher, mt8.d kycInteractor, a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher, pf7.b incentiveRewardFreeCardNavigationProvider, pf7.a incentiveRewardCardOrderReimbursedNavigationProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(incentiveRewardFreeCardNavigationProvider, "incentiveRewardFreeCardNavigationProvider");
        Intrinsics.checkNotNullParameter(incentiveRewardCardOrderReimbursedNavigationProvider, "incentiveRewardCardOrderReimbursedNavigationProvider");
        this.f244600a = navigationCommandsDispatcher;
        this.f244601b = kycInteractor;
        this.f244602c = widgetsUiInteractor;
        this.d = homeFeedWidgetsEventDispatcher;
        this.e = incentiveRewardFreeCardNavigationProvider;
        this.f = incentiveRewardCardOrderReimbursedNavigationProvider;
    }

    public final efm.b b(Object obj2, boolean z, boolean z3) {
        if (obj2 instanceof f0) {
            mt8.d dVar = this.f244601b;
            if (z3) {
                pfm.a aVar = new pfm.a(dVar.getKyc(), new d(1, new f(this, (f0) obj2, z, 0)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            }
            pfm.a aVar2 = new pfm.a(dVar.getKyc(), new d(2, new f(this, (f0) obj2, z, 1)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        if (obj2 instanceof em4.a) {
            return c();
        }
        boolean z4 = obj2 instanceof re7.g;
        k39.b bVar = this.f244600a;
        m mVar = m.f235744a;
        if (z4) {
            FeatureCommand featureCommandA = this.e.a((re7.g) obj2);
            if (featureCommandA != null) {
                return bVar.a(featureCommandA);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(obj2 instanceof re7.a)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        FeatureCommand featureCommandA2 = this.f.a((re7.a) obj2);
        if (featureCommandA2 != null) {
            return bVar.a(featureCommandA2);
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    public final efm.b c() {
        return this.f244600a.a(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.CARDS_WIDGET, new ft3.g(null, null, 3), null, null, null, null, 16378)));
    }

    public final efm.b d(CardsWidgetContext cardsWidgetContext) {
        SelectedTab selectedTab;
        switch (g.f244599a[cardsWidgetContext.getCardScope().ordinal()]) {
            case 1:
            case 2:
                selectedTab = SelectedTab.DEBIT;
                break;
            case 3:
                selectedTab = SelectedTab.JOINT;
                break;
            case 4:
                selectedTab = SelectedTab.FREELANCER;
                break;
            case 5:
                selectedTab = SelectedTab.CREDIT;
                break;
            case 6:
                selectedTab = SelectedTab.JUNIOR;
                break;
            case 7:
                selectedTab = SelectedTab.CRYPTO;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return this.f244600a.a(new FeatureCommand(new CardOrderNewFeatureConfig(selectedTab, null, null, null, null, false, null, null, null, null, null, null, 16382)));
    }

    @Override // csh.f
    public final Class j() {
        return CardsWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CardsWidgetContext widgetContext2 = (CardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof n0;
        if (z && Intrinsics.f(((n0) event).f55437c.f53161a, "ADD_NEW_CARD_LIST_ID")) {
            return d(widgetContext2);
        }
        boolean z3 = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        k39.b bVar = this.f244600a;
        if (z3 && (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof HorizontalScrollerWidgetDelegate.Model)) {
            return bVar.a(u0.f(new CardsListDestination((CardListPreSelectedVariant.Tab) null, (b93.d) null, 7)));
        }
        boolean z4 = event instanceof a3;
        if (z4 && Intrinsics.f(((a3) event).f55292c.f55221j, "ADD_NEW_CARD_ACTION_LIST_ID")) {
            return d(widgetContext2);
        }
        boolean z6 = event instanceof q;
        if (z6 && Intrinsics.f(((q) event).f55475c.i, "ADD_NEW_CARD_ACTION_LIST_ID")) {
            return d(widgetContext2);
        }
        boolean z11 = event instanceof c3;
        if (z11 && Intrinsics.f(((c3) event).f55316c.f55221j, "ADD_NEW_CARD_ACTION_LIST_ID")) {
            return d(widgetContext2);
        }
        boolean z12 = true;
        if (z) {
            return b(((n0) event).f55437c.f53167l, true, false);
        }
        if (z4) {
            return b(((a3) event).f55292c.f55221j, false, false);
        }
        if (z6) {
            return b(((q) event).f55475c.i, true, true);
        }
        m mVar = m.f235744a;
        if (!z11) {
            if (z3) {
                BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
                if (model instanceof QuickActionWidgetDelegate.Model) {
                    return b(((QuickActionWidgetDelegate.Model) model).f55221j, false, false);
                }
            }
            if (event instanceof q0) {
                return new pfm.h(new ly2.d(this, 24, event, widgetContext2), 2);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Object obj2 = ((c3) event).f55316c.f55221j;
        if (!(obj2 instanceof f0)) {
            if (obj2 instanceof em4.a) {
                return c();
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        f0 f0Var = (f0) obj2;
        boolean z29 = f0Var.S;
        String str = f0Var.f150110a;
        if (z29) {
            return bVar.a(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Unfreeze(str), 15)));
        }
        if (Intrinsics.f(str, "retail_disposable")) {
            return bVar.a(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, CardScreenAction.CreateDisposableCard.f65328a, 15)));
        }
        pfm.a aVar = new pfm.a(this.f244601b.getKyc(), new d(2, new f(this, f0Var, z12, 1)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
