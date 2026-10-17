package a75;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsurancePolicyData;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import q35.k;
import sx4.g;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C0006a Companion = new C0006a();

    /* JADX INFO: renamed from: a75.a$a, reason: collision with other inner class name */
    public static final class C0006a {
        private C0006a() {
        }
    }

    public static CellDetailsActionDelegate.Model a(LoanInsuranceState loanInsuranceState) {
        int i;
        if (loanInsuranceState == null || (loanInsuranceState instanceof LoanInsuranceState.Ineligible)) {
            return null;
        }
        if (loanInsuranceState instanceof LoanInsuranceState.Eligible) {
            return new CellDetailsActionDelegate.Model("ID_INSURANCE_ELIGIBLE", new TextLocalisedClause(R$string.credit_common_insurance, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_umbrella, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), g.f(new TextLocalisedClause(R$string.loan_management_details_insurance_set_up, null, null, 14), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), null, false, false, null, null, (LoanInsuranceState.Eligible) loanInsuranceState, 0, 0, 0, 0, 4192228);
        }
        if (!(loanInsuranceState instanceof LoanInsuranceState.Insured)) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_insurance, null, null, 14);
        LoanInsuranceState.Insured insured = (LoanInsuranceState.Insured) loanInsuranceState;
        ArrayList arrayList = insured.f70163a;
        if (arrayList.isEmpty()) {
            i = R$string.loan_management_cancelled;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((LoanInsurancePolicyData) it8.next()).f70160b == k.ACTIVE) {
                    i = R$string.loan_management_details_insurance_active;
                    break;
                }
            }
            i = R$string.loan_management_cancelled;
        }
        return new CellDetailsActionDelegate.Model("ID_INSURANCE_ACTIVE", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), g.f(new TextLocalisedClause(i, null, null, 14), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), null, false, false, null, null, insured, 0, 0, 0, 0, 4192228);
    }
}
