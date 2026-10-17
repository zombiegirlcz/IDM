package dca;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f112835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f112836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f112837y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Continuation continuation, r rVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f112837y = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(continuation, this.f112837y, 0);
                pVar.f112835w = flowCollector;
                pVar.f112836x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(continuation, this.f112837y, 1);
                pVar2.f112835w = flowCollector;
                pVar2.f112836x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dca.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
