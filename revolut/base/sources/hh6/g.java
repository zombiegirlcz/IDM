package hh6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import he4.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ MandateDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MandateDetailsScreen mandateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = mandateDetailsScreen;
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
        ((p) this.u.T2()).x2(new r(28));
        return Unit.f186387a;
    }
}
