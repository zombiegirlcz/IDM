package uw2;

import android.os.Parcelable;
import androidx.compose.material.ComposableSingletons$ScaffoldKt;
import androidx.compose.material.ComposableSingletons$SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import aw0.c7;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.AuthorisationFrequency;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.store.api.model.StoreExclusivesOffersResponse;
import com.revolut.feature.store.api.model.StoreExclusivesTile;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import com.revolut.feature.travel.miles.api.R$plurals;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import hs3.u1;
import hs3.v;
import ip0.ck0;
import ip0.fo;
import ip0.go;
import ip0.ho;
import ip0.p10;
import ip0.t10;
import ip0.xk;
import ip0.yj0;
import ip0.yt;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.y;
import m1c.z;
import org.jmrtd.cbeff.ISO781611;
import v2e.m0;
import ve4.r;
import ve4.t;
import z0h.t1;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283540a;

    public /* synthetic */ n(int i) {
        this.f283540a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        List userVouchers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : userVouchers) {
            if (((UserVoucher) obj5).f83620b == tvb.e.INTERNAL) {
                arrayList.add(obj5);
            }
        }
        List listP0 = d0.P0(arrayList, new xgg.h());
        if (listP0.isEmpty()) {
            return f0.f322471a;
        }
        List<UserVoucher> listV0 = d0.V0(listP0, 3);
        ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
        for (UserVoucher userVoucher : listV0) {
            dj0.d dVar = userVoucher.f83623h;
            TextLocalisedClause textLocalisedClause2 = (dVar == null || dVar.f115082a <= 0) ? null : new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_available_amount, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            String strQ = j6.a.q("YOUR_GIFT_CARDS_USER_VOUCHER_PREFIX_LIST_ID ", userVoucher.f83619a);
            TextClause textClause = new TextClause(userVoucher.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(userVoucher.f83622g, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), textLocalisedClause2, null, false, 124);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(userVoucher.f, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 60);
            tvb.d dVar2 = userVoucher.i;
            long j2 = userVoucher.f83621c;
            int i = xgg.g.f305762a[dVar2.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_pending_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TimeClause(j2, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
            }
            arrayList2.add(new RowDelegate.Model(strQ, image40, textClause, null, 1, textLocalisedClause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, userVoucher.f83619a, null, 0, 0, 0, 0, 532675528));
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("YOUR_GIFT_CARDS_SEE_ALL_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_see_all, null, null, 14), false, null, null, null, null, 1000);
        List list = arrayList2;
        if (listP0.size() > 3) {
            List listD1 = d0.d1(d0.j1(arrayList2, u.c(model)));
            list = listD1;
            if (listD1 == null) {
                list = f0.f322471a;
            }
        }
        return yp0.b.g(list, new ListSubheaderDelegate.Model("YOUR_GIFT_CARDS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186385a;
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        int i = zBooleanValue ? com.revolut.feature.junior_settings.impl.R$string.junior_account_settings_security_and_privacy_devices_lost_or_stolen_devices_active_subtitle : com.revolut.feature.junior_settings.impl.R$string.junior_account_settings_security_and_privacy_devices_lost_or_stolen_devices_inactive_subtitle;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.junior_account_settings_security_and_privacy_devices_lost_or_stolen_devices_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(juniorBankingProfile.f77099b), null, 12);
        boolean z = false;
        return new RowDelegate.Model("ID_LOST_OR_STOLEN_DEVICE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, zBooleanValue, null, false, zBooleanValue ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 532657112);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        ks3.c cVar = (ks3.c) obj3;
        List list = (List) obj4;
        Intrinsics.checkNotNullParameter((ks3.b) obj2, "<unused var>");
        Object obj5 = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (((v) next) instanceof u1) {
                    obj5 = next;
                    break;
                }
            }
            obj5 = (v) obj5;
        }
        return Boolean.valueOf(obj5 == null && cVar == ks3.a.IN_PROGRESS);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        vtk.a content = (vtk.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        TextDelegate.Model model = new TextDelegate.Model("analysts-ratings-chart-title", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_title, u.c(Integer.valueOf(content.f292128a.a())), null, 12), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036);
        mel.e ratingsDistribution = content.f292128a;
        Intrinsics.checkNotNullParameter(ratingsDistribution, "ratingsDistribution");
        int iK = ta6.a.K(ratingsDistribution.f204738b, ratingsDistribution.a());
        int iK2 = ta6.a.K(ratingsDistribution.f204739c, ratingsDistribution.a());
        int iK3 = ta6.a.K(ratingsDistribution.d, ratingsDistribution.a());
        int iK4 = ta6.a.K(ratingsDistribution.e, ratingsDistribution.a());
        int iK5 = ta6.a.K(ratingsDistribution.f, ratingsDistribution.a());
        int i = com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_strong_buy;
        fo.Companion.getClass();
        fo foVar = fo.f164291b;
        go goVarA = vtk.b.a(iK, i, foVar);
        go goVarA2 = vtk.b.a(iK2, com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_buy, foVar);
        go goVarA3 = vtk.b.a(iK3, com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_hold, fo.f164292c);
        int i2 = com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_sell;
        fo foVar2 = fo.d;
        List listK = zhm.v.k(model, new ho("analysts-ratings-chart-listId", zhm.v.k(goVarA, goVarA2, goVarA3, vtk.b.a(iK4, i2, foVar2), vtk.b.a(iK5, com.revolut.retail.wealth.resources.R$string.instrument_analyst_forecasts_distribution_strong_sell, foVar2)), Constants.TAG_FULL_SVPP_IDENTIFICATION));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        qv0.i kjVar;
        List terms = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(terms, "terms");
        List list = terms;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = ((Terms) it8.next()).f90357c;
            if (str != null) {
                kjVar = new kj("TERMS_CONTENT_LIST_ID", new mj(str, null), null, Constants.TAG_FC_SPEED_MODE);
                yp0.b.l(kjVar, 0, 0, 0, 0, null, false, 63);
            } else {
                qv0.i t10Var = new t10("TERMS_CONTENT_LIST_ID", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                kjVar = t10Var;
            }
            arrayList.add(kjVar);
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List savedLounges = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(savedLounges, "savedLounges");
        return savedLounges;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        dj0.d dVar;
        int i;
        TextLocalisedClause textLocalisedClause;
        Clause textLocalisedClause2;
        int i2 = 0;
        Object obj5 = null;
        switch (this.f283540a) {
            case 0:
                List cardOtpDataList = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
                List list = cardOtpDataList;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((h) it8.next()).f283533b.e);
                }
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((String) next) != null) {
                        }
                    } else {
                        next = null;
                    }
                }
                String str = (String) next;
                return str != null ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.x_pay_otp_verification_title_with_requestor_name, u.c(str), null, 12) : new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.x_pay_otp_verification_title, null, null, 14);
            case 1:
                List savedLounges = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(savedLounges, "savedLounges");
                return savedLounges;
            case 2:
                svi.a airport = (svi.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(airport, "airport");
                return new TextClause(airport.f265870c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 3:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((Boolean) pair.f186385a).booleanValue() ? a.C0603a.f99032a : a.b.f99033a;
            case 4:
                FreelancerInvoiceSettings invoiceSettings = (FreelancerInvoiceSettings) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                aim.e eVarB = u.b();
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                aim.e eVarB2 = u.b();
                eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_GENERAL_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_invoice_numbering, null, null, 14);
                String str2 = invoiceSettings.f73407h;
                Integer num = invoiceSettings.i;
                String[] elements = {str2, num != null ? String.valueOf(num.intValue()) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                List list2 = listL.isEmpty() ? null : listL;
                String strK0 = list2 != null ? d0.k0(list2, "-", null, null, 0, null, 62) : null;
                List listK = zhm.v.k(wy6.a.a("LIST_ID_GENERAL_NUMBERING", textLocalisedClause3, strK0 != null ? new TextClause(strK0, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new ResourceImage(R$drawable.uikit_icn_24_roboto_condensed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), wy6.a.a("LIST_ID_GENERAL_PAYMENT_SCHEDULES", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_payment_schedules, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_payment_schedules_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_time_and_money, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), wy6.a.a("LIST_ID_GENERAL_RECURRING_PAYMENT_SCHEDULES", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_recurring_payment_schedules, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_recurring_payment_schedules_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), wy6.a.a("LIST_ID_GENERAL_PAYMENT_METHODS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_payment_methods, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_general_item_payment_methods_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                a0.x(listK, eVarB2);
                eVarB.addAll(u.a(eVarB2));
                aim.e eVarB3 = u.b();
                eVarB3.add(new ListSubheaderDelegate.Model("LIST_ID_CUSTOMISATION_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customisation_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                List listK2 = zhm.v.k(wy6.a.a("LIST_ID_CUSTOMISATION_TEMPLATES", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customization_item_invoice_templates, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customization_item_invoice_templates_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), wy6.a.a("LIST_ID_CUSTOMISATION_PAYMENT_PAGE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customization_item_payment_page, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customization_item_payment_page_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), wy6.a.a("LIST_ID_CUSTOMISATION_EMAIL", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customisation_item_email, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_customization_item_email_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_mail, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                a0.x(listK2, eVarB3);
                eVarB.addAll(u.a(eVarB3));
                aim.e eVarB4 = u.b();
                eVarB4.add(new ListSubheaderDelegate.Model("LIST_ID_NOTIFICATIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_notifications_item_notifications, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                RowDelegate.Model modelA = wy6.a.a("LIST_ID_NOTIFICATIONS_REMINDERS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_notifications_item_automatic_reminders, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_section_notifications_item_automatic_reminders_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                eVarB4.add(modelA);
                eVarB.addAll(u.a(eVarB4));
                return u.a(eVarB);
            case 5:
                return ComposableSingletons$ScaffoldKt.lambda__1836397928$lambda$0((SnackbarHostState) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return ComposableSingletons$ScaffoldKt.lambda_939725476$lambda$0((SnackbarHostState) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                if (obj2 == null) {
                    return ComposableSingletons$SnackbarHostKt.lambda_1890101041$lambda$0(null, (Composer) obj3, ((Integer) obj4).intValue());
                }
                throw new ClassCastException();
            case 8:
                TradingLegalEntityInformation tradingLegalEntity = (TradingLegalEntityInformation) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
                od0.h hVar = od0.i.Companion;
                hel.b bVar = tradingLegalEntity.f105106a;
                hVar.getClass();
                return od0.h.a(bVar);
            case 9:
                List userVouchers = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
                return userVouchers.isEmpty() ? f0.f322471a : yp0.b.g(m0.e(userVouchers), new ListSubheaderDelegate.Model("STORE_BRAND_DETAIL_YOUR_GIFT_CARDS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_gift_cards_your_gift_cards_subheader_label, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            case 10:
                StoreExclusivesOffersResponse response = (StoreExclusivesOffersResponse) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                ArrayList arrayList2 = response.f88518b;
                if (arrayList2.isEmpty()) {
                    return f0.f322471a;
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i3 = 0;
                for (Object obj6 : arrayList2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList3.add(u3e.c.a((StoreExclusivesTile) obj6, i5));
                    i3 = i5;
                }
                xk xkVar = new xk("STORE_BRAND_DETAIL_REDEEM_EXCLUSIVES_GRID_BOX_ID", arrayList3, 2, null, null, 56);
                int i6 = R$attr.uikit_dp0;
                yp0.b.p(xkVar, i6, i6, i6, i6);
                return u.c(xkVar);
            case 11:
                d2k.i content = (d2k.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return i2b.a.o(v3k.a.a(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_select_destination_recents, content.f110880a), v3k.a.a(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_select_destination_available, content.f110881b));
            case 12:
                Payment content2 = (Payment) obj2;
                ((Boolean) obj3).getClass();
                Float fValueOf = Float.valueOf(14.0f);
                Intrinsics.checkNotNullParameter(content2, "content");
                PriceWithPoints priceWithPoints = content2.f93535b;
                if (priceWithPoints == null || !priceWithPoints.f93543b.e()) {
                    priceWithPoints = null;
                }
                CompositeClause compositeClause = priceWithPoints != null ? new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_rev_points, (Integer) null, fValueOf, fValueOf, 18), new NumberClause(priceWithPoints.f93543b.b(), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10), new TextClause(" + ", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14) : null;
                if (priceWithPoints == null || (dVar = priceWithPoints.f93542a) == null) {
                    dVar = content2.f93534a;
                }
                return new v4g.k(compositeClause, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, o9.NON_SENSITIVE, 4));
            case 13:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((File) obj2, "<unused var>");
                return f0.f322471a;
            case 14:
                List instruments = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List list3 = instruments;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                int i21 = 0;
                for (Object obj7 : list3) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    TransferInInstrument transferInInstrument = (TransferInInstrument) obj7;
                    String strN = a0.d.n("TRANSFER_INSTRUMENT_LIST_ID_", i21);
                    TextClause textClause = new TextClause(transferInInstrument.f91507b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String upperCase = transferInInstrument.f91508c.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    arrayList4.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(new InstrumentImage(transferInInstrument.f91506a, 30, null, null), null, null, false, null, false, 62), textClause, null, 0, new TextClause(upperCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, true, null, false, null, null, null, null, null, null, new v9f.f(transferInInstrument), null, 0, 0, 0, 0, 532674520));
                    i21 = i22;
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
            case 15:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((sae.h) obj2, "<unused var>");
                return new n6(new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_payment_balance_picker_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "PAYMENT_BALANCE_PICKER_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            case 16:
                List policies = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(policies, "policies");
                List<agi.b> list4 = policies;
                ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                for (agi.b bVar2 : list4) {
                    String strN2 = a0.d.n("POLICY_ITEM_ID", bVar2.hashCode());
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    switch (h9g.h.f150253a[bVar2.f4840b.ordinal()]) {
                        case 1:
                            i = R$drawable.uikit_icn_24_accessibility;
                            break;
                        case 2:
                            i = R$drawable.uikit_icn_24_cleaning;
                            break;
                        case 3:
                            i = R$drawable.uikit_icn_24_insurance;
                            break;
                        case 4:
                            i = R$drawable.uikit_icn_24_time;
                            break;
                        case 5:
                            i = R$drawable.uikit_icn_24_restaurants;
                            break;
                        case 6:
                            i = R$drawable.uikit_icn_24_medical_bed;
                            break;
                        case 7:
                            i = R$drawable.uikit_icn_24_shower;
                            break;
                        case 8:
                            i = R$drawable.uikit_icn_24_calendar;
                            break;
                        case 9:
                            i = R$drawable.uikit_icn_24_key;
                            break;
                        case 10:
                            i = R$drawable.uikit_icn_24_card;
                            break;
                        case 11:
                            i = R$drawable.uikit_icn_24_children;
                            break;
                        case 12:
                            i = R$drawable.uikit_icn_24_animals;
                            break;
                        case 13:
                            i = R$drawable.uikit_icn_24_parking;
                            break;
                        case 14:
                            i = R$drawable.uikit_icn_24_profile;
                            break;
                        case 15:
                            i = R$drawable.uikit_icn_24_ellipsis;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    j8 j8Var = new j8(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP);
                    TextClause textClause2 = new TextClause(bVar2.f4839a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = bVar2.f4841c.f97970a;
                    ListCellDelegate.Model model = new ListCellDelegate.Model(strN2, j8Var, textClause2, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, false, null, null, 0, 0, 0, 0, 4080);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList5.add(model);
                }
                return arrayList5;
            case 17:
                boolean z = false;
                yy3.a configuration = (yy3.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                yy3.j jVar = configuration.f317764a;
                ve4.o oVar = new ve4.o(t.a(jVar.f317779a), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_signing_methods_description, u.c(new TextClause(jVar.f317780b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_signing_methods_button, u.c(new TextClause(jVar.f317781c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                ArrayList<yy3.i> arrayList6 = jVar.d;
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                for (yy3.i iVar : arrayList6) {
                    RowDelegate.Model model2 = new RowDelegate.Model(iVar.f317776a, new RowDelegate.Model.MainImage.Image40(new UrlImage(iVar.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_signing_methods_method_title, u.c(new TextClause(iVar.f317777b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_signing_methods_method_description, u.c(new TextClause(iVar.f317778c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), z), true, null, false, null, null, null, null, null, null, iVar, null, 0, 0, 0, 0, 532673496);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    arrayList7.add(model2);
                    z = false;
                }
                return new r(arrayList7, oVar, textLocalisedClause4);
            case 18:
                ApmPaymentAuthorisationPendingAction content3 = (ApmPaymentAuthorisationPendingAction) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                aim.e eVarB5 = u.b();
                ApmPaymentAuthorisationPendingAction.Mandate mandate = content3 instanceof ApmPaymentAuthorisationPendingAction.Mandate ? (ApmPaymentAuthorisationPendingAction.Mandate) content3 : null;
                if (mandate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = mandate.f61991a;
                PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
                AuthorisationFrequency authorisationFrequency = apmPaymentAuthorisationSummary.o;
                PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
                if (upi2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                PaymentMethodDetails.Creditor creditor = upi2.f62071c;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, creditor.d, creditor.f62030a, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4047), null, null, false, null, false, 62);
                String str4 = creditor.f62030a;
                if (str4 == null) {
                    str4 = "";
                }
                TextClause textClause3 = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                LocalDateTime localDateTime = apmPaymentAuthorisationSummary.e;
                if (authorisationFrequency == null || localDateTime == null) {
                    textLocalisedClause = null;
                } else {
                    int i32 = com.revolut.feature.apm.upi.api.R$string.apm_recurring_payments_frequency_next_on_format;
                    Clause[] elements2 = {t12.b.a(authorisationFrequency), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    textLocalisedClause = new TextLocalisedClause(i32, kotlin.collections.d.L(elements2), null, 12);
                }
                dj0.d dVar2 = apmPaymentAuthorisationSummary.f;
                RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_HEADER", image40, textClause3, null, 0, textLocalisedClause, null, null, 0, dVar2 != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                eVarB5.add(model3);
                eVarB5.add(vg2.c.c());
                eVarB5.add(vg2.c.d(creditor.f62031b));
                CellDetailsDelegate.Model modelB = vg2.c.b(apmPaymentAuthorisationSummary);
                LocalDateTime localDateTime2 = apmPaymentAuthorisationSummary.k;
                CellDetailsDelegate.Model model4 = localDateTime2 != null ? new CellDetailsDelegate.Model("LIST_ID_START_DATE", new t0((Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_subscription_confirmation_starts_on, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oi0.d.R(localDateTime2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
                LocalDateTime localDateTime3 = apmPaymentAuthorisationSummary.f61998l;
                CellDetailsDelegate.Model[] elements3 = {modelB, model4, localDateTime3 != null ? new CellDetailsDelegate.Model("LIST_ID_END_DATE", new t0((Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_subscription_confirmation_ends_on, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oi0.d.R(localDateTime3), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null, authorisationFrequency != null ? new CellDetailsDelegate.Model("LIST_ID_FREQUENCY", new t0((Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_subscription_confirmation_frequency, null, null, 14), (Image) null, 0, false, 30), t12.b.a(authorisationFrequency), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL2 = kotlin.collections.d.L(elements3);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
                eVarB5.addAll(listL2);
                String str5 = upi2.d;
                if (str5 != null) {
                    CellDetailsNoteDelegate.Model model5 = new CellDetailsNoteDelegate.Model("LIST_ID_REMARKS", new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_subscription_confirmation_remarks, null, null, 14), null, new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
                    yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                    obj5 = model5;
                }
                eVarB5.add(obj5);
                eVarB5.add(vg2.c.e());
                return d0.Z(u.a(eVarB5));
            case 19:
                z status = (z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof z.a) {
                    return f0.f322471a;
                }
                if (status instanceof y) {
                    return u.c(new LabelNavBarMenuItem("NAV_BAR_ACTION_ID_REV_POINTS", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), v1.c.g(0, ((y) status).f201475a.f201472c, null, null, 5), null, null, 472));
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                return a(obj2, obj3, obj4);
            case 21:
                hfg.h content4 = (hfg.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                ArrayList arrayList8 = content4.f151844a;
                if (arrayList8.isEmpty()) {
                    return f0.f322471a;
                }
                ArrayList arrayList9 = new ArrayList(w.t(arrayList8, 10));
                for (Object obj8 : arrayList8) {
                    int i33 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    hfg.a aVar = (hfg.a) obj8;
                    String strValueOf = String.valueOf(i2);
                    TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, aVar.f151801a, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
                    int i43 = R$plurals.miles_search_results_suggested_dates_results;
                    int i59 = aVar.f151802b;
                    AttributeSelectorSmallDelegate.Model model6 = new AttributeSelectorSmallDelegate.Model(strValueOf, timeClauseB, new TextLocalisedQuantityClause(i43, Integer.valueOf(i59), u.c(Integer.valueOf(i59)), (Style) null, 24), null, null, false, aVar, null, 440);
                    yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                    arrayList9.add(model6);
                    i2 = i33;
                }
                return vhg.k.a(arrayList9);
            case 22:
                return b(obj2, obj3, obj4);
            case 23:
                InvestOrder investOrder = (InvestOrder) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(investOrder, "<this>");
                Intrinsics.checkNotNullParameter(investOrder.getI(), "<this>");
                return Boolean.valueOf(!oc.c.o(r1));
            case 24:
                ks3.b pluginName = (ks3.b) obj2;
                ks3.c cVar = (ks3.c) obj3;
                Intrinsics.checkNotNullParameter(pluginName, "pluginName");
                return Boolean.valueOf(pluginName == ks3.b.ROLLEE && cVar == ks3.a.BANNER);
            case 25:
                return c(obj2, obj3, obj4);
            case 26:
                return d(obj2, obj3, obj4);
            case 27:
                return e(obj2, obj3, obj4);
            case 28:
                return g(obj2, obj3, obj4);
            default:
                t1 disclaimerContent = (t1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
                Links links = disclaimerContent.f318563a;
                String str6 = links.f105093h;
                String str7 = links.f105092g;
                String str8 = links.f105094j;
                int i66 = vzk.w.f293573a[disclaimerContent.f318564b.ordinal()];
                vzk.h hVar2 = vzk.h.f293550a;
                switch (i66) {
                    case 1:
                        int i74 = com.revolut.retail.feature.trading_onboarding.impl.R$string.wealth_onboarding_nationality_disclaimer_eu_format;
                        int i92 = com.revolut.retail.feature.trading_onboarding.impl.R$string.wealth_onboarding_nationality_disclaimer_eu_website;
                        String str9 = links.f105097n;
                        textLocalisedClause2 = new TextLocalisedClause(i74, zhm.v.k(new TextLocalisedClause(i92, null, new Click(28, (Integer) null, (Object) (str9 != null ? new vzk.i(str9) : null), "EEA_MIFID_CLICK_DATA", false), 10), new TextLocalisedClause(com.revolut.retail.feature.trading_onboarding.impl.R$string.wealth_onboarding_nationality_disclaimer_eu_here, null, new Click(28, (Integer) null, (Object) new vzk.i(str8), "EEA_PRIVACY_POLICY", false), 10)), null, 12);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        textLocalisedClause2 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_onboarding_nationality_terms_format_sg, zhm.v.k(str7, str6, str8), (Integer) null, hVar2, 12);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        textLocalisedClause2 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_onboarding_nationality_terms_format, zhm.v.k(str7, str6, str8), (Integer) null, hVar2, 12);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return textLocalisedClause2;
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f283540a = i;
    }
}
