package j6a;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.q;
import vkm.y;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f171710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f171711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a f171712y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Continuation continuation, com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f171712y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(continuation, this.f171712y, 0);
                lVar.f171710w = flowCollector;
                lVar.f171711x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            default:
                l lVar2 = new l(continuation, this.f171712y, 1);
                lVar2.f171710w = flowCollector;
                lVar2.f171711x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f171710w;
                    com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar2 = this.f171712y;
                    Continuation continuation = null;
                    wkm.l lVarQ = q.Q(new y(zi0.c.w(aVar2.f80276r.e(w4l.h.f294642c)), new im2.b(3, 1, continuation)), new l(continuation, aVar2, 1));
                    this.f171710w = null;
                    this.f171711x = null;
                    this.v = 1;
                    if (q.u(flowCollector, lVarQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar3 = this.f171712y;
                cli.y yVar = aVar3.f80279w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f171710w;
                    Data data = (Data) this.f171711x;
                    Pair pair = (Pair) data.getContent();
                    fo3.c cVar = pair != null ? (fo3.c) pair.f186385a : null;
                    if (cVar != null) {
                        kbb.c cVar2 = aVar3.f80274p;
                        String str = cVar.f136801a;
                        xi0.b bVar = ((g) ((j2) yVar.f22677a).getValue()).d;
                        if (bVar == null) {
                            bVar = cVar.d;
                        }
                        gVar = rd0.e.b(cVar2.G(w4l.h.f294642c, str, bVar, io3.l.CURRENT, io3.i.INTERNAL, ((g) ((j2) yVar.f22677a).getValue()).f171702c));
                    } else {
                        gVar = new go.g(new Data(null, data.getError(), false, 5, null), 2);
                    }
                    this.f171710w = null;
                    this.f171711x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, gVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
