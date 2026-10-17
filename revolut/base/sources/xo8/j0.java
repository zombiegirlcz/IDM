package xo8;

import android.os.Parcelable;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$Parcel;
import com.revolut.feature.cards_core.R$plurals;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesPassActivityFilter;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesPassActivityFilterItem;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.iq;
import ip0.ji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import ms0.e4;
import mx0.b6;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f307718b;

    public /* synthetic */ j0(int i, cli.j jVar, cli.n nVar) {
        this.f307717a = i;
        this.f307718b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0418  */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r73, java.lang.Object r74, java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 2708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo8.j0.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        RevPoints revPointsA;
        m1c.x xVar;
        xwb.e eVar = (xwb.e) this.f307718b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        m1c.z zVar = (m1c.z) pair.f186385a;
        VoucherProductGroupDetails voucherProductGroupDetails = (VoucherProductGroupDetails) pair.f186386b;
        aw0.e eVar2 = null;
        m1c.y yVar = zVar instanceof m1c.y ? (m1c.y) zVar : null;
        if (yVar == null || (xVar = yVar.f201475a) == null) {
            RevPoints.INSTANCE.getClass();
            revPointsA = RevPoints.Companion.a(0L);
        } else {
            revPointsA = xVar.f201472c;
        }
        VoucherProduct voucherProduct = eVar.d;
        List listC = zhm.u.c(uwb.d.a(voucherProductGroupDetails.i, voucherProduct, revPointsA));
        lw0.a aVarA = xwb.h.a();
        if (voucherProduct != null) {
            RevPoints revPoints = voucherProduct.f83640b;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_label, zhm.u.c(new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_key, null, new Click(28, (Integer) null, (Object) voucherProductGroupDetails, "SECTION_TERMS_CLICKABLE_TEXT_ID", false), 10)), null, 12);
            boolean zC = revPointsA.c(revPoints);
            eVar2 = new aw0.e(false, textLocalisedClause, null, new n6(zC ? new TextLocalisedClause(R$string.gift_cards_details_cta_sufficient_balance, zhm.u.c(nub.a.i(revPoints, null, null, null, 7)), null, 12) : new TextLocalisedClause(R$string.gift_cards_details_cta_insufficient_balance, null, null, 14), LargeActionButton.ButtonStyle.e, null, "POINTS_REDEEM_BUTTON_LOADING_ID", false, null, new xwb.d(zC), 492), null, null, 53);
        }
        return new cii.b(eVar2, listC, aVarA);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        b6 b6Var;
        b6 b6Var2;
        xxi.e eVar = (xxi.e) this.f307718b;
        List filters = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        Map selectedFilters = eVar.f309538c;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        List<AirportLoungesPassActivityFilter> list = filters;
        Iterator it8 = list.iterator();
        int size = 0;
        while (it8.hasNext()) {
            Set set = (Set) selectedFilters.get(((AirportLoungesPassActivityFilter) it8.next()).f98922b);
            if (set == null) {
                set = zhm.h0.f322473a;
            }
            size += set.size();
        }
        b6 b6Var3 = new b6("ID_PASS_ACTIVITY_FILTERS_ENTRY_CHIP", new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), size == 0 ? new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_activity_filters, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_pass_entries_dot_template, zhm.v.k(new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_activity_filters, null, null, 14), new NumberClause(size, (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12), null, size > 0, xxi.f.f309539a, 40);
        ArrayList arrayList = new ArrayList();
        for (AirportLoungesPassActivityFilter airportLoungesPassActivityFilter : list) {
            Set set2 = (Set) selectedFilters.get(airportLoungesPassActivityFilter.f98922b);
            if (set2 == null) {
                set2 = zhm.h0.f322473a;
            }
            ArrayList arrayList2 = airportLoungesPassActivityFilter.f98923c;
            String str = airportLoungesPassActivityFilter.f98922b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : arrayList2) {
                if (set2.contains(((AirportLoungesPassActivityFilterItem) obj5).f98924a)) {
                    arrayList3.add(obj5);
                }
            }
            int size2 = arrayList3.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    b6Var2 = new b6(j6.a.q("ID_PASS_ACTIVITY_FILTERS_ITEM_CHIP_", str), null, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_pass_entries_dot_template, zhm.v.k(new TextClause(airportLoungesPassActivityFilter.f98921a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new NumberClause(arrayList3.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, new xxi.g(str), 50);
                } else {
                    AirportLoungesPassActivityFilterItem airportLoungesPassActivityFilterItem = (AirportLoungesPassActivityFilterItem) zhm.d0.b0(arrayList3);
                    b6Var2 = new b6(a0.d.s("ID_PASS_ACTIVITY_FILTERS_ITEM_CHIP_", str, "_", airportLoungesPassActivityFilterItem.f98924a), null, new TextClause(airportLoungesPassActivityFilterItem.f98925b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, new xxi.h(str, airportLoungesPassActivityFilterItem.f98924a), 50);
                }
                b6Var = b6Var2;
            } else {
                b6Var = null;
            }
            if (b6Var != null) {
                arrayList.add(b6Var);
            }
        }
        return zhm.u.c(new ji(R$attr.uikit_dp0, 56, "ID_PASS_ACTIVITY_FILTERS_ROW", zhm.d0.E0(arrayList, zhm.u.c(b6Var3))));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        TextClause textClause;
        xy7.o oVar = (xy7.o) this.f307718b;
        xy7.d viewModel = (xy7.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(viewModel, "content");
        yy7.c cVar = oVar.o;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        s0 s0Var = new s0(3);
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("ADDRESS_CHANGE_NEW_ADDRESS_ITEM", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_address_change_sections_address_title, null, null, 14), null, new TextClause(o51.a.b(viewModel.f309627b, ((s80.b) cVar.f317861b).b()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        List list = viewModel.f309628c;
        s0Var.a(!list.isEmpty() ? new ListSubheaderDelegate.Model("ADDRESS_CHANGE_PET_PRICING_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_address_change_sections_pets_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null);
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        int i = 0;
        for (Object obj5 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            xy7.b bVar = (xy7.b) obj5;
            String strN = a0.d.n("ADDRESS_CHANGE_PET_ITEM_PREFIX_", i);
            zw7.d0 d0Var = bVar.f309623a;
            Image imageA = d0Var != null ? cVar.f317860a.a(d0Var) : null;
            zw7.d0 d0Var2 = bVar.f309623a;
            if (d0Var2 != null) {
                textClause = new TextClause(d0Var2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_address_change_sections_pets_new_price_start_date, zhm.u.c(new TimeClause(jli.b.b(bVar.d), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
            dj0.d dVar = bVar.f309624b;
            MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
            o9 o9Var = o9.NON_SENSITIVE;
            arrayList.add(new RowDelegate.Model(strN, imageA, null, null, textClause, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, defaults, null, o9Var, 4), new MoneyClause(bVar.f309625c, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), o9Var), null, false, 124), false, false, null, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, 0, 0, 0, 0, 1073702764));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new RowDelegate.Model[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return new Pair(viewModel, zhm.v.m(arrayList2.toArray(new koi.j[arrayList2.size()])));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        y07.g gVar = (y07.g) this.f307718b;
        Pair settings = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        wi0.b countryCode = do3.q.y((do3.n) settings.f186385a);
        String str = gVar.f310156a;
        boolean z = gVar.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_number, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_VAT_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textLocalisedClause, countryCode.equals(wi0.b.f297756l) ? new TextClause("ATU12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297771r) ? new TextClause("BE1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297776t) ? new TextClause("BG1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.J) ? new TextClause("CHE-123.456.789 MWST", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.U) ? new TextClause("CY12345678X", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.V) ? new TextClause("CZ1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.W) ? new TextClause("DE123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.Y) ? new TextClause("DK12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297740e0) ? new TextClause("EE123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297750h0) ? new TextClause("ESX1234567X", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297753k0) ? new TextClause("FI12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297760n0) ? new TextClause("FRXX123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.p0) ? new TextClause("GB123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.y0) ? new TextClause("EL123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.G0) ? new TextClause("HR12345678901", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.I0) ? new TextClause("HU12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.L0) ? new TextClause("IE1234567XX", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.R0) ? new TextClause("IT12345678901", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297781v1) ? new TextClause("LT123456789012", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297788x1) ? new TextClause("LU12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.f297791y1) ? new TextClause("LV12345678901", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.V1) ? new TextClause("MT12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.h2) ? new TextClause("NL123456789B01", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.i2) ? new TextClause("NO123456789MVA", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.t2) ? new TextClause("PL1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.y2) ? new TextClause("PT123456789", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.D2) ? new TextClause("RO1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.I2) ? new TextClause("SE123456789012", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.L2) ? new TextClause("SI12345678", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : countryCode.equals(wi0.b.N2) ? new TextClause("SK1234567890", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(a0.d.r(countryCode.f297794a, "123456789"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, null, null, null, null, false, null, null, false, false, 4097, 0, null, false, false, null, true, m72.b.u(15), false, false, false, null, null, 0, -1612709904, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("ITEM_ID_NO_VAT_CHECK", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_merchant_input_not_registered, null, null, 14), z, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        boolean z3 = false;
        List listK = zhm.v.k(model, model2);
        if (z || (str != null && str.length() > 3)) {
            z3 = true;
        }
        return new y07.j(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_merchant_header_caption, zhm.u.c(new CountryClause(countryCode, null)), null, 12), listK, zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ITEM_ID_MENU_INFO", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)), z3);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ResourceImage resourceImage;
        y0b.f fVar = (y0b.f) this.f307718b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        if (!zBooleanValue || fVar.d.f139406n) {
            return null;
        }
        mx0.d dVar = mx0.d.WHITE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.advanced_charts.impl.R$string.trading_advanced_chart_trade_action, null, null, 14);
        int i = y0b.o.f310192a[fVar.f310176c.f316259n.ordinal()];
        if (i == 1) {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        return new ActionsView.Item("CHART_ACTIONS_TRADE", dVar, false, e4.EnabledClickable, null, textLocalisedClause, resourceImage, null, null, null, false, null, null, null, null, 32660);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        return TextFieldImplKt.textFieldLabelMinHeight$lambda$26((Function0) this.f307718b, (MeasureScope) obj2, (Measurable) obj3, (Constraints) obj4);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo8.j0.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        kxk.o oVar = (kxk.o) this.f307718b;
        r5b.a billing = (r5b.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(billing, "billing");
        TextClause textClause = new TextClause(billing.f251556a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        aim.e eVarB = zhm.u.b();
        z6b.a aVar = (z6b.a) oVar.f190611b;
        ArrayList items = billing.f251557b;
        ArrayList actions = billing.f251558c;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        aim.e eVarB2 = zhm.u.b();
        ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj5 : items) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            r5b.d dVar = (r5b.d) obj5;
            String strN = a0.d.n("list_id_billing_item_", i2);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_billing_item_placeholder, zhm.u.c(dVar.f251561a), null, 12);
            String str = dVar.f251562b;
            arrayList.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(aVar.f319715a.c(dVar.f251563c), null, null, false, null, false, 62), textLocalisedClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
            i2 = i3;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB2.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(actions, 10));
        Iterator it8 = actions.iterator();
        while (true) {
            int i5 = i;
            if (!it8.hasNext()) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList2);
                eVarB.addAll(zhm.u.a(eVarB2));
                r6b.a aVar2 = (r6b.a) oVar.f190612c;
                ParameterisedHyperText terms = billing.d;
                Intrinsics.checkNotNullParameter(terms, "terms");
                eVarB.addAll(zhm.u.c(new TextDelegate.Model("list_id_billing_terms", aVar2.a(terms), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036)));
                return new y6b.h(textClause, zhm.u.a(eVarB));
            }
            Object next = it8.next();
            i = i5 + 1;
            if (i5 < 0) {
                zhm.v.s();
                throw null;
            }
            r5b.b bVar = (r5b.b) next;
            arrayList2.add(new InputDisclosureDelegate.Model(a0.d.n("list_id_billing_action_", i5), new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_billing_action_placeholder, zhm.u.c(bVar.f251559a), null, 12), null, bVar.f251560b, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        m93.g gVar = ((com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.c) this.f307718b).f65522a;
        List cardsToTerminate = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
        List<y83.e> list = cardsToTerminate;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (y83.e eVar : list) {
            h93.f0 f0Var = eVar.f311622a;
            h93.f0 f0Var2 = eVar.f311622a;
            String strQ = j6.a.q("list_id_card_", f0Var.f150110a);
            CompositeClause compositeClauseB = m93.g.b(gVar, f0Var2);
            Image imageD = ((ia3.t) gVar).d(f0Var2, true);
            String str = f0Var2.f150110a;
            int i = eVar.f311623b;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            arrayList.add(new RowDelegate.Model(strQ, imageD, null, null, compositeClauseB, numValueOf != null ? new TextLocalisedQuantityClause(R$plurals.card_switch_to_credit_terminate_section_card_subscriptions, Integer.valueOf(numValueOf.intValue()), zhm.v.k(Integer.valueOf(i), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_switch_to_credit_terminate_section_card_review, null, new Click(28, (Integer) null, (Object) new SwitchToNewCreditCardPromptScreenContract$Parcel.LinkedSubscriptions(str), j6.a.q("list_id_card_subscriptions_", str), false), 10)), (Style) null, 24) : null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("TERMINATE_CARDS_SECTION", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_switch_to_credit_terminate_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        ybh.b0 b0Var = (ybh.b0) this.f307718b;
        m1h.b disclaimer = (m1h.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Clause clauseA = b0Var.f312293a.a(disclaimer);
        List listC = clauseA != null ? zhm.u.c(new TextDelegate.Model("INFO_DISCLAIMER_LIST_ID", clauseA, false, new ak0(null, null, 3), null, null, R$attr.uikit_dp0, R$attr.uikit_dp0, 0, 0, 1652)) : null;
        return listC == null ? zhm.f0.f322471a : listC;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        ydc.c cVar = (ydc.c) this.f307718b;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        return cVar.c((od0.i) rVar.f314201a, (s6c.l) rVar.f314202b, (n6c.a) rVar.f314203c);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        yeg.b bVar = (yeg.b) this.f307718b;
        ggi.a availableSortingOptions = (ggi.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(availableSortingOptions, "availableSortingOptions");
        lw0.a aVarA = yeg.h.a();
        TravelHotelsSortingOption travelHotelsSortingOption = bVar.f312926b;
        ArrayList arrayList = availableSortingOptions.f143690b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList2, aVarA);
            }
            TravelHotelsSortingOption travelHotelsSortingOption2 = (TravelHotelsSortingOption) it8.next();
            String str = travelHotelsSortingOption2.f98141a;
            arrayList2.add(new SingleChoiceDelegate.Model(j6.a.q("SORTING_OPTION_ACTION_ITEM_ID", str), new TextClause(travelHotelsSortingOption2.f98142b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(str, travelHotelsSortingOption != null ? travelHotelsSortingOption.f98141a : null) || (travelHotelsSortingOption == null && Intrinsics.f(str, availableSortingOptions.f143689a)), null, travelHotelsSortingOption2, YearClass.CLASS_2008));
        }
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        qv0.i iVar;
        yff.g gVar = (yff.g) this.f307718b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        yff.k kVar = gVar.d;
        String str = gVar.f313337a;
        String str2 = gVar.f313338b;
        boolean z = gVar.f;
        s0 s0Var = new s0(4);
        qv0.i iVarX = kVar.f313346a;
        if (iVarX != null) {
            RowDelegate.Model model = iVarX instanceof RowDelegate.Model ? (RowDelegate.Model) iVarX : null;
            if (model != null) {
                iVarX = RowDelegate.Model.x(model, null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2049, 15);
            }
            iVar = iVarX;
            yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
        } else {
            iVar = null;
        }
        s0Var.a(iVar);
        qv0.i iVar2 = kVar.f313347b;
        if (iVar2 != null) {
            yp0.b.l(iVar2, 0, 0, 0, 0, null, false, 63);
        } else {
            iVar2 = null;
        }
        s0Var.a(iVar2);
        List<Troubleshooter> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Troubleshooter troubleshooter : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("TROUBLESHOOTING_ISSUE_", troubleshooter.f91840a), null, new TextClause(troubleshooter.f91841b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true), false, null, false, null, null, null, null, null, null, troubleshooter, l7d.a.d(4, str, troubleshooter.f91842c), 0, 0, 0, 0, 524286970));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new RowDelegate.Model[0]));
        s0Var.a(z ? null : yff.m.b(str, str2));
        ArrayList arrayList2 = s0Var.f186433a;
        return zhm.v.m(arrayList2.toArray(new qv0.i[arrayList2.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p(Object obj2, Object obj3, Object obj4) {
        yh4.y yVar = (yh4.y) this.f307718b;
        yh4.a content = (yh4.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        c45.b bVar = yVar.f313773a;
        dz3.c cVar = content.f313749a;
        x35.e account = content.f313750b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_title, zhm.u.c(cVar.f121230a), null, 12);
        dz3.c cVar2 = content.f313749a;
        String str = cVar2.f121231b;
        dz3.b bVar2 = cVar2.f;
        dz3.a aVar = bVar2.f121229b;
        String str2 = bVar2.f121228a;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_second_description, zhm.u.c(str), null, 12) : null;
        String str3 = cVar2.f121232c;
        yy0.j jVar = str3 != null ? new yy0.j(new UrlImage(str3, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902)) : null;
        dz3.b bVar3 = cVar2.f121233g;
        aw0.i hVar = bVar3 != null ? new aw0.h(true, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_primary_button, zhm.u.c(str2), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, aVar, 508), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_secondary_button, zhm.u.c(bVar3.f121228a), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, bVar3.f121229b, 508), null, null, null, SyslogConstants.LOG_CLOCK) : new aw0.e(true, null, null, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_primary_button, zhm.u.c(str2), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, aVar, 508), null, null, 54);
        aim.e eVarB = zhm.u.b();
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_title, zhm.u.c(bVar.g(account)), null, 12);
        TextLocalisedClause textLocalisedClauseC = bVar.c(account);
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        RowDelegate.Model model = new RowDelegate.Model("account", new RowDelegate.Model.MainImage.Image40(bVar.d(account), null, null, z, newBadgeContent, false, 62), textLocalisedClause3, null, 0, textLocalisedClauseC != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_description, zhm.u.c(textLocalisedClauseC), null, 12) : null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_account_change, null, null, 14), 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, newBadgeContent, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("name", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_user_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_user_value, zhm.u.c(account.a()), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_iban_title, null, null, 14), (Image) null, 0, false, 30);
        int i = com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_iban_value;
        Intrinsics.checkNotNullParameter(account, "account");
        List listK = zhm.v.k(model2, new CellDetailsDelegate.Model("iban", t0Var, new TextLocalisedClause(i, zhm.u.c(c45.b.a(account, w35.a.FORMATTED)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        String str4 = cVar2.d;
        if (str4 != null) {
            PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("disclaimer", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_disclaimer, zhm.u.c(str4), null, 12), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model3);
        }
        String str5 = cVar2.e;
        if (str5 != null) {
            eVarB.add(new TextDelegate.Model("footer", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_footer, zhm.u.c(str5), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        return new yh4.o(zhm.u.a(eVarB), textLocalisedClause, textLocalisedClause2, jVar, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo8.j0.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        WealthAccount.Securities securities = (WealthAccount.Securities) this.f307718b;
        String portfolioId = (String) obj2;
        TradingLegalEntityInformation legalEntity = (TradingLegalEntityInformation) obj3;
        List cashHoldingsAvailability = (List) obj4;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(legalEntity, "legalEntity");
        Intrinsics.checkNotNullParameter(cashHoldingsAvailability, "cashHoldingsAvailability");
        return new WealthTransferPickerControllerContract$TransferAccount.Securities(portfolioId, cashHoldingsAvailability, securities, legalEntity);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = (WealthAccount.TaxAdvantageWealthAccount) this.f307718b;
        String portfolioId = (String) obj2;
        TradingLegalEntityInformation legalEntity = (TradingLegalEntityInformation) obj3;
        List cashHoldingsAvailability = (List) obj4;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(legalEntity, "legalEntity");
        Intrinsics.checkNotNullParameter(cashHoldingsAvailability, "cashHoldingsAvailability");
        return new WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount(portfolioId, cashHoldingsAvailability, taxAdvantageWealthAccount, legalEntity);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        ykh.a aVar = (ykh.a) this.f307718b;
        Set filters = (Set) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(filters, "filters");
        return aVar.a(filters);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        yl6.h hVar = (yl6.h) this.f307718b;
        ph6.f linkedAccountsData = (ph6.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(linkedAccountsData, "linkedAccountsData");
        ArrayList<ph6.a> arrayList = linkedAccountsData.f236230c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (ph6.a aVar : arrayList) {
            TextClause textClause = new TextClause(aVar.f236217c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Image imageC = ((di6.a) hVar.f314662a).c(aVar.d);
            arrayList2.add(new RowDelegate.Model(aVar.f236215a, new RowDelegate.Model.MainImage.Image40(imageC, null, null, false, null, false, 60), new TextClause(aVar.f236216b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, textClause, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0afa  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 3552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo8.j0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j0(Object obj2, int i) {
        this.f307717a = i;
        this.f307718b = obj2;
    }

    public /* synthetic */ j0(Object obj2, Object obj3, int i) {
        this.f307717a = i;
        this.f307718b = obj3;
    }
}
