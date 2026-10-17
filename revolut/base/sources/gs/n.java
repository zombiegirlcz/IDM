package gs;

import k3k.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import qsa.u;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f146260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f146261x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f146262y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.A = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(continuation, (r) this.A, 0);
                nVar.f146260w = flowCollector;
                nVar.f146261x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n(continuation, (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a) this.A, 1);
                nVar2.f146260w = flowCollector;
                nVar2.f146261x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            case 2:
                n nVar3 = new n(continuation, (t0) this.A, 2);
                nVar3.f146260w = flowCollector;
                nVar3.f146261x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
            case 3:
                n nVar4 = new n(continuation, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.A, 3);
                nVar4.f146260w = flowCollector;
                nVar4.f146261x = obj3;
                return nVar4.invokeSuspend(Unit.f186387a);
            case 4:
                n nVar5 = new n(continuation, (u) this.A, 4);
                nVar5.f146260w = flowCollector;
                nVar5.f146261x = obj3;
                return nVar5.invokeSuspend(Unit.f186387a);
            case 5:
                n nVar6 = new n(continuation, (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.A, 5);
                nVar6.f146260w = flowCollector;
                nVar6.f146261x = obj3;
                return nVar6.invokeSuspend(Unit.f186387a);
            default:
                n nVar7 = new n(continuation, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.A, 6);
                nVar7.f146260w = flowCollector;
                nVar7.f146261x = obj3;
                return nVar7.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
