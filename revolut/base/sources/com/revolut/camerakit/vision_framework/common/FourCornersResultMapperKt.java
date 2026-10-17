package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.DocCorner;
import com.revolut.camerakit.vision_framework.generated.DocCornersResult;
import e10.b;
import e10.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/camerakit/vision_framework/generated/DocCornersResult;", "Le10/n;", "toVisionFourCornersResult", "(Lcom/revolut/camerakit/vision_framework/generated/DocCornersResult;)Le10/n;", "Lcom/revolut/camerakit/vision_framework/generated/DocCorner;", "Le10/b;", "toVisionCorner", "(Lcom/revolut/camerakit/vision_framework/generated/DocCorner;)Le10/b;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class FourCornersResultMapperKt {
    private static final b toVisionCorner(DocCorner docCorner) {
        return new b(docCorner.getX(), docCorner.getY(), docCorner.getConfidence());
    }

    @NotNull
    public static final n toVisionFourCornersResult(@NotNull DocCornersResult docCornersResult) {
        Intrinsics.checkNotNullParameter(docCornersResult, "<this>");
        DocCorner topLeft = docCornersResult.getTopLeft();
        Intrinsics.checkNotNullExpressionValue(topLeft, "getTopLeft(...)");
        b visionCorner = toVisionCorner(topLeft);
        DocCorner topRight = docCornersResult.getTopRight();
        Intrinsics.checkNotNullExpressionValue(topRight, "getTopRight(...)");
        b visionCorner2 = toVisionCorner(topRight);
        DocCorner bottomLeft = docCornersResult.getBottomLeft();
        Intrinsics.checkNotNullExpressionValue(bottomLeft, "getBottomLeft(...)");
        b visionCorner3 = toVisionCorner(bottomLeft);
        DocCorner bottomRight = docCornersResult.getBottomRight();
        Intrinsics.checkNotNullExpressionValue(bottomRight, "getBottomRight(...)");
        return new n(visionCorner, visionCorner2, visionCorner3, toVisionCorner(bottomRight));
    }
}
