package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.DocClassifierConfidence;
import com.revolut.camerakit.vision_framework.generated.DocClassifierPrediction;
import com.revolut.camerakit.vision_framework.generated.DocClassifierResult;
import e10.c;
import e10.d;
import e10.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/camerakit/vision_framework/generated/DocClassifierResult;", "Le10/e;", "toVisionDocClassifierResult", "(Lcom/revolut/camerakit/vision_framework/generated/DocClassifierResult;)Le10/e;", "Lcom/revolut/camerakit/vision_framework/generated/DocClassifierPrediction;", "Le10/d;", "toVisionDocClassifierPrediction", "(Lcom/revolut/camerakit/vision_framework/generated/DocClassifierPrediction;)Le10/d;", "Lcom/revolut/camerakit/vision_framework/generated/DocClassifierConfidence;", "Le10/c;", "toVisionDocClassifierConfidence", "(Lcom/revolut/camerakit/vision_framework/generated/DocClassifierConfidence;)Le10/c;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DocClassifierResultMapperKt {
    private static final c toVisionDocClassifierConfidence(DocClassifierConfidence docClassifierConfidence) {
        return new c(docClassifierConfidence.getCountry(), docClassifierConfidence.getDocumentType(), docClassifierConfidence.getSide(), docClassifierConfidence.getValidity());
    }

    private static final d toVisionDocClassifierPrediction(DocClassifierPrediction docClassifierPrediction) {
        String country = docClassifierPrediction.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        String documentType = docClassifierPrediction.getDocumentType();
        Intrinsics.checkNotNullExpressionValue(documentType, "getDocumentType(...)");
        String side = docClassifierPrediction.getSide();
        Intrinsics.checkNotNullExpressionValue(side, "getSide(...)");
        return new d(country, documentType, side, docClassifierPrediction.getValidity());
    }

    @NotNull
    public static final e toVisionDocClassifierResult(@NotNull DocClassifierResult docClassifierResult) {
        Intrinsics.checkNotNullParameter(docClassifierResult, "<this>");
        DocClassifierPrediction prediction = docClassifierResult.getPrediction();
        Intrinsics.checkNotNullExpressionValue(prediction, "getPrediction(...)");
        d visionDocClassifierPrediction = toVisionDocClassifierPrediction(prediction);
        DocClassifierConfidence confidence = docClassifierResult.getConfidence();
        Intrinsics.checkNotNullExpressionValue(confidence, "getConfidence(...)");
        return new e(visionDocClassifierPrediction, toVisionDocClassifierConfidence(confidence));
    }
}
