package dh4;

import com.revolut.data.model.Data;
import dcf.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a f114760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f114760w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f114760w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f114760w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar = this.f114760w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f68259t, new g0(data, 10));
                break;
            default:
                ax4.b bVar = (ax4.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f68259t, new ah4.f(bVar, 2));
                break;
        }
        return Unit.f186387a;
    }
}
