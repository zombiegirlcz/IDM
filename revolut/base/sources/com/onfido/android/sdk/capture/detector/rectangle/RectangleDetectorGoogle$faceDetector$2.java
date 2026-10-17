package com.onfido.android.sdk.capture.detector.rectangle;

import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/mlkit/vision/face/FaceDetector;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RectangleDetectorGoogle$faceDetector$2 extends u implements Function0<FaceDetector> {
    public static final RectangleDetectorGoogle$faceDetector$2 INSTANCE = new RectangleDetectorGoogle$faceDetector$2();

    public RectangleDetectorGoogle$faceDetector$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FaceDetector invoke() {
        FaceDetectorOptions faceDetectorOptions = new FaceDetectorOptions(1, 1, 2, 1, 0.1f);
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptions, "build(...)");
        return pd.b.f(faceDetectorOptions);
    }
}
