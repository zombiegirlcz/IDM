package com.fourthline.vision.internal;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class q0 {
    @NotNull
    public static final u rememberCameraXEngine(@NotNull CameraSelector cameraSelector, Integer num, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(990334590, i, -1, "com.fourthline.visionx.internal.camera.rememberCameraXEngine (CameraXEngine.kt:388)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.g.f186406a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj2 = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            p0 p0Var = new p0(context, cameraSelector, coroutineScope);
            if (num != null) {
                p0Var.setVideoRecordingBitrate(num.intValue());
            }
            composer.updateRememberedValue(p0Var);
            obj2 = p0Var;
        }
        p0 p0Var2 = (p0) obj2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return p0Var2;
    }
}
