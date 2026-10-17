package wg2;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.upi.impl.screens.transfer_input_id_or_mobile.UpiTransferInputIdOrMobileScreen;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ UpiTransferInputIdOrMobileScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UpiTransferInputIdOrMobileScreen upiTransferInputIdOrMobileScreen, Continuation continuation) {
        super(2, continuation);
        this.u = upiTransferInputIdOrMobileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.u.O.getValue();
        hVar.getClass();
        hVar.C1(new BridgeDestination(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER))));
        return Unit.f186387a;
    }
}
