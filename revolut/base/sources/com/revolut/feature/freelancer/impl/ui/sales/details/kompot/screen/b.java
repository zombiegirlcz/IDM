package com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import dj0.d;
import java.time.LocalDateTime;
import java.util.List;
import jr6.t;
import jr6.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lr6.r;
import o17.x;
import q17.e;
import q17.f;
import q17.g;
import q17.i;
import q17.j;
import q17.k;
import q17.m;
import q17.q;
import r17.c;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f74130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f74131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerSaleDetailsScreenContract$InputData f74132c;
    public final m d;
    public final t e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f74133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f74134h;

    public b(f actionItemMapper, g cardBannerItemMapper, i descriptionItemMapper, j equivalentItemMapper, FreelancerSaleDetailsScreenContract$InputData inputData, k lineItemItemMapper, m relatedSaleItemMapper, q17.n reportIssueItemMapper, t saleItemMapper, u saleStateMapper, q statusItemMapper, c timelineEventsItemMapper) {
        Intrinsics.checkNotNullParameter(actionItemMapper, "actionItemMapper");
        Intrinsics.checkNotNullParameter(cardBannerItemMapper, "cardBannerItemMapper");
        Intrinsics.checkNotNullParameter(descriptionItemMapper, "descriptionItemMapper");
        Intrinsics.checkNotNullParameter(equivalentItemMapper, "equivalentItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lineItemItemMapper, "lineItemItemMapper");
        Intrinsics.checkNotNullParameter(relatedSaleItemMapper, "relatedSaleItemMapper");
        Intrinsics.checkNotNullParameter(reportIssueItemMapper, "reportIssueItemMapper");
        Intrinsics.checkNotNullParameter(saleItemMapper, "saleItemMapper");
        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
        Intrinsics.checkNotNullParameter(statusItemMapper, "statusItemMapper");
        Intrinsics.checkNotNullParameter(timelineEventsItemMapper, "timelineEventsItemMapper");
        this.f74130a = actionItemMapper;
        this.f74131b = descriptionItemMapper;
        this.f74132c = inputData;
        this.d = relatedSaleItemMapper;
        this.e = saleItemMapper;
        this.f = saleStateMapper;
        this.f74133g = statusItemMapper;
        this.f74134h = timelineEventsItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        FreelancerOrder order;
        MoneyClause moneyClause;
        List list;
        List listL;
        ActionsView.Item item;
        ActionsView.Item item2;
        ActionsView.Item item3;
        LocalDateTime localDateTimeA;
        o17.k domainState = (o17.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        o17.j jVar2 = (o17.j) domainState.f221325b.getContent();
        if (jVar2 == null || (order = jVar2.f221323c) == null) {
            FreelancerSaleDetailsScreenContract$InputData freelancerSaleDetailsScreenContract$InputData = this.f74132c;
            FreelancerSaleDetailsScreenContract$InputData.SaleDetails saleDetails = freelancerSaleDetailsScreenContract$InputData instanceof FreelancerSaleDetailsScreenContract$InputData.SaleDetails ? (FreelancerSaleDetailsScreenContract$InputData.SaleDetails) freelancerSaleDetailsScreenContract$InputData : null;
            order = saleDetails != null ? saleDetails.f74118a : null;
        }
        t tVar = this.e;
        Clause clauseC = order != null ? ((k17.c) tVar).c(order) : null;
        if (order != null) {
            d dVar = order.f73294j;
            MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
            k17.d dVar2 = (k17.d) this.f;
            Integer numValueOf = Integer.valueOf(dVar2.b(order) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50);
            Intrinsics.checkNotNullParameter(order, "order");
            moneyClause = new MoneyClause(dVar, defaults, new Custom(numValueOf, dVar2.c(order) || dVar2.a(order) || order.f73290b == r.FAILED, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
        } else {
            moneyClause = null;
        }
        TimeClause timeClause = (order == null || (localDateTimeA = order.a()) == null) ? null : new TimeClause(oi0.d.R(localDateTimeA), new TimeClause.Format.Pretty(0), null, null, 12);
        LayeredImage layeredImageB = order != null ? ((k17.c) tVar).b(order) : null;
        o17.i iVar = (o17.i) domainState.f221324a.getContent();
        if (iVar != null) {
            boolean z = iVar.f221318a;
            boolean z3 = iVar.f221319b;
            String str = iVar.f221320c;
            wr6.a refundAvailability = iVar.d;
            FreelancerOrder order2 = iVar.e;
            u uVar = this.f74130a.f241397a;
            Intrinsics.checkNotNullParameter(refundAvailability, "refundAvailability");
            Intrinsics.checkNotNullParameter(order2, "order");
            lr6.k kVar = order2.d;
            switch (kVar == null ? -1 : e.f241396a[kVar.ordinal()]) {
                case -1:
                    listL = f0.f322471a;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    ActionsView.Item itemD = f.d(refundAvailability, order2);
                    ActionsView.Item itemB = f.b(z, order2);
                    if (((k17.d) uVar).d(order2)) {
                        item = new ActionsView.Item("LIST_ID_ACTION_VIEW_QR", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.freelancer_sale_details_action_view_qr_code, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new q17.b(order2), null, 24476);
                    } else {
                        item = null;
                    }
                    ActionsView.Item[] elements = {itemD, itemB, item, f.a(z3, order2)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    listL = kotlin.collections.d.L(elements);
                    break;
                case 2:
                    ActionsView.Item itemD2 = f.d(refundAvailability, order2);
                    ActionsView.Item itemB2 = f.b(z, order2);
                    k17.d dVar3 = (k17.d) uVar;
                    if (dVar3.d(order2)) {
                        item2 = new ActionsView.Item("LIST_ID_ACTION_SHARE_LINK", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.freelancer_common_action_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new q17.b(order2), null, 24476);
                    } else {
                        item2 = null;
                    }
                    if (dVar3.c(order2) || dVar3.a(order2)) {
                        item3 = new ActionsView.Item("LIST_ID_ACTION_CREATE_NEW_LINK", null, false, null, null, new TextLocalisedClause(R$string.freelancer_sale_details_action_new_link, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new q17.b(order2), null, 24478);
                    } else {
                        item3 = null;
                    }
                    ActionsView.Item[] elements2 = {itemD2, itemB2, item2, item3};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    listL = kotlin.collections.d.L(elements2);
                    break;
                case 3:
                    ActionsView.Item[] elements3 = {f.c(str), f.d(refundAvailability, order2), f.a(z3, order2)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    listL = kotlin.collections.d.L(elements3);
                    break;
                case 4:
                    ActionsView.Item[] elements4 = {f.c(str), f.d(refundAvailability, order2), f.a(z3, order2)};
                    Intrinsics.checkNotNullParameter(elements4, "elements");
                    listL = kotlin.collections.d.L(elements4);
                    break;
                case 5:
                    listL = v.l(f.d(refundAvailability, order2));
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    listL = v.l(f.d(refundAvailability, order2));
                    break;
                case 10:
                    listL = v.l(f.c(str));
                    break;
            }
            list = listL;
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new o17.o(new o17.n(clauseC, moneyClause, timeClause, layeredImageB, list), (List) iii.c.f(domainState.f221325b, new x(0), new nz7.g(10), new nrd.i(this, 9)));
    }
}
