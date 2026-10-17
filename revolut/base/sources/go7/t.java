package go7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.FuturePriceChange;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.MtaQuote;
import com.revolut.feature.insurance_car.impl.data.model.OneTimePayment;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kl7.a1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause b(MoneyClause moneyClause, boolean z) {
        return new TextLocalisedClause(R$string.car_insurance_common_monthly_price, zhm.u.c(moneyClause), z ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE) : null, 8);
    }

    public static RowDelegate.Model.MainImage.Image24 c(a1 a1Var) {
        switch (u.f145111a[a1Var.ordinal()]) {
            case 1:
                return xl7.n.i(R$drawable.uikit_icn_24_add_contact, Integer.valueOf(R$attr.uikit_colorForeground));
            case 2:
            case 3:
                return xl7.n.i(R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorForeground));
            case 4:
            case 5:
            case 6:
                return xl7.n.i(R$drawable.uikit_icn_24_driving_licence, Integer.valueOf(R$attr.uikit_colorForeground));
            case 7:
                return xl7.n.i(R$drawable.uikit_icn_24_national_id, Integer.valueOf(R$attr.uikit_colorForeground));
            case 8:
                throw new IllegalStateException(("unexpected mtaType: " + a1Var).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TextLocalisedClause d(a1 a1Var, boolean z) {
        int i;
        switch (u.f145111a[a1Var.ordinal()]) {
            case 1:
                i = R$string.car_insurance_mta_review_cells_additional_driver_title;
                break;
            case 2:
                i = R$string.car_insurance_mta_review_cells_remove_driver_title;
                break;
            case 3:
                i = !z ? R$string.car_insurance_mta_review_cells_remove_driver_title : R$string.car_insurance_mta_review_cells_cancel_main_car_title;
                break;
            case 4:
                i = R$string.car_insurance_mta_review_cells_main_car_title;
                break;
            case 5:
                i = R$string.car_insurance_mta_review_cells_substitute_car_title;
                break;
            case 6:
                i = R$string.car_insurance_mta_review_cells_additional_car_title;
                break;
            case 7:
                i = R$string.car_insurance_mta_review_cells_driving_licence_title;
                break;
            case 8:
                throw new IllegalStateException(("unexpected mtaType: " + a1Var).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        RowDelegate.Model model3;
        RowDelegate.Model model4;
        int i;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        do3.n nVar = domainState.f;
        boolean z = domainState.f145094g;
        MtaQuote mtaQuote = domainState.e;
        a1 a1Var = domainState.f145091a;
        if (nVar != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_review_cells_driver_title, null, null, 14);
            TextClause textClause = new TextClause(w.I(nVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image24 image24I = xl7.n.i(R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorForeground));
            int i2 = R$attr.uikit_dp12;
            model = new RowDelegate.Model("MAIN_DRIVER_ITEM", image24I, textLocalisedClause, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i2, i2, 0, 0, 486537176);
        } else {
            model = null;
        }
        InsurableCar insurableCar = domainState.f145092b;
        if (insurableCar != null) {
            TextLocalisedClause textLocalisedClauseD = d(a1Var, true);
            TextClause textClauseC = xl7.h.c(insurableCar);
            RowDelegate.Model.MainImage.Image24 image24C = c(a1Var);
            int i3 = R$attr.uikit_dp12;
            model2 = new RowDelegate.Model("CAR_ITEM", image24C, textLocalisedClauseD, null, 0, textClauseC, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486537176);
        } else {
            model2 = null;
        }
        AdditionalDriver additionalDriver = domainState.f145093c;
        if (additionalDriver != null) {
            TextLocalisedClause textLocalisedClauseD2 = d(a1Var, false);
            TextClause textClause2 = new TextClause(additionalDriver.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.MainImage.Image24 image24C2 = c(a1Var);
            int i5 = R$attr.uikit_dp12;
            model3 = new RowDelegate.Model("ADDITIONAL_DRIVER_ITEM", image24C2, textLocalisedClauseD2, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i5, i5, 0, 0, 486537176);
        } else {
            model3 = null;
        }
        Survey.Licence licence = domainState.d;
        if (licence != null) {
            TextLocalisedClause textLocalisedClauseD3 = d(a1Var, false);
            CompositeClause compositeClause = new CompositeClause(v.k(xl7.d.g(licence.f75327a), xl7.d.b(licence.f75328b)), new DotDividerClause((Integer) null), null, null, 12);
            RowDelegate.Model.MainImage.Image24 image24C3 = c(a1Var);
            int i6 = R$attr.uikit_dp12;
            model4 = new RowDelegate.Model("DRIVING_LICENCE_ITEM", image24C3, textLocalisedClauseD3, null, 0, compositeClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i6, i6, 0, 0, 486537176);
        } else {
            model4 = null;
        }
        ZonedDateTime zonedDateTime = mtaQuote.f75257b;
        ZonedDateTime zonedDateTime2 = mtaQuote.f75256a;
        FuturePriceChange futurePriceChange = mtaQuote.f75258c;
        TextLocalisedClause textLocalisedClause2 = zonedDateTime == null ? new TextLocalisedClause(R$string.car_insurance_mta_review_cells_effective_date_title, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_mta_review_cells_coverage_period_title, null, null, 14);
        ZonedDateTime zonedDateTime3 = mtaQuote.f75257b;
        Clause clauseF = zonedDateTime3 == null ? xl7.n.f(zonedDateTime2, null, true, 5) : xl7.n.a(zonedDateTime2, zonedDateTime3, true);
        RowDelegate.Model.MainImage.Image24 image24I2 = xl7.n.i(R$drawable.uikit_icn_24_calendar_date, Integer.valueOf(R$attr.uikit_colorForeground));
        int i21 = R$attr.uikit_dp12;
        RowDelegate.Model[] elements = {model, model2, model3, model4, new RowDelegate.Model("EFFECTIVE_DATE_ITEM", image24I2, textLocalisedClause2, null, 0, clauseF, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i21, i21, 0, 0, 486537176)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListG = yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("CHANGES_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_mta_review_headers_changes, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        aim.e eVarB = zhm.u.b();
        OneTimePayment oneTimePayment = mtaQuote.d;
        if (futurePriceChange != null || oneTimePayment != null) {
            eVarB.add(new ListSubheaderDelegate.Model("PRICE_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_mta_review_headers_price, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        }
        if (futurePriceChange != null) {
            List listK = v.k(new CellDetailsDelegate.Model("NEW_PRICE_ITEM", new TextLocalisedClause(R$string.car_insurance_mta_review_cells_price_change_title, zhm.u.c(xl7.n.h(futurePriceChange.f75225c)), null, 12), b(xl7.n.g(futurePriceChange.f75224b, null, null, 3), false), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("OLD_PRICE_ITEM", new TextLocalisedClause(R$string.car_insurance_mta_review_cells_previous_price_title, null, null, 14), b(xl7.n.g(futurePriceChange.f75223a, null, null, 3), true), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            a0.x(listK, eVarB);
        }
        if (oneTimePayment != null) {
            int i22 = u.f145112b[oneTimePayment.f75267b.ordinal()];
            if (i22 == 1) {
                i = R$string.car_insurance_mta_review_cells_one_time_payment_title;
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.car_insurance_mta_review_cells_one_time_refund_title;
            }
            CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ONE_TIME_PAYMENT_ITEM", new TextLocalisedClause(i, null, null, 14), xl7.n.g(oneTimePayment.f75268c, null, null, 3), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, oneTimePayment.f75267b, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model5);
        }
        return new i(d0.E0(zhm.u.c(new TextDelegate.Model("FOOTER_ITEM", new TextLocalisedClause(R$string.car_insurance_mta_review_footer_text_placeholder, zhm.u.c(new TextLocalisedClause(R$string.car_insurance_mta_review_footer_text_demands_and_needs, null, new Click(28, (Integer) null, (Object) mtaQuote.e, "DEMANDS_AND_NEEDS_ITEM", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036)), d0.E0(yp0.b.i(xl7.i.a(new TextLocalisedClause(R$string.car_insurance_mta_review_cells_answered_honestly_text, null, null, 14), "LEGAL_CHECK_ITEM", z), new ListSubheaderDelegate.Model("LEGAL_CHECK_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_mta_review_headers_legal_checks, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), d0.E0(zhm.u.a(eVarB), arrayListG))), z);
    }
}
