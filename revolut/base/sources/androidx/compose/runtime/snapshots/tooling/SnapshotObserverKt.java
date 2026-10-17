package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\f0\n*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "mergeObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "result", "observerMap", "dispatchCreatedObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "snapshot", "dispatchObserverOnPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "changes", "dispatchObserverOnApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", "observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SnapshotObserverKt {
    private static PersistentList<Object> observers;

    public static final void dispatchCreatedObservers(@NotNull PersistentList<Object> persistentList, Snapshot snapshot, @NotNull Snapshot snapshot2, Map<Object, SnapshotInstanceObservers> map) {
        if (persistentList.size() > 0) {
            if (persistentList.get(0) != null) {
                throw new ClassCastException();
            }
            if (map == null) {
                throw null;
            }
            map.get(null);
            throw null;
        }
    }

    public static final void dispatchObserverOnApplied(@NotNull Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        PersistentList<Object> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet != null) {
            ScatterSetWrapperKt.wrapIntoSet(scatterSet);
        }
        if (persistentList.size() <= 0) {
            return;
        }
        persistentList.get(0).getClass();
        throw new ClassCastException();
    }

    public static final void dispatchObserverOnPreDispose(@NotNull Snapshot snapshot) {
        PersistentList<Object> persistentList = observers;
        if (persistentList == null || persistentList.size() <= 0) {
            return;
        }
        persistentList.get(0).getClass();
        throw new ClassCastException();
    }

    @NotNull
    public static final Pair<SnapshotInstanceObservers, Map<Object, SnapshotInstanceObservers>> mergeObservers(@NotNull PersistentList<Object> persistentList, Snapshot snapshot, boolean z, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (persistentList.size() <= 0) {
            return new Pair<>(new SnapshotInstanceObservers(function1, function12), null);
        }
        persistentList.get(0).getClass();
        throw new ClassCastException();
    }
}
