package qll;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ CombinedAuthenticationUnifiedScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen, Continuation continuation) {
        super(2, continuation);
        this.u = combinedAuthenticationUnifiedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) this.u.R2();
        aVar2.H2(aVar2.D, new ql6.s(3));
        return Unit.f186387a;
    }
}
