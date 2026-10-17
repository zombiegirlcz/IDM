package vjh;

import android.os.Parcelable;
import aw0.k7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.r2;
import aw0.t0;
import aw0.u0;
import bof.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.delegates.x8;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.g0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.devicemanagement.api.model.UserDeviceAddress;
import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$ParticipantRowData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderBenefits;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderBenefitsItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfoDetails;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfoItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderNextReward;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderPlanSwitchBanner;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderPlanSwitchBannerItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderPoints;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderPointsItem;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.revolut_shop.api.R$plurals;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.model.PortfolioInsightParcel;
import com.revolut.feature.transaction.recogniser.api.domain.models.Location;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount;
import com.youTransactor.uCube.rpc.Constants;
import d3c.b0;
import d3c.c0;
import d3c.g;
import d3c.m0;
import d3c.y;
import d3c.z;
import dfj.b3;
import dfj.c3;
import dfj.d3;
import dfj.e3;
import dfj.f3;
import ggk.g1;
import gu7.f1;
import ip0.ck0;
import ip0.dk0;
import ip0.ej;
import ip0.p90;
import ip0.qw;
import ip0.rr;
import ip0.xh0;
import ip0.yj0;
import ip0.yt;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kl7.f2;
import kl7.g2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import ms0.e4;
import ms0.h4;
import mx0.c7;
import mx0.d7;
import mx0.i1;
import mx0.v5;
import org.jmrtd.lds.LDSFile;
import qee.s;
import qv0.n;
import tof.a3;
import tof.p3;
import vf0.k;
import vo8.q0;
import vo8.r0;
import w2a.o;
import w3c.j;
import w4i.l;
import w6h.g;
import w7b.m;
import wh4.p;
import wh4.x;
import wj8.e0;
import wjd.t;
import x0b.h;
import y3c.f;
import z0h.j0;
import z0h.q1;
import z3c.i;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289746b;

    public /* synthetic */ c(JuniorBankingProfile juniorBankingProfile, r0 r0Var) {
        this.f289745a = 4;
        this.f289746b = juniorBankingProfile;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        TextLocalisedClause textLocalisedClause;
        int i;
        Style style;
        Address address;
        ArrayList arrayList;
        boolean z;
        boolean z3;
        CellDetailsDelegate.Model model;
        int i2;
        m0 m0Var;
        Address address2;
        dj0.d dVar;
        Iterator it8;
        TextLocalisedClause textLocalisedClause2;
        Object next;
        CellDetailsDelegate.Model model2;
        Object next2;
        Data accountBalanceData;
        w3c.e eVar = (w3c.e) this.f289746b;
        k kVar = (k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(kVar, "<destruct>");
        b0 cart = (b0) kVar.f288454a;
        RevolutShopAccount selectedAccount = (RevolutShopAccount) kVar.f288456c;
        Address selectedAddress = (Address) kVar.d;
        m0 m0Var2 = (m0) kVar.e;
        aim.e eVarB = u.b();
        ArrayList items = cart.f110997h;
        dj0.d dVar2 = cart.f110996g;
        MoneyClause moneyClause = null;
        if (items.isEmpty()) {
            FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("EMPTY_CART_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_cart_empty_title, null, null, 14), new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_cart_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D091", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_cart_empty_button_shop_hardware_title, null, null, 14), null, h4.ACCENT), zj.REGULAR, true, null, null, null, 1856);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model3);
            address = selectedAddress;
            arrayList = items;
            z = false;
            z3 = true;
        } else {
            dj0.d dVarD = ebm.a.d(cart);
            Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(z3c.a.a(selectedAccount), null, null, false, null, false, 60);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_payment_title, null, null, 14);
            aim.e eVarB2 = u.b();
            if (selectedAccount.f84200c.f115082a >= (dVarD != null ? dVarD.f115082a : Long.MAX_VALUE)) {
                Clause clauseA = y3c.d.a(selectedAccount, null);
                if (clauseA != null) {
                    eVarB2.add(clauseA);
                }
                eVarB2.add(new MoneyClause(selectedAccount.f84200c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
            } else {
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
                Clause clauseA2 = y3c.d.a(selectedAccount, custom);
                if (clauseA2 != null) {
                    eVarB2.add(clauseA2);
                }
                eVarB2.add(new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_payment_method_section_insufficient_funds_subtitle, null, custom, 10));
            }
            aim.e eVarA = u.a(eVarB2);
            RowDelegate.Model model4 = new RowDelegate.Model("ACCOUNT_ITEM_LIST_ID", image40, textLocalisedClause3, null, 0, eVarA.size() > 1 ? yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eVarA) : (Clause) d0.b0(eVarA), null, null, 0, new pf(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_button_change_title, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model4);
            Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_location_pin, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone10), null, null, false, null, false, 60);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_delivery_cell_deliver_to_title, null, null, 14);
            if (cp5.c.B(selectedAddress)) {
                textClause = new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_delivery_section_missing_information_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10);
            } else {
                String streetLine1 = selectedAddress.getStreetLine1();
                String streetLine2 = selectedAddress.getStreetLine2();
                String[] elements = {selectedAddress.getPostcode(), selectedAddress.getCity()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
                String[] elements2 = {streetLine1, streetLine2, list != null ? d0.k0(list, null, null, null, 0, null, 63) : null, cp5.c.f(selectedAddress.getCountry())};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                textClause = new TextClause(d0.k0(kotlin.collections.d.L(elements2), "\n", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            RowDelegate.Model model5 = new RowDelegate.Model("DELIVERY_ADDRESS_ITEM_LIST_ID", image402, textLocalisedClause4, null, 0, textClause, null, null, 0, new pf(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_button_change_title, null, null, 14), null, null, false, new a4c.a(selectedAddress), null, 478), false, null, false, null, null, null, null, null, null, new a4c.a(selectedAddress), null, 0, 0, 0, 0, 532675544);
            RowDelegate.Model.MainImage.Image40 image403 = new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_delivery_car, R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone10), null, null, false, null, false, 60);
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_delivery_section_method_title, null, null, 14);
            int i3 = R$string.revolut_shop_flow_checkout_screen_checkout_delivery_section_method_express_title;
            if (dVar2 != null) {
                textLocalisedClause = textLocalisedClause5;
                i = i3;
                style = null;
                moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            } else {
                textLocalisedClause = textLocalisedClause5;
                i = i3;
                style = null;
            }
            List listK = v.k(model5, new RowDelegate.Model("DELIVERY_METHOD_ITEM_LIST_ID", image403, textLocalisedClause, null, 0, new TextLocalisedClause(i, v.l(moneyClause), style, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            eVarB.addAll(listK);
            ArrayList shipments = cart.i;
            Intrinsics.checkNotNullParameter(items, "items");
            String str = "shipments";
            Intrinsics.checkNotNullParameter(shipments, "shipments");
            ArrayList arrayList2 = new ArrayList(w.t(items, 10));
            for (Iterator it9 = items.iterator(); it9.hasNext(); it9 = it8) {
                c0 item = (c0) it9.next();
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(shipments, str);
                g gVar = item.f111009l;
                dj0.d dVar3 = item.f111006g;
                dj0.d dVar4 = item.f;
                ArrayList arrayList3 = shipments;
                String str2 = item.f111003a;
                ArrayList arrayList4 = items;
                String str3 = str;
                long j2 = item.d;
                String str4 = gVar.f111017b;
                TextClause textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                if (j2 > 1) {
                    dVar = dVar2;
                    it8 = it9;
                    m0Var = m0Var2;
                    address2 = selectedAddress;
                    textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_order_summary_section_item_footer_value, u.c(new MoneyClause(item.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                } else {
                    m0Var = m0Var2;
                    address2 = selectedAddress;
                    dVar = dVar2;
                    it8 = it9;
                    textLocalisedClause2 = null;
                }
                RowDelegate.Model model6 = new RowDelegate.Model(j6.a.q("PRODUCT_ITEM_LIST_ID_", str2), new RowDelegate.Model.MainImage.Image40(new UrlImage(item.f111010m.f111015b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60), i.b(j2, item.f111009l.f111016a), null, 0, textClause2 == null ? textLocalisedClause2 : textClause2, textClause2 != null ? textLocalisedClause2 : null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(pyd.c.U(dVar4, j2), new MoneyClause.Format.Defaults(null, null, false, false, 15), !dVar4.equals(dVar3) ? new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254) : null, null, 8), !dVar4.equals(dVar3) ? new MoneyClause(pyd.c.U(dVar3, j2), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, 8) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869784);
                Iterator it10 = arrayList3.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it10.next();
                    Iterator it11 = ((y) next).d.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it11.next();
                        if (Intrinsics.f(((z) next2).f111080a, str2)) {
                            break;
                        }
                    }
                    if (next2 != null) {
                        break;
                    }
                }
                y yVar = (y) next;
                if (yVar != null) {
                    String strQ = j6.a.q("DELIVERY_ITEM_LIST_ID_", str2);
                    CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_subtotal_cell_delivery_title, null, null, 14), new TextClause("·", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(yVar.f111079c, new TimeClause.Format.DayAndMonth(0), null, null, 12)));
                    dj0.d dVar5 = yVar.f111078b;
                    model2 = new CellDetailsDelegate.Model(strQ, compositeClauseM, dVar5.k() ? new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_order_summary_section_free_delivery_title, null, null, 14) : new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                } else {
                    model2 = null;
                }
                qv0.i[] elements3 = {model6, model2};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                arrayList2.add(kotlin.collections.d.L(elements3));
                str = str3;
                shipments = arrayList3;
                items = arrayList4;
                dVar2 = dVar;
                selectedAddress = address2;
                m0Var2 = m0Var;
            }
            m0 vatType = m0Var2;
            address = selectedAddress;
            arrayList = items;
            dj0.d dVar6 = dVar2;
            z = false;
            z3 = true;
            eVarB.addAll(yp0.b.g(w.u(arrayList2), new ListSubheaderDelegate.Model("ORDER_SUMMARY_HEADER_ITEM_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_order_summary_section_subheader_title, null, null, 14), (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.revolut_shop_flow_checkout_screen_checkout_order_summary_section_subheader_value, Integer.valueOf(arrayList.size()), u.c(Integer.valueOf(arrayList.size())), (Style) null, 24), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
            Intrinsics.checkNotNullParameter(cart, "cart");
            Intrinsics.checkNotNullParameter(vatType, "vatType");
            dj0.d dVar7 = cart.e;
            CellDetailsDelegate.Model model7 = dVar7 != null ? new CellDetailsDelegate.Model("PRICE_SUBTOTAL_ITEM_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_subtotal_cell_subtotal_title, null, null, 14), new MoneyClause(dVar7, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
            CellDetailsDelegate.Model model8 = dVar6 != null ? new CellDetailsDelegate.Model("PRICE_DELIVERY_ITEM_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_subtotal_cell_delivery_title, null, null, 14), new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
            dj0.d dVar8 = cart.f;
            if (dVar8 != null) {
                int i5 = f.f310694a[vatType.ordinal()];
                if (i5 == 1) {
                    i2 = R$string.revolut_shop_flow_checkout_screen_checkout_price_section_included_tax_title;
                } else {
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.revolut_shop_flow_checkout_screen_checkout_price_section_included_gst_title;
                }
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i2, null, null, 14);
                String str5 = cart.f110998j;
                Object[] elements4 = {textLocalisedClause6, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                List listL = kotlin.collections.d.L(elements4);
                model = new CellDetailsDelegate.Model("PRICE_TAX_INCLUDED_ITEM_LIST_ID", (Clause) (((ArrayList) listL).size() == 1 ? d0.b0(listL) : yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL)), new MoneyClause(dVar8, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            } else {
                model = null;
            }
            CellDetailsDelegate.Model[] elements5 = {model7, model8, model};
            Intrinsics.checkNotNullParameter(elements5, "elements");
            List listL2 = kotlin.collections.d.L(elements5);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            dj0.d dVarD2 = ebm.a.d(cart);
            if (dVarD2 != null) {
                CellDetailsDelegate.Model model9 = new CellDetailsDelegate.Model("PRICE_TOTAL_ITEM_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_total_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(dVarD2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, j2.H3, null, 0, null, false, null, 0, 0, 0, 0, 1047528);
                yp0.b.l(model9, 0, 0, 0, 0, null, false, 63);
                listL2 = d0.F0(model9, listL2);
            }
            eVarB.addAll(listL2);
        }
        aim.e eVarA2 = u.a(eVarB);
        Data totalPriceData = ebm.a.c(eVar);
        Intrinsics.checkNotNullParameter(totalPriceData, "totalPriceData");
        TextLocalisedClause textLocalisedClause7 = (TextLocalisedClause) iii.c.f(totalPriceData, new y25.d(6), new y13.a(11), new h(22));
        Data totalPriceData2 = ebm.a.c(eVar);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Data data = eVar.f294272c;
        try {
            Object content = data.getContent();
            accountBalanceData = new Data(content != null ? ((RevolutShopAccount) content).f84200c : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            accountBalanceData = new Data(null, th10, data.getLoading());
        }
        Intrinsics.checkNotNullParameter(totalPriceData2, "totalPriceData");
        Intrinsics.checkNotNullParameter(accountBalanceData, "accountBalanceData");
        Address deliveryAddress = address;
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        boolean z4 = (!((Boolean) iii.c.f(t1.t(totalPriceData2, accountBalanceData), new y25.d(7), new y13.a(12), new h(23))).booleanValue() || cp5.c.B(deliveryAddress)) ? z : z3;
        boolean z6 = !arrayList.isEmpty();
        boolean z11 = !arrayList.isEmpty();
        String str6 = cart.f110999l;
        return new w3c.k(eVarA2, textLocalisedClause7, z6, z4, z11, str6 != null ? new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_terms_and_conditions_title, u.c(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_checkout_section_total_footer_link_terms_and_conditions, null, new Click(28, (Integer) null, (Object) new j(str6), "TERMS_AND_CONDITIONS_ID", false), 10)), null, 12) : null);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        OrderQuoteExtraData.TradingOrderQuoteExtraData tradingOrderQuoteExtraData;
        nel.z zVarA;
        r rVar = (r) this.f289746b;
        l content = (l) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        z4i.b bVar = (z4i.b) rVar.d;
        Intrinsics.checkNotNullParameter(content, "content");
        TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData = bVar.f319385a;
        Breakdown.Transaction transaction = transactionBreakdownScreenContract$InputData.f97175a;
        q qVar = bVar.f319386b;
        c4i.a transactionType = transaction.f97052c;
        l5i.h hVarD = qVar.d(transactionType);
        OrderQuote quote = content.f294577a;
        List instruments = content.f294579c;
        wi0.b bVar2 = content.f294578b;
        d4i.h hVar = new d4i.h(bVar2 != null && com.bumptech.glide.d.n(bVar2), null, transaction.e, content.f294578b, transaction.k, 10);
        TransactionUnitsType unitsType = transaction.f;
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(unitsType, "unitsType");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        if (y4i.a.f310947a[transactionType.ordinal()] != 1 || (zVarA = y4i.b.a(quote, instruments)) == null) {
            tradingOrderQuoteExtraData = null;
        } else {
            int i = y4i.a.f310948b[zVarA.ordinal()];
            tradingOrderQuoteExtraData = new OrderQuoteExtraData.TradingOrderQuoteExtraData(i != 1 ? i != 2 ? com.revolut.feature_market_data_api.models.a.OTHER : com.revolut.feature_market_data_api.models.a.STRUCTURED_NOTE : com.revolut.feature_market_data_api.models.a.BOND, unitsType);
        }
        List listJ = hVarD.j(quote, hVar, tradingOrderQuoteExtraData);
        qv0.i iVar = content.d;
        aim.e eVarB = u.b();
        yp0.b.k(listJ, 0, 0, 0, 0, 31);
        eVarB.addAll(listJ);
        if (iVar != null) {
            yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(iVar);
        }
        if (!eVarB.isEmpty()) {
            Clause clause = transactionBreakdownScreenContract$InputData.f97175a.f97055j;
            ej ejVar = clause != null ? new ej("LIST_ID_FOOTER_DISCLOSURE", new c7(clause, false, null, 6)) : null;
            if (ejVar != null) {
                int iJ = v.j(eVarB);
                n nVar = (n) eVarB.get(v.j(eVarB));
                yp0.b.c(nVar, R$attr.uikit_dp0);
                eVarB.set(iJ, nVar);
                int i2 = R$attr.uikit_dp0;
                yp0.b.r(ejVar, i2, i2, 0, 0, 12);
                eVarB.add(ejVar);
            }
        }
        aim.e eVarA = u.a(eVarB);
        Clause clauseN = transaction.f97054h;
        if (clauseN == null) {
            clauseN = hVarD.n(quote);
        }
        return new cii.b(null, eVarA, new lw0.a(clauseN, hVarD.a(new l5i.g(transaction.f97053g, transactionType == c4i.a.TRADING_FUND_ORDER ? y4i.b.a(quote, instruments) : null)), null, null, false, 28));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        w6h.g gVar = (w6h.g) this.f289746b;
        w5h.i marginWidgetStatus = (w5h.i) obj2;
        ((Boolean) obj3).getClass();
        g.a aVar = w6h.g.Companion;
        Intrinsics.checkNotNullParameter(marginWidgetStatus, "marginWidgetStatus");
        if (Intrinsics.f(marginWidgetStatus, w5h.g.f295274a)) {
            return f0.f322471a;
        }
        if (marginWidgetStatus instanceof w5h.h) {
            return (List) iii.c.f(((w5h.h) marginWidgetStatus).f295275a, new w3c.n(gVar, 9), new w6b.a(3), new o(gVar, 8));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v17, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16, types: [com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r23v18 */
    private final Object d(Object obj2, Object obj3, Object obj4) throws Throwable {
        int i;
        String str;
        String str2;
        Collection collectionG;
        Throwable th10;
        Collection collectionG2;
        kxk.o oVar = (kxk.o) this.f289746b;
        CobrandedCardsValueReminder valueReminder = (CobrandedCardsValueReminder) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(valueReminder, "valueReminder");
        CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = (CobrandedCardsValueReminderScreenContract$InputData) oVar.f190612c;
        if (cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Downgrade) {
            i = com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_value_reminder_downgrade_header_title;
        } else {
            if (!(cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Terminate)) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_value_reminder_terminate_header_title;
        }
        Throwable th11 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(valueReminder.f82441a), null, 12);
        String str3 = valueReminder.f82442b;
        w7b.l lVar = new w7b.l(textLocalisedClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction = valueReminder.f;
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction2 = valueReminder.f82444g;
        m mVar = (cobrandedCardsValueReminderAction == null && cobrandedCardsValueReminderAction2 == null) ? null : new m((cobrandedCardsValueReminderAction == null || (str2 = cobrandedCardsValueReminderAction.f82447a) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (cobrandedCardsValueReminderAction2 == null || (str = cobrandedCardsValueReminderAction2.f82447a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        y7b.a aVar = (y7b.a) oVar.f190611b;
        c7b.a aVar2 = aVar.f311462a;
        Intrinsics.checkNotNullParameter(valueReminder, "valueReminder");
        aim.e eVarB = u.b();
        CobrandedCardsValueReminderPlanSwitchBanner cobrandedCardsValueReminderPlanSwitchBanner = valueReminder.i;
        if (cobrandedCardsValueReminderPlanSwitchBanner == null) {
            collectionG = f0.f322471a;
        } else {
            CobrandedCardsValueReminderPlanSwitchBannerItem cobrandedCardsValueReminderPlanSwitchBannerItem = cobrandedCardsValueReminderPlanSwitchBanner.f82475b;
            collectionG = yp0.b.g(u.c(new RowDelegate.Model("list_id_plan_switch_banner_item", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(aVar2.b(cobrandedCardsValueReminderPlanSwitchBannerItem.f82476a), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause(cobrandedCardsValueReminderPlanSwitchBannerItem.f82477b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(cobrandedCardsValueReminderPlanSwitchBannerItem.f82478c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(cobrandedCardsValueReminderPlanSwitchBannerItem.d.f82447a, (Style) new Click(28, (Integer) null, (Object) cobrandedCardsValueReminderPlanSwitchBannerItem, "ID_SWITCH_BANNER", false), (Integer) null, false, (o9) null, (List) null, 124), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760)), new ListSubheaderDelegate.Model("list_id_section_plan_switch_banner", (Image) null, (Clause) new TextClause(cobrandedCardsValueReminderPlanSwitchBanner.f82474a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(collectionG);
        CobrandedCardsValueReminderCardInfo cobrandedCardsValueReminderCardInfo = valueReminder.f82443c;
        if (cobrandedCardsValueReminderCardInfo != null) {
            ArrayList arrayList = cobrandedCardsValueReminderCardInfo.f82464b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj5 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    Throwable th12 = th11;
                    v.s();
                    throw th12;
                }
                CobrandedCardsValueReminderCardInfoItem cobrandedCardsValueReminderCardInfoItem = (CobrandedCardsValueReminderCardInfoItem) obj5;
                Throwable th13 = th11;
                String strN = a0.d.n("list_id_card_info_item_", i2);
                TextClause textClause = new TextClause(cobrandedCardsValueReminderCardInfoItem.f82471c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = cobrandedCardsValueReminderCardInfoItem.d;
                ?? textClause2 = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : th13;
                String str5 = cobrandedCardsValueReminderCardInfoItem.f82469a;
                String str6 = cobrandedCardsValueReminderCardInfoItem.f82470b;
                arrayList2.add(new RowDelegate.Model(strN, str5 != null ? new RowDelegate.Model.MainImage.Image40(new UrlImage(str5, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62) : str6 != null ? new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(aVar2.b(str6), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62) : th13, textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                th11 = th13;
                i2 = i3;
            }
            th10 = th11;
            TextClause textClause3 = new TextClause(cobrandedCardsValueReminderCardInfo.f82463a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ?? resourceImage = cobrandedCardsValueReminderCardInfo.f82465c != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : th10;
            CobrandedCardsValueReminderCardInfoDetails cobrandedCardsValueReminderCardInfoDetails = cobrandedCardsValueReminderCardInfo.f82465c;
            eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("list_id_section_card_termination", (Image) null, (Clause) textClause3, (ResourceImage) resourceImage, cobrandedCardsValueReminderCardInfoDetails != null, false, (Clause) null, false, (Object) cobrandedCardsValueReminderCardInfoDetails, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066), null, 0, 0, 126));
        } else {
            th10 = null;
        }
        CobrandedCardsValueReminderNextReward cobrandedCardsValueReminderNextReward = valueReminder.d;
        if (cobrandedCardsValueReminderNextReward != null) {
            ArrayList arrayList3 = cobrandedCardsValueReminderNextReward.f82473b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            int i5 = 0;
            for (Object obj6 : arrayList3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw th10;
                }
                arrayList4.add(RowDelegate.Model.x(aVar.f311463b.a((CobrandedCardsPlanHubInfoRewardChallenge) obj6, i5), null, null, null, null, null, 0, null, false, RowDelegate.Model.b.c.f53268a, null, 0, 0, 0, 0, null, -10241, 15));
                i5 = i6;
            }
            eVarB.addAll(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model("list_id_section_next_reward", (Image) null, (Clause) new TextClause(cobrandedCardsValueReminderNextReward.f82472a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        CobrandedCardsValueReminderBenefits cobrandedCardsValueReminderBenefits = valueReminder.e;
        if (cobrandedCardsValueReminderBenefits != null) {
            CellDetailsStandaloneNoteDelegate.Model.Companion companion = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
            ArrayList arrayList5 = cobrandedCardsValueReminderBenefits.f82460b;
            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
            int i21 = 0;
            for (Object obj7 : arrayList5) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    v.s();
                    throw th10;
                }
                arrayList6.add(CellDetailsStandaloneNoteDelegate.Model.Companion.b(CellDetailsStandaloneNoteDelegate.Model.INSTANCE, a0.d.n("list_id_lost_benefits_item_", i21), new TextClause(((CobrandedCardsValueReminderBenefitsItem) obj7).f82461a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
                i21 = i22;
            }
            companion.getClass();
            eVarB.addAll(yp0.b.g(CellDetailsStandaloneNoteDelegate.Model.Companion.a(arrayList6), new ListSubheaderDelegate.Model("list_id_section_lost_benefits", (Image) null, (Clause) new TextClause(cobrandedCardsValueReminderBenefits.f82459a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        CobrandedCardsValueReminderPoints cobrandedCardsValueReminderPoints = valueReminder.f82446j;
        if (cobrandedCardsValueReminderPoints == null) {
            collectionG2 = f0.f322471a;
        } else {
            CobrandedCardsValueReminderPointsItem cobrandedCardsValueReminderPointsItem = cobrandedCardsValueReminderPoints.f82482b;
            collectionG2 = yp0.b.g(u.c(new RowDelegate.Model("list_id_points_item", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(aVar2.b(cobrandedCardsValueReminderPointsItem.f82483a), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause(cobrandedCardsValueReminderPointsItem.f82484b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(cobrandedCardsValueReminderPointsItem.f82485c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("list_id_section_points", (Image) null, (Clause) new TextClause(cobrandedCardsValueReminderPoints.f82481a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(collectionG2);
        return new w7b.n(lVar, mVar, u.a(eVarB));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        w7f.e eVar = (w7f.e) this.f289746b;
        Template template = (Template) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(template, "template");
        return yp0.b.g(v.k(new HeaderDelegate.Model("InsightsRiskLevelMapper_header", null, new r2(eVar.f295519a.e(template.f95707b, elc.b.DEFAULT), null), null, new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.wealth_robo_insights_risk_risk_level, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960), new p90("InsightsRiskLevelMapper_rating_bar", r1.a() / 5.0f, null, R$attr.uikit_colorGreen, null, R$attr.uikit_colorTerracotta, 0, 980)), new ListSubheaderDelegate.Model("InsightsRiskLevelMapper_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_porfolio_risk_metrics_risk, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) new PortfolioInsightParcel.RiskLevel(template.f95707b), (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Clause compositeClause;
        s sVar = (s) this.f289746b;
        List devices = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(devices, "devices");
        r86.d dVar = (r86.d) sVar.f245144b;
        Intrinsics.checkNotNullParameter(devices, "devices");
        List<UserDevice> list = devices;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (UserDevice device : list) {
            LayeredImage layeredImageA = dVar.a(device);
            String str = device.f71914a;
            boolean z = device.f71921m;
            Intrinsics.checkNotNullParameter(device, "device");
            Clause clauseA = dVar.f252377a.a(device);
            UserDeviceAddress userDeviceAddress = device.f71924q;
            if (z) {
                compositeClause = new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_this_device, null, null, 14);
            } else {
                Object[] elements = {new TimeClause(device.o, new TimeClause.Format.Pretty(0), null, null, 12), !kotlin.text.d0.W(userDeviceAddress.d) ? new TextClause(userDeviceAddress.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
            }
            arrayList.add(new wh(j6.a.q("ID_SWIPE_DEVICE_LIST_", str), new RowDelegate.Model(j6.a.q("ID_DEVICE_LIST_", str), layeredImageA, null, null, clauseA, compositeClause, null, null, 0, null, false, false, z ? LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check, R$attr.uikit_colorAccent, R$attr.uikit_colorWhite, null, 4.0f, BitmapDescriptorFactory.HUE_RED, null, 104) : null, null, null, null, null, device, null, 0, 0, 0, 0, 1056948076), u.c(new SwipeToActionDelegate.SwipeAction("ID_SWIPE_ACTION_DEVICE_LIST", new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.devicemanagement.impl.R$string.devices_log_out, null, null, 14), xh0.NEGATIVE, null, device.f71914a, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        w87.a aVar = (w87.a) this.f289746b;
        z0h.t1 disclaimerContent = (z0h.t1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        q1 q1Var = aVar.f295600b;
        Links links = disclaimerContent.f318563a;
        hel.b bVar = disclaimerContent.f318564b;
        return ((aah.m) q1Var).c(u.c(new j0(links, bVar)), bVar);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        List listI;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.f289746b;
        k77.i indexDetails = (k77.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(indexDetails, "indexDetails");
        String str = indexDetails.e;
        return (str == null || (listI = yp0.b.i(new PlainTextDelegate.Model("index-overview-about", (Clause) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), model, null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG)) == null) ? f0.f322471a : listI;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        wk5.a aVar;
        yk5.d dVar2;
        String str;
        wk5.a aVar2;
        yk5.d dVar3;
        String str2;
        wbj.h hVar = (wbj.h) this.f289746b;
        wbj.c content = (wbj.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        sj5.b bVar = hVar.f296239a;
        qv0.i[] elements = new qv0.i[4];
        a3 a3Var = content.f296232a;
        yk5.a aVar3 = content.f296233b;
        p3 p3Var = a3Var.W;
        qv0.i model = null;
        elements[0] = (p3Var == null || (aVar2 = p3Var.d) == null || (dVar3 = aVar3.f314568c) == null || (str2 = dVar3.f314575c) == null) ? null : new CellDetailsActionDelegate.Model("CryptoDepositReturnDetails_SentTo", new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.transaction_details_cryptodeposit_return_details_sent_to, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(((hk5.b) bVar).a(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, new TransactionCryptoRemittanceAction.AddressAction(k71.k.r(a3Var).f115083b, aVar2, str2), 0, 0, 32224);
        p3 p3Var2 = a3Var.W;
        elements[1] = (p3Var2 == null || (aVar = p3Var2.d) == null || (dVar2 = aVar3.f314568c) == null || (str = dVar2.d) == null) ? null : new CellDetailsActionDelegate.Model("CryptoDepositReturnDetails_TransactionHash", new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.transaction_details_cryptodeposit_return_details_transaction_hash, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(((hk5.b) bVar).a(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, new TransactionCryptoRemittanceAction.TransactionHashAction(k71.k.r(a3Var).f115083b, aVar, str), 0, 0, 32224);
        yk5.d dVar4 = aVar3.f314568c;
        elements[2] = (dVar4 == null || (dVar = dVar4.e) == null) ? null : new CellDetailsDelegate.Model("CryptoDepositReturnDetails_RecipientGets", new t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.transaction_details_cryptodeposit_return_details_recipient_gets, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
        yk5.d dVar5 = aVar3.f314568c;
        if (dVar5 != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.transaction_details_cryptodeposit_return_details_fees, null, null, 14);
            yk5.c cVar = dVar5.f;
            List list = cVar != null ? cVar.f314572a : null;
            if (list == null) {
                list = f0.f322471a;
            }
            List list2 = list;
            if (list2.isEmpty()) {
                model = new CellDetailsDelegate.Model("CryptoDepositReturnDetails_Fees", new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.retail.feature.crypto_deposits.impl.R$string.transaction_details_cryptodeposit_return_details_fees_no_fees, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
            } else {
                Iterator it8 = list2.iterator();
                long j2 = 0;
                while (it8.hasNext()) {
                    j2 += ((CryptoWithdrawFeesBreakdownDetail) it8.next()).d.f115082a;
                }
                dj0.d dVar6 = new dj0.d(j2, ((CryptoWithdrawFeesBreakdownDetail) d0.b0(list2)).d.f115083b);
                model = new CellDetailsActionDelegate.Model("CryptoDepositReturnDetails_Fees", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar6, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), false, false, null, new CryptoWithdrawFeesBreakdown(null, null, null, null, dVar6, list2), 0, 0, 32224);
            }
        }
        elements[3] = model;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        qv0.i model;
        wef.e eVar = (wef.e) this.f289746b;
        TransactionRecogniserDetails content = (TransactionRecogniserDetails) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Location location = eVar.f296769b;
        qv0.i iVar = null;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_PAYMENT_TYPE", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_payment_type_title, null, null, 14), new TextClause(content.f91804b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        String str = content.f91805c;
        CellDetailsDelegate.Model model3 = str != null ? new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_DEVICE", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_device_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_CARD", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_card_title, null, null, 14), new TextClause(content.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        String str2 = content.e;
        CellDetailsDelegate.Model model5 = str2 != null ? new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_CATEGORY", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_category_title, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null;
        CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_CURRENCY", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_currency_title, null, null, 14), new CurrencyClause(content.f91803a.f91802c.f115083b, null, null, 6), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        String str3 = content.f;
        if (str3 != null) {
            if (location != null) {
                TextClause textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_note_location, null, null, 14);
                x8 x8Var = new x8(location.f91798a, location.f91799b);
                qw qwVar = qw.CIRCULAR_PIN;
                int i = R$drawable.uikit_icn_24_location_pin;
                int i2 = R$attr.uikit_colorAccent;
                int i3 = R$attr.uikit_dp4;
                model = new w8("RECOGNISER_DETAILS_LOADED_MAP", textClause, textLocalisedClause, x8Var, Integer.valueOf(i), Integer.valueOf(i2), qwVar, null, null, i3, i3, 16256);
            } else {
                model = new CellDetailsDelegate.Model("RECOGNISER_DETAILS_LOADED_ADDRESS", new TextLocalisedClause(com.revolut.feature.transaction.recogniser.impl.R$string.transaction_recogniser_transaction_data_screen_address_title, null, null, 14), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            }
            iVar = model;
        }
        qv0.i[] elements = {model2, model3, model4, model5, model6, iVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object l(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
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

    private final Object m(Object obj2, Object obj3, Object obj4) {
        x xVar = (x) this.f289746b;
        wh4.a content = (wh4.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        x35.e eVar = content.f297395b;
        dz3.c cVar = content.f297394a;
        String str = cVar.f121230a;
        dz3.b bVar = cVar.f;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_title, u.c(str), null, 12);
        String str2 = cVar.f121231b;
        wh4.m mVar = new wh4.m(new hx4.a(textLocalisedClause, str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_second_description, u.c(str2), null, 12) : null, null, f0.f322471a), new aw0.e(true, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_primary_button, u.c(bVar.f121228a), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, eVar != null, null, null, bVar.f121229b, 476), null, null, 54));
        aim.e eVarB = u.b();
        if (eVar != null) {
            int i = com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_title;
            c45.b bVar2 = xVar.f297416a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(bVar2.g(eVar)), null, 12);
            Clause clauseB = bVar2.b(eVar, w35.a.LAST_FOUR);
            RowDelegate.Model model = new RowDelegate.Model("repayment_account", new RowDelegate.Model.MainImage.Image40(bVar2.d(eVar), null, null, false, null, false, 62), textLocalisedClause2, null, 0, clauseB != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_description, u.c(clauseB), null, 12) : null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_change, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
            if (eVar instanceof x35.b) {
                x35.b bVar3 = (x35.b) eVar;
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("list_id_beneficiary_name", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_user_title, null, null, 14), (Image) null, 0, false, 28), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_user_value, u.c(bVar3.f302651g), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                x35.h hVar = bVar3.f;
                t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_iban_title, null, null, 14), (Image) null, 0, false, 28);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_iban_value, u.c(hVar.b()), null, 12);
                u0 u0Var = u0.LARGE;
                List listK = v.k(model2, new CellDetailsDelegate.Model("list_id_iban", t0Var, textLocalisedClause3, null, null, null, u0Var, 0, null, false, false, null, null, 32504), new CellDetailsDelegate.Model("list_id_mandate_reference", new t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_mandate_reference, null, null, 14), (Image) null, 0, false, 28), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_mandate_reference_value, u.c(bVar3.e), null, 12), null, null, null, u0Var, 0, null, false, false, null, null, 32504));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                String str3 = cVar.e;
                if (str3 != null) {
                    ej ejVar = new ej("dd_mandate_confirmation_footer", new c7(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_footer, u.c(str3), null, 12), false, d7.DEFAULT, 2));
                    yp0.b.r(ejVar, 0, 0, 0, 0, 15);
                    eVarB.add(ejVar);
                }
            }
        } else {
            RowDelegate.Model model3 = new RowDelegate.Model("repayment_account", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_repayment, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_no_preselect_set_up_repayment_cell_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_no_preselect_set_up_repayment_cell_description, null, null, 14), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_no_preselect_set_up_repayment_cell_action, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model3);
        }
        return new p(u.a(eVarB), mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        int i;
        ?? arrayList;
        wj8.h hVar = (wj8.h) this.f289746b;
        JuniorBankingProfile juniorProfile = (JuniorBankingProfile) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(juniorProfile, "profile");
        Data dynamicEditFieldsData = hVar.f298007c;
        xc8.c dataManagementConsent = (xc8.c) hVar.f298006b.getContent();
        aim.e eVarB = u.b();
        eVarB.add(wj8.b.b());
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        eVarB.add(wj8.b.a("ID_NAME_ITEM", new TextLocalisedClause(R.string.profile_details_item_name, null, null, 14), new TextClause(ta6.a.t(juniorProfile), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false));
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.profile_dob, null, null, 14);
        long jF = oc.c.F(juniorProfile.i);
        TimeClause.Format.INSTANCE.getClass();
        eVarB.add(wj8.b.a("ID_DOB_ITEM", textLocalisedClause, new TimeClause(jF, TimeClause.Format.f57959a, null, null, 12), false));
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        int i2 = wj8.a.f297996a[juniorProfile.d.ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.junior_resources.R$string.junior_common_gender_boy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.junior_resources.R$string.junior_common_gender_girl;
        }
        eVarB.add(yp0.r.a(wj8.b.a("ID_GENDER_ITEM", new TextLocalisedClause(com.revolut.feature.junior_profile.impl.R$string.junior_profile_gender_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), true)));
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.profile_email_title, null, null, 14);
        String str = juniorProfile.e;
        if (str == null) {
            str = "";
        }
        eVarB.add(wj8.b.a("ID_EMAIL_ITEM", textLocalisedClause2, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true));
        Intrinsics.checkNotNullParameter(dynamicEditFieldsData, "dynamicEditFieldsData");
        List list = (List) dynamicEditFieldsData.getContent();
        if (list != null) {
            List<ij8.g> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (ij8.g gVar : list2) {
                InputTextDelegate.Model model = new InputTextDelegate.Model(j6.a.q("DYNAMIC_EDIT_FIELD_KEY_", gVar.f161730a), new TextLocalisedClause(com.revolut.feature.junior_profile.impl.R$string.profile_details_item_dynamic_value, u.c(gVar.f161731b), null, 12), new TextLocalisedClause(com.revolut.feature.junior_profile.impl.R$string.profile_details_item_dynamic_title, u.c(gVar.f161730a), null, 12), null, false, null, false, null, null, null, null, null, null, false, null, null, false, gVar.f161732c == ij8.e.EDITABLE, false, false, null, 0, null, rr.f166227a, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, gVar.e, null, null, 0, 0, 0, 0, -50593800, 65023);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                int i3 = e0.f298004a[gVar.d.ordinal()];
                if (i3 == 1) {
                    model = yp0.r.a(model);
                } else if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(model);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        eVarB.addAll((Collection) arrayList);
        if (dataManagementConsent != null) {
            Intrinsics.checkNotNullParameter(dataManagementConsent, "dataManagementConsent");
            ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model("ID_CHANGE_DATA_MANAGEMENT_CONSENT_ITEM", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D100", null, null, null, 30)), new TextLocalisedClause(com.revolut.feature.junior_profile.impl.R$string.junior_profile_personal_data_consent_banner_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_profile.impl.R$string.junior_profile_personal_data_consent_banner_description, null, null, 14), null, dataManagementConsent, null, false, false, false, 976);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r42, java.lang.Object r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vjh.c.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelA;
        wjd.u uVar = (wjd.u) this.f289746b;
        List accounts = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List<LinkSocialAccountControllerModelExtension$SocialAccount> listP0 = d0.P0(accounts, new t());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (LinkSocialAccountControllerModelExtension$SocialAccount linkSocialAccountControllerModelExtension$SocialAccount : listP0) {
            int i = wjd.s.f298064b[linkSocialAccountControllerModelExtension$SocialAccount.f106023a.ordinal()];
            if (i == 1) {
                modelA = wjd.u.a(uVar, "BANK_ID_ACCOUNT_SIGN_IN_ID", R$drawable.uikit_icn_24_bankid, com.revolut.feature.sign_in_methods.api.R$string.revolut_sso_sign_in_methods_bankid, linkSocialAccountControllerModelExtension$SocialAccount.f106024b, null, linkSocialAccountControllerModelExtension$SocialAccount, 16);
            } else if (i == 2) {
                modelA = wjd.u.a(uVar, "DAP_ACCOUNT_SIGN_IN_ID", R$drawable.uikit_icn_24_dap, com.revolut.feature.sign_in_methods.api.R$string.revolut_sso_sign_in_methods_dap, linkSocialAccountControllerModelExtension$SocialAccount.f106024b, null, linkSocialAccountControllerModelExtension$SocialAccount, 16);
            } else if (i == 3) {
                modelA = wjd.u.a(uVar, "UAE_PASS_ACCOUNT_SIGN_IN_ID", R$drawable.uikit_icn_24_logo_uae_pass, com.revolut.feature.sign_in_methods.api.R$string.revolut_sso_sign_in_methods_uae, linkSocialAccountControllerModelExtension$SocialAccount.f106024b, null, linkSocialAccountControllerModelExtension$SocialAccount, 16);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = wjd.u.a(uVar, "GOOGLE_ACCOUNT_SIGN_IN_ID", R$drawable.uikit_icn_24_logo_google, com.revolut.feature.sign_in_methods.api.R$string.settings_socialSignIn_google_title, linkSocialAccountControllerModelExtension$SocialAccount.f106024b, null, linkSocialAccountControllerModelExtension$SocialAccount, 16);
            }
            arrayList.add(modelA);
        }
        return arrayList;
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        fu6.t tVar = (fu6.t) this.f289746b;
        g1 layout = (g1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        aim.e eVarB = u.b();
        eVarB.addAll(((dnk.a) tVar.f138108c).a(layout.f143722h));
        eVarB.addAll(((dnk.m) tVar.d).a(layout.i));
        return u.a(eVarB);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        wl6.i iVar = (wl6.i) this.f289746b;
        ph6.b details = (ph6.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        aim.e eVarB = u.b();
        ph6.c cVar = details.d.f236225b;
        List list = cVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new RowDelegate.Model(a0.d.n("INSTITUTION_ROW_", i), new RowDelegate.Model.MainImage.Image40(((di6.a) iVar.f298442a).c(cVar.f236223c), null, null, false, null, false, 60), new TextClause(cVar.f236222b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause((String) obj5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
        String str = details.d.f236224a;
        ListSubheaderDelegate.Model model = str != null ? new ListSubheaderDelegate.Model("INSTITUTION_SECTION_TITLE_ID", (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
        if (model != null) {
            arrayList = yp0.b.g(arrayList, model, null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
        } else {
            yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
        }
        eVarB.addAll(arrayList);
        ph6.e eVar = details.e;
        ArrayList<oh6.b> arrayList2 = eVar.f236227b;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (oh6.b bVar : arrayList2) {
            arrayList3.add(new ListCellDelegate.Model(j6.a.q("PERMISSION_ROW_", bVar.f225315a), new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextClause(bVar.f225316b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, 0, 0, 0, 0, 4088));
        }
        eVarB.addAll(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("PERMISSIONS_SECTION_TITLE_ID", (Image) null, (Clause) new TextClause(eVar.f236226a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG));
        List listC = u.c(new RowDelegate.Model("AUTHORIZATION_ENDS_ID", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_account_linking_review_authorisation_authorisation_ends, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(details.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
        yp0.b.k(listC, 0, R$attr.uikit_dp16, 0, 0, 29);
        eVarB.addAll(listC);
        RowDelegate.Model model2 = new RowDelegate.Model("RENEW_OR_EDIT_ITEM_ID", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_linked_accounts_details_renew_or_edit, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        RowDelegate.Model model3 = new RowDelegate.Model("REVOKE_ITEM_ID", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_action_revoke, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        return u.a(eVarB);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        List list;
        List listU;
        List listU2;
        km9.g gVar = ((wm9.m) this.f289746b).f298623a;
        im9.a content = (im9.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        List list2 = content.f162316a;
        ArrayList arrayList = content.f162317b;
        if (list2 != null) {
            if (list2.isEmpty()) {
                listU2 = u.c(new FullScreenStateDelegate.Model("REQUIRES_AUTHENTICATION_SECTION_EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_requires_authentication_empty_state, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
            } else {
                List listP0 = d0.P0(list2, new km9.h());
                listU2 = w.u(v.k(gVar.b(d0.V0(listP0, 3), PayeesFlowType.RequireAuthentication.f78996a), v.l(listP0.size() > 3 ? wm9.m.a("PAYEES_REQUIRES_AUTHENTICATION_SEE_ALL_ITEM_ID") : null)));
            }
            list = listU2;
        } else {
            list = null;
        }
        if (list != null) {
            eVarB.addAll(yp0.b.g(list, wm9.m.b(com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_requires_authentication, "PAYEES_REQUIRE_AUTHENTICATION_SUBHEADER_ITEM_ID"), null, 0, 0, 126));
        }
        if (arrayList.isEmpty()) {
            listU = u.c(new FullScreenStateDelegate.Model("BLOCKED_SECTION_EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_blocked_empty_state, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
        } else {
            List listP02 = d0.P0(arrayList, new km9.h());
            listU = w.u(v.k(gVar.b(d0.V0(listP02, 3), new PayeesFlowType.Blocked(OwnerType.CurrentUser.f78992a)), v.l(listP02.size() > 3 ? wm9.m.a("PAYEES_BLOCKED_SEE_ALL_ITEM_ID") : null)));
        }
        eVarB.addAll(yp0.b.g(listU, wm9.m.b(com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_blocked, "PAYEES_BLOCKED_SUBHEADER_ITEM_ID"), null, 0, 0, 126));
        return u.a(eVarB);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        int i;
        TextLocalisedClause textLocalisedClause2;
        Clause clauseA;
        eb8.f fVar;
        eb8.e eVar;
        eb8.k kVar;
        TextLocalisedClause textLocalisedClause3;
        RowDelegate.Model.b bVar;
        CounterTextDelegate.Model modelA;
        com.revolut.feature.insurance_embedded.impl.data.model.p pVar;
        String code;
        int i2;
        int i3;
        int i5 = this.f289745a;
        boolean z = false;
        Clause textLocalisedClause4 = null;
        aw0.i eVar2 = null;
        Object obj5 = this.f289746b;
        switch (i5) {
            case 0:
                e eVar3 = (e) obj5;
                dih.b accountWidgets = (dih.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(accountWidgets, "accountWidgets");
                List list = accountWidgets.f115060a;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (jjh.b.b(((dih.a) obj6).f115058a)) {
                        arrayList.add(obj6);
                    }
                }
                List<dih.a> listP0 = d0.P0(arrayList, new d());
                ArrayList arrayList2 = new ArrayList();
                for (dih.a aVar : listP0) {
                    WealthAccount wealthAccount = aVar.f115058a;
                    a0.x((Iterable) iii.c.f(aVar.f115059b, new vgk.f(eVar3, wealthAccount, 6), new a83.z(eVar3, 20, wealthAccount, accountWidgets), new soc.f(wealthAccount, 8, eVar3, accountWidgets)), arrayList2);
                }
                return arrayList2;
            case 1:
                vk7.k kVar2 = (vk7.k) obj5;
                List claims = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(claims, "claims");
                List listP02 = d0.P0(claims, new vk7.j());
                if (listP02.isEmpty()) {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID MAKE A CLAIM", new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_my_claims_claims_list_claim_dialog_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30)), null, new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_my_claims_claims_list_claim_dialog_action_text, null, null, 14), false, null, null, false, 0, 0, 32724);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    return u.c(model);
                }
                ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("CLAIMS ACTIVE SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_my_claims_claims_list_status_in_review, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List list2 = listP02;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list2) {
                    if (((CFACClaim) obj7).f74934c == CFACClaimStatus.IN_REVIEW) {
                        arrayList3.add(obj7);
                    }
                }
                Collection collectionG = arrayList3.isEmpty() ? f0.f322471a : yp0.b.g(kVar2.c(arrayList3), model2, null, 0, 0, 126);
                ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("CLAIMS CLOSED SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance.impl.R$string.cfac_my_claims_claims_list_claim_status_closed, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : list2) {
                    if (((CFACClaim) obj8).f74934c != CFACClaimStatus.IN_REVIEW) {
                        arrayList4.add(obj8);
                    }
                }
                return d0.E0(arrayList4.isEmpty() ? f0.f322471a : yp0.b.g(kVar2.c(arrayList4), model3, null, 0, 0, 126), collectionG);
            case 2:
                vmh.g gVar = (vmh.g) obj5;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                if (content.size() < 2) {
                    return f0.f322471a;
                }
                List<vmh.f> list3 = content;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                for (vmh.f product : list3) {
                    String strName = product.name();
                    boolean z3 = gVar.f290587c;
                    Intrinsics.checkNotNullParameter(product, "product");
                    int[] iArr = vmh.l.f290595a;
                    switch (iArr[product.ordinal()]) {
                        case 1:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_stocks, null, null, 14);
                            break;
                        case 2:
                            textLocalisedClause = z3 ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_etfs_etps, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_etfs, null, null, 14);
                            break;
                        case 3:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_bonds, null, null, 14);
                            break;
                        case 4:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_cfds, null, null, 14);
                            break;
                        case 5:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_commodities, null, null, 14);
                            break;
                        case 6:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_private_markets, null, null, 14);
                            break;
                        case 7:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_mutual_funds, null, null, 14);
                            break;
                        case 8:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_structured_notes, null, null, 14);
                            break;
                        case 9:
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_products_content_strategies, null, null, 14);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
                    Intrinsics.checkNotNullParameter(product, "product");
                    switch (iArr[product.ordinal()]) {
                        case 1:
                            i = R$drawable.uikit_icn_24_rates;
                            break;
                        case 2:
                            i = R$drawable.uikit_icn_24_pie_chart;
                            break;
                        case 3:
                            i = R$drawable.uikit_icn_24_bank;
                            break;
                        case 4:
                            i = R$drawable.uikit_icn_24_cfd;
                            break;
                        case 5:
                            i = R$drawable.uikit_icn_24_commodities;
                            break;
                        case 6:
                            i = R$drawable.uikit_icn_24_portfolio_slow_and_steady;
                            break;
                        case 7:
                            i = R$drawable.uikit_icn_24_pie_chart_circle;
                            break;
                        case 8:
                            i = R$drawable.uikit_icn_24_connection_grid;
                            break;
                        case 9:
                            i = R$drawable.uikit_icn_24_revolut;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList5.add(new ActionsView.Item(strName, product == gVar.f290586b ? mx0.d.ACCENT : mx0.d.SEMIACCENT, false, e4.EnabledClickable, null, textLocalisedClause5, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new vmh.e(product), null, 24468));
                }
                return u.c(new ip0.z("trade-screen-filters", arrayList5, null, mx0.l.COMPACT_FLEXBOX, 0, 0, 116));
            case 3:
                f3 details = (f3) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(details, "details");
                xmj.h hVar = ((vmj.k) obj5).f290615a;
                Intrinsics.checkNotNullParameter(details, "details");
                xmj.d dVar = hVar.f307283a;
                i80.a aVar2 = details.f113964a;
                e3 e3Var = details.f113966c;
                g0 g0Var = new g0(dVar.a(aVar2, e3Var != null ? e3Var.f113949a : null, xmj.a.DISPLAY));
                if (e3Var == null) {
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_common_revolut_mobile, null, null, 14);
                } else {
                    int i6 = xmj.g.f307282a[e3Var.f113949a.ordinal()];
                    if (i6 == 1) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_country_picker_data_calls_sms_title, null, null, 14);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i21 = com.revolut.retail.feature.esim.impl.R$string.esim_gifting_share_qr_code_data_plan_title;
                        d3 d3Var = e3Var.f113950b;
                        if (d3Var instanceof c3) {
                            clauseA = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_plan_details_unlimited_gb, null, null, 14);
                        } else {
                            if (!(d3Var instanceof b3)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            clauseA = gej.a.a(hVar.f307284b, ((b3) d3Var).f113918a, null, 6);
                        }
                        textLocalisedClause2 = new TextLocalisedClause(i21, v.k(clauseA, new PeriodClause(new PeriodClause.PeriodComponents(0, 0, e3Var.f113951c.getDays(), 0, 0, 0, 59), null)), null, 12);
                    }
                }
                return new ProfileCardModel.Loaded(null, g0Var, new com.revolut.core.ui_kit.models.s(57, textLocalisedClause2, null, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_gifting_share_qr_code_subtitle, u.c(details.f113965b), null, 12)), null, null, 121);
            case 4:
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj5;
                od0.i optionalGraduation = (od0.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(optionalGraduation, "optionalGraduation");
                Object obj9 = optionalGraduation.f224257a;
                if (obj9 == null || juniorBankingProfile == null || (eVar = (fVar = (eb8.f) obj9).f124304c) == null || (kVar = eVar.f124301c) == null) {
                    return null;
                }
                eb8.i iVar = kVar.f124308b;
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.rev_u18_account_settings_security_and_privacy_transfer_balance_item_title, null, null, 14);
                int[] iArr2 = q0.f290909a;
                int i22 = iArr2[iVar.ordinal()];
                if (i22 == 1) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.rev_u18_account_settings_security_and_privacy_transfer_balance_item_subtitle_allowed_with_name, u.c(juniorBankingProfile.f77099b), null, 12);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.rev_u18_account_settings_security_and_privacy_transfer_balance_item_subtitle_forbidden, null, null, 14);
                }
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_payments, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
                boolean z4 = kVar.f124307a == eb8.j.ALLOWED;
                int i32 = iArr2[iVar.ordinal()];
                if (i32 == 1) {
                    z = true;
                } else if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vf vfVar = new vf(z4, z);
                int i33 = iArr2[iVar.ordinal()];
                if (i33 == 1) {
                    bVar = RowDelegate.Model.b.c.f53268a;
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = RowDelegate.Model.b.a.f53266a;
                }
                return new RowDelegate.Model("ID_TRANSFER_JUNIOR_BALANCE", image24, textLocalisedClause6, null, 0, textLocalisedClause3, null, null, 0, vfVar, false, null, false, bVar, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532657112);
            case 5:
                vob.k kVar3 = (vob.k) obj5;
                vob.f fVar2 = (vob.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(fVar2, "<destruct>");
                ArrayList<vob.e> arrayList6 = fVar2.f290935a;
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_representative_examples_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_representative_examples_description, u.c(new MoneyClause(fVar2.f290936b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, false, 28);
                aim.e eVarB = u.b();
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                for (vob.e eVar4 : arrayList6) {
                    hha.d dVar2 = eVar4.f290932a;
                    arrayList7.add(new CellDetailsDelegate.Model(dVar2.f152287a, eVar4.f290934c ? new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_choose_a_currency_tab_title_your_plan, null, null, 14) : fgk.b.a(kVar3.f290943a, dVar2), new MoneyClause(eVar4.f290933b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                a0.x(arrayList7, eVarB);
                LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
                int i43 = R$attr.uikit_dp16;
                yp0.b.r(model4, i43, i43, 0, 0, 12);
                eVarB.add(model4);
                return new vob.h(u.a(eVarB), aVar3);
            case 6:
                vq7.l lVar = (vq7.l) obj5;
                g2 telematicsDeviceDelivery = (g2) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(telematicsDeviceDelivery, "telematicsDeviceDelivery");
                aim.e eVarB2 = u.b();
                RowDelegate.Model.MainImage.Image24 image24I = xl7.n.i(R$drawable.uikit_icn_24_location_arrow, Integer.valueOf(R$attr.uikit_colorForeground));
                f2 f2Var = telematicsDeviceDelivery.f185327c;
                f2 f2Var2 = telematicsDeviceDelivery.f185327c;
                String str = f2Var.f185317a;
                RowDelegate.Model model5 = new RowDelegate.Model("SHIPPING_ADDRESS_ID_", image24I, new TextLocalisedClause(str != null ? kotlin.text.d0.W(str) ^ true : false ? com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_delivery_tracking_address_title : com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_delivery_no_tracking_address_title, null, null, 14), null, 0, new TextClause(o51.a.b(telematicsDeviceDelivery.f185326b, ((s80.b) lVar.f291357a).b()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                String str2 = f2Var2.f185317a;
                RowDelegate.Model[] elements = {model5, str2 != null ? new RowDelegate.Model("TRACKING_NUMBER_ID", xl7.n.i(R$drawable.uikit_icn_24_map_point, Integer.valueOf(R$attr.uikit_colorForeground)), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_delivery_tracking_track_delivery, u.c(new TextClause(str2, (Style) new Click(28, (Integer) null, (Object) f2Var2, "TRACKING_NUMBER_ID", false), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                a0.x(listL, eVarB2);
                RowDelegate.Model model6 = new RowDelegate.Model("ACTIVATE_YOUR_DEVICE_ID", xl7.n.k(R$drawable.uikit_icn_24_exclamation_triangle, false, null, 15), new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_delivery_activate_device_title, u.c(xl7.n.e(telematicsDeviceDelivery.f185325a, TimeClause.Format.DateLong.f57962b)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_telematics_device_delivery_activate_device_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, telematicsDeviceDelivery, null, 0, 0, 0, 0, 532676568);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(model6);
                CellDetailsChevronDelegate.Model model7 = new CellDetailsChevronDelegate.Model("GET_HELP_ID", new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_common_get_help, null, null, 14), 0, false, null, null, null, 2044);
                yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(model7);
                return u.a(eVarB2);
            case 7:
                vsk.h hVar2 = (vsk.h) obj5;
                List instruments = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                if (instruments.isEmpty()) {
                    return f0.f322471a;
                }
                List<nel.a0> list4 = instruments;
                ArrayList arrayList8 = new ArrayList(w.t(list4, 10));
                for (nel.a0 a0Var : list4) {
                    arrayList8.add(j1h.b.a(hVar2.f291844a, new vel.e(a0Var, new vel.g(a0Var.f214560a.f214596b, vel.h.STOCK, (dj0.d) null, 12)), new vsk.e(a0Var.f214560a.f214596b), 4));
                }
                return yp0.b.g(arrayList8, new ListSubheaderDelegate.Model("etf-variants-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_instrument_details_etf_variant, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            case 8:
                vv7.n nVar = (vv7.n) obj5;
                gu7.m0 contacts = (gu7.m0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                Float fValueOf = Float.valueOf(16.0f);
                String str3 = contacts.f146790a;
                if (str3 != null) {
                    modelA = CounterTextDelegate.Model.Companion.a(CounterTextDelegate.Model.INSTANCE, "POLICY_NUMBER_ID", new x4(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_contacts_policy_number, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, fValueOf, fValueOf, 18)))), sr7.c.a(str3, null), null, null, new gu7.g1(new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_contacts_policy_number, null, null, 14), str3), 0, 0, 3992);
                    yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                } else {
                    modelA = null;
                }
                List listL2 = v.l(modelA);
                Iterable iterable = contacts.f146791b;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList9 = new ArrayList(w.t(iterable2, 10));
                Iterator it8 = iterable2.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(nVar.f292468a.a((f1) it8.next()));
                }
                ArrayList arrayListE0 = d0.E0(w.u(arrayList9), listL2);
                gu7.e0 e0Var = contacts.d;
                if (e0Var != null && (pVar = e0Var.f146734a) != null) {
                    textLocalisedClause4 = new TextClause(pVar.f76027a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else if (contacts.f146792c != null) {
                    textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_details_make_a_claim, null, null, 14);
                }
                return new vv7.j(textLocalisedClause4, arrayListE0, false);
            case 9:
                a2a.a status = (a2a.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                w1a.e eVar5 = (w1a.e) ((s) obj5).f245144b;
                List contacts2 = status.f714b;
                Intrinsics.checkNotNullParameter(contacts2, "contacts");
                List<zm3.a> list5 = contacts2;
                ArrayList arrayList10 = new ArrayList(w.t(list5, 10));
                for (zm3.a aVar4 : list5) {
                    if (aVar4 instanceof zm3.l) {
                        code = ((zm3.l) aVar4).getCode();
                    } else if (aVar4 instanceof zm3.f) {
                        code = ((zm3.f) aVar4).f323345a;
                    } else if (aVar4 instanceof zm3.e) {
                        code = ((zm3.e) aVar4).f323340a;
                    } else if (aVar4 instanceof zm3.o) {
                        code = ((zm3.o) aVar4).f323376a;
                    } else {
                        if (!(aVar4 instanceof zm3.n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        code = ((zm3.n) aVar4).f323373a;
                    }
                    arrayList10.add(new RowDelegate.Model(j6.a.q("ID_PARTICIPANT_ROW_PREFIX", code), new RowDelegate.Model.MainImage.Avatar(dl3.f.b(eVar5.f293814a, aVar4, null, 6), (i1) null, 6), new TextClause(hx7.q.v(aVar4), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, null, null, null, null, null, null, new RecurringPaymentsManageSplitContract$ParticipantRowData(aVar4, code), null, 0, 0, 0, 0, 532673528));
                }
                yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                return new w1a.c(arrayList10);
            case 10:
                w3b.d dVar3 = (w3b.d) obj5;
                w3b.c marginBreakdown = (w3b.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(marginBreakdown, "marginBreakdown");
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_cfd_input_margin, null, null, 14);
                e2b.a aVar5 = dVar3.f294257c;
                int[] iArr3 = w3b.j.f294264a;
                int i59 = iArr3[aVar5.ordinal()];
                if (i59 == 1) {
                    i2 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_margin_description;
                } else if (i59 == 2) {
                    i2 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_margin_limit_order_description;
                } else {
                    if (i59 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_margin_stop_order_description;
                }
                lw0.a aVar6 = new lw0.a(textLocalisedClause7, new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
                e2b.a aVar7 = dVar3.f294257c;
                dj0.d dVar4 = marginBreakdown.f294252a;
                int i66 = iArr3[aVar7.ordinal()];
                if (i66 == 1) {
                    i3 = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_common_mid_price;
                } else if (i66 == 2) {
                    i3 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_limit_price;
                } else {
                    if (i66 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_stop_price;
                }
                CellDetailsDelegate.Model model8 = new CellDetailsDelegate.Model("cfd-margin-breakdown-target-price", new TextLocalisedClause(i3, null, null, 14), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                CellDetailsDelegate.Model model9 = new CellDetailsDelegate.Model("cfd-margin-breakdown-units", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_list_units, null, null, 14), (Image) null, 0, false, 30), new NumberClause(marginBreakdown.f294253b, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                CellDetailsDelegate.Model model10 = new CellDetailsDelegate.Model("cfd-margin-breakdown-leverage", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_leverage_title, null, null, 14), (Image) null, 0, false, 30), new NumberClause(marginBreakdown.f294254c, null, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
                CellDetailsDelegate.Model model11 = new CellDetailsDelegate.Model("cfd-margin-breakdown-margin-value", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_input_margin, null, null, 14), new MoneyClause(marginBreakdown.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
                List listK = v.k(model8, model9, model10);
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                yp0.b.l(model11, 0, 0, 0, 0, null, false, 63);
                return new cii.b(null, d0.F0(model11, listK), aVar6);
            case 11:
                return a(obj2, obj3, obj4);
            case 12:
                return b(obj2, obj3, obj4);
            case 13:
                return c(obj2, obj3, obj4);
            case 14:
                return d(obj2, obj3, obj4);
            case 15:
                return e(obj2, obj3, obj4);
            case 16:
                return g(obj2, obj3, obj4);
            case 17:
                return h(obj2, obj3, obj4);
            case 18:
                return i(obj2, obj3, obj4);
            case 19:
                return j(obj2, obj3, obj4);
            case 20:
                return k(obj2, obj3, obj4);
            case 21:
                return l(obj2, obj3, obj4);
            case 22:
                return m(obj2, obj3, obj4);
            case 23:
                return n(obj2, obj3, obj4);
            case 24:
                return o(obj2, obj3, obj4);
            case 25:
                return p(obj2, obj3, obj4);
            case 26:
                return q(obj2, obj3, obj4);
            case 27:
                return r(obj2, obj3, obj4);
            case 28:
                return s(obj2, obj3, obj4);
            default:
                wok.e eVar6 = (wok.e) obj5;
                gok.f content2 = (gok.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                boolean z6 = eVar6.f298942c;
                String str4 = eVar6.d;
                String str5 = content2.f145189a;
                gok.d dVar5 = content2.f;
                List list6 = content2.e;
                TextDelegate.Model model12 = new TextDelegate.Model("WaitlistInvitationStateMapper_title", new TextClause(str5, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), false, new dk0(0), null, null, 0, R$attr.uikit_dp0, 0, 0, 1780);
                TextClause textClause = new TextClause(content2.f145190b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
                int i74 = R$attr.uikit_dp32;
                int i92 = R$attr.uikit_dp24;
                TextDelegate.Model[] elements2 = {model12, new TextDelegate.Model("WaitlistInvitationStateMapper_descr", textClause, false, ck0Var, null, null, 0, i74, i92, i92, Constants.TAG_F4)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL3 = kotlin.collections.d.L(elements2);
                if (str4 == null) {
                    str4 = content2.f145191c;
                }
                wok.i iVar2 = new wok.i(str4, content2.d, z6);
                int size = d0.V0(list6, 2).size();
                if (size == 1) {
                    eVar2 = new aw0.e(false, wok.o.b(dVar5), ox0.b0.BELOW_BUTTONS, wok.o.a((gok.c) d0.b0(list6)), null, null, 49);
                } else if (size == 2) {
                    eVar2 = new aw0.h(false, wok.o.a((gok.c) list6.get(0)), wok.o.a((gok.c) list6.get(1)), wok.o.b(dVar5), ox0.b0.BELOW_BUTTONS, null, 97);
                }
                return new wok.k(new wok.j(iVar2, eVar2), listL3);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f289745a = i;
        this.f289746b = obj2;
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f289745a = i;
        this.f289746b = obj3;
    }
}
