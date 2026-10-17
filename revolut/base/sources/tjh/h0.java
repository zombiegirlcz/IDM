package tjh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.shared.asset.trade.actions.ui.api.SwipeAssetTradeActionsApi$Toggles$SwipeActions;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ijh.e;
import ip0.v7;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import vkm.q0;
import zh9.u0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends bih.a {

    @NotNull
    public static final h Companion = new h();
    public static final Object O;
    public final zhh.a A;
    public final zhh.a B;
    public final zhh.a C;
    public final zhh.a D;
    public final xjh.b E;
    public final ybl.k F;
    public final tzg.m G;
    public final ybl.l H;
    public final bnh.n I;
    public final ejh.b J;
    public final mk0.a K;
    public final vii.c L;
    public final String M;
    public final bih.h N;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4f.b f271732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dlc.a f271733n;
    public final ot5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a5b.g f271734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.k f271735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vjh.a f271736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jlh.e f271737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jlh.f f271738t;
    public final ael.w u;
    public final ijh.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nlh.b f271739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clc.b f271740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l0 f271741y;
    public final z8h.g z;

    static {
        Boolean bool = Boolean.TRUE;
        O = r0.k(new Pair("SECURITIES", bool), new Pair("COMMODITIES", bool), new Pair("ROBO", bool), new Pair("MARGIN", bool), new Pair("ISA", bool), new Pair("PEA", bool));
    }

    public h0(w4f.b securityPortfolioControllerExtension, dlc.a roboPortfoliosDetailsProvider, ot5.a commodityAccountDetailsControllerExtension, a5b.g marginAccountControllerExtension, x8h.k displayCurrencyInteractor, vjh.a dialogsFactory, jlh.e accountWidgetsContextMenuInteractor, jlh.f accountWidgetsPersonalisationInteractor, ael.w portfolioBalancesSortingInteractor, ijh.d securitiesHoldingRowsMerger, nlh.b wealthTradeCommandProvider, gte.a featureToggleInteractor, clc.b roboOnboardingEntryCommandFactory, l0 popupMenuDialogDisplayer, z8h.g wealthCombinedBuyingPowerInteractor, zhh.a cfdAccountActionsProvider, zhh.a giaAccountActionsProvider, zhh.a taaAccountActionsProvider, zhh.a roboAccountActionsProvider, xjh.b wealthActionsHandler, ybl.k tradingAccountsInteractor, tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor, bnh.n roboPortfolioItemsProvider, ejh.b onboardingNavigationCommandFactory, mk0.a personalisationStorage, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(securityPortfolioControllerExtension, "securityPortfolioControllerExtension");
        Intrinsics.checkNotNullParameter(roboPortfoliosDetailsProvider, "roboPortfoliosDetailsProvider");
        Intrinsics.checkNotNullParameter(commodityAccountDetailsControllerExtension, "commodityAccountDetailsControllerExtension");
        Intrinsics.checkNotNullParameter(marginAccountControllerExtension, "marginAccountControllerExtension");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(accountWidgetsContextMenuInteractor, "accountWidgetsContextMenuInteractor");
        Intrinsics.checkNotNullParameter(accountWidgetsPersonalisationInteractor, "accountWidgetsPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalancesSortingInteractor, "portfolioBalancesSortingInteractor");
        Intrinsics.checkNotNullParameter(securitiesHoldingRowsMerger, "securitiesHoldingRowsMerger");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(wealthCombinedBuyingPowerInteractor, "wealthCombinedBuyingPowerInteractor");
        Intrinsics.checkNotNullParameter(cfdAccountActionsProvider, "cfdAccountActionsProvider");
        Intrinsics.checkNotNullParameter(giaAccountActionsProvider, "giaAccountActionsProvider");
        Intrinsics.checkNotNullParameter(taaAccountActionsProvider, "taaAccountActionsProvider");
        Intrinsics.checkNotNullParameter(roboAccountActionsProvider, "roboAccountActionsProvider");
        Intrinsics.checkNotNullParameter(wealthActionsHandler, "wealthActionsHandler");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioItemsProvider, "roboPortfolioItemsProvider");
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        AnimationRequest swipeAnimationRequest = animationRequest;
        Intrinsics.checkNotNullParameter(swipeAnimationRequest, "swipeAnimationRequest");
        this.f271732m = securityPortfolioControllerExtension;
        this.f271733n = roboPortfoliosDetailsProvider;
        this.o = commodityAccountDetailsControllerExtension;
        this.f271734p = marginAccountControllerExtension;
        this.f271735q = displayCurrencyInteractor;
        this.f271736r = dialogsFactory;
        this.f271737s = accountWidgetsContextMenuInteractor;
        this.f271738t = accountWidgetsPersonalisationInteractor;
        this.u = portfolioBalancesSortingInteractor;
        this.v = securitiesHoldingRowsMerger;
        this.f271739w = wealthTradeCommandProvider;
        this.f271740x = roboOnboardingEntryCommandFactory;
        this.f271741y = popupMenuDialogDisplayer;
        this.z = wealthCombinedBuyingPowerInteractor;
        this.A = cfdAccountActionsProvider;
        this.B = giaAccountActionsProvider;
        this.C = taaAccountActionsProvider;
        this.D = roboAccountActionsProvider;
        this.E = wealthActionsHandler;
        this.F = tradingAccountsInteractor;
        this.G = wealthAccountsInteractor;
        this.H = tradingConfigInteractor;
        this.I = roboPortfolioItemsProvider;
        this.J = onboardingNavigationCommandFactory;
        this.K = personalisationStorage;
        this.L = new vii.c();
        Intrinsics.checkNotNullParameter("tab_invest_swipe_action_demo_animation_shown", "id");
        this.M = "tab_invest_swipe_action_demo_animation_shown";
        this.N = new bih.h(r0.g(), zhm.f0.f322471a, r0.g(), null, null, (featureToggleInteractor.a(SwipeAssetTradeActionsApi$Toggles$SwipeActions.f86033c) || Intrinsics.f(personalisationStorage.a(new tk0.b("tab_invest_swipe_action_demo_animation_shown")), Boolean.TRUE)) ? null : swipeAnimationRequest);
    }

    public static final ArrayList p3(h0 h0Var, b2b.a aVar) {
        h0Var.getClass();
        List list = aVar.f11929a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = ((y49.h) it8.next()).f310847a.f214596b;
            wel.e eVar = aVar.f11930b;
            arrayList.add(new p5d.b(str, "instrument", eVar != null ? eVar.f296818a : null));
        }
        return arrayList;
    }

    public static final ArrayList q3(h0 h0Var, ot5.b bVar) {
        h0Var.getClass();
        ArrayList arrayList = bVar.d.f71383b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new p5d.b(((CryptoCommodityPosition) it8.next()).f71379a.f306286a, "commodity", null));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r3(tjh.h0 r4, com.revolut.core.ui_kit.delegates.RowDelegate.Model r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof tjh.m
            if (r0 == 0) goto L16
            r0 = r6
            tjh.m r0 = (tjh.m) r0
            int r1 = r0.f271758x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f271758x = r1
            goto L1b
        L16:
            tjh.m r0 = new tjh.m
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271758x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            tjh.h0 r4 = r0.u
            yhm.o.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.u
            boolean r6 = r5 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            if (r6 == 0) goto L40
            com.revolut.feature.wealth.api.domain.model.WealthAccount$TaxAdvantageWealthAccount r5 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount) r5
            goto L41
        L40:
            r5 = 0
        L41:
            if (r5 != 0) goto L4b
            java.lang.String r4 = "handleInCompleteOnboardingItemClick called but parcel isn't TaxAdvantageWealthAccount"
            r6.b.D(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L4b:
            ejh.b r6 = r4.J
            r0.u = r4
            r0.f271758x = r3
            sih.b r2 = sih.b.STOCKS
            java.lang.Object r6 = r6.a(r5, r2, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            aii.u r6 = (aii.u) r6
            r4.A2(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tjh.h0.r3(tjh.h0, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s3(tjh.h0 r24, com.revolut.core.ui_kit.delegates.RowDelegate.Model r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tjh.h0.s3(tjh.h0, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    public static final d3f.a t3(h0 h0Var, d3f.a aVar, List list) {
        del.b bVar = aVar.f111100b;
        del.b bVarA = bVar != null ? del.b.a(bVar, list) : null;
        wel.e portfolio = aVar.f111099a;
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        return new d3f.a(portfolio, bVarA);
    }

    public static ArrayList u3(List list) {
        ArrayList<koi.j> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (kotlin.text.a0.H(((koi.j) obj2).getF55139b(), "PRODUCT_WIDGET_HEADER_", false)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (koi.j jVar : arrayList) {
            RowDelegate.Model model = jVar instanceof RowDelegate.Model ? (RowDelegate.Model) jVar : null;
            Object obj3 = model != null ? model.u : null;
            wjh.l lVar = obj3 instanceof wjh.l ? (wjh.l) obj3 : null;
            String str = lVar != null ? lVar.f298104a : null;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public static ArrayList v3(d3f.a aVar) {
        String str;
        ArrayList<kel.g> arrayList = aVar.f111099a.e;
        ArrayList arrayList2 = new ArrayList();
        for (kel.g gVar : arrayList) {
            p5d.b bVar = null;
            kel.n nVar = gVar instanceof kel.n ? (kel.n) gVar : null;
            if (nVar != null && (str = nVar.e) != null) {
                bVar = new p5d.b(str, "instrument", aVar.f111099a.f296818a);
            }
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    @Override // yji.n
    public final void D2() {
        jlh.o oVar = (jlh.o) this.f271738t;
        ue0.c cVar = (ue0.c) ((ulh.n) oVar.f175787a).f281020a.get();
        Type MAP_STRING_BOOLEAN_TYPE = ulh.n.d;
        Intrinsics.checkNotNullExpressionValue(MAP_STRING_BOOLEAN_TYPE, "MAP_STRING_BOOLEAN_TYPE");
        Flow flowE = t1.E(new rv6.e(new tnb.k(cVar.C0("INVEST_ACCOUNT_WIDGETS_COLLAPSED", MAP_STRING_BOOLEAN_TYPE), 6), 21));
        zhm.h0 h0Var = zhm.h0.f322473a;
        Continuation continuation = null;
        yji.n.j2(this, mo3.a.g(rd0.e.n(flowE, h0Var), null, new tj9.d(5), 1), null, new c0(this, continuation, 0), 3);
        ue0.c cVar2 = (ue0.c) ((ulh.n) oVar.f175787a).f281020a.get();
        Type LIST_STRING_BOOLEAN_TYPE = ulh.n.e;
        Intrinsics.checkNotNullExpressionValue(LIST_STRING_BOOLEAN_TYPE, "LIST_STRING_BOOLEAN_TYPE");
        yji.n.j2(this, mo3.a.g(rd0.e.n(nim.a.v(t1.E(rd0.e.e(new tnb.k(cVar2.C0("INVEST_ACCOUNT_WIDGETS_ORDER", LIST_STRING_BOOLEAN_TYPE), 7), h0Var, new aj6.u(3, 5, null))), new jj3.a(22)), h0Var), null, new tj9.d(6), 1), null, new c0(this, continuation, 1), 3);
        yji.n.j2(this, rd0.e.b(this.f271741y.f256113c), null, new c0(this, continuation, 2), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.N;
    }

    @Override // bih.a
    public final String e3() {
        return ((bih.h) b3()).e;
    }

    @Override // bih.a
    public final q0 f3() {
        return new q0(c6d.b.i(u0.m(vkm.q.q(tzg.m.c(this.G, null, cfl.k.f23744a, 1)), vkm.q.q(ybl.l.d(this.H))), new f(this, 0)), new tgk.f(this, null, 6), 1);
    }

    @Override // bih.a
    public final Flow g3() {
        return vkm.q.q(new qij.s(c3(), 29));
    }

    @Override // bih.a
    public final void h3(List allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        String str = ((bih.h) b3()).e;
        if (str == null || kotlin.text.a0.H(str, "PRODUCT_WIDGET_HEADER_", false)) {
            V2(new tgk.f(this, allItems, null, 7), new yi5.b(29));
        }
    }

    @Override // bih.a
    public final void i3(ArrayList allItems) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        String str = ((bih.h) b3()).e;
        if (str == null || kotlin.text.a0.H(str, "PRODUCT_WIDGET_HEADER_", false)) {
            ArrayList arrayListU3 = u3(allItems);
            if (arrayListU3.equals(((bih.h) b3()).f15497b)) {
                return;
            }
            d3(new jeg.i(29, arrayListU3));
        }
    }

    @Override // bih.a
    public final void j3(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        V2(new e0(model, null, this), new yi5.b(29));
    }

    @Override // bih.a
    public final void k3(ty0.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        V2(new tgk.f(this, model, null, 11), new yi5.b(29));
    }

    @Override // bih.a
    public final void l3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        V2(new g0(model, null, this), new yi5.b(29));
    }

    @Override // bih.a
    public final void m3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        String str = model.f53228a;
        if (obj2 instanceof wjh.l) {
            d3(new t8e.c(this, model, 27));
            return;
        }
        if (obj2 instanceof pjh.d) {
            pjh.d dVar = (pjh.d) obj2;
            z3(dVar.f236777a.f183173a.f183146b, ydh.a.a(dVar.f236778b), str);
            return;
        }
        if (obj2 instanceof pjh.b) {
            pjh.b bVar = (pjh.b) obj2;
            z3(bVar.f236774a, ydh.a.a(bVar.f236775b), str);
            return;
        }
        if (obj2 instanceof sjh.a) {
            z3("COMMODITIES", WealthAccountType.COMMODITIES, str);
            return;
        }
        if (obj2 instanceof mjh.c) {
            z3(((mjh.c) obj2).f206045a.g(), WealthAccountType.MARGIN, str);
            return;
        }
        if (obj2 instanceof mjh.b) {
            z3(((mjh.b) obj2).f206043b, WealthAccountType.MARGIN, str);
            return;
        }
        if (obj2 instanceof qjh.a) {
            qjh.a aVar = (qjh.a) obj2;
            String str2 = aVar.f246883c;
            if (str2 == null) {
                str2 = aVar.f246882b.f95703c;
            }
            z3(str2, WealthAccountType.SECURITIES, str);
        }
    }

    @Override // bih.a
    public final void n3(vh clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f54883a.f;
        Continuation continuation = null;
        WealthAction wealthAction = obj2 instanceof WealthAction ? (WealthAction) obj2 : null;
        if (wealthAction == null) {
            return;
        }
        T2(new tgk.f(this, wealthAction, continuation, 12), new yi5.b(27));
    }

    @Override // bih.a
    public final void o3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (kotlin.text.a0.H(model.f53228a, "PRODUCT_WIDGET_HEADER_", false)) {
            V2(new l(model, null, this), new yi5.b(29));
        }
    }

    public final Flow w3(WealthAccount wealthAccount) {
        String f95253a;
        if (wealthAccount instanceof WealthAccount.Margin) {
            f95253a = ((WealthAccount.Margin) wealthAccount).f95233b;
        } else if (wealthAccount instanceof WealthAccount.Securities) {
            f95253a = ((WealthAccount.Securities) wealthAccount).d;
        } else if ((wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) || (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) || (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
            f95253a = ((WealthAccount.TaxAdvantageWealthAccount) wealthAccount).getF95253a();
        } else if (wealthAccount instanceof WealthAccount.Robo) {
            f95253a = ((WealthAccount.Robo) wealthAccount).f95235a;
        } else {
            if (!(wealthAccount instanceof WealthAccount.Commodities)) {
                throw new NoWhenBranchMatchedException();
            }
            f95253a = null;
        }
        return f95253a != null ? mo3.a.e(boh.f.e(ybl.k.d(this.F, f95253a), new t8e.c(wealthAccount, this, 28)), new tj9.d(7), new tj9.d(4)) : new go.g(zhm.f0.f322471a, 2);
    }

    public final Flow x3(WealthAccount wealthAccount) {
        e.a aVar = ijh.e.Companion;
        String strC = jjh.b.c(wealthAccount);
        aVar.getClass();
        int iA = e.a.a(strC);
        return wealthAccount.Q2() ? vkm.q.q(new s(c3(), wealthAccount, iA)) : new go.g(Integer.valueOf(iA), 2);
    }

    public final q0 y3(TradingAccount.Portfolio portfolio, WealthAccount wealthAccount, String str, boolean z, Flow flow, oim.s sVar) {
        jhi.b bVarA = this.f271735q.a();
        String string = portfolio.f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        jlh.o oVar = (jlh.o) this.f271738t;
        wkm.l lVarQ = vkm.q.Q(vkm.q.q(yh5.b.d(bVarA, oVar.b(string))), new sdi.a(null, this, portfolio, 8));
        UUID uuid = portfolio.f105210a;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Flow flowQ = vkm.q.q(oVar.a(string2));
        String widgetKey = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(widgetKey, "toString(...)");
        oVar.getClass();
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        int i = 16;
        Flow flowQ2 = vkm.q.q(new ie7.h(new ahe.i(oc.c.t(((ulh.n) oVar.f175787a).f281022c, new tk0.f(ulh.n.f281019j), (Serializable) r0.g()), i), widgetKey, i));
        String string3 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Flow flowQ3 = vkm.q.q(new ahd.c(c3(), string3, 7));
        Flow flowQ4 = vkm.q.q(new s6e.v(c3(), wealthAccount, 22));
        Flow flowX3 = x3(wealthAccount);
        String string4 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        Flow flowY = v7.y("AccountsWidgetControllerModelExtension", "observeConvertedCombinedBuyingPower", uzg.a.b(this.z, string4, n9l.b.SEC_10, 12));
        if (!z) {
            flowY = null;
        }
        if (flowY == null) {
            flowY = new go.g(null, 2);
        }
        return rd0.e.n(new t38.e(yh5.b.j(lVarQ, flowQ, flowQ2, flowQ3, flowQ4, flowX3, flowY, w3(wealthAccount), flow), 4, this, sVar), y0.b(new Pair("AccountWidgetControllerExtensionImpl", str)));
    }

    public final void z3(String str, WealthAccountType wealthAccountType, String str2) {
        V2(new sxe.g((Object) this, (Object) wealthAccountType, (Object) str2, str, (Continuation) null, 5), new yi5.b(29));
    }
}
