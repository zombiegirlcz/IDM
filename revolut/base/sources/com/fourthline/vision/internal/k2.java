package com.fourthline.vision.internal;

import com.fourthline.vision.internal.r9;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.text.TextRecognizer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k2 {
    @NotNull
    public final j6 provideAccurateFaceDetector(@NotNull FaceDetector detector, @NotNull v9 playServicesAvailabilityDataSource) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new b(detector, playServicesAvailabilityDataSource);
    }

    @NotNull
    public final BarcodeScanner provideBarcodeScanner() {
        hh.a aVarI = com.bumptech.glide.d.i();
        Intrinsics.checkNotNullExpressionValue(aVarI, "getClient(...)");
        return aVarI;
    }

    @NotNull
    public final j6 provideFastFaceDetector(@NotNull FaceDetector detector, @NotNull v9 playServicesAvailabilityDataSource) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new q6(detector, playServicesAvailabilityDataSource);
    }

    @NotNull
    public final FaceDetector provideMlKitAccurateFaceDetector() {
        oh.a aVarF = pd.b.f(new FaceDetectorOptions(2, 2, 2, 2, 0.1f));
        Intrinsics.checkNotNullExpressionValue(aVarF, "getClient(...)");
        return aVarF;
    }

    @NotNull
    public final FaceDetector provideMlKitFastFaceDetector(@NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        oh.a aVarF = pd.b.f(new FaceDetectorOptions(1, 1, 2, 1, scannerConfig.getFastFaceDetectorMinFaceSize()));
        Intrinsics.checkNotNullExpressionValue(aVarF, "getClient(...)");
        return aVarF;
    }

    @NotNull
    public final r9 provideOcrTextDetector(@NotNull TextRecognizer textRecognizer, @NotNull v9 playServicesAvailabilityDataSource, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        Intrinsics.checkNotNullParameter(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        return new r9(textRecognizer, new d9(null, 1, null), new k9(new b9(), new m9()), playServicesAvailabilityDataSource, featureConfig.isAutoDetectFallbackEnabled() ? r9.a.f36764b : r9.a.f36763a);
    }

    @NotNull
    public final z9 provideQrCodeTextDetector(@NotNull BarcodeScanner barcodeScanner, @NotNull v9 playServicesAvailabilityDataSource) {
        Intrinsics.checkNotNullParameter(barcodeScanner, "barcodeScanner");
        Intrinsics.checkNotNullParameter(playServicesAvailabilityDataSource, "playServicesAvailabilityDataSource");
        return new z9(barcodeScanner, playServicesAvailabilityDataSource);
    }

    @NotNull
    public final TextRecognizer provideTextRecognizer(@NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        try {
            return g4i.a.g(th.a.f271227c);
        } catch (MlKitException unused) {
            return new t2();
        }
    }
}
