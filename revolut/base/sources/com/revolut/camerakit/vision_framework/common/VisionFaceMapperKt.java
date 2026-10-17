package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.Bbox;
import com.revolut.camerakit.vision_framework.generated.Face;
import com.revolut.camerakit.vision_framework.generated.Point2f;
import e10.a;
import e10.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x9m.b;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le10/j;", "Lcom/revolut/camerakit/vision_framework/generated/Face;", "toFrameworkFace", "(Le10/j;)Lcom/revolut/camerakit/vision_framework/generated/Face;", "Le10/a;", "Lcom/revolut/camerakit/vision_framework/generated/Bbox;", "toFrameworkBbox", "(Le10/a;)Lcom/revolut/camerakit/vision_framework/generated/Bbox;", "toVisionBbox", "(Lcom/revolut/camerakit/vision_framework/generated/Bbox;)Le10/a;", "toVisionFace", "(Lcom/revolut/camerakit/vision_framework/generated/Face;)Le10/j;", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class VisionFaceMapperKt {
    @NotNull
    public static final Bbox toFrameworkBbox(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Bbox(aVar.f121791a, aVar.f121792b, aVar.f121793c, aVar.d);
    }

    @NotNull
    public static final Face toFrameworkFace(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Bbox frameworkBbox = toFrameworkBbox(jVar.f121815a);
        float f = jVar.f121816b;
        ArrayList<b> arrayList = jVar.f121817c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (b bVar : arrayList) {
            arrayList2.add(new Point2f(bVar.f303748a, bVar.f303749b));
        }
        return new Face(frameworkBbox, f, new ArrayList(arrayList2));
    }

    @NotNull
    public static final a toVisionBbox(@NotNull Bbox bbox) {
        Intrinsics.checkNotNullParameter(bbox, "<this>");
        return new a(bbox.getX1(), bbox.getY1(), bbox.getX2(), bbox.getY2());
    }

    @NotNull
    public static final j toVisionFace(@NotNull Face face) {
        Intrinsics.checkNotNullParameter(face, "<this>");
        Bbox boundingBox = face.getBoundingBox();
        Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
        a visionBbox = toVisionBbox(boundingBox);
        float confidence = face.getConfidence();
        ArrayList<Point2f> kps = face.getKps();
        Intrinsics.checkNotNullExpressionValue(kps, "getKps(...)");
        ArrayList arrayList = new ArrayList(w.t(kps, 10));
        for (Point2f point2f : kps) {
            arrayList.add(new b(point2f.getX(), point2f.getY()));
        }
        return new j(visionBbox, confidence, arrayList);
    }
}
