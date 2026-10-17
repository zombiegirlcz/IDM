package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wyc.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0089\u0001\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001f\u0010 \"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function0;", "", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surface", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SurfaceKt {

    @NotNull
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new u(26), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp LocalAbsoluteTonalElevation$lambda$3() {
        return Dp.m3295boximpl(Dp.m3297constructorimpl(0));
    }

    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m1396SurfaceT9BRK9s(Modifier modifier, Shape shape, long j2, long j3, float f, float f4, BorderStroke borderStroke, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface();
        }
        if ((i2 & 8) != 0) {
            j3 = ColorSchemeKt.m1356contentColorForek8zF_U(j2, composer, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i2 & 32) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        if ((i2 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float fM3297constructorimpl = Dp.m3297constructorimpl(((Dp) composer.consume(providableCompositionLocal)).getValue() + f);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1972boximpl(j3)), providableCompositionLocal.provides(Dp.m3295boximpl(fM3297constructorimpl))}, ComposableLambdaKt.rememberComposableLambda(421772006, true, new SurfaceKt$Surface$1(modifier, shape, j2, fM3297constructorimpl, borderStroke, f4, function2), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m1397Surfaceo_FOJdg(@NotNull final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j2, long j3, float f, float f4, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2, int i3) {
        final Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i3 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM1340getSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j2;
        long jM1356contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m1356contentColorForek8zF_U(jM1340getSurface0d7_KjU, composer, (i >> 12) & 14) : j3;
        float fM3297constructorimpl = (i3 & 64) != 0 ? Dp.m3297constructorimpl(0) : f;
        final float fM3297constructorimpl2 = (i3 & 128) != 0 ? Dp.m3297constructorimpl(0) : f4;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1472753265, i, i2, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(-1701037204);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            composer.startReplaceGroup(2023337163);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM3297constructorimpl3 = Dp.m3297constructorimpl(((Dp) composer.consume(providableCompositionLocal)).getValue() + fM3297constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1972boximpl(jM1356contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m3295boximpl(fM3297constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(849208527, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.f186387a;
            }

            public final void invoke(Composer composer2, int i5) {
                if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(849208527, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:215)");
                }
                Modifier modifierChildSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m629clickableO2vRcR0$default(SurfaceKt.m1400surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m1401surfaceColorAtElevationCLU3JFs(jM1340getSurface0d7_KjU, fM3297constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo768toPx0680j_4(fM3297constructorimpl2)), mutableInteractionSource3, RippleKt.m1391rippleH2RKhps$default(false, BitmapDescriptorFactory.HUE_RED, 0L, 7, null), z3, null, null, function0, 24, null), null, 1, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierChildSemantics$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer2);
                Function2 function2T = t61.a.t(companion, composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM1662constructorimpl, currentCompositionLocalMap);
                if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    v1.c.B(function2T, currentCompositeKeyHash, composerM1662constructorimpl, currentCompositeKeyHash);
                }
                Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m1400surfaceXOJAsU(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier modifierM2025graphicsLayerAp8cVGQ$default;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            shape2 = shape;
            modifierM2025graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2025graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM2025graphicsLayerAp8cVGQ$default = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m612backgroundbw27NRU(modifier.then(modifierM2025graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j2, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m1401surfaceColorAtElevationCLU3JFs(long j2, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long jM1354applyTonalElevationRFCenO8 = ColorSchemeKt.m1354applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2, f, composer, (i << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1354applyTonalElevationRFCenO8;
    }
}
