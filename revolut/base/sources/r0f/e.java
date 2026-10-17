package r0f;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ McyExchangeRateScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(McyExchangeRateScreen mcyExchangeRateScreen, Continuation continuation) {
        super(2, continuation);
        this.u = mcyExchangeRateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z3l.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.u.R2();
        j71.c cVar = (j71.c) ((f) ((j2) kVar.v.f22677a).getValue()).f250787a.getContent();
        if (cVar != null && (aVar = cVar.e) != null) {
            kVar.f250797q.x(kVar.f250798r.c(aVar));
        }
        return Unit.f186387a;
    }
}
