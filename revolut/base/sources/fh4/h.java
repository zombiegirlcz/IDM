package fh4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RefinancingAccountDetailsInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = refinancingAccountDetailsInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RefinancingAccountDetailsInputScreen refinancingAccountDetailsInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) refinancingAccountDetailsInputScreen.e3()).C2(j.f135138a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) refinancingAccountDetailsInputScreen.e3();
                cVar.getClass();
                cVar.n2(new ewa.d(cVar, null, 17), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
