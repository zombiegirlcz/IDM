package y66;

import android.os.Parcelable;
import aw0.e0;
import aw0.o9;
import aw0.y4;
import ch.qos.logback.classic.Level;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.r6;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.topup.methods.TopUpMethodBanner$Type;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmount;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanRepaymentInfo;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreenContract$PluginType;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.Enrollment;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$WalletConnection;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$WalletConnectionSection;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Badge;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Description;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Tooltip;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.cards.model.Card;
import com.youTransactor.uCube.rpc.Constants;
import ggk.a1;
import ggk.b1;
import ggk.f1;
import ggk.g1;
import ggk.y0;
import ggk.z0;
import grl.b4;
import h93.h0;
import hjd.z;
import ima.a;
import ip0.ae0;
import ip0.go0;
import ip0.gu;
import ip0.gv;
import ip0.jl0;
import ip0.jv;
import ip0.kv;
import ip0.l1;
import ip0.nb0;
import ip0.pb0;
import ip0.po0;
import ip0.y1;
import ip0.zj;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import mid.v0;
import ms0.e4;
import ms0.h4;
import mx0.c7;
import mx0.f3;
import mx0.h3;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import y7d.t;
import yed.r0;
import ymk.b0;
import yna.h1;
import yuc.x;
import z0f.i0;
import zgj.l0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f311205c;

    public /* synthetic */ q(Object obj2, Object obj3, int i) {
        this.f311203a = i;
        this.f311204b = obj2;
        this.f311205c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        ?? arrayList;
        int i;
        int i2;
        Clause clause;
        CompositeClause compositeClause;
        CompositeClause compositeClause2;
        yid.s sVar = (yid.s) this.f311204b;
        yid.i iVar = (yid.i) this.f311205c;
        mid.n content = (mid.n) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = iVar.f314309b;
        int i3 = yid.r.f314315a[sVar.f314317a.d.ordinal()];
        int i5 = 1;
        if (i3 == 1) {
            ArrayList<List> arrayListS = d0.S(content.d, 2);
            int i6 = 10;
            ArrayList arrayList2 = new ArrayList(w.t(arrayListS, 10));
            for (List list : arrayListS) {
                String string = list.toString();
                List<mid.d0> list2 = list;
                ArrayList arrayList3 = new ArrayList(w.t(list2, i6));
                for (mid.d0 d0Var : list2) {
                    String str = d0Var.e;
                    v0 v0Var = d0Var.f205692b;
                    mid.h hVar = new mid.h(Integer.valueOf(d0Var.f205696j), str, v0Var.b(), d0Var.getF());
                    String str2 = d0Var.f205691a;
                    zi ziVar = new zi(new UrlImage(d0Var.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), go0.PROGRESSIVE_BLUR);
                    UrlImage urlImage = new UrlImage(d0Var.d, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152705a, null, null, false, false, 507902);
                    TagViewData tagViewDataA = z.a(d0Var.i, z);
                    po0 po0Var = tagViewDataA != null ? new po0(tagViewDataA) : null;
                    TextClause textClause = new TextClause(d0Var.f205693c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = d0Var.f205695h;
                    TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    w0 w0VarB = zid.a.b(hVar);
                    ShopsContext shopsContextA = v0Var.a();
                    VoucherSmallTileDelegate.Model model = new VoucherSmallTileDelegate.Model(str2, ziVar, textClause, null, null, textClause2, urlImage, null, null, po0Var, null, false, null, new AnalyticsContext(w0VarB), shopsContextA != null ? new mid.k(shopsContextA, hVar) : null, 127768);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(model);
                }
                if (zBooleanValue) {
                    int size = 2 - list.size();
                    arrayList = new ArrayList(size);
                    for (int i21 = 0; i21 < size; i21++) {
                        arrayList.add(yid.s.a());
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                arrayList2.add(new hg(string, d0.E0((Iterable) arrayList, arrayList3), 2, new y4(hjd.d.f152707c), null, new gg.b(false, 3), false, false, null, null, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 26576));
                i6 = 10;
            }
            return arrayList2;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List list3 = content.d;
        ArrayList<mid.d0> arrayList4 = new ArrayList();
        ArrayList<mid.d0> arrayList5 = new ArrayList();
        for (Object obj5 : list3) {
            if (((mid.d0) obj5).f205692b.a() instanceof ShopsAuction) {
                arrayList4.add(obj5);
            } else {
                arrayList5.add(obj5);
            }
        }
        aim.e eVarB = u.b();
        if (arrayList4.isEmpty()) {
            i = 1;
        } else {
            eVarB.add(new ListSubheaderDelegate.Model("SHOPS_CARROUSEL_DETAILS_LIST_ID_TITLE_BID", (Image) null, (Clause) new TextLocalisedClause(R$string.shops_screens_my_items_list_sections_live_bids_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            ArrayList arrayList6 = new ArrayList(w.t(arrayList4, 10));
            for (mid.d0 d0Var2 : arrayList4) {
                String str4 = d0Var2.e;
                v0 v0Var2 = d0Var2.f205692b;
                int i22 = i5;
                mid.h hVar2 = new mid.h(Integer.valueOf(d0Var2.f205696j), str4, v0Var2.b(), d0Var2.getF());
                ShopsContext shopsContextA2 = v0Var2.a();
                if (shopsContextA2 instanceof ShopsAuction) {
                    ShopsAuction shopsAuction = (ShopsAuction) shopsContextA2;
                    ShopsAuction.Offer offer = shopsAuction.f87010a;
                    ShopsAuction.Bid bid2 = shopsAuction.f87011b;
                    if (bid2 != null) {
                        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorPerformancePositive);
                        shd.c cVar = bid2.f87014b;
                        if (cVar != shd.c.WINNING && cVar != shd.c.WON) {
                            numValueOf = null;
                        }
                        TextLocalisedQuantityClause textLocalisedQuantityClauseP = nub.a.p(offer.f87017c, new Custom(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), null, 6);
                        TimeClause timeClauseA = gid.b.a(offer.f87016b, ((l80.f) sVar.f314318b).b());
                        Clause[] clauseArr = new Clause[2];
                        clauseArr[0] = textLocalisedQuantityClauseP;
                        clauseArr[i22] = timeClauseA;
                        List listK = v.k(clauseArr);
                        m70.a.a(t0.f186434a);
                        compositeClause2 = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    } else {
                        compositeClause2 = null;
                    }
                    compositeClause = compositeClause2;
                } else {
                    compositeClause = null;
                }
                mid.k kVar = shopsContextA2 != null ? new mid.k(shopsContextA2, hVar2) : null;
                arrayList6.add(new RowDelegate.Model(j6.a.q("SHOPS_CARROUSEL_DETAILS_LIST_ID_ITEM_", d0Var2.f205691a), new RowDelegate.Model.MainImage.Image40(new UrlImage(d0Var2.e, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152706b, null, null, false, false, 507902), null, null, false, null, false, 60), new TextClause(d0Var2.f205693c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, compositeClause, null, null, 0, new pf(new TextLocalisedClause(R$string.shops_home_my_items_item_auction_action, null, null, 14), null, null, false, kVar, null, 478), false, null, false, null, null, null, null, null, null, kVar, null, 0, 0, 0, 0, 532675544));
                i5 = i22;
            }
            i = i5;
            yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList6);
            if (!arrayList5.isEmpty()) {
                eVarB.add(new ListSubheaderDelegate.Model("SHOPS_CARROUSEL_DETAILS_LIST_ID_TITLE_PURCHASE", (Image) null, (Clause) new TextLocalisedClause(R$string.shops_screens_my_items_list_sections_purchases_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            }
        }
        ArrayList arrayList7 = new ArrayList(w.t(arrayList5, 10));
        for (mid.d0 d0Var3 : arrayList5) {
            String str5 = d0Var3.e;
            v0 v0Var3 = d0Var3.f205692b;
            mid.h hVar3 = new mid.h(Integer.valueOf(d0Var3.f205696j), str5, v0Var3.b(), d0Var3.getF());
            ShopsContext shopsContextA3 = v0Var3.a();
            ShopsPurchase shopsPurchase = shopsContextA3 instanceof ShopsPurchase ? (ShopsPurchase) shopsContextA3 : null;
            String strQ = j6.a.q("SHOPS_CARROUSEL_DETAILS_LIST_ID_ITEM_", d0Var3.f205691a);
            TextClause textClause3 = new TextClause(d0Var3.f205693c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(d0Var3.e, null, null, null, 0L, null, null, null, null, null, false, hjd.d.f152706b, null, null, false, false, 507902), null, null, false, null, false, 60);
            if (shopsPurchase != null) {
                Clause timeClause = new TimeClause(shopsPurchase.f.toInstant().toEpochMilli(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                int i32 = yid.r.f314316b[shopsPurchase.f87066b.ordinal()];
                i2 = i;
                if (i32 != i2) {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List listK2 = v.k(new TextLocalisedClause(R$string.shops_home_my_items_item_purchased_auction_bid_won, null, new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254), 10), timeClause);
                    m70.a.a(t0.f186434a);
                    timeClause = new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                clause = timeClause;
            } else {
                i2 = i;
                clause = null;
            }
            ShopsContext shopsContextA4 = v0Var3.a();
            arrayList7.add(new RowDelegate.Model(strQ, image40, textClause3, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, shopsContextA4 != null ? new mid.k(shopsContextA4, hVar3) : null, null, 0, 0, 0, 0, 532676568));
            i = i2;
        }
        yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList7);
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        PlanPageLayoutTerms planPageLayoutTerms;
        List listC;
        List list;
        b0 b0Var;
        aim.e eVar;
        int iA;
        aim.e eVarA;
        int iMin;
        List listL;
        ae0 ae0Var;
        Collection collectionL;
        Clause clause;
        Media urlImage;
        kv kvVar;
        Iterator it8;
        PlanPageLayoutTerms planPageLayoutTerms2;
        ResourceImage resourceImageA;
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip;
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip2;
        b0 b0Var2 = (b0) this.f311204b;
        ymk.l lVar = (ymk.l) this.f311205c;
        g1 layout = (g1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        boolean z = lVar.f315036c;
        int i = lVar.d;
        aim.e eVarB = u.b();
        y0 header = layout.d;
        PlanPageLayoutTerms planPageLayoutTerms3 = layout.f143724l;
        b1 b1Var = layout.f143721g;
        if ((header != null ? header.e : null) != null) {
            dnk.l iconMapper = b0Var2.f315027b.f116360a;
            int i2 = 0;
            Intrinsics.checkNotNullParameter(header, "header");
            PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = header.f143803c;
            PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description = header.d;
            PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction = (plansDashboardLayout$PlanPageLayout$Subtitle == null || (plansDashboardLayout$PlanPageLayout$Tooltip2 = plansDashboardLayout$PlanPageLayout$Subtitle.f102787c) == null) ? null : plansDashboardLayout$PlanPageLayout$Tooltip2.f102791b;
            PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction2 = (plansDashboardLayout$PlanPageLayout$Description == null || (plansDashboardLayout$PlanPageLayout$Tooltip = plansDashboardLayout$PlanPageLayout$Description.f102775b) == null) ? null : plansDashboardLayout$PlanPageLayout$Tooltip.f102791b;
            PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction3 = plansDashboardLayout$ClickAction == null ? plansDashboardLayout$ClickAction2 : plansDashboardLayout$ClickAction;
            TextClause textClause = new TextClause(header.f143801a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            Clause clauseB = dnk.n.b(header.f143803c, iconMapper);
            if (plansDashboardLayout$PlanPageLayout$Description != null) {
                Float fValueOf = Float.valueOf(16.0f);
                Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
                PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip3 = plansDashboardLayout$PlanPageLayout$Description.f102775b;
                ImageClause imageClause = plansDashboardLayout$PlanPageLayout$Tooltip3 != null ? new ImageClause(iconMapper.a(plansDashboardLayout$PlanPageLayout$Tooltip3.f102790a), new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16) : null;
                Clause textClause2 = new TextClause(plansDashboardLayout$PlanPageLayout$Description.f102774a, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122);
                if (imageClause != null) {
                    textClause2 = new CompositeClause(v.k(textClause2, new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), imageClause), null, null, null, 14);
                }
                clause = textClause2;
            } else {
                clause = null;
            }
            PlanPageLayoutAsset planPageLayoutAsset = header.e;
            if (planPageLayoutAsset == null) {
                throw new IllegalStateException("Unable build plan header: asset is null");
            }
            int i3 = dnk.f.f116359a[planPageLayoutAsset.f102709b.ordinal()];
            if (i3 == 1) {
                urlImage = new UrlImage(planPageLayoutAsset.f102708a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    urlImage = new UrlVideo(planPageLayoutAsset.f102708a, (String) null, false, oz0.b.CENTER_CROP, false, oz0.c.ENABLED, 50);
                } else {
                    ColorImage.INSTANCE.getClass();
                    urlImage = ColorImage.Companion.a();
                }
            }
            List list2 = header.f143802b;
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge = (PlansDashboardLayout$PlanPageLayout$Badge) it9.next();
                    String str = plansDashboardLayout$PlanPageLayout$Badge.f102745a;
                    ResourceImage resourceImageC = str != null ? iconMapper.c(str) : null;
                    if (resourceImageC != null) {
                        it8 = it9;
                        planPageLayoutTerms2 = planPageLayoutTerms3;
                        resourceImageA = ResourceImage.a(resourceImageC, i2, Integer.valueOf(R$attr.uikit_colorForeground), null, Constants.TAG_BLE_FIRMWARE_VERSION);
                    } else {
                        it8 = it9;
                        planPageLayoutTerms2 = planPageLayoutTerms3;
                        resourceImageA = null;
                    }
                    arrayList.add(new TagViewData(resourceImageA, new TextClause(plansDashboardLayout$PlanPageLayout$Badge.f102746b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new Color.Solid(R$attr.uikit_colorForeground_10), R$attr.uikit_colorTransparent, null, 1000));
                    it9 = it8;
                    planPageLayoutTerms3 = planPageLayoutTerms2;
                    i2 = 0;
                }
                planPageLayoutTerms = planPageLayoutTerms3;
                kvVar = new kv(arrayList);
            } else {
                planPageLayoutTerms = planPageLayoutTerms3;
                kvVar = null;
            }
            listC = u.c(new u8("plan_header", textClause, clauseB, clause, urlImage, kvVar, null, gv.NONE, null, jv.EMPHASISED, plansDashboardLayout$ClickAction3 != null, plansDashboardLayout$ClickAction != null, plansDashboardLayout$ClickAction2 != null, plansDashboardLayout$ClickAction3, 49984));
        } else {
            planPageLayoutTerms = planPageLayoutTerms3;
            listC = f0.f322471a;
        }
        dnk.k kVar = b0Var2.f315028c;
        dnk.i iVar = kVar.f116363b;
        String str2 = "compact_highlighted_benefit_";
        if (b0Var2.f315026a.f103606g) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(layout, "layout");
            List listV0 = d0.V0(b1Var.f143704b, b1Var.f143705c != null ? 3 : 4);
            ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
            int i5 = 0;
            for (Object obj5 : listV0) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                z0 z0Var = (z0) obj5;
                arrayList2.add(kVar.f(a0.d.n("compact_highlighted_benefit_", i5), z0Var.f143807a, z0Var.f143808b));
                i5 = i6;
            }
            f1 f1Var = b1Var.f143705c;
            if (f1Var != null) {
                qv0.i[] elements = {kVar.f(a0.d.n("compact_highlighted_benefit_", arrayList2.size()), f1Var.f143715a, f1Var.f143716b), dnk.k.b(f1Var, e0.DP_24, R$attr.uikit_dp40, R$attr.uikit_dp0)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            } else {
                listL = null;
            }
            if (listL == null) {
                listL = f0.f322471a;
            }
            PlansDashboardLayout$Button plansDashboardLayout$Button = b1Var.e;
            LabelButtonDelegate.Model modelC = plansDashboardLayout$Button != null ? kVar.c(plansDashboardLayout$Button, "compact_highlighted_benefit") : null;
            aim.e eVarB2 = u.b();
            eVarB2.addAll(arrayList2);
            eVarB2.addAll(listL);
            if (modelC != null) {
                eVarB2.add(modelC);
            }
            aim.e eVarA2 = u.a(eVarB2);
            boolean zIsEmpty = eVarA2.isEmpty();
            z0 z0Var2 = b1Var.f143703a;
            if (z0Var2 == null) {
                collectionL = f0.f322471a;
            } else {
                CellDetailsStandaloneNoteDelegate.Model modelF = kVar.f("compact_highlighted_benefit_spotlight", z0Var2.f143807a, z0Var2.f143808b);
                if (zIsEmpty) {
                    ae0Var = null;
                } else {
                    ae0 ae0Var2 = new ae0(null, "compact_highlighted_benefit_separator");
                    int i21 = R$attr.uikit_dp16;
                    ae0Var2.f163431j = i21;
                    ae0Var2.k = i21;
                    ae0Var2.i = R$attr.uikit_dp4;
                    ae0Var = ae0Var2;
                }
                qv0.i[] elements2 = {modelF, ae0Var};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                collectionL = kotlin.collections.d.L(elements2);
            }
            aim.e eVarB3 = u.b();
            eVarB3.addAll(collectionL);
            eVarB3.addAll(eVarA2);
            eVarA = u.a(eVarB3);
            int i22 = R$attr.uikit_dp12;
            qv0.i iVar2 = (qv0.i) d0.o0(eVarA);
            if (iVar2 != null) {
                iVar2.o(i22);
            }
            b0Var = b0Var2;
            eVar = eVarB;
        } else {
            a1 a1Var = b1Var.d;
            ArrayList arrayList3 = b1Var.f143704b;
            PlansDashboardLayout$Button plansDashboardLayout$Button2 = b1Var.e;
            f1 f1Var2 = b1Var.f143705c;
            if (a1Var == a1.COMPACT) {
                dnk.l lVar2 = kVar.f116362a;
                Intrinsics.checkNotNullParameter(layout, "layout");
                Intrinsics.checkNotNullParameter(layout, "layout");
                if (i <= 0) {
                    int i32 = planPageLayoutTerms != null ? 2 : 4;
                    if (f1Var2 == null) {
                        i32 += 2;
                    }
                    if (plansDashboardLayout$Button2 == null) {
                        i32 += 2;
                    }
                    iMin = Math.min(i32, 6);
                } else {
                    float fZ = (kli.a.z(i, iVar.f116361a.f22265a) - 180) - (planPageLayoutTerms != null ? 200 : 160);
                    if (f1Var2 != null) {
                        fZ -= 93;
                    }
                    if (plansDashboardLayout$Button2 != null) {
                        fZ -= 52;
                    }
                    iMin = Math.min(Math.max(rim.d.c(fZ / 45), 2), 6);
                }
                List listV02 = d0.V0(arrayList3, iMin);
                ArrayList<jl0> arrayList4 = new ArrayList(w.t(listV02, 10));
                Iterator it10 = listV02.iterator();
                int i33 = 0;
                while (it10.hasNext()) {
                    Object next = it10.next();
                    int i43 = i33 + 1;
                    if (i33 < 0) {
                        v.s();
                        throw null;
                    }
                    z0 z0Var3 = (z0) next;
                    arrayList4.add(new jl0(a0.d.n("compact_highlighted_benefit_", i33), ResourceImage.a(lVar2.c(z0Var3.f143808b), 0, Integer.valueOf(R$attr.uikit_colorForeground), null, Constants.TAG_BLE_FIRMWARE_VERSION), new TextClause(z0Var3.f143807a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122)));
                    it10 = it10;
                    i33 = i43;
                    b0Var2 = b0Var2;
                    eVarB = eVarB;
                    listC = listC;
                }
                list = listC;
                b0Var = b0Var2;
                eVar = eVarB;
                ToDoItemDelegate.INSTANCE.getClass();
                ToDoItemDelegate.Companion.a(arrayList4);
                for (jl0 jl0Var : arrayList4) {
                    jl0Var.f = R$attr.uikit_dp0;
                    jl0Var.f164873g = R$attr.uikit_dp4;
                }
                List listL2 = v.l(f1Var2);
                int size = arrayList4.size();
                List list4 = listL2;
                ArrayList<jl0> arrayList5 = new ArrayList(w.t(list4, 10));
                Iterator it11 = list4.iterator();
                int i59 = 0;
                while (it11.hasNext()) {
                    Object next2 = it11.next();
                    int i66 = i59 + 1;
                    if (i59 < 0) {
                        v.s();
                        throw null;
                    }
                    f1 f1Var3 = (f1) next2;
                    arrayList5.add(new jl0(a0.d.n(str2, i59 + size), ResourceImage.a(lVar2.c(f1Var3.f143716b), 0, Integer.valueOf(R$attr.uikit_colorForeground), null, Constants.TAG_BLE_FIRMWARE_VERSION), new TextClause(f1Var3.f143715a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122)));
                    str2 = str2;
                    i59 = i66;
                    size = size;
                    it11 = it11;
                    lVar2 = lVar2;
                }
                ToDoItemDelegate.INSTANCE.getClass();
                ToDoItemDelegate.Companion.a(arrayList5);
                for (jl0 jl0Var2 : arrayList5) {
                    jl0Var2.f = R$attr.uikit_dp0;
                    jl0Var2.f164873g = R$attr.uikit_dp4;
                }
                y1 y1VarB = f1Var2 != null ? dnk.k.b(f1Var2, e0.DP_32, R$attr.uikit_dp16, R$attr.uikit_dp8) : null;
                LabelButtonDelegate.Model modelC2 = plansDashboardLayout$Button2 != null ? kVar.c(plansDashboardLayout$Button2, "compact_highlighted_benefit") : null;
                aim.e eVarB4 = u.b();
                eVarB4.addAll(arrayList4);
                eVarB4.addAll(arrayList5);
                if (y1VarB != null) {
                    eVarB4.add(y1VarB);
                }
                if (modelC2 != null) {
                    eVarB4.add(modelC2);
                }
                eVarA = u.a(eVarB4);
            } else {
                list = listC;
                b0Var = b0Var2;
                eVar = eVarB;
                Intrinsics.checkNotNullParameter(layout, "layout");
                Intrinsics.checkNotNullParameter(layout, "layout");
                if (i <= 0) {
                    iA = dnk.i.a(layout, (planPageLayoutTerms != null ? 3 : 4) * 90);
                } else {
                    float fZ2 = (kli.a.z(i, iVar.f116361a.f22265a) - 180) - (planPageLayoutTerms != null ? 200 : 160);
                    if (plansDashboardLayout$Button2 != null) {
                        fZ2 -= 52;
                    }
                    iA = dnk.i.a(layout, fZ2);
                }
                if (f1Var2 != null) {
                    iA--;
                }
                ArrayList arrayListE = kVar.e(d0.V0(arrayList3, iA));
                RowDelegate.Model modelD = f1Var2 != null ? kVar.d(f1Var2, arrayListE.size()) : null;
                LabelButtonDelegate.Model modelC3 = plansDashboardLayout$Button2 != null ? kVar.c(plansDashboardLayout$Button2, "highlighted_benefit") : null;
                aim.e eVarB5 = u.b();
                eVarB5.addAll(arrayListE);
                if (modelD != null) {
                    eVarB5.add(modelD);
                }
                if (modelC3 != null) {
                    eVarB5.add(modelC3);
                }
                eVarA = u.a(eVarB5);
            }
            listC = list;
        }
        List listO = i2b.a.o(listC, eVarA);
        yp0.b.k(listO, 0, 0, 0, 0, 31);
        aim.e eVar2 = eVar;
        eVar2.addAll(listO);
        b0 b0Var3 = b0Var;
        eVar2.addAll(b0Var3.d.a(layout.f143722h));
        eVar2.addAll(b0Var3.e.a(layout.i));
        return u.a(eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    private final Object d(Object obj2, Object obj3, Object obj4) {
        h93.f0 f0Var;
        RowDelegate.Model model;
        List list;
        List listC;
        int i;
        String str;
        Clause compositeClause;
        String str2;
        Object obj5;
        Object kVar;
        x xVar = (x) this.f311204b;
        yuc.i iVar = (yuc.i) this.f311205c;
        List connections = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(connections, "connections");
        Boolean bool = iVar.e;
        boolean z = iVar.f316980c;
        boolean z3 = iVar.d;
        int i2 = 1;
        boolean z4 = bool != null || z3 || z;
        ?? r102 = 0;
        if (ue0.e.n(connections) && !z4) {
            List listC2 = u.c(new FullScreenStateDelegate.Model("EMPTY_LINKED_WALLETS_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_empty_caption, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return listC2;
        }
        List<LinkedWalletsScreenContract$WalletConnectionSection> list2 = connections;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (LinkedWalletsScreenContract$WalletConnectionSection linkedWalletsScreenContract$WalletConnectionSection : list2) {
            qtc.f fVar = linkedWalletsScreenContract$WalletConnectionSection.f85615a;
            String strName = fVar.name();
            int[] iArr = yuc.w.f317000a;
            GlyphImage glyphImage = new GlyphImage(iArr[fVar.ordinal()] == i2 ? R$drawable.uikit_icn_24_click2pay : R$drawable.uikit_icn_24_wallet, r102, r102, 6);
            switch (iArr[fVar.ordinal()]) {
                case 1:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_click_to_pay;
                    break;
                case 2:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_android_pay;
                    break;
                case 3:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_apple_pay;
                    break;
                case 4:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_fitbit_pay;
                    break;
                case 5:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_garmin_pay;
                    break;
                case 6:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_samsung_pay;
                    break;
                default:
                    i = com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_unknown;
                    break;
            }
            RowDelegate.Model model2 = new RowDelegate.Model(strName, glyphImage, null, null, new TextLocalisedClause(i, r102, r102, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708);
            ArrayList<LinkedWalletsScreenContract$WalletConnection> arrayList2 = linkedWalletsScreenContract$WalletConnectionSection.f85616b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (LinkedWalletsScreenContract$WalletConnection linkedWalletsScreenContract$WalletConnection : arrayList2) {
                DigitizedCard digitizedCard = linkedWalletsScreenContract$WalletConnection.f85613b;
                h93.f0 f0Var2 = linkedWalletsScreenContract$WalletConnection.f85612a;
                Enrollment enrollment = linkedWalletsScreenContract$WalletConnection.f85614c;
                if (digitizedCard == null || (str = digitizedCard.f85395a) == null) {
                    str = enrollment != null ? enrollment.f85408a : f0Var2.f150110a;
                }
                String str3 = str;
                RowDelegate.Model.MainImage.Image40 image40B = xVar.f317001a.b(f0Var2);
                x xVar2 = xVar;
                CompositeClause compositeClauseJ = v04.b.J(f0Var2, f0Var2.f150111b, null, null, 14);
                if (enrollment != null) {
                    compositeClause = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_addingCard, null, null, 14);
                } else {
                    String str4 = f0Var2.f150115j;
                    TextClause textClause = str4 != null ? new TextClause("··".concat(str4), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String strC = h0.c(f0Var2);
                    TextClause[] elements = {textClause, strC != null ? new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    CompositeClause compositeClause2 = !listL.isEmpty() ? new CompositeClause(listL, com.revolut.core.ui_kit.models.b.a(), null, null, 12) : null;
                    DigitizedCard digitizedCard2 = linkedWalletsScreenContract$WalletConnection.f85613b;
                    Object[] elements2 = {compositeClause2, (digitizedCard2 == null || (str2 = digitizedCard2.f85398g) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    List listL2 = kotlin.collections.d.L(elements2);
                    compositeClause = !listL2.isEmpty() ? new CompositeClause(listL2, new DotDividerClause((Integer) null), null, null, 12) : null;
                }
                RowDelegate.Model.b bVar = digitizedCard != null ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
                if (digitizedCard != null) {
                    kVar = new vuc.e(f0Var2, digitizedCard);
                } else if (enrollment != null) {
                    kVar = new vuc.k(f0Var2, enrollment);
                } else {
                    obj5 = null;
                    arrayList3.add(new RowDelegate.Model(str3, image40B, compositeClauseJ, null, 0, compositeClause, null, null, 0, null, false, null, false, bVar, null, null, null, null, null, obj5, null, 0, 0, 0, 0, 532660184));
                    xVar = xVar2;
                }
                obj5 = kVar;
                arrayList3.add(new RowDelegate.Model(str3, image40B, compositeClauseJ, null, 0, compositeClause, null, null, 0, null, false, null, false, bVar, null, null, null, null, null, obj5, null, 0, 0, 0, 0, 532660184));
                xVar = xVar2;
            }
            aim.e eVarE = i26.l.e(model2, arrayList3);
            yp0.b.k(eVarE, 0, 0, 0, 0, 31);
            arrayList.add(eVarE);
            i2 = 1;
            r102 = 0;
        }
        ArrayList arrayListU = w.u(arrayList);
        h93.f0 f0Var3 = iVar.f316978a;
        if (f0Var3 == null) {
            list = f0.f322471a;
        } else {
            if (z) {
                f0Var = f0Var3;
                model = new RowDelegate.Model("ADD_TO_CLICK_TO_PAY", new GlyphImage(R$drawable.uikit_icn_24_click2pay, null, null, 6), null, null, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_click_to_pay, null, null, 14), null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_add, null, null, 14), null, null, false, f0Var3, null, 478), false, false, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 1056958444);
            } else {
                f0Var = f0Var3;
                model = null;
            }
            RowDelegate.Model[] elements3 = {model, z3 ? new RowDelegate.Model("ADD_TO_GOOGLE_PAY", new GlyphImage(R$drawable.uikit_icn_24_wallet, null, null, 6), null, null, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_linked_wallets_android_pay, null, null, 14), null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_add, null, null, 14), null, null, false, f0Var, null, 478), false, false, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 1056958444) : null};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            List listL3 = kotlin.collections.d.L(elements3);
            yp0.b.k(listL3, 0, 0, 0, 0, 31);
            list = listL3;
        }
        ArrayList arrayListE0 = d0.E0(list, arrayListU);
        Boolean bool2 = iVar.e;
        if (bool2 != null) {
            listC = u.c(new RowDelegate.Model("AUTO_ENROLL", new GlyphImage(R$drawable.uikit_icn_24_card, null, null, 6), null, null, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_enrollment, null, null, 14), null, null, null, 0, new vf(bool2.booleanValue(), true), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073735660));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            listC = f0.f322471a;
        }
        return d0.E0(listC, arrayListE0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object e(java.lang.Object r132, java.lang.Object r133, java.lang.Object r134) {
        /*
            Method dump skipped, instruction units count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) throws IOException {
        com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f fVar = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f) this.f311204b;
        yv2.f fVar2 = (yv2.f) this.f311205c;
        Card card = (Card) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Data data = fVar2.f317105c;
        int i = fVar2.f317103a;
        String str = (String) data.getContent();
        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = fVar.f64430a;
        TextLocalisedQuantityClause textLocalisedQuantityClauseH = null;
        if (!(showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick)) {
            if (showCardPinWithCtaScreenContract$InputData instanceof ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately) {
                return new yv2.i(com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f.e(fVar2, card, str), (str == null || str.length() == 0) ? null : com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f.h(i), fVar.g(fVar2), fVar.f(fVar2), new TextLocalisedClause(com.revolut.feature.card.view_pin.api.R$string.card_view_pin_reminder_action, null, null, 14), !(str == null || str.length() == 0) || fVar2.f317106g, fVar2.f317106g, 32);
            }
            throw new NoWhenBranchMatchedException();
        }
        aim.e eVarE = com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f.e(fVar2, card, str);
        if (!fVar2.f && str != null && str.length() != 0) {
            textLocalisedQuantityClauseH = com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f.h(i);
        }
        ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick viewPinAfterCtaClick = (ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick) showCardPinWithCtaScreenContract$InputData;
        return new yv2.i(eVarE, textLocalisedQuantityClauseH, fVar.g(fVar2), fVar.f(fVar2), viewPinAfterCtaClick.d, viewPinAfterCtaClick.e, fVar2.f, true, fVar2.f317106g);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListG;
        yw6.i iVar = (yw6.i) this.f311204b;
        yw6.d dVar = (yw6.d) this.f311205c;
        List pluginFee = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pluginFee, "pluginFee");
        l71.d dVar2 = (l71.d) dVar.f317337b.getContent();
        aim.e eVarB = u.b();
        FreelancerPluginPreviewScreenContract$PluginType type = iVar.f317344b.f73805a;
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, FreelancerPluginPreviewScreenContract$PluginType.PrestaShop.f73806a)) {
            arrayListG = yp0.b.g(v.k(ax6.a.b(1, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_log_in, null, null, 14)), ax6.a.b(2, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_navigate, null, null, 14)), ax6.a.b(3, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_configure, null, null, 14)), ax6.a.b(4, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_settings, null, null, 14)), ax6.a.b(5, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_permission, null, null, 14)), ax6.a.b(6, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_step_authorise, null, null, 14))), new ListSubheaderDelegate.Model("LIST_ID_TUTORIAL_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_presta_shop_tutorial_how_to_install_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            if (!Intrinsics.f(type, FreelancerPluginPreviewScreenContract$PluginType.Woocommerce.f73807a)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayListG = yp0.b.g(v.k(ax6.a.b(1, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_log_in, null, null, 14)), ax6.a.b(2, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_navigate, null, null, 14)), ax6.a.b(3, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_configure, null, null, 14)), ax6.a.b(4, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_settings, null, null, 14)), ax6.a.b(5, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_permission, null, null, 14)), ax6.a.b(6, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_step_authorise, null, null, 14))), new ListSubheaderDelegate.Model("LIST_ID_TUTORIAL_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_woo_tutorial_how_to_install_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(arrayListG);
        eVarB.addAll(iVar.f317343a.a(pluginFee, dVar2));
        eVarB.add(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_terms_template, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_terms_action, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "TEXT_ID_FREELANCER_TERMS", false), 10)), null, 12), "LIST_ID_TNC"));
        return new yw6.f(u.a(eVarB), ax6.a.a(type));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        yx5.p pVar = (yx5.p) this.f311204b;
        SortingType sortingType = (SortingType) this.f311205c;
        cw5.a content = (cw5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return pVar.a(content, hn5.c.c(sortingType));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        yx5.p pVar = (yx5.p) this.f311204b;
        String str = (String) this.f311205c;
        cw5.a content = (cw5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return content.f109531a.isEmpty() ? u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.wealth_crypto_search_no_results, u.c(str), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756)) : pVar.a(content, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private final Object k(Object obj2, Object obj3, Object obj4) {
        int i;
        ?? r87;
        yy6.s sVar = (yy6.s) this.f311204b;
        yy6.l lVar = (yy6.l) this.f311205c;
        FreelancerProfileSettings profileSettings = (FreelancerProfileSettings) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(profileSettings, "profileSettings");
        aim.e eVarB = u.b();
        az6.c cVar = sVar.f317858a;
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a template = lVar.f317848c;
        boolean z = lVar.f317846a;
        Intrinsics.checkNotNullParameter(template, "template");
        boolean z3 = template.f73949b;
        String str = template.f73950c;
        InputTextDelegate.Model model = null;
        if (z3) {
            i = 14;
            r87 = 0;
        } else {
            i = 14;
            r87 = 0;
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_TEMPLATE_NAME", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_name_placeholder, null, null, 14), false, null, false, (z && kotlin.text.d0.W(str)) ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_helper_required, null, null, 14) : new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_name_footer, null, null, 14), null, null, null, null, null, false, null, null, z && kotlin.text.d0.W(str), false, false, false, null, 0, null, null, false, false, null, null, true, ehe.n.w(Constants.TAG_SUPPORTED_LOCALE_LIST), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743948, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        eVarB.addAll(v.l(model));
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(profileSettings, "profileSettings");
        aim.e eVarB2 = u.b();
        eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_DETAILS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_business_details_header_title, r87, r87, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        aim.e eVarB3 = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_business_details_bank_title, r87, r87, i);
        boolean z4 = template.f73951g;
        u9d.b bVar = template.i;
        eVarB3.add(new RowDelegate.Model("LIST_ID_BANK_ACCOUNT_DETAILS", null, textLocalisedClause, null, 0, null, null, null, 0, new vf(z4, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
        aim.e eVarB4 = u.b();
        if (profileSettings.f != null) {
            RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_VAT_NUMBER", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_vat_title, r87, r87, i), null, 0, null, null, null, 0, new vf(template.f, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
            String str2 = profileSettings.f;
            if (str2 == null) {
                str2 = "";
            }
            RowDelegate.Model model4 = new RowDelegate.Model("LIST_ID_VAT_NUMBER_EDIT", null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, true, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862714);
            yp0.b.r(model4, 0, 0, 0, 0, 15);
            a0.x(v.k(model3, model4), eVarB4);
        } else {
            eVarB4.add(new CellDetailsNoteDelegate.Model("LIST_ID_VAT_NUMBER", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_vat_title, r87, r87, i), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_vat_action, r87, r87, i), null, null, null, 0, 130804));
        }
        a0.x(u.a(eVarB4), eVarB3);
        aim.e eVarA = u.a(eVarB3);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        a0.x(eVarA, eVarB2);
        eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_LANGUAGE_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_language_header_title, r87, r87, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        InputTextDelegate.Model model5 = new InputTextDelegate.Model("LIST_ID_LANGUAGE", cVar.f11394a.a(bVar), null, null, false, null, false, null, null, had.c.a(bVar), null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, template.i, null, null, 0, 0, 0, 0, -1028, 65023);
        yp0.b.r(model5, 0, 0, 0, 0, 15);
        eVarB2.add(yp0.r.a(model5));
        String str3 = template.d;
        InputTextDelegate.Model model6 = new InputTextDelegate.Model("LIST_ID_INVOICE_NAME", new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_details_placeholder, r87, r87, i), false, null, false, (z && kotlin.text.d0.W(str3)) ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_helper_required, r87, r87, i) : r87, null, null, null, null, null, false, null, null, z && kotlin.text.d0.W(str3), false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -537002124, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
        eVarB2.add(model6);
        eVarB.addAll(u.a(eVarB2));
        eVarB.addAll(az6.c.a(template.f73952h, z));
        Intrinsics.checkNotNullParameter(template, "template");
        aim.e eVarB5 = u.b();
        eVarB5.add(new ListSubheaderDelegate.Model("LIST_ID_CUSTOM_TEXT_AND_MESSAGE_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_custom_text_header_title, r87, r87, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ListSubheaderDelegate.Model model7 = new ListSubheaderDelegate.Model("LIST_ID_HEADER_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_header_title, r87, r87, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        String str4 = template.f73953j;
        InputTextDelegate.Model model8 = new InputTextDelegate.Model("LIST_ID_HEADER", str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r87, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_header_placeholder, r87, r87, i), false, null, false, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_optional, r87, r87, i), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, ehe.n.w(Level.TRACE_INT), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610612876, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        ListSubheaderDelegate.Model model9 = new ListSubheaderDelegate.Model("LIST_ID_FOOTER_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_footer_title, r87, r87, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        String str5 = template.k;
        List listK = v.k(model7, model8, model9, new InputTextDelegate.Model("LIST_ID_FOOTER", str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r87, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_footer_placeholder, r87, r87, i), false, null, false, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_optional, r87, r87, i), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, ehe.n.w(Level.TRACE_INT), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610612876, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        a0.x(listK, eVarB5);
        eVarB.addAll(u.a(eVarB5));
        return u.a(eVarB);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        xte.a aVar;
        List list;
        List listE0;
        i0 i0Var = (i0) this.f311204b;
        z0f.q qVar = (z0f.q) this.f311205c;
        com.revolut.domain.models.topup.methods.b content = (com.revolut.domain.models.topup.methods.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TopupMethod topupMethod = qVar.f318274b;
        TopupMethod topupMethod2 = qVar.f318277h;
        String str = qVar.f318275c;
        List list2 = qVar.d;
        List list3 = qVar.e;
        boolean z = qVar.f318276g;
        boolean z3 = qVar.i;
        boolean z4 = qVar.f318278j;
        String str2 = qVar.f318279l;
        if (topupMethod == null) {
            return iii.c.c(5);
        }
        if (z4 && list2 == null) {
            return iii.c.c(5);
        }
        xte.a aVar2 = i0Var.f318264b;
        List storedMethods = content.f60525a;
        if (topupMethod instanceof TopupMethod.StoredMethod) {
            String selectedMethodId = ((TopupMethod.StoredMethod) topupMethod).getF60502a();
            Intrinsics.checkNotNullParameter(storedMethods, "storedMethods");
            Intrinsics.checkNotNullParameter(selectedMethodId, "selectedMethodId");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : storedMethods) {
                xte.a aVar3 = aVar2;
                List list4 = list2;
                if (Intrinsics.f(((TopupMethod.StoredMethod) obj5).getF60502a(), selectedMethodId)) {
                    arrayList.add(obj5);
                } else {
                    arrayList2.add(obj5);
                }
                list2 = list4;
                aVar2 = aVar3;
            }
            aVar = aVar2;
            list = list2;
            listE0 = d0.E0(arrayList2, arrayList);
        } else {
            aVar = aVar2;
            list = list2;
            listE0 = storedMethods;
        }
        aze.b bVar = (aze.b) aVar;
        ArrayList arrayListE = bVar.e(listE0, topupMethod, topupMethod2);
        int i = 1;
        int i2 = 0;
        if (storedMethods.size() > 3) {
            arrayListE = z ? d0.F0(i0.a(true), arrayListE) : d0.F0(i0.a(false), d0.V0(arrayListE, 3));
        }
        ArrayList arrayList3 = arrayListE;
        ArrayList arrayList4 = content.f60526b;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : arrayList4) {
            int i3 = i2;
            int i5 = i;
            if (((TopupMethod.OtherMethod) obj6).f60440a == TopupMethodType.ACCOUNT_SWITCH) {
                arrayList5.add(obj6);
            } else {
                arrayList6.add(obj6);
            }
            i2 = i3;
            i = i5;
        }
        int i6 = i;
        int i21 = i2;
        boolean zF = Intrinsics.f(str2, str);
        ArrayList arrayListD = bVar.d(arrayList6, topupMethod, topupMethod2, Boolean.valueOf(zF));
        ArrayList arrayListD2 = bVar.d(arrayList5, topupMethod, topupMethod2, Boolean.valueOf(zF));
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        } else {
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        }
        if (arrayListD.isEmpty()) {
            arrayListD = null;
        } else {
            yp0.b.k(arrayListD, 0, 0, 0, 0, 31);
        }
        if (arrayListD2.isEmpty()) {
            arrayListD2 = null;
        } else {
            yp0.b.k(arrayListD2, 0, 0, 0, 0, 31);
        }
        List[] elements = new List[3];
        elements[i21] = arrayList3;
        elements[i6] = arrayListD;
        elements[2] = arrayListD2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList7 = new ArrayList();
        int i22 = i21;
        for (Object obj7 : listL) {
            int i32 = i22 + 1;
            if (i22 < 0) {
                v.s();
                throw null;
            }
            List list5 = (List) obj7;
            aim.e eVarB = u.b();
            if (i22 == 0) {
                eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_select_method_screen_methods_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            }
            eVarB.addAll(list5);
            a0.x(u.a(eVarB), arrayList7);
            i22 = i32;
        }
        aim.e eVarB2 = u.b();
        h71.a aVar4 = content.f60527c;
        if (aVar4 != null && aVar4.f149833a == TopUpMethodBanner$Type.SALARY_BANNER && z3 && aVar4.d.contains(str)) {
            l1 l1Var = new l1(new AppTipUIModel("LIST_ID_PROMO_BANNER", null, new TextClause(aVar4.f149834b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(aVar4.f149835c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new aw0.s(sze.d.a(R$drawable.uikit_icn_24_lock_opened)), null, null, aVar4.f149833a, 610));
            yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(l1Var);
        }
        if (z4 && list != null && list3 != null && list3.size() > i6) {
            aim.e eVarB3 = u.b();
            eVarB3.add(new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_select_method_screen_filter_currency_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            aim.e eVarB4 = u.b();
            List<xi0.b> list6 = list;
            ArrayList arrayList8 = new ArrayList(w.t(list6, 10));
            for (xi0.b bVar2 : list6) {
                arrayList8.add(new ActionsView.Item("LIST_ID_CURRENCY_ACTION", Intrinsics.f(str, bVar2.f306286a) ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, e4.EnabledClickable, null, new TextClause(bVar2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, null, false, null, null, bVar2.f306286a, null, 23444));
            }
            eVarB4.addAll(arrayList8);
            if (list3.size() != list.size()) {
                eVarB4.add(new ActionsView.Item("LIST_ID_OTHER_ACTION", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R.string.currency_select_other, null, null, 14), null, null, null, null, false, null, null, "PAYLOAD_OTHER_ACTION", null, 24476));
            }
            Unit unit = Unit.f186387a;
            eVarB3.add(new ip0.z("LIST_ID_CURRENCY_ACTIONS", u.a(eVarB4), null, mx0.l.SCROLLABLE, 0, 0, 116));
            eVarB2.addAll(u.a(eVarB3));
        }
        eVarB2.addAll(arrayList7);
        return u.a(eVarB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0aaf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 3589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        MoneyRequest moneyRequest = (MoneyRequest) this.f311204b;
        do3.n nVar = (do3.n) this.f311205c;
        List splitBillItems = (List) obj2;
        Data requestorData = (Data) obj3;
        w0a.e itemizationData = (w0a.e) obj4;
        Intrinsics.checkNotNullParameter(splitBillItems, "splitBillItems");
        Intrinsics.checkNotNullParameter(requestorData, "requestorData");
        Intrinsics.checkNotNullParameter(itemizationData, "itemizationData");
        return zi0.c.P(new z6k.b(moneyRequest, splitBillItems, nVar, (xv9.c) requestorData.getContent(), itemizationData), false, null, 3);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object o(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r65v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Removed duplicated region for block: B:183:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r64, java.lang.Object r65, java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 2260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y66.q.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object content, Object obj2, Object obj3) {
        bw0.m mVar;
        boolean z;
        hbl.c aVar;
        ?? K;
        char c2;
        CellDetailsDelegate.Model modelF;
        CellDetailsDelegate.Model modelV;
        a9e.b bVar;
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model modelP;
        Data data;
        String str;
        dj0.d dVar;
        PaymentMethodDetails.Creditor creditor;
        Clause textClause;
        String strJ;
        TextLocalisedClause textLocalisedClause;
        int i = this.f311203a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        bw0.m mVar2 = null;
        mVar2 = null;
        Object obj4 = this.f311205c;
        Object obj5 = this.f311204b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj5;
                s sVar = (s) obj4;
                List assets = (List) content;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(assets, "assets");
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : assets) {
                    if (!linkedHashSet.contains(((q66.e) obj6).f242515a.f71671a)) {
                        arrayList.add(obj6);
                    }
                }
                aim.e eVarB = u.b();
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(sVar.d((q66.e) it8.next()));
                }
                eVarB.addAll(arrayList2);
                if (zBooleanValue && !assets.isEmpty()) {
                    eVarB.addAll(s.a(3, "defi_more_picker_loading_"));
                }
                return u.a(eVarB);
            case 1:
                y7d.l lVar = (y7d.l) obj4;
                List content2 = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                List listL = content2;
                if (((t) obj5).f311491c.a() == k7d.a.AiV2) {
                    listL = zhm.b0.L(content2);
                }
                List<String> list = listL;
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                for (String str2 : list) {
                    TextClause textClause2 = new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                    int i2 = R$attr.uikit_dp32;
                    arrayList3.add(new CellDetailsDelegate.Model(str2, textClause2, null, null, null, false, 0, null, str2, null, null, 0, null, true, new AnalyticsContext(l7d.a.a(lVar.f311472a, null, str2, null, null, null, null, null, null, 506)), 0, 0, i2, i2, 212456));
                }
                return arrayList3;
            case 2:
                ya5.e content3 = (ya5.e) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                String str3 = ((ya5.f) obj4).f311934b;
                CreditPostTerminationPlanDetails creditPostTerminationPlanDetails = content3.f311931a;
                dj0.d dVar2 = content3.f311932b;
                Intrinsics.checkNotNullParameter(creditPostTerminationPlanDetails, "<this>");
                xi0.b bVar2 = creditPostTerminationPlanDetails.f70654c.f115083b;
                dj0.d dVar3 = new dj0.d(((ya5.m) obj5).f311948a.b(str3 == null ? "" : str3, bVar2.f306286a), bVar2);
                ya5.h hVarB = ya5.m.b();
                String str4 = str3 == null ? "" : str3;
                CreditPostTerminationPlanRepaymentInfo creditPostTerminationPlanRepaymentInfo = creditPostTerminationPlanDetails.i;
                dj0.d dVar4 = creditPostTerminationPlanRepaymentInfo.f70657a;
                dj0.d dVar5 = creditPostTerminationPlanRepaymentInfo.f70658b;
                dj0.d dVar6 = (dj0.d) cim.c.l(dVar5, dVar2);
                xi0.b currency = dVar2.f115083b;
                f3 f3Var = new f3(new CurrencyImage(currency.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_common_main, null, null, 14), sx4.f.b(3, null, null, dVar2), false, dVar3.f(dVar2) ? h3.ERROR : h3.ACTIVE_NOT_CLICKABLE, false);
                List listK = v.k(new bw0.d(4, sx4.f.b(3, null, null, dVar4), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.post_termination_plan_repayment_suggestion_minimum, u.c(sx4.f.b(3, null, null, dVar4)), null, 12)), new bw0.d(4, sx4.f.b(3, null, null, dVar6), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.post_termination_plan_repayment_suggestion_maximum, u.c(sx4.f.b(3, null, null, dVar6)), null, 12)));
                Intrinsics.checkNotNullParameter(currency, "currency");
                bw0.h hVar = new bw0.h(str4, cp5.d.J(currency), (TextClause) null, true, (List) null, Boolean.TRUE, listK, false, false, false, false, bw0.e.SuggestionsElseCalculator, (Clause) null, false, 30612);
                if (str4.length() != 0) {
                    if (dVar3.f(dVar5)) {
                        mVar = new bw0.m(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.post_termination_plan_repayment_over_maximum, u.c(sx4.f.b(3, null, null, dVar5)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
                    } else if (dVar3.i(dVar4)) {
                        mVar = new bw0.m(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.post_termination_plan_repayment_below_minimum, u.c(sx4.f.b(3, null, null, dVar4)), null, 12), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
                    }
                    mVar2 = mVar;
                }
                return new ya5.i(u.c(new CenteredAmountDelegate.Model("input_amount", null, hVar, f3Var, mVar2, null, null, true, false, new ya5.g(currency), null, 1378)), hVarB, ya5.m.a((dVar3.i(creditPostTerminationPlanRepaymentInfo.f70657a) || dVar3.f(dVar5) || dVar3.f(dVar2)) ? false : true));
            case 3:
                hbl.d dVar7 = ((yb0.j) obj4).e;
                List pages = (List) content;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Throwable th10 = (Throwable) obj3;
                Intrinsics.checkNotNullParameter(pages, "pages");
                TransactionsSelectionItem transactionsSelectionItemR = hx7.a.r(((yb0.d) obj5).f312143a);
                Set set = transactionsSelectionItemR.d;
                ArrayList arrayList4 = new ArrayList(w.t(set, 10));
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((SelectedTransaction) it9.next()).f63604a);
                }
                Set setI1 = d0.i1(arrayList4);
                List list2 = pages;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : list2) {
                    if (obj7 instanceof ec0.a) {
                        arrayList5.add(obj7);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    a0.x(((ec0.a) it10.next()).f124404a, arrayList6);
                }
                int i3 = 25;
                List listB = ((u9l.c) dVar7).b(arrayList6, new hbl.a(setI1, false), new y99.x(i3));
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list2) {
                    if (obj8 instanceof ec0.b) {
                        arrayList7.add(obj8);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it11 = arrayList7.iterator();
                while (it11.hasNext()) {
                    a0.x(((ec0.b) it11.next()).f124405a, arrayList8);
                }
                SelectionStyle selectionStyle = transactionsSelectionItemR.f63707g;
                if (selectionStyle instanceof SelectionStyle.SingleSelection) {
                    z = true;
                    aVar = new hbl.b(true);
                } else {
                    z = true;
                    if (!(selectionStyle instanceof SelectionStyle.MultiSelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new hbl.a(setI1, true, new hb4.k(21));
                }
                List listB2 = ((u9l.c) dVar7).b(arrayList8, aVar, new y99.x(i3));
                if (th10 != null) {
                    List listB3 = iii.c.b(null, null, 6, z);
                    K = new ArrayList(w.t(listB3, 10));
                    Iterator it12 = listB3.iterator();
                    while (it12.hasNext()) {
                        K.add(FullScreenStateDelegate.Model.e((FullScreenStateDelegate.Model) it12.next(), zj.SMALL, 4194271));
                    }
                } else if (zBooleanValue2) {
                    gu guVar = new gu("LOADING_STATE_ID_SubHeader", R$attr.uikit_dp32, R$attr.uikit_dp16, 24);
                    pb0 pb0VarB = nb0.b(pb0.Companion, "LOADING_STATE_ID_Pagination", false, 0, false, 30);
                    int i5 = R$attr.uikit_dp0;
                    yp0.b.l(pb0VarB, i5, i5, 0, 0, null, false, 60);
                    K = v.k(guVar, pb0VarB);
                } else {
                    K = f0.f322471a;
                }
                return d0.E0((Iterable) K, d0.E0(listB2, listB));
            case 4:
                ybe.d dVar8 = (ybe.d) obj5;
                ybe.a aVar2 = (ybe.a) obj4;
                ApmPaymentAuthorisationSummary content4 = (ApmPaymentAuthorisationSummary) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                a9e.b bVar3 = dVar8.f312286a;
                PaymentMethodDetails paymentMethodDetails = content4.f61995g;
                PaymentAuthorisationState paymentAuthorisationState = content4.f61993b;
                PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
                ArrayList arrayList9 = new ArrayList();
                boolean z3 = aVar2.e;
                Data data2 = aVar2.f312283b;
                if (z3) {
                    c2 = 1;
                } else {
                    c2 = 1;
                    int i6 = com.revolut.feature.apm.core.api.R$string.mandate_details_warning_cancelled_title;
                    String str5 = (upi2 == null || (creditor = upi2.f62071c) == null) ? null : creditor.f62030a;
                    sa saVarY = ((i9e.f) bVar3).y(new TextLocalisedClause(i6, u.c(str5 != null ? str5 : ""), null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_warning_cancelled_subtitle, null, null, 14), paymentAuthorisationState == PaymentAuthorisationState.SUSPENDED);
                    yp0.b.l(saVarY, 0, 0, 0, 0, null, false, 63);
                    arrayList9.add(saVarY);
                }
                Clause clauseA = dVar8.f312288c.a(content4.f62003r, content4.o, null, null, content4.f61995g);
                CellDetailsDelegate.Model model2 = clauseA != null ? new CellDetailsDelegate.Model("ID_FREQUENCY", new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_frequency_title, null, null, 14), clauseA, 0, null, null, null, null, null, false, 0, 0, 32760) : null;
                LocalDateTime localDateTime = content4.k;
                if (localDateTime != null) {
                    LocalDate localDate = localDateTime.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                    modelF = ((i9e.f) bVar3).F(jli.b.i(localDate));
                } else {
                    modelF = null;
                }
                LocalDateTime localDateTime2 = content4.e;
                if (localDateTime2 != null) {
                    LocalDate localDate2 = localDateTime2.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                    modelV = ((i9e.f) bVar3).v(jli.b.i(localDate2), aVar2.f312282a);
                } else {
                    modelV = null;
                }
                ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount = content4.f62005t;
                if (apmPaymentAuthorisationAmount == null || (dVar = apmPaymentAuthorisationAmount.f61989c) == null) {
                    bVar = bVar3;
                    model = null;
                } else {
                    bVar = bVar3;
                    model = new CellDetailsDelegate.Model("ID_STARTED_ON", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_mandate_maxixum_amount_title, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                }
                LocalDateTime localDateTime3 = content4.f61998l;
                if (localDateTime3 != null) {
                    LocalDate localDate3 = localDateTime3.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
                    modelP = ((i9e.f) bVar).p(jli.b.i(localDate3));
                } else {
                    modelP = null;
                }
                CellDetailsDelegate.Model[] elements = {model2, modelF, modelV, model, modelP};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL2 = kotlin.collections.d.L(elements);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                a0.x(listL2, arrayList9);
                aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_payment_method, null, null, 14), (Image) null, 0, false, 30);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_product_upi_title, null, null, 14);
                ApmUpi.f61828c.getClass();
                int i21 = R$drawable.uikit_icn_24_upi;
                Float fValueOf = Float.valueOf(16.0f);
                ImageClause imageClause = new ImageClause(i21, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16);
                Clause[] clauseArr = new Clause[2];
                clauseArr[0] = textLocalisedClause2;
                clauseArr[c2] = imageClause;
                Object[] elements2 = {new CellDetailsDelegate.Model("PAYMENT_METHOD_CELL_LIST_ID", t0Var, new CompositeClause(v.k(clauseArr), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), (upi2 == null || (str = upi2.f62069a) == null) ? null : new CellDetailsNoteDelegate.Model("ID_AUTHORIZATION", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_mandate_id_title, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL3 = kotlin.collections.d.L(elements2);
                yp0.b.k(listL3, 0, 0, 0, 0, 31);
                a0.x(listL3, arrayList9);
                try {
                    Object content5 = data2.getContent();
                    data = new Data(content5 != null ? ((hce.d) content5).f150888a : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th11) {
                    data = new Data(null, th11, data2.getLoading());
                }
                k71.q qVar = aVar2.d;
                hce.d dVar9 = (hce.d) data2.getContent();
                i9e.f fVar = (i9e.f) bVar;
                List listD = fVar.d(data, qVar, dVar9 != null ? dVar9.f150889b : null);
                if (listD != null) {
                    a0.x(listD, arrayList9);
                }
                CellDetailsChevronDelegate.Model modelS = fVar.s();
                yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
                arrayList9.add(modelS);
                if (paymentAuthorisationState == PaymentAuthorisationState.SUSPENDED) {
                    CellDetailsChevronDelegate.Model modelL = fVar.l(com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_action_cancel_future_payments_title);
                    yp0.b.l(modelL, 0, 0, 0, 0, null, false, 63);
                    arrayList9.add(modelL);
                }
                arrayList9.add(new IconDelegate.Model("LOGO_FOOTER_LIST_ID", te2.a.f270025b, null, null, null, null, null, null, 972));
                return arrayList9;
            case 5:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((List) content, "<unused var>");
                return ((yc0.j) obj5).b((BottomPromptScreen) obj4);
            case 6:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List<yea.a> listI = ((yea.c) obj5).i((String) obj4, (List) content);
                ArrayList arrayList10 = new ArrayList(w.t(listI, 10));
                for (yea.a aVar3 : listI) {
                    xi0.b bVar4 = aVar3.f312831a;
                    xi0.b bVar5 = aVar3.f312831a;
                    arrayList10.add(new RowDelegate.Model(bVar4.f306286a, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar5.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60), new CurrencyClause(bVar4, CurrencyClause.Format.DisplayName.f57755a, null, 4), null, 0, new CurrencyClause(bVar5, ticker, null, 4), null, null, 0, null, false, null, false, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, aVar3.f312831a, null, 0, 0, 0, 0, 532660184));
                }
                yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                return arrayList10;
            case 7:
                yed.o oVar = (yed.o) obj5;
                r0 r0Var = (r0) obj4;
                ((Integer) content).getClass();
                ((Boolean) obj2).getClass();
                String currencyId = oVar.f312876c;
                if (currencyId != null) {
                    xi0.b.Companion.getClass();
                    textClause = new CurrencyClause(xi0.a.a(currencyId), ticker, null, 4);
                } else {
                    textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                Clause clause = textClause;
                nx0.e eVar = (!oVar.f312878h || currencyId == null) ? nx0.e.NONE : nx0.e.AMOUNT;
                String str6 = oVar.d;
                if (currencyId != null) {
                    xi0.b.Companion.getClass();
                    strJ = cp5.d.J(xi0.a.a(currencyId));
                } else {
                    strJ = null;
                }
                bw0.h hVar2 = new bw0.h(str6, strJ, true, null, Boolean.TRUE, false, false, false, false, null, 6100);
                BigDecimal currentRate = oVar.e;
                if (currentRate == null || currencyId == null) {
                    textLocalisedClause = null;
                } else {
                    FavouritesAssetDetails fromAsset = oVar.f312875b;
                    Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
                    Intrinsics.checkNotNullParameter(currencyId, "toAssetId");
                    Intrinsics.checkNotNullParameter(currentRate, "rate");
                    int i22 = com.revolut.feature.shared_separate_favourites.api.R$string.shared_alerts_create_alert_current_rate;
                    TextClause textClause3 = new TextClause(fromAsset.f86864b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    ffd.a aVar4 = r0Var.f312897a;
                    FavouritesAssetTypeKey typeKey = fromAsset.d;
                    String referencedCurrencyId = fromAsset.f86863a;
                    Intrinsics.checkNotNullParameter(typeKey, "typeKey");
                    Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                    Intrinsics.checkNotNullParameter(currencyId, "currencyId");
                    Intrinsics.checkNotNullParameter(referencedCurrencyId, "referencedCurrencyId");
                    textLocalisedClause = new TextLocalisedClause(i22, v.k(textClause3, ((p2d.b) aVar4).a(typeKey).d(currencyId, referencedCurrencyId, currentRate), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                }
                bw0.m mVar3 = new bw0.m(textLocalisedClause, bw0.l.INFO, null, false, null, 28);
                String str7 = oVar.f312876c;
                AmountEditDelegate.Model model3 = new AmountEditDelegate.Model("amount_id", clause, hVar2, eVar, null, mVar3, null, str7 != null, str7, null, 1552);
                yp0.b.r(model3, 0, 0, 0, 0, 15);
                return model3;
            case 8:
                yf4.l lVar2 = (yf4.l) obj5;
                hu3.a config = (hu3.a) content;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(config, "config");
                Integer num = ((yf4.e) obj4).f313174b;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_change_repayment_day_title, u.c(config.f155547a), null, 12);
                TextClause textClause4 = new TextClause(config.f155548b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_change_repayment_day_confirm, u.c(config.f155550g), null, 12);
                c7 c7Var = new c7(new TextClause(config.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6);
                boolean z4 = !zBooleanValue3;
                aim.e eVarB2 = u.b();
                IntRange intRange = new IntRange(1, config.d, 1);
                int iF0 = d0.f0(intRange, Integer.valueOf(num != null ? num.intValue() : config.f155549c));
                ArrayList arrayList11 = new ArrayList(w.t(intRange, 10));
                vim.f it13 = intRange.iterator();
                while (it13.f289625c) {
                    arrayList11.add(String.valueOf(it13.nextInt()));
                }
                List list3 = config.e;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    linkedHashSet2.add(String.valueOf(((Number) it14.next()).intValue()));
                }
                s6 s6Var = new s6("repaymentDayCalendar", iF0, arrayList11, null, u.c(new r6(linkedHashSet2)), b4.EXPIRED_OR_INVALID_KEY_VALUE);
                yp0.b.l(s6Var, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(s6Var);
                eVarB2.addAll(lVar2.f313183a.b(config.i, new ax4.b(0)));
                return new yf4.h(textLocalisedClause3, textClause4, textLocalisedClause4, c7Var, zBooleanValue3, z4, u.a(eVarB2));
            case 9:
                ygf.j jVar = (ygf.j) obj5;
                ygf.d dVar10 = (ygf.d) obj4;
                b9e.c content6 = (b9e.c) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content6, "content");
                List list4 = content6.f13735b.f;
                if (list4.isEmpty()) {
                    List listC = u.c(new FullScreenStateDelegate.Model("ADD_NEW_SUBSCRIPTION_LIST_ID", new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D098", null, null, null, 30)), new l6(8, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactions_upcoming_empty_state_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1988));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    return listC;
                }
                List list5 = list4;
                ArrayList arrayList12 = new ArrayList();
                for (Object obj9 : list5) {
                    if (((RecurringPaymentWithExtra) obj9).getF81653a().f249316b == ibd.f.ACTIVE) {
                        arrayList12.add(obj9);
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                for (Object obj10 : list5) {
                    if (((RecurringPaymentWithExtra) obj10).getF81653a().f249316b == ibd.f.INACTIVE) {
                        arrayList13.add(obj10);
                    }
                }
                aim.e eVarB3 = u.b();
                List listA = a9e.h.a(jVar.f313660a, arrayList12, a9e.e.f2426a, content6.d, arrayList13, content6.e, dVar10.f313649b, 16);
                if (listA != null) {
                    eVarB3.addAll(listA);
                }
                return u.a(eVarB3);
            case 10:
                return a(content, obj2, obj3);
            case 11:
                return b(content, obj2, obj3);
            case 12:
                h1 h1Var = (h1) obj5;
                ima.a upgradeAvailability = (ima.a) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(upgradeAvailability, "upgradeAvailability");
                boolean z6 = upgradeAvailability instanceof a.C0929a;
                qla.a aVar5 = ((yna.a) obj4).f;
                int i32 = aVar5 == null ? -1 : yna.g1.f315341a[aVar5.ordinal()];
                if (i32 != -1) {
                    if (i32 == 1 || i32 == 2) {
                        ((qoa.e) h1Var.f315343a).getClass();
                        return v.l(z6 ? new LabelNavBarMenuItem("UPGRADE_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_action_upgrade, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, 504) : null);
                    }
                    if (i32 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return f0.f322471a;
            case 13:
                return c(content, obj2, obj3);
            case 14:
                return d(content, obj2, obj3);
            case 15:
                return e(content, obj2, obj3);
            case 16:
                return g(content, obj2, obj3);
            case 17:
                return h(content, obj2, obj3);
            case 18:
                return i(content, obj2, obj3);
            case 19:
                return j(content, obj2, obj3);
            case 20:
                return k(content, obj2, obj3);
            case 21:
                return l(content, obj2, obj3);
            case 22:
                return m(content, obj2, obj3);
            case 23:
                return n(content, obj2, obj3);
            case 24:
                return o(content, obj2, obj3);
            case 25:
                return p(content, obj2, obj3);
            case 26:
                return q(content, obj2, obj3);
            case 27:
                return r(content, obj2, obj3);
            case 28:
                return s(content, obj2, obj3);
            default:
                EsimUserPocket userPocket = (EsimUserPocket) obj4;
                EsimCheckoutPrice checkoutPrice = (EsimCheckoutPrice) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(checkoutPrice, "price");
                fhj.g gVar = ((l0) obj5).d;
                Intrinsics.checkNotNullParameter(userPocket, "userPocket");
                Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
                boolean zC = ((jte.d) gVar.f135254a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c);
                if (!zC) {
                    if (zC) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new RowDelegate.Model("ID_PAY_WITH_ITEM", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(userPocket.f100533c.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_pay_with_account_title, u.c(new TextClause(userPocket.f100533c.f115083b.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_pay_with_account_balance, u.c(new MoneyClause(userPocket.f100533c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4)), ce9.m.e(userPocket, checkoutPrice.f100197b) ? null : new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8), null, null, 0, null, false, null, false, null, null, null, null, null, null, checkoutPrice.f100198c, null, 0, 0, 0, 0, 532676568);
                }
                PaymentMethod.Pocket pocket = userPocket.f100532b;
                if (pocket != null) {
                    return RowDelegate.Model.x(dec.q.c(gVar.f135255b, pocket, true, ce9.m.e(userPocket, checkoutPrice.f100197b) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS, false, 24), null, null, null, null, null, 0, null, false, null, checkoutPrice.f100198c, 0, 0, 0, 0, null, -4194305, 15);
                }
                throw new IllegalStateException("EsimCheckoutPayWithItemMapper: can not build pocket item — pocket is null");
        }
    }
}
