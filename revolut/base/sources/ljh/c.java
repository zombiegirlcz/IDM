package ljh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.asset.trade.actions.ui.api.SwipeAssetTradeActionsApi$Toggles$SwipeActions;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.tracking.v3.InvestSwipeAccountActionsContext;
import com.youTransactor.uCube.rpc.Constants;
import grl.g6;
import ip0.xh0;
import java.util.Iterator;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f195669a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f195669a = featureToggleInteractor;
    }

    public static g6 a(WealthAccount wealthAccount) {
        if (wealthAccount instanceof WealthAccount.Margin) {
            return g6.CFD;
        }
        if (wealthAccount instanceof WealthAccount.Robo) {
            return g6.ROBO;
        }
        boolean z = wealthAccount instanceof WealthAccount.Securities;
        if (z && wealthAccount.b5()) {
            return g6.GIA;
        }
        if (z && wealthAccount.d9()) {
            return g6.GIA_JOINT;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            return g6.ISA;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            return g6.JISA;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            return g6.PEA;
        }
        return null;
    }

    public final l b(l item, List accountActions, WealthAccount account) {
        hih.a aVar;
        Object next;
        Object next2;
        Object next3;
        SwipeToActionDelegate.SwipeAction swipeAction;
        SwipeToActionDelegate.SwipeAction swipeAction2;
        AnalyticsContext analyticsContext;
        AnalyticsContext analyticsContext2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        Intrinsics.checkNotNullParameter(account, "account");
        if (((d) this.f195669a).c(SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c)) {
            SwipeToActionDelegate.SwipeAction swipeAction3 = null;
            AnalyticsContext analyticsContext3 = null;
            if (account instanceof WealthAccount.Margin) {
                aVar = hih.a.MARGIN_TRADING;
            } else if (account instanceof WealthAccount.Robo) {
                aVar = hih.a.ROBO;
            } else {
                boolean z = account instanceof WealthAccount.Securities;
                aVar = (z && account.b5()) ? hih.a.GIA : (z && account.d9()) ? hih.a.GIA_JOINT : account instanceof WealthAccount.TaxAdvantageWealthAccount.Isa ? hih.a.ISA : account instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa ? hih.a.JISA : account instanceof WealthAccount.TaxAdvantageWealthAccount.Pea ? hih.a.PEA : null;
            }
            List list = accountActions;
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                WealthAction wealthAction = (WealthAction) next;
                if (wealthAction.getF95897b() == aVar && (wealthAction instanceof WealthAction.AddMoney) && ((WealthAction.AddMoney) wealthAction).f95867a) {
                    break;
                }
            }
            WealthAction wealthAction2 = (WealthAction) next;
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                WealthAction wealthAction3 = (WealthAction) next2;
                if (wealthAction3.getF95897b() == aVar && (wealthAction3 instanceof WealthAction.Withdraw) && ((WealthAction.Withdraw) wealthAction3).f95896a) {
                    break;
                }
            }
            WealthAction wealthAction4 = (WealthAction) next2;
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it10.next();
                WealthAction wealthAction5 = (WealthAction) next3;
                if (wealthAction5.getF95897b() == aVar && (wealthAction5 instanceof WealthAction.MoveMoney) && ((WealthAction.MoveMoney) wealthAction5).getF95896a()) {
                    break;
                }
            }
            WealthAction wealthAction6 = (WealthAction) next3;
            if (wealthAction2 != null || wealthAction4 != null || wealthAction6 != null) {
                String f55069b = item.getD();
                String f55069b2 = item.getD();
                if (wealthAction6 != null) {
                    String strQ = j6.a.q("swipe-move-money-", f55069b2);
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_swipe_actions_move_money, null, null, 14);
                    xh0 xh0Var = xh0.NEUTRAL;
                    g6 g6VarA = a(account);
                    if (g6VarA != null) {
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        InvestSwipeAccountActionsContext.a aVarNewBuilder = InvestSwipeAccountActionsContext.newBuilder();
                        aVarNewBuilder.c();
                        ((InvestSwipeAccountActionsContext) aVarNewBuilder.f49761b).setAccountType(g6VarA);
                        w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        analyticsContext2 = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                    } else {
                        analyticsContext2 = null;
                    }
                    swipeAction = new SwipeToActionDelegate.SwipeAction(strQ, resourceImage, textLocalisedClause, xh0Var, null, wealthAction6, analyticsContext2, 16);
                } else {
                    swipeAction = null;
                }
                String f55069b3 = item.getD();
                if (wealthAction4 != null) {
                    String strQ2 = j6.a.q("swipe-withdraw-", f55069b3);
                    ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_swipe_actions_withdraw, null, null, 14);
                    xh0 xh0Var2 = xh0.NEUTRAL;
                    g6 g6VarA2 = a(account);
                    if (g6VarA2 != null) {
                        AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                        InvestSwipeAccountActionsContext.a aVarNewBuilder2 = InvestSwipeAccountActionsContext.newBuilder();
                        aVarNewBuilder2.c();
                        ((InvestSwipeAccountActionsContext) aVarNewBuilder2.f49761b).setAccountType(g6VarA2);
                        w0 w0VarA2 = aVarNewBuilder2.a();
                        companion2.getClass();
                        analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2));
                    } else {
                        analyticsContext = null;
                    }
                    swipeAction2 = new SwipeToActionDelegate.SwipeAction(strQ2, resourceImage2, textLocalisedClause2, xh0Var2, null, wealthAction4, analyticsContext, 16);
                } else {
                    swipeAction2 = null;
                }
                String f55069b4 = item.getD();
                if (wealthAction2 != null) {
                    String strQ3 = j6.a.q("swipe-add-money-", f55069b4);
                    ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_invest_swipe_actions_add_money, null, null, 14);
                    xh0 xh0Var3 = xh0.PRIMARY;
                    g6 g6VarA3 = a(account);
                    if (g6VarA3 != null) {
                        AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                        InvestSwipeAccountActionsContext.a aVarNewBuilder3 = InvestSwipeAccountActionsContext.newBuilder();
                        aVarNewBuilder3.c();
                        ((InvestSwipeAccountActionsContext) aVarNewBuilder3.f49761b).setAccountType(g6VarA3);
                        w0 w0VarA3 = aVarNewBuilder3.a();
                        companion3.getClass();
                        analyticsContext3 = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA3));
                    }
                    swipeAction3 = new SwipeToActionDelegate.SwipeAction(strQ3, resourceImage3, textLocalisedClause3, xh0Var3, null, wealthAction2, analyticsContext3, 16);
                }
                SwipeToActionDelegate.SwipeAction[] elements = {swipeAction, swipeAction2, swipeAction3};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new wh(f55069b, item, kotlin.collections.d.L(elements), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            }
        }
        return item;
    }
}
