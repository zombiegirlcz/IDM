package kvl;

import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import klf.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = ((Boolean) obj2).booleanValue();
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((t) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!z) {
            return zi0.c.i(AutoTopUpStatus.Unavailable.f91772a);
        }
        a0 a0Var = this.v;
        return nim.a.v(vkm.q.Q(a0Var.f190161s, new a3(null, a0Var, 11)), new kvg.j(6));
    }
}
