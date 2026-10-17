package androidx.compose.ui.layout;

import a0.d;
import aim.e;
import androidx.collection.IntList;
import androidx.compose.ui.layout.SLOperation;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Landroidx/collection/IntList;", "operations", "", "slotId", "", "cause", "<init>", "(Landroidx/collection/IntList;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "operationsList", "()Ljava/util/List;", "Landroidx/collection/IntList;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {

    @NotNull
    private final IntList operations;
    private final Object slotId;

    public SubcomposeLayoutPausableCompositionException(@NotNull IntList intList, Object obj2, Throwable th10) {
        super(th10);
        this.operations = intList;
        this.slotId = obj2;
    }

    private final List<String> operationsList() {
        e eVarB = u.b();
        for (int i = this.operations._size - 1; i >= 0; i += -1) {
            int i2 = this.operations.get(i);
            int iM2568constructorimpl = SLOperation.m2568constructorimpl(i2);
            SLOperation.Companion companion = SLOperation.INSTANCE;
            eVarB.add(i + ": " + (SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2571getCancelPausedPrecompositionNjRlDlw()) ? "CancelPausedPrecomposition" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2577getReuseForceSyncDeactivationNjRlDlw()) ? "ReuseForceSyncDeactivation" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2578getReuseScheduleOutOfFrameDeactivationNjRlDlw()) ? "ReuseScheduleOutOfFrameDeactivation" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2579getReuseSyncDeactivationNjRlDlw()) ? "ReuseSyncDeactivation" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2576getReuseDeactivationViaHostNjRlDlw()) ? "ReuseDeactivationViaHost" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2587getTookFromPrecomposeMapNjRlDlw()) ? "TookFromPrecomposeMap" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2583getSubcomposeNjRlDlw()) ? "Subcompose" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2585getSubcomposeNewNjRlDlw()) ? "SubcomposeNew" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2586getSubcomposePausableNjRlDlw()) ? "SubcomposePausable" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2584getSubcomposeForceReuseNjRlDlw()) ? "SubcomposeForceReuse" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2572getDeactivateOutOfFrameNjRlDlw()) ? "DeactivateOutOfFrame" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2573getDeactivateOutOfFrameCancelledNjRlDlw()) ? "DeactivateOutOfFrameCancelled" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2581getSlotToReusedFromOnDeactivateNjRlDlw()) ? "SlotToReusedFromOnDeactivate" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2582getSlotToReusedFromOnReuseNjRlDlw()) ? "SlotToReusedFromOnReuse" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2580getReusedNjRlDlw()) ? "Reused" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2575getResumePausedNjRlDlw()) ? "ResumePaused" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2574getPausePausedNjRlDlw()) ? "PausePaused" : SLOperation.m2569equalsimpl0(iM2568constructorimpl, companion.m2570getApplyPausedNjRlDlw()) ? "ApplyPaused" : d.n("Unexpected ", i2)));
        }
        return u.a(eVarB);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return t.f("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + d0.k0(operationsList(), "\n", null, null, 0, null, 62) + "\n            ");
    }
}
