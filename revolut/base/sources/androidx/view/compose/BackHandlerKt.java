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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BackHandlerKt {
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
    public static final void BackHandler(boolean z, @NotNull Function0<Unit> function0, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            Object current = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalNavigationEventDispatcherOwner.$stable);
            if (current == null) {
                composerStartRestartGroup.startReplaceGroup(535274673);
                current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(535271790);
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
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(backHandlerDispatcherCompat) | composerStartRestartGroup.changed(currentCompositeKeyHashCode);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ComposeBackHandler(new BackHandlerInfo(current, currentCompositeKeyHashCode));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ComposeBackHandler composeBackHandler = (ComposeBackHandler) objRememberedValue2;
            if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                composerStartRestartGroup.startReplaceGroup(-585307852);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(composeBackHandler) | ((i3 & 112) == 32);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new a(composeBackHandler, function0, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                Boolean boolValueOf = Boolean.valueOf(z);
                int i6 = i3 & 14;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(composeBackHandler) | (i6 == 4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new b(composeBackHandler, z, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                LifecycleEffectKt.LifecycleStartEffect(boolValueOf, composeBackHandler, null, (Function1) objRememberedValue4, composerStartRestartGroup, i6, 4);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat) | composerStartRestartGroup.changedInstance(composeBackHandler);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    final int i21 = 0;
                    objRememberedValue5 = new Function1() { // from class: androidx.activity.compose.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i21) {
                                case 0:
                                    return BackHandlerKt.BackHandler$lambda$4$0(backHandlerDispatcherCompat, composeBackHandler, (DisposableEffectScope) obj2);
                                default:
                                    return BackHandlerKt.BackHandler$lambda$6$0(backHandlerDispatcherCompat, composeBackHandler, (LifecycleStartStopEffectScope) obj2);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                EffectsKt.DisposableEffect(backHandlerDispatcherCompat, composeBackHandler, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-584634160);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(composeBackHandler) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new d(composeBackHandler, z, function0, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.SideEffect((Function0) objRememberedValue6, composerStartRestartGroup, 0);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(backHandlerDispatcherCompat) | composerStartRestartGroup.changedInstance(composeBackHandler);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    final int i22 = 1;
                    objRememberedValue7 = new Function1() { // from class: androidx.activity.compose.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i22) {
                                case 0:
                                    return BackHandlerKt.BackHandler$lambda$4$0(backHandlerDispatcherCompat, composeBackHandler, (DisposableEffectScope) obj2);
                                default:
                                    return BackHandlerKt.BackHandler$lambda$6$0(backHandlerDispatcherCompat, composeBackHandler, (LifecycleStartStopEffectScope) obj2);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat, composeBackHandler, null, (Function1) objRememberedValue7, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        boolean z3 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z3, function0, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$2$0(ComposeBackHandler composeBackHandler, Function0 function0) {
        composeBackHandler.setCurrentOnBackCompleted(function0);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult BackHandler$lambda$3$0(final ComposeBackHandler composeBackHandler, boolean z, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composeBackHandler.setBackEnabled(z);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                composeBackHandler.setBackEnabled(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BackHandler$lambda$4$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposeBackHandler composeBackHandler, DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                backHandlerDispatcherCompat.removeHandler(composeBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$5$0(ComposeBackHandler composeBackHandler, boolean z, Function0 function0) {
        composeBackHandler.setBackEnabled(z);
        composeBackHandler.setCurrentOnBackCompleted(function0);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleStopOrDisposeEffectResult BackHandler$lambda$6$0(final BackHandlerDispatcherCompat backHandlerDispatcherCompat, final ComposeBackHandler composeBackHandler, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                backHandlerDispatcherCompat.removeHandler(composeBackHandler);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackHandler$lambda$7(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        BackHandler(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }
}
