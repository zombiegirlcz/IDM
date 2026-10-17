package rhj;

import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import dej.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimExpiredSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimExpiredSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((EsimDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimDetailsDelegate.Model model = (EsimDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarD3 = this.v.R2();
        Object obj3 = model.f52249j;
        l lVar = (l) jVarD3;
        lVar.getClass();
        if (obj3 instanceof t1) {
            lVar.C2(new h(((t1) obj3).f113650a));
        }
        return Unit.f186387a;
    }
}
