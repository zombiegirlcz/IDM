package fm5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.strategies.impl.ui.crypto_strategies.CryptoStrategiesController;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoStrategiesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CryptoStrategiesController cryptoStrategiesController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoStrategiesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.L.getValue();
        Intrinsics.h(model);
        l lVar = (l) cVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -300169185:
                if (str.equals("CRYPTO_COLLECTIONS_STRATEGY_ID")) {
                    lVar.C1(new BridgeDestination(new FeatureCommand(CryptoInvestFeatureConfig.CollectionsHome.f71499a)));
                }
                break;
            case 607441294:
                if (str.equals("CRYPTO_RECURRING_BUY_STRATEGY_ID")) {
                    a2 a2Var = lVar.u;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    lVar.u = lVar.n2(new g(lVar, null), new whi.b(6));
                }
                break;
            case 1174651806:
                if (str.equals("CRYPTO_SPARE_CHANGE_STRATEGY_ID")) {
                    a2 a2Var2 = lVar.f136033t;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    lVar.f136033t = lVar.n2(new i(lVar, null), new whi.b(6));
                }
                break;
            case 2019780027:
                if (str.equals("CRYPTO_TPSL_STRATEGY_ID")) {
                    a2 a2Var3 = lVar.v;
                    if (a2Var3 != null) {
                        a2Var3.f(null);
                    }
                    lVar.v = lVar.n2(new k(lVar, null), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
