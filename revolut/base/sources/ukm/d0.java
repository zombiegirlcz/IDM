package ukm;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d0 extends kotlin.jvm.internal.q implements Function3 {
    public static final d0 f = new d0(3, e0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e0 e0Var = (e0) obj2;
        int i = e0.f;
        e0Var.b0();
        ((Function3) ((mp.p) e0Var.d.getOnSend()).f207710c).invoke(e0Var, (flm.i) obj3, obj4);
        return Unit.f186387a;
    }
}
