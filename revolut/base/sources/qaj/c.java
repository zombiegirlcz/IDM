package qaj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewlyAddedCryptoController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewlyAddedCryptoController newlyAddedCryptoController, Continuation continuation) {
        super(2, continuation);
        this.v = newlyAddedCryptoController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "ERROR_STATE_ID");
        NewlyAddedCryptoController newlyAddedCryptoController = this.v;
        if (zF) {
            ((g) newlyAddedCryptoController.R2()).I2();
        } else if (Intrinsics.f(str, "GO_TO_ALL_CRYPTO_LIST_ID")) {
            g gVar = (g) newlyAddedCryptoController.R2();
            gVar.getClass();
            gVar.C1(new BridgeDestination(new FeatureCommand(CryptoInvestFeatureConfig.AllCrypto.f71497a)));
        }
        return Unit.f186387a;
    }
}
