package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class t extends gim.c implements FlowCollector {
    public final FlowCollector u;
    public final CoroutineContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f298329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CoroutineContext f298330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Continuation f298331y;

    public t(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(r.f298326a, kotlin.coroutines.g.f186406a);
        this.u = flowCollector;
        this.v = coroutineContext;
        this.f298329w = ((Number) coroutineContext.fold(0, new pq0.d(15))).intValue();
    }

    public final Object b(Continuation continuation, Object obj2) {
        CoroutineContext context = continuation.getContext();
        e0.p(context);
        CoroutineContext coroutineContext = this.f298330x;
        if (coroutineContext != context) {
            if (coroutineContext instanceof p) {
                throw new IllegalStateException(kotlin.text.t.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) coroutineContext).f298325b + ", but then emission attempt of value '" + obj2 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new akl.t(this, 9))).intValue() != this.f298329w) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.v + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f298330x = context;
        }
        this.f298331y = continuation;
        Function3 function3 = v.f298332a;
        FlowCollector flowCollector = this.u;
        Intrinsics.i(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = function3.invoke(flowCollector, obj2, this);
        if (!Intrinsics.f(objInvoke, fim.a.COROUTINE_SUSPENDED)) {
            this.f298331y = null;
        }
        return objInvoke;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation frame) {
        try {
            Object objB = b(frame, obj2);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objB == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objB == aVar ? objB : Unit.f186387a;
        } catch (Throwable th10) {
            this.f298330x = new p(frame.getContext(), th10);
            throw th10;
        }
    }

    @Override // gim.a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f298331y;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // gim.c, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f298330x;
        return coroutineContext == null ? kotlin.coroutines.g.f186406a : coroutineContext;
    }

    @Override // gim.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Throwable thA = yhm.m.a(obj2);
        if (thA != null) {
            this.f298330x = new p(getContext(), thA);
        }
        Continuation continuation = this.f298331y;
        if (continuation != null) {
            continuation.resumeWith(obj2);
        }
        return fim.a.COROUTINE_SUSPENDED;
    }
}
