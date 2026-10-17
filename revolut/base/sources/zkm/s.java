package zkm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes13.dex */
public class s extends skm.a implements CoroutineStackFrame {
    public final Continuation d;

    public s(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.d = continuation;
    }

    @Override // skm.r1
    public final boolean T() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public void k0() {
    }

    @Override // skm.r1
    public void w(Object obj2) {
        g.c(skm.v.a(obj2), fim.h.b(this.d));
    }

    @Override // skm.r1
    public void x(Object obj2) {
        this.d.resumeWith(skm.v.a(obj2));
    }
}
