package com.onfido.android.sdk.capture.ui.camera;

import androidx.annotation.NonNull;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
public interface MediaCaptureCallback {
    void onErrorTakingPicture(@NonNull CameraSource.TakePictureException takePictureException);

    void onPictureCaptured(byte[] bArr, int i, int i2);

    void onVideoCanceled();

    void onVideoCaptured(boolean z, String str);

    void onVideoTimeoutExceeded();
}
