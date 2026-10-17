package occ;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n8i.b1;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f224213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f224214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a f224215y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f224215y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, this.f224215y, continuation);
                iVar.f224213w = flowCollector;
                iVar.f224214x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(1, this.f224215y, continuation);
                iVar2.f224213w = flowCollector;
                iVar2.f224214x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f224213w;
                    com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar2 = this.f224215y;
                    kcc.b bVar = aVar2.f84681q;
                    String id10 = aVar2.f84684t.f84677a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    gcc.g gVar = bVar.f182700a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = gVar.f142405h.b(id10, loadingStrategy);
                    this.f224213w = null;
                    this.f224214x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f224213w;
                    com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar4 = this.f224215y;
                    Flow flowE = boh.f.e(((nyb.b) aVar4.f84680p).c(), new b1(aVar4, 8));
                    this.f224213w = null;
                    this.f224214x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
