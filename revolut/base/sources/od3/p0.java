package od3;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 extends gim.i implements Function1 {
    public final /* synthetic */ ActionsView.Item u;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ActionsView.Item item, Continuation continuation, s0 s0Var) {
        super(1, continuation);
        this.u = item;
        this.v = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p0(this.u, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.f58324n;
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str == null) {
            throw new NullPointerException("Parcel of action with id ID_ACTION_CHANGE_CURRENCY should be string currency code");
        }
        s0 s0Var = this.v;
        j60.a aVar2 = s0Var.v;
        t0 t0Var = s0Var.f224302t;
        boolean z = ((l) s0Var.t2()).f224276a == uc3.d.PLAN;
        t0Var.getClass();
        aVar2.x(t0.a(str, z));
        return Unit.f186387a;
    }
}
