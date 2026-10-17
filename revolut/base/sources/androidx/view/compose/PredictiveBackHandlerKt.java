package androidx.view.compose;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.view.ActivityFlags;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.internal.BackHandlerDispatcherCompat;
import g.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/coroutines/Continuation;", "", "", "onBack", "PredictiveBackHandler", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PredictiveBackHandlerKt {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void PredictiveBackHandler(boolean z, @NotNull Function2<Flow, ? super Continuation<Unit>, ? extends Object> function2, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642000585, i3, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:118)");
            }
            Object current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalNavigationEventDispatcherOwner.$stable);
            if (current == null) {
                composerStartRestartGroup.startReplaceGroup(1512740606);
                current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1512737723);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (current == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zChanged = composerStartRestartGroup.changed(current);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                NavigationEventDispatcherOwner navigationEventDispatcherOwner = current instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) current : null;
                NavigationEventDispatcher navigationEventDispatcher = navigationEventDispatcherOwner != null ? navigationEventDispatcherOwner.getNavigationEventDispatcher() : null;
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = current instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) current : null;
                objRememberedValue = new BackHandlerDispatcherCompat(navigationEventDispatcher, onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final BackHandlerDispatcherCompat backHandlerDispatcherCompat = (BackHandlerDispatcherCompat) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(g.f186406a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(backHandlerDispatcherCompat) | composerStartRestartGroup.changed(currentCompositeKeyHashCode);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ComposePredictiveBackHandler(coroutineScope, new PredictiveBackHandlerInfo(current, currentCompositeKeyHashCode));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) objRememberedValue3;
            if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                composerStartRestartGroup.startReplaceGroup(-348514256);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(composePredictiveBackHandler) | composerStartRestartGroup.changedInstance(function2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new a(composePredictiveBackHandler, function2, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                boolean z3 = true;
                int i6 = i3 & 14;
                if (i6 != 4) {
                    z3 = false;
                }
                boolean z4 = zChangedInstance2 | z3;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new b(composePredictiveBackHandler, z, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                LifecycleEffectKt.LifecycleStartEffect(boolValueOf, composePredictiveBackHandler, null, (Function1) objRememberedValue5, composerStartRestartGroup, i6, 4);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat) | composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                    final int i21 = 0;
                    objRememberedValue6 = new Function1() { // from class: androidx.activity.compose.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i21) {
                                case 0:
                                    return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$4$0(backHandlerDispatcherCompat, composePredictiveBackHandler, (DisposableEffectScope) obj2);
                                default:
                                    return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$6$0(backHandlerDispatcherCompat, composePredictiveBackHandler, (LifecycleStartStopEffectScope) obj2);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.DisposableEffect(backHandlerDispatcherCompat, composePredictiveBackHandler, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-347849492);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(composePredictiveBackHandler) | ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(function2);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new d(composePredictiveBackHandler, z, function2, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue7, composerStartRestartGroup, 0);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat) | composerStartRestartGroup.changedInstance(composePredictiveBackHandler);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue8 == companion.getEmpty()) {
                    final int i22 = 1;
                    objRememberedValue8 = new Function1() { // from class: androidx.activity.compose.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i22) {
                                case 0:
                                    return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$4$0(backHandlerDispatcherCompat, composePredictiveBackHandler, (DisposableEffectScope) obj2);
                                default:
                                    return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$6$0(backHandlerDispatcherCompat, composePredictiveBackHandler, (LifecycleStartStopEffectScope) obj2);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat, composePredictiveBackHandler, null, (Function1) objRememberedValue8, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        boolean z6 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z6, function2, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$2$0(ComposePredictiveBackHandler composePredictiveBackHandler, Function2 function2) {
        composePredictiveBackHandler.setCurrentOnBack(function2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult PredictiveBackHandler$lambda$3$0(final ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composePredictiveBackHandler.setBackEnabled(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                composePredictiveBackHandler.setBackEnabled(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PredictiveBackHandler$lambda$4$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposePredictiveBackHandler composePredictiveBackHandler, DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                backHandlerDispatcherCompat.removeHandler(composePredictiveBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$5$0(ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, Function2 function2) {
        composePredictiveBackHandler.setBackEnabled(z);
        composePredictiveBackHandler.setCurrentOnBack(function2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult PredictiveBackHandler$lambda$6$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposePredictiveBackHandler composePredictiveBackHandler, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                backHandlerDispatcherCompat.removeHandler(composePredictiveBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$7(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        PredictiveBackHandler(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }
}
