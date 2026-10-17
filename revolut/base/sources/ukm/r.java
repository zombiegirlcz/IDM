package ukm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.q implements Function2 {
    public static final r f = new r(2, s.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        long jLongValue = ((Number) obj2).longValue();
        a0 a0Var = (a0) obj3;
        a0 a0Var2 = s.f280826a;
        q qVar = a0Var.e;
        Intrinsics.h(qVar);
        return new a0(jLongValue, a0Var, qVar, 0);
    }
}
