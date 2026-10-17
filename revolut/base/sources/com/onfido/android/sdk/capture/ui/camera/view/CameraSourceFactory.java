package com.onfido.android.sdk.capture.ui.camera.view;

import android.content.Context;
import android.hardware.Camera;
import android.view.Surface;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.CameraResolutionProvider;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;

/* JADX INFO: loaded from: classes17.dex */
public class CameraSourceFactory {
    public static boolean isFrontCameraSupported() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (1 == cameraInfo.facing) {
                    return true;
                }
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    public static CameraSourceFactory newInstance() {
        return new CameraSourceFactory();
    }

    public CameraSource createCameraSource(Context context, int i, boolean z, boolean z3, boolean z4, boolean z6, int i2, int i3, int i5, int i6, Surface surface, CameraResolutionProvider cameraResolutionProvider) {
        if (i == 1 && !isFrontCameraSupported()) {
            i = 0;
            Timber.w("CAMERA_FACING_FRONT not supported by this camera, reverting to back camera.", new Object[0]);
        }
        CameraSource.Builder builder = new CameraSource.Builder(context);
        builder.setFacing(i);
        builder.setFocusMode("continuous-picture");
        builder.setCameraResolutionProvider(cameraResolutionProvider);
        builder.setIsPortrait(z3);
        builder.setFlashMode((i == 0 && z) ? "auto" : "off");
        if (z4) {
            builder.setupRecording(i2, i3, i6, i5, surface, z6);
        }
        return builder.build();
    }
}
