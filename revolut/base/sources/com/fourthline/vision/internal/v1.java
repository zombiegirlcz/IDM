package com.fourthline.vision.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.fourthline.orca.internal.mj1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class v1 {

    public static final class a implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f36994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LifecycleEventObserver f36995b;

        public a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f36994a = lifecycle;
            this.f36995b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f36994a.removeObserver(this.f36995b);
        }
    }

    public static final void OnLifecycleEvent(@NotNull Function1<? super Lifecycle.Event, Unit> onEvent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1887311948);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onEvent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1887311948, i2, -1, "com.fourthline.vision.internal.OnLifecycleEvent (ComposeExtensions.kt:13)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onEvent, composerStartRestartGroup, i2 & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), composerStartRestartGroup, 0);
            Object value = stateRememberUpdatedState2.getValue();
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new com.fourthline.core.location.internal.d(stateRememberUpdatedState2, stateRememberUpdatedState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(value, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mj1(i, 3, onEvent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult OnLifecycleEvent$lambda$0$0(State state, final State state2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        Lifecycle lifecycle = ((LifecycleOwner) state.getValue()).getLifecycle();
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.fourthline.vision.internal.lh
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                v1.OnLifecycleEvent$lambda$0$0$0(state2, lifecycleOwner, event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new a(lifecycle, lifecycleEventObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnLifecycleEvent$lambda$0$0$0(State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        ((Function1) state.getValue()).invoke(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnLifecycleEvent$lambda$1(Function1 function1, int i, Composer composer, int i2) {
        OnLifecycleEvent(function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }
}
