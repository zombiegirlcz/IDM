package kbi;

import cli.y;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerController;
import com.revolut.feature_retail_user_declarations.employer.screen.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EmployerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EmployerController employerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = employerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmployerController employerController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.employer.screen.b) employerController.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.employer.screen.b bVar = (com.revolut.feature_retail_user_declarations.employer.screen.b) employerController.e3();
                y yVar = bVar.f97647q;
                bVar.C2(new h(((f) ((j2) yVar.f22677a).getValue()).f182599b, ((f) ((j2) yVar.f22677a).getValue()).f182600c));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.employer.screen.b) employerController.e3()).C2(a.C0594a.f97645a);
                break;
        }
        return Unit.f186387a;
    }
}
