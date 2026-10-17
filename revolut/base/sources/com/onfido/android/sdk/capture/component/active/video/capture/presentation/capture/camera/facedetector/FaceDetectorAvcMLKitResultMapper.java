package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import android.graphics.Rect;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorResult;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.CoordinatesTransformer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.MovingAverage;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcMLKitResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lmh/a;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/CoordinatesTransformer;", "coordinatesTransformer", "<init>", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/CoordinatesTransformer;)V", "", "result", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "faceDetectionRect", "previewRect", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "mapToFaceDetectorResult", "(Ljava/util/List;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/CoordinatesTransformer;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/MovingAverage;", "yawAngleMovingAverage", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/MovingAverage;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceDetectorAvcMLKitResultMapper implements FaceDetectorAvcResultMapper<mh.a> {
    private static final float FACE_RECT_SCALE_FACTOR = 0.84f;
    private static final int YAW_ANGLE_MOVING_AVERAGE_SIZE = 3;

    @NotNull
    private final CoordinatesTransformer coordinatesTransformer;

    @NotNull
    private final MovingAverage yawAngleMovingAverage;

    public FaceDetectorAvcMLKitResultMapper(@NotNull CoordinatesTransformer coordinatesTransformer) {
        Intrinsics.checkNotNullParameter(coordinatesTransformer, "coordinatesTransformer");
        this.coordinatesTransformer = coordinatesTransformer;
        this.yawAngleMovingAverage = new MovingAverage(3);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapper
    @NotNull
    public FaceDetectorResult mapToFaceDetectorResult(@NotNull List<? extends mh.a> result, @NotNull OnfidoRectF faceDetectionRect, @NotNull OnfidoRectF previewRect) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(faceDetectionRect, "faceDetectionRect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        if (result.isEmpty()) {
            return FaceDetectorResult.FaceNotDetected.INSTANCE;
        }
        mh.a aVar = (mh.a) d0.b0(result);
        CoordinatesTransformer coordinatesTransformer = this.coordinatesTransformer;
        OnfidoRectF.Companion companion = OnfidoRectF.INSTANCE;
        Rect rect = aVar.f205333a;
        Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
        return new FaceDetectorResult.FaceDetected(coordinatesTransformer.toPreviewCoordinates(companion.toOnfidoRectF(rect).scaleAboutCenter(FACE_RECT_SCALE_FACTOR), faceDetectionRect, previewRect), this.yawAngleMovingAverage.add(aVar.f205336g), null, 4, null);
    }
}
