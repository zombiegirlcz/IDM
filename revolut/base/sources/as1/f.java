package as1;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TapiTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TapiTransferReviewScreen tapiTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tapiTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ur1.a aVar;
        io3.d dVar;
        String str;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String listId = model.f51781a;
        a0 a0Var = (a0) mVarE3;
        cli.y yVar = a0Var.f8759w;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1895037359) {
            if (iHashCode != -1890119929) {
                if (iHashCode == 268971352 && listId.equals("ID_EXCHANGE_RATE") && (aVar = ((g) ((j2) yVar.f22677a).getValue()).d) != null && (dVar = aVar.f282231b) != null && (str = dVar.f163147c) != null) {
                    xi0.b.Companion.getClass();
                    a0Var.C2(new i(xi0.a.a(str)));
                }
            } else if (listId.equals("ID_PAYMENT_FROM")) {
                ur1.a aVar3 = ((g) ((j2) yVar.f22677a).getValue()).d;
                a0Var.l2(new v(a0Var, aVar3 != null ? aVar3.f282231b : null, null), new yi5.b(26));
            }
        } else if (listId.equals("ID_FEES")) {
            ApmQuote apmQuote = ((g) ((j2) yVar.f22677a).getValue()).e;
            a0Var.C2(new j(apmQuote != null ? apmQuote.d : null));
        }
        return Unit.f186387a;
    }
}
