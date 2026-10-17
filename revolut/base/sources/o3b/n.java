package o3b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.impl.screens.exitstrategies.CfdExitStrategiesSetUpController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdExitStrategiesSetUpController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CfdExitStrategiesSetUpController cfdExitStrategiesSetUpController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdExitStrategiesSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(model);
        n0 n0Var = (n0) oVarE3;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        x xVar = obj3 instanceof x ? (x) obj3 : null;
        if (xVar != null) {
            if (xVar.f221777b == null) {
                k4l.n0 n0Var2 = xVar.f221776a;
                n0.N2(n0Var, n0Var2, n0.J2(n0Var, n0Var2), u.PRICE, Boolean.TRUE, null, null, 48);
            } else {
                n0.N2(n0Var, xVar.f221776a, null, null, null, null, null, 60);
            }
        }
        return Unit.f186387a;
    }
}
