package com.onfido.android.sdk.capture.detector.barcode;

import com.google.mlkit.vision.barcode.BarcodeScanner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class BarcodeDetectorGoogle$barcodeDetector$2 extends u implements Function0<BarcodeScanner> {
    final /* synthetic */ BarcodeDetectorGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeDetectorGoogle$barcodeDetector$2(BarcodeDetectorGoogle barcodeDetectorGoogle) {
        super(0);
        this.this$0 = barcodeDetectorGoogle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BarcodeScanner invoke() {
        return (BarcodeScanner) this.this$0.barcodeDetectorProvider.get();
    }
}
