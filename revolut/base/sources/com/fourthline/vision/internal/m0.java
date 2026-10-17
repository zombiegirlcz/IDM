package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class m0 {
    public static final void applyCameraSpecsToScannerContext(@NotNull Context context, @NotNull l0 input, @NotNull String logTag, @NotNull x6 gpuSpecsCollector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(gpuSpecsCollector, "gpuSpecsCollector");
        Object systemService = context.getSystemService("camera");
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            return;
        }
        Map<String, ? extends Object> mapCollect = new t().collect(cameraManager, input);
        Map<String, ? extends Object> mapCollect2 = gpuSpecsCollector.collect(context);
        ib.h hVar = hb.a.f150532a;
        ib.b bVarB = hVar != null ? hVar.b(ib.b.Scanner) : null;
        if (bVarB == null) {
            u9.f36980a.remember(mapCollect, mapCollect2);
        } else {
            u9.f36980a.clear();
            for (Map.Entry<String, ? extends Object> entry : mapCollect.entrySet()) {
                bVarB.set(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<String, ? extends Object> entry2 : mapCollect2.entrySet()) {
                bVarB.set(entry2.getKey(), entry2.getValue());
            }
        }
        ib.h hVar2 = hb.a.f150532a;
        ib.b bVarB2 = hVar2 != null ? hVar2.b(ib.b.Session) : null;
        if (bVarB2 != null) {
            String str = logTag + "_";
            for (Map.Entry<String, ? extends Object> entry3 : mapCollect.entrySet()) {
                String key = entry3.getKey();
                bVarB2.set(str + key, entry3.getValue());
            }
            for (Map.Entry<String, ? extends Object> entry4 : mapCollect2.entrySet()) {
                bVarB2.set(entry4.getKey(), entry4.getValue());
            }
        }
        mapCollect.size();
        mapCollect.toString();
        mapCollect2.size();
        mapCollect2.toString();
    }

    public static /* synthetic */ void applyCameraSpecsToScannerContext$default(Context context, l0 l0Var, String str, x6 x6Var, int i, Object obj2) {
        if ((i & 8) != 0) {
            x6Var = new h2();
        }
        applyCameraSpecsToScannerContext(context, l0Var, str, x6Var);
    }

    @NotNull
    public static final Function1<l0, Unit> createCameraSpecsOnReadyCallback(@NotNull Context context, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        return new com.fourthline.core.location.internal.d(context, logTag, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCameraSpecsOnReadyCallback$lambda$0(Context context, String str, l0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        applyCameraSpecsToScannerContext$default(context, input, str, null, 8, null);
        return Unit.f186387a;
    }
}
