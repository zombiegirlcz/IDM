package dyg;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import do8.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a f121119w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121119w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f121119w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f121119w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f121119w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            default:
                l lVar4 = new l(this.f121119w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((vyg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar = this.f121119w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xi0.b bVar = (xi0.b) data.getContent();
                if (bVar != null) {
                    aVar.H2(aVar.v, new dv5.p(2, bVar));
                }
                break;
            case 1:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new bzg.r(disclaimerParams, 1));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new t(data2, 16));
                break;
            default:
                vyg.a aVar5 = (vyg.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new o(aVar5, 0));
                break;
        }
        return Unit.f186387a;
    }
}
