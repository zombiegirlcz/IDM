package com.onfido.android.sdk.capture.ui.camera;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CapturePresenter f49999b;

    public /* synthetic */ c(CapturePresenter capturePresenter, int i) {
        this.f49998a = i;
        this.f49999b = capturePresenter;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f49998a) {
            case 0:
                CapturePresenter.uploadDocumentMedia$lambda$23(this.f49999b);
                break;
            case 1:
                this.f49999b.stopDocumentRecording();
                break;
            case 2:
                CapturePresenter.onStart$lambda$5(this.f49999b);
                break;
            case 3:
                CapturePresenter.enableAccessibilityCapture$lambda$3(this.f49999b);
                break;
            case 4:
                CapturePresenter.enableAccessibilityCapture$lambda$4(this.f49999b);
                break;
            default:
                CapturePresenter.observeFaceOut$lambda$12(this.f49999b);
                break;
        }
    }
}
