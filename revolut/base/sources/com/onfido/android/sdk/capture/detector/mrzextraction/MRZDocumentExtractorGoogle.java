package com.onfido.android.sdk.capture.detector.mrzextraction;

import android.graphics.Rect;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import gim.c;
import gim.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractorGoogle;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;", "textRecognizerProvider", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/TextRecognizerProvider;", "(Lcom/onfido/android/sdk/capture/detector/mrzextraction/TextRecognizerProvider;)V", "mrzParser", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZParser;", "shouldProcessNextFrame", "Ljava/util/concurrent/atomic/AtomicBoolean;", "textRecognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "getTextRecognizer", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textRecognizer$delegate", "Lkotlin/Lazy;", "detect", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZResult;", "documentDetectionFrame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findLinesCorrespondTo", "", "Lcom/google/mlkit/vision/text/Text$Line;", "givenLine", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MRZDocumentExtractorGoogle implements MRZDocumentExtractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ROTATION_MULTIPLIER = 90;

    @NotNull
    private final MRZParser mrzParser;

    @NotNull
    private AtomicBoolean shouldProcessNextFrame;

    /* JADX INFO: renamed from: textRecognizer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textRecognizer;

    @NotNull
    private final TextRecognizerProvider textRecognizerProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractorGoogle$Companion;", "", "()V", "ROTATION_MULTIPLIER", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractorGoogle$detect$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractorGoogle", f = "MRZDocumentExtractorGoogle.kt", l = {34}, m = "detect")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return MRZDocumentExtractorGoogle.this.detect(null, this);
        }
    }

    public MRZDocumentExtractorGoogle(@NotNull TextRecognizerProvider textRecognizerProvider) {
        Intrinsics.checkNotNullParameter(textRecognizerProvider, "textRecognizerProvider");
        this.textRecognizerProvider = textRecognizerProvider;
        this.textRecognizer = j.b(new MRZDocumentExtractorGoogle$textRecognizer$2(this));
        this.mrzParser = new MRZParser();
        this.shouldProcessNextFrame = new AtomicBoolean(true);
    }

    private final List<Text.Line> findLinesCorrespondTo(List<? extends Text.Line> list, Text.Line line) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Rect rect2 = (Rect) ((Text.Line) obj2).f151344b;
            if (rect2 != null && (rect = (Rect) line.f151344b) != null) {
                int iHeight = (rect2.height() / 2) + rect2.top;
                int i = rect2.bottom;
                int i2 = rect.bottom;
                boolean z = false;
                boolean z3 = iHeight <= i2 && i2 <= i;
                int i3 = rect2.top;
                int iHeight2 = i - (rect2.height() / 2);
                int i5 = rect.top;
                if (i3 <= i5 && i5 <= iHeight2) {
                    z = true;
                }
                if (z3 || z) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    private final TextRecognizer getTextRecognizer() {
        return (TextRecognizer) this.textRecognizer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractorGoogle$detect$1, gim.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object detect(@org.jetbrains.annotations.NotNull com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractorGoogle.detect(com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
