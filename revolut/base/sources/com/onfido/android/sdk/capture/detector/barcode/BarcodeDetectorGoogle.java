package com.onfido.android.sdk.capture.detector.barcode;

import a31.o;
import abf.c;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.common.InputImage;
import com.onfido.android.sdk.capture.detector.helper.DocumentDetectionExtensionKt;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.validation.device.BarcodeValidationResult;
import com.onfido.javax.inject.Provider;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0012¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u0011H\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001b\u0010'\u001a\u00020\u00058RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/barcode/BarcodeDetectorGoogle;", "Lcom/onfido/android/sdk/capture/detector/barcode/BarcodeDetector;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "Lcom/onfido/javax/inject/Provider;", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetectorProvider", "<init>", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/javax/inject/Provider;)V", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "", "isRealtimeAnalysis", "Lcom/google/mlkit/vision/common/InputImage;", "toInputImage", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Z)Lcom/google/mlkit/vision/common/InputImage;", "firebaseImage", "Lio/reactivex/rxjava3/core/SingleEmitter;", "Lcom/onfido/android/sdk/capture/validation/device/BarcodeValidationResult;", "emitter", "", "processImage", "(Lcom/google/mlkit/vision/common/InputImage;Lio/reactivex/rxjava3/core/SingleEmitter;)V", "", "Lfh/a;", "toBarcodeResult", "(Ljava/util/List;)Lcom/onfido/android/sdk/capture/validation/device/BarcodeValidationResult;", "result", "onSuccessIfNotDisposed", "(Lio/reactivex/rxjava3/core/SingleEmitter;Lcom/onfido/android/sdk/capture/validation/device/BarcodeValidationResult;)V", "documentFrame", "Lio/reactivex/rxjava3/core/Single;", "detect", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Z)Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/javax/inject/Provider;", "barcodeDetector$delegate", "Lkotlin/Lazy;", "getBarcodeDetector", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeDetector", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BarcodeDetectorGoogle implements BarcodeDetector {

    @NotNull
    private static final BarcodeValidationResult OMITTED_FRAME_ANALYSE_RESULT = new BarcodeValidationResult(0 == true ? 1 : 0, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: barcodeDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy barcodeDetector;

    @NotNull
    private final Provider barcodeDetectorProvider;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.detector.barcode.BarcodeDetectorGoogle$processImage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lfh/a;", "barcodeVisionList", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends u implements Function1<List<fh.a>, Unit> {
        final /* synthetic */ SingleEmitter $emitter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleEmitter singleEmitter) {
            super(1);
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((List<fh.a>) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull List<fh.a> barcodeVisionList) {
            Intrinsics.checkNotNullParameter(barcodeVisionList, "barcodeVisionList");
            BarcodeDetectorGoogle.this.onSuccessIfNotDisposed(this.$emitter, BarcodeDetectorGoogle.this.toBarcodeResult(barcodeVisionList));
        }
    }

    public BarcodeDetectorGoogle(@NotNull OnfidoRemoteConfig remoteConfig, @NotNull Provider barcodeDetectorProvider) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(barcodeDetectorProvider, "barcodeDetectorProvider");
        this.remoteConfig = remoteConfig;
        this.barcodeDetectorProvider = barcodeDetectorProvider;
        this.barcodeDetector = j.b(new BarcodeDetectorGoogle$barcodeDetector$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$0(BarcodeDetectorGoogle this$0, DocumentDetectionFrame documentFrame, boolean z, SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(documentFrame, "$documentFrame");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            this$0.processImage(this$0.toInputImage(documentFrame, z), emitter);
        } catch (Exception unused) {
            this$0.onSuccessIfNotDisposed(emitter, OMITTED_FRAME_ANALYSE_RESULT);
        }
    }

    private BarcodeScanner getBarcodeDetector() {
        Object value = this.barcodeDetector.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BarcodeScanner) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessIfNotDisposed(SingleEmitter singleEmitter, BarcodeValidationResult barcodeValidationResult) {
        if (singleEmitter.isDisposed()) {
            return;
        }
        singleEmitter.onSuccess(barcodeValidationResult);
    }

    private void processImage(InputImage firebaseImage, SingleEmitter emitter) {
        getBarcodeDetector().process(firebaseImage).addOnSuccessListener(new o(6, new AnonymousClass1(emitter))).addOnFailureListener(new c(this, emitter, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processImage$lambda$1(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processImage$lambda$2(BarcodeDetectorGoogle this$0, SingleEmitter emitter, Exception it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it8, "it");
        this$0.onSuccessIfNotDisposed(emitter, OMITTED_FRAME_ANALYSE_RESULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BarcodeValidationResult toBarcodeResult(List<? extends fh.a> list) {
        StringBuilder sb6 = new StringBuilder();
        if (!list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                String strA = ((fh.a) it8.next()).f135117a.a();
                if (strA != null) {
                    sb6.append(strA);
                }
            }
        }
        return !d0.W(sb6) ? new BarcodeValidationResult(sb6.toString(), true) : OMITTED_FRAME_ANALYSE_RESULT;
    }

    private InputImage toInputImage(DocumentDetectionFrame documentDetectionFrame, boolean z) {
        return z ? DocumentDetectionExtensionKt.toInputImageFromYuv(documentDetectionFrame) : DocumentDetectionExtensionKt.toInputImageFromJpeg$default(documentDetectionFrame, 0, this.remoteConfig.getDocumentPostCaptureValidationTargetWidth(), 1, null);
    }

    @Override // com.onfido.android.sdk.capture.detector.barcode.BarcodeDetector
    @NotNull
    public synchronized Single<BarcodeValidationResult> detect(@NotNull DocumentDetectionFrame documentFrame, boolean isRealtimeAnalysis) {
        b bVar;
        Intrinsics.checkNotNullParameter(documentFrame, "documentFrame");
        bVar = new b(new a(this, documentFrame, isRealtimeAnalysis), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
