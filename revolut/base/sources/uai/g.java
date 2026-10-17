package uai;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationCooldownBottomSheetContract$InputData f278669a;

    public g(EmailVerificationCooldownBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f278669a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        lw0.a aVar;
        TextLocalisedClause textLocalisedClause;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EmailVerificationCooldownBottomSheetContract$InvocationSource emailVerificationCooldownBottomSheetContract$InvocationSource = this.f278669a.f97578a;
        if (emailVerificationCooldownBottomSheetContract$InvocationSource instanceof EmailVerificationCooldownBottomSheetContract$InvocationSource.Email) {
            aVar = new lw0.a(new TextLocalisedClause(R$string.signup_main_form_email_verify_resend_update_title, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_email_verify_resend_update_subtitle, null, null, 14), null, null, false, 28);
        } else {
            if (!(emailVerificationCooldownBottomSheetContract$InvocationSource instanceof EmailVerificationCooldownBottomSheetContract$InvocationSource.EmailVerification)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new lw0.a(new TextLocalisedClause(R$string.signup_main_form_email_verify_resend_title, null, null, 14), new TextLocalisedClause(R$string.signup_main_form_email_verify_resend_subtitle, null, null, 14), null, null, false, 28);
        }
        if (domainState.f278662a) {
            int i = R$string.signup_main_form_email_verify_resend_inactive_button;
            int i2 = domainState.f278663b;
            String str = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textLocalisedClause = new TextLocalisedClause(i, u.c(str), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.signup_main_form_email_verify_resend_active_button, null, null, 14);
        }
        return new e(new cii.a(aVar, new aw0.e(false, null, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, !domainState.f278662a, null, null, 988), null, null, 55)));
    }
}
