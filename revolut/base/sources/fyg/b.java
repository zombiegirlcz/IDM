package fyg;

import android.os.Parcelable;
import au0.u0;
import aw0.a5;
import aw0.b5;
import aw0.c5;
import aw0.d5;
import aw0.e5;
import aw0.f5;
import aw0.i5;
import aw0.j5;
import aw0.o9;
import aw0.q2;
import aw0.r5;
import aw0.s5;
import aw0.s8;
import aw0.t5;
import aw0.z4;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.d6;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionSuccess;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCard;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCardBenefitItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCardBenefits;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoManageCardOption;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoOverview;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoStatusBanner;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreenContract$ActionBannerPayload;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.commodity.asset_details.impl.R$string;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$BottomSheetItemParcel;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.cards.model.SharedRevolutCard;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import d6j.p;
import dec.q;
import dx4.e1;
import dx4.p3;
import e2f.y;
import g03.b0;
import g6j.s;
import g7b.n;
import g7b.x;
import ge1.j;
import ggk.g1;
import ggk.x0;
import gh1.k;
import gh1.o;
import gq4.t;
import h43.m;
import h93.h0;
import i26.l;
import i7b.i;
import ip0.ak0;
import ip0.eh;
import ip0.ej;
import ip0.qd0;
import ip0.ui;
import ip0.vd0;
import ip0.xk;
import ip0.y10;
import ip0.yj0;
import ip0.z;
import ip0.zj;
import java.math.BigDecimal;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import mx0.c7;
import mx0.d7;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import tof.i3;
import yhm.r;
import yy0.h;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f138987c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f138985a = i;
        this.f138986b = obj2;
        this.f138987c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x057a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fyg.b.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee  */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v31, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fyg.b.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        HeaderDelegate.Model model;
        s sVar = (s) this.f138986b;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.f138987c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        jt5.b bVar = (jt5.b) pair.f186385a;
        io3.d dVar = (io3.d) pair.f186386b;
        if (dVar.i == 0) {
            return f0.f322471a;
        }
        sVar.getClass();
        kpj.f fVar = sVar.f140974a;
        CompositeClause compositeClauseB = null;
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("COMMODITIES_INVESTMENTS_WIDGET_LIST_ID_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.asset_details_investment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        dj0.d dVar2 = bVar.f178355b;
        BigDecimal bigDecimal = bVar.d;
        if (dVar2 == null || bigDecimal == null) {
            model = null;
        } else {
            model = new HeaderDelegate.Model("COMMODITIES_INVESTMENTS_WIDGET_LIST_ID_TOTAL", null, new q2(26, new MoneyClause(dVar2, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12), null, false), null, new TextLocalisedClause(R$string.asset_details_investment_total_value_title, u.c(xqi.a.b(bigDecimal, true, 6)), null, 12), null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960);
        }
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        n2l.b bVar2 = n2l.b.f211584a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(fVar.g(bVar2), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
        TextLocalisedClause textLocalisedClauseH = fVar.h(bVar2, tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null, null);
        MoneyClause moneyClause = new MoneyClause(z92.f.j(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        dj0.d dVar3 = bVar.f178355b;
        MoneyClause moneyClause2 = dVar3 != null ? new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12) : null;
        if (bigDecimal != null) {
            compositeClauseB = xqi.a.b(bigDecimal, true, 6);
        }
        Object[] elements = {model, new RowDelegate.Model("COMMODITIES_INVESTMENTS_WIDGET_LIST_ID_ITEM", image40, textLocalisedClauseH, null, 0, moneyClause, null, null, 0, new RowDelegate.Model.c.b(moneyClause2, compositeClauseB, null, false, 124), false, null, false, null, null, null, null, null, null, new p(bVar.f178354a), null, 0, 0, 0, 0, 532675544)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        aim.e eVarB = u.b();
        eVarB.add(model2);
        eVarB.addAll(listL);
        return u.a(eVarB);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Collection collectionC;
        List listC;
        Collection collectionG;
        x xVar = (x) this.f138986b;
        n nVar = (n) this.f138987c;
        CobrandedCardsPlanHubInfoOverview overviewTab = (CobrandedCardsPlanHubInfoOverview) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(overviewTab, "overviewTab");
        aim.e eVarB = u.b();
        i7b.a aVar = xVar.f141164a;
        i7b.b bVar = xVar.d;
        CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner = overviewTab.f82381a;
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = nVar.f141153b;
        if (cobrandedCardsPlanHubInfoStatusBanner == null) {
            collectionC = f0.f322471a;
        } else {
            CobrandedCardsPlanHubInfoBannerAction cobrandedCardsPlanHubInfoBannerAction = cobrandedCardsPlanHubInfoStatusBanner.e;
            CobrandedCardsPlanHubInfoBannerInfo cobrandedCardsPlanHubInfoBannerInfo = cobrandedCardsPlanHubInfoStatusBanner.f;
            if (cobrandedCardsPlanHubInfoBannerAction != null) {
                CobrandedCardsPlanHubInfoBannerAction.ActionType actionType = cobrandedCardsPlanHubInfoBannerAction.f82342a;
                CobrandedCardsPlanHubInfoBannerActionSuccess cobrandedCardsPlanHubInfoBannerActionSuccess = cobrandedCardsPlanHubInfoBannerAction.d;
                collectionC = (!(actionType instanceof CobrandedCardsPlanHubInfoBannerAction.ActionType.Subscribe) || cobrandedCardsPlanHubPlan == null || cobrandedCardsPlanHubInfoBannerActionSuccess == null) ? actionType instanceof CobrandedCardsPlanHubInfoBannerAction.ActionType.Url ? u.c(aVar.a(cobrandedCardsPlanHubInfoStatusBanner, cobrandedCardsPlanHubInfoBannerAction, new CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Url(((CobrandedCardsPlanHubInfoBannerAction.ActionType.Url) actionType).f82348a, cobrandedCardsPlanHubInfoBannerAction), com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_banner_button_url_placeholder)) : actionType instanceof CobrandedCardsPlanHubInfoBannerAction.ActionType.CancelCardTermination ? u.c(aVar.a(cobrandedCardsPlanHubInfoStatusBanner, cobrandedCardsPlanHubInfoBannerAction, new CobrandedCardsPlanHubScreenContract$ActionBannerPayload.CancelCardTermination(cobrandedCardsPlanHubInfoBannerAction), com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_banner_button_cancel_card_termination_placeholder)) : (!(actionType instanceof CobrandedCardsPlanHubInfoBannerAction.ActionType.OrderCard) || cobrandedCardsPlanHubPlan == null) ? f0.f322471a : u.c(aVar.a(cobrandedCardsPlanHubInfoStatusBanner, cobrandedCardsPlanHubInfoBannerAction, new CobrandedCardsPlanHubScreenContract$ActionBannerPayload.OrderCard(cobrandedCardsPlanHubInfoBannerAction, cobrandedCardsPlanHubPlan), com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_banner_button_order_card_placeholder)) : u.c(aVar.a(cobrandedCardsPlanHubInfoStatusBanner, cobrandedCardsPlanHubInfoBannerAction, new CobrandedCardsPlanHubScreenContract$ActionBannerPayload.Subscribe(cobrandedCardsPlanHubPlan, cobrandedCardsPlanHubInfoBannerAction, cobrandedCardsPlanHubInfoBannerActionSuccess), com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_action_banner_button_subscribe_placeholder));
            } else {
                TextClause textClause = new TextClause(cobrandedCardsPlanHubInfoStatusBanner.f82406a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = cobrandedCardsPlanHubInfoStatusBanner.f82407b;
                RowDelegate.Model model = new RowDelegate.Model("list_id_info_banner", null, textClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, cobrandedCardsPlanHubInfoBannerInfo != null ? new tf(new h(new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_banner_info_icon_content_description, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)), sf.TOP) : null, cobrandedCardsPlanHubInfoBannerInfo != null, null, false, null, null, null, null, null, null, cobrandedCardsPlanHubInfoBannerInfo, null, 0, 0, 0, 0, 532673498);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                collectionC = u.c(model);
            }
        }
        eVarB.addAll(collectionC);
        i iVar = xVar.f141165b;
        CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge = overviewTab.f82382b;
        eVarB.addAll(cobrandedCardsPlanHubInfoRewardChallenge == null ? f0.f322471a : yp0.b.g(u.c(iVar.f159229a.a(cobrandedCardsPlanHubInfoRewardChallenge, 0)), new ListSubheaderDelegate.Model("list_id_next_reward_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_overview_tab_next_reward, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        eVarB.addAll(xVar.e.a(overviewTab.i));
        i7b.e eVar = xVar.f141166c;
        CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefits = overviewTab.f82383c;
        boolean z = nVar.d;
        if (cobrandedCardsPlanHubInfoCardBenefits == null) {
            collectionG = f0.f322471a;
        } else {
            CobrandedCardsPlanHubInfoCard cobrandedCardsPlanHubInfoCard = cobrandedCardsPlanHubInfoCardBenefits.f82373a;
            TextClause textClause2 = new TextClause(cobrandedCardsPlanHubInfoCard.f82368b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = cobrandedCardsPlanHubInfoCard.d;
            TextClause textClause3 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String str3 = cobrandedCardsPlanHubInfoCard.f82367a;
            RowDelegate.Model header = new RowDelegate.Model("ID_CARD_ITEM", str3 != null ? new RowDelegate.Model.MainImage.Image40(new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60) : null, textClause2, null, 0, textClause3, null, null, 0, new tf(new h(new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_overview_tab_card_benefits, null, null, 14), new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, cobrandedCardsPlanHubInfoCardBenefits.f82373a, null, 0, 0, 0, 0, 532675544);
            if (z) {
                aim.e eVarB2 = u.b();
                int i = 0;
                for (Object obj5 : cobrandedCardsPlanHubInfoCardBenefits.f82374b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    CobrandedCardsPlanHubInfoCardBenefitItem cobrandedCardsPlanHubInfoCardBenefitItem = (CobrandedCardsPlanHubInfoCardBenefitItem) obj5;
                    String strN = a0.d.n("ID_CARD_BENEFIT_ITEM_", i);
                    TextClause textClause4 = new TextClause(cobrandedCardsPlanHubInfoCardBenefitItem.f82371b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str4 = cobrandedCardsPlanHubInfoCardBenefitItem.f82372c;
                    boolean z3 = false;
                    eVarB2.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(eVar.f159226a.c(cobrandedCardsPlanHubInfoCardBenefitItem.f82370a), z3, z3, 6), textClause4, null, 0, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                    i = i2;
                }
                CobrandedCardsPlanHubInfoBenefitsSectionAction cobrandedCardsPlanHubInfoBenefitsSectionAction = cobrandedCardsPlanHubInfoCardBenefits.f82375c;
                if (cobrandedCardsPlanHubInfoBenefitsSectionAction != null) {
                    eVarB2.add(eVar.f159227b.a(cobrandedCardsPlanHubInfoBenefitsSectionAction, "card_benefits"));
                }
                listC = l.e(header, u.a(eVarB2));
            } else {
                Intrinsics.checkNotNullParameter(header, "header");
                listC = u.c(header);
            }
            collectionG = yp0.b.g(listC, new ListSubheaderDelegate.Model("list_id_card_benefits_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_overview_tab_card_benefits, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(collectionG);
        eVarB.addAll(bVar.a(overviewTab.e, "plan_benefits"));
        eVarB.addAll(bVar.a(overviewTab.f, "revolut_plan_benefits"));
        List manageCardOptions = overviewTab.d;
        Intrinsics.checkNotNullParameter(manageCardOptions, "manageCardOptions");
        List<CobrandedCardsPlanHubInfoManageCardOption> list = manageCardOptions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CobrandedCardsPlanHubInfoManageCardOption cobrandedCardsPlanHubInfoManageCardOption : list) {
            arrayList.add(new InputDisclosureDelegate.Model("list_id_" + cobrandedCardsPlanHubInfoManageCardOption.f82377b, new TextClause(cobrandedCardsPlanHubInfoManageCardOption.f82376a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, cobrandedCardsPlanHubInfoManageCardOption.f82377b, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        eVarB.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("list_id_manage_card_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_overview_tab_manage_card, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        eVarB.addAll(nVar.f141154c);
        String str5 = overviewTab.f82385h;
        if (str5 != null) {
            eVarB.add(new ej("list_id_footer_text", new c7(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6)));
        }
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        gah.g gVar = (gah.g) this.f138986b;
        d7 d7Var = (d7) this.f138987c;
        List disclaimers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        List list = disclaimers;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ej(a0.d.n("WEALTH_REMOTE_DISCLAIMERS_LIST_ID_GENERAL_", i), new c7(gVar.d(null, ((rdh.a) obj5).f253458b), false, d7Var, 2)));
            i = i2;
        }
        yp0.b.q(arrayList, 0, 0, 0, 0, 15);
        return arrayList;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ge1.l lVar = (ge1.l) this.f138986b;
        ge1.f fVar = (ge1.f) this.f138987c;
        cd1.c content = (cd1.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f23147b;
        List categories = content.f23146a;
        if (list.isEmpty() && categories.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_empty_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, fVar.f143210c ? new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_empty_action, null, null, 14) : null, false, null, null, false, 0, 0, 32576);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return new ge1.i(u.c(model));
        }
        cd1.e eVar = fVar.f143209b;
        boolean z = fVar.f143210c;
        j jVar = lVar.f143215a;
        aim.e eVarB = u.b();
        List list2 = content.f23147b;
        if (!categories.isEmpty()) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_categories_subheader_label, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_categories_subheader_action, null, null, 14) : null;
            int i = R$attr.uikit_dp4;
            eVarB.add(new ListSubheaderDelegate.Model("CATEGORIES_SUBHEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) textLocalisedClause2, true, (Object) null, (AnalyticsContext) null, 0, 0, i, i, (String) null, 163642));
            Intrinsics.checkNotNullParameter(categories, "categories");
            List<CatalogueCategory> list3 = categories;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            for (CatalogueCategory catalogueCategory : list3) {
                ExtraSmallCardDelegate.Model model2 = new ExtraSmallCardDelegate.Model(j6.a.q("CATEGORY_LIST_ID_", catalogueCategory.f60669a), new eh(new TextClause(catalogueCategory.f60670b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, new d6(new ResourceImage(R$drawable.uikit_icn_24_view_grid, (Integer) null, Integer.valueOf(((pd1.c) jVar.f143214a).c(catalogueCategory.f60671c)), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST)), catalogueCategory, 16044);
                int i2 = R$attr.uikit_dp4;
                yp0.b.l(model2, i2, i2, i2, i2, null, false, 48);
                arrayList.add(model2);
            }
            int i3 = R$attr.uikit_dp4;
            eVarB.add(new xk("CATEGORIES_DELEGATE_GRID_BOX_LIST_ID", arrayList, 3, null, null, 0, 0, i3, i3, 63992));
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_products_subheader_label, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = z ? new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_products_subheader_action, null, null, 14) : null;
        int i5 = R$attr.uikit_dp4;
        eVarB.add(new ListSubheaderDelegate.Model("PRODUCTS_SUBHEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause3, (ResourceImage) null, false, false, (Clause) textLocalisedClause4, true, (Object) null, (AnalyticsContext) null, 0, 0, i5, i5, (String) null, 163642));
        if (list2.isEmpty()) {
            RowDelegate.Model model3 = new RowDelegate.Model("PRODUCTS_EMPTY_STATE_LIST_ID", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_products_empty_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model3);
        } else {
            ArrayList arrayListA = jVar.a(list2, eVar);
            int i6 = R$attr.uikit_dp4;
            eVarB.add(new xk("PRODUCTS_DELEGATE_GRID_BOX_LIST_ID", arrayListA, 3, null, null, 0, 0, i6, i6, 63992));
        }
        return new ge1.i(u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        gf5.a aVar = (gf5.a) this.f138986b;
        gf5.f fVar = (gf5.f) this.f138987c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        List list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            ImageTransformations imageTransformations = null;
            Object[] objArr = 0;
            if (!it8.hasNext()) {
                break;
            }
            StakingProduct stakingProduct = (StakingProduct) it8.next();
            xi0.b bVar = stakingProduct.d;
            String str = bVar.f306286a;
            vtd.b bVar2 = stakingProduct.f88087b.k;
            vtd.b bVar3 = vtd.b.AUTO;
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            Clause textLocalisedClause = bVar2 == bVar3 ? new TextLocalisedClause(com.revolut.feature.crypto.earn.assets.shared.impl.R$string.crypto_staking_staking_overview_token_subtitle_autostaking, ehe.n.x(bVar, ticker, null, 4), null, 12) : new CurrencyClause(bVar, ticker, null, 4);
            arrayList.add(new RowDelegate.Model(j6.a.q("STAKING_PRODUCT_ITEM_LIST_ID_", str), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, imageTransformations, (TextLocalisedClause) (objArr == true ? 1 : 0), 14), null, null, false, null, false, 60), new CurrencyClause(bVar, null, null, 6), null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(((wud.b) fVar.f143348a).c(stakingProduct.f88089g, true, new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254)), null, null, false, 126), true, null, false, null, null, null, null, null, null, new EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel(stakingProduct), null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        Clause clause = aVar.f143342b;
        if (clause != null) {
            eVarB.add(new TextDelegate.Model("DISCLAIMER_ITEM_LIST_ID", clause, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        return u.a(eVarB);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        o oVar = (o) this.f138986b;
        k kVar = (k) this.f138987c;
        SharedRevolutCardWrapper cardWrapper = (SharedRevolutCardWrapper) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) kVar.f143826c.getContent();
        o5l.g gVar = kVar.d;
        aim.e eVarB = u.b();
        lw2.a aVar = oVar.f143831a;
        SharedRevolutCard sharedRevolutCard = ((RetailCardWrapper) cardWrapper).f64443a;
        String str = sharedRevolutCard.f104693a;
        int i = R$attr.uikit_dp16;
        eVarB.add(eg1.a.a(aVar, str, cardWrapper, cardDetailsDesignConfig, gVar, i, i, sharedRevolutCard));
        sa saVar = new sa("SCAM_WARNING_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.google_pay_verification_warning_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.x_pay_otp_verification_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(saVar);
        return u.a(eVarB);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e) this.f138986b;
        ghk.j jVar = (ghk.j) this.f138987c;
        r rVar = (r) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List list = (List) rVar.f314201a;
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) rVar.f314202b;
        g1 g1Var = (g1) rVar.f314203c;
        x0 x0Var = g1Var.f143723j;
        return new ghk.h(eVar.a(list, x0Var.f143796a, pricingPlanSubscription, g1Var, jVar.f143963h), eVar.a(list, x0Var.f143797b, pricingPlanSubscription, g1Var, jVar.f143963h));
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        List listK;
        gkk.n nVar = (gkk.n) this.f138986b;
        gkk.d dVar = (gkk.d) this.f138987c;
        ggk.a details = (ggk.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "pricingPlan");
        dVar.getClass();
        lha.d dVar2 = (lha.d) dVar.d.getContent();
        lha.b bVar = dVar2 != null ? dVar2.f195200a : null;
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.family_plans_intro_price_title, (Number) 1, u.c(1), (Style) null, 24);
        dj0.d dVarA = cjk.a.a(1, details);
        lha.p pVar = details.d;
        hha.i iVar = details.f143699c;
        hha.d dVar3 = details.f143698b;
        Intrinsics.checkNotNullParameter(details, "details");
        qha.b bVarA = pVar.a();
        if (bVarA == null) {
            throw new IllegalStateException("FEE_TYPE_FAMILY_MEMBER is necessary for Family Plan Subscribe Info");
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(gkk.n.a(iVar), u.c(dok.b.b(bVarA.f246575b, null, null, null, 7)), null, 12);
        CounterTextDelegate.Model.Companion aVar = CounterTextDelegate.Model.INSTANCE;
        TextLocalisedQuantityClause textLocalisedQuantityClause2 = textLocalisedQuantityClause;
        MoneyClause moneyClauseB = dok.b.b(dVarA, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 5);
        m70.a.t(t0.f186434a);
        List listC = u.c(CounterTextDelegate.Model.Companion.c(aVar, "price_id", textLocalisedQuantityClause2, new CompositeClause(v.k(moneyClauseB, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause), null, null, null, 14), null, false, 2040));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List list = listC;
        int i = 6;
        if (((jte.d) nVar.f144430b).c(PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c)) {
            listK = v.k(new RowDelegate.Model("benefits_separate_accounts", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_split, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_separate_accounts_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_separate_accounts_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("benefits_member_plan_paid", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_everyone_gets_plan_title, u.c(dok.g.d(dVar3, null)), null, 12), null, 0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_everyone_gets_plan_subtitle, u.c(dok.g.d(dVar3, null)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("benefits_you_are_in_control", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_you_are_in_control_title, null, null, 14), null, 0, bVar != null ? Intrinsics.f(bVar.f, Boolean.TRUE) : false ? new TextLocalisedQuantityClause(R$plurals.family_plans_intro_benefits_you_are_in_control_subtitle_with_limits, Integer.valueOf(bVar.f195198b), v.k(Integer.valueOf(bVar.f195198b), Long.valueOf(bVar.f195199c.toTotalMonths())), (Style) null, 24) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_you_are_in_control_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        } else {
            Intrinsics.checkNotNullParameter(details, "details");
            qha.b bVarB = pVar.b();
            if (bVarB == null) {
                throw new IllegalStateException("FEE_TYPE_NEW_PLAN_BILLING is necessary for Family Plan Subscribe Info");
            }
            listK = v.k(new RowDelegate.Model("benefits_member", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_plan_premium, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_plan_title, u.c(dok.g.d(dVar3, null)), null, 12), null, 0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_plan_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("benefits_price", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_price_title, u.c(new TextLocalisedClause(gkk.n.a(iVar), u.c(dok.b.b(bVarB.f246575b, null, null, null, 7)), null, 12)), null, 12), null, 0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_price_subtitle_with_plan, v.k(dok.g.d(dVar3, null), new TextLocalisedClause(gkk.n.a(iVar), u.c(dok.b.b(cjk.a.a(2, details), null, null, null, 7)), null, 12)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("benefits_manager", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_manage_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_intro_benefits_manage_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        }
        return d0.E0(listK, list);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        ac4.g gVar = (ac4.g) this.f138986b;
        Data data = (Data) this.f138987c;
        List commodities = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        return ((t5d.d) gVar.f3032c).a(data, ((klh.c) gVar.f3031b).c(null, commodities));
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    private final Object m(Object obj2, Object obj3, Object obj4) {
        String str;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.b) this.f138986b;
        gmk.f fVar = (gmk.f) this.f138987c;
        List accounts = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List<SavingsAccountDetails> list = accounts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (SavingsAccountDetails savingsAccountDetails : list) {
            gmk.g gVar = fVar.f144878a;
            String strQ = j6.a.q("savings_item_", savingsAccountDetails.f86460a.f234881a);
            int i = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.pricing_plan_template_engine_cell_banner_title;
            pcd.s sVar = savingsAccountDetails.f86460a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(sVar.f234885h.f234859a), null, 12);
            ncd.j jVar = sVar.i().e;
            SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
            boolean z = false;
            if (savingsProductData != null) {
                Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                if (ocd.c.i(savingsProductData)) {
                    z = true;
                }
            }
            Clause clauseB = bVar.f103549a.b(jVar, z ? new njb.f(new ImageClauseTint.Color(R$attr.uikit_colorForeground), null, 5) : new njb.h(null, 3));
            Image imageA = savingsAccountDetails.f86461b;
            if (imageA instanceof UrlImage) {
                UrlImage urlImage = (UrlImage) imageA;
                UrlImageDrawable urlImageDrawable = urlImage.f60019c;
                if (urlImageDrawable == null) {
                    urlImageDrawable = (UrlImageDrawable.Shimmering.Transformable) bVar.f103550b.getValue();
                }
                imageA = UrlImage.a(urlImage, null, null, urlImageDrawable, null, null, 524283);
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageA, null, null, false, null, false, 62);
            RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(sVar.f234885h.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            int i2 = gmk.l.f144886a[gVar.ordinal()];
            if (i2 == 1) {
                str = "plan.hub.sheet.savings_accounts.savings.list_item";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "plan.hub.sheet.savings_accounts.mmf.list_item";
            }
            arrayList.add(new RowDelegate.Model(strQ, image40, textLocalisedClause, null, 0, clauseB, null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, new PlanSavingsAccountsScreenContract$BottomSheetItemParcel.SavingsAccount(sVar.f234881a), new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)), 0, 0, 0, 0, 524286936));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0365  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fyg.b.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        gpd.n nVar = (gpd.n) this.f138986b;
        gpd.b bVar = (gpd.b) this.f138987c;
        gpd.a content = (gpd.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        i3 i3Var = bVar.f145437b;
        IconDelegate.Model model = new IconDelegate.Model("ADD_CATEGORY_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 16.0f, null, null, 48), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_categories_list_create, null, null, 14), null, null, null, null, null, 968);
        ArrayList arrayListA = nVar.a(content.f145435b, i3Var);
        ArrayList arrayListA2 = nVar.a(content.f145434a, i3Var);
        aim.e eVarB = u.b();
        if (arrayListA.isEmpty()) {
            xk xkVar = new xk("GRID_ID_DEFAULT", ue0.e.J(model, arrayListA2), null, null, null, 60);
            yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(xkVar);
        } else {
            eVarB.addAll(yp0.b.i(new xk("GRID_ID_CUSTOM", ue0.e.J(model, arrayListA), null, null, null, 60), new ListSubheaderDelegate.Model("CUSTOM_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_categories_list_custom_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            eVarB.addAll(yp0.b.i(new xk("GRID_ID_DEFAULT", arrayListA2, null, null, null, 60), new ListSubheaderDelegate.Model("DEFAULT_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_categories_list_default_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        return new gpd.d(u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(Object obj2, Object obj3, Object obj4) {
        t tVar = (t) this.f138986b;
        gq4.i iVar = (gq4.i) this.f138987c;
        gq4.h content = (gq4.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        CreditCardCancellationDetails creditCardCancellationDetails = iVar.f145550a;
        aim.e eVarB = u.b();
        eVarB.addAll(tVar.f145564a.h("terminated_repayment_details", creditCardCancellationDetails.f68709c));
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("total_to_repay", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_balance_total_to_repay_title, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, content.f145549b), null, null, j2.H3, null, 0, null, false, false, null, null, 32632);
        io3.d dVar = content.f145548a;
        dj0.d dVarJ = z92.f.j(dVar);
        dj0.d dVar2 = content.f145549b;
        List listK = v.k(model, new RowDelegate.Model("source_pocket", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14), null, null, false, null, false, 62), new CurrencyClause(z92.f.l(dVar), null, null, 6), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_balance_amount_subtitle, u.c(sx4.f.b(3, null, null, dVarJ)), dVar2.h(z92.f.j(dVar)) ? null : new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new gq4.l(u.a(eVarB), new gq4.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cancellation_action_repay_later, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new CreditCardModelAction.Contextual(tl4.b.EXIT)), dVar2.h(z92.f.j(dVar)) ? new gq4.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cancellation_action_repay, u.c(sx4.f.b(3, null, null, dVar2)), null, 12), LargeActionButton.ButtonStyle.f58726b, new CreditCardModelAction.Contextual(tl4.b.REPAY)) : new gq4.e(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_cancellation_action_add_money, null, null, 14), LargeActionButton.ButtonStyle.f58726b, new CreditCardModelAction.Contextual(tl4.b.ADD_MONEY)));
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0572  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fyg.b.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        gvi.u uVar = (gvi.u) this.f138986b;
        gvi.h hVar = (gvi.h) this.f138987c;
        AsftTravellerDetailsScreenContract$DomainState$TravellerDetails currentUserName = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currentUserName, "currentUserName");
        return w.u(v.k(gvi.u.d(uVar, currentUserName, 0, false, 12), uVar.a(hVar)));
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        gxi.j jVar = (gxi.j) this.f138986b;
        gxi.e eVar = (gxi.e) this.f138987c;
        CheckoutRevPayControllerExtensionContract$CheckoutPrice price = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(price, "price");
        return RowDelegate.Model.x(q.c(jVar.f147756a, eVar.f147748a, true, md6.s.c(eVar, price.f99069b) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS, false, 24), null, null, null, null, null, 0, null, false, null, price.f99070c, 0, 0, 0, 0, null, -4194305, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    private final Object t(Object obj2, Object obj3, Object obj4) {
        ActionsView.Item item;
        Collection collectionA;
        h2j.i iVar = (h2j.i) this.f138986b;
        h2j.w wVar = (h2j.w) this.f138987c;
        h2j.h hVar = (h2j.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List list = hVar.f148827a;
        List list2 = hVar.f148828b;
        aim.e eVarB = u.b();
        xi0.b bVar = iVar.f148831b;
        xi0.b bVar2 = iVar.d;
        aim.e eVarB2 = u.b();
        eVarB2.addAll(d0.V0(list2, 3));
        if (!eVarB2.contains(bVar)) {
            eVarB2.add(bVar);
        }
        if (bVar2 != null && !eVarB2.contains(bVar2)) {
            eVarB2.add(bVar2);
        }
        aim.e eVarA = u.a(eVarB2);
        Object[] objArr = 0;
        if (eVarA.size() < 2) {
            collectionA = f0.f322471a;
        } else {
            aim.e eVarB3 = u.b();
            eVarB3.add(new ListSubheaderDelegate.Model("TITLE_CURRENCY_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_currency_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
            ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar3 = (aim.b) listIterator;
                if (!bVar3.hasNext()) {
                    break;
                }
                xi0.b bVar4 = (xi0.b) bVar3.next();
                String str = bVar4.f306286a;
                CurrencyClause currencyClause = new CurrencyClause(bVar4, CurrencyClause.Format.Ticker.f57756a, null, 4);
                List list3 = list2;
                CurrencyImage currencyImage = new CurrencyImage(bVar4.f306286a, wVar.f148855c, (TextLocalisedClause) (objArr == true ? 1 : 0), 10);
                mx0.d dVar = bVar4.equals(bVar) ? mx0.d.ACCENT : mx0.d.SEMIBLACK;
                List listK = v.k(new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_currency_title, null, null, 14), new TextClause(bVar4.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                m70.a.t(t0.f186434a);
                arrayList.add(new ActionsView.Item(str, dVar, false, null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), currencyClause, currencyImage, null, null, null, false, null, null, bVar4, null, 23436));
                list2 = list3;
            }
            if (list2.size() > 3) {
                xi0.b.Companion.getClass();
                xi0.b bVar5 = xi0.b.f306271c;
                item = new ActionsView.Item(bVar5.f306286a, mx0.d.SEMIBLACK, false, null, null, new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.currency_picker_section_target_more_title, null, null, 14), null, null, null, null, false, null, null, bVar5, null, 24476);
            } else {
                item = null;
            }
            List listP = i2b.a.p(arrayList, item);
            mx0.l lVar = mx0.l.SCROLLABLE;
            int i = R$attr.uikit_dp8;
            eVarB3.add(new z("CURRENCIES_FILTER", listP, null, lVar, i, i, 68));
            eVarB3.add(new TextDelegate.Model("TITLE_CURRENCY_SUBTITLE", new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_currency_subtitle, u.c(new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4)), null, 12), false, new ak0(yj0.START, null, 2), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
            collectionA = u.a(eVarB3);
        }
        eVarB.addAll(collectionA);
        Map map = iVar.f148833g;
        j1j.d dVar2 = iVar.f148832c;
        String str2 = dVar2 != null ? dVar2.f170617a : null;
        j1j.b bVar6 = iVar.i;
        List list4 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((k1j.b) it8.next()).f180284c);
        }
        ArrayList arrayListE = wVar.f148853a.e(map, w.u(arrayList2), str2, bVar6);
        if (arrayListE.isEmpty()) {
            eVarB.addAll(iii.c.c(5));
        } else {
            eVarB.addAll(arrayListE);
            eVarB.addAll(iVar.k);
            List listV = zjh.j.v(wVar.f148854b, iVar.f148835j);
            int i2 = R$attr.uikit_dp24;
            yp0.b.q(listV, i2, i2, 0, 0, 12);
            eVarB.addAll(listV);
        }
        return new h2j.l(u.a(eVarB), iVar.f148834h, u1j.c.a(iVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fyg.b.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        List listC;
        h43.u uVar = (h43.u) this.f138986b;
        ia3.r rVar = uVar.f149310a;
        h43.n nVar = (h43.n) this.f138987c;
        m content = (m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.f149291a.isEmpty()) {
            listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_cards_list_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_cards_list_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D010", null, null, null, 30)), new l6(8, new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_cards_list_empty_state_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
        } else {
            h93.f0 f0Var = nVar.f149295b;
            boolean z = nVar.f149296c;
            ArrayList<h93.f0> arrayList = content.f149291a;
            int i = 10;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (h93.f0 f0Var2 : arrayList) {
                boolean z3 = h0.h(f0Var2, content.f149293c) != null;
                boolean zE = h0.e(f0Var2);
                String strQ = j6.a.q("selectable_", f0Var2.f150110a);
                yt8.i iVar = content.f149292b.f316662a;
                arrayList2.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(f0Var2.f150110a, new RowDelegate.Model.MainImage.Image40(((ia3.t) uVar.f149311b).d(f0Var2, true), rVar.j(f0Var2, iVar, null), null, false, 28), m93.f.b(rVar, f0Var2, null, Boolean.valueOf(z), i), null, 0, z3 ? new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_cards_list_card_already_linked, null, null, 14) : rVar.m(f0Var2, iVar, null), null, null, 0, null, false, null, false, null, null, null, null, null, null, f0Var2, null, 0, 0, 0, 0, 532676568), Intrinsics.f(f0Var, f0Var2) ? qd0.SELECTED : qd0.UNSELECTED, (z3 || zE) ? new SelectableDelegate.b.a(false) : SelectableDelegate.b.C0424b.f53319a, vd0.RADIO, false, null, null, null, false, 32736));
                i = 10;
            }
            listC = d0.E0(u.c(new RowDelegate.Model("ADD_NEW_CARD_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_link_card_cards_list_add_new_card, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904)), arrayList2);
        }
        List list = listC;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        h74.r rVar = (h74.r) this.f138986b;
        h74.a aVar = (h74.a) this.f138987c;
        lu3.c content = (lu3.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ax4.b bVar = aVar.f149841a;
        String str = content.f200016a;
        List list = content.f200018c;
        TextLocalisedClause textLocalisedClauseA = h74.r.a(str);
        String str2 = content.f200017b;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.consents_template_documents_action, u.c(new TextClause(content.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        boolean z = false;
        if (ix4.b.a(list, bVar)) {
            ArrayList<e1> arrayListG = d9.e1.g(list, h74.q.f149860a);
            ArrayList arrayList = new ArrayList(w.t(arrayListG, 10));
            for (e1 e1Var : arrayListG) {
                if (e1Var == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.NestedConsentItem");
                }
                arrayList.add((p3) e1Var);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (((p3) obj5).i) {
                    arrayList2.add(obj5);
                }
            }
            if (arrayList2.isEmpty() || arrayList2.isEmpty()) {
                z = true;
            } else {
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    if (!bVar.d.contains(((p3) it8.next()).f120711a)) {
                        break;
                    }
                }
                z = true;
            }
        }
        boolean z3 = z;
        List listL = v.l(content.f200019g != null ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_DOWNLOAD_ACTION", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null);
        ArrayList arrayListB = rVar.f149861a.b(list, bVar);
        String str3 = content.d;
        return new h74.h(i2b.a.o(arrayListB, v.l(str3 != null ? new TextDelegate.Model("disclaimer", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.consents_template_documents_disclaimer, prk.o.v(0, 30, null, null, str3), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null)), textLocalisedClauseA, textClause, textLocalisedClause, listL, true, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [aw0.s5] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        dj0.d value;
        ?? s5Var;
        Clause textLocalisedClause;
        Clause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        int i;
        char c2;
        int i2 = this.f138985a;
        Object obj5 = this.f138987c;
        Object obj6 = this.f138986b;
        switch (i2) {
            case 0:
                g gVar = (g) obj6;
                xi0.b bVar = (xi0.b) obj5;
                jzg.a allocationData = (jzg.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(allocationData, "allocationData");
                if (allocationData.f179809a.isEmpty()) {
                    return gVar.a(bVar);
                }
                gVar.getClass();
                List list = allocationData.f179809a;
                if (list.size() > 12) {
                    List list2 = list;
                    Iterator it8 = list2.iterator();
                    if (!it8.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it8.next();
                    if (it8.hasNext()) {
                        long j2 = ((wxg.m) next).getValue().f115082a;
                        do {
                            Object next2 = it8.next();
                            long j3 = ((wxg.m) next2).getValue().f115082a;
                            if (j2 < j3) {
                                next = next2;
                                j2 = j3;
                            }
                        } while (it8.hasNext());
                    }
                    dj0.d value2 = ((wxg.m) next).getValue();
                    List listV = d0.V(list2, 11);
                    dj0.d.Companion.getClass();
                    dj0.d value3 = dj0.d.e;
                    int i3 = 0;
                    for (Object obj7 : listV) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            v.s();
                            throw null;
                        }
                        value3 = i3 == 0 ? ((wxg.m) obj7).getValue() : pyd.c.O(value3, ((wxg.m) obj7).getValue());
                        i3 = i5;
                    }
                    value = (dj0.d) cim.c.k(value2, value3);
                } else {
                    Iterator it9 = list.iterator();
                    if (!it9.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next3 = it9.next();
                    if (it9.hasNext()) {
                        long j5 = ((wxg.m) next3).getValue().f115082a;
                        do {
                            Object next4 = it9.next();
                            long j16 = ((wxg.m) next4).getValue().f115082a;
                            if (j5 < j16) {
                                next3 = next4;
                                j5 = j16;
                            }
                        } while (it9.hasNext());
                    }
                    value = ((wxg.m) next3).getValue();
                }
                dj0.d dVar = value;
                long j22 = 0;
                dj0.d dVar2 = new dj0.d(0L, dVar.f115083b);
                List list3 = list;
                dj0.d.Companion.getClass();
                dj0.d value4 = dj0.d.e;
                int i6 = 0;
                for (Object obj8 : list3) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        v.s();
                        throw null;
                    }
                    value4 = i6 == 0 ? ((wxg.m) obj8).getValue() : pyd.c.O(value4, ((wxg.m) obj8).getValue());
                    i6 = i21;
                }
                dj0.d dVarK = pyd.c.k(value4, list.size());
                boolean z = list.size() > 12;
                List listV0 = z ? d0.V0(list3, 11) : list;
                ArrayList arrayList = new ArrayList(w.t(listV0, 10));
                int i22 = 0;
                for (Object obj9 : listV0) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        ?? r242 = arrayList;
                        v.s();
                        throw r242;
                    }
                    wxg.m mVar = (wxg.m) obj9;
                    long j42 = j22;
                    String strN = a0.d.n("BAR_CHART_LIST_ID-", i22);
                    i5 i5Var = j5.Companion;
                    Image imageA = gVar.f138993c.a(mVar, true);
                    i5Var.getClass();
                    j5 j5Var = new j5(imageA);
                    b5 b5Var = c5.Companion;
                    List listC = u.c(new f5(mVar.getValue().f115082a, R$attr.uikit_colorAccentNeutral));
                    b5Var.getClass();
                    arrayList.add(new e5(strN, j5Var, u.c(b5.a(listC)), false, new d(mVar, mVar.getValue()), 56));
                    j22 = j42;
                    i22 = i32;
                    arrayList = arrayList;
                    list3 = list3;
                }
                List list4 = list3;
                long j46 = j22;
                ?? r243 = arrayList;
                ArrayList arrayListF1 = d0.f1(arrayList);
                if (z) {
                    List listV2 = d0.V(list4, 11);
                    dj0.d.Companion.getClass();
                    dj0.d value5 = dj0.d.e;
                    int i33 = 0;
                    for (Object obj10 : listV2) {
                        int i43 = i33 + 1;
                        if (i33 < 0) {
                            v.s();
                            throw r243;
                        }
                        value5 = i33 == 0 ? ((wxg.m) obj10).getValue() : pyd.c.O(value5, ((wxg.m) obj10).getValue());
                        i33 = i43;
                    }
                    i5 i5Var2 = j5.Companion;
                    LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_more_dots, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 2.0f, Float.valueOf(24.0f), null, 32);
                    i5Var2.getClass();
                    j5 j5Var2 = new j5(layeredImageB);
                    b5 b5Var2 = c5.Companion;
                    List listC2 = u.c(new f5(value5.f115082a, R$attr.uikit_colorAccentNeutral));
                    b5Var2.getClass();
                    arrayListF1.add(new e5("BAR_CHART_OTHERS_LIST_ID", j5Var2, u.c(b5.a(listC2)), false, new c(value5), 56));
                }
                d5 d5VarE = gVar.f138992b.e();
                aim.e eVarB = u.b();
                eVarB.add(new a5(BitmapDescriptorFactory.HUE_RED, new MoneyClause(dVar2, new MoneyClause.Format.Shorts(false, 63), null, null, 12), z4.SOLID));
                long j47 = dVar.f115082a;
                if (j47 > j46) {
                    eVarB.add(new a5(j47, new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12), z4.DASHED));
                }
                t5 t5Var = new t5(u.a(eVarB));
                if (((Boolean) gVar.e.getValue()).booleanValue() || list.size() <= 1) {
                    s5Var = r243;
                } else {
                    r5 r5Var = s5.Companion;
                    float f = dVarK.f115082a;
                    CompositeClause text = yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new MoneyClause(dVarK, new MoneyClause.Format.Shorts(false, 63), null, null, 12), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_avg, r243, r243, 14)));
                    int i59 = R$attr.uikit_colorAccentNeutral;
                    r5Var.getClass();
                    Intrinsics.checkNotNullParameter(text, "text");
                    s5Var = new s5(f, text, i59, Integer.valueOf(i59));
                }
                int i66 = R$attr.uikit_dp16;
                return u.c(new ui("BAR_CHART_LIST_ID", arrayListF1, null, t5Var, false, s5Var, d5VarE, i66, i66, i66, 13516));
            case 1:
                fzd.w wVar = (fzd.w) obj6;
                fzd.j jVar = (fzd.j) obj5;
                CustomisationParameters parameters = (CustomisationParameters) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                mzd.d dVar3 = wVar.f139168b;
                aim.e eVarB2 = u.b();
                CellDetailsSwitcherDelegate.Model model = new CellDetailsSwitcherDelegate.Model("ID_HIDE_BALANCES_SWITCH", new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_hide_balances, null, null, 14), jVar.f139144b.getHideBalances(), true, 0, null, null, null, 4080);
                CustomisationSelection customisationSelection = jVar.f139144b;
                Locale language = customisationSelection.getLanguage();
                if (language == null) {
                    language = Locale.ENGLISH;
                }
                Intrinsics.h(language);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_language, null, null, 14);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                String displayLanguage = language.getDisplayLanguage();
                Intrinsics.checkNotNullExpressionValue(displayLanguage, "getDisplayLanguage(...)");
                CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("ID_LANGUAGE", textLocalisedClause4, 0, resourceImage, new TextClause(displayLanguage, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, null, 0, 0, 32736);
                xi0.b currency = customisationSelection.getCurrency();
                if (currency == null) {
                    xi0.b.Companion.getClass();
                    currency = xi0.b.f306272g;
                }
                List listK = v.k(model, model2, new CellDetailsActionDelegate.Model("ID_DISPLAY_CURRENCY", new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_display_currency, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new CurrencyClause(currency, null, null, 6), false, false, null, null, 0, 0, 32736));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                List<Product> listV02 = d0.V0(d0.P0(parameters.getProducts(), new bm8.a(wVar, jVar, 9)), 3);
                List arrayList2 = new ArrayList();
                for (Product product : listV02) {
                    a0.x(wVar.f139167a.a(product, customisationSelection.getExpandedProducts().contains(product.getType()), customisationSelection.getProductSelection()), arrayList2);
                }
                LargeActionButtonDelegate.Model modelB = fzd.w.b("ID_PRODUCT_SEE_ALL");
                if (parameters.getProducts().size() > 3 && (arrayList2 = d0.d1(d0.j1(arrayList2, u.c(modelB)))) == null) {
                    arrayList2 = f0.f322471a;
                }
                List list5 = arrayList2;
                List<Product> products = parameters.getProducts();
                int selectionCount = customisationSelection.getProductSelection().getSelectionCount();
                if (selectionCount > 0) {
                    List<Product> list6 = products;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj11 : list6) {
                        if (((Product) obj11).getElements().isEmpty()) {
                            arrayList3.add(obj11);
                        }
                    }
                    int size = arrayList3.size();
                    ArrayList arrayList4 = new ArrayList(w.t(list6, 10));
                    Iterator it10 = list6.iterator();
                    while (it10.hasNext()) {
                        arrayList4.add(((Product) it10.next()).getElements());
                    }
                    List listK2 = v.k(new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_accounts_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_amount_with_total, v.k(Integer.valueOf(selectionCount), Integer.valueOf(w.u(arrayList4).size() + size)), null, 12));
                    m70.a.a(t0.f186434a);
                    textLocalisedClause = new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_accounts_title, null, null, 14);
                }
                eVarB2.addAll(yp0.b.g(list5, new ListSubheaderDelegate.Model("ID_PRODUCT_HEADER", (Image) null, textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                List<SelectableOption> transactionDirections = parameters.getTransactionDirections();
                Set<String> selectedTransactionDirections = customisationSelection.getSelectedTransactionDirections();
                List<SelectableOption> list7 = transactionDirections;
                ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                for (SelectableOption selectableOption : list7) {
                    boolean zContains = selectedTransactionDirections.contains(selectableOption.getType());
                    Intrinsics.checkNotNullParameter(selectableOption, "selectableOption");
                    arrayList5.add(dVar3.a("ID_TRANSACTION_DIRECTION_SELECTABLE_", "ID_TRANSACTION_DIRECTION_ITEM_", selectableOption, zContains));
                }
                eVarB2.addAll(yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("ID_TRANSACTION_DIRECTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_transactions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                List<SelectableOption> transactionCategories = parameters.getTransactionCategories();
                Set<String> selectedCategories = customisationSelection.getSelectedCategories();
                List<SelectableOption> listV03 = d0.V0(d0.P0(transactionCategories, new e23.c(2, selectedCategories)), 3);
                ArrayList arrayList6 = new ArrayList(w.t(listV03, 10));
                for (SelectableOption selectableOption2 : listV03) {
                    boolean zContains2 = selectedCategories.contains(selectableOption2.getType());
                    Intrinsics.checkNotNullParameter(selectableOption2, "selectableOption");
                    arrayList6.add(dVar3.a("ID_TRANSACTION_CATEGORY_SELECTABLE_", "ID_TRANSACTION_CATEGORY_ITEM_", selectableOption2, zContains2));
                }
                LargeActionButtonDelegate.Model modelB2 = fzd.w.b("ID_TRANSACTION_CATEGORIES_SEE_ALL");
                List list8 = arrayList6;
                if (transactionCategories.size() > 3) {
                    List listD1 = d0.d1(d0.j1(arrayList6, u.c(modelB2)));
                    list8 = listD1;
                    if (listD1 == null) {
                        list8 = f0.f322471a;
                    }
                }
                eVarB2.addAll(yp0.b.g(list8, new ListSubheaderDelegate.Model("ID_TRANSACTION_CATEGORIES_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_categories_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                aim.e eVarA = u.a(eVarB2);
                int size2 = customisationSelection.getSelectedTransactionDirections().size() + customisationSelection.getSelectedCategories().size() + customisationSelection.getProductSelection().getSelectionCount();
                if (size2 > 0) {
                    List listK3 = v.k(new TextLocalisedClause(R.string.common_action_apply, null, null, 14), new TextClause(String.valueOf(size2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    m70.a.a(t0.f186434a);
                    textLocalisedClause2 = new CompositeClause(listK3, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else {
                    textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_apply, null, null, 14);
                }
                return new fzd.m(textLocalisedClause2, eVarA, true);
            case 2:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0(zjh.j.v(((b0) obj6).f139261b, ((g03.a) obj5).d), (List) pair.f186385a);
            case 3:
                g1k.w wVar2 = (g1k.w) obj6;
                g1k.d dVar4 = (g1k.d) obj5;
                List<g1k.e> groupedNews = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(groupedNews, "groupedNews");
                if (groupedNews.isEmpty()) {
                    FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("ALL_NEWS_EMPTY_STATE", (!dVar4.f139687a.isEmpty() || (wVar2.f139711a.f101859a instanceof WealthNewsFilter.ByMarket)) ? new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_tab_screen_top_stories_empty, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_tab_screen_stocks_empty, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_newspaper, null, null, 6)), null, null, false, null, null, null, 2020);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    return u.c(model3);
                }
                ArrayList arrayList7 = new ArrayList();
                for (g1k.e eVar : groupedNews) {
                    long jF = oc.c.F(eVar.f139690a);
                    a0.x(yp0.b.g(wVar2.f139713c.a(eVar.f139691b), new ListSubheaderDelegate.Model(p.a.m(jF, "ALL_NEWS_GROUP_DATE_"), (Image) null, (Clause) new TimeClause(jF, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList7);
                }
                List[] elements = {arrayList7, zBooleanValue ? g1k.w.a() : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return w.u(kotlin.collections.d.L(elements));
            case 4:
                return a(obj2, obj3, obj4);
            case 5:
                e2f.n nVar = (e2f.n) obj5;
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                u2f.d dVar5 = (u2f.d) pair2.f186385a;
                od0.i iVar = (od0.i) pair2.f186386b;
                List list9 = (List) ((Function2) obj6).invoke(dVar5, nVar.f122076b);
                String str = dVar5.f276623l;
                ArrayList arrayList8 = dVar5.f276625n;
                List listC3 = u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), null, null, null));
                UrlImage urlImage = new UrlImage(dVar5.f276621h, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 40, 40, false, false, 409598);
                TextClause textClause = new TextClause(dVar5.f276619c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TradeRevPointsAccount tradeRevPointsAccount = (TradeRevPointsAccount) iVar.f224257a;
                Clause compositeClause = tradeRevPointsAccount != null ? new CompositeClause(v.k(new TextClause(dVar5.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(tradeRevPointsAccount.f91183c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12) : new TextClause(dVar5.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                List listL = v.l(nVar.f122077c.getContent());
                String str2 = dVar5.o;
                e2f.o oVar = new e2f.o(listC3, urlImage, textClause, compositeClause, listL, (str2 == null || kotlin.text.d0.W(str2)) ? f0.f322471a : u.c(new ActionsView.Item("NAV_BAR_ACTION_ID_VISIT_WEB", mx0.d.WHITE_OR_BLACK, false, null, null, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_airline_details_header_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, str2, null, 24476)));
                if (arrayList8.size() != 1 || (i = g2f.c.f140043a[((u2f.l) d0.b0(arrayList8)).ordinal()]) == 1 || i == 2) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.miles_airline_details_footer_action, null, null, 14);
                } else if (i == 3) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_footer_revpay_action, u.c(dVar5.f276619c), null, 12);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_footer_giftcards_action, null, null, 14);
                }
                return new y(list9, oVar, new e2f.m(textLocalisedClause3, true));
            case 6:
                return b(obj2, obj3, obj4);
            case 7:
                g57.r rVar = (g57.r) obj5;
                g57.f fVar = (g57.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fVar, "<destruct>");
                od0.i vatReminder = fVar.f140668a;
                fs6.e eVar2 = fVar.f140669b;
                g57.g vatReminderSettings = ((g57.h) obj6).f140674b;
                if (vatReminderSettings == null) {
                    return g57.r.d();
                }
                boolean z3 = vatReminderSettings.f140670a;
                Month month = vatReminderSettings.f140672c;
                fs6.b bVar2 = vatReminderSettings.f140671b;
                g57.n nVarB = g57.r.b();
                aim.e eVarB3 = u.b();
                RowDelegate.Model model4 = new RowDelegate.Model("LIST_ID_ENABLE_REMINDERS", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_reminder_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_reminder_subtitle, null, null, 14), null, null, 0, new vf(z3, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                eVarB3.add(model4);
                if (z3) {
                    c2 = 1;
                    RowDelegate.Model model5 = new RowDelegate.Model("LIST_ID_ASSESSMENT_PERIOD", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_assessment_period_title, null, null, 14), null, 0, d57.c.a(bVar2), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
                    yp0.b.l(model5, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_assessment_period_footer, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                    int i74 = R$attr.uikit_dp0;
                    PlainTextDelegate.Model model6 = new PlainTextDelegate.Model("LIST_ID_ASSESSMENT_PERIOD_INFO", (Clause) null, (Clause) textLocalisedClause5, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, i74, i74, 0, 0, 53230);
                    int i92 = R$attr.uikit_dp16;
                    yp0.b.r(model6, R$attr.uikit_dp2, 0, i92, i92, 2);
                    eVarB3.addAll(v.k(model5, model6));
                } else {
                    c2 = 1;
                }
                if (z3 && eVar2.f137605c.contains(fs6.a.CLOSING_MONTH)) {
                    RowDelegate.Model model7 = new RowDelegate.Model("LIST_ID_ACCOUNT_PERIOD", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_closing_month_title, null, null, 14), null, 0, month != null ? rVar.f140685a.a(month) : null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
                    yp0.b.l(model7, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_closing_month_footer_message, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_reminder_setup_item_closing_month_footer_sing_in, null, new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "CLAUSE_ID_HMRC_SIGN_IN", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    int i96 = R$attr.uikit_dp0;
                    PlainTextDelegate.Model model8 = new PlainTextDelegate.Model("LIST_ID_ACCOUNT_PERIOD_INFO", (Clause) null, (Clause) textLocalisedClause6, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, i96, i96, 0, 0, 53230);
                    int i99 = R$attr.uikit_dp16;
                    yp0.b.r(model8, R$attr.uikit_dp2, 0, i99, i99, 2);
                    koi.j[] jVarArr = new koi.j[2];
                    jVarArr[0] = model7;
                    jVarArr[c2] = model8;
                    eVarB3.addAll(v.k(jVarArr));
                }
                aim.e eVarA2 = u.a(eVarB3);
                Intrinsics.checkNotNullParameter(vatReminder, "vatReminder");
                Intrinsics.checkNotNullParameter(vatReminderSettings, "vatReminderSettings");
                return new g57.o(nVarB, eVarA2, g57.r.a(vatReminder.d() ? (((FreelancerVatReminder) vatReminder.c()).f73498b == z3 && ((FreelancerVatReminder) vatReminder.c()).f73499c == bVar2 && ((FreelancerVatReminder) vatReminder.c()).d == month) ? 0 : c2 : z3));
            case 8:
                g62.n nVar2 = (g62.n) obj5;
                a12.j jVar2 = nVar2.f140834a;
                g62.e content = (g62.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                aim.e eVarB4 = u.b();
                if (((g62.d) obj6).f140816b) {
                    eVarB4.add(((s12.f) jVar2).d(ApmIris.f61811c.e()));
                }
                eVarB4.addAll(((s12.a) nVar2.f140835b).a(content.f140817a));
                eVarB4.addAll(((s12.i) nVar2.f140836c).a(content.f140818b));
                eVarB4.addAll(((s12.f) jVar2).b(v.k(g62.a.Settings, g62.a.Help)));
                return u.a(eVarB4);
            case 9:
                return c(obj2, obj3, obj4);
            case 10:
                return d(obj2, obj3, obj4);
            case 11:
                return e(obj2, obj3, obj4);
            case 12:
                return g(obj2, obj3, obj4);
            case 13:
                return h(obj2, obj3, obj4);
            case 14:
                return i(obj2, obj3, obj4);
            case 15:
                return j(obj2, obj3, obj4);
            case 16:
                return k(obj2, obj3, obj4);
            case 17:
                return l(obj2, obj3, obj4);
            case 18:
                return m(obj2, obj3, obj4);
            case 19:
                return n(obj2, obj3, obj4);
            case 20:
                return o(obj2, obj3, obj4);
            case 21:
                return p(obj2, obj3, obj4);
            case 22:
                return q(obj2, obj3, obj4);
            case 23:
                return r(obj2, obj3, obj4);
            case 24:
                return s(obj2, obj3, obj4);
            case 25:
                return t(obj2, obj3, obj4);
            case 26:
                return u(obj2, obj3, obj4);
            case 27:
                return v(obj2, obj3, obj4);
            case 28:
                return w(obj2, obj3, obj4);
            default:
                h87.s sVar = (h87.s) obj6;
                h87.i iVar2 = (h87.i) obj5;
                List collection = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(collection, "collection");
                List list10 = collection;
                ArrayList arrayList9 = new ArrayList(w.t(list10, 10));
                Iterator it11 = list10.iterator();
                while (it11.hasNext()) {
                    arrayList9.add(sVar.f149965a.a((vel.f) it11.next()));
                }
                ArrayList arrayList10 = !arrayList9.isEmpty() ? arrayList9 : null;
                if (arrayList10 != null) {
                    return yp0.b.g(arrayList10, sVar.a(iVar2.f149955a, true), null, 0, 0, 126);
                }
                return null;
        }
    }

    public /* synthetic */ b(Function2 function2, e2f.n nVar, g2f.d dVar) {
        this.f138985a = 5;
        this.f138986b = function2;
        this.f138987c = nVar;
    }
}
