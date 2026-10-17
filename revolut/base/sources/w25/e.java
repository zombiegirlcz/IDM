package w25;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f293947a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293947a = featureToggleInteractor;
    }

    public static ProductAccountWidgetAction a(Loan loan) {
        LoanInsuranceState loanInsuranceState = loan.f70122w;
        if ((loanInsuranceState instanceof LoanInsuranceState.Eligible ? (LoanInsuranceState.Eligible) loanInsuranceState : null) != null) {
            return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_add_insurance, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new b(loan), "ID_ADD_INSURANCE_ACTION", null, null, false, false);
        }
        return null;
    }

    public static ProductAccountWidgetAction c(Loan loan) {
        if (loan.f.f241821g) {
            return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.loan_management_cancel_loan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_CANCELLATION_ACTION", null, null, false, false);
        }
        return null;
    }

    public static ProductAccountWidgetAction d(q35.h hVar) {
        if (hVar.d) {
            return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_action_change_day, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_CHANGE_REPAYMENT_DAY_BUTTON", null, null, false, false);
        }
        return null;
    }

    public static ProductAccountWidgetAction e(Loan loan) {
        if (loan.o != b95.a.MORTGAGE_LOAN) {
            return null;
        }
        return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_action_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_DOCUMENTS_ACTION", null, null, false, false);
    }

    public static ProductAccountWidgetAction f(Loan loan) {
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_get_help, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_help_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new c(loan), "ID_GET_HELP_ACTION", null, null, false, false);
    }

    public static ProductAccountWidgetAction g(Loan loan) {
        LoanInsuranceState loanInsuranceState = loan.f70122w;
        LoanInsuranceState.Insured insured = loanInsuranceState instanceof LoanInsuranceState.Insured ? (LoanInsuranceState.Insured) loanInsuranceState : null;
        if (insured != null) {
            if (insured.f70163a.isEmpty()) {
                insured = null;
            }
            if (insured != null) {
                return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_insurance, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_insurance, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new d(loan, insured.f70163a), "ID_INSURANCE_ACTION", null, null, false, false);
            }
        }
        return null;
    }

    public static ProductAccountWidgetAction i() {
        return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_action_rename, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_RENAME_ACTION", null, null, false, false);
    }

    public static ProductAccountWidgetAction j() {
        return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_REPAY_ACTION", null, null, false, false);
    }

    public static ProductAccountWidgetAction l(q35.h hVar, b95.a aVar) {
        if (hVar.f241820c == q35.g.Disabled || aVar == b95.a.MORTGAGE_LOAN) {
            return null;
        }
        return new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R$string.credit_common_action_statements, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), hVar.f241820c, "ID_STATEMENTS_ACTION", null, null, false, false);
    }

    public final ProductAccountWidgetAction b(q35.h hVar) {
        if (hVar.f241819b == q35.e.ACH) {
            if (!((jte.d) this.f293947a).c(LoanApi$Toggles.LoanPaymentSettingsRevamp.f70067c)) {
                return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_action_autopay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_AUTO_PAY_ACTION", null, null, false, false);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction h(q35.h r19) {
        /*
            r18 = this;
            r0 = r19
            q35.e r1 = r0.f241819b
            q35.e r2 = q35.e.SEPA
            r3 = 0
            if (r1 != r2) goto Lc
            r2 = r18
            goto L57
        Lc:
            q35.f r1 = r0.f
            q35.f r2 = q35.f.MultiBorrower
            r4 = 14
            if (r1 != r2) goto L4e
            com.revolut.feature.credit.loan.api.LoanApi$Toggles$LoanPaymentSettingsRevamp r1 = com.revolut.feature.credit.loan.api.LoanApi$Toggles.LoanPaymentSettingsRevamp.f70067c
            r2 = r18
            gte.a r5 = r2.f293947a
            jte.d r5 = (jte.d) r5
            boolean r1 = r5.c(r1)
            if (r1 == 0) goto L23
            goto L50
        L23:
            com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction r5 = new com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.credit.core.R$string.credit_common_action_manage_repayments
            r8.<init>(r1, r3, r3, r4)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_coins
            int r1 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r16 = 0
            r17 = 246(0xf6, float:3.45E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7 = 0
            r6 = 492(0x1ec, float:6.9E-43)
            r10 = 0
            java.lang.String r11 = "ID_MANAGE_REPAYMENTS_ACTION"
            r13 = 0
            r14 = 0
            r15 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L51
        L4e:
            r2 = r18
        L50:
            r5 = r3
        L51:
            if (r5 != 0) goto L82
            boolean r0 = r0.f241818a
            if (r0 != 0) goto L58
        L57:
            return r3
        L58:
            com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction r5 = new com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.credit.core.R$string.credit_management_backup_card
            r8.<init>(r0, r3, r3, r4)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_card
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r16 = 0
            r17 = 246(0xf6, float:3.45E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7 = 0
            r6 = 492(0x1ec, float:6.9E-43)
            r10 = 0
            java.lang.String r11 = "ID_BACKUP_CARD_ACTION"
            r13 = 0
            r14 = 0
            r15 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w25.e.h(q35.h):com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction");
    }

    public final ProductAccountWidgetAction k(q35.h hVar) {
        if (hVar.f241819b == q35.e.SEPA) {
            if (!((jte.d) this.f293947a).c(LoanApi$Toggles.LoanPaymentSettingsRevamp.f70067c)) {
                return new ProductAccountWidgetAction(492, null, new TextLocalisedClause(R$string.credit_common_action_payment_management, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_repayment, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, "ID_PAYMENT_MANAGEMENT", null, null, false, false);
            }
        }
        return null;
    }
}
