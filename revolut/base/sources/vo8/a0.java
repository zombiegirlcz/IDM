package vo8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.v;
        ufm.f fVarM = bVar.f77333q.m(bVar.o.f77325a, new in8.g(true));
        this.u = 1;
        Object objB = nim.a.b(fVarM, this);
        return objB == aVar ? aVar : objB;
    }
}
