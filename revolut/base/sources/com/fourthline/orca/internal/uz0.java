package com.fourthline.orca.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class uz0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ScrollState scrollState, mj0 mj0Var, int i, Composer composer, int i2) {
        a(scrollState, mj0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Modifier modifier, mj0 mj0Var, int i, int i2, Composer composer, int i3) {
        b(modifier, mj0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, mj0 mj0Var, int i, int i2, Composer composer, int i3) {
        a(modifier, mj0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    private static final void b(Modifier modifier, final mj0 mj0Var, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long value;
        long value2;
        Composer composerStartRestartGroup = composer.startRestartGroup(4001578);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(mj0Var) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(4001578, i3, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollViewTopGradientOverlay (ScrollOverlay.kt:70)");
            }
            Color colorA = mj0Var.a();
            if (colorA == null) {
                composerStartRestartGroup.startReplaceGroup(-449444817);
                value = fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-449446894);
                composerStartRestartGroup.endReplaceGroup();
                value = colorA.getValue();
            }
            Color colorB = mj0Var.b();
            if (colorB == null) {
                composerStartRestartGroup.startReplaceGroup(-449440934);
                value2 = Color.m1976copywmQWz5c$default(fj0.f28535a.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-449443414);
                composerStartRestartGroup.endReplaceGroup();
                value2 = colorB.getValue();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(value) | ((i3 & 112) == 32) | composerStartRestartGroup.changed(value2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final long j2 = value;
                final long j3 = value2;
                Function1 function1 = new Function1() { // from class: com.fourthline.orca.internal.os1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return uz0.a(mj0Var, j2, j3, (DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifierFillMaxSize$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ns1(modifier3, mj0Var, i, i2, 1));
        }
    }

    public static final void a(ScrollState scrollState, mj0 overlaySettings, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(overlaySettings, "overlaySettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(-888864067);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(overlaySettings) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-888864067, i2, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollGradientOverlay (ScrollOverlay.kt:24)");
            }
            if (scrollState.getValue() <= 0 || !overlaySettings.f()) {
                composerStartRestartGroup.startReplaceGroup(-1676960731);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1675880226);
                b(AlphaKt.alpha(Modifier.INSTANCE, b(scrollState)), overlaySettings, composerStartRestartGroup, i2 & 112, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (scrollState.getMaxValue() <= 0 || !overlaySettings.e()) {
                composerStartRestartGroup.startReplaceGroup(-1676960731);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1675638984);
                a(AlphaKt.alpha(Modifier.INSTANCE, a(scrollState)), overlaySettings, composerStartRestartGroup, i2 & 112, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rn1(scrollState, overlaySettings, i, 16));
        }
    }

    private static final void a(Modifier modifier, final mj0 mj0Var, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long value;
        final long value2;
        Composer composerStartRestartGroup = composer.startRestartGroup(149699540);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(mj0Var) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(149699540, i3, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollViewBottomGradientOverlay (ScrollOverlay.kt:41)");
            }
            fj0 fj0Var = fj0.f28535a;
            final float fD = fj0Var.c(composerStartRestartGroup, 6).d();
            Color colorA = mj0Var.a();
            if (colorA == null) {
                composerStartRestartGroup.startReplaceGroup(2127345337);
                value = fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2127343260);
                composerStartRestartGroup.endReplaceGroup();
                value = colorA.getValue();
            }
            final long j2 = value;
            Color colorB = mj0Var.b();
            if (colorB == null) {
                composerStartRestartGroup.startReplaceGroup(2127349220);
                value2 = Color.m1976copywmQWz5c$default(fj0Var.b(composerStartRestartGroup, 6).getIb.b.Screen java.lang.String().getBackground().a(composerStartRestartGroup, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2127346740);
                composerStartRestartGroup.endReplaceGroup();
                value2 = colorB.getValue();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composerStartRestartGroup.changed(fD) | ((i3 & 112) == 32) | composerStartRestartGroup.changed(value2) | composerStartRestartGroup.changed(j2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.fourthline.orca.internal.ms1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return uz0.a(fD, mj0Var, value2, j2, (ContentDrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            BoxKt.Box(DrawModifierKt.drawWithContent(modifierFillMaxSize$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ns1(modifier3, mj0Var, i, i2, 0));
        }
    }

    private static final float b(ScrollState scrollState) {
        if (scrollState.getValue() > 0) {
            return Math.min(scrollState.getValue() / th0.f33777a.a(), 1.0f);
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, mj0 mj0Var, long j2, long j3, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fMo768toPx0680j_4 = drawWithContent.mo768toPx0680j_4(f);
        Brush brushM1960verticalGradient8A3gB4$default = Brush.Companion.m1960verticalGradient8A3gB4$default(Brush.INSTANCE, zhm.v.k(Color.m1972boximpl(j2), Color.m1972boximpl(j3)), Float.intBitsToFloat((int) (drawWithContent.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fMo768toPx0680j_4, Float.intBitsToFloat((int) (drawWithContent.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)), 0, 8, null);
        float fB = mj0Var.d().b();
        DrawScope.m2206drawRectAsUm42w$default(drawWithContent, brushM1960verticalGradient8A3gB4$default, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithContent.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fMo768toPx0680j_4)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32)), Size.m1863copyxjbvk4A(drawWithContent.mo2212getSizeNHjbRc(), (Float.intBitsToFloat((int) (drawWithContent.mo2212getSizeNHjbRc() >> 32)) - mj0Var.d().a()) - mj0Var.d().b(), fMo768toPx0680j_4), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(mj0 mj0Var, long j2, long j3, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m2206drawRectAsUm42w$default(drawBehind, Brush.Companion.m1960verticalGradient8A3gB4$default(Brush.INSTANCE, zhm.v.k(Color.m1972boximpl(j2), Color.m1972boximpl(j3)), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * mj0Var.c(), 0, 8, null), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(mj0Var.d().b())) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & BodyPartID.bodyIdMax)), Size.m1863copyxjbvk4A(drawBehind.mo2212getSizeNHjbRc(), (Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() >> 32)) - mj0Var.d().a()) - mj0Var.d().b(), Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * mj0Var.c()), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
        return Unit.f186387a;
    }

    public static final void a(ContentDrawScope contentDrawScope, ScrollState scrollState, i20 indicatorSettings) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(indicatorSettings, "indicatorSettings");
        if (indicatorSettings.b()) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * (Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) / (Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) + scrollState.getMaxValue()));
            boolean z = scrollState.getMaxValue() > 0;
            float fMo768toPx0680j_4 = contentDrawScope.mo768toPx0680j_4(Dp.m3297constructorimpl(14)) + Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32));
            float value = scrollState.getValue() / scrollState.getMaxValue();
            if (z) {
                DrawScope.m2207drawRectnJ9OG0$default(contentDrawScope, Color.INSTANCE.m1991getLightGray0d7_KjU(), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fMo768toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & BodyPartID.bodyIdMax)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(contentDrawScope.mo768toPx0680j_4(indicatorSettings.c()))) << 32)), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
                DrawScope.m2207drawRectnJ9OG0$default(contentDrawScope, indicatorSettings.a(), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fMo768toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(Float.min((Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fIntBitsToFloat) * value, Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) - fIntBitsToFloat))) & BodyPartID.bodyIdMax)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(contentDrawScope.mo768toPx0680j_4(indicatorSettings.c()))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax)), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
            }
        }
    }

    private static final float a(ScrollState scrollState) {
        if (scrollState.getMaxValue() > 0) {
            return Math.min((scrollState.getMaxValue() - scrollState.getValue()) / th0.f33777a.a(), 1.0f);
        }
        return 1.0f;
    }
}
