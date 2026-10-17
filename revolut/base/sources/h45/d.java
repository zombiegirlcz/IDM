package h45;

import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountController;
import gvc.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddExternalAccountController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddExternalAccountController addExternalAccountController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addExternalAccountController;
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
        AddExternalAccountController addExternalAccountController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a aVar2 = (com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a) addExternalAccountController.d();
                aVar2.getClass();
                aVar2.n2(new m(aVar2, null, 5), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.a) addExternalAccountController.d()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
