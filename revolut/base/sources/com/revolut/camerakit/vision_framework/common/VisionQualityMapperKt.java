package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.Quality;
import com.revolut.camerakit.vision_framework.generated.QualityCheck;
import e10.s;
import e10.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/camerakit/vision_framework/generated/Quality;", "Le10/s;", "toVisionQuality", "(Lcom/revolut/camerakit/vision_framework/generated/Quality;)Le10/s;", "Lcom/revolut/camerakit/vision_framework/generated/QualityCheck;", "Le10/t;", "toVisionQualityCheck", "(Lcom/revolut/camerakit/vision_framework/generated/QualityCheck;)Le10/t;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class VisionQualityMapperKt {
    @NotNull
    public static final s toVisionQuality(@NotNull Quality quality) {
        Intrinsics.checkNotNullParameter(quality, "<this>");
        QualityCheck dark = quality.getDark();
        Intrinsics.checkNotNullExpressionValue(dark, "getDark(...)");
        t visionQualityCheck = toVisionQualityCheck(dark);
        QualityCheck darkContour = quality.getDarkContour();
        Intrinsics.checkNotNullExpressionValue(darkContour, "getDarkContour(...)");
        t visionQualityCheck2 = toVisionQualityCheck(darkContour);
        QualityCheck bright = quality.getBright();
        Intrinsics.checkNotNullExpressionValue(bright, "getBright(...)");
        t visionQualityCheck3 = toVisionQualityCheck(bright);
        QualityCheck blur = quality.getBlur();
        Intrinsics.checkNotNullExpressionValue(blur, "getBlur(...)");
        t visionQualityCheck4 = toVisionQualityCheck(blur);
        QualityCheck glare = quality.getGlare();
        Intrinsics.checkNotNullExpressionValue(glare, "getGlare(...)");
        t visionQualityCheck5 = toVisionQualityCheck(glare);
        QualityCheck colorized = quality.getColorized();
        Intrinsics.checkNotNullExpressionValue(colorized, "getColorized(...)");
        t visionQualityCheck6 = toVisionQualityCheck(colorized);
        QualityCheck fraud = quality.getFraud();
        Intrinsics.checkNotNullExpressionValue(fraud, "getFraud(...)");
        t visionQualityCheck7 = toVisionQualityCheck(fraud);
        QualityCheck leftEye = quality.getLeftEye();
        Intrinsics.checkNotNullExpressionValue(leftEye, "getLeftEye(...)");
        t visionQualityCheck8 = toVisionQualityCheck(leftEye);
        QualityCheck rightEye = quality.getRightEye();
        Intrinsics.checkNotNullExpressionValue(rightEye, "getRightEye(...)");
        t visionQualityCheck9 = toVisionQualityCheck(rightEye);
        QualityCheck occluded = quality.getOccluded();
        Intrinsics.checkNotNullExpressionValue(occluded, "getOccluded(...)");
        t visionQualityCheck10 = toVisionQualityCheck(occluded);
        QualityCheck sunglasses = quality.getSunglasses();
        Intrinsics.checkNotNullExpressionValue(sunglasses, "getSunglasses(...)");
        return new s(visionQualityCheck, visionQualityCheck2, visionQualityCheck3, visionQualityCheck4, visionQualityCheck5, visionQualityCheck6, visionQualityCheck7, visionQualityCheck8, visionQualityCheck9, visionQualityCheck10, toVisionQualityCheck(sunglasses));
    }

    @NotNull
    public static final t toVisionQualityCheck(@NotNull QualityCheck qualityCheck) {
        Intrinsics.checkNotNullParameter(qualityCheck, "<this>");
        return new t(qualityCheck.getValid(), qualityCheck.getConfidence());
    }
}
