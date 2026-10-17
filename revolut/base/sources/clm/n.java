package clm;

import c84.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import skm.e0;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function3 {
    public static final n f = new n(3, q.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) obj2;
        flm.i iVar = (flm.i) obj3;
        Continuation continuation = null;
        if (qVar.e.tryLock(null)) {
            ((flm.h) iVar).e = Unit.f186387a;
        } else {
            e0.C(qVar, null, null, new y(qVar, iVar, continuation, 26), 3);
        }
        return Unit.f186387a;
    }
}
