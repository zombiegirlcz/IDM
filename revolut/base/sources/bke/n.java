package bke;

import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((PersistedBackground) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PersistedBackground persistedBackground = (PersistedBackground) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.f16373l.c(new m(persistedBackground, 0));
        return Unit.f186387a;
    }
}
