package koe;

import android.os.Parcelable;
import aw0.i9;
import aw0.k7;
import aw0.o9;
import aw0.r2;
import aw0.x4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.delegates.db;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.fa;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vi;
import com.revolut.core.ui_kit.delegates.wa;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ya;
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
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
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
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.insurance.api.models.details.CFACCoverage;
import com.revolut.feature.insurance.api.models.details.CFACCoverageType;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.retail.feature.crypto.asset_details.api.R$plurals;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$Parcel$FaqParcel;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import hha.u0;
import ip0.ak0;
import ip0.ck0;
import ip0.ej;
import ip0.ju;
import ip0.ku;
import ip0.l1;
import ip0.mu;
import ip0.r10;
import ip0.t10;
import ip0.xk;
import ip0.yj0;
import ip0.zj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.j0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kp0.b1;
import kp0.e1;
import ku1.i0;
import kye.l0;
import ms0.e4;
import ms0.h4;
import ms0.i4;
import mx0.c7;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.icao.DG11File;
import org.joda.time.LocalDate;
import tx0.r3;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f186337c;

    public /* synthetic */ y(Object obj2, Object obj3, int i) {
        this.f186335a = i;
        this.f186336b = obj2;
        this.f186337c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model model;
        char c2;
        CellDetailsDelegate.Model model2;
        BigDecimal bigDecimal;
        CellDetailsDelegate.Model model3;
        List listB;
        Address address;
        l9j.n nVar = (l9j.n) this.f186336b;
        l9j.f fVar = (l9j.f) this.f186337c;
        l9j.g earningDetails = (l9j.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(earningDetails, "earningDetails");
        StakingPocket stakingPocket = fVar.f193254a;
        cd5.d dVar = nVar.f193268a;
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        TextClause textClause = bd5.a.f14530a;
        Intrinsics.checkNotNullParameter(stakingPocket, "<this>");
        dj0.d dVar2 = stakingPocket.f88085h;
        dj0.d dVar3 = stakingPocket.f88084g;
        HeaderDelegate.Model model4 = new HeaderDelegate.Model("TOTAL_BALANCE_SECTION_LIST_ITEM_ID", null, new r2((pyd.c.M(dVar2).f115082a != 0 || dVar3.f115082a == 0) ? new MoneyClause(pyd.c.M(dVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : yoj.b.w(bd5.a.f14530a, new MoneyClause(pyd.c.M(dVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null), new TextLocalisedClause(R$string.crypto_asset_details_section_investment_total_value, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 15090);
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("BALANCE_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.crypto_asset_details_currency_account_value_staked_balance, null, null, 14), new MoneyClause(stakingPocket.f88083c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        if (stakingPocket.e.k()) {
            model = null;
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_asset_details_section_investment_locked_balance, null, null, 14);
            List listK = zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new MoneyClause(stakingPocket.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8));
            m70.a.t(t0.f186434a);
            model = new CellDetailsDelegate.Model("LOCKED_BALANCE_CELL_DETAILS_LIST_ID", textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), 0, new oc5.b(stakingPocket), null, null, null, null, false, 0, 0, 32744);
        }
        ej0.b bVar = earningDetails.f193259c;
        ej0.b bVar2 = earningDetails.f193258b;
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        if (bVar == null || bVar2 == null || dVar3.k()) {
            c2 = 1;
            model2 = null;
        } else {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_asset_details_section_investment_unrealised_return, null, null, 14);
            c2 = 1;
            Clause[] elements = {dVar.f23192a.a(dVar3, bVar2, bVar), dVar.f23193b.f(bVar, bVar2)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            model2 = new CellDetailsDelegate.Model("UNREALISED_RETURN_CELL_DETAILS_LIST_ID", textLocalisedClause2, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        qv0.i[] elements2 = new qv0.i[4];
        elements2[0] = model4;
        elements2[c2] = model5;
        elements2[2] = model;
        elements2[3] = model2;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = kotlin.collections.d.L(elements2);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        StakingPocket stakingPocket2 = fVar.f193254a;
        do3.n nVar2 = fVar.d;
        wi0.b bVarG = (nVar2 == null || (address = nVar2.k) == null) ? null : nz8.d.g(address);
        s0 s0Var = new s0(3);
        wwd.d dVar4 = nVar.f193270c;
        StakingProduct stakingProduct = stakingPocket2.f88082b;
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        StakingModes.Manual manual = stakingProduct.f88088c.f88071a;
        if (manual == null || (bigDecimal = manual.f88076a) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        Intrinsics.h(bigDecimal);
        s0Var.a(dVar4.a(bigDecimal, stakingProduct, bVarG, new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_tier_rates_locked_earn_rate, null, null, 14)));
        vtd.c cVar = earningDetails.f193257a;
        qv0.i[] iVarArr = (cVar == null || (listB = nVar.f193269b.b(cVar, stakingProduct)) == null) ? null : (qv0.i[]) listB.toArray(new qv0.i[0]);
        if (iVarArr == null) {
            iVarArr = new qv0.i[0];
        }
        s0Var.b(iVarArr);
        Intrinsics.checkNotNullParameter(stakingPocket2, "stakingPocket");
        StakingModes.Manual manual2 = stakingProduct.f88088c.f88071a;
        if (manual2 != null) {
            int i = manual2.f88078c;
            ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_lock_closed, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.crypto_asset_details_staking_countdown_value, Integer.valueOf(i), zhm.u.c(Integer.valueOf(i)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8);
            Clause[] clauseArr = new Clause[2];
            clauseArr[0] = imageClause;
            clauseArr[c2] = textLocalisedQuantityClause;
            model3 = new CellDetailsDelegate.Model("UNSTAKING_PERIOD_CLICKABLE_CELL_DETAILS_DELEGATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_details_unstaking_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(clauseArr)), null, null, false, 0, null, new oc5.f(stakingPocket2), null, null, 0, null, false, null, 0, 0, 0, 0, 1048040);
        } else {
            model3 = null;
        }
        s0Var.a(model3);
        ArrayList arrayList = s0Var.f186433a;
        List listM = zhm.v.m(arrayList.toArray(new qv0.i[arrayList.size()]));
        yp0.b.k(listM, 0, 0, 0, 0, 31);
        List listO = i2b.a.o(listL, listM);
        CellDetailsChevronDelegate.Model model6 = new CellDetailsChevronDelegate.Model("FAQ_CELL_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.feature_crypto_order_flow.api.R$string.cryptobuysell_order_detail_get_help_title, null, null, 14), 0, true, CryptoEarningScreenContract$Parcel$FaqParcel.f99989a, null, null, 2020);
        yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
        return i2b.a.p(listO, model6);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        boolean z;
        ActionsView.Item item;
        nbc.d dVar;
        o9 o9Var;
        CellDetailsDelegate.Model model;
        List listA;
        RowDelegate.Model modelG;
        Iterator it8;
        int i;
        lbc.n nVar;
        List list;
        Collection collectionA;
        Collection collectionC;
        Clause textClause;
        lbc.c0 c0Var = (lbc.c0) this.f186336b;
        lbc.m mVar = (lbc.m) this.f186337c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        wbc.m orderDetails = (wbc.m) rVar.f314201a;
        yac.e linkedTransactionContent = (yac.e) rVar.f314202b;
        boolean zIsEmpty = ((List) rVar.f314203c).isEmpty();
        boolean z3 = mVar.f;
        Set userToggledDeliveries = mVar.d;
        boolean z4 = mVar.e;
        nbc.d dVar2 = c0Var.f193631a;
        nbc.b bVar = dVar2.f214071a;
        wbc.h hVar = orderDetails.f296118g;
        List list2 = orderDetails.f296129w;
        TextClause textClause2 = new TextClause(hVar.f296108a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_subtitle;
        long j2 = orderDetails.f296123n;
        xi0.b bVar2 = orderDetails.f296122m;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(new MoneyClause(new dj0.d(j2, bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new TimeClause(oi0.d.R(orderDetails.f296117c), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12);
        Image imageA = kbc.c.a(orderDetails.f296118g.f296109b);
        String str = orderDetails.d;
        if (str != null) {
            z = zIsEmpty;
            item = new ActionsView.Item("ORDER_MANAGE_ACTION_LIST_ID", null, false, null, null, new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_manage, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new lbc.r(str), null, 24478);
        } else {
            z = zIsEmpty;
            item = null;
        }
        List listL = zhm.v.l(item);
        IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_ORDER_DETAILS_THREE_DOTS", new ResourceImage(R$drawable.uikit_icn_24_more_dots, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        if (z) {
            iconNavBarMenuItemA = null;
        }
        lbc.n nVar2 = new lbc.n(textClause2, textLocalisedClause, imageA, listL, zhm.v.l(iconNavBarMenuItemA));
        aim.e eVarB = zhm.u.b();
        xbc.b flightBooking = orderDetails.f296130x;
        if (flightBooking != null) {
            if (((jte.d) c0Var.f193633c).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails.f84599c)) {
                hbc.b bVar3 = (hbc.b) c0Var.f193632b;
                Intrinsics.checkNotNullParameter(flightBooking, "flightBooking");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.addAll(bVar3.e(flightBooking.e));
                CellDetailsActionDelegate.Model modelC = hbc.b.c(flightBooking);
                yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(modelC);
                eVarB.addAll(zhm.u.a(eVarB2));
            }
        }
        if (z4) {
            if (z3) {
                dVar = dVar2;
                l1 l1Var = new l1(new AppTipUIModel("ADD_TRACKING_WIDGET_TIP_ID", null, new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_add_widget_tip_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_add_widget_tip_subtitle, null, null, 14), new aw0.s(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_widgets, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)), null, null, null, 866));
                yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(l1Var);
            } else {
                dVar = dVar2;
            }
            Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
            Intrinsics.checkNotNullParameter(userToggledDeliveries, "userToggledDeliveries");
            List list3 = orderDetails.v;
            int size = list3.size();
            if (size == 0) {
                collectionC = f0.f322471a;
            } else if (size != 1) {
                collectionC = new ArrayList();
                Iterator it9 = list3.iterator();
                int i3 = 0;
                while (it9.hasNext()) {
                    Object next = it9.next();
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    Delivery delivery = (Delivery) next;
                    String str2 = delivery.f84640a;
                    wbc.c cVar = delivery.f84643g;
                    boolean z6 = cVar.a() != userToggledDeliveries.contains(str2);
                    aim.e eVarB3 = zhm.u.b();
                    Intrinsics.checkNotNullParameter(delivery, "delivery");
                    Iterator it10 = it9;
                    String str3 = "ORDER_DETAILS_DELIVERY_SUBHEADER_" + i5;
                    Set set = userToggledDeliveries;
                    boolean z11 = z6;
                    aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_delivery_index, zhm.u.c(Integer.valueOf(i5)), null, 12), (Image) new ResourceImage(z11 ? R$drawable.uikit_icn_16_chevron_down : R$drawable.uikit_icn_16_chevron_up, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28);
                    if (z11) {
                        textClause = bVar.d.e(cVar);
                    } else {
                        m70.a.c(t0.f186434a);
                        textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    eVarB3.add(new CellDetailsDelegate.Model(str3, t0Var, textClause, null, new lbc.t(delivery.f84640a), null, null, 0, null, false, true, null, null, 28600));
                    if (!z11) {
                        eVarB3.add(bVar.a(delivery));
                    }
                    aim.e eVarA = zhm.u.a(eVarB3);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    zhm.a0.x(eVarA, collectionC);
                    it9 = it10;
                    userToggledDeliveries = set;
                    i3 = i5;
                }
            } else {
                LinearProgressTrackingDelegate.Model modelA = bVar.a((Delivery) zhm.d0.b0(list3));
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                collectionC = zhm.u.c(modelA);
            }
            eVarB.addAll(collectionC);
        } else {
            dVar = dVar2;
        }
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        List list4 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        Iterator it11 = list4.iterator();
        int i6 = 0;
        while (it11.hasNext()) {
            Object next2 = it11.next();
            int i21 = i6 + 1;
            if (i6 < 0) {
                zhm.v.s();
                throw null;
            }
            wbc.f lineItem = (wbc.f) next2;
            Intrinsics.checkNotNullParameter(lineItem, "lineItem");
            String strN = a0.d.n("ORDER_DETAILS_LINE_ITEM_LIST_ID_", i6);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(zdc.a.a(lineItem.f296106b, lineItem.f296105a), null, null, false, zdc.a.b(Integer.valueOf(lineItem.e)), false, 44);
            TextClause textClause3 = new TextClause(lineItem.f296105a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            aim.e eVarB4 = zhm.u.b();
            List list5 = lineItem.d;
            TextClause textClause4 = list5.isEmpty() ? null : new TextClause(zhm.d0.k0(list5, " / ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            List list6 = lineItem.f296107c;
            if (list6.isEmpty()) {
                collectionA = f0.f322471a;
                it8 = it11;
                i = i21;
                nVar = nVar2;
                list = list4;
            } else {
                aim.e eVarB5 = zhm.u.b();
                Iterator it12 = list6.iterator();
                while (it12.hasNext()) {
                    Iterator it13 = it11;
                    wbc.l lVar = (wbc.l) it12.next();
                    int i22 = i21;
                    Iterator it14 = lVar.f296114b.iterator();
                    while (it14.hasNext()) {
                        Iterator it15 = it14;
                        wbc.j jVar = (wbc.j) it14.next();
                        eVarB5.add(new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_line_item_modifier_template, zhm.v.k(lVar.f296113a, Integer.valueOf(jVar.f296112b), jVar.f296111a), null, 12));
                        it12 = it12;
                        it14 = it15;
                        lVar = lVar;
                        list4 = list4;
                        nVar2 = nVar2;
                    }
                    i21 = i22;
                    it11 = it13;
                }
                it8 = it11;
                i = i21;
                nVar = nVar2;
                list = list4;
                collectionA = zhm.u.a(eVarB5);
            }
            if (textClause4 != null) {
                eVarB4.add(textClause4);
            }
            if (textClause4 != null && !collectionA.isEmpty()) {
                eVarB4.add(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            int i32 = 0;
            for (Object obj5 : collectionA) {
                int i33 = i32 + 1;
                if (i32 < 0) {
                    zhm.v.s();
                    throw null;
                }
                Clause clause = (Clause) obj5;
                if (i32 > 0) {
                    eVarB4.add(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                eVarB4.add(clause);
                i32 = i33;
            }
            List list7 = (List) ue0.e.M(zhm.u.a(eVarB4));
            arrayList.add(new RowDelegate.Model(strN, image40, textClause3, null, 0, list7 != null ? new CompositeClause(list7, null, null, null, 14) : null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(lineItem.f, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
            i6 = i;
            it11 = it8;
            list4 = list;
            nVar2 = nVar;
        }
        lbc.n nVar3 = nVar2;
        List list8 = list4;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        aim.e eVarB6 = zhm.u.b();
        eVarB6.add(new ListSubheaderDelegate.Model("ORDER_DETAILS_SUMMARY_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_summary_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        String orderNumber = orderDetails.f296116b;
        if (orderNumber != null) {
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("ORDER_DETAILS_ORDER_NUMBER_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_order_number, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_order_number_value, zhm.u.c(orderNumber), null, 12), false, false, null, new lbc.l(orderNumber), 0, 0, 32224);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB6.add(model2);
        }
        aim.e eVarB7 = zhm.u.b();
        Address address = orderDetails.f296121l;
        if (address != null) {
            String str4 = orderDetails.f296119h;
            Intrinsics.checkNotNullParameter(address, "address");
            aim.e eVarB8 = zhm.u.b();
            if (str4 != null) {
                eVarB8.add(str4);
            }
            eVarB8.add(o51.a.b(address, ((s80.b) bVar.f214068a).b()));
            eVarB7.add(new CellDetailsNoteDelegate.Model("ORDER_DETAILS_ADDRESS_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_delivery_address, null, null, 14), null, new TextClause(zhm.d0.k0(zhm.u.a(eVarB8), m70.a.o(t0.f186434a), null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        DeliveryMethods.DeliveryMethod deliveryMethod = orderDetails.k;
        if (deliveryMethod != null) {
            Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
            eVarB7.add(new CellDetailsDelegate.Model("ORDER_DETAILS_DELIVERY_METHOD_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_delivery_method, null, null, 14), (Image) null, 0, false, 30), new TextClause(deliveryMethod.f84738b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA2 = zhm.u.a(eVarB7);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB6.addAll(eVarA2);
        aim.e eVarB9 = zhm.u.b();
        Iterator it16 = list8.iterator();
        long j3 = 0;
        while (it16.hasNext()) {
            j3 += ((wbc.f) it16.next()).f.f115082a;
        }
        dj0.d productsTotal = new dj0.d(j3, bVar2);
        Iterator it17 = list8.iterator();
        int i43 = 0;
        while (it17.hasNext()) {
            i43 += ((wbc.f) it17.next()).e;
        }
        Intrinsics.checkNotNullParameter(productsTotal, "productsTotal");
        z92.f.a(eVarB9, i43 == 0 ? null : new CellDetailsDelegate.Model("ORDER_DETAILS_PRODUCTS_TOTAL_LIST_ID", new aw0.t0((Clause) (i43 > 1 ? new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_products_multiple, zhm.u.c(new NumberClause(i43, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12) : new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_products_single, null, null, 14)), (Image) null, 0, false, 30), new MoneyClause(productsTotal, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d discount = new dj0.d(-orderDetails.f296128t, bVar2);
        Intrinsics.checkNotNullParameter(discount, "discount");
        z92.f.a(eVarB9, discount.k() ? null : new CellDetailsDelegate.Model("ORDER_DETAILS_DISCOUNT_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_order_discount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(discount, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d subtotal = new dj0.d(orderDetails.f296127s, bVar2);
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_subtotal, null, null, 14), (Image) null, 0, false, 30);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 7);
        o9 o9Var2 = o9.NON_SENSITIVE;
        eVarB9.add(new CellDetailsDelegate.Model("ORDER_DETAILS_SUBTOTAL_LIST_ID", t0Var2, new MoneyClause(subtotal, defaults, null, o9Var2, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d taxAmount = new dj0.d(orderDetails.f296126r, bVar2);
        Intrinsics.checkNotNullParameter(taxAmount, "taxAmount");
        z92.f.a(eVarB9, taxAmount.k() ? null : new CellDetailsDelegate.Model("ORDER_DETAILS_INCLUDED_TAX_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_included_tax_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(taxAmount, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9Var2, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d serviceCharge = new dj0.d(orderDetails.f296125q, bVar2);
        Intrinsics.checkNotNullParameter(serviceCharge, "serviceCharge");
        z92.f.a(eVarB9, serviceCharge.k() ? null : new CellDetailsDelegate.Model("ORDER_DETAILS_SERVICE_CHARGE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_service_charge, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(serviceCharge, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9Var2, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        Long l2 = orderDetails.f296124p;
        dj0.d dVar3 = l2 != null ? new dj0.d(l2.longValue(), bVar2) : null;
        if (dVar3 == null || dVar3.k()) {
            o9Var = o9Var2;
            model = null;
        } else {
            o9Var = o9Var2;
            model = new CellDetailsDelegate.Model("ORDER_DETAILS_SHIPPING_COST_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_shipping, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9Var2, 4), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        z92.f.a(eVarB9, model);
        dj0.d orderTotal = new dj0.d(orderDetails.o, bVar2);
        Intrinsics.checkNotNullParameter(orderTotal, "orderTotal");
        eVarB9.add(new CellDetailsDelegate.Model("ORDER_DETAILS_TOTAL_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_order_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(orderTotal, new MoneyClause.Format.Defaults(null, null, false, false, 7), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9Var), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA3 = zhm.u.a(eVarB9);
        yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
        eVarB6.addAll(eVarA3);
        eVarB.addAll(zhm.u.a(eVarB6));
        dVar.getClass();
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        aim.e eVarB10 = zhm.u.b();
        eVarB10.add(new ListSubheaderDelegate.Model("ORDER_DETAILS_PAYMENT_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_payment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        aim.e eVarB11 = zhm.u.b();
        orderDetails.getClass();
        long j5 = -orderDetails.u;
        xi0.b bVar4 = orderDetails.f296122m;
        dj0.d redemptionAmount = new dj0.d(j5, bVar4);
        Intrinsics.checkNotNullParameter(redemptionAmount, "redemptionAmount");
        z92.f.a(eVarB11, redemptionAmount.k() ? null : new CellDetailsDelegate.Model("ORDER_DETAILS_REDEMPTION_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_rev_points_redemption, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(redemptionAmount, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d paidTotal = new dj0.d(orderDetails.f296123n, bVar4);
        Intrinsics.checkNotNullParameter(paidTotal, "paidTotal");
        eVarB11.add(new CellDetailsDelegate.Model("ORDER_DETAILS_PAID_TOTAL_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(paidTotal, new MoneyClause.Format.Defaults(null, null, false, false, 7), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA4 = zhm.u.a(eVarB11);
        yp0.b.k(eVarA4, 0, 0, 0, 0, 31);
        eVarB10.addAll(eVarA4);
        eVarB.addAll(zhm.u.a(eVarB10));
        Intrinsics.checkNotNullParameter(linkedTransactionContent, "linkedTransactionContent");
        if (linkedTransactionContent.f312009a.isEmpty()) {
            listA = f0.f322471a;
        } else {
            aim.e eVarB12 = zhm.u.b();
            eVarB12.add(new ListSubheaderDelegate.Model("ORDER_DETAILS_LINKED_TRANSACTIONS_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_order_details_linked_transactions, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp12, R$attr.uikit_dp4, 0, 0, 53242));
            List<yac.c> list9 = linkedTransactionContent.f312009a;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list9, 10));
            for (yac.c transaction : list9) {
                k71.q extraData = linkedTransactionContent.f312010b;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                if (transaction instanceof yac.a) {
                    modelG = ((anf.k) bVar.f214069b).p(((yac.a) transaction).f312005a, extraData, new thf.f(false, 3));
                } else {
                    if (!(transaction instanceof yac.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modelG = ((pyb.s) bVar.f214070c).g(((yac.b) transaction).f312007a, extraData, TimeClause.Format.TimeDefault.f57977b);
                }
                arrayList2.add(modelG);
            }
            eVarB12.addAll(arrayList2);
            listA = zhm.u.a(eVarB12);
            yp0.b.k(listA, 0, 0, 0, 0, 31);
        }
        eVarB.addAll(listA);
        return new lbc.u(nVar3, zhm.u.a(eVarB));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        lc6.c cVar = (lc6.c) this.f186336b;
        DonationSchedule donationSchedule = (DonationSchedule) this.f186337c;
        OrderQuote orderQuote = (OrderQuote) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        l4i.a aVar = cVar.f193799a;
        Clause[] elements = {new MoneyClause(l4i.a.b(orderQuote.e), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), ic6.c.a(donationSchedule)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new bw0.m(new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), bw0.l.INFO, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: koe.y.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ldk.a0 a0Var = (ldk.a0) this.f186336b;
        ldk.f fVar = (ldk.f) this.f186337c;
        xck.b layout = (xck.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        ldk.g gVarA = pdk.c.a(layout.d);
        yik.b bVar = a0Var.f194162b;
        String upperCase = layout.d.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        AnimatedBackgroundType animatedBackgroundTypeC = bVar.c(upperCase);
        aim.e eVarB = zhm.u.b();
        eVarB.add(pdk.d.a(layout.f304144c.toEpochMilli(), fVar.f194164b));
        eVarB.add(a0Var.f194161a.invoke(layout.f304142a));
        String faqId = layout.e;
        ArrayList additionalRewards = layout.f304143b;
        String termsUrl = layout.f;
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        aim.e eVarB2 = zhm.u.b();
        if (!additionalRewards.isEmpty()) {
            eVarB2.add(new CellDetailsChevronDelegate.Model("LIST_ID_CELL_DETAILS_SEE_ALL", new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_list_see_all, null, null, 14), f2.INTERNAL, R$attr.uikit_colorForeground, new ldk.t(additionalRewards), null, YearClass.CLASS_2016));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_list_learn_more, null, null, 14);
        int i = R$attr.uikit_colorForeground;
        f2 f2Var = f2.INTERNAL;
        eVarB2.add(new CellDetailsChevronDelegate.Model("LIST_ID_CELL_DETAILS", textLocalisedClause, f2Var, i, new ldk.u(faqId), null, YearClass.CLASS_2016));
        eVarB2.add(new CellDetailsChevronDelegate.Model("LIST_ID_CELL_DETAILS_OPT_OUT", new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_list_opt_out, null, null, 14), f2Var, R$attr.uikit_colorForeground, new ldk.v(termsUrl), null, YearClass.CLASS_2016));
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, R$attr.uikit_dp0, 0, 0, 29);
        eVarB.addAll(eVarA);
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        ej ejVar = new ej("LIST_ID_FOOTER_TEXT", new c7(new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_list_footer_v2, zhm.u.c(new TextLocalisedClause(com.revolut.retail.feature.plan_rewards.impl.R$string.premium_plan_reward_list_footer_terms, null, new Click(28, (Integer) null, (Object) new ldk.w(termsUrl), "ID_FOOTER_TEXT_TERMS", false), 10)), null, 12), false, null, 6));
        int i2 = R$attr.uikit_dp32;
        yp0.b.r(ejVar, 0, 0, i2, i2, 3);
        eVarB.add(ejVar);
        Unit unit = Unit.f186387a;
        return new ldk.x(gVarA, animatedBackgroundTypeC, zhm.u.a(eVarB));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        le1.k kVar = (le1.k) this.f186336b;
        cd1.e eVar = (cd1.e) this.f186337c;
        List productList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(productList, "productList");
        if (!productList.isEmpty()) {
            return zhm.u.c(new xk("CATEGORY_ITEMS_PRODUCTS_GRID_BOX_ID", kVar.f194446a.a(productList, eVar), 3, null, null, R$attr.uikit_dp4, 0, 0, 0, 65400));
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("CATEGORY_ITEMS_EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_list_empty_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, ISO781611.BIOMETRIC_INFORMATION_TEMPLATE_TAG);
        yp0.b.l(model, 0, R$attr.uikit_dp32, 0, 0, null, false, 61);
        return zhm.u.c(model);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[PHI: r3
      0x0117: PHI (r3v24 boolean) = (r3v15 boolean), (r3v16 boolean) binds: [B:44:0x0115, B:156:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: koe.y.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        lk7.g gVar = (lk7.g) this.f186336b;
        CdnImage cdnImage = (CdnImage) this.f186337c;
        CFACInsuranceDetails insuranceDetails = (CFACInsuranceDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        e4 e4Var = null;
        return new lk7.h(new TextClause(gVar.f196276b.f115712b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), cdnImage, new aw0.k(4, new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.device_insurance_state_active, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_status_active, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246), false), zhm.u.c(new ActionsView.Item("ID_ACTION_ALL_DOCUMENTS", null, false, e4Var, null, new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_policy_details_action_all_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, insuranceDetails.a(gVar.f196276b), null, 24478)), zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_HELP", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, 124)));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        Integer numValueOf;
        lk7.g gVar = (lk7.g) this.f186336b;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.f186337c;
        CFACInsuranceDetails insurance = (CFACInsuranceDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insurance, "insurance");
        ArrayList<CFACCoverage> arrayList = insurance.a(gVar.f196276b).d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (CFACCoverage cFACCoverage : arrayList) {
            String strName = cFACCoverage.f74981a.name();
            CFACCoverageType coverage = cFACCoverage.f74981a;
            Intrinsics.checkNotNullParameter(coverage, "coverage");
            RowDelegate.Model.MainImage.Image24 image24 = null;
            switch (lk7.a.f196272a[coverage.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_travel);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_hotel);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_driving_licence);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_sport_equipment);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_star_filled);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_sport_equipment);
                    break;
                case 7:
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_emoji);
                    break;
                case 8:
                    numValueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (numValueOf != null) {
                boolean z = false;
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
            }
            arrayList2.add(new RowDelegate.Model(strName, image24, new TextClause(cFACCoverage.f74982b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        }
        return yp0.b.g(arrayList2, model, null, 0, 0, 126);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        lk7.q qVar = (lk7.q) this.f186336b;
        lk7.g gVar = (lk7.g) this.f186337c;
        CFACInsuranceDetails insuranceDetails = (CFACInsuranceDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        return qVar.f196295a.b(insuranceDetails.a(gVar.f196276b), CFACReimbursementType.NO_PROOF_REIMBURSEMENT, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06c1  */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$c] */
    /* JADX WARN: Type inference failed for: r39v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r77, java.lang.Object r78, java.lang.Object r79) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: koe.y.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        int i;
        lmh.o oVar = (lmh.o) this.f186336b;
        lmh.e eVar = (lmh.e) this.f186337c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        zel.h hVar = (zel.h) pair.f186386b;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List<g0h.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (g0h.a aVar : list2) {
            arrayList.add(oVar.f197088a.a(aVar.f139492a, aVar.f139493b, false));
        }
        ArrayList arrayListF0 = zhm.d0.F0(new SmallActionButtonDelegate.Model("all-assets-screener-widget-see-all", h4.FLAT, null, null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), null, new i4(), new lmh.c(eVar.f197078a), null, 0, 0, 0, 0, 32088), arrayList);
        int i2 = hVar.f321802a;
        zel.f fVar = eVar.f197078a;
        int i3 = lmh.n.f197087a[fVar.ordinal()];
        if (i3 == 1) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_stocks;
        } else if (i3 == 2) {
            i = eVar.f ? com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_etps : com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_etfs;
        } else if (i3 == 3) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_bonds;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_all_cfds;
        }
        return yp0.b.g(arrayListF0, new ListSubheaderDelegate.Model("all-assets-screener-widget-header", (Image) null, (Clause) v1.c.f(zhm.v.k(new TextLocalisedClause(i, null, null, 14), new NumberClause(i2, (NumberClause.Format.Compact) null, (Custom) null, 6)), null), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), p.a.p("all-assets-", fVar.name(), "-see-all"), (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) new lmh.c(fVar), (Parcelable) null, 0, 0, 0, 0, 64394), null, 0, 0, 126);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z3;
        Collection collectionE0;
        Collection collection;
        dj0.d dVar;
        int i;
        Object next;
        CellDetailsDelegate.Model model;
        Object next2;
        char c2;
        Object obj5;
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar2;
        i3g.k kVar = (i3g.k) this.f186336b;
        lnk.e eVar = (lnk.e) this.f186337c;
        qha.a subscribeInfo = (qha.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        hha.d plan = eVar.f197292b;
        Clause clause = (Clause) eVar.e.getContent();
        boolean z4 = eVar.f197293c;
        boolean z6 = eVar.d;
        lnk.b bVar = (lnk.b) kVar.f158221b;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        ArrayList arrayList = new ArrayList();
        hha.o oVarB = subscribeInfo.b();
        if (oVarB != null) {
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_REFUND_ITEM", new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_screen_item_refund, null, null, 14), new MoneyClause(oVarB.f152327b, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
            List list = oVarB.f152328c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : list) {
                if (((hha.t0) obj6).f152341b == u0.VAT) {
                    arrayList2.add(obj6);
                }
            }
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(new CellDetailsDelegate.Model("ID_REFUND_VAT_ITEM", new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_screen_refund_vat, null, null, 14), new MoneyClause(((hha.t0) it8.next()).f152340a, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
                z6 = z6;
                z4 = z4;
            }
            z = z6;
            z3 = z4;
            collectionE0 = zhm.d0.E0(arrayList3, zhm.u.c(model2));
        } else {
            z = z6;
            z3 = z4;
            collectionE0 = f0.f322471a;
        }
        qha.b bVarA = subscribeInfo.a();
        if (bVarA == null) {
            throw new IllegalArgumentException("Yearly fee must not be null on switch to annual screen");
        }
        dj0.d dVar3 = bVarA.f246575b;
        dj0.d dVar4 = bVarA.f246576c;
        int i2 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_plan_yearly_price;
        dj0.d dVarL = dVar3.l();
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        Clause textLocalisedClause2 = new TextLocalisedClause(i2, zhm.u.c(new MoneyClause(dVarL, defaults, null, o9Var, 4)), null, 12);
        if (!dVar3.k() || dVar4 == null) {
            collection = collectionE0;
            dVar = dVar3;
            i = 12;
            if (dVar4 != null) {
                MoneyClause moneyClause = new MoneyClause(dVar4.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), o9Var);
                m70.a.t(t0.f186434a);
                textLocalisedClause2 = yoj.b.w(yoj.b.w(moneyClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), textLocalisedClause2);
            }
        } else {
            dVar = dVar3;
            i = 12;
            collection = collectionE0;
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_plan_yearly_price, zhm.u.c(new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), null, 12);
        }
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_ANNUAL_PLAN_ITEM", new TextLocalisedClause((!dVar.k() || dVar4 == null) ? com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_plan_title : com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_plan_title_with_trial, zhm.u.c(dok.g.d(plan, null)), null, i), textLocalisedClause2, 0, null, null, null, null, null, false, 0, 0, 32760);
        Iterator it9 = subscribeInfo.f246567c.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            qha.d dVar5 = ((qha.b) next).f246574a;
            qha.d.Companion.getClass();
            if (dVar5.equals(qha.d.f246581j)) {
                break;
            }
        }
        qha.b bVar2 = (qha.b) next;
        if (bVar2 != null) {
            int i3 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_plan_yearly_price;
            dj0.d dVarL2 = bVar2.f246575b.l();
            MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
            o9 o9Var2 = o9.NON_SENSITIVE;
            Clause textLocalisedClause3 = new TextLocalisedClause(i3, zhm.u.c(new MoneyClause(dVarL2, defaults2, null, o9Var2, 4)), null, i);
            dj0.d dVar6 = bVar2.f246576c;
            if (dVar6 != null) {
                List listK = zhm.v.k(new MoneyClause(dVar6.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE), o9Var2), textLocalisedClause3);
                m70.a.t(t0.f186434a);
                textLocalisedClause3 = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            model = new CellDetailsDelegate.Model("ID_EXTRA_MEMBER_ITEM", new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_checkout_payment_details_extra_member_title, zhm.u.c(1), null, i), textLocalisedClause3, 0, null, null, null, null, null, false, 0, 0, 32760);
        } else {
            model = null;
        }
        Iterator it10 = subscribeInfo.d.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it10.next();
            qha.d dVar7 = ((qha.b) next2).f246574a;
            qha.d.Companion.getClass();
            if (dVar7.equals(qha.d.i)) {
                break;
            }
        }
        qha.b bVar3 = (qha.b) next2;
        ArrayList arrayListE0 = zhm.d0.E0(zhm.v.l(bVar3 != null ? new CellDetailsDelegate.Model("ID_VAT_ITEM", new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_screen_fee_vat, null, null, 14), new MoneyClause(bVar3.f246575b.l(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760) : null), zhm.d0.E0(zhm.v.l(model), zhm.u.c(model3)));
        List list2 = subscribeInfo.f246573n;
        if (list2 != null) {
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
            int i5 = 0;
            for (Object obj7 : list3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    zhm.v.s();
                    throw null;
                }
                qha.f fVar = (qha.f) obj7;
                String strN = a0.d.n("list_id_reward_", i5);
                TextClause textClause = new TextClause(fVar.f246585a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = fVar.f246587c;
                arrayList4.add(new CellDetailsDelegate.Model(strN, new aw0.t0((Clause) textClause, (Image) (str != null ? bVar.f197287a.c(str) : null), 0, false, 28), new TextClause(fVar.f246586b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
                i5 = i6;
            }
            c2 = 0;
            obj5 = arrayList4;
        } else {
            c2 = 0;
            obj5 = f0.f322471a;
        }
        ArrayList arrayListE02 = zhm.d0.E0((Iterable) obj5, zhm.d0.E0(arrayListE0, collection));
        yp0.b.k(arrayListE02, 0, 0, 0, 0, 31);
        zhm.a0.x(arrayListE02, arrayList);
        dj0.d dVarA = lnk.b.a(subscribeInfo);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(dVarA.f(dj0.d.e) ? com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_screen_item_total_due : com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_screen_item_total_refund, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        MoneyClause.Format.Defaults defaults3 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var3 = o9.NON_SENSITIVE;
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("ID_TOTAL_DUE_ITEM", textLocalisedClause4, new MoneyClause(dVarA, defaults3, null, o9Var3, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model4, 0, R$attr.uikit_dp8, 0, 0, null, false, 61);
        arrayList.add(model4);
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        qha.b bVarA2 = subscribeInfo.a();
        if (bVarA2 == null) {
            textLocalisedClause = null;
        } else {
            dj0.d dVar8 = bVarA2.f246575b;
            dj0.d dVar9 = bVarA2.f246576c;
            hha.o oVarB2 = subscribeInfo.b();
            boolean zJ = pd.b.j((oVarB2 == null || (dVar2 = oVarB2.f152326a) == null) ? null : Boolean.valueOf(!dVar2.k()));
            if (z3) {
                Clause textLocalisedClause5 = z ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_duo_short_name, zhm.u.c(dok.g.d(plan, null)), null, i) : dok.g.d(plan, null);
                int i21 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_nav_bar_description_duo;
                LocalDate localDatePlusYears = LocalDate.now().plusYears(1);
                Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
                long jB = jli.b.b(localDatePlusYears);
                TimeClause.Format.INSTANCE.getClass();
                TimeClause timeClause = new TimeClause(jB, TimeClause.Format.f57959a, null, null, 12);
                Clause[] clauseArr = new Clause[2];
                clauseArr[c2] = textLocalisedClause5;
                clauseArr[1] = timeClause;
                textLocalisedClause = new TextLocalisedClause(i21, zhm.v.k(clauseArr), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            } else if (!dVar8.k() || dVar9 == null) {
                int i22 = zJ ? com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_nav_bar_description : com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_nav_bar_description_no_refund;
                Clause clauseD = dok.g.d(plan, null);
                LocalDate localDatePlusYears2 = LocalDate.now().plusYears(1);
                Intrinsics.checkNotNullExpressionValue(localDatePlusYears2, "plusYears(...)");
                long jB2 = jli.b.b(localDatePlusYears2);
                TimeClause.Format.INSTANCE.getClass();
                TimeClause timeClause2 = new TimeClause(jB2, TimeClause.Format.f57959a, null, null, 12);
                Clause[] clauseArr2 = new Clause[2];
                clauseArr2[c2] = clauseD;
                clauseArr2[1] = timeClause2;
                textLocalisedClause = new TextLocalisedClause(i22, zhm.v.k(clauseArr2), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            } else {
                int i32 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_nav_bar_description_with_trial;
                Clause clauseD2 = dok.g.d(plan, null);
                MoneyClause moneyClause2 = new MoneyClause(dVar9, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var3, 4);
                Clause[] clauseArr3 = new Clause[2];
                clauseArr3[c2] = clauseD2;
                clauseArr3[1] = moneyClause2;
                textLocalisedClause = new TextLocalisedClause(i32, zhm.v.k(clauseArr3), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            }
        }
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        return new lnk.j(arrayList, textLocalisedClause, lnk.b.a(subscribeInfo).k() ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_prompt_switch_button, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.switch_to_annual_prompt_switch_for, zhm.u.c(new MoneyClause(lnk.b.a(subscribeInfo), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var3, 4)), null, i), clause);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        lph.j jVar = (lph.j) this.f186336b;
        lph.a aVar = (lph.a) this.f186337c;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
        return jVar.a(aVar);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        int i;
        dj0.d dVarL;
        List listL;
        List listA;
        int i2;
        Boolean boolValueOf;
        lsl.l lVar = (lsl.l) this.f186336b;
        jsl.v vVar = (jsl.v) this.f186337c;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        tsl.a aVar = (tsl.a) rVar.f314201a;
        lsl.i iVar = (lsl.i) rVar.f314202b;
        Optional optional = (Optional) rVar.f314203c;
        InvestCommodityOrder investCommodityOrder = aVar.f274171a;
        r0 r0Var = investCommodityOrder.f104512j;
        bfl.g gVar = investCommodityOrder.f104511h;
        r0 r0Var2 = r0.LIMIT;
        if (r0Var == r0Var2 && gVar == bfl.g.BUY) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_order_buy_title;
        } else if (r0Var == r0Var2 && gVar == bfl.g.SELL) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_order_sell_title;
        } else {
            r0 r0Var3 = r0.STOP;
            if (r0Var == r0Var3 && gVar == bfl.g.BUY) {
                i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_buy;
            } else if (r0Var == r0Var3 && gVar == bfl.g.SELL) {
                i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_sell;
            } else {
                r0 r0Var4 = r0.MARKET;
                if (r0Var == r0Var4 && gVar == bfl.g.BUY) {
                    i = com.revolut.retail.wealth.resources.R$string.wealth_stock_buy_title;
                } else if (r0Var == r0Var4 && gVar == bfl.g.SELL) {
                    i = com.revolut.retail.wealth.resources.R$string.wealth_stock_sell_title;
                } else {
                    if (r0Var != r0.RECURRING || gVar != bfl.g.BUY) {
                        throw new IllegalArgumentException(" details for " + r0Var + " and " + gVar + " is not supported");
                    }
                    i = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_recurring_order_buy_title;
                }
            }
        }
        int i3 = lsl.k.f199708a[gVar.ordinal()];
        if (i3 == 1) {
            dVarL = iVar.f199706b.l();
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVarL = iVar.f199706b;
        }
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14);
        o9 o9Var = o9.NON_SENSITIVE;
        jsl.f0 f0Var = new jsl.f0(new MoneyClause(dVarL, defaults, null, o9Var, 4), new TextLocalisedClause(i, zhm.u.c(new CurrencyClause(com.revolut.retail.trading.core.domain.orders.a.a(investCommodityOrder), CurrencyClause.Format.Ticker.f57756a, null, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), ((Boolean) lVar.d.getValue()).booleanValue() ? new TimeClause(investCommodityOrder.e.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12) : null, new r3(new yy0.j(new CurrencyImage(com.revolut.retail.trading.core.domain.orders.a.a(investCommodityOrder).f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14))), msl.a.a(gVar, r0Var), zhm.u.c(((wul.e) lVar.f199712c).j(investCommodityOrder, true)));
        dj0.d dVar = iVar.f199706b;
        dj0.d dVar2 = iVar.f199705a;
        InvestCommodityOrder commodityOrder = aVar.f274171a;
        ChargeBreakdown chargeBreakdown = (ChargeBreakdown) gj7.b.m(optional);
        List list = vVar.d;
        lsl.q qVar = lVar.f199710a;
        r0 r0Var5 = commodityOrder.f104512j;
        Instant instant = commodityOrder.v;
        bfl.g gVar2 = commodityOrder.f104511h;
        int i5 = lsl.k.f199709b[r0Var5.ordinal()];
        if (i5 == 1) {
            qv0.i[] elements = {dVar2 != null ? lsl.q.b(dVar2) : null, gVar2 == bfl.g.BUY ? lsl.q.a(commodityOrder, dVar) : null, chargeBreakdown != null ? lsl.q.c(commodityOrder, chargeBreakdown) : null, gVar2 == bfl.g.SELL ? lsl.q.a(commodityOrder, dVar) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        } else {
            if (i5 != 2 && i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aim.e eVarB = zhm.u.b();
                wul.o oVar = qVar.f199716a;
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                qv0.i[] elements2 = {oVar.d(instant), chargeBreakdown != null ? lsl.q.c(commodityOrder, chargeBreakdown) : null};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                eVarB.addAll(listL2);
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                List listL3 = zhm.v.l(oVar.e(commodityOrder.u));
                yp0.b.k(listL3, 0, 0, 0, 0, 31);
                eVarB.addAll(listL3);
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                Instant instant2 = commodityOrder.f104520t;
                if (instant == null || instant2 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(instant.compareTo(instant2) > 0);
                }
                CellDetailsDelegate.Model modelF = pd.b.j(boolValueOf) ? oVar.f(instant2) : null;
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                CellDetailsDelegate.Model modelG = oVar.g(commodityOrder.f104518r);
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                BigDecimal bigDecimal = commodityOrder.f104519s;
                Amount amount = bigDecimal != null ? new Amount(bigDecimal, new Asset(f8l.c.COMMODITY, com.revolut.retail.trading.core.domain.orders.a.a(commodityOrder).f306286a, com.revolut.retail.trading.core.domain.orders.a.a(commodityOrder))) : null;
                qv0.i[] elements3 = {modelF, modelG, amount != null ? new CellDetailsDelegate.Model("list_id_total_units_bought_cell", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_total_units_bought, null, null, 14), e4i.c.a(amount, null, null, null, null, o9Var, 31), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL4 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL4, 0, 0, 0, 0, 31);
                eVarB.addAll(listL4);
                if (list != null) {
                    eVarB.addAll(list);
                }
                listA = zhm.u.a(eVarB);
                return new j0(f0Var, zhm.d0.F0(new TextDelegate.Model("FOOTER_COMMODITIES_ORDER_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_details_disclaimer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036), listA));
            }
            Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
            r0 r0Var6 = commodityOrder.f104512j;
            int[] iArr = lsl.p.f199714a;
            int i6 = iArr[r0Var6.ordinal()];
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3 && i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(r0Var6 + " type is not supported");
            }
            int i21 = iArr[r0Var6.ordinal()];
            if (i21 == 1) {
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_price;
            } else {
                if (i21 != 2) {
                    throw new IllegalStateException(r0Var6 + " type is not supported");
                }
                i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_price;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
            xi0.b bVarA = com.revolut.retail.trading.core.domain.orders.a.a(commodityOrder);
            xi0.b bVar = (xi0.b) commodityOrder.k.f186386b;
            BigDecimal bigDecimalY = pyd.c.Y(com.revolut.retail.trading.core.domain.orders.a.m(commodityOrder));
            BigDecimal bigDecimal2 = bigDecimalY.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalY.stripTrailingZeros();
            Intrinsics.checkNotNullExpressionValue(bigDecimal2, "stripTrailingZeros(...)");
            qv0.i[] elements4 = {new CellDetailsActionDelegate.Model("COMMODITY_ORDER_DETAILS_PRICE", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_arrow_rates, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.f(bVarA, bVar, bigDecimal2, null, 24), null, false, false, null, null, null, 0, 0, 0, 0, 4194148), dVar2 != null ? lsl.q.b(dVar2) : null, gVar2 == bfl.g.BUY ? lsl.q.a(commodityOrder, dVar) : null, chargeBreakdown != null ? lsl.q.c(commodityOrder, chargeBreakdown) : null, gVar2 == bfl.g.SELL ? lsl.q.a(commodityOrder, dVar) : null, new CellDetailsDelegate.Model("COMMODITY_ORDER_DETAILS_EXPIRE_BY", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_commodities_order_flow_common_cell_expire_by, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_common_value_never, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            listL = kotlin.collections.d.L(elements4);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        }
        listA = listL;
        return new j0(f0Var, zhm.d0.F0(new TextDelegate.Model("FOOTER_COMMODITIES_ORDER_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_order_details_disclaimer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036), listA));
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        Set setF9;
        Set setR1;
        Set setD2;
        lu6.s sVar = (lu6.s) this.f186336b;
        lu6.l lVar = (lu6.l) this.f186337c;
        lu6.k filtersInfo = (lu6.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(filtersInfo, "filtersInfo");
        Set set = filtersInfo.f200046a;
        AcquiringOrderFilter acquiringOrderFilter = lVar.f200048b;
        boolean z = lVar.f200049c;
        t17.d dVar = sVar.d;
        aim.e eVarB = zhm.u.b();
        if (acquiringOrderFilter == null || (setF9 = acquiringOrderFilter.F9()) == null) {
            setF9 = h0.f322473a;
        }
        aim.e eVarB2 = zhm.u.b();
        Set set2 = lu6.s.f;
        int size = set2.size();
        int size2 = setF9.size();
        int i = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_statuses_header_title_selected;
        int i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_statuses_header_title;
        Intrinsics.checkNotNullParameter("ITEM_ID_STATUS_HEADER", "headerId");
        eVarB2.add(t17.p.a(size, size2, i, i2, "ITEM_ID_STATUS_HEADER"));
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            t17.l lVarD = t17.a.d((nr6.c0) it8.next());
            if (lVarD != null) {
                arrayList.add(lVarD);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = setF9.iterator();
        while (it9.hasNext()) {
            t17.l lVarD2 = t17.a.d((nr6.c0) it9.next());
            if (lVarD2 != null) {
                arrayList2.add(lVarD2);
            }
        }
        eVarB2.add(dVar.a(arrayList, arrayList2, "ITEM_ID_STATUS_GROUP"));
        zhm.a0.x(zhm.u.a(eVarB2), eVarB);
        EnumEntries enumEntries = lu6.s.f200056g;
        if (acquiringOrderFilter == null || (setR1 = acquiringOrderFilter.r1()) == null) {
            setR1 = h0.f322473a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : enumEntries) {
            ju6.b chip = (ju6.b) obj5;
            Intrinsics.checkNotNullParameter(setR1, "<this>");
            Intrinsics.checkNotNullParameter(chip, "chip");
            if (setR1.containsAll(chip.b())) {
                arrayList3.add(obj5);
            }
        }
        aim.e eVarB3 = zhm.u.b();
        int size3 = enumEntries.size();
        int size4 = arrayList3.size();
        int i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_header_title_selected;
        int i5 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_header_title;
        Intrinsics.checkNotNullParameter("ITEM_ID_CHANNEL_HEADER", "headerId");
        eVarB3.add(t17.p.a(size3, size4, i3, i5, "ITEM_ID_CHANNEL_HEADER"));
        ArrayList arrayList4 = new ArrayList(zhm.w.t(enumEntries, 10));
        Iterator<E> it10 = enumEntries.iterator();
        while (it10.hasNext()) {
            arrayList4.add(t17.a.c((ju6.b) it10.next()));
        }
        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it11 = arrayList3.iterator();
        while (it11.hasNext()) {
            arrayList5.add(t17.a.c((ju6.b) it11.next()));
        }
        eVarB3.add(dVar.a(arrayList4, arrayList5, "ITEM_ID_CHANNEL_GROUP"));
        zhm.a0.x(zhm.u.a(eVarB3), eVarB);
        t17.h hVar = sVar.f200059c;
        FilteringDateRange filteringDateRangeB2 = acquiringOrderFilter != null ? acquiringOrderFilter.B2() : null;
        aim.e eVarB4 = zhm.u.b();
        eVarB4.add(t17.h.a("ITEM_ID_DATE_RANGE_HEADER", filteringDateRangeB2));
        aim.e eVarB5 = zhm.u.b();
        eVarB5.add(t17.a.a(filteringDateRangeB2));
        Set set3 = lu6.s.e;
        ArrayList arrayList6 = new ArrayList(zhm.w.t(set3, 10));
        Iterator it12 = set3.iterator();
        while (it12.hasNext()) {
            arrayList6.add(t17.a.b((FilteringDateRange) it12.next()));
        }
        zhm.a0.x(arrayList6, eVarB5);
        eVarB4.add(hVar.b("ITEM_ID_DATE_RANGE_GROUP", zhm.u.a(eVarB5), filteringDateRangeB2 != null ? t17.a.b(filteringDateRangeB2) : null));
        zhm.a0.x(zhm.u.a(eVarB4), eVarB);
        t17.c cVar = sVar.f200057a;
        String strZ6 = acquiringOrderFilter != null ? acquiringOrderFilter.Z6() : null;
        String strW2 = acquiringOrderFilter != null ? acquiringOrderFilter.W2() : null;
        aim.e eVarB6 = zhm.u.b();
        eVarB6.add(t17.c.a("ITEM_ID_AMOUNT_HEADER", (strZ6 == null && strW2 == null) ? false : true));
        eVarB6.addAll(cVar.b("ITEM_ID_MINIMUM_AMOUNT", strW2, "ITEM_ID_MAXIMUM_AMOUNT", strZ6));
        zhm.a0.x(zhm.u.a(eVarB6), eVarB);
        t17.g gVar = sVar.f200058b;
        if (acquiringOrderFilter == null || (setD2 = acquiringOrderFilter.d2()) == null) {
            setD2 = h0.f322473a;
        }
        aim.e eVarB7 = zhm.u.b();
        eVarB7.add(gVar.a(set.size(), setD2.size(), "ITEM_ID_CURRENCY_HEADER"));
        zhm.a0.x(gVar.b(z, setD2, set, "ITEM_ID_SEE_ALL_CURRENCIES"), eVarB7);
        zhm.a0.x(zhm.u.a(eVarB7), eVarB);
        return zhm.u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        ej ejVar;
        dj0.d dVar;
        lv4.d0 d0Var = (lv4.d0) this.f186336b;
        lv4.g gVar = (lv4.g) this.f186337c;
        lv4.f content = (lv4.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(d0Var.f200293b.h("id_credit_card_statement", content.f200295a.v));
        Data data = gVar.f200298b;
        List list = gVar.f200299c;
        eVarB.addAll((List) iii.c.f(data, new lsl.d(1, d0Var, list), new er9.a(list, 2), new y(d0Var, list, 26)));
        lv4.r rVar = null;
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("id_credit_card_statement_details_action_get_help", new TextLocalisedClause(R.string.contact_us, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
        yp0.b.l(model, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
        eVarB.add(model);
        wi0.b countryCode = content.f200296b;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause = Intrinsics.f(countryCode, wi0.b.l2) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_details_footer_nz, null, null, 14) : null;
        if (textLocalisedClause != null) {
            ejVar = new ej("id_credit_card_statement_details_footer", new c7(textLocalisedClause, false, null, 6));
            yp0.b.r(ejVar, R$attr.uikit_dp0, 0, 0, 0, 14);
        } else {
            ejVar = null;
        }
        n14.e.b(eVarB, ejVar);
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.b(R$attr.uikit_dp16, eVarA);
        vl4.g gVar2 = content.f200295a;
        if (zhm.v.k(vl4.c.ONGOING, vl4.c.CLOSED).contains(gVar2.f290252h) && (dVar = gVar2.f290255m) != null && dVar.f(dj0.d.e)) {
            rVar = new lv4.r(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_details_button, null, null, 14));
        }
        return new lv4.s(rVar, eVarA);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        lv4.d0 d0Var = (lv4.d0) this.f186336b;
        List list = (List) this.f186337c;
        List transactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ArrayList arrayListB = d0Var.f200292a.b(transactions, false);
        if (arrayListB.isEmpty() && list.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("id_credit_card_statement_details_transaction_empty", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_details_transactions_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_details_transactions_empty_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_minus_circle, null, null, 6)), null, null, false, null, null, null, YearClass.CLASS_2016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(list);
        eVarB.addAll(zhm.d0.V0(arrayListB, 3));
        if (arrayListB.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("id_credit_card_statement_details_action_all_transactions", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        BigDecimal bigDecimal;
        m28.e eVar = (m28.e) this.f186336b;
        String id10 = (String) this.f186337c;
        List commodities = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        ((m28.h) eVar.f201727c).getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_commodities_header_title, null, null, 14);
        List commodities2 = zhm.d0.V0(commodities, 4);
        Intrinsics.checkNotNullParameter(commodities2, "commodities");
        List<jih.a> listP0 = zhm.d0.P0(commodities2, new jlh.x());
        ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
        for (jih.a aVar : listP0) {
            xi0.b bVar = aVar.f174489a;
            String strR = a0.d.r(id10, bVar.f306286a);
            CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            TextClause textClause = new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            vel.d dVar = aVar.f174490b;
            arrayList.add(new ReferralContactDelegate.Model(strR, currencyImage, textClause, (dVar == null || (bigDecimal = dVar.f288354c.f288346c) == null) ? null : xqi.a.c(bigDecimal, false, false, false, false, false, CertificateBody.profileType), null, null, null, null, null, aVar, null, 393200));
        }
        return new ContactsWidgetDelegate.Model(id10, arrayList, textLocalisedClause, true, null, null, 48);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        TravelExperienceFiltersSelection travelExperienceFiltersSelection = (TravelExperienceFiltersSelection) this.f186336b;
        m3g.b bVar = (m3g.b) this.f186337c;
        List categories = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(categories, "categories");
        Set<String> set = travelExperienceFiltersSelection.f92822c;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            loop1: for (String str : set) {
                List list = categories;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((TravelExperienceCategory) it8.next()).f92807a, str)) {
                            break;
                        }
                    }
                }
                z = true;
            }
        }
        List<TravelExperienceCategory> list2 = categories;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (TravelExperienceCategory travelExperienceCategory : list2) {
            boolean zContains = travelExperienceFiltersSelection.f92822c.contains(travelExperienceCategory.f92807a);
            arrayList.add(new ActionsView.Item(j6.a.q("QUICK_FILTER_ID_", travelExperienceCategory.f92807a), zContains ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, e4.EnabledClickable, null, new TextClause(travelExperienceCategory.f92808b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, travelExperienceCategory, null, DG11File.TITLE_TAG));
        }
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        bVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_search_list_filters_activity_types, null, null, 14);
        return zhm.d0.E0(zhm.u.c(new ActionsView.Item("QUICK_FILTER_ID_ALL_CATEGORIES", z ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, e4.EnabledClickable, null, textLocalisedClause, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, null, Boolean.valueOf(z), null, DG11File.TITLE_TAG)), arrayList);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        boolean z;
        String str;
        Object next2;
        a0 a0VarD;
        zme.e eVar;
        xi0.b bVar;
        kj kjVar;
        List listO;
        TagViewData tagViewData;
        TagViewData tagViewDataA;
        Iterator it8;
        ku kuVar;
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2 = this.f186335a;
        int i3 = 17;
        int i5 = 10;
        Object obj5 = this.f186337c;
        Object obj6 = this.f186336b;
        switch (i2) {
            case 0:
                c0 c0Var = (c0) obj6;
                TaxResidencyListScreenContract$InputData taxResidencyListScreenContract$InputData = c0Var.f186313b;
                h hVar = (h) obj5;
                vf0.h hVar2 = (vf0.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list = (List) hVar2.f288433a;
                List list2 = (List) hVar2.f288434b;
                List list3 = (List) hVar2.f288435c;
                s0 s0Var = new s0(2);
                s0Var.a(c0.f186311c);
                List<zme.f> list4 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                for (zme.f fVar : list4) {
                    zme.l lVarK = i26.l.k(list2, fVar.f323482a);
                    List list5 = taxResidencyListScreenContract$InputData.f;
                    wi0.b bVar2 = fVar.f323482a;
                    boolean zContains = list5.contains(bVar2);
                    n8b.a aVar = c0Var.f186312a;
                    String str2 = bVar2.f297794a;
                    String str3 = bVar2.f297794a;
                    TextClause textClause = new TextClause(((o8b.c) aVar).b(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str4 = fVar.f323483b;
                    List list6 = list;
                    String str5 = fVar.e;
                    String str6 = fVar.f;
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            str = str6;
                            if (!((zme.d) next2).f323479a.equals(bVar2)) {
                                str6 = str;
                            }
                        } else {
                            str = str6;
                            next2 = null;
                        }
                    }
                    zme.d dVar = (zme.d) next2;
                    zme.e eVar2 = dVar != null ? dVar.f323480b : ((str4 == null || str4.length() == 0) && i26.l.o(lVarK)) ? zme.e.FAILED : zme.e.PASSED;
                    wi0.b.Companion.getClass();
                    List list7 = list2;
                    if (!bVar2.equals(wi0.b.Y1)) {
                        int i6 = b0.f186310a[eVar2.ordinal()];
                        if (i6 == 1) {
                            a0VarD = c0.d(textClause);
                        } else if (i6 == 2) {
                            a0VarD = c0.b(textClause, str4, lVarK);
                        } else {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a0VarD = str4 != null ? c0.b(textClause, str4, lVarK) : !i26.l.o(lVarK) ? new a0(textClause, new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tax_residency_list_confirm_tax_residency, null, null, 14), null, true) : !zContains ? c0.a(textClause, lVarK) : new a0(textClause, null, null, true);
                        }
                    } else if (eVar2 == zme.e.PENDING || str4 == null || str4.length() == 0) {
                        a0VarD = c0.d(textClause);
                    } else if (str5 == null || str5.length() == 0 || str == null || str.length() == 0) {
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.tax_residency.impl.R$string.tax_residency_missing_info, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                        int i21 = R$drawable.uikit_icn_24_info;
                        int i22 = R$attr.uikit_colorWhite;
                        a0VarD = new a0(textClause, textLocalisedClause2, LayeredImage.Companion.f(companion, i21, i22, i22, Integer.valueOf(R$attr.uikit_colorOrange), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(10.0f), 32), true);
                    } else {
                        a0VarD = (eVar2 == zme.e.PASSED || eVar2 == (eVar = zme.e.FAILED)) ? c0.b(textClause, str4, lVarK) : (eVar2 != eVar || zContains) ? new a0(textClause, null, null, true) : c0.a(textClause, lVarK);
                    }
                    Pair pair = !a0VarD.d ? new Pair(null, null) : new Pair(new tf(6, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false), "ITEM_ACTION_EDIT");
                    arrayList.add(new RowDelegate.Model(j6.a.q("tax_residency_", str3), new RowDelegate.Model.MainImage.Image40(new CountryImage(str3, (Integer) null, (ez0.e) null, 14), a0VarD.f186309c, null, false, 28), a0VarD.f186307a, null, 0, a0VarD.f186308b, null, null, 0, (tf) pair.f186385a, false, null, false, null, null, null, null, null, null, new Pair((String) pair.f186386b, fVar), null, 0, 0, 0, 0, 532675544));
                    list = list6;
                    list2 = list7;
                }
                List list8 = list;
                boolean zIsEmpty = arrayList.isEmpty();
                List listC = arrayList;
                if (zIsEmpty) {
                    listC = zhm.u.c(c0.d);
                }
                List list9 = listC;
                yp0.b.k(list9, 0, R$attr.uikit_dp24, 0, 0, 29);
                s0Var.b(list9.toArray(new qv0.i[0]));
                ArrayList arrayList2 = s0Var.f186433a;
                List listK = zhm.v.k(arrayList2.toArray(new qv0.i[arrayList2.size()]));
                if (taxResidencyListScreenContract$InputData.f90086j) {
                    z = !list8.isEmpty();
                } else if (!list8.isEmpty()) {
                    List<zme.f> list10 = (List) zi0.c.I(hVar.f186315b);
                    if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                        for (zme.f fVar2 : list10) {
                            List list11 = (List) zi0.c.I(hVar.f186316c);
                            wi0.b bVar3 = fVar2.f323482a;
                            zme.l lVarK2 = i26.l.k(list11, bVar3);
                            Iterator it10 = list3.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (((zme.d) next).f323479a.equals(bVar3)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            zme.d dVar2 = (zme.d) next;
                            zme.e eVar3 = dVar2 != null ? dVar2.f323480b : null;
                            boolean zContains2 = taxResidencyListScreenContract$InputData.f.contains(bVar3);
                            String str7 = fVar2.f323483b;
                            if (str7 == null || kotlin.text.d0.W(str7)) {
                                if (!i26.l.o(lVarK2) || zContains2 || eVar3 == zme.e.PENDING || eVar3 == zme.e.PASSED) {
                                }
                            }
                        }
                    }
                }
                return new q(listK, z, true);
            case 1:
                ChatTableDelegate.Model model = (ChatTableDelegate.Model) obj5;
                String selectedText = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter(selectedText, "selectedText");
                ((ChatTableDelegate) obj6).f.onNext(new b1(model.f53906a, selectedText, zBooleanValue, iIntValue, model.d));
                return Unit.f186387a;
            case 2:
                ChatUncontainedMessageDelegate.Model model2 = (ChatUncontainedMessageDelegate.Model) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                String selectedText2 = (String) obj3;
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                Intrinsics.checkNotNullParameter(selectedText2, "selectedText");
                ((ChatUncontainedMessageDelegate) obj6).f53915c.onNext(new e1(model2.f53916a, selectedText2, zBooleanValue2, iIntValue2, model2.f53919g));
                return Unit.f186387a;
            case 3:
                dj0.d dVar3 = (dj0.d) obj6;
                xi0.b bVar4 = dVar3.f115083b;
                c02.f fVar3 = (c02.f) obj5;
                io3.d pocket = (io3.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                dj0.d dVarJ = z92.f.j(pocket);
                xi0.b bVar5 = dVarJ.f115083b;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar5.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
                String str8 = bVar5.f306286a;
                CurrencyClause currencyClause = new CurrencyClause(new xi0.b(6, str8, null), null, null, 6);
                int i32 = com.revolut.feature.apm.core.api.R$string.apm_payment_from_balance;
                List listC2 = zhm.u.c(new MoneyClause(dVarJ, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4));
                dj0.d dVar4 = fVar3 != null ? fVar3.f20105b : null;
                if (bVar5.equals(bVar4)) {
                    zE = dVarJ.e(dVar3);
                } else if (dVar4 == null || !bVar5.equals(dVar4.f115083b)) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.c cVar = rd0.c.ERROR;
                    String str9 = bVar4.f306286a;
                    String str10 = (dVar4 == null || (bVar = dVar4.f115083b) == null) ? null : bVar.f306286a;
                    StringBuilder sbM = v0.a.m("Can not perform balance sufficiency check. Pocket currency ", str8, " does not match payment currency ", str9, " or bill currency ");
                    sbM.append(str10);
                    rd0.d.a(cVar, "BlikConfirmationStateMapper", sbM.toString(), null, h0Var);
                } else {
                    zE = dVarJ.e(dVar4);
                }
                return new RowDelegate.Model("ID_PAYMENT_FROM_ITEM", image40, currencyClause, null, 0, new TextLocalisedClause(i32, listC2, !zE ? new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254) : null, 8), null, null, 0, new pf(new TextLocalisedClause(R.string.common_action_change, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
            case 4:
                ku8.j jVar = (ku8.j) obj5;
                my8.o kycDocs = (my8.o) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
                ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = (ChooseDocumentScreenContract$InputData) ((ac4.g) obj6).f3031b;
                ku8.p pVar = chooseDocumentScreenContract$InputData.f77591a;
                my8.r rVar = chooseDocumentScreenContract$InputData.f77592b;
                int i33 = ku8.r.f189750a[pVar.ordinal()];
                if (i33 != 1) {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List listJ = kotlin.jvm.internal.s.j(chooseDocumentScreenContract$InputData, kycDocs);
                    if (listJ == null) {
                        listJ = f0.f322471a;
                    }
                    ArrayList arrayListD = hu8.a.d(listJ, com.revolut.feature.kyc.impl.choosedocument.model.a.a(jVar.f189741b), rVar != my8.r.ADDRESS);
                    yp0.b.k(arrayListD, R$attr.uikit_dp0, 0, 0, 0, 30);
                    return arrayListD;
                }
                List list12 = kycDocs.f210393b.f210404a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list12) {
                    if (((my8.y) obj7).f210403b.isEmpty()) {
                        arrayList3.add(obj7);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(((my8.y) it11.next()).f210402a);
                }
                ArrayList arrayListD2 = hu8.a.d(arrayList4, com.revolut.feature.kyc.impl.choosedocument.model.a.a(jVar.f189741b), rVar != my8.r.ADDRESS);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : list12) {
                    if (!((my8.y) obj8).f210403b.isEmpty()) {
                        arrayList5.add(obj8);
                    }
                }
                List listO2 = i2b.a.o(arrayListD2, hu8.a.e(arrayList5, jVar.f189741b.f77598a));
                yp0.b.k(listO2, R$attr.uikit_dp0, 0, 0, 0, 30);
                return listO2;
            case 5:
                bti.m mVar = (bti.m) obj5;
                AsftPass pass = (AsftPass) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pass, "pass");
                rui.b bVar6 = ((kui.j) obj6).f189830b;
                Intrinsics.checkNotNullParameter(pass, "pass");
                List list13 = pass.f98726t;
                if (list13 == null) {
                    return f0.f322471a;
                }
                List list14 = list13;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list14, 10));
                int i43 = 0;
                for (Object obj9 : list14) {
                    int i59 = i43 + 1;
                    if (i43 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    AsftPassAdmission asftPassAdmission = (AsftPassAdmission) obj9;
                    fa faVar = new fa(a0.d.n("ID_ITEM_PASS_CARD_", i43), bVar6.f257555a.invoke(), rui.g.a(pass), bVar6.f257556b.invoke(asftPassAdmission), rui.f.a(pass, asftPassAdmission));
                    yp0.b.l(faVar, 0, 0, 0, 0, null, false, 63);
                    arrayList6.add(faVar);
                    i43 = i59;
                }
                hg hgVar = new hg("ID_PASS_CARDS_SCROLLER", arrayList6, 1, x4.c.f10604a, null, new gg.b(list13.size() > 1, 2), true, false, null, null, 0, 0, 0, 0, 32656);
                int i66 = R$attr.uikit_dp0;
                yp0.b.r(hgVar, 0, 0, i66, i66, 3);
                List listC3 = zhm.u.c(hgVar);
                if (mVar == null) {
                    AsftPassAdmission asftPassAdmission2 = (AsftPassAdmission) zhm.d0.d0(list13);
                    mVar = asftPassAdmission2 != null ? asftPassAdmission2.f98727a : null;
                }
                return zhm.d0.E0(zhm.v.l(mVar != null ? rui.h.a(mVar) : null), listC3);
            case 6:
                l1k.o oVar = (l1k.o) obj6;
                l1k.i iVar = (l1k.i) obj5;
                WealthNewsArticle article = (WealthNewsArticle) obj2;
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(article, "article");
                TextClause textClause2 = new TextClause(article.f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i74 = com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_reader_screen_header_read_duration;
                Integer num = article.f101800g;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i74, zhm.v.l(num), null, 12);
                if (num == null) {
                    textLocalisedClause3 = null;
                }
                Object[] elements = {textLocalisedClause3, new TimeClause(article.e.getMillis(), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), new TextClause(article.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                CompositeClause compositeClauseF = v1.c.f(kotlin.collections.d.L(elements), null);
                if (zBooleanValue3) {
                    Intrinsics.checkNotNullParameter("NEWS_ARTICLE_LOADING_DELEGATE_ID", "listId");
                    listO = zhm.u.c(new t10("NEWS_ARTICLE_LOADING_DELEGATE_ID", r10.f166083a, 0));
                } else if (th10 != null) {
                    listO = l1k.o.b();
                } else {
                    Data data = iVar.f191562b;
                    n0h.b bVar7 = iVar.d;
                    vi viVar = new vi(new ComplexImage.Regular(new UrlImage(article.f101799c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, false, 507902)));
                    yp0.b.l(viVar, 0, 0, 0, 0, null, false, 63);
                    String str11 = article.d;
                    if (str11 != null) {
                        kjVar = new kj("NEWS_ARTICLE_CONTENT_DELEGATE_ID", new lj(str11, "utf-8"), null, Constants.TAG_FC_SPEED_MODE);
                        yp0.b.l(kjVar, 0, 0, 0, 0, null, false, 63);
                    } else {
                        kjVar = null;
                    }
                    List listR = i2b.a.r(viVar, kjVar);
                    int i92 = 22;
                    listO = i2b.a.o(i2b.a.o(listR, (List) iii.c.f(data, new l0g.a(i92), new l0(i3), new kcg.j(oVar, i92))), bVar7 != null ? i2b.a.q(new TextDelegate.Model("NEWS_ARTICLE_FOOTER_DELEGATE_ID", new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealth_trading_news_news_reader_screen_disclosure_prefix, null, null, 14), false, new ak0(null, null, 3), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780), oVar.f191574b.a(bVar7, new p0h.e(null, 3))) : null);
                }
                return new l1k.k(textClause2, compositeClauseF, listO);
            case 7:
                k7i.i iVar2 = (k7i.i) obj6;
                l5a.l lVar = (l5a.l) obj5;
                List content = (List) obj2;
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content, "content");
                if (!content.isEmpty()) {
                    return ((g5a.u) iVar2.f182069b).a(content, false);
                }
                if (zBooleanValue4) {
                    return zhm.u.c(b5a.d.a());
                }
                b5a.d dVar5 = (b5a.d) iVar2.f182070c;
                int i96 = l5a.a.f192196b[lVar.e.ordinal()];
                if (i96 == 1) {
                    return zhm.u.c(b5a.d.b(com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_action, "CONTACTS_DENIED_ITEM_ID"));
                }
                if (i96 == 2) {
                    return zhm.u.c(b5a.d.b(((o8b.c) dVar5.f12480a).g() ? com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_title_in_tailored : com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_invite_friends_action, "CONTACTS_ALLOWED_ITEM_ID"));
                }
                if (i96 == 3) {
                    return zhm.u.c(b5a.d.b(com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_enable_permission_title, com.revolut.feature.payments.who_to_transfer.impl.R$string.chat_state_widget_go_to_settings_action, "CONTACTS_PERMANENTLY_DENIED_ITEM_ID"));
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                l8f.f fVar4 = (l8f.f) obj6;
                l8f.b bVar8 = (l8f.b) obj5;
                Template template = (Template) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(template, "template");
                String str12 = bVar8.f192976b;
                String str13 = bVar8.f192977c;
                String str14 = template.f95706a;
                m8f.a aVar2 = Intrinsics.f(str14, str12) ? m8f.a.CURRENT : Intrinsics.f(str14, str13) ? m8f.a.RECOMMENDED : null;
                String strQ = j6.a.q("RiskPlanTile_", template.f95706a);
                db dbVar = new db(fVar4.f192980a.g(template));
                Intrinsics.checkNotNullParameter(template, "template");
                ya yaVar = new ya(yoc.g.a(template.f95707b), wa.DEFAULT);
                if (aVar2 != null) {
                    int i99 = l8f.e.f192979a[aVar2.ordinal()];
                    if (i99 == 1) {
                        tagViewDataA = l8f.f.a(R$drawable.uikit_icn_16_check, com.revolut.retail.wealth.resources.R$string.wealth_robo_porfolio_risk_profile_current_portfolio);
                    } else {
                        if (i99 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tagViewDataA = l8f.f.a(R$drawable.uikit_icn_24_lightning, com.revolut.retail.wealth.resources.R$string.wealth_robo_porfolio_risk_profile_recommended_portfolio);
                    }
                    tagViewData = tagViewDataA;
                } else {
                    tagViewData = null;
                }
                PlanTileDelegate.Model model3 = new PlanTileDelegate.Model(strQ, dbVar, yaVar, null, tagViewData, null, YearClass.CLASS_2008);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model3);
            case 9:
                return a(obj2, obj3, obj4);
            case 10:
                return b(obj2, obj3, obj4);
            case 11:
                return c(obj2, obj3, obj4);
            case 12:
                return d(obj2, obj3, obj4);
            case 13:
                return e(obj2, obj3, obj4);
            case 14:
                return g(obj2, obj3, obj4);
            case 15:
                return h(obj2, obj3, obj4);
            case 16:
                return i(obj2, obj3, obj4);
            case 17:
                return j(obj2, obj3, obj4);
            case 18:
                return k(obj2, obj3, obj4);
            case 19:
                return l(obj2, obj3, obj4);
            case 20:
                return m(obj2, obj3, obj4);
            case 21:
                return n(obj2, obj3, obj4);
            case 22:
                return o(obj2, obj3, obj4);
            case 23:
                return p(obj2, obj3, obj4);
            case 24:
                return q(obj2, obj3, obj4);
            case 25:
                return r(obj2, obj3, obj4);
            case 26:
                return s(obj2, obj3, obj4);
            case 27:
                return t(obj2, obj3, obj4);
            case 28:
                return u(obj2, obj3, obj4);
            default:
                m3g.c0 c0Var2 = (m3g.c0) obj6;
                m3g.n nVar = (m3g.n) obj5;
                List summaryList = (List) obj2;
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(summaryList, "summaryList");
                if (summaryList.isEmpty()) {
                    return zBooleanValue5 ? m3g.c0.d() : zhm.u.c(m3g.c0.b());
                }
                List list15 = (List) iii.c.f(nVar.f202546h, new m30.c(18), new lxi.g(26), new lk7.n(c0Var2, i3));
                List list16 = summaryList;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list16, 10));
                Iterator it12 = list16.iterator();
                while (it12.hasNext()) {
                    TravelExperiencesSummary travelExperiencesSummary = (TravelExperiencesSummary) it12.next();
                    boolean z3 = nVar.f202547j;
                    int i100 = R$attr.uikit_colorWhite;
                    int i101 = R$attr.uikit_colorWhite_70;
                    if (z3) {
                        TravelExperiencesPricing travelExperiencesPricing = travelExperiencesSummary.f;
                        TravelExperienceRatings travelExperienceRatings = travelExperiencesSummary.e;
                        List list17 = travelExperiencesSummary.f93203c;
                        String str15 = travelExperiencesSummary.f93201a;
                        TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesPricing.d;
                        dj0.d dVar6 = travelExperiencesPricing.f93199b;
                        if (travelExperiencesPointsOption != null) {
                            String strQ2 = j6.a.q("SUMMARY_ITEM_ID", str15);
                            List list18 = list17;
                            ArrayList arrayList8 = new ArrayList(zhm.w.t(list18, i5));
                            Iterator it13 = list18.iterator();
                            while (it13.hasNext()) {
                                arrayList8.add(new UrlImage((String) it13.next(), null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, false, 507902));
                            }
                            TextClause textClause3 = new TextClause(travelExperiencesSummary.f93202b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            i9 i9VarC = a1g.c.c(travelExperienceRatings, i101);
                            MoneyClause.Format.Shorts shorts = new MoneyClause.Format.Shorts(false, 51);
                            o9 o9Var = o9.NON_SENSITIVE;
                            it8 = it12;
                            kuVar = new ku(strQ2, textClause3, null, null, new MoneyClause(dVar6, shorts, new Custom(Integer.valueOf(i100), false, aw0.db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), o9Var), null, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_list_price_per_person, null, new Custom(Integer.valueOf(i101), false, null, false, null, 254), 10), 0, null, null, m3g.c0.c(travelExperiencesSummary, i101), arrayList8, null, null, null, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_common_pay_with_points, null, new Custom(Integer.valueOf(i101), false, null, false, null, 254), 10), new mu(nub.a.l(travelExperiencesPointsOption.f93195a, o9Var, null, Integer.valueOf(i100), BitmapDescriptorFactory.HUE_RED, 54), new MoneyClause(pyd.c.H(dVar6, travelExperiencesPointsOption.f93196b), new MoneyClause.Format.Shorts(false, 51), null, o9Var, 4)), null, null, i9VarC, null, ju.PROGRESSIVE_BLUR, travelExperiencesSummary, 514749356);
                            yp0.b.l(kuVar, 0, 0, 0, 0, null, false, 63);
                        } else {
                            it8 = it12;
                            String strQ3 = j6.a.q("SUMMARY_ITEM_ID", str15);
                            List list19 = list17;
                            ArrayList arrayList9 = new ArrayList(zhm.w.t(list19, 10));
                            Iterator it14 = list19.iterator();
                            while (it14.hasNext()) {
                                arrayList9.add(new UrlImage((String) it14.next(), null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) null, (Integer) null, (Integer) null, 507), null, null, false, false, 507902));
                            }
                            TextClause textClause4 = new TextClause(travelExperiencesSummary.f93202b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            i9 i9VarC2 = a1g.c.c(travelExperienceRatings, i101);
                            dj0.d dVar7 = travelExperiencesPricing.f93199b;
                            RevPoints revPoints = travelExperiencesPricing.e;
                            MoneyClause.Format.Shorts shorts2 = new MoneyClause.Format.Shorts(false, 51);
                            o9 o9Var2 = o9.NON_SENSITIVE;
                            MoneyClause moneyClause = new MoneyClause(dVar7, shorts2, null, o9Var2, 4);
                            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_list_price_per_person, null, new Custom(Integer.valueOf(i101), false, null, false, null, 254), 10);
                            if (revPoints != null) {
                                i = 14;
                                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_price_breakdown_points_title, null, null, 14);
                            } else {
                                i = 14;
                                textLocalisedClause = null;
                            }
                            kuVar = new ku(strQ3, textClause4, null, null, moneyClause, null, textLocalisedClause4, 0, null, null, m3g.c0.c(travelExperiencesSummary, i101), arrayList9, null, textLocalisedClause, revPoints != null ? TagViewData.Companion.e(TagViewData.INSTANCE, nub.a.i(revPoints, null, null, o9Var2, 3), false, null, i) : null, null, null, null, null, i9VarC2, null, ju.PROGRESSIVE_BLUR, travelExperiencesSummary, 514823084);
                            yp0.b.l(kuVar, 0, 0, 0, 0, null, false, 63);
                        }
                    } else {
                        it8 = it12;
                        String str16 = travelExperiencesSummary.f93201a;
                        TravelExperiencesPricing travelExperiencesPricing2 = travelExperiencesSummary.f;
                        String strQ4 = j6.a.q("SUMMARY_ITEM_ID", str16);
                        List list20 = travelExperiencesSummary.f93203c;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(list20, 10));
                        Iterator it15 = list20.iterator();
                        while (it15.hasNext()) {
                            arrayList10.add(new UrlImage((String) it15.next(), null, null, null, 0L, null, null, null, null, null, false, null, null, null, true, false, 393214));
                        }
                        TextClause textClause5 = new TextClause(travelExperiencesSummary.f93202b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        i9 i9VarC3 = a1g.c.c(travelExperiencesSummary.e, i101);
                        dj0.d dVar8 = travelExperiencesPricing2.f93199b;
                        MoneyClause.Format.Shorts shorts3 = new MoneyClause.Format.Shorts(false, 51);
                        o9 o9Var3 = o9.NON_SENSITIVE;
                        kuVar = new ku(strQ4, textClause5, null, null, new MoneyClause(dVar8, shorts3, null, o9Var3, 4), null, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_list_price_per_person, null, new Custom(Integer.valueOf(i101), false, null, false, null, 254), 10), 0, null, null, m3g.c0.c(travelExperiencesSummary, i101), arrayList10, null, new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_list_instant_cashback, null, new Custom(Integer.valueOf(i101), false, null, false, null, 254), 10), new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTeal), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(travelExperiencesPricing2.f93200c.f93193a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorTeal), false, null, false, null, 254), o9Var3), R$attr.uikit_colorTransparent, null, R$attr.uikit_colorTeal, null, 1000), null, null, null, null, i9VarC3, null, ju.PROGRESSIVE_BLUR, travelExperiencesSummary, 514823084);
                        yp0.b.l(kuVar, 0, 0, 0, 0, null, false, 63);
                    }
                    arrayList7.add(kuVar);
                    it12 = it8;
                    i5 = 10;
                }
                return zhm.d0.E0(arrayList7, list15);
        }
    }

    public /* synthetic */ y(i0 i0Var, dj0.d dVar, c02.f fVar) {
        this.f186335a = 3;
        this.f186336b = dVar;
        this.f186337c = fVar;
    }

    public /* synthetic */ y(lk7.g gVar, ListSubheaderDelegate.Model model, lk7.q qVar) {
        this.f186335a = 17;
        this.f186336b = gVar;
        this.f186337c = model;
    }
}
