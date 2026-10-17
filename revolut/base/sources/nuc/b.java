package nuc;

import cli.y;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.u9;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ HiddenTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(HiddenTransactionsScreen hiddenTransactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hiddenTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        HiddenTransactionsScreen hiddenTransactionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) hiddenTransactionsScreen.R2();
                y yVar = aVar2.f85588t;
                ihm.b bVar = aVar2.f85587s;
                k kVar = ((h) ((j2) yVar.f22677a).getValue()).e;
                if (kVar instanceof i) {
                    aVar2.H2(yVar, new nrb.c(29));
                    bVar.onNext(new u9(true));
                } else if (kVar instanceof j) {
                    aVar2.H2(yVar, new n(0));
                    aVar2.B2();
                } else if (((h) ((j2) yVar.f22677a).getValue()).f219285c) {
                    aVar2.H2(aVar2.f85588t, new n(1));
                    bVar.onNext(new u9(true));
                } else {
                    aVar2.B2();
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar4 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) hiddenTransactionsScreen.R2();
                if (!((h) ((j2) aVar4.f85588t.f22677a).getValue()).d.isEmpty()) {
                    oki.h.v2(aVar4.u, HiddenTransactionsScreenContract$ModalStep.HideTransactionsConfirmation.f85580a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
