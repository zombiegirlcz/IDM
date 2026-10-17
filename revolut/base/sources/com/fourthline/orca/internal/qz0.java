package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class qz0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, String str2, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(Modifier modifier, String title, String accessibilityDescription, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accessibilityDescription, "accessibilityDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(295340538);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(accessibilityDescription) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(295340538, i3, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerTitle (ScannerTitle.kt:19)");
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            l2.a(title, SizeKt.fillMaxWidth$default(a80.a(a80.a(modifier4, "headerView", (String) null, 2, (Object) null), accessibilityDescription, false, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 2, (Function1) null, fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Scanner java.lang.String().getHeader().a(null, composerStartRestartGroup, 0, 1), composer2, (i3 >> 3) & 14, 3072, 24316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(modifier3, title, accessibilityDescription, i, i2, 10));
        }
    }
}
