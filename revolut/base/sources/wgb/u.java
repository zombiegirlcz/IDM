package wgb;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_promotion.b u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new ExternalDestination.Browser(this.v, null));
    }
}
