package chk;

import chk.c;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.C2(c.a.f24322a);
        return Unit.f186387a;
    }
}
