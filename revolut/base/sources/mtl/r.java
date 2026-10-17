package mtl;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import ip0.gu;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import te0.w;
import z0h.f1;
import z0h.i0;
import z0h.q1;
import z0h.s;
import z0h.t1;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements cli.n {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrdersListFeatureContract$InputData f208936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final htl.f f208937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final otl.a f208938c;
    public final gte.a d;
    public final ks0.n e;

    public r(InvestOrdersListFeatureContract$InputData inputData, htl.f investOrdersCommonMapper, otl.a footerMapper, gte.a featureToggleInteractor, ks0.n investOrdersParamsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersCommonMapper, "investOrdersCommonMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investOrdersParamsProvider, "investOrdersParamsProvider");
        this.f208936a = inputData;
        this.f208937b = investOrdersCommonMapper;
        this.f208938c = footerMapper;
        this.d = featureToggleInteractor;
        this.e = investOrdersParamsProvider;
    }

    public final List a() {
        FullScreenStateDelegate.Model model;
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = this.f208936a;
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders) {
            model = new FullScreenStateDelegate.Model("list_id_orders_list_empty", new TextLocalisedClause(R$string.wealth_trading_orders_list_empty_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_orders_list_empty_subtitle, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_bar_chart_search, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 52, 52, 23), (Clause) null, 190)), null, null, false, null, null, false, 0, 0, 32752);
        } else {
            if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            model = new FullScreenStateDelegate.Model("list_id_orders_list_empty", new TextLocalisedClause(R$string.wealth_trading_invest_plans_list_empty_title, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_repayment, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 52, 52, 23), (Clause) null, 190)), null, null, false, null, null, false, 0, 0, 32756);
        }
        return u.c(model);
    }

    public final List b() {
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = this.f208936a;
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders) {
            return ((jte.d) this.d).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c) ? yp0.b.h(iii.c.c(5), new gu("list_id_loading_items_header", 0, 0, 30), null, 0, 126) : iii.c.c(5);
        }
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders) {
            return iii.c.c(5);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        List listB;
        char c2;
        List listL;
        List listC2;
        char c3;
        i0 i0Var;
        TradingLegalEntityInformation tradingLegalEntityInformation;
        char c5;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData = this.f208936a;
        int i = 1;
        hel.b bVar = null;
        if (investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.PendingOrders) {
            listC = f0.f322471a;
        } else {
            if (!(investOrdersListFeatureContract$InputData instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders)) {
                throw new NoWhenBranchMatchedException();
            }
            Lazy lazyY0 = w.y0(new mq4.b(24));
            InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton plusActionNavBarButton = ((InvestOrdersListFeatureContract$InputData.RecurringOrders) investOrdersListFeatureContract$InputData).f91758b.f91759a;
            if (Intrinsics.f(plusActionNavBarButton, InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.OpenRecurringBuys.f91761a)) {
                listC = u.c((PlusActionNavBarMenuItem) lazyY0.getValue());
            } else if (plusActionNavBarButton instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartSecurityOrder) {
                Data data = domainState.e;
                listC = data != null ? (List) iii.c.f(data, new msb.c(13), new mqg.a(20), new f88.a(lazyY0, i)) : null;
                if (listC == null) {
                    listC = f0.f322471a;
                }
            } else {
                if (!(plusActionNavBarButton instanceof InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartCommodityOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = u.c((PlusActionNavBarMenuItem) lazyY0.getValue());
            }
        }
        Data data2 = domainState.d;
        if (data2 == null || (listB = (List) iii.c.f(data2, new mqi.a(this, 9), new mqg.a(21), new mgh.i(this, 7))) == null) {
            listB = b();
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        otl.a aVar = this.f208938c;
        if (((jte.d) aVar.d).c(FeatureWealthApi$Toggles.WealthOrdersAndTransactionsRemoteDisclaimers.f95171c)) {
            d1h.g gVar = domainState.f;
            listC2 = gVar != null ? ((gah.g) aVar.f229749c).c(gVar, d7.DISCLAIMER) : null;
            if (listC2 == null) {
                listC2 = f0.f322471a;
            }
            c5 = 1;
        } else {
            InvestOrdersListFeatureContract$InputData investOrdersListFeatureContract$InputData2 = aVar.f229747a;
            Data data3 = domainState.f208911a;
            hel.b bVar2 = (data3 == null || (tradingLegalEntityInformation = (TradingLegalEntityInformation) data3.getContent()) == null) ? null : tradingLegalEntityInformation.f105106a;
            Data data4 = domainState.f208912b;
            t1 t1Var = data4 != null ? (t1) data4.getContent() : null;
            Data data5 = domainState.f208913c;
            z0h.c cVar = data5 != null ? (z0h.c) data5.getContent() : null;
            if (t1Var != null) {
                Links links = t1Var.f318563a;
                if (investOrdersListFeatureContract$InputData2.getDisplayOptions().getF91760b().getF91747a()) {
                    c3 = 1;
                    i0Var = new i0(links, t1Var.f318564b);
                } else {
                    c3 = 1;
                    i0Var = null;
                }
                s sVar = investOrdersListFeatureContract$InputData2.getDisplayOptions().getF91760b().getF91748b() ? new s(links) : null;
                f1[] elements = new f1[2];
                elements[0] = i0Var;
                elements[c3 == true ? 1 : 0] = sVar;
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
                c2 = c3;
            } else {
                c2 = 1;
                listL = null;
            }
            List listL2 = v.l((cVar == null || !investOrdersListFeatureContract$InputData2.getDisplayOptions().getF91760b().getF91749c()) ? null : new z0h.l(cVar.f318484a));
            List[] elements2 = new List[2];
            elements2[0] = listL;
            elements2[c2 == true ? 1 : 0] = listL2;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements2));
            q1 q1Var = aVar.f229748b;
            if (bVar2 != null) {
                bVar = bVar2;
            } else if (t1Var != null) {
                bVar = t1Var.f318564b;
            }
            listC2 = ((aah.m) q1Var).c(arrayListU, bVar);
            c5 = c2;
        }
        List[] listArr = new List[2];
        listArr[0] = listB;
        listArr[c5] = listC2;
        return new e(zhm.w.u(v.k(listArr)), listC);
    }

    public final ArrayList d(List list, InvestOrdersParams investOrdersParams) {
        List<InvestOrderExtended> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (InvestOrderExtended investOrderExtended : list2) {
            arrayList.add(((htl.k) this.f208937b).a(investOrderExtended, true, new htl.e(investOrderExtended, investOrdersParams, false)));
        }
        return arrayList;
    }
}
