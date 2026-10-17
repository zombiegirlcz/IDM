package j6a;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountDetailsPaymentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AccountDetailsPaymentController accountDetailsPaymentController, Continuation continuation) {
        super(2, continuation);
        this.v = accountDetailsPaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        String listId = model.f53337a;
        com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_SHARE_BTN")) {
            g gVar = (g) ((j2) aVar2.f80279w.f22677a).getValue();
            dda.a aVar3 = (dda.a) gVar.f171700a.getContent();
            ArrayList arrayList = aVar3 != null ? aVar3.f113159a : null;
            if (arrayList == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot share: Accounts list is missing in state");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                dda.f fVarN = oc.c.n(gVar.f171701b, arrayList);
                dda.d dVar = fVarN instanceof dda.d ? (dda.d) fVarN : null;
                if (dVar == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Selected account is not shareable");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    aVar2.C1(new ExternalDestination.ByIntent(((s70.b) aVar2.u).f("", aVar2.f80275q.h(dVar, dVar.f113168b.f306286a), null), null));
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unknown list id '", listId, "'"));
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var3);
        }
        return Unit.f186387a;
    }
}
