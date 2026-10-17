package qsa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f248784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f248785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f248786y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Continuation continuation, u uVar) {
        super(3, continuation);
        this.u = i;
        this.f248786y = uVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, continuation, this.f248786y);
                sVar.f248784w = flowCollector;
                sVar.f248785x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, continuation, this.f248786y);
                sVar2.f248784w = flowCollector;
                sVar2.f248785x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarO;
        kqa.a aVar;
        kqa.a aVar2;
        kqa.a aVar3;
        switch (this.u) {
            case 0:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f248784w;
                    String value = (String) this.f248785x;
                    tga.k kVar = this.f248786y.f248795y;
                    if (value != null) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = null;
                    }
                    Flow flowD = kVar.d(new mga.g(value));
                    this.f248784w = null;
                    this.f248785x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowD, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f248784w;
                    Pair pair = (Pair) this.f248785x;
                    PushToCardTransferData transferData = (PushToCardTransferData) pair.f186385a;
                    j jVar = (j) pair.f186386b;
                    u uVar = this.f248786y;
                    vrf.h hVar = uVar.z;
                    uVar.f248788p.getClass();
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    dj0.d dVarA = (jVar == null || (aVar3 = jVar.f248772a) == null) ? null : aVar3.a();
                    if (jVar == null || (aVar2 = jVar.f248772a) == null || (dVarO = pyd.c.O(aVar2.f188350a, aVar2.a())) == null) {
                        dVarO = transferData.f81532j;
                    }
                    Flow flowC = ((xrf.b) hVar).c(new vrf.i(transferData.f81532j, dVarO, dVarA, (jVar == null || (aVar = jVar.f248772a) == null) ? null : aVar.f188355j, null));
                    this.f248784w = null;
                    this.f248785x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowC, this) == aVar5) {
                        return aVar5;
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
