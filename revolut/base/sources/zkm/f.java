package zkm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.e0;
import skm.e2;
import skm.m0;
import skm.z0;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends m0 implements CoroutineStackFrame, Continuation {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f323102h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final CoroutineDispatcher d;
    public final Continuation e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f323103g;

    public f(CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        super(-1);
        this.d = coroutineDispatcher;
        this.e = continuation;
        this.f = g.f323104a;
        this.f323103g = w.b(continuation.getContext());
    }

    @Override // skm.m0
    public final Continuation f() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // skm.m0
    public final Object j() {
        Object obj2 = this.f;
        this.f = g.f323104a;
        return obj2;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        Throwable thA = yhm.m.a(obj2);
        Object uVar = thA == null ? obj2 : new skm.u(thA, false);
        Continuation continuation = this.e;
        CoroutineContext context = continuation.getContext();
        CoroutineDispatcher coroutineDispatcher = this.d;
        if (g.e(coroutineDispatcher, context)) {
            this.f = uVar;
            this.f263995c = 0;
            g.d(coroutineDispatcher, continuation.getContext(), this);
            return;
        }
        z0 z0VarA = e2.a();
        if (z0VarA.f264022b >= 4294967296L) {
            this.f = uVar;
            this.f263995c = 0;
            z0VarA.q(this);
            return;
        }
        z0VarA.v(true);
        try {
            CoroutineContext context2 = continuation.getContext();
            Object objC = w.c(context2, this.f323103g);
            try {
                continuation.resumeWith(obj2);
                Unit unit = Unit.f186387a;
                while (z0VarA.x()) {
                }
            } finally {
                w.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + e0.H(this.e) + ']';
    }
}
