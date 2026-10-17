package gld;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f144630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f144631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f144632y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, a0 a0Var, int i) {
        super(3, continuation);
        this.u = i;
        this.f144632y = a0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f144632y, 0);
                cVar.f144630w = flowCollector;
                cVar.f144631x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c(continuation, this.f144632y, 1);
                cVar2.f144630w = flowCollector;
                cVar2.f144631x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c(continuation, this.f144632y, 2);
                cVar3.f144630w = flowCollector;
                cVar3.f144631x = obj3;
                return cVar3.invokeSuspend(Unit.f186387a);
            default:
                c cVar4 = new c(continuation, this.f144632y, 3);
                cVar4.f144630w = flowCollector;
                cVar4.f144631x = obj3;
                return cVar4.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gld.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
