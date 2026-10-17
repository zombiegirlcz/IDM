package clm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function3 {
    public static final o f = new o(3, q.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) obj2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q.f;
        qVar.getClass();
        Intrinsics.i(obj3, "null cannot be cast to non-null type T of kotlinx.coroutines.rx2.RxObservableCoroutine");
        IllegalStateException illegalStateExceptionK0 = qVar.k0(obj3);
        if (illegalStateExceptionK0 == null) {
            return qVar;
        }
        throw illegalStateExceptionK0;
    }
}
