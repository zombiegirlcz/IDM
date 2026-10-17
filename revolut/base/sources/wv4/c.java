package wv4;

import aw0.n6;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreen;
import dx4.o1;
import dx4.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardStatementBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardStatementBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dx4.l lVar;
        zm4.a aVar;
        o1 o1Var;
        dx4.l lVar2;
        zm4.a aVar2;
        int i = this.u;
        t1 t1Var = null;
        CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) creditCardStatementBottomSheetScreen.R2();
                e eVar = (e) ((f) ((j2) iVar.f300297s.f22677a).getValue()).f300291a.getContent();
                if (eVar != null && (aVar = eVar.f300289a) != null) {
                    t1Var = aVar.f323380b;
                }
                if (t1Var != null && (lVar = t1Var.f120774b.f120700b) != null) {
                    c8g.c.i(iVar, lVar);
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) creditCardStatementBottomSheetScreen.R2();
                e eVar2 = (e) ((f) ((j2) iVar2.f300297s.f22677a).getValue()).f300291a.getContent();
                if (eVar2 != null && (aVar2 = eVar2.f300289a) != null) {
                    t1Var = aVar2.f323380b;
                }
                if (t1Var != null && (o1Var = t1Var.f120775c) != null && (lVar2 = o1Var.f120700b) != null) {
                    c8g.c.i(iVar2, lVar2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
