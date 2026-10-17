package lhh;

import ael.q0;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import l9j.j;
import vkm.q;
import w4l.h;
import ybl.k;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c84.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c84.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c84.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jhi.b bVarG = mo3.a.g(nim.a.v(((q0) ((k) cVar.f22077m)).o(((TransferSubjectId) cVar.f22078n).getF95657a(), h.f294642c), new laj.b(cVar, 20)), null, new j(17), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n.P2(cVar, cVar.o2(new ygh.a((TradingAccount.TaxAdvantage) obj2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
