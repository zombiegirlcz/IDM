package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class pe1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, String str2, z10 z10Var, Bitmap bitmap, int i, p70 p70Var, boolean z, int i2, int i3, Composer composer, int i5) {
        a(str, str2, z10Var, bitmap, i, p70Var, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r17, final java.lang.String r18, final com.fourthline.orca.internal.z10 r19, final android.graphics.Bitmap r20, final int r21, final com.fourthline.orca.internal.p70 r22, boolean r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pe1.a(java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, android.graphics.Bitmap, int, com.fourthline.orca.internal.p70, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, Bitmap bitmap, boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665983000, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:36)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m613backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m1987getBlack0d7_KjU(), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            if (z) {
                modifierFillMaxSize$default = ScaleKt.scale(modifierFillMaxSize$default, -1.0f, 1.0f);
            }
            boolean zChanged = composer.changed(i);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ij1(i, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            ImageKt.m647Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default, (Function1) objRememberedValue), null, ContentScale.INSTANCE.getFit(), 0.75f, null, 0, composer, 221232, 200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(i);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, ColumnScope it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(454070337, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:58)");
            }
            qz0.a(PaddingKt.m866paddingqDBjuR0$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(32), 7, null), str, str, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p70 p70Var, String str, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2114281259, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerUploadScreen.<anonymous> (VisionScannerUploadScreen.kt:66)");
            }
            j21.a(null, null, p70Var, str, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
