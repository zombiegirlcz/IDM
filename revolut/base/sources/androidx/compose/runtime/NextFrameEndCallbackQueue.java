package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/NextFrameEndCallbackQueue;", "", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "markFrameComplete", "()V", "Landroidx/compose/runtime/internal/AtomicBoolean;", "isFrameOngoing", "Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AwaiterQueue;", "Landroidx/compose/runtime/NextFrameEndCallbackQueue$NextFrameEndAwaiter;", "frameEndQueue", "Landroidx/compose/runtime/internal/AwaiterQueue;", "Lkotlin/jvm/functions/Function0;", "", "getHasAwaiters", "()Z", "hasAwaiters", "NextFrameEndAwaiter", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NextFrameEndCallbackQueue {

    @NotNull
    private final Function0<Unit> onNewAwaiters;

    @NotNull
    private final AtomicInt isFrameOngoing = AtomicBoolean.m1703constructorimpl(false);

    @NotNull
    private final AwaiterQueue<NextFrameEndAwaiter> frameEndQueue = new AwaiterQueue<>();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/NextFrameEndCallbackQueue$NextFrameEndAwaiter;", "Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;", "onNextFrameEnd", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "cancel", "resume", "resumeWithException", "exception", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NextFrameEndAwaiter extends AwaiterQueue.Awaiter {
        private Function0<Unit> onNextFrameEnd;

        public NextFrameEndAwaiter(@NotNull Function0<Unit> function0) {
            this.onNextFrameEnd = function0;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onNextFrameEnd = null;
        }

        public final void resume() {
            Function0<Unit> function0 = this.onNextFrameEnd;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(@NotNull Throwable exception) throws Throwable {
            throw exception;
        }
    }

    public NextFrameEndCallbackQueue(@NotNull Function0<Unit> function0) {
        this.onNewAwaiters = new ywi.b(this, function0, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markFrameComplete$lambda$0(NextFrameEndAwaiter nextFrameEndAwaiter) {
        nextFrameEndAwaiter.resume();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewAwaiters$lambda$0(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, Function0 function0) {
        if (!AtomicBoolean.m1704getimpl(nextFrameEndCallbackQueue.isFrameOngoing)) {
            function0.invoke();
        }
        return Unit.f186387a;
    }

    public final boolean getHasAwaiters() {
        return this.frameEndQueue.getHasAwaiters();
    }

    public final void markFrameComplete() {
        AtomicBoolean.m1706setimpl(this.isFrameOngoing, false);
        this.frameEndQueue.flushAndDispatchAwaiters(new d());
    }

    @NotNull
    public final CancellationHandle scheduleFrameEndCallback(@NotNull Function0<Unit> action) {
        return this.frameEndQueue.addAwaiter(new NextFrameEndAwaiter(action), this.onNewAwaiters);
    }
}
