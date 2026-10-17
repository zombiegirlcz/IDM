package com.onfido.android.sdk.capture.detector.barcode;

import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.validation.device.BarcodeValidationResult;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/barcode/BarcodeDetectorEmpty;", "Lcom/onfido/android/sdk/capture/detector/barcode/BarcodeDetector;", "()V", "detect", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/validation/device/BarcodeValidationResult;", "documentFrame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "isRealtimeAnalysis", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BarcodeDetectorEmpty implements BarcodeDetector {
    @Override // com.onfido.android.sdk.capture.detector.barcode.BarcodeDetector
    @NotNull
    public Single<BarcodeValidationResult> detect(@NotNull DocumentDetectionFrame documentFrame, boolean isRealtimeAnalysis) {
        Intrinsics.checkNotNullParameter(documentFrame, "documentFrame");
        b bVarF = Single.f(new BarcodeValidationResult("not_detected", true));
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }
}
