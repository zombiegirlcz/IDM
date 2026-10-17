package j45;

import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SelectAccountV2Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SelectAccountV2Controller selectAccountV2Controller, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = selectAccountV2Controller;
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
        SelectAccountV2Controller selectAccountV2Controller = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar = (com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) selectAccountV2Controller.e3();
                x35.e eVar = ((e) ((j2) bVar.f70305t.f22677a).getValue()).f171296b;
                if (eVar != null) {
                    bVar.C2(new v35.b(eVar));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) selectAccountV2Controller.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
