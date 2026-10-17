package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivate", "()V", "dispose", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "deactivated", "Z", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;

    @NotNull
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j2, @NotNull SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12, @NotNull MutableSnapshot mutableSnapshot) {
        super(j2, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo1711nestedActivated$runtime(this);
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo1712nestedDeactivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() throws Throwable {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        long snapshotId = getSnapshotId();
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges = modified$runtime != null ? SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
            } catch (Throwable th10) {
                th = th10;
            }
            try {
                if (modified$runtime == null || modified$runtime.get_size() == 0) {
                    nestedMutableSnapshot = this;
                    closeAndReleasePinning$runtime();
                    Unit unit = Unit.f186387a;
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime = nestedMutableSnapshot.innerApplyLocked$runtime(this.parent.getSnapshotId(), modified$runtime, mapOptimisticMerges, this.parent.getInvalid());
                    if (!Intrinsics.f(snapshotApplyResultInnerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return snapshotApplyResultInnerApplyLocked$runtime;
                    }
                    MutableScatterSet<StateObject> modified$runtime2 = nestedMutableSnapshot.parent.getModified$runtime();
                    if (modified$runtime2 != null) {
                        modified$runtime2.addAll(modified$runtime);
                    } else {
                        nestedMutableSnapshot.parent.setModified$runtime(modified$runtime);
                        setModified$runtime(null);
                    }
                }
                if (Intrinsics.l(nestedMutableSnapshot.parent.getSnapshotId(), snapshotId) < 0) {
                    nestedMutableSnapshot.parent.advance$runtime();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.setInvalid$runtime(mutableSnapshot.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
                nestedMutableSnapshot.parent.recordPrevious$runtime(snapshotId);
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
                nestedMutableSnapshot.parent.recordPreviousList$runtime(getPreviousIds());
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
                Unit unit2 = Unit.f186387a;
                setApplied$runtime(true);
                deactivate();
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th11) {
                th = th11;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        deactivate();
    }
}
