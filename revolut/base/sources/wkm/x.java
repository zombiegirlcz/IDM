package wkm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes14.dex */
public final class x implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Continuation f298334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f298335b;

    public x(Continuation continuation, CoroutineContext coroutineContext) {
        this.f298334a = continuation;
        this.f298335b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f298334a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f298335b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        this.f298334a.resumeWith(obj2);
    }
}
