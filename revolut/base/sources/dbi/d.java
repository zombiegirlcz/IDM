package dbi;

import com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowDestination;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowInputData;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowControllerDescriptor;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f112757a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f112757a = featureToggleInteractor;
    }

    public final ParcelableDestination a(String str) {
        return ((jte.d) this.f112757a).c(UserDeclarationsApi$Toggles.EmailVerificationOtpUi.f97478c) ? new ControllerDestination.Modal(new EmailVerificationOtpFlowControllerDescriptor(new EmailVerificationOtpFlowInputData(new EmailVerificationOtpFlowInputData.Origin.PostOnboarding(str))), ModalDestination.Style.BOTTOM_DIALOG.f98301a) : new EmailVerificationFlowDestination(new EmailVerificationFlowInputData(str));
    }
}
