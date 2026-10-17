package us4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import unc.y;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a f282439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f282439w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f282439w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f282439w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a aVar = this.f282439w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f69469r, new y(data, 12));
                break;
            default:
                g gVar = (g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f69469r, new n(gVar, 1));
                break;
        }
        return Unit.f186387a;
    }
}
