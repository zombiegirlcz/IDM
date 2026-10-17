package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import java.util.Locale;
import java.util.Map;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f29303a = CompositionLocalKt.staticCompositionLocalOf(new dl1(20));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f29304b = CompositionLocalKt.staticCompositionLocalOf(new dl1(21));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f29305c = CompositionLocalKt.staticCompositionLocalOf(new dl1(22));
    private static final ProvidableCompositionLocal d = CompositionLocalKt.staticCompositionLocalOf(new dl1(23));
    private static final ProvidableCompositionLocal e = CompositionLocalKt.staticCompositionLocalOf(new dl1(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gj0 gj0Var, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(gj0Var, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bh0 d() {
        throw new UninitializedPropertyAccessException("OrcaColors is not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources e() {
        throw new UninitializedPropertyAccessException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.fourthline.orca.internal.gj0 r16, kotlin.jvm.functions.Function2 r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hj0.a(com.fourthline.orca.internal.gj0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final uh0 b(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-321634504, i, -1, "com.fourthline.orca.core.internal.styling.<get-orcaLayouts> (OrcaTheme.kt:84)");
        }
        uh0 uh0VarA = vh0.a(orcaFlavor.getLayouts(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return uh0VarA;
    }

    private static final Resources c(OrcaFlavor orcaFlavor, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(803006989, i, -1, "com.fourthline.orca.core.internal.styling.<get-orcaResources> (OrcaTheme.kt:88)");
        }
        composer.startReplaceGroup(-1404395639);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Locale localeA = vc.a(context, orcaFlavor.getLocalization());
        ib.h hVar = hb.a.f150532a;
        ib.b bVarB = hVar != null ? hVar.b(ib.b.Session) : null;
        if (bVarB == null) {
            composer.startReplaceGroup(-69378992);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-69378991);
            bVarB.set("device_language", Locale.getDefault().getLanguage());
            bVarB.set("ui_language", localeA.getLanguage());
            bVarB.set("dark_mode_enabled", Boolean.valueOf(DarkThemeKt.isSystemInDarkTheme(composer, 0)));
            composer.endReplaceGroup();
        }
        Resources resourcesA = vc.a(context, localeA);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resourcesA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi0 b() {
        throw new UninitializedPropertyAccessException("OrcaStylingElements is not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uh0 c() {
        Dp.Companion companion = Dp.INSTANCE;
        return new uh0(companion.m3306getUnspecifiedD9Ej5fM(), companion.m3306getUnspecifiedD9Ej5fM(), companion.m3306getUnspecifiedD9Ej5fM(), companion.m3306getUnspecifiedD9Ej5fM(), companion.m3306getUnspecifiedD9Ej5fM(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Context context, long j2) {
        Window window;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            int iM2002toArgb8_81llA = ColorKt.m2002toArgb8_81llA(j2);
            window.setStatusBarColor(iM2002toArgb8_81llA);
            window.setNavigationBarColor(iM2002toArgb8_81llA);
            return Unit.f186387a;
        }
        return Unit.f186387a;
    }

    private static final bh0 a(OrcaFlavor orcaFlavor, Composer composer, int i) {
        bh0 bh0VarA;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-834905235, i, -1, "com.fourthline.orca.core.internal.styling.<get-orcaColors> (OrcaTheme.kt:76)");
        }
        if (DarkThemeKt.isSystemInDarkTheme(composer, 0)) {
            composer.startReplaceGroup(-506184142);
            bh0VarA = ch0.a(orcaFlavor.getColorsDark(), false, composer, 48, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-506112160);
            bh0VarA = ch0.a(orcaFlavor.getColorsLight(), false, composer, 0, 1);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bh0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map a() {
        throw new UninitializedPropertyAccessException("OrcaColorDefaults is not initialised.");
    }
}
