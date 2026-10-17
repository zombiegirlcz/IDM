package ff4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0Var = this.v;
        j60.a.v(b0Var.f134711s, false, null, 3);
        Object obj3 = model.u;
        if (obj3 instanceof fu3.b) {
            b0Var.H2(b0Var.f134712t, new f0d.l(b0Var, obj3, 26));
            b0Var.M2();
        }
        return Unit.f186387a;
    }
}
