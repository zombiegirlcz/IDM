package gzg;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a f148124w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f148124w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f148124w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f148124w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            case 2:
                u uVar3 = new u(this.f148124w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
            default:
                u uVar4 = new u(this.f148124w, continuation, 3);
                uVar4.v = obj2;
                return uVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar = this.f148124w;
        switch (i) {
            case 0:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95137x, new bzg.r(disclaimerParams, 2));
                break;
            case 1:
                vyg.a aVar3 = (vyg.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95137x, new dyg.o(aVar3, 1));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95137x, new ghg.r(data, 27));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95137x, new ghg.r(data2, 28));
                break;
        }
        return Unit.f186387a;
    }
}
