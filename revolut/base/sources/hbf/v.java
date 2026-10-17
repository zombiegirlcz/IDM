package hbf;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a f150683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f150683w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f150683w, continuation);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(1, this.f150683w, continuation);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(2, this.f150683w, continuation);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(3, this.f150683w, continuation);
                vVar4.v = obj2;
                return vVar4;
            default:
                v vVar5 = new v(4, this.f150683w, continuation);
                vVar5.v = obj2;
                return vVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((TransferRequest) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar = this.f150683w;
        switch (i) {
            case 0:
                TransferRequest transferRequest = (TransferRequest) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new h1k.k(data, 19));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new h1k.k(data2, 20));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new h1k.k(data3, aVar));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new fvk.q(list, 20));
                break;
        }
        return Unit.f186387a;
    }
}
