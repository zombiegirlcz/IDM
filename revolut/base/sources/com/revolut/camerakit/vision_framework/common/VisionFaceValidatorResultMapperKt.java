package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.FaceValidatorResult;
import com.revolut.camerakit.vision_framework.generated.HeadRotationResult;
import com.revolut.camerakit.vision_framework.generated.Quality;
import e10.l;
import e10.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/vision_framework/generated/FaceValidatorResult;", "Le10/l;", "toVisionFaceValidatorResult", "(Lcom/revolut/camerakit/vision_framework/generated/FaceValidatorResult;)Le10/l;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class VisionFaceValidatorResultMapperKt {
    @NotNull
    public static final l toVisionFaceValidatorResult(@NotNull FaceValidatorResult faceValidatorResult) {
        Intrinsics.checkNotNullParameter(faceValidatorResult, "<this>");
        Quality quality = faceValidatorResult.getQuality();
        Intrinsics.checkNotNullExpressionValue(quality, "getQuality(...)");
        s visionQuality = VisionQualityMapperKt.toVisionQuality(quality);
        HeadRotationResult headRotation = faceValidatorResult.getHeadRotation();
        Intrinsics.checkNotNullExpressionValue(headRotation, "getHeadRotation(...)");
        return new l(visionQuality, VisionHeadRotationResultMapperKt.toVisionHeadRotationResult(headRotation));
    }
}
