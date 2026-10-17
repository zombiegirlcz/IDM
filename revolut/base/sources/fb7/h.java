package fb7;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenAccountsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenAccountsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh model = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) b0VarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        i0Var.A1(new h0(model, i0Var, null), new yi5.b(25));
        return Unit.f186387a;
    }
}
