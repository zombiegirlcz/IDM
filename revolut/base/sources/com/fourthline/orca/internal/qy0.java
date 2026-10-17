package com.fourthline.orca.internal;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.math.MathUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.c21;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class qy0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, c21.b.c cVar, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, cVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(int i, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(a(i) + 270.0f);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, c21.b.c cVar, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(modifier, cVar, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    public static final void a(Modifier modifier, c21.b.c state, Function1 onMaskPositionUpdated, Function1 onAnimationFinishedPlaying, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        ColorFilter colorFilter;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onMaskPositionUpdated, "onMaskPositionUpdated");
        Intrinsics.checkNotNullParameter(onAnimationFinishedPlaying, "onAnimationFinishedPlaying");
        Composer composerStartRestartGroup = composer.startRestartGroup(-204295271);
        int i5 = i2 & 1;
        int i6 = 2;
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
            i3 |= composerStartRestartGroup.changedInstance(onMaskPositionUpdated) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAnimationFinishedPlaying) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204295271, i3, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.RandomnessLivenessOverlay (RandomnessLivenessOverlay.kt:40)");
            }
            Modifier modifierM862padding3ABfNKs = PaddingKt.m862padding3ABfNKs(modifier4, Dp.m3297constructorimpl(32));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM862padding3ABfNKs);
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
            Painter painterA = a20.a(state.getMask().b(), composerStartRestartGroup, 0);
            long jMo2255getIntrinsicSizeNHjbRc = painterA.mo2255getIntrinsicSizeNHjbRc();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc >> 32)) / Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax));
            ContentScale fillBounds = ContentScale.INSTANCE.getFillBounds();
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, fIntBitsToFloat, false, 2, null);
            Modifier modifierScale = ScaleKt.scale(modifierAspectRatio$default, 1.2f);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new vm1(mutableState, onMaskPositionUpdated, i6);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                composer2 = composerStartRestartGroup;
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierScale, (Function1) objRememberedValue2);
            int i21 = i3;
            composerStartRestartGroup = composer2;
            ImageKt.Image(painterA, null, modifierOnGloballyPositioned, null, fillBounds, BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 24624, 104);
            modifier3 = modifier4;
            a(modifierAspectRatio$default, state, onAnimationFinishedPlaying, composerStartRestartGroup, ((i21 >> 3) & 896) | (i21 & 112), 0);
            Modifier modifierScale2 = ScaleKt.scale(modifierAspectRatio$default, 1.2f);
            Painter painterA2 = a20.a(state.k(), composerStartRestartGroup, 0);
            if (state instanceof c21.b.c.C0177b) {
                composerStartRestartGroup.startReplaceGroup(-1706831937);
                ColorFilter colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, zi0.c(fj0.f28535a.a(composerStartRestartGroup, 6)).a(composerStartRestartGroup, 0), 0, 2, null);
                composerStartRestartGroup.endReplaceGroup();
                colorFilter = colorFilterM1996tintxETnrds$default;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1706747989);
                composerStartRestartGroup.endReplaceGroup();
                colorFilter = null;
            }
            ImageKt.Image(painterA2, null, modifierScale2, null, fillBounds, BitmapDescriptorFactory.HUE_RED, colorFilter, composerStartRestartGroup, 24624, 40);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yj1(modifier3, state, onMaskPositionUpdated, onAnimationFinishedPlaying, i, i2, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        mutableState.setValue(IntSize.m3350boximpl(coordinates.mo2533getSizeYbymL2g()));
        function1.invoke(LayoutCoordinatesKt.boundsInRoot(coordinates));
        return Unit.f186387a;
    }

    private static final void a(Modifier modifier, c21.b.c cVar, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        int i5;
        int i6;
        Unit unit;
        Composer composerStartRestartGroup = composer.startRestartGroup(617077426);
        int i21 = i2 & 1;
        if (i21 != 0) {
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(cVar) : composerStartRestartGroup.changedInstance(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            modifier3 = i21 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(617077426, i3, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.CompassComponent (RandomnessLivenessOverlay.kt:89)");
            }
            int i22 = i3 & 14;
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
            Modifier modifierScale = ScaleKt.scale(modifier3, 1.2f);
            int i32 = i3;
            ImageKt.Image(a20.a(cVar.h(), composerStartRestartGroup, 0), null, modifierScale, null, null, BitmapDescriptorFactory.HUE_RED, null, composerStartRestartGroup, 48, SyslogConstants.LOG_CLOCK);
            boolean z3 = cVar instanceof c21.b.c.a;
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(1348783038);
                c21.b.c.a aVar = (c21.b.c.a) cVar;
                Pair pairN = aVar.n();
                if (pairN == null) {
                    composerStartRestartGroup.startReplaceGroup(-1137389884);
                    composerStartRestartGroup.endReplaceGroup();
                    z = z3;
                    i6 = 1348783038;
                    unit = null;
                    modifier4 = modifierScale;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1137389883);
                    modifier4 = modifierScale;
                    z = z3;
                    i6 = 1348783038;
                    g81.a(ScaleKt.scale(modifier3, 0.6f), true, false, 0L, 0L, 0L, 0L, 1, BitmapDescriptorFactory.HUE_RED, new h7.s((Integer) pairN.f186385a, (Integer) pairN.f186386b), aVar.o(), null, function1, null, composerStartRestartGroup, 12582960, i32 & 896, 10620);
                    composerStartRestartGroup = composerStartRestartGroup;
                    unit = Unit.f186387a;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (unit == null) {
                    composerStartRestartGroup.startReplaceGroup(-1136900982);
                    Float fR = aVar.r();
                    if (fR == null) {
                        composerStartRestartGroup.startReplaceGroup(-1136900983);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1136900982);
                        float fFloatValue = fR.floatValue();
                        Float fP = aVar.p();
                        if (fP == null) {
                            composerStartRestartGroup.startReplaceGroup(-1585547333);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1585547332);
                            float fFloatValue2 = fP.floatValue();
                            boolean zChanged = composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changed(fFloatValue2);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new kq1(fFloatValue, fFloatValue2, 1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CanvasKt.Canvas(modifier3, (Function1) objRememberedValue, composerStartRestartGroup, i22);
                            Unit unit2 = Unit.f186387a;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(i6);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                z = z3;
                modifier4 = modifierScale;
                composerStartRestartGroup.startReplaceGroup(-1141729356);
            }
            composerStartRestartGroup.endReplaceGroup();
            Integer numJ = cVar.j();
            if (numJ == null) {
                composerStartRestartGroup.startReplaceGroup(-1136554558);
                composerStartRestartGroup.endReplaceGroup();
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1136554557);
                int iIntValue = numJ.intValue();
                i5 = 0;
                Painter painterA = a20.a(cVar.f(), composerStartRestartGroup, 0);
                ColorFilter colorFilterM1996tintxETnrds$default = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, zi0.c(fj0.f28535a.a(composerStartRestartGroup, 6)).a(composerStartRestartGroup, 0), 0, 2, null);
                boolean zChanged2 = composerStartRestartGroup.changed(iIntValue);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ij1(iIntValue, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ImageKt.Image(painterA, null, GraphicsLayerModifierKt.graphicsLayer(modifier4, (Function1) objRememberedValue2), null, null, BitmapDescriptorFactory.HUE_RED, colorFilterM1996tintxETnrds$default, composerStartRestartGroup, 48, 56);
                Unit unit3 = Unit.f186387a;
                composerStartRestartGroup.endReplaceGroup();
            }
            if ((cVar instanceof c21.b.c.C0177b) || (z && ((c21.b.c.a) cVar).n() == null)) {
                composerStartRestartGroup.startReplaceGroup(1348833630);
                Integer numL = cVar.l();
                if (numL == null) {
                    composerStartRestartGroup.startReplaceGroup(-1135830429);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1135830428);
                    int iIntValue2 = numL.intValue();
                    Painter painterA2 = a20.a(cVar.g(), composerStartRestartGroup, i5);
                    ColorFilter colorFilterM1996tintxETnrds$default2 = ColorFilter.Companion.m1996tintxETnrds$default(ColorFilter.INSTANCE, fj0.f28535a.b(composerStartRestartGroup, 6).getGraphic().getSpinner().getHighlight().a(composerStartRestartGroup, i5), 0, 2, null);
                    boolean zChanged3 = composerStartRestartGroup.changed(iIntValue2);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ij1(iIntValue2, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    ImageKt.Image(painterA2, null, GraphicsLayerModifierKt.graphicsLayer(modifier4, (Function1) objRememberedValue3), null, null, BitmapDescriptorFactory.HUE_RED, colorFilterM1996tintxETnrds$default2, composerStartRestartGroup, 48, 56);
                    Unit unit4 = Unit.f186387a;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1141729356);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            Unit unit5 = Unit.f186387a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(i, modifier3, i2, cVar, 9, function1));
        }
    }

    private static final float a(int i) {
        return ((i / 5) * 5) + (i % 5 >= 3 ? 5.0f : BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, float f4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        a(Canvas, f, f4, Float.intBitsToFloat((int) (Canvas.mo2212getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(a(i) + 270.0f);
        return Unit.f186387a;
    }

    private static final void a(DrawScope drawScope, float f, float f4, float f5, float f6) {
        float fClamp = MathUtils.clamp(f / 45, -1.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f4 / 30, -1.0f, 1.0f);
        float f32 = 2;
        float f35 = f5 / f32;
        float f36 = f6 / f32;
        Stroke stroke = new Stroke(5.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
        long jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(Color.INSTANCE.m1995getWhite0d7_KjU(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(BitmapDescriptorFactory.HUE_RED, f36);
        float f37 = f36 - (fClamp2 * f36);
        Path.cubicTo(BitmapDescriptorFactory.HUE_RED, f37, f5, f37, f5, f36);
        DrawScope.m2205drawPathLG529CI$default(drawScope, Path, jM1976copywmQWz5c$default, BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 52, null);
        Path.reset();
        Path.moveTo(f35, BitmapDescriptorFactory.HUE_RED);
        float f41 = f35 - (fClamp * f35);
        Path.cubicTo(f41, BitmapDescriptorFactory.HUE_RED, f41, f6, f35, f6);
        DrawScope.m2205drawPathLG529CI$default(drawScope, Path, jM1976copywmQWz5c$default, BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 52, null);
    }
}
