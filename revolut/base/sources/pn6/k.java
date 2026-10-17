package pn6;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ l u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.C1(u0.b(jbb.a.a(ibb.c.f160140a, null, null, u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31))), 6)));
        return Unit.f186387a;
    }
}
