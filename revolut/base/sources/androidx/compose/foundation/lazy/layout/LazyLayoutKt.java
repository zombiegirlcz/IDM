package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "measurePolicy", "", "LazyLayout", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LazyLayoutKt {
    public static final void LazyLayout(@NotNull Function0<? extends LazyLayoutItemProvider> function0, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1055276397);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(lazyLayoutMeasurePolicy) : composerStartRestartGroup.changedInstance(lazyLayoutMeasurePolicy) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (i6 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055276397, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState;
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-933153643, true, new ccg.b(lazyLayoutPrefetchState3, modifier2, lazyLayoutMeasurePolicy, SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, i3 & 14), 3), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c4.a(function0, modifier2, lazyLayoutPrefetchState2, lazyLayoutMeasurePolicy, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyLayout$lambda$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, State state, SaveableStateHolder saveableStateHolder, Composer composer, int i) {
        SubcomposeLayoutState subcomposeLayoutState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-933153643, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new j1.c(state, 1));
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(objRememberedValue2);
        }
        SubcomposeLayoutState subcomposeLayoutState2 = (SubcomposeLayoutState) objRememberedValue2;
        if (lazyLayoutPrefetchState != null) {
            composer.startReplaceGroup(1743490539);
            Object prefetchScheduler = lazyLayoutPrefetchState.getPrefetchScheduler();
            if (prefetchScheduler == null) {
                composer.startReplaceGroup(887527095);
                prefetchScheduler = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer, 0);
            } else {
                composer.startReplaceGroup(887526010);
            }
            composer.endReplaceGroup();
            Object obj2 = prefetchScheduler;
            Object[] objArr = {lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState2, obj2};
            boolean zChanged = composer.changed(lazyLayoutPrefetchState) | composer.changedInstance(lazyLayoutItemContentFactory) | composer.changedInstance(subcomposeLayoutState2) | composer.changedInstance(obj2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                subcomposeLayoutState = subcomposeLayoutState2;
                Object dVar = new ja3.d(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, obj2, 7);
                composer.updateRememberedValue(dVar);
                objRememberedValue3 = dVar;
            } else {
                subcomposeLayoutState = subcomposeLayoutState2;
            }
            EffectsKt.DisposableEffect(objArr, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        } else {
            subcomposeLayoutState = subcomposeLayoutState2;
            composer.startReplaceGroup(1737291469);
        }
        composer.endReplaceGroup();
        Modifier modifierTraversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
        boolean zChanged2 = composer.changed(lazyLayoutItemContentFactory) | composer.changed(lazyLayoutMeasurePolicy);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new fb.c(lazyLayoutItemContentFactory, lazyLayoutMeasurePolicy, 24);
            composer.updateRememberedValue(objRememberedValue4);
        }
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifierTraversablePrefetchState, (Function2) objRememberedValue4, composer, SubcomposeLayoutState.$stable, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutItemProvider LazyLayout$lambda$1$0$0(State state) {
        return (LazyLayoutItemProvider) ((Function0) state.getValue()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LazyLayout$lambda$1$2$0(final LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler, DisposableEffectScope disposableEffectScope) {
        lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler));
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$lambda$1$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PrefetchHandleProvider prefetchHandleProvider = lazyLayoutPrefetchState.getPrefetchHandleProvider();
                if (prefetchHandleProvider != null) {
                    prefetchHandleProvider.onDisposed();
                }
                lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult LazyLayout$lambda$1$3$0(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return lazyLayoutMeasurePolicy.mo899measure0kLqBqw(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), constraints.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyLayout$lambda$2(Function0 function0, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, int i, int i2, Composer composer, int i3) {
        LazyLayout(function0, modifier, lazyLayoutPrefetchState, lazyLayoutMeasurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }
}
