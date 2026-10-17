package g4b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdPositionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CfdPositionsController cfdPositionsController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdPositionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.positions.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.positions.a) hVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof y49.e) {
            n nVar = aVar2.f82267q;
            aVar2.C1(new CfdTradingFeatureConfig.CfdPositionsDestination(nVar.f140452a, nVar.f140453b, ((y49.e) obj3).f310837a, nVar.d));
        }
        return Unit.f186387a;
    }
}
