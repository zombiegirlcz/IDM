package com.fourthline.vision.selfie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.geometry.Rect;
import com.fourthline.orca.internal.jk1;
import com.fourthline.vision.internal.a8;
import com.fourthline.vision.internal.oc;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aW\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "config", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "faceDetectionAreaProvider", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerControl;", "controls", "Lkotlin/Function1;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "", "events", "content", "SelfieScanner", "(Lcom/fourthline/vision/selfie/SelfieScannerConfig;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "fourthline-vision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SelfieScannerComposableKt {
    public static final void SelfieScanner(SelfieScannerConfig selfieScannerConfig, @NotNull Function0<Rect> faceDetectionAreaProvider, @NotNull Flow controls, @NotNull Function1<? super SelfieScannerEvent, Unit> events, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        SelfieScannerConfig selfieScannerConfig2;
        int i3;
        SelfieScannerConfig selfieScannerConfig3;
        SelfieScannerConfig selfieScannerConfig4;
        Intrinsics.checkNotNullParameter(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1450375834);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                selfieScannerConfig2 = selfieScannerConfig;
                int i5 = composerStartRestartGroup.changedInstance(selfieScannerConfig2) ? 4 : 2;
                i3 = i5 | i;
            } else {
                selfieScannerConfig2 = selfieScannerConfig;
            }
            i3 = i5 | i;
        } else {
            selfieScannerConfig2 = selfieScannerConfig;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(faceDetectionAreaProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(controls) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(events) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                i3 &= -15;
                selfieScannerConfig2 = new SelfieScannerConfig(false, null, null, null, false, null, 63, null);
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450375834, i3, -1, "com.fourthline.vision.selfie.compose.SelfieScanner (SelfieScannerComposable.kt:36)");
            }
            if (selfieScannerConfig2.getInternalConfig().getCameraX()) {
                composerStartRestartGroup.startReplaceGroup(775808294);
                selfieScannerConfig4 = selfieScannerConfig2;
                oc.CameraXSelfieScanner(selfieScannerConfig4, faceDetectionAreaProvider, controls, events, content, composerStartRestartGroup, i3 & 65534);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                selfieScannerConfig4 = selfieScannerConfig2;
                composerStartRestartGroup.startReplaceGroup(775911431);
                a8.LegacySelfieScanner(selfieScannerConfig4, faceDetectionAreaProvider, controls, events, content, composerStartRestartGroup, i3 & 65534);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            selfieScannerConfig3 = selfieScannerConfig4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            selfieScannerConfig3 = selfieScannerConfig2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jk1(selfieScannerConfig3, faceDetectionAreaProvider, controls, events, content, i, i2, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelfieScanner$lambda$0(SelfieScannerConfig selfieScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        SelfieScanner(selfieScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }
}
