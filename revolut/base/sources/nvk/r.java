package nvk;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nvg.b0;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a f219731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f219731w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f219731w, continuation);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(1, this.f219731w, continuation);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(2, this.f219731w, continuation);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar = this.f219731w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new nsl.g(data, 7));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new nsl.g(data2, 8));
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uqk.e eVar = (uqk.e) pair.f186385a;
                p pVar = (p) ((Data) pair.f186386b).getContent();
                if (pVar != null) {
                    aVar.H2(aVar.u, new b0(eVar, pVar, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
