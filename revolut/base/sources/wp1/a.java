package wp1;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.provider.BillsDialogProvider$Payload;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import nii.z;
import sf0.h;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ep1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f299004a;

    public a(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f299004a = serverErrorParser;
    }

    public final y0 a(Throwable t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        ServerError serverErrorA = this.f299004a.a(t2);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        return (numValueOf != null && numValueOf.intValue() == 57417) ? new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_not_found_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_not_found_description, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5) : (numValueOf != null && numValueOf.intValue() == 57403) ? new y0(null, new l0(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_already_paid_title, null, null, 14), null, null, null, null, null, false, null, 1022), false, 5) : ((numValueOf != null && numValueOf.intValue() == 57402) || (numValueOf != null && numValueOf.intValue() == 57405) || (numValueOf != null && numValueOf.intValue() == 57418)) ? new y0(null, new l0(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_invalid_for_payment_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_invalid_for_payment_description, null, null, 14), null, new TextLocalisedClause(R$string.pay_bills_taxes_common_go_back, null, null, 14), null, null, false, null, 1012), false, 5) : (numValueOf != null && numValueOf.intValue() == 57419) ? new y0(null, new l0(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_bill_expired_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_bill_expired_description, null, null, 14), null, null, null, null, false, null, 1020), false, 5) : (numValueOf != null && numValueOf.intValue() == 57421) ? new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_label_already_used_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_label_already_used_description, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_form_input_update, null, null, 14), null, null, new BillsDialogProvider$Payload(57421), false, null, null, null, null, null, null, 32628), false, 5) : (numValueOf != null && numValueOf.intValue() == 57429) ? new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_creditor_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_search_error_creditor_unavailable_description, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5) : new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
    }

    public final dii.a b() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_postpaid_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_postpaid_dialog_description, null, null, 14), new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_sim_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null), null, false, 24);
        m6 m6Var = n6.Companion;
        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_postpaid_dialog_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_postpaid_dialog_button_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Retail;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
