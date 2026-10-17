package bof;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f17417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f17419y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, q qVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f17419y = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f17419y, continuation);
                pVar.f17417w = flowCollector;
                pVar.f17418x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(1, this.f17419y, continuation);
                pVar2.f17417w = flowCollector;
                pVar2.f17418x = obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
