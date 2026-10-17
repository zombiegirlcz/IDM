package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class l implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sf f36463a;

    @Override // com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
    }

    @Override // com.fourthline.vision.internal.rf
    public sf getCallback() {
        return this.f36463a;
    }

    @Override // com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.rf
    public abstract /* synthetic */ Object getPublicStep();

    @Override // com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.rf
    public void setCallback(sf sfVar) {
        this.f36463a = sfVar;
    }

    @Override // com.fourthline.vision.internal.rf
    public void start() {
    }

    @Override // com.fourthline.vision.internal.rf
    public void stop() {
    }

    @Override // com.fourthline.vision.internal.rf
    public void takePicture() {
    }

    @Override // com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.rf
    public void handleError(@NotNull SelfieScannerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        handleEvent((SelfieScannerEvent) new SelfieScannerEvent.OnFail(error));
    }

    @Override // com.fourthline.vision.internal.rf
    public void handleEvent(@NotNull SelfieScannerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        sf callback = getCallback();
        if (callback != null) {
            callback.onEvent(this, event);
        }
    }
}
