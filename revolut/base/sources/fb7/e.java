package fb7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import fag.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ HiddenAccountsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = hiddenAccountsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0Var = (i0) this.u.d();
        i0Var.H2(i0Var.v, new o0(17));
        j2 j2Var = i0Var.u;
        j2Var.getClass();
        j2Var.g(null, qfe.j.f245295a);
        return Unit.f186387a;
    }
}
