package com.onfido.android.sdk.capture.ui;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnfidoActivity f49990b;

    public /* synthetic */ b(OnfidoActivity onfidoActivity, int i) {
        this.f49989a = i;
        this.f49990b = onfidoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49989a) {
            case 0:
                OnfidoActivity.showDocumentCapture$lambda$3(this.f49990b);
                break;
            case 1:
                OnfidoActivity.showFaceCapture$lambda$4(this.f49990b);
                break;
            case 2:
                OnfidoActivity.onActivityResult$lambda$1(this.f49990b);
                break;
            case 3:
                OnfidoActivity.showLivenessCapture$lambda$5(this.f49990b);
                break;
            default:
                OnfidoActivity.completeFlow$lambda$13(this.f49990b);
                break;
        }
    }
}
