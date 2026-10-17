package ah4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RefinancingAccountDocumentsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RefinancingAccountDocumentsController refinancingAccountDocumentsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = refinancingAccountDocumentsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RefinancingAccountDocumentsController refinancingAccountDocumentsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) refinancingAccountDocumentsController.e3();
                hVar.C2(new i(((m) ((j2) hVar.u.f22677a).getValue()).f4900b));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar2 = (h) refinancingAccountDocumentsController.e3();
                hVar2.C2(new j(((m) ((j2) hVar2.u.f22677a).getValue()).f4900b));
                break;
        }
        return Unit.f186387a;
    }
}
