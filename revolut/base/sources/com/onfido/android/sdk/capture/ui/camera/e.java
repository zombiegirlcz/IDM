package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnfidoButton f50006b;

    public /* synthetic */ e(int i, OnfidoButton onfidoButton) {
        this.f50005a = i;
        this.f50006b = onfidoButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50005a) {
            case 0:
                ConfirmationStepButtons.setDocumentErrorState$lambda$23$lambda$22(this.f50006b);
                break;
            case 1:
                ConfirmationStepButtons.setSelfieErrorState$lambda$19$lambda$18(this.f50006b);
                break;
            case 2:
                ConfirmationStepButtons.forceButtonHeight$lambda$24(this.f50006b);
                break;
            default:
                ConfirmationStepButtons.setErrorState$lambda$15$lambda$14(this.f50006b);
                break;
        }
    }
}
