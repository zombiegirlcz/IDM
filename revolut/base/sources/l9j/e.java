package l9j;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$Parcel$FaqParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoEarningScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoEarningScreen cryptoEarningScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoEarningScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Object obj3 = model.e;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) hVarE3;
        aVar2.getClass();
        if (obj3 instanceof CryptoEarningScreenContract$Parcel$FaqParcel) {
            aVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.crypto-staking", 2))));
        }
        return Unit.f186387a;
    }
}
