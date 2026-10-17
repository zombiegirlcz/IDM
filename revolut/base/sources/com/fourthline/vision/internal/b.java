package com.fourthline.vision.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import com.fourthline.vision.internal.h6;
import com.google.mlkit.vision.face.FaceDetector;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull FaceDetector detector, @NotNull v9 playServicesAvailable) {
        super(detector, playServicesAvailable);
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailable, "playServicesAvailable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List detect$lambda$0(b bVar, List it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return bVar.toAccurateDetections(it8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    private final List<h6.a> toAccurateDetections(List<? extends mh.a> list) {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (mh.a aVar : list) {
            Rect rect = aVar.f205333a;
            Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
            fa faceBox = toFaceBox(rect);
            boolean zAreEyesOpen = areEyesOpen(aVar);
            mh.b bVar = (mh.b) aVar.f205338j.get(1);
            if (bVar != null) {
                ArrayList<PointF> arrayList3 = bVar.f205340b;
                arrayList = new ArrayList(zhm.w.t(arrayList3, 10));
                for (PointF pointF : arrayList3) {
                    arrayList.add(new PointF(pointF.x, pointF.y));
                }
            } else {
                arrayList = zhm.f0.f322471a;
            }
            arrayList2.add(new h6.a(faceBox, zAreEyesOpen, arrayList));
        }
        return arrayList2;
    }

    @Override // com.fourthline.vision.internal.c9, com.fourthline.vision.internal.j2
    public /* bridge */ /* synthetic */ Object detect(u6 u6Var, Continuation continuation) {
        return detect((f9) u6Var, (Continuation<? super List<h6.a>>) continuation);
    }

    public Object detect(@NotNull f9 f9Var, @NotNull Continuation<? super List<h6.a>> continuation) {
        return awaitDetection(f9Var, new eg(this, 0), continuation);
    }
}
