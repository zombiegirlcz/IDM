package com.onfido.android.sdk.capture.ui.camera;

import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaptureActivity f49994b;

    public /* synthetic */ a(CaptureActivity captureActivity, int i) {
        this.f49993a = i;
        this.f49994b = captureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f49993a) {
            case 0:
                CaptureActivity.setupCaptureButton$lambda$11(this.f49994b, view);
                break;
            default:
                CaptureActivity.inflateCaptureButton$lambda$8(this.f49994b, view);
                break;
        }
    }
}
