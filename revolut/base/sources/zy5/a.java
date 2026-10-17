package zy5;

import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.currency.accounts.impl.R$string;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;
import zmj.p0;
import zul.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usc.a f326368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f326369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f326370c;

    public a(kla.a introToggleResolver, usc.a currencyStoriesProvider, o studentEmptyStoriesProvider, f planEmptyStoriesProvider) {
        Intrinsics.checkNotNullParameter(introToggleResolver, "introToggleResolver");
        Intrinsics.checkNotNullParameter(currencyStoriesProvider, "currencyStoriesProvider");
        Intrinsics.checkNotNullParameter(studentEmptyStoriesProvider, "studentEmptyStoriesProvider");
        Intrinsics.checkNotNullParameter(planEmptyStoriesProvider, "planEmptyStoriesProvider");
        this.f326368a = currencyStoriesProvider;
        this.f326369b = studentEmptyStoriesProvider;
        this.f326370c = planEmptyStoriesProvider;
    }

    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.Map] */
    public final r a(ArrayList actions) {
        r rVarE;
        r rVarJust;
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2;
        Intrinsics.checkNotNullParameter(actions, "actions");
        ArrayList arrayListS = t61.a.s("actions", actions);
        Iterator it8 = actions.iterator();
        while (it8.hasNext()) {
            ProductAccountWidgetAction productAccountWidgetAction = (ProductAccountWidgetAction) it8.next();
            ?? r3 = ((l) this.f326368a.f282889b).f326383b;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : r3.entrySet()) {
                if (!((Set) entry.getValue()).contains(productAccountWidgetAction.f89538a)) {
                    entry = null;
                }
                if (entry != null) {
                    arrayList.add(entry);
                }
            }
            a0.x(arrayList, arrayListS);
        }
        Set<Map.Entry> setI1 = d0.i1(arrayListS);
        ArrayList arrayList2 = new ArrayList(w.t(setI1, 10));
        for (Map.Entry entry2 : setI1) {
            k storyId = (k) entry2.getKey();
            Set setOfStoriesAction = (Set) entry2.getValue();
            Intrinsics.checkNotNullParameter(storyId, "storyId");
            Intrinsics.checkNotNullParameter(setOfStoriesAction, "setOfStoriesAction");
            switch (h.f326380a[storyId.ordinal()]) {
                case 1:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_add_money_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 2:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_move_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 3:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_wero_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 4:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_details_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 5:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_bizum_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 6:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_blik_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 7:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_bre_b_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 8:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_payd_id_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 9:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_mb_way_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 10:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_pix_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                case 11:
                    navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_upi_title, null, null, 14), null, new NavBarProductIntro$StoryV2.HighlightedItems.Actions(setOfStoriesAction));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(navBarProductIntro$StoryV2);
        }
        r map = te0.w.h(d0.E0(u.c(new NavBarProductIntro$StoryV2(new TextLocalisedClause(R$string.home_currency_account_product_intro_v2_account_switcher_title, null, null, 14), null, NavBarProductIntro$StoryV2.HighlightedItems.SmallAction.f57877a)), arrayList2)).map(new zx0.b(new l0(14), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        AccountWidgetItemModel.EmptyStateStories.NotApplicable notApplicable = AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
        r rVarOnErrorReturnItem = map.onErrorReturnItem(notApplicable);
        f fVar = this.f326370c;
        boolean zA = fVar.f326379c.a(PricingPlansUiApi$Toggles.PlanOnboardingHomeIntro.f102636c);
        w4l.h hVar = w4l.h.f294642c;
        od0.i iVar = od0.i.f224256b;
        if (zA) {
            od0.i.Companion.getClass();
            rVarE = r.just(iVar);
            Intrinsics.checkNotNullExpressionValue(rVarE, "just(...)");
        } else {
            r map2 = te0.w.b0(m70.a.g(fVar.f326377a.v(hVar), null, new zs4.d(18), 1), new l0(15)).switchMap(new zx0.b(new b(fVar, 1), 22)).map(new zx0.b(new l0(fVar, 16), 23));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            r rVarSwitchMap = map2.switchMap(new zx0.b(new b(fVar, 0), 21));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            od0.i.Companion.getClass();
            rVarE = ue0.e.E(rVarSwitchMap, iVar);
        }
        r map3 = rVarE.distinctUntilChanged().map(new zx0.b(new l0(13), 18));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        r rVarOnErrorReturnItem2 = map3.onErrorReturnItem(notApplicable);
        o oVar = this.f326369b;
        if (oVar.f326386a.a(PricingPlansApi$Toggles.StudentPlans.f81004c) || !oVar.f326387b.h(ola.c.CURRENCY)) {
            rVarJust = r.just(notApplicable);
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        } else {
            rVarJust = rd0.e.c(new ymk.u(q.q(new vvh.e(mo3.a.g(oVar.f326388c.j(hVar), null, null, 3), 22)), oVar, 18), kotlin.coroutines.g.f186406a);
        }
        r rVarDistinctUntilChanged = rVarJust.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarCombineLatest = r.combineLatest(rVarOnErrorReturnItem, rVarOnErrorReturnItem2, rVarDistinctUntilChanged.onErrorReturnItem(notApplicable), new zx0.b(new p0(this, 5), 17));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }
}
