package ny4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nxa.v;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ DirectDebitAccountConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DirectDebitAccountConfirmationScreen directDebitAccountConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = directDebitAccountConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.u.Y.getValue();
        kVar.x2(new v(3));
        kVar.n2(new nt4.f(kVar, null, 7), new i(kVar, 0));
        return Unit.f186387a;
    }
}
