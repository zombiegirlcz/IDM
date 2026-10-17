package wi6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AccountsSelectionScreen accountsSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountsSelectionScreen accountsSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = accountsSelectionScreen.e3();
                ei6.d dVar = ((h) ((j2) tVarE3.f297833t.f22677a).getValue()).f297807a;
                tVarE3.C2(new k(dVar != null ? dVar.f126446a : null));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE32 = accountsSelectionScreen.e3();
                tVarE32.H2(tVarE32.f297833t, new wgk.f(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE33 = accountsSelectionScreen.e3();
                h hVar = (h) ((j2) tVarE33.f297833t.f22677a).getValue();
                ei6.d dVar2 = hVar.f297807a;
                tVarE33.C2(new j(a1.l(a1.l(a1.l(hVar.f297809c, hVar.e), hVar.d), hVar.f), dVar2 != null ? dVar2.f126446a : null));
                break;
        }
        return Unit.f186387a;
    }
}
