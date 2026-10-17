package com.fourthline.vision.document.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.geometry.Rect;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.internal.i5;
import com.fourthline.vision.internal.j5;
import com.fourthline.vision.internal.wg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aU\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerConfig;", "config", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "documentDetectionAreaProvider", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "controls", "Lkotlin/Function1;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "", "events", "content", "DocumentScanner", "(Lcom/fourthline/vision/document/DocumentScannerConfig;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "fourthline-vision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DocumentScannerComposableKt {
    public static final void DocumentScanner(@NotNull DocumentScannerConfig config, @NotNull Function0<Rect> documentDetectionAreaProvider, @NotNull Flow controls, @NotNull Function1<? super DocumentScannerEvent, Unit> events, @NotNull Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(documentDetectionAreaProvider, "documentDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1673517094);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(config) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(documentDetectionAreaProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(controls) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(events) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673517094, i2, -1, "com.fourthline.vision.document.compose.DocumentScanner (DocumentScannerComposable.kt:35)");
            }
            if (config.getInternalConfig().getCameraX()) {
                composerStartRestartGroup.startReplaceGroup(-232300972);
                composer2 = composerStartRestartGroup;
                i5.CameraXDocumentScanner(config, documentDetectionAreaProvider, controls, events, content, composer2, i2 & 65534);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-232191883);
                j5.LegacyDocumentScanner(config, documentDetectionAreaProvider, controls, events, content, composer2, i2 & 65534);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wg(config, documentDetectionAreaProvider, controls, events, content, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentScanner$lambda$0(DocumentScannerConfig documentScannerConfig, Function0 function0, Flow flow, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        DocumentScanner(documentScannerConfig, function0, flow, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }
}
