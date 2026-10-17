package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH ¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0010¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0010¢\u0006\u0004\b)\u0010'J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b+\u0010\u001cJ\u000f\u00100\u001a\u00020-H\u0010¢\u0006\u0004\b.\u0010/J\u000f\u00102\u001a\u00020\u0007H\u0010¢\u0006\u0004\b1\u0010\u0003J\u000f\u00104\u001a\u00020\u0007H\u0010¢\u0006\u0004\b3\u0010\u0003J\u0017\u00109\u001a\u00020\u00072\u0006\u00106\u001a\u000205H ¢\u0006\u0004\b7\u00108J\u0019\u0010=\u001a\u0004\u0018\u00010:2\u0006\u00106\u001a\u000205H\u0010¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b>\u0010\u001cJ\u001d\u0010B\u001a\u00020A2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\bB\u0010CR\u0018\u0010H\u001a\u00060Dj\u0002`E8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8 X \u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8 X \u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0014\u0010P\u001a\u00020I8 X \u0004¢\u0006\u0006\u001a\u0004\bO\u0010KR\u0014\u0010R\u001a\u00020I8 X \u0004¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0016\u0010V\u001a\u0004\u0018\u00010S8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010\u0005\u001a\u0004\u0018\u00010[8 X \u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "invalidate$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidate", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime", "unregisterComposer", "unregisterComposition$runtime", "unregisterComposition", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "startComposing$runtime", "startComposing", "doneComposing$runtime", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "reportRemovedComposition$runtime", "reportRemovedComposition", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "()J", "compositeKeyHashCode", "", "getCollectingParameterInformation$runtime", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getStackTraceEnabled$runtime", "stackTraceEnabled", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CompositionContext {
    public abstract void composeInitial$runtime(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content);

    @NotNull
    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull Function2<? super Composer, ? super Integer, Unit> content);

    public void doneComposing$runtime() {
    }

    public abstract boolean getCollectingCallByInformation$runtime();

    /* JADX INFO: renamed from: getCollectingParameterInformation$runtime */
    public abstract boolean getCollectingParameterInformation();

    /* JADX INFO: renamed from: getCollectingSourceInformation$runtime */
    public abstract boolean getCollectingSourceInformation();

    /* JADX INFO: renamed from: getCompositeKeyHashCode$runtime */
    public abstract long getCompositeKeyHashCode();

    public abstract Composition getComposition$runtime();

    @NotNull
    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }

    @NotNull
    public abstract CoroutineContext getEffectCoroutineContext();

    /* JADX INFO: renamed from: getObserverHolder$runtime */
    public CompositionObserverHolder getObserverHolder() {
        return null;
    }

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void insertMovableContent$runtime(@NotNull MovableContentStateReference reference);

    public abstract void invalidate$runtime(@NotNull ControlledComposition composition);

    public MovableContentState movableContentStateResolve$runtime(@NotNull MovableContentStateReference reference) {
        return null;
    }

    @NotNull
    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes);

    public void recordInspectionTable$runtime(@NotNull Set<CompositionData> table) {
    }

    public void registerComposer$runtime(@NotNull Composer composer) {
    }

    public abstract void reportPausedScope$runtime(@NotNull RecomposeScopeImpl scope);

    public abstract void reportRemovedComposition$runtime(@NotNull ControlledComposition composition);

    @NotNull
    public abstract CancellationHandle scheduleFrameEndCallback(@NotNull Function0<Unit> action);

    public void startComposing$runtime() {
    }

    public void unregisterComposer$runtime(@NotNull Composer composer) {
    }

    public abstract void unregisterComposition$runtime(@NotNull ControlledComposition composition);
}
