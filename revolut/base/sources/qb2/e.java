package qb2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.Purpose;
import com.revolut.feature.apm.payto.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(PaymentMethodDetails.PayTo.AdditionalInfo additionalInfo, PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo) {
        String str;
        Boolean bool;
        String str2;
        Purpose purpose;
        TextLocalisedClause textLocalisedClause;
        String str3;
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        ArrayList arrayList = new ArrayList();
        bx1.a aVarA = bx1.b.a(amendmentAdditionalInfo != null ? amendmentAdditionalInfo.f62081a : null, additionalInfo.f62052a);
        bx1.a aVarA2 = bx1.b.a(amendmentAdditionalInfo != null ? amendmentAdditionalInfo.f62082b : null, additionalInfo.f62053b);
        bx1.a aVarA3 = bx1.b.a(amendmentAdditionalInfo != null ? amendmentAdditionalInfo.f62083c : null, additionalInfo.f62054c);
        bx1.a aVarA4 = bx1.b.a(amendmentAdditionalInfo != null ? amendmentAdditionalInfo.d : null, additionalInfo.d);
        bx1.a aVarA5 = bx1.b.a(amendmentAdditionalInfo != null ? amendmentAdditionalInfo.e : null, additionalInfo.f);
        if (aVarA != null && (str3 = (String) aVarA.f19479a) != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("SHORT_DESCRIPTION_LIST_ID", new TextLocalisedClause(R$string.mandate_details_short_description_title, null, null, 14), null, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        if (aVarA2 != null && (purpose = (Purpose) aVarA2.f19479a) != null) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_purpose_title, null, null, 14);
            switch (f.f244083a[purpose.ordinal()]) {
                case 1:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_mortgage, null, null, 14);
                    break;
                case 2:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_utility, null, null, 14);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_loan, null, null, 14);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_dependant_support, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_gambling, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_retail, null, null, 14);
                    break;
                case 7:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_salary, null, null, 14);
                    break;
                case 8:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_personal, null, null, 14);
                    break;
                case 9:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_government, null, null, 14);
                    break;
                case 10:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_pension, null, null, 14);
                    break;
                case 11:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_tax, null, null, 14);
                    break;
                case 12:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_purpose_payto_other_services, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new CellDetailsNoteDelegate.Model("PURPOSE_LIST_ID", textLocalisedClause2, null, textLocalisedClause, null, false, null, null, null, null, null, 0, 131060));
        }
        if (aVarA3 != null && (str2 = (String) aVarA3.f19479a) != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("CONDITION_OF_PAYMENT_LIST_ID", new TextLocalisedClause(R$string.mandate_details_conditions_of_payment_title, null, null, 14), null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        if (aVarA4 != null && (bool = (Boolean) aVarA4.f19479a) != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("AUTOMATIC_RENEWAL_LIST_ID", new TextLocalisedClause(R$string.mandate_details_automatic_renewal_title, null, null, 14), null, new TextLocalisedClause(bool.booleanValue() ? com.revolut.feature.apm.core.api.R$string.mandate_details_automatic_renewal_yes : com.revolut.feature.apm.core.api.R$string.mandate_details_automatic_renewal_no, null, null, 14), null, false, null, null, null, null, null, 0, 131060));
        }
        String str4 = additionalInfo.e;
        if (str4 != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("PAYER_LIST_ID", new TextLocalisedClause(R$string.mandate_details_payer_title, null, null, 14), null, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        if (aVarA5 != null && (str = (String) aVarA5.f19479a) != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("PAYMENT_REFERENCE_LIST_ID", new TextLocalisedClause(R$string.mandate_details_payment_reference_title, null, null, 14), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        String str5 = additionalInfo.f62055g;
        if (str5 != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("ULTIMATE_PAYER_LIST_ID", new TextLocalisedClause(R$string.mandate_details_ultimate_payer_title, null, null, 14), null, new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        String str6 = additionalInfo.f62056h;
        if (str6 != null) {
            arrayList.add(new CellDetailsNoteDelegate.Model("PAYEE_LIST_ID", new TextLocalisedClause(R$string.mandate_details_payee_title, null, null, 14), null, new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
