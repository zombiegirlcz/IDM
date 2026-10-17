package fmf;

import aw0.k7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import elf.c1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransactionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TransactionDetailsScreen transactionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        TransactionDetailsScreen transactionDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0 n0Var = (n0) transactionDetailsScreen.d();
                n0Var.getClass();
                n0Var.l2(new ewa.d(n0Var, continuation, 28), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0 n0Var2 = (n0) transactionDetailsScreen.d();
                c1 c1Var = n0Var2.f136404s;
                cmf.g gVar = ((e0) ((j2) n0Var2.u.f22677a).getValue()).f136388b;
                cmf.h hVar = gVar instanceof cmf.h ? (cmf.h) gVar : null;
                Clause clause = hVar != null ? hVar.f25231a : null;
                if (clause != null) {
                    f01.a uiKitResources = c1Var.f127304l;
                    Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                    MoneyClause moneyClause = clause instanceof MoneyClause ? (MoneyClause) clause : null;
                    MoneyClause moneyClauseB = moneyClause == null ? null : MoneyClause.b(moneyClause, null, new MoneyClause.Format.Defaults(k7.NEVER, null, true, false, 10), null, null, 9);
                    CharSequence charSequenceB = moneyClauseB == null ? null : uiKitResources.b(moneyClauseB);
                    if (charSequenceB != null) {
                        c1Var.f127305m.c(null, charSequenceB, false, new e58.e(c1Var, 17));
                    }
                } else {
                    c1Var.getClass();
                }
                break;
        }
        return Unit.f186387a;
    }
}
