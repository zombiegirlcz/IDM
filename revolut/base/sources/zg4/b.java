package zg4;

import c84.m;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoWorkflowOnboardingDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) this.v, continuation, 0);
            default:
                return new b((ec5.c) this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) obj3).C2(new m(0));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ec5.d dVar = ((ec5.c) obj3).f124434c;
                return (dVar == null || (str = dVar.f124437c) == null) ? DummyCommand.f98635a : u0.f(new CryptoWorkflowOnboardingDestination(str));
        }
    }
}
