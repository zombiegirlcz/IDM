package zbj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n0 n0Var = new n0(this.v, continuation);
        n0Var.u = obj2;
        return n0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar = (q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = this.v;
        cli.y yVar = cVar.F;
        cVar.H2(yVar, new za9.c(qVar, 6));
        if (!((q) ((j2) yVar.f22677a).getValue()).i) {
            int i = k0.f320918a[cVar.f100090r.d.ordinal()];
            int i2 = 29;
            if (i == 1) {
                List list = (List) qVar.f.getContent();
                if (list == null || list.size() <= 1) {
                    cVar.J2();
                } else {
                    cVar.K2();
                    cVar.H2(yVar, new z8h.b(i2));
                }
            } else if (i == 2) {
                dj0.d dVar = (dj0.d) qVar.f320929h.g();
                if (dVar != null) {
                    oki.h.v2(cVar.G, new CryptoDepositsOverviewControllerContract$ModalStep.MinimumDeposit(dVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    cVar.H2(yVar, new z8h.b(i2));
                } else {
                    cVar.J2();
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.J2();
            }
        }
        return Unit.f186387a;
    }
}
