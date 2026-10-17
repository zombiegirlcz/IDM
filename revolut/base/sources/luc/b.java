package luc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsController;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenAccountsAndTransactionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HiddenAccountsAndTransactionsController hiddenAccountsAndTransactionsController, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenAccountsAndTransactionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.P.getValue();
        Intrinsics.h(model);
        com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a) hVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1860770909) {
            if (iHashCode != -488439884) {
                if (iHashCode == 848935790 && str.equals("SECRET_ACCOUNTS_CELL_ID")) {
                    aVar2.C2(f.f200218a);
                }
            } else if (str.equals("HIDDEN_ACCOUNTS_CELL_ID")) {
                aVar2.C2(d.f200216a);
            }
        } else if (str.equals("HIDDEN_TRANSACTIONS_CELL_ID")) {
            oki.h.v2(aVar2.f85579p, HiddenAccountsAndTransactionsControllerContract$Step.HiddenTransactionsAuthentication.f85578a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
        }
        return Unit.f186387a;
    }
}
