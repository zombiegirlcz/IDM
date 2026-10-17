package rq4;

import cli.y;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CreditLimitCapChangeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CreditLimitCapChangeScreen creditLimitCapChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditLimitCapChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        jl4.a aVar;
        i iVar;
        dj0.d dVar;
        Long l2;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.u.e3();
        y yVar = cVar.C;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        i iVar2 = (i) ((j) j2Var.getValue()).f256465a.getContent();
        if (iVar2 != null && (aVar = iVar2.f256462a) != null && (iVar = (i) ((j) j2Var2.getValue()).f256465a.getContent()) != null && (dVar = iVar.f256463b) != null && (l2 = ((j) j2Var2.getValue()).f256467c) != null) {
            dj0.d dVar2 = new dj0.d(l2.longValue(), aVar.f);
            oki.h.v2(cVar.B, new CreditLimitCapChangeScreenContract$ModalStep.AvailableToSpend(dVar2, dVar, pyd.c.H(dVar2, dVar), aVar.e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
