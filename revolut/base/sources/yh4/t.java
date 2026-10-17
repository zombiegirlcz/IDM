package yh4;

import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SepaDirectDebitSetUpController f313769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(SepaDirectDebitSetUpController sepaDirectDebitSetUpController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313769w = sepaDirectDebitSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f313769w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f313769w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dz3.a aVar = (dz3.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SepaDirectDebitSetUpController sepaDirectDebitSetUpController = this.f313769w;
        switch (i) {
            case 0:
                dz3.a aVar = (dz3.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) sepaDirectDebitSetUpController.e3()).J2(new d(aVar));
                break;
            default:
                dz3.a aVar3 = (dz3.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) sepaDirectDebitSetUpController.e3()).J2(new e(aVar3));
                break;
        }
        return Unit.f186387a;
    }
}
