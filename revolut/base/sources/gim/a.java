package gim;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements Continuation, CoroutineStackFrame, Serializable {
    private final Continuation<Object> completion;

    public a(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return e.a(this);
    }

    public abstract Object invokeSuspend(Object obj2);

    public void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj2) {
        Continuation<Object> frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            Continuation<Object> continuation = aVar.completion;
            Intrinsics.h(continuation);
            try {
                obj2 = aVar.invokeSuspend(obj2);
            } catch (Throwable th10) {
                m.Companion aVar2 = m.INSTANCE;
                obj2 = o.a(th10);
            }
            if (obj2 == fim.a.COROUTINE_SUSPENDED) {
                return;
            }
            m.Companion aVar3 = m.INSTANCE;
            aVar.releaseIntercepted();
            if (!(continuation instanceof a)) {
                continuation.resumeWith(obj2);
                return;
            }
            frame = continuation;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb6.append(stackTraceElement);
        return sb6.toString();
    }

    @NotNull
    public Continuation<Unit> create(Object obj2, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
