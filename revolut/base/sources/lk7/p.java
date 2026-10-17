package lk7;

import android.os.Parcelable;
import aw0.o9;
import aw0.u0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.r2;
import com.revolut.core.ui_kit.delegates.widgets.s2;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.pricing_plans.shared.models.Conditions;
import com.revolut.feature.pricing_plans.shared.models.Fee;
import com.revolut.feature.pricing_plans.shared.models.PricingRule;
import com.revolut.feature.revolut_shop.api.domain.model.pricing_rule.RevolutShopPricingRule;
import com.revolut.feature.revolut_shop.api.domain.model.pricing_rule.RevolutShopPricingRuleMappingPayload;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.youTransactor.uCube.rpc.Constants;
import cw0.g;
import em2.e;
import ip0.ak0;
import ip0.hp;
import ip0.m2;
import ip0.m7;
import ip0.o2;
import ip0.sr;
import ip0.xk;
import ip0.z;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import noc.w;
import nvk.a0;
import org.joda.time.DateTime;
import ox5.x0;
import qce.t0;
import rm2.x;
import xzg.n0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f196294c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(bn2.t tVar, x xVar, rm2.h hVar, em2.b bVar) {
        this.f196292a = 25;
        this.f196293b = tVar;
        this.f196294c = hVar;
        this.d = bVar;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) throws Throwable {
        xdh.b bVar;
        int i;
        Template template;
        noc.q qVar;
        noc.p pVar;
        noc.o oVar = (noc.o) this.f196293b;
        noc.d config = (noc.d) this.f196294c;
        Data data = (Data) this.d;
        noc.x state = (noc.x) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "content");
        if (state == null) {
            hx7.e.n(new IllegalArgumentException("Invalid state type " + data + " received in AllocationWidgetMapper"));
            return f0.f322471a;
        }
        boolean z = state instanceof noc.v;
        if (z) {
            bVar = ((noc.v) state).f218001b.f95705h;
        } else {
            if (!(state instanceof w)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = xdh.b.NO_REBALANCE;
        }
        xdh.b rebalanceStatus = bVar;
        List listA = oVar.f217990a.a(state.a());
        List list = (List) iii.c.f(zi0.c.P(rebalanceStatus, false, null, 3), new soi.a(7), new sl5.g(19), new rd3.x(oVar.f217991b, 29));
        if (list == null) {
            list = f0.f322471a;
        }
        List[] elements = {listA, list};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements));
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(config, "config");
        if (z) {
            i = config.f217976a;
            template = ((noc.v) state).f218001b.f95701a;
        } else {
            if (!(state instanceof w)) {
                throw new NoWhenBranchMatchedException();
            }
            i = config.f217977b;
            template = ((w) state).f218002a;
        }
        int i2 = i;
        if (template == null) {
            r6.b.D("Portfolio Template is null but Allocation widget is being mapped");
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause2 = template != null ? new TextLocalisedClause(R$string.wealth_view_all, null, null, 14) : null;
        ListSubheaderDelegate.Model.a.b bVar2 = new ListSubheaderDelegate.Model.a.b(true, false, template != null, 2);
        if (template != null) {
            List listA2 = state.a();
            if (z) {
                pVar = noc.p.ACTUAL;
            } else {
                if (!(state instanceof w)) {
                    throw new NoWhenBranchMatchedException();
                }
                pVar = noc.p.TARGET;
            }
            qVar = new noc.q(template, rebalanceStatus, listA2, pVar, i2);
        } else {
            qVar = null;
        }
        return yp0.b.g(arrayListU, new ListSubheaderDelegate.Model("portfolio-allocation-header-listId", (Image) null, (Clause) textLocalisedClause, (Image) resourceImage, (Clause) textLocalisedClause2, (String) null, (ListSubheaderDelegate.Model.a) bVar2, false, false, (Object) qVar, (Parcelable) null, 0, 0, 0, 0, 64418), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 114);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 jsl.j0, still in use, count: 3, list:
          (r14v0 jsl.j0) from 0x058d: MOVE (r55v3 jsl.j0) = (r14v0 jsl.j0)
          (r14v0 jsl.j0) from 0x0564: MOVE (r55v5 jsl.j0) = (r14v0 jsl.j0)
          (r14v0 jsl.j0) from 0x0551: MOVE (r55v7 jsl.j0) = (r14v0 jsl.j0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object b(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object c(Object obj2, Object obj3, Object obj4) {
        a0 a0Var = (a0) this.f196293b;
        esk.b bVar = (esk.b) this.f196294c;
        nvk.k kVar = (nvk.k) this.d;
        List statements = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(statements, "statements");
        fsk.d dVar = a0Var.f219705b;
        uqk.f fVar = null;
        Object obj5 = null;
        if (bVar != null) {
            Iterator it8 = statements.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                uqk.f fVar2 = (uqk.f) next;
                if (fVar2.f282212c == bVar.f128995a && Intrinsics.f(fVar2.d, bVar.f128996b)) {
                    obj5 = next;
                    break;
                }
            }
            fVar = (uqk.f) obj5;
        }
        return fVar != null ? dVar.c(fVar, kVar.f219715b, kVar.e) : dVar.a();
    }

    private final Object d(Object content, Object obj2, Object obj3) {
        nzd.c cVar = (nzd.c) this.f196293b;
        String str = (String) this.f196294c;
        Set set = (Set) this.d;
        ((Boolean) obj2).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content instanceof List ? (List) content : null;
        if (list == null) {
            list = f0.f322471a;
        }
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                Locale locale = (Locale) obj4;
                List listK = zhm.v.k(locale.getDisplayName(), locale.getCountry(), locale.getDisplayCountry());
                if (!(listK instanceof Collection) || !listK.isEmpty()) {
                    Iterator it8 = listK.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            String str2 = (String) it8.next();
                            Intrinsics.h(str2);
                            if (d0.J(str2, str, true)) {
                                arrayList.add(obj4);
                                break;
                            }
                        }
                    }
                }
            }
            list = arrayList;
        }
        List<Locale> list2 = list;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (Locale locale2 : list2) {
            String languageTag = locale2.toLanguageTag();
            Intrinsics.h(languageTag);
            String displayName = locale2.getDisplayName();
            Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
            arrayList2.add(new RowDelegate.Model(languageTag, null, new TextClause(displayName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, (set.contains(languageTag) && cVar.f221023a) ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null, false, null, false, null, null, null, null, null, null, locale2, null, 0, 0, 0, 0, 532675578));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        o7e.m mVar = (o7e.m) this.f196293b;
        ZonedDateTime zonedDateTime = (ZonedDateTime) this.f196294c;
        k71.q qVar = (k71.q) this.d;
        o7e.g screenData = (o7e.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        aim.e eVarB = zhm.u.b();
        eVarB.add(new z("ACTIONS_HOLDER", zhm.u.c(new ActionsView.Item("ACTION_MANAGE", null, false, null, null, new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_bills_actions_manage, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), null, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 76));
        ArrayList<qua.p> arrayList = screenData.f222773a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (qua.p pVar : arrayList) {
            arrayList2.add(a9e.a.b(mVar.f222785a, pVar, qua.u.h(pVar, zonedDateTime), true, qVar));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        zhm.a0.x(arrayList2, eVarB);
        return new o7e.i(!screenData.f222773a.isEmpty() ? new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.bill_accounts_bills_header_subtitle, zhm.u.c(new MoneyClause(screenData.f222774b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null, zhm.u.a(eVarB));
    }

    private final Object g(Object models, Object obj2, Object obj3) {
        ob0.b bVar = (ob0.b) this.f196293b;
        String str = (String) this.f196294c;
        Set set = (Set) this.d;
        ((Boolean) obj2).getClass();
        Intrinsics.checkNotNullParameter(models, "models");
        List listL = bVar.l(str, bVar.i(str, (List) models));
        ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList.add(bVar.o(it8.next(), (String) zhm.d0.c0(set)));
        }
        return arrayList;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        oce.h hVar = (oce.h) this.f196293b;
        k71.q qVar = (k71.q) this.d;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return hVar.b((List) pair.f186385a, (List) pair.f186386b, this.f196294c, qVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 jsl.j0, still in use, count: 2, list:
          (r15v0 jsl.j0) from 0x02c7: MOVE (r44v3 jsl.j0) = (r15v0 jsl.j0)
          (r15v0 jsl.j0) from 0x02a1: MOVE (r44v5 jsl.j0) = (r15v0 jsl.j0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object i(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        n0 n0Var = (n0) this.f196293b;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.d;
        x0 x0Var = (x0) this.f196294c;
        List assets = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(assets, "assets");
        FixedTabsDelegate.Model model2 = new FixedTabsDelegate.Model("TABS_LIST_ID", zhm.v.k(new FixedTabs.Item("top_movers.tab_top_gainers", new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topGainers, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("top_movers.tab_top_losers", new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topLosers, null, null, 14), (AnalyticsContext) null, 12)), n0Var == n0.LOSERS ? "top_movers.tab_top_losers" : "top_movers.tab_top_gainers", null, null, 0, R$attr.uikit_dp8, 0, 0, 440);
        List listV0 = zhm.d0.V0(assets, 8);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        int i = 0;
        for (Object obj5 : listV0) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            vel.f fVar = (vel.f) obj5;
            arrayList.add(j1h.b.b(x0Var.f230620b, fVar, new j1h.a(fVar), a0.d.n("TOP_MOVERS_GRID_LIST_ID", i), null, 8));
            i = i2;
        }
        Float fValueOf = Float.valueOf(16.0f);
        int i3 = R$attr.uikit_dp16;
        return yp0.b.g(zhm.v.k(model2, new xk("TOP_MOVERS_GRID_LIST_ID", arrayList, 4, null, fValueOf, 0, 0, i3, i3, 63976)), model, null, R$attr.uikit_dp12, R$attr.uikit_dp24, 114);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        Iterable iterableA;
        zr6.c cVar;
        dj0.d dVar;
        yfa.c cVar2;
        zr6.h hVar;
        p4c.a0 a0Var = (p4c.a0) this.f196293b;
        d3c.x xVar = (d3c.x) this.f196294c;
        wi0.b bVar = (wi0.b) this.d;
        List pricingRules = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pricingRules, "acquiringCpPricing");
        dj0.d dVar2 = new dj0.d(0L, xVar.f.f115083b);
        aim.e eVarB = zhm.u.b();
        eVarB.add(new CellDetailsDelegate.Model("FEE_MONTHLY_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_common_section_transparent_fees_cell_monthly_fee_title, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        mpj.a aVar = a0Var.f232877c;
        Intrinsics.checkNotNullParameter(pricingRules, "pricingRules");
        if (bVar == null) {
            iterableA = f0.f322471a;
        } else {
            ft6.s sVar = aVar.f207825b;
            zr6.e eVar = zr6.e.CUSTOMER_PRESENT;
            List<RevolutShopPricingRule> list = pricingRules;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (RevolutShopPricingRule revolutShopPricingRule : list) {
                Intrinsics.checkNotNullParameter(revolutShopPricingRule, "<this>");
                PricingRule pricingRule = revolutShopPricingRule.f84203a;
                Conditions conditions = pricingRule.f80960a;
                Boolean bool = conditions.f80950b;
                if (bool == null || (cVar2 = conditions.f80949a) == null) {
                    cVar = null;
                } else {
                    int i = lpj.a.f199144b[cVar2.ordinal()];
                    if (i == 1) {
                        hVar = zr6.h.DOMESTIC;
                    } else if (i == 2) {
                        hVar = zr6.h.REGIONAL;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("Missing settlement service");
                        }
                        hVar = zr6.h.INTERNATIONAL;
                    }
                    cVar = new zr6.c(bool, hVar, null);
                }
                Fee fee2 = pricingRule.f80961b;
                if (fee2 instanceof Fee.MoneyFee) {
                    dVar = ((Fee.MoneyFee) fee2).f80957a;
                } else if (fee2 instanceof Fee.Combined) {
                    dVar = ((Fee.Combined) fee2).f80954a;
                } else {
                    if (!(fee2 instanceof Fee.Percent) && !(fee2 instanceof Fee.Free) && !(fee2 instanceof Fee.Cashback) && !(fee2 instanceof Fee.Undefined)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = null;
                }
                RevolutShopPricingRuleMappingPayload revolutShopPricingRuleMappingPayload = revolutShopPricingRule.f84204b;
                ft6.s sVar2 = sVar;
                arrayList.add(new zr6.g(cVar, new zr6.d(revolutShopPricingRuleMappingPayload != null ? revolutShopPricingRuleMappingPayload.f84205a : 0.0d, dVar)));
                sVar = sVar2;
            }
            as6.b bVarA = sVar.a(new zr6.f(eVar, arrayList), bVar);
            iterableA = bVarA == null ? f0.f322471a : aVar.f207824a.a(bVarA.f8797a, zhm.w.u(bVarA.f8798b));
        }
        zhm.a0.x(iterableA, eVarB);
        eVarB.add(new LargeActionButtonDelegate.Model("FEE_VIEW_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.revolut_shop.api.R$string.revolut_shop_flow_home_screen_product_common_section_transparent_fees_footer_title, null, null, 14), false, null, null, null, null, 1000));
        return zhm.u.a(eVarB);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        String str = (String) this.f196293b;
        pjh.k kVar = (pjh.k) this.f196294c;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.d;
        CombinedBuyingPowerConverted converted = (CombinedBuyingPowerConverted) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(converted, "converted");
        if (converted.f95658a == null) {
            dj0.d dVar = converted.d;
            kVar.getClass();
            return pjh.k.c(dVar, str, tradingLegalEntityInformation);
        }
        return new RowDelegate.Model(j6.a.q("PRODUCT_WIDGET_ITEM_COMBINED_BUYING_POWER_BALANCE_ID_", str), new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 16.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 60), new TextLocalisedClause(R$string.trading_cash_balance_buying_power_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.trading_cash_balance_pockets_title, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(converted.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(converted.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, 124), false, null, false, null, null, null, null, null, null, new pjh.b(TradingAccountType.Gia.f105270a, str), null, 0, 0, 0, 0, 532675544);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object m(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 2627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f196293b;
        o7j.j jVar = (o7j.j) this.f196294c;
        List list = (List) this.d;
        BigDecimal currentRate = (BigDecimal) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        return new o7j.t(new CompositeClause(zhm.v.k(com.revolut.core.ui_kit.models.b.c(jVar.f222865c, jVar.d, currentRate, new RateClause.Format.ExchangeRate(true), null, o9.NON_SENSITIVE), new TextLocalisedClause(com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_common_capital_at_risk, null, null, 14)), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), textLocalisedClause, list);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        t0 t0Var = (t0) this.f196293b;
        qua.p pVar = (qua.p) this.f196294c;
        k71.q qVar = (k71.q) this.d;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return t0Var.b((List) pair.f186385a, (List) pair.f186386b, pVar, qVar);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        r88.f fVar = (r88.f) this.f196293b;
        String id10 = (String) this.f196294c;
        HomeFeedWidgetContext.Junior junior = (HomeFeedWidgetContext.Junior) this.d;
        r88.j widgetData = (r88.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(widgetData, "content");
        r88.c cVar = fVar.d;
        String juniorId = junior.getJuniorId();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        if (!(widgetData instanceof r88.g)) {
            if (widgetData instanceof r88.i) {
                r88.i iVar = (r88.i) widgetData;
                return new PaymentLinkWidgetDelegate.Model(id10, new s2(new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_qr_code_action_tap_to_allow, null, null, 14)), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_subtitle_allow, zhm.u.c(iVar.f252387b), null, 12), new r2(new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_action_terms_and_conditions, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) iVar.f252388c, "QR_WIDGET_LINK_CLICK_ID", false), 10), null), iVar, 64);
            }
            if (widgetData instanceof r88.h) {
                return new PaymentLinkWidgetDelegate.Model(id10, new s2(new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_qr_code_action_main_parent_must_allow, null, null, 14)), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_subtitle_allow, zhm.u.c(((r88.h) widgetData).f252385a), null, 12), null, null, 96);
            }
            throw new NoWhenBranchMatchedException();
        }
        r88.g gVar = (r88.g) widgetData;
        String str = gVar.d;
        String str2 = gVar.f252384c;
        i80.a aVarL = fkg.a.l(cVar.f252378a, str, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36);
        QrCodeImage qrCodeImage = new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarL, 36), new QrCodeAppearance.Layer.Image(new ContactImage(juniorId, (String) null, (String) null, (String) null, (String) null, str2, (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), true)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), QrCodeImageDrawable.Shimmering.INSTANCE, (ImageTransformations) null, 24);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_subtitle_share, zhm.u.c(gVar.f252383b), null, 12);
        int i = R$drawable.uikit_icn_16_copy;
        Float fValueOf = Float.valueOf(16.0f);
        List listK = zhm.v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_payment_junior_action_copy, zhm.u.c(d0.e0(gVar.d, "https://")), null, 12));
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new PaymentLinkWidgetDelegate.Model(id10, qrCodeImage, textLocalisedClause, textLocalisedClause2, new r2(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(12, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (Object) gVar.d, "QR_WIDGET_LINK_CLICK_ID", false), null, 8), null), gVar);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        rd3.j jVar = (rd3.j) this.f196293b;
        od3.l lVar = (od3.l) this.f196294c;
        Clause clause = (Clause) this.d;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        if (zBooleanValue) {
            return jVar.j(lVar, clause);
        }
        Object objF = iii.c.f(hx7.i.m(lVar).f, new rbj.g(21), new rbh.j(24), new qk2.h(19));
        return new od3.m(clause, (Clause) objF, rd3.j.i(true, lVar), new CdnImage("plan_cashback_background", "mobile/premium/cashback", null, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, Constants.TAG_F4), (ResourceImage) iii.c.f(hx7.i.m(lVar).f224318h, new rbj.g(22), new rbh.j(25), new qk2.h(20)));
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        m2 m2Var;
        BackgroundSelectionDelegate.Model model;
        int i;
        bn2.t tVar = (bn2.t) this.f196293b;
        rm2.h hVar = (rm2.h) this.f196294c;
        em2.b bVar = (em2.b) this.d;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        UiAssetLockState uiAssetLockState = tVar.f17042b;
        boolean z = uiAssetLockState instanceof UiAssetLockState.Locked;
        if (z) {
            UiAssetLockReason uiAssetLockReason = ((UiAssetLockState.Locked) uiAssetLockState).f63806a;
            if (uiAssetLockReason instanceof UiAssetLockReason.Challenge) {
                i = R$drawable.uikit_icn_24_lock_closed;
            } else {
                if (!(uiAssetLockReason instanceof UiAssetLockReason.Plan)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_premium;
            }
            m2Var = new m2(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        } else {
            m2Var = null;
        }
        UiAssetLockReason uiAssetLockReason2 = z ? ((UiAssetLockState.Locked) uiAssetLockState).f63806a : null;
        List<em2.e> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (em2.e eVar : list) {
            if (eVar instanceof em2.d) {
                em2.d dVar = (em2.d) eVar;
                String str = dVar.f127577a;
                int[] iArr = rm2.w.f255202a;
                model = new BackgroundSelectionDelegate.Model(str, new UrlImage(iArr[bVar.ordinal()] == 1 ? dVar.f127578b : dVar.d, iArr[bVar.ordinal()] == 1 ? dVar.f127579c : dVar.e, (UrlImageDrawable) new UrlImageDrawable.ResDrawable(R$drawable.uikit_icn_rect_background, Integer.valueOf(R$attr.uikit_colorShimmer)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, ez0.h.CenterCrop, (Image) null, false, dVar.f, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 521976), Intrinsics.f(str, hVar.f255187b), o2.GRID, oc.c.p(eVar), dVar.f127580g ? ip0.r2.f166084a : null, m2Var, uiAssetLockReason2 == null ? str : uiAssetLockReason2, 5008);
            } else if (eVar instanceof em2.f) {
                em2.f fVar = (em2.f) eVar;
                String str2 = fVar.f127583a;
                model = new BackgroundSelectionDelegate.Model(str2, new UrlImage(fVar.d, fVar.e, (UrlImageDrawable) new UrlImageDrawable.ResDrawable(R$drawable.uikit_icn_rect_background, Integer.valueOf(R$attr.uikit_colorShimmer)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, ez0.h.CenterCrop, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524024), Intrinsics.f(str2, hVar.f255187b), o2.GRID, oc.c.p(eVar), null, m2Var, uiAssetLockReason2 == null ? str2 : uiAssetLockReason2, 5056);
            } else if (eVar instanceof em2.c) {
                em2.c cVar = (em2.c) eVar;
                String str3 = cVar.f127574a;
                model = new BackgroundSelectionDelegate.Model(str3, cVar.f127576c, Intrinsics.f(str3, hVar.f255187b), o2.GRID, oc.c.p(eVar), null, m2Var, uiAssetLockReason2 == null ? cVar.f127574a : uiAssetLockReason2, 5056);
            } else {
                if (!(eVar instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new BackgroundSelectionDelegate.Model("empty", new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGroupedBackground), null), "empty".equals(hVar.f255187b), o2.GRID, oc.c.p(eVar), null, m2Var, uiAssetLockReason2 == null ? "empty" : uiAssetLockReason2, 4816);
            }
            arrayList.add(model);
        }
        return arrayList;
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        List listG;
        List listC;
        RandomAccess randomAccessG;
        int year;
        int dayOfYear;
        rx6.u uVar = (rx6.u) this.f196293b;
        rx6.m mVar = (rx6.m) this.f196294c;
        rx6.m mVar2 = (rx6.m) this.d;
        rx6.n content = (rx6.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        x17.f fVar = uVar.f258056a;
        jr6.n nVar = uVar.f258058c;
        ArrayList arrayList = content.f258048a;
        FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter = mVar.f258045b;
        String str = mVar.d;
        List listA = fVar.a(arrayList, freelancerSalesFilters$CompoundFreelancerSalesFilter, str);
        List listA2 = fVar.a(content.f258049b, mVar.f258045b, str);
        List listC2 = zhm.u.c(uVar.f258057b.a(mVar2.f258045b));
        if (((List) ue0.e.M(listA)) != null) {
            List list = listA;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((tx6.e) nVar).b((FreelancerInvoice) it8.next()));
            }
            listG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("LIST_ID_ITEM_DRAFTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_invoice_drafts_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, 0, 0, 0, 61434), null, 0, 0, 126);
        } else {
            listG = null;
        }
        if (listG == null) {
            listG = f0.f322471a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : listA2) {
            FreelancerInvoice freelancerInvoice = (FreelancerInvoice) obj5;
            if (freelancerInvoice.c()) {
                year = freelancerInvoice.j().getYear();
                dayOfYear = freelancerInvoice.j().getDayOfYear();
            } else {
                year = freelancerInvoice.J().f73412a.getYear();
                dayOfYear = freelancerInvoice.J().f73412a.getDayOfYear();
            }
            String strI = a0.d.i(year, "_", dayOfYear);
            Object objO = linkedHashMap.get(strI);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, strI);
            }
            ((List) objO).add(obj5);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it9 = linkedHashMap.entrySet().iterator();
        while (it9.hasNext()) {
            List list2 = (List) ((Map.Entry) it9.next()).getValue();
            FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) zhm.d0.d0(list2);
            if (freelancerInvoice2 != null) {
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((tx6.e) nVar).b((FreelancerInvoice) it10.next()));
                }
                String strQ = j6.a.q("LIST_ID_ITEM_GROUP_TITLE_", freelancerInvoice2.f73374a);
                DateTime dateTime = freelancerInvoice2.f;
                if (dateTime == null) {
                    dateTime = freelancerInvoice2.J().f73412a;
                }
                randomAccessG = yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(strQ, (Image) null, (Clause) new TimeClause(dateTime.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, 0, 0, 0, 61434), null, 0, 0, 126);
            } else {
                randomAccessG = null;
            }
            if (randomAccessG == null) {
                randomAccessG = f0.f322471a;
            }
            arrayList3.add(randomAccessG);
        }
        ArrayList arrayListU = zhm.w.u(arrayList3);
        ArrayList arrayList5 = new ArrayList();
        zhm.a0.x(listC2, arrayList5);
        zhm.a0.x(listG, arrayList5);
        zhm.a0.x(arrayListU, arrayList5);
        if (listG.isEmpty() && arrayListU.isEmpty()) {
            if (mVar.f258047g) {
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_NO_RESULTS_FOUND", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_action_clear_filters, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 1888);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                listC = zhm.u.c(model);
            } else {
                List listC3 = zhm.u.c(new FullScreenStateDelegate.Model("LIST_ID_EMPTY_STATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_invoices_placeholder_no_content_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_invoices_placeholder_no_content_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752));
                yp0.b.k(listC3, 0, 0, 0, 0, 31);
                listC = listC3;
            }
            zhm.a0.x(listC, arrayList5);
        }
        return arrayList5;
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        List listK;
        s65.s sVar = (s65.s) this.f196293b;
        s65.f fVar = (s65.f) this.f196294c;
        wi0.b bVar = (wi0.b) this.d;
        od0.i newRepaymentSchedule = (od0.i) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
        n65.c cVarA = sVar.f260150a.a(fVar.f260135a.f70146c, fVar.f260136b, bVar, zBooleanValue);
        if (newRepaymentSchedule.d()) {
            LoanRepaymentDayChangeTerms loanRepaymentDayChangeTerms = (LoanRepaymentDayChangeTerms) newRepaymentSchedule.c();
            LocalDate localDate = loanRepaymentDayChangeTerms.f70077b;
            dj0.d dVar = fVar.f260135a.f70148h;
            long jBetween = ChronoUnit.DAYS.between(((l80.f) sVar.f260151b).e(), localDate);
            aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_schedule_next_repayment_date, null, null, 14), (Image) null, 0, false, 30);
            long jF = oc.c.F(localDate);
            TimeClause.Format.INSTANCE.getClass();
            TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("new-repayment-day-next-repayment", t0Var, new TimeClause(jF, dateMedium, null, null, 12), new TextLocalisedQuantityClause(R$plurals.loan_management_change_payday_summary_due_in, Long.valueOf(jBetween), zhm.u.c(Long.valueOf(jBetween)), (Style) null, 24), null, null, null, 0, null, false, false, null, null, 32752);
            aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_change_payday_summary_next_repayment_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20);
            dj0.d dVar2 = loanRepaymentDayChangeTerms.f70078c;
            listK = zhm.v.k(model, new CellDetailsDelegate.Model("NEW_REPAYMENT_AMOUNT_ID", t0Var2, sx4.f.b(3, null, null, dVar2), null, new LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel(new CompositeClause(zhm.v.k(sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, dVar), sx4.g.e(1), sx4.f.b(3, null, null, dVar2)), null, null, null, 14)), null, u0.SMALL, 0, null, false, false, null, null, 32440), new CellDetailsDelegate.Model("new-repayment-day-final-repayment", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_schedule_final_repayment_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oc.c.F(loanRepaymentDayChangeTerms.e), dateMedium, null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        } else {
            listK = f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        eVarB.add(cVarA.f212710c);
        eVarB.addAll(listK);
        n14.e.b(eVarB, cVarA.d);
        Unit unit = Unit.f186387a;
        return new s65.m(new s65.i(cVarA.f212708a, cVarA.f212709b), zBooleanValue, !zBooleanValue, zhm.u.a(eVarB));
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        boolean z;
        int iIntValue;
        Integer num;
        Clause textLocalisedClause;
        s6d.w wVar = (s6d.w) this.f196293b;
        s6d.j jVar = (s6d.j) this.f196294c;
        Integer num2 = (Integer) this.d;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((k6d.h) obj2, "<unused var>");
        aim.e eVarB = zhm.u.b();
        ks0.n nVar = wVar.f260259b;
        aim.e eVarB2 = zhm.u.b();
        ImageTransformations imageTransformations = new ImageTransformations(null, SquareTransformation.f60074a, null, gz0.b.CenterCrop, 12, null, null, 101);
        eVarB2.add(new ListSubheaderDelegate.Model("ASSETS_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_assets_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_logo_cell_title, null, null, 14);
        String strF = jVar.f();
        k6d.j jVar2 = jVar.d;
        List listC = strF != null ? zhm.u.c(new cw0.i("LOGO_ID", new UrlImage(strF, null, null, null, 0L, null, null, null, null, null, false, imageTransformations, null, null, false, false, 507902), new g.c(cw0.h.EDITABLE), null, 24)) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        List list = listC;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        boolean z3 = true;
        if (jVar.f() == null) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        int i = R$attr.uikit_dp12;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_dp16);
        if (jVar.f() != null) {
            numValueOf = null;
        }
        CellDetailsAttachmentDelegate.Model model = new CellDetailsAttachmentDelegate.Model("LOGO_ID", textLocalisedClause2, list, resourceImage, z3, i, i, numValueOf != null ? numValueOf.intValue() : R$attr.uikit_dp0, 5088);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_cover_image_cell_title, null, null, 14);
        String strC = jVar.c();
        List listC2 = strC != null ? zhm.u.c(new cw0.i("BACKGROUND_ID", new UrlImage(strC, null, null, null, 0L, null, null, null, null, null, false, imageTransformations, null, null, false, false, 507902), new g.c(cw0.h.EDITABLE), null, 24)) : null;
        if (listC2 == null) {
            listC2 = f0.f322471a;
        }
        List list2 = listC2;
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        boolean z4 = jVar.c() == null;
        int i2 = R$attr.uikit_dp12;
        Integer numValueOf2 = Integer.valueOf(R$attr.uikit_dp16);
        if (jVar.c() != null) {
            numValueOf2 = null;
        }
        List listK = zhm.v.k(model, new CellDetailsAttachmentDelegate.Model("BACKGROUND_ID", textLocalisedClause3, list2, resourceImage2, z4, i2, i2, numValueOf2 != null ? numValueOf2.intValue() : R$attr.uikit_dp0, 5088));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB2.addAll(listK);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_assets_section_footer, zhm.u.c(new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_assets_section_footer_clickable, null, new Click(30, (Integer) null, (Object) null, "ASSETS_FOOTER_CLICK_ID", false), 10)), null, 12);
        ak0 ak0Var = new ak0(null, null, 3);
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp24;
        eVarB2.add(new TextDelegate.Model("ASSETS_FOOTER_ID", textLocalisedClause4, false, ak0Var, null, null, i3, i3, i5, i5, 116));
        eVarB.addAll(zhm.u.a(eVarB2));
        Float fValueOf = Float.valueOf(20.0f);
        LinkedHashMap linkedHashMap = wVar.f260260c;
        aim.e eVarB3 = zhm.u.b();
        eVarB3.add(new ListSubheaderDelegate.Model("THEME_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_theme_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_color_cell_title, null, null, 14);
        boolean z6 = jVar.f260241b;
        if (z6) {
            iIntValue = com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_colors_custom;
        } else {
            Integer num3 = (Integer) linkedHashMap.get(jVar.e());
            iIntValue = (num3 == null || (num = (Integer) wVar.d.get(Integer.valueOf(num3.intValue()))) == null) ? com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_colors_default : num.intValue();
        }
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("COLOR_TITLE_ID", (Image) null, (Clause) textLocalisedClause5, (Image) null, (Clause) new TextLocalisedClause(iIntValue, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514);
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            boolean z11 = !z6 && Intrinsics.f(str, jVar.e());
            String strQ = j6.a.q("COLOR_ITEM_ID", str);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            arrayList.add(new IconSelectorDelegate.SelectableIconModel(strQ, LayeredImage.Companion.b(companion, R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorTransparent), iIntValue2, BitmapDescriptorFactory.HUE_RED, null, null, 48), z11, null, null, false, z11 ? LayeredImage.Companion.f(companion, R$drawable.uikit_icn_24_check, R$attr.uikit_colorAccent, R$attr.uikit_colorWidgetBackground, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, SyslogConstants.LOG_CLOCK) : null, R$attr.uikit_colorGrey20, false, str, null, 2872));
        }
        qv0.i[] elements = {model2, new IconSelectorDelegate.Model("COLOR_PICKER_ID", zhm.d0.F0(new IconSelectorDelegate.SelectableIconModel("COLOR_CUSTOM_ITEM_ID", new CdnImage("icon", "mobile/component/color_picker/color_wheel", null, null, null, null, Constants.TAG_FC_SPEED_MODE), jVar.f260241b, null, null, false, null, R$attr.uikit_colorGrey20, false, null, null, 3960), arrayList), hp.f164586b, null, null, 56), z6 ? new m7(new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_hex_code_cell_title, null, null, 14), jVar.e(), num2 != null ? new ImageClause(R$drawable.uikit_icn_24_stop, new ImageClauseTint.Color(new Color.SolidInt(num2.intValue())), fValueOf, fValueOf, 16) : null, R$attr.uikit_dp8) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB3.addAll(listL);
        eVarB.addAll(zhm.u.a(eVarB3));
        aim.e eVarB4 = zhm.u.b();
        String str2 = jVar2 != null ? jVar2.f181696b : null;
        boolean z12 = str2 == null || str2.length() == 0;
        String str3 = jVar2 != null ? jVar2.f181695a : null;
        boolean z29 = str3 == null || str3.length() == 0;
        if (!z12 || !z29) {
            eVarB4.add(new ListSubheaderDelegate.Model("ACCOUNT_DETAILS_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_updated_account_details_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_updated_website_url_cell_title, null, null, 14);
            String url2 = jVar2 != null ? jVar2.f181696b : null;
            if (url2 != null) {
                nVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(url2, "url");
                String scheme = ((f80.b) ((f80.a) nVar.f189085b)).f(url2).getScheme();
                if (scheme == null) {
                    scheme = "https";
                }
                String strConcat = scheme.concat("://");
                textLocalisedClause = new TextClause((String) new Pair(strConcat, kotlin.text.a0.F(url2, strConcat, "", false)).f186386b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_website_cell_subtitle, null, null, 14);
            }
            RowDelegate.Model model3 = new RowDelegate.Model("WEBSITE_ID", null, textLocalisedClause6, null, 0, textLocalisedClause, null, null, 0, new vf(jVar.h(), true), false, null, false, null, null, null, null, null, null, Boolean.valueOf(jVar.h()), null, 0, 0, 0, 0, 532675546);
            if (z12) {
                model3 = null;
            }
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.shared.branding.impl.R$string.merchant_profile_branding_updated_email_address_cell_title, null, null, 14);
            String str4 = jVar2 != null ? jVar2.f181695a : null;
            RowDelegate.Model model4 = new RowDelegate.Model("EMAIL_ID", null, textLocalisedClause7, null, 0, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, new vf(jVar.g(), true), false, null, false, null, null, null, null, null, null, Boolean.valueOf(jVar.g()), null, 0, 0, 0, 0, 532675546);
            if (z29) {
                model4 = null;
            }
            RowDelegate.Model[] elements2 = {model3, model4};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            eVarB4.addAll(listL2);
        }
        eVarB.addAll(zhm.u.a(eVarB4));
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v144, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r13v29 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 3818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.p.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p(Object obj2, int i, Object obj3, Object obj4) {
        this.f196292a = i;
        this.f196293b = obj2;
        this.f196294c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ p(mp6.a aVar, Set set, CharSequence charSequence, sr srVar) {
        this.f196292a = 3;
        this.f196293b = set;
        this.f196294c = charSequence;
        this.d = srVar;
    }

    public /* synthetic */ p(n0 n0Var, ListSubheaderDelegate.Model model, x0 x0Var) {
        this.f196292a = 15;
        this.f196293b = n0Var;
        this.d = model;
        this.f196294c = x0Var;
    }
}
