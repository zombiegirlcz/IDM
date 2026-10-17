package pf9;

import com.revolut.feature.apm.bills.boleto.api.BoletoFeatureConfig;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ap1.d f235528w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ap1.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f235528w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f235528w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            kdh.b bVar = eVar.f235530m;
            this.u = 1;
            obj2 = ((vp1.c) ((wo1.b) bVar.f182899b)).e(this.f235528w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return eVar.A2(u0.b(new FeatureCommand(new BoletoFeatureConfig.BoletoPayment((BillSearchBoletoResult) obj2))));
    }
}
