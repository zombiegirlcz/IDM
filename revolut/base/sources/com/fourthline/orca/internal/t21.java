package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public abstract class t21 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableTransitionState f33182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableTransitionState mutableTransitionState, Continuation continuation) {
            super(2, continuation);
            this.f33182b = mutableTransitionState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f33182b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f33181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            if (((Boolean) this.f33182b.getCurrentState()).booleanValue()) {
                this.f33182b.setTargetState(Boolean.FALSE);
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableTransitionState mutableTransitionState, int i, Composer composer, int i2) {
        a(mutableTransitionState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(MutableTransitionState shutterState, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(shutterState, "shutterState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1784367205);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(shutterState) : composerStartRestartGroup.changedInstance(shutterState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1784367205, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ShutterAnimationEffect (ShutterAnimationEffect.kt:16)");
            }
            int i3 = i2 & 14;
            AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) shutterState, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), BitmapDescriptorFactory.HUE_RED, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), BitmapDescriptorFactory.HUE_RED, 2, null), (String) null, wa.f34558a.a(), composerStartRestartGroup, MutableTransitionState.$stable | 200064 | i3, 18);
            Object currentState = shutterState.getCurrentState();
            if (i3 != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(shutterState))) {
                z = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(shutterState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(currentState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(shutterState, i, 10));
        }
    }
}
