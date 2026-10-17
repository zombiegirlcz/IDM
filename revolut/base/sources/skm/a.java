package skm;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends r1 implements Continuation, CoroutineScope {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f263953c;

    public a(CoroutineContext coroutineContext, boolean z, boolean z3) {
        super(z3);
        if (z) {
            R((Job) coroutineContext.get(g1.f263979a));
        }
        this.f263953c = coroutineContext.plus(this);
    }

    @Override // skm.r1
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // skm.r1
    public final void Q(CompletionHandlerException completionHandlerException) {
        e0.v(this.f263953c, completionHandlerException);
    }

    @Override // skm.r1
    public final void a0(Object obj2) {
        if (!(obj2 instanceof u)) {
            i0(obj2);
        } else {
            u uVar = (u) obj2;
            h0(uVar.f264012a, u.f264011b.get(uVar) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f263953c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f263953c;
    }

    public void h0(Throwable th10, boolean z) {
    }

    public void i0(Object obj2) {
    }

    public final void j0(d0 d0Var, a aVar, Function2 function2) {
        Object objInvoke;
        d0Var.getClass();
        int i = c0.f263961a[d0Var.ordinal()];
        if (i == 1) {
            alm.a.d(function2, aVar, this);
            return;
        }
        if (i == 2) {
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(this, "completion");
            Continuation continuationB = fim.h.b(fim.h.a(aVar, this, function2));
            Unit unit = Unit.f186387a;
            m.Companion companion = yhm.m.INSTANCE;
            continuationB.resumeWith(unit);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Intrinsics.checkNotNullParameter(this, "completion");
        try {
            CoroutineContext coroutineContext = this.f263953c;
            Object objC = zkm.w.c(coroutineContext, null);
            try {
                Intrinsics.checkNotNullParameter(this, "frame");
                if (function2 instanceof gim.a) {
                    kotlin.jvm.internal.u0.f(2, function2);
                    objInvoke = function2.invoke(aVar, this);
                } else {
                    objInvoke = fim.h.c(function2, aVar, this);
                }
                zkm.w.a(coroutineContext, objC);
                if (objInvoke != fim.a.COROUTINE_SUSPENDED) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    resumeWith(objInvoke);
                }
            } catch (Throwable th10) {
                zkm.w.a(coroutineContext, objC);
                throw th10;
            }
        } catch (Throwable th11) {
            th = th11;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getF187929a();
            }
            m.Companion companion3 = yhm.m.INSTANCE;
            resumeWith(yhm.o.a(th));
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        Throwable thA = yhm.m.a(obj2);
        if (thA != null) {
            obj2 = new u(thA, false);
        }
        Object objV = V(obj2);
        if (objV == e0.e) {
            return;
        }
        x(objV);
    }
}
