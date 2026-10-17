package fb7;

import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import fag.o0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ HiddenAccountsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hiddenAccountsListScreen;
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
        HiddenAccountsListScreen hiddenAccountsListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) hiddenAccountsListScreen.d();
                cli.y yVar = i0Var.v;
                j2 j2Var = i0Var.u;
                a0 a0Var = ((j) ((j2) yVar.f22677a).getValue()).f;
                boolean z = a0Var instanceof y;
                qfe.i iVar = qfe.i.f245294a;
                if (z) {
                    i0Var.H2(yVar, new o0(19));
                    j2Var.getClass();
                    j2Var.g(null, iVar);
                } else {
                    if (a0Var instanceof z) {
                        i0Var.H2(yVar, new o0(20));
                    } else if (!i0Var.o.f74671c && ((j) ((j2) yVar.f22677a).getValue()).d) {
                        i0Var.H2(i0Var.v, new o0(18));
                        j2Var.getClass();
                        j2Var.g(null, iVar);
                    }
                    i0Var.B2();
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var2 = (i0) hiddenAccountsListScreen.d();
                Set set = ((j) ((j2) i0Var2.v.f22677a).getValue()).e;
                if (set.isEmpty()) {
                    r6.b.r("There are no selected IDs to hide.");
                } else if (i0Var2.o.f74671c) {
                    i0Var2.C2(new r(set));
                } else {
                    i0Var2.A1(new esa.i(i0Var2, set, continuation, 22), new yi5.b(25));
                }
                break;
        }
        return Unit.f186387a;
    }
}
