package skm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class n0 {
    public static final void a(l lVar, Continuation continuation, boolean z) {
        Object objH;
        Object obj2 = l.f263987g.get(lVar);
        Throwable thG = lVar.g(obj2);
        if (thG != null) {
            m.Companion companion = yhm.m.INSTANCE;
            objH = yhm.o.a(thG);
        } else {
            m.Companion companion2 = yhm.m.INSTANCE;
            objH = lVar.h(obj2);
        }
        if (!z) {
            continuation.resumeWith(objH);
            return;
        }
        Intrinsics.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        zkm.f fVar = (zkm.f) continuation;
        Continuation continuation2 = fVar.e;
        Object obj3 = fVar.f323103g;
        CoroutineContext context = continuation2.getContext();
        Object objC = zkm.w.c(context, obj3);
        i2 i2VarC = objC != zkm.w.f323126a ? x.c(continuation2, context, objC) : null;
        try {
            continuation2.resumeWith(objH);
            Unit unit = Unit.f186387a;
            if (i2VarC == null || i2VarC.l0()) {
                zkm.w.a(context, objC);
            }
        } catch (Throwable th10) {
            if (i2VarC == null || i2VarC.l0()) {
                zkm.w.a(context, objC);
            }
            throw th10;
        }
    }
}
