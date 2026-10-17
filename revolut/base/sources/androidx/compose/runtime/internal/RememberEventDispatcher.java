package androidx.compose.runtime.internal;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u0003J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b(\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u0003J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00102R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "<init>", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "list", "", "dispatchRememberList", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "instance", "recordLeaving", "(Ljava/lang/Object;)V", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "traceContext", "prepare", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;)V", "clear", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "dispatchRememberObservers", "dispatchOnDeactivateIfNecessary", "Landroidx/collection/ScatterSet;", "ignoreSet", "ignoreForgotten", "(Landroidx/collection/ScatterSet;)V", "extractRememberSet", "()Landroidx/collection/ScatterSet;", "dispatchSideEffects", "dispatchAbandons", "Ljava/util/Set;", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/collection/MutableScatterSet;", "rememberSet", "Landroidx/collection/MutableScatterSet;", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/Stack;", "nestedRemembersLists", "Ljava/util/ArrayList;", "ignoreLeavingSet", "Landroidx/collection/ScatterSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RememberEventDispatcher implements RememberManager {
    private Set<RememberObserver> abandoning;

    @NotNull
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private ScatterSet<RememberObserverHolder> ignoreLeavingSet;

    @NotNull
    private final MutableVector<Object> leaving;
    private ArrayList<MutableVector<RememberObserverHolder>> nestedRemembersLists;
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;

    @NotNull
    private MutableScatterSet<RememberObserverHolder> rememberSet;

    @NotNull
    private final MutableVector<RememberObserverHolder> remembering;

    @NotNull
    private final MutableVector<Function0<Unit>> sideEffects;
    private CompositionErrorContext traceContext;

    public RememberEventDispatcher() {
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new Function0[16], 0);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> list) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        RememberObserverHolder[] rememberObserverHolderArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserverHolder rememberObserverHolder = rememberObserverHolderArr[i];
            RememberObserver wrapped = rememberObserverHolder.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.onRemembered();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                CompositionErrorContext compositionErrorContext = this.traceContext;
                if (compositionErrorContext != null) {
                    compositionErrorContext.attachComposeStackTrace(th10, rememberObserverHolder);
                }
                throw th10;
            }
        }
    }

    private static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            if (wrapped instanceof PausedCompositionRemembers) {
                MutableVector<RememberObserverHolder> pausedRemembers = ((PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void recordLeaving(Object instance) {
        this.leaving.add(instance);
    }

    public final void clear() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.clear();
        this.rememberSet.clear();
        this.currentRememberingList = this.remembering;
        this.leaving.clear();
        this.sideEffects.clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(@NotNull ComposeNodeLifecycleCallback instance) {
        recordLeaving(instance);
    }

    public final void dispatchAbandons() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it8 = set.iterator();
            while (it8.hasNext()) {
                RememberObserver next = it8.next();
                it8.remove();
                next.onAbandoned();
            }
            Unit unit = Unit.f186387a;
            Trace.INSTANCE.endSection(objBeginSection);
        } catch (Throwable th10) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th10;
        }
    }

    public final void dispatchOnDeactivateIfNecessary(@NotNull ComposeNodeLifecycleCallback instance) {
        if (this.leaving.remove(instance)) {
            instance.onDeactivate();
        }
    }

    public final void dispatchRememberObservers() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj2 = this.leaving.content[size];
                    try {
                        if (obj2 instanceof RememberObserverHolder) {
                            RememberObserver wrapped = ((RememberObserverHolder) obj2).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        }
                        if (obj2 instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet == null || !mutableScatterSet.contains((ComposeNodeLifecycleCallback) obj2)) {
                                ((ComposeNodeLifecycleCallback) obj2).onDeactivate();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj2).onRelease();
                            }
                        }
                        Unit unit = Unit.f186387a;
                    } catch (Throwable th10) {
                        CompositionErrorContext compositionErrorContext = this.traceContext;
                        if (compositionErrorContext != null) {
                            compositionErrorContext.attachComposeStackTrace(th10, obj2);
                        }
                        throw th10;
                    }
                }
                Unit unit2 = Unit.f186387a;
            } catch (Throwable th11) {
                throw th11;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            Object objBeginSection2 = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                Unit unit3 = Unit.f186387a;
                trace.endSection(objBeginSection2);
            } finally {
                Trace.INSTANCE.endSection(objBeginSection2);
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<Function0<Unit>> mutableVector = this.sideEffects;
                Function0<Unit>[] function0Arr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.f186387a;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th10) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th10;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(@NotNull RecomposeScopeImpl scope) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(scope) == null) {
            return;
        }
        ArrayList<MutableVector<RememberObserverHolder>> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m1659popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(scope);
    }

    public final ScatterSet<RememberObserverHolder> extractRememberSet() {
        if (!this.rememberSet.isNotEmpty()) {
            return null;
        }
        MutableScatterSet<RememberObserverHolder> mutableScatterSet = this.rememberSet;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.remembering.clear();
        return mutableScatterSet;
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(@NotNull RememberObserverHolder instance) {
        if (!this.rememberSet.contains(instance)) {
            ScatterSet<RememberObserverHolder> scatterSet = this.ignoreLeavingSet;
            if (scatterSet == null || !scatterSet.contains(instance)) {
                recordLeaving(instance);
                return;
            }
            return;
        }
        this.rememberSet.remove(instance);
        if (!this.currentRememberingList.remove(instance) && !this.remembering.remove(instance)) {
            forgetting$removeFrom(instance, this.remembering);
        }
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        set.add(instance.getWrapped());
    }

    public final void ignoreForgotten(@NotNull ScatterSet<RememberObserverHolder> ignoreSet) {
        this.ignoreLeavingSet = ignoreSet;
    }

    public final void prepare(@NotNull Set<RememberObserver> abandoning, CompositionErrorContext traceContext) {
        clear();
        this.abandoning = abandoning;
        this.traceContext = traceContext;
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(@NotNull ComposeNodeLifecycleCallback instance) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign(instance);
        recordLeaving(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(@NotNull RecomposeScopeImpl scope) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMapMutableScatterMapOf = this.pausedPlaceholders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMapMutableScatterMapOf;
        }
        mutableScatterMapMutableScatterMapOf.set(scope, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, -1));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(@NotNull RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
        this.rememberSet.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(@NotNull Function0<Unit> effect) {
        this.sideEffects.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(@NotNull RecomposeScopeImpl scope) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(scope) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList<MutableVector<RememberObserverHolder>> arrayListM1653constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM1653constructorimpl$default == null) {
                arrayListM1653constructorimpl$default = Stack.m1653constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM1653constructorimpl$default;
            }
            Stack.m1660pushimpl(arrayListM1653constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }
}
