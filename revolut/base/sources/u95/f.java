package u95;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ OverdraftDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OverdraftDetailsScreen overdraftDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = overdraftDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.overdraft.impl.ui.details.a aVar2 = (com.revolut.feature.credit.overdraft.impl.ui.details.a) this.u.R2();
        aVar2.H2(aVar2.f70643r, new u8c.c(7));
        aVar2.J2();
        aVar2.I2();
        return Unit.f186387a;
    }
}
