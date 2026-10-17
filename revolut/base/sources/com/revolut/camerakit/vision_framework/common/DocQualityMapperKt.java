package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.DocImageQualityConfig;
import com.revolut.camerakit.vision_framework.generated.DocImageQualityResult;
import com.revolut.camerakit.vision_framework.generated.DocImageQualityThreasholds;
import com.revolut.camerakit.vision_framework.generated.QualityCheck;
import e10.f;
import e10.g;
import e10.h;
import e10.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le10/f;", "Lcom/revolut/camerakit/vision_framework/generated/DocImageQualityConfig;", "toFrameworkDocQualityConfig", "(Le10/f;)Lcom/revolut/camerakit/vision_framework/generated/DocImageQualityConfig;", "Lcom/revolut/camerakit/vision_framework/generated/DocImageQualityResult;", "Le10/g;", "toVisionDocQualityResult", "(Lcom/revolut/camerakit/vision_framework/generated/DocImageQualityResult;)Le10/g;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DocQualityMapperKt {
    @NotNull
    public static final DocImageQualityConfig toFrameworkDocQualityConfig(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        h hVar = fVar.f121805a;
        return new DocImageQualityConfig(new DocImageQualityThreasholds(hVar.f121809a, hVar.f121810b, hVar.f121811c, hVar.d));
    }

    @NotNull
    public static final g toVisionDocQualityResult(@NotNull DocImageQualityResult docImageQualityResult) {
        Intrinsics.checkNotNullParameter(docImageQualityResult, "<this>");
        QualityCheck blur = docImageQualityResult.getBlur();
        Intrinsics.checkNotNullExpressionValue(blur, "getBlur(...)");
        t visionQualityCheck = VisionQualityMapperKt.toVisionQualityCheck(blur);
        QualityCheck dark = docImageQualityResult.getDark();
        Intrinsics.checkNotNullExpressionValue(dark, "getDark(...)");
        t visionQualityCheck2 = VisionQualityMapperKt.toVisionQualityCheck(dark);
        QualityCheck bright = docImageQualityResult.getBright();
        Intrinsics.checkNotNullExpressionValue(bright, "getBright(...)");
        t visionQualityCheck3 = VisionQualityMapperKt.toVisionQualityCheck(bright);
        QualityCheck glare = docImageQualityResult.getGlare();
        Intrinsics.checkNotNullExpressionValue(glare, "getGlare(...)");
        return new g(visionQualityCheck, visionQualityCheck2, visionQualityCheck3, VisionQualityMapperKt.toVisionQualityCheck(glare));
    }
}
