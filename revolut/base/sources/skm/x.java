package skm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public abstract class x {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new pq0.d(5))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new pq0.d(5))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new pq0.d(6));
        if (zBooleanValue2) {
            ref$ObjectRef.f186409a = ((CoroutineContext) ref$ObjectRef.f186409a).fold(gVar, new pq0.d(7));
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.f186409a);
    }

    public static final CoroutineContext b(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getCoroutineContext(), coroutineContext, true);
        elm.g gVar = p0.f264002b;
        return (coroutineContextA == gVar || coroutineContextA.get(kotlin.coroutines.d.q1) != null) ? coroutineContextA : coroutineContextA.plus(gVar);
    }

    public static final i2 c(Continuation continuation, CoroutineContext coroutineContext, Object obj2) {
        i2 i2Var = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.get(j2.f263984a) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((callerFrame instanceof l0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof i2) {
                    i2Var = (i2) callerFrame;
                    break;
                }
            }
            if (i2Var != null) {
                i2Var.n0(coroutineContext, obj2);
            }
        }
        return i2Var;
    }
}
