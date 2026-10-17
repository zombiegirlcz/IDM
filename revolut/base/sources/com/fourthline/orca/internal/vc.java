package com.fourthline.orca.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.res.ResourcesCompat;
import com.fourthline.sdk.assets.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vc {
    public static /* synthetic */ void a(Context context, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = 500;
        }
        a(context, j2);
    }

    public static final boolean b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ResourcesCompat.getFont(context, i) != null;
    }

    public static final void a(Context context, long j2) {
        Vibrator defaultVibrator;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            defaultVibrator = com.fourthline.core.internal.j0.c(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            Intrinsics.i(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            defaultVibrator = (Vibrator) systemService2;
        }
        Intrinsics.h(defaultVibrator);
        defaultVibrator.vibrate(VibrationEffect.createOneShot(j2, -1));
    }

    public static final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return !b(context, R.font.roboto_mono);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Locale a(android.content.Context r10, com.fourthline.orca.core.flavor.OrcaLocalization r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "localization"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            com.fourthline.orca.core.flavor.OrcaLocalization$LanguageType r0 = r11.getBaseLanguage()
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Locale r3 = new java.util.Locale
            r3.<init>(r0)
            com.fourthline.orca.core.flavor.OrcaLocalization$LanguageType r11 = r11.getFixedLanguage()
            if (r11 == 0) goto L45
            java.lang.String r11 = r11.name()
            if (r11 == 0) goto L45
            java.lang.String r11 = r11.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            if (r11 == 0) goto L45
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r11)
            goto L46
        L45:
            r0 = 0
        L46:
            com.fourthline.orca.core.flavor.OrcaLocalization$LanguageType[] r11 = com.fourthline.orca.core.flavor.OrcaLocalization.LanguageType.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r11.length
            r1.<init>(r4)
            int r4 = r11.length
            r5 = 0
            r6 = r5
        L53:
            if (r6 >= r4) goto L6f
            r7 = r11[r6]
            java.util.Locale r8 = new java.util.Locale
            java.lang.String r7 = r7.name()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r8.<init>(r7)
            r1.add(r8)
            int r6 = r6 + 1
            goto L53
        L6f:
            android.os.LocaleList r10 = r10.getLocales()
            java.util.Locale r10 = r10.get(r5)
            if (r0 != 0) goto L9e
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L80
            goto L9d
        L80:
            int r11 = r1.size()
        L84:
            if (r5 >= r11) goto L9d
            java.lang.Object r0 = r1.get(r5)
            int r5 = r5 + 1
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r2 = r10.getLanguage()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L84
            return r10
        L9d:
            return r3
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.vc.a(android.content.Context, com.fourthline.orca.core.flavor.OrcaLocalization):java.util.Locale");
    }

    public static final Resources a(Context context, Locale locale) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            Resources resources = context.createConfigurationContext(configuration).getResources();
            Intrinsics.h(resources);
            return resources;
        } catch (Throwable unused) {
            Resources resources2 = context.getResources();
            Intrinsics.h(resources2);
            return resources2;
        }
    }

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ResourcesCompat.getDrawable(context.getResources(), i, null) != null;
    }

    public static /* synthetic */ void a(Context context, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        a(context, str, z);
    }

    public static final void a(Context context, String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || kotlin.text.d0.W(str)) {
            return;
        }
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(z ? 32 : 16384);
        accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
        accessibilityEventObtain.setPackageName(accessibilityEventObtain.getPackageName());
        accessibilityEventObtain.getText().add(str);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    public static final boolean a(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1500624390, i, -1, "com.fourthline.orca.core.internal.extension.isTalkBackEnabled (ContextExtensions.kt:133)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object systemService = context.getSystemService("accessibility");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            objRememberedValue = (AccessibilityManager) systemService;
            composer.updateRememberedValue(objRememberedValue);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objRememberedValue;
        boolean z = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }
}
