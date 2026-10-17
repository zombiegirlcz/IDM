package wi6;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AccountsSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AccountsSelectionScreen accountsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = accountsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.u.d();
        ei6.d dVar = ((h) ((j2) tVarE3.f297833t.f22677a).getValue()).f297807a;
        tVarE3.C2(new l(dVar != null ? dVar.f126446a : null));
        return Unit.f186387a;
    }
}
