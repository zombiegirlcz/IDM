package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.fourthline.vision.internal.h6;
import com.google.mlkit.vision.face.FaceDetector;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class q6 extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(@NotNull FaceDetector detector, @NotNull v9 playServicesAvailable) {
        super(detector, playServicesAvailable);
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(playServicesAvailable, "playServicesAvailable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List detect$lambda$0(q6 q6Var, List it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return q6Var.toFastDetections(it8);
    }

    private final List<h6.b> toFastDetections(List<? extends mh.a> list) {
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (mh.a aVar : list) {
            Rect rect = aVar.f205333a;
            Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
            arrayList.add(new h6.b(toFaceBox(rect), areEyesOpen(aVar), aVar.f205336g, aVar.f));
        }
        return arrayList;
    }

    @Override // com.fourthline.vision.internal.c9, com.fourthline.vision.internal.j2
    public /* bridge */ /* synthetic */ Object detect(u6 u6Var, Continuation continuation) {
        return detect((f9) u6Var, (Continuation<? super List<h6.b>>) continuation);
    }

    public Object detect(@NotNull f9 f9Var, @NotNull Continuation<? super List<h6.b>> continuation) {
        return awaitDetection(f9Var, new eg(this, 8), continuation);
    }
}
