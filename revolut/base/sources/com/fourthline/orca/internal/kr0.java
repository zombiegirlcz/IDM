package com.fourthline.orca.internal;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class kr0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, Rect rect, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(j2, rect, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r18, final androidx.compose.ui.geometry.Rect r20, boolean r21, final kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.kr0.a(long, androidx.compose.ui.geometry.Rect, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Color.Companion companion = Color.INSTANCE;
        long jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(companion.m1987getBlack0d7_KjU(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        long jM1993getTransparent0d7_KjU = companion.m1993getTransparent0d7_KjU();
        Brush.Companion companion2 = Brush.INSTANCE;
        DrawScope.m2206drawRectAsUm42w$default(drawBehind, Brush.Companion.m1960verticalGradient8A3gB4$default(companion2, zhm.v.k(Color.m1972boximpl(jM1976copywmQWz5c$default), Color.m1972boximpl(jM1993getTransparent0d7_KjU)), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.4f, 0, 10, null), 0L, Size.m1864copyxjbvk4A$default(drawBehind.mo2212getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.4f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
        DrawScope.m2206drawRectAsUm42w$default(drawBehind, Brush.Companion.m1960verticalGradient8A3gB4$default(companion2, zhm.v.k(Color.m1972boximpl(jM1993getTransparent0d7_KjU), Color.m1972boximpl(jM1976copywmQWz5c$default)), 0.7f * Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)), 0, 8, null), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.6f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32)), Size.m1864copyxjbvk4A$default(drawBehind.mo2212getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.4f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Rect rect, Function2 function2, SolidColor solidColor, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286734727, i, -1, "com.fourthline.orca.core.internal.composable.Punchhole.<anonymous> (Punchhole.kt:68)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composer.changed(rect);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jn1(solidColor, rect, 13);
                composer.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composer, 6);
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SolidColor solidColor, Rect rect, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m2206drawRectAsUm42w$default(Canvas, solidColor, rect.m1851getTopLeftF1C5BW0(), rect.m1850getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, null, null, BlendMode.INSTANCE.m1927getClear0nO6VwU(), 56, null);
        return Unit.f186387a;
    }
}
