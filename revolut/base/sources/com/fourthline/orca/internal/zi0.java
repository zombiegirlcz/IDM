package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.yi0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zi0 {
    private static final ea a(Map map, String str) {
        di0 di0Var = (di0) map.get(str);
        return di0Var != null ? new ea(di0Var.getLight(), di0Var.getDark(), null) : ea.INSTANCE.a();
    }

    public static final ea b(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return a(map, "primary");
    }

    public static final ea c(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return a(map, "success");
    }

    public static final ea d(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return a(map, "warning");
    }

    public static final ea a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return a(map, "error");
    }

    public static final ea a(yi0.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Color.Companion companion = Color.INSTANCE;
        return new ea(companion.m1987getBlack0d7_KjU(), companion.m1995getWhite0d7_KjU(), null);
    }

    public static final ea a(yi0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return ea.INSTANCE.a(Color.m1976copywmQWz5c$default(ColorKt.Color(4281545523L), 0.9f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
    }

    public static final gf0 a(yi0 yi0Var) {
        Intrinsics.checkNotNullParameter(yi0Var, "<this>");
        Color.Companion companion = Color.INSTANCE;
        return new gf0(new ea(companion.m1995getWhite0d7_KjU(), ColorKt.Color(4278650916L), null), new a81(yi0Var.getIb.b.Scanner java.lang.String().getMessage().getTypography(), new ea(ColorKt.Color(4283979864L), companion.m1995getWhite0d7_KjU(), null)), new br0(yi0Var.getGraphic().getSpinner().getHighlight(), new ar0(new ea(ColorKt.Color(4292598747L), Color.m1976copywmQWz5c$default(companion.m1995getWhite0d7_KjU(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null), 1.0f)), ea.INSTANCE.a(ColorKt.Color(4288124823L)));
    }

    public static final float a(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-937844263, i2, -1, "com.fourthline.orca.core.internal.styling.toPx (OrcaStyling.kt:286)");
        }
        float fMo768toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo768toPx0680j_4(Dp.m3297constructorimpl(i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo768toPx0680j_4;
    }
}
