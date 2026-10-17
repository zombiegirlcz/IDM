package com.onfido.android.sdk.capture.ui.camera.view;

import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements CameraSource.PictureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraSource f50051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraSource.PictureCallback f50052c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f(CameraSource cameraSource, CameraSource.PictureCallback pictureCallback, boolean z, int i) {
        this.f50050a = i;
        this.f50051b = cameraSource;
        this.f50052c = pictureCallback;
        this.d = z;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.PictureCallback
    public final void onPictureTaken(byte[] bArr, int i, int i2) {
        switch (this.f50050a) {
            case 0:
                this.f50051b.lambda$tryTakePictureWithAutoFocus$2(this.f50052c, this.d, bArr, i, i2);
                break;
            default:
                this.f50051b.lambda$takePictureWithAutoFocus$4(this.f50052c, this.d, bArr, i, i2);
                break;
        }
    }
}
