package qn9;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ PayInStoreScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PayInStoreScreen payInStoreScreen, Continuation continuation) {
        super(2, continuation);
        this.u = payInStoreScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVarA;
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.u.T2();
        String str2 = ((f) qVar.t2()).d;
        io3.d dVarU = knm.b.u((f) qVar.t2());
        if (dVarU == null || (str = dVarU.f163147c) == null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.b.f306273h;
        } else {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str);
        }
        qVar.C1(new BridgeDestination(new FeatureCommand(new CurrencyChooserFeatureConfig.BalanceChooser(str2, bVarA, io3.l.CURRENT, null, false, 4, 6264))));
        return Unit.f186387a;
    }
}
