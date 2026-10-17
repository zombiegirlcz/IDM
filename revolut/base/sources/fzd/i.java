package fzd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = consolidatedStatementCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.R2();
        uVar.H2(uVar.u, new fwf.n(22));
        uVar.n2(new r(uVar, null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
