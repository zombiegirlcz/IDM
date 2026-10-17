package ik7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.feature.insurance.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final Clause a(CFACPaymentCanceller cFACPaymentCanceller) {
        Intrinsics.checkNotNullParameter(cFACPaymentCanceller, "<this>");
        String str = cFACPaymentCanceller.f74994b;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : a0.z(cFACPaymentCanceller.f74993a, "CUSTOMER", true) ? new TextLocalisedClause(R$string.cfac_claim_expense_add_details_canceller_customer_title, null, null, 14) : new TextLocalisedClause(R$string.cfac_claim_expense_add_details_canceller_provider_title, null, null, 14);
    }

    public static final Clause b(CFACPaymentPurpose cFACPaymentPurpose) {
        Intrinsics.checkNotNullParameter(cFACPaymentPurpose, "<this>");
        String str = cFACPaymentPurpose.f74997b;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : a0.z(cFACPaymentPurpose.f74996a, "LEISURE", true) ? new TextLocalisedClause(R$string.cfac_claim_expense_add_details_purpose_leisure_title, null, null, 14) : new TextLocalisedClause(R$string.cfac_claim_expense_add_details_purpose_business_title, null, null, 14);
    }
}
