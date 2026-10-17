package b9c;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFeatureConfig;
import io3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ InStorePaymentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InStorePaymentScreen inStorePaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = inStorePaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((AmountEditDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVarA;
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) ((f) this.u.Z.getValue());
        String str2 = ((e) kVar.t2()).d;
        io3.d dVarY = hb9.b.y((e) kVar.t2());
        if (dVarY == null || (str = dVarY.f163147c) == null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.b.f306273h;
        } else {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str);
        }
        kVar.C1(new BridgeDestination(new FeatureCommand(new CurrencyChooserFeatureConfig.BalanceChooser(str2, bVarA, l.CURRENT, null, false, 4, 6264))));
        return Unit.f186387a;
    }
}
