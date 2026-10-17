package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorResult;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.Detection;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.CoordinatesTransformer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.YawAngleCalculator;
import com.onfido.android.sdk.capture.internal.util.OnfidoPointF;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J&\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcTfliteResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/Detection;", "coordinatesTransformer", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/CoordinatesTransformer;", "yawAngleCalculator", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/YawAngleCalculator;", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/CoordinatesTransformer;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/util/YawAngleCalculator;)V", "adjustFaceRect", "", "face", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "getFaceLandmarks", "", "faceDetectionRect", "previewRect", "mapToFaceDetectorResult", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "result", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceDetectorAvcTfliteResultMapper implements FaceDetectorAvcResultMapper<Detection> {
    private static final float FACE_RECT_SCALE_FACTOR = 0.95f;
    private static final float FACE_RECT_Y_TRANSLATION_SCALE_FACTOR = -0.15f;

    @NotNull
    private final CoordinatesTransformer coordinatesTransformer;

    @NotNull
    private final YawAngleCalculator yawAngleCalculator;

    public FaceDetectorAvcTfliteResultMapper(@NotNull CoordinatesTransformer coordinatesTransformer, @NotNull YawAngleCalculator yawAngleCalculator) {
        Intrinsics.checkNotNullParameter(coordinatesTransformer, "coordinatesTransformer");
        Intrinsics.checkNotNullParameter(yawAngleCalculator, "yawAngleCalculator");
        this.coordinatesTransformer = coordinatesTransformer;
        this.yawAngleCalculator = yawAngleCalculator;
    }

    private final void adjustFaceRect(OnfidoRectF face) {
        face.offset(BitmapDescriptorFactory.HUE_RED, face.width() * FACE_RECT_Y_TRANSLATION_SCALE_FACTOR);
        face.scaleAboutCenter(FACE_RECT_SCALE_FACTOR);
    }

    private final List<OnfidoRectF> getFaceLandmarks(Detection face, OnfidoRectF faceDetectionRect, OnfidoRectF previewRect) {
        List listK = v.k(face.getLeftEye(), face.getRightEye(), face.getNose(), face.getMouth(), face.getLeftEar(), face.getRightEar());
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.coordinatesTransformer.toPreviewCoordinates(OnfidoPointF.convertToRectF$default((OnfidoPointF) it8.next(), 1.0f, BitmapDescriptorFactory.HUE_RED, 2, null), faceDetectionRect, previewRect));
        }
        return arrayList;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapper
    @NotNull
    public FaceDetectorResult mapToFaceDetectorResult(@NotNull List<? extends Detection> result, @NotNull OnfidoRectF faceDetectionRect, @NotNull OnfidoRectF previewRect) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(faceDetectionRect, "faceDetectionRect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        if (result.isEmpty()) {
            return FaceDetectorResult.FaceNotDetected.INSTANCE;
        }
        Detection detection = (Detection) d0.b0(result);
        adjustFaceRect(detection.getFace());
        return new FaceDetectorResult.FaceDetected(this.coordinatesTransformer.toPreviewCoordinates(detection.getFace(), faceDetectionRect, previewRect), this.yawAngleCalculator.calculate(detection.getLeftEye(), detection.getRightEye(), detection.getLeftEar(), detection.getRightEar()), getFaceLandmarks(detection, faceDetectionRect, previewRect));
    }
}
