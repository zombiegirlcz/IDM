package n4j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static BeneficiaryRouteDetails a(List details) {
        Object next;
        Intrinsics.checkNotNullParameter(details, "details");
        Iterator it8 = details.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((BeneficiaryRouteDetails) next).f60288b) {
                break;
            }
        }
        BeneficiaryRouteDetails beneficiaryRouteDetails = (BeneficiaryRouteDetails) next;
        return beneficiaryRouteDetails == null ? (BeneficiaryRouteDetails) d0.b0(details) : beneficiaryRouteDetails;
    }

    public static TextClause b(BankFieldDefinition definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        String strA = z2j.e.a(definition);
        if (strA != null) {
            return new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    public static u2j.d c(BeneficiaryInfoState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if ((state instanceof BeneficiaryInfoState.CreditCardBeneficiary) || (state instanceof BeneficiaryInfoState.MobileWallet) || (state instanceof BeneficiaryInfoState.PaymentVendor)) {
            return null;
        }
        if (!(state instanceof BeneficiaryInfoState.BankRecipient)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = b.f212451a[((BeneficiaryInfoState.BankRecipient) state).f99707h.ordinal()];
        if (i == 1) {
            return u2j.d.BUSINESS;
        }
        if (i == 2) {
            return u2j.d.PERSONAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String d(BankFieldDefinition definition, String text) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(text, "text");
        int i = z2j.d.f319092a[definition.f60273c.ordinal()];
        if (i == 1) {
            return a0.D(text, " ", "", false);
        }
        if (i == 2) {
            return a0.D(text, "-", "", false);
        }
        if (i == 3) {
            String str = definition.f;
            if (str != null && !str.equals("[..................................................]")) {
                if (kotlin.text.d0.J(str, "{ }", false) || kotlin.text.d0.J(str, " ", false)) {
                    text = a0.D(text, " ", "", false);
                }
                if (kotlin.text.d0.J(str, "(", false)) {
                    text = a0.D(text, "(", "", false);
                }
                if (kotlin.text.d0.J(str, ")", false)) {
                    text = a0.D(text, ")", "", false);
                }
                return (kotlin.text.d0.J(str, "{-}", false) || kotlin.text.d0.J(str, "-", false)) ? a0.D(text, "-", "", false) : text;
            }
        } else if (i == 4) {
            Locale locale = Locale.ROOT;
            return v0.a.j(locale, "ROOT", text, locale, "toUpperCase(...)");
        }
        return text;
    }
}
