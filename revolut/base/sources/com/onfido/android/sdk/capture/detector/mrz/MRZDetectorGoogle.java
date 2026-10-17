package com.onfido.android.sdk.capture.detector.mrz;

import a31.o;
import ag.p;
import android.graphics.Bitmap;
import cmc.d;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.a;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.validation.DocumentCodeValidator;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import rh.f;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrz/MRZDetectorGoogle;", "Lcom/onfido/android/sdk/capture/detector/mrz/MRZDetector;", "()V", "detect", "Lio/reactivex/rxjava3/core/Single;", "", "frame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "validator", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidator;", "addSuccessAndFailureListeners", "", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/mlkit/vision/text/Text;", "emitter", "Lio/reactivex/rxjava3/core/SingleEmitter;", "textRecognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MRZDetectorGoogle implements MRZDetector {

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.detector.mrz.MRZDetectorGoogle$addSuccessAndFailureListeners$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "recognitionResult", "Lcom/google/mlkit/vision/text/Text;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<Text, Unit> {
        final /* synthetic */ SingleEmitter $emitter;
        final /* synthetic */ DocumentCodeValidator $validator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DocumentCodeValidator documentCodeValidator, SingleEmitter singleEmitter) {
            super(1);
            this.$validator = documentCodeValidator;
            this.$emitter = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Text) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Text text) {
            DocumentCodeValidator documentCodeValidator = this.$validator;
            String str = text.f49675b;
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            this.$emitter.onSuccess(Boolean.valueOf(documentCodeValidator.validate(str).getSuccess()));
        }
    }

    private final void addSuccessAndFailureListeners(Task<Text> task, DocumentCodeValidator documentCodeValidator, SingleEmitter singleEmitter, TextRecognizer textRecognizer) {
        task.addOnSuccessListener(new o(9, new AnonymousClass1(documentCodeValidator, singleEmitter)));
        task.addOnFailureListener(new a(singleEmitter, 1));
        task.addOnCompleteListener(new d(textRecognizer, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSuccessAndFailureListeners$lambda$1(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSuccessAndFailureListeners$lambda$2(SingleEmitter emitter, Exception it8) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it8, "it");
        emitter.onSuccess(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSuccessAndFailureListeners$lambda$3(TextRecognizer textRecognizer, Task it8) {
        Intrinsics.checkNotNullParameter(textRecognizer, "$textRecognizer");
        Intrinsics.checkNotNullParameter(it8, "it");
        textRecognizer.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$0(DocumentDetectionFrame frame, MRZDetectorGoogle this$0, DocumentCodeValidator validator, SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(frame, "$frame");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(validator, "$validator");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        f fVarG = g4i.a.g(new th.a());
        Intrinsics.checkNotNullExpressionValue(fVarG, "getClient(...)");
        Bitmap bitmapDecodeScaledResource$default = ImageUtils.decodeScaledResource$default(new ImageUtils(), frame.getYuv(), frame.getFrameWidth(), frame.getFrameWidth(), null, null, 24, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeScaledResource$default, frame.getOuterFrame().getLeft(), frame.getOuterFrame().getTop(), frame.getOuterFrame().getWidth(), frame.getOuterFrame().getHeight());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapDecodeScaledResource$default.recycle();
        Task<Text> taskD = fVarG.d(InputImage.a(bitmapCreateBitmap, 0));
        Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
        this$0.addSuccessAndFailureListeners(taskD, validator, emitter, fVarG);
    }

    @Override // com.onfido.android.sdk.capture.detector.mrz.MRZDetector
    @NotNull
    public Single<Boolean> detect(@NotNull DocumentDetectionFrame frame, @NotNull DocumentCodeValidator validator) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(validator, "validator");
        b bVar = new b(new p(frame, 3, this, validator), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
