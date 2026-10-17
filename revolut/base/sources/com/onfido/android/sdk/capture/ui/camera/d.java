package com.onfido.android.sdk.capture.ui.camera;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfirmationStepButtons f50001b;

    public /* synthetic */ d(ConfirmationStepButtons confirmationStepButtons, int i) {
        this.f50000a = i;
        this.f50001b = confirmationStepButtons;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50000a) {
            case 0:
                ConfirmationStepButtons.setWarningState$lambda$9$lambda$8(this.f50001b, view);
                break;
            case 1:
                ConfirmationStepButtons.setSelfieErrorState$lambda$17$lambda$16(this.f50001b, view);
                break;
            case 2:
                ConfirmationStepButtons.setWarningState$lambda$11$lambda$10(this.f50001b, view);
                break;
            case 3:
                ConfirmationStepButtons.setFaceCaptureActions$lambda$5$lambda$4(this.f50001b, view);
                break;
            case 4:
                ConfirmationStepButtons.setFaceCaptureActions$lambda$7$lambda$6(this.f50001b, view);
                break;
            case 5:
                ConfirmationStepButtons.setDocumentCaptureActions$lambda$1$lambda$0(this.f50001b, view);
                break;
            case 6:
                ConfirmationStepButtons.setDocumentCaptureActions$lambda$3$lambda$2(this.f50001b, view);
                break;
            case 7:
                ConfirmationStepButtons.setErrorState$lambda$13$lambda$12(this.f50001b, view);
                break;
            default:
                ConfirmationStepButtons.setDocumentErrorState$lambda$21$lambda$20(this.f50001b, view);
                break;
        }
    }
}
