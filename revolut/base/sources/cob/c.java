package cob;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import oqk.g0;
import ssi.n;
import tof.i7;
import vf0.h;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f25519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f25520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f25521y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, e eVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f25521y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.f25521y, 0);
                cVar.f25519w = flowCollector;
                cVar.f25520x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f25521y, 1);
                cVar2.f25519w = flowCollector;
                cVar2.f25520x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        n nVarA;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f25519w;
                    Data data2 = (Data) this.f25520x;
                    e eVar = this.f25521y;
                    ssi.o oVar = eVar.f25524b;
                    try {
                        Object content = data2.getContent();
                        if (content != null) {
                            h hVar = (h) content;
                            nVarA = eVar.a((i7) hVar.f288433a, (List) hVar.f288434b, (AccountId) hVar.f288435c, (ProductAccountId) hVar.d);
                        } else {
                            nVarA = null;
                        }
                        data = new Data(nVarA, data2.getError(), data2.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data2.getLoading());
                    }
                    vkm.d dVarB = rd0.e.b(((g0) oVar).d(data, false));
                    this.f25519w = null;
                    this.f25520x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                    break;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f25519w;
                    vkm.d dVarB2 = rd0.e.b(((g0) this.f25521y.f25524b).d((Data) this.f25520x, false));
                    this.f25519w = null;
                    this.f25520x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
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
