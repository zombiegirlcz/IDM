package tt;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt.b f274180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$InputData f274181b;

    public b(f biometricVerificationDocumentStepUiMapper, h documentUiSettingsProvider, xt.b validatorConfigsProvider, i documentFaqBottomSheetInputDataMapper, BiometricVerificationDocumentStepFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(biometricVerificationDocumentStepUiMapper, "biometricVerificationDocumentStepUiMapper");
        Intrinsics.checkNotNullParameter(documentUiSettingsProvider, "documentUiSettingsProvider");
        Intrinsics.checkNotNullParameter(validatorConfigsProvider, "validatorConfigsProvider");
        Intrinsics.checkNotNullParameter(documentFaqBottomSheetInputDataMapper, "documentFaqBottomSheetInputDataMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f274180a = validatorConfigsProvider;
        this.f274181b = inputData;
    }
}
