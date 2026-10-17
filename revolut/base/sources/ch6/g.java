package ch6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CreateMandateScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CreateMandateScreen createMandateScreen, Continuation continuation) {
        super(2, continuation);
        this.u = createMandateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.u.R2();
        bVar.H2(bVar.f72449y, new cge.g(8));
        return Unit.f186387a;
    }
}
