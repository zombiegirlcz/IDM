package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class q1 extends kotlin.jvm.internal.q implements Function3 {
    public static final q1 f = new q1(3, r1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        r1 r1Var = (r1) obj2;
        flm.i iVar = (flm.i) obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f264005a;
        r1Var.getClass();
        while (true) {
            Object obj5 = r1.f264005a.get(r1Var);
            if (!(obj5 instanceof d1)) {
                ((flm.h) iVar).e = Unit.f186387a;
                break;
            }
            if (r1Var.d0(obj5) >= 0) {
                ((flm.h) iVar).f136013c = e0.w(r1Var, new m1(r1Var, iVar, 1));
                break;
            }
        }
        return Unit.f186387a;
    }
}
