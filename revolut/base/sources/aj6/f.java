package aj6;

import aj6.n;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountsSelectionAuScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AccountsSelectionAuScreen accountsSelectionAuScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountsSelectionAuScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        aii.r rVar = n.a.f5418a;
        n.c cVar = n.c.f5420a;
        AccountsSelectionAuScreen accountsSelectionAuScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) accountsSelectionAuScreen.e3();
                i iVar = (i) ((j2) xVar.u.f22677a).getValue();
                xVar.C2(new m(iVar.f5408c, iVar.d));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) accountsSelectionAuScreen.e3();
                if (((i) ((j2) xVar2.u.f22677a).getValue()).f5410h) {
                    rVar = cVar;
                }
                xVar2.C2(rVar);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar3 = (x) accountsSelectionAuScreen.e3();
                xVar3.H2(xVar3.u, new aik.d(2));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar4 = (x) accountsSelectionAuScreen.e3();
                if (((i) ((j2) xVar4.u.f22677a).getValue()).f5410h) {
                    rVar = cVar;
                }
                xVar4.C2(rVar);
                break;
        }
        return Unit.f186387a;
    }
}
