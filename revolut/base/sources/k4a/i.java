package k4a;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentVendorsBeneCreationFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NewTransferScreen newTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD = this.v.d();
        String listId = model.f53337a;
        u uVar = (u) lVarD;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        uVar.C1(new BridgeDestination(new FeatureCommand(PaymentVendorsBeneCreationFeatureConfig.f101970g)));
        return Unit.f186387a;
    }
}
