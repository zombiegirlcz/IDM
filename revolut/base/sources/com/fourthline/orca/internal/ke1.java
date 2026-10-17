package com.fourthline.orca.internal;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.fourthline.orca.internal.le1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ke1 {
    private static final float a(float f, float f4) {
        float f5 = 1;
        return f5 - ((f4 - f5) / (f - f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(int i, int i2, float f, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(i * 4);
        keyframes.setDelayMillis(i2 + i);
        keyframes.at(Float.valueOf(f), i * 3);
        return Unit.f186387a;
    }

    private static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, Painter painter, ColorFilter colorFilter, int i, Composer composer, int i2) {
        a(j2, painter, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, le1 le1Var, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, le1Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(Modifier modifier, le1 state, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        ColorFilter colorFilterM1996tintxETnrds$default;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1918437598);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1918437598, i3, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerMask (VisionScannerMask.kt:83)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3350boximpl(IntSize.INSTANCE.m3359getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Painter painterA = a20.a(state.b(), composerStartRestartGroup, 0);
            long jMo2255getIntrinsicSizeNHjbRc = painterA.mo2255getIntrinsicSizeNHjbRc();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc >> 32)) / Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax));
            ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, fIntBitsToFloat, false, 2, null);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new vm1(mutableState, function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ImageKt.Image(painterA, null, OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAspectRatio$default, (Function1) objRememberedValue2), null, fillBounds, BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 24624, 104);
            composer2 = composerStartRestartGroup;
            le1.a aVarC = state.c();
            if (aVarC == null) {
                composer2.startReplaceGroup(1992788209);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1992788210);
                Painter painterA2 = a20.a(aVarC.a(), composer2, 0);
                if (aVarC instanceof le1.a.b) {
                    composer2.startReplaceGroup(-135096793);
                    composer2.endReplaceGroup();
                    colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m1995getWhite0d7_KjU(), 0, 2, null);
                } else if (aVarC instanceof le1.a.C0242a) {
                    composer2.startReplaceGroup(107056770);
                    if (((le1.a.C0242a) aVarC).c()) {
                        composer2.startReplaceGroup(-135092422);
                        colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, zi0.d(fj0.f28535a.a(composer2, 6)).a(composer2, 0), 0, 2, null);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-135090713);
                        composer2.endReplaceGroup();
                        colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m1995getWhite0d7_KjU(), 0, 2, null);
                    }
                    composer2.endReplaceGroup();
                } else {
                    if (!(aVarC instanceof le1.a.c)) {
                        composer2.startReplaceGroup(-135099307);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-135087014);
                    colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, zi0.c(fj0.f28535a.a(composer2, 6)).a(composer2, 0), 0, 2, null);
                    composer2.endReplaceGroup();
                }
                ColorFilter colorFilter = colorFilterM1996tintxETnrds$default;
                ImageKt.Image(painterA2, null, modifierAspectRatio$default, null, fillBounds, BitmapDescriptorFactory.HUE_RED, colorFilter, composer2, 24624, 40);
                composer2 = composer2;
                if (aVarC instanceof le1.a.C0242a) {
                    composer2.startReplaceGroup(107733686);
                    if (((le1.a.C0242a) aVarC).b()) {
                        composer2.startReplaceGroup(107766887);
                        a(IntSizeKt.m3363toSizeozmzZPI(((IntSize) mutableState.getValue()).getPackedValue()), painterA2, colorFilter, composer2, 0);
                    } else {
                        composer2.startReplaceGroup(102115308);
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(102115308);
                }
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(i, modifier3, i2, state, 8, function1));
        }
    }

    private static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        mutableState.setValue(IntSize.m3350boximpl(coordinates.mo2533getSizeYbymL2g()));
        if (function1 != null) {
            function1.invoke(LayoutCoordinatesKt.boundsInRoot(coordinates));
        }
        return Unit.f186387a;
    }

    private static final void a(final long j2, final Painter painter, final ColorFilter colorFilter, Composer composer, final int i) {
        int i2;
        ColorFilter colorFilter2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1937194559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(painter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            colorFilter2 = colorFilter;
            i2 |= composerStartRestartGroup.changed(colorFilter2) ? 256 : 128;
        } else {
            colorFilter2 = colorFilter;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1937194559, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.PulseAnimation (VisionScannerMask.kt:147)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new jm1(14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InfiniteRepeatableSpec infiniteRepeatableSpecM575infiniteRepeatable9IiC70o$default = AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) objRememberedValue), null, 0L, 6, null);
            int i5 = (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.1f, infiniteRepeatableSpecM575infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i5, 8);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new jm1(15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.1f, AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) objRememberedValue2), null, 0L, 6, null), null, composerStartRestartGroup, i5, 8);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new jm1(16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 1.0f, 1.1f, AnimationSpecKt.m575infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) objRememberedValue3), null, 0L, 6, null), null, composerStartRestartGroup, i5, 8);
            float density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
            Modifier modifierM883size6HolHcs = SizeKt.m883size6HolHcs(Modifier.INSTANCE, DpKt.m3307DpSizeYgX7TsA(Dp.m3297constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)) / density), Dp.m3297constructorimpl(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2)) / density)));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(painter) | composerStartRestartGroup.changed(stateAnimateFloat) | ((i2 & 14) == 4) | ((i2 & 896) == 256) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changed(stateAnimateFloat3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                final ColorFilter colorFilter3 = colorFilter2;
                i3 = 0;
                Function1 function1 = new Function1() { // from class: com.fourthline.orca.internal.zo1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ke1.a(painter, stateAnimateFloat, j2, colorFilter3, 1.1f, stateAnimateFloat2, stateAnimateFloat3, (DrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            } else {
                i3 = 0;
            }
            CanvasKt.Canvas(modifierM883size6HolHcs, (Function1) objRememberedValue4, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.orca.internal.ap1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ke1.a(j2, painter, colorFilter, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, float f, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(i * 5);
        keyframes.setDelayMillis(i2);
        keyframes.at(Float.valueOf(f), i * 3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(i * 3);
        keyframes.setDelayMillis(i2 + (i * 2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Painter painter, State state, long j2, ColorFilter colorFilter, float f, State state2, State state3, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fA = a(state);
        float fA2 = a(state);
        long jMo2211getCenterF1C5BW0 = Canvas.mo2211getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2196scale0AR0LA0(fA, fA2, jMo2211getCenterF1C5BW0);
            painter.m2260drawx_KDEd0(Canvas, j2, a(f, a(state)), colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo2191setSizeuvyYCjk(jMo2190getSizeNHjbRc);
            float fB = b(state2);
            float fB2 = b(state2);
            long jMo2211getCenterF1C5BW02 = Canvas.mo2211getCenterF1C5BW0();
            drawContext = Canvas.getDrawContext();
            jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo2196scale0AR0LA0(fB, fB2, jMo2211getCenterF1C5BW02);
                painter.m2260drawx_KDEd0(Canvas, j2, a(f, b(state2)), colorFilter);
                drawContext.getCanvas().restore();
                drawContext.mo2191setSizeuvyYCjk(jMo2190getSizeNHjbRc);
                float fC = c(state3);
                float fC2 = c(state3);
                long jMo2211getCenterF1C5BW03 = Canvas.mo2211getCenterF1C5BW0();
                drawContext = Canvas.getDrawContext();
                jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2196scale0AR0LA0(fC, fC2, jMo2211getCenterF1C5BW03);
                    painter.m2260drawx_KDEd0(Canvas, j2, a(f, c(state3)), colorFilter);
                    drawContext.getCanvas().restore();
                    drawContext.mo2191setSizeuvyYCjk(jMo2190getSizeNHjbRc);
                    return Unit.f186387a;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private static final float a(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
