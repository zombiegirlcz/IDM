package bl6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.screen.banks.PseBanksScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PseBanksScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PseBanksScreen pseBanksScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pseBanksScreen;
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
        o.b(obj2);
        l lVarD3 = this.u.d();
        lVarD3.getClass();
        lVarD3.l2(new aza.g(lVarD3, null, 15), new yi5.b(26));
        return Unit.f186387a;
    }
}
