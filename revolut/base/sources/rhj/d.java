package rhj;

import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import dej.t1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimExpiredSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimExpiredSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((EsimDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            String str = ((t1) obj3).f113656l;
            if (str != null) {
                lVar.o.c(null, str, false, new re3.d(8));
                lVar.f254503t.getClass();
                lVar.X1(nkj.d.a());
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Can not copy phone number: primaryPhoneNumber is null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimExpiredSubscriptionsScreenModel", null, illegalStateException, h0Var);
                Unit unit = Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
