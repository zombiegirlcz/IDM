package zbj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDepositsOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CryptoDepositsOverviewController cryptoDepositsOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDepositsOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) sVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "REVOLUT_FRIENDS_ADD_NEW_CONTACT_ITEM_ID")) {
            cVar.M();
        } else if (Intrinsics.f(str, "REVOLUT_FRIENDS_PERMISSION_ITEM_ID")) {
            ((pn3.b) cVar.f100092t).c(cVar, new j0(4));
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof zm3.l) {
                cVar.j0((zm3.l) obj3, ((q) ((j2) cVar.F.f22677a).getValue()).f320926b);
            }
        }
        return Unit.f186387a;
    }
}
