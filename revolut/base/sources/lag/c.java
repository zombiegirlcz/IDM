package lag;

import aw0.o9;
import boh.f;
import ccg.i;
import cgi.e;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import h9g.m;
import i9g.n0;
import ia3.r;
import ip0.ak0;
import ip0.q6;
import ip0.y7;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import m93.d;
import mag.g;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f193388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f193389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f193390c;
    public final n0 d;
    public final mag.c e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p8g.c f193391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f193392h;
    public final mag.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f193393j;

    public c(z80.b phoneToolsProvider, o decimalFormat, fcg.a additionalInformationItemMapper, r cardsMapper, n0 travellerInfoProvider, mag.c revPointsPaymentSummarySectionMapper, g revPointsRedeemOptionsSectionMapper, p8g.c travelHotelsFeatureInteractor, d cardThumbnailImageProvider, mag.a travelHotelsCardMapper, mag.b exchangedAmountMapper, i propertyPreviewItemsMapper) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(additionalInformationItemMapper, "additionalInformationItemMapper");
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(travellerInfoProvider, "travellerInfoProvider");
        Intrinsics.checkNotNullParameter(revPointsPaymentSummarySectionMapper, "revPointsPaymentSummarySectionMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemOptionsSectionMapper, "revPointsRedeemOptionsSectionMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(travelHotelsCardMapper, "travelHotelsCardMapper");
        Intrinsics.checkNotNullParameter(exchangedAmountMapper, "exchangedAmountMapper");
        Intrinsics.checkNotNullParameter(propertyPreviewItemsMapper, "propertyPreviewItemsMapper");
        this.f193388a = phoneToolsProvider;
        this.f193389b = decimalFormat;
        this.f193390c = cardsMapper;
        this.d = travellerInfoProvider;
        this.e = revPointsPaymentSummarySectionMapper;
        this.f = revPointsRedeemOptionsSectionMapper;
        this.f193391g = travelHotelsFeatureInteractor;
        this.f193392h = cardThumbnailImageProvider;
        this.i = travelHotelsCardMapper;
        this.f193393j = propertyPreviewItemsMapper;
    }

    public final String a(double d) {
        return this.f193389b.g(lzl.a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT, Double.valueOf(d)) + "%";
    }

    public final List b(HotelsProperty hotelsProperty, List list, e eVar, dj0.d dVar, double d, Data data) {
        TextLocalisedClause textLocalisedClause;
        int i;
        dj0.d dVarO;
        boolean z;
        dj0.d dVar2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = ((BedOptionSelection) it8.next()).f98090a;
            arrayList.add(m.g(hotelsPropertyRoomOccupancyRatesSelection.f98106c.f98114c, hotelsPropertyRoomOccupancyRatesSelection.f98105b.f98116b));
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO2 = dj0.d.e;
        Iterator it9 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it9.hasNext()) {
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("PAY_NOW_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_pay_now, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVarO2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), 0, null, null, null, null, null, false, 0, 0, 32760);
                if (dVarO2.k()) {
                    model = null;
                }
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(m.e(((BedOptionSelection) it10.next()).f98090a.f98106c.f98114c, eVar));
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO3 = dj0.d.e;
                int i3 = 0;
                for (Object obj2 : arrayList2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO3 = i3 == 0 ? (dj0.d) obj2 : pyd.c.O(dVarO3, (dj0.d) obj2);
                    i3 = i5;
                }
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("PAY_AT_PROPERTY_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_pay_at_property, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVarO3, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), 0, null, null, null, null, null, false, 0, 0, 32760);
                if (dVarO3.k() || eVar != e.PAY_NOW) {
                    model2 = null;
                }
                int[] iArr = b.f193387a;
                int i6 = iArr[eVar.ordinal()];
                if (i6 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.hotels_price_breakdown_pay_at_property, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                int i21 = iArr[eVar.ordinal()];
                if (i21 == 1) {
                    i = R$drawable.uikit_icn_16_info_outline;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 0;
                }
                int i22 = iArr[eVar.ordinal()];
                if (i22 == 1) {
                    ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        arrayList3.add(f.k(((BedOptionSelection) it11.next()).f98090a.f98106c.f98114c));
                    }
                    dj0.d.Companion.getClass();
                    dVarO = dj0.d.e;
                    int i32 = 0;
                    for (Object obj3 : arrayList3) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO = i32 == 0 ? (dj0.d) obj3 : pyd.c.O(dVarO, (dj0.d) obj3);
                        i32 = i33;
                    }
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                    Iterator it12 = list2.iterator();
                    while (it12.hasNext()) {
                        arrayList4.add(m.e(((BedOptionSelection) it12.next()).f98090a.f98106c.f98114c, eVar));
                    }
                    dj0.d.Companion.getClass();
                    dVarO = dj0.d.e;
                    int i43 = 0;
                    for (Object obj4 : arrayList4) {
                        int i59 = i43 + 1;
                        if (i43 < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO = i43 == 0 ? (dj0.d) obj4 : pyd.c.O(dVarO, (dj0.d) obj4);
                        i43 = i59;
                    }
                }
                y7 y7Var = new y7("TOTAL_ITEM_ID", new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), o9.NON_SENSITIVE), textLocalisedClause2, null, i, null, eVar == e.PAY_LATER ? R$attr.uikit_dp8 : R$attr.uikit_dp0, 0, 1896);
                qv0.i iVarA = mag.b.a(data);
                fgi.a aVar = hotelsProperty.u;
                ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(m.f(((BedOptionSelection) it13.next()).f98090a.f98106c.f98114c, eVar));
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO4 = dj0.d.e;
                int i66 = 0;
                for (Object obj5 : arrayList5) {
                    int i74 = i66 + 1;
                    if (i66 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO4 = i66 == 0 ? (dj0.d) obj5 : pyd.c.O(dVarO4, (dj0.d) obj5);
                    i66 = i74;
                }
                ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList6.add(m.e(((BedOptionSelection) it14.next()).f98090a.f98106c.f98114c, eVar));
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO5 = dj0.d.e;
                int i92 = 0;
                for (Object obj6 : arrayList6) {
                    int i96 = i92 + 1;
                    if (i92 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO5 = i92 == 0 ? (dj0.d) obj6 : pyd.c.O(dVarO5, (dj0.d) obj6);
                    i92 = i96;
                }
                boolean zF = Intrinsics.f(dVarO4.f115083b, dVarO5.f115083b);
                boolean zF2 = Intrinsics.f(pyd.c.B(list).f115083b, pyd.c.A(list).f115083b);
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new TextLocalisedClause(R$string.hotels_checkout_including_taxes_and_fees, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                t0 t0Var = t0.f186434a;
                m70.a.t(t0Var);
                arrayList7.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                if (dVarO4.k() || zF || eVar != e.PAY_NOW || aVar == fgi.a.VRBO) {
                    z = zF2;
                    dVar2 = dVarO4;
                } else {
                    dVar2 = dVarO4;
                    z = zF2;
                    arrayList7.add(new TextLocalisedClause(R$string.hotels_price_breakdown_pay_at_property_conversion, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12));
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    arrayList7.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                if (!dVar2.k() && !zF && eVar == e.PAY_LATER && aVar != fgi.a.VRBO) {
                    arrayList7.add(new TextLocalisedClause(R$string.hotels_checkout_pay_at_property_conversion_description, u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12));
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    arrayList7.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                if (!z && aVar == fgi.a.VRBO) {
                    arrayList7.add(new TextLocalisedClause(R$string.hotels_checkout_vrbo_conversion_description, u.c(new MoneyClause(pyd.c.B(list), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
                    arrayList7.add(new TextClause(". ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                arrayList7.add(new TextLocalisedClause(R$string.hotels_checkout_view_details, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10));
                CompositeClause compositeClause = new CompositeClause(arrayList7, null, null, null, 14);
                yj0 yj0Var = yj0.START;
                qv0.i[] elements = {model, model2, y7Var, iVarA, new TextDelegate.Model("INCLUDING_TAXES_ITEM_ID", compositeClause, true, new ak0(yj0Var, null, 2), null, null, 0, 0, 0, 0, 2032), new q6("CASHBACK_PERCENTAGE_ITEM_ID", new TextLocalisedClause(R$string.hotels_property_room_selection_cashback_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), h9g.g.a(new HotelsPropertyCashback(d, dVar)), null, null, 0, 0, 2040), d != 0.0d ? (eVar != e.PAY_NOW || hotelsProperty.u == fgi.a.VRBO) ? eVar == e.PAY_LATER ? new TextDelegate.Model("CASHBACK_SUBTITLE_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_pay_later_subtitle, u.c(a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), false, new ak0(yj0Var, null, 2), null, null, 0, 0, 0, 0, 2036) : new TextDelegate.Model("CASHBACK_SUBTITLE_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_generic_subtitle, u.c(a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), true, new ak0(yj0Var, null, 2), null, null, 0, 0, 0, 0, 2032) : new TextDelegate.Model("CASHBACK_SUBTITLE_ITEM_ID", new TextLocalisedClause(R$string.hotels_price_breakdown_cashback_pay_now_subtitle, u.c(a(d)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), true, new ak0(yj0Var, null, 2), null, null, 0, 0, 0, 0, 2032) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            }
            Object next = it9.next();
            int i99 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            dVarO2 = i2 == 0 ? (dj0.d) next : pyd.c.O(dVarO2, (dj0.d) next);
            i2 = i99;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    public final List c(String firstName, String lastName, String phone, String email, String specialRequest) {
        Clause textLocalisedClause;
        int i;
        Object obj2;
        Clause textLocalisedClause2;
        ListSubheaderDelegate.Model model;
        Clause textLocalisedClause3;
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(specialRequest, "specialRequest");
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("TRAVELLER_INFO_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_checkout_travel_info_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.hotels_common_action_edit, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        LayeredImage layeredImageB = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_person, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, null, null, 48);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.hotels_checkout_travel_info_name_title, null, null, 14);
        n0 n0Var = this.d;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        if (n0Var.d(firstName) && n0Var.e(lastName)) {
            StringBuilder sbS = p.a.s(firstName);
            m70.a.t(t0.f186434a);
            sbS.append(" ");
            sbS.append(lastName);
            textLocalisedClause = new TextClause(sbS.toString(), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_travel_info_name_error_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        RowDelegate.Model model3 = new RowDelegate.Model("TRAVELLER_NAME_ITEM_ID", layeredImageB, null, null, textLocalisedClause4, textLocalisedClause, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        RowDelegate.Model model4 = new RowDelegate.Model("TRAVELLER_PHONE_ITEM_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_call, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_checkout_travel_info_phone_title, null, null, 14), n0Var.f(phone) ? new TextClause(z80.b.b(this.f193388a, phone, null, null, 6), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : new TextLocalisedClause(R$string.hotels_checkout_travel_info_phone_error_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        LayeredImage layeredImageB2 = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_envelope, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, null, null, 48);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.hotels_checkout_travel_info_email_title, null, null, 14);
        if (n0Var.c(email)) {
            i = 14;
            obj2 = null;
            textLocalisedClause2 = new TextClause(email, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            i = 14;
            obj2 = null;
            textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_checkout_travel_info_email_error_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        }
        RowDelegate.Model model5 = new RowDelegate.Model("TRAVELLER_EMAIL_ITEM_ID", layeredImageB2, null, null, textLocalisedClause5, textLocalisedClause2, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        ?? r2 = obj2;
        int i2 = i;
        LayeredImage layeredImageB3 = LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_form, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 8.0f, null, null, 48);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.hotels_checkout_travel_info_special_request_title, r2, r2, i2);
        if (d0.W(specialRequest)) {
            model = model2;
            textLocalisedClause3 = new TextLocalisedClause(R$string.hotels_checkout_travel_info_none_specified_title, r2, r2, i2);
        } else {
            model = model2;
            textLocalisedClause3 = new TextClause(specialRequest, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listK = v.k(model3, model4, model5, new RowDelegate.Model("TRAVELLER_SPECIAL_REQUEST_ITEM_ID", layeredImageB3, null, null, textLocalisedClause6, textLocalisedClause3, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return i2b.a.q(model, listK);
    }
}
