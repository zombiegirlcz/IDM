package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 implements Function3 {
    final /* synthetic */ String $a11yPaneTitle;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, FadeInFadeOutState<SnackbarData> fadeInFadeOutState, String str) {
        this.$state = fadeInFadeOutState;
        this.$a11yPaneTitle = str;
    }

    public static /* synthetic */ boolean c(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return invoke$lambda$2$lambda$1$lambda$0(null, fadeInFadeOutAnimationItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        if (!Intrinsics.f(snackbarData, fadeInFadeOutState.getCurrent())) {
            a0.E(fadeInFadeOutState.getItems(), new b(1));
            RecomposeScope scope = fadeInFadeOutState.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
        return Unit.f186387a;
    }

    private static final boolean invoke$lambda$2$lambda$1$lambda$0(SnackbarData snackbarData, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return Intrinsics.f(fadeInFadeOutAnimationItem.getKey(), snackbarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(boolean z, String str, SnackbarData snackbarData, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            SemanticsPropertiesKt.m2837setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m2814getPolite0phEisY());
        }
        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new f(), 1, null);
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5$lambda$4$lambda$3(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return true;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1952400805, i2, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
        }
        FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        boolean zChanged = composer.changed((Object) null) | composer.changedInstance(this.$state);
        FadeInFadeOutState<SnackbarData> fadeInFadeOutState = this.$state;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(fadeInFadeOutState, i3);
            composer.updateRememberedValue(objRememberedValue);
        }
        State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(finiteAnimationSpecValue, true, (Function0) objRememberedValue, composer, 0, 0);
        State stateAnimatedScale = SnackbarHostKt.animatedScale(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), true, composer, 0);
        Modifier modifierM2025graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2025graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131064, null);
        boolean zChanged2 = composer.changed(true) | composer.changed((Object) null) | composer.changed(this.$a11yPaneTitle);
        final String str = this.$a11yPaneTitle;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: androidx.compose.material3.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$5$lambda$4(true, str, null, (SemanticsPropertyReceiver) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM2025graphicsLayerAp8cVGQ$default, false, (Function1) objRememberedValue2, 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSemantics$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
        Function2 function2T = t61.a.t(companion, composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM1662constructorimpl, currentCompositionLocalMap);
        if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            v1.c.B(function2T, currentCompositeKeyHash, composerM1662constructorimpl, currentCompositeKeyHash);
        }
        Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        function2.invoke(composer, Integer.valueOf(i2 & 14));
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
