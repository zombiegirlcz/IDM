package u9a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoPaymentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            aVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((a3) obj3).f272581b), null, null, null, 126))));
        }
        return Unit.f186387a;
    }
}
