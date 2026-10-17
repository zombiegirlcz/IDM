package k4a;

import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ u u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Continuation continuation) {
        super(1, continuation);
        this.u = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = this.u;
        NewTransferScreenContract$InputData newTransferScreenContract$InputData = uVar.u;
        return uVar.C1(new BridgeDestination(new FeatureCommand(new TransferBridgeFeatureConfig.PaymentsSearch(newTransferScreenContract$InputData.f80119a, g3a.g.a(newTransferScreenContract$InputData.d), newTransferScreenContract$InputData.f80120b, 18))));
    }
}
