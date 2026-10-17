package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f190708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f190709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k3 f190710y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, Continuation continuation, k3 k3Var) {
        super(3, continuation);
        this.u = i;
        this.f190710y = k3Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b1 b1Var = new b1(0, continuation, this.f190710y);
                b1Var.f190708w = flowCollector;
                b1Var.f190709x = obj3;
                return b1Var.invokeSuspend(Unit.f186387a);
            case 1:
                b1 b1Var2 = new b1(1, continuation, this.f190710y);
                b1Var2.f190708w = flowCollector;
                b1Var2.f190709x = obj3;
                return b1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b1 b1Var3 = new b1(2, continuation, this.f190710y);
                b1Var3.f190708w = flowCollector;
                b1Var3.f190709x = obj3;
                return b1Var3.invokeSuspend(Unit.f186387a);
            default:
                b1 b1Var4 = new b1(3, continuation, this.f190710y);
                b1Var4.f190708w = flowCollector;
                b1Var4.f190709x = obj3;
                return b1Var4.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
