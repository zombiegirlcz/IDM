package ox5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.ratedetails.api.navigation.RateDetailsKompotFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ifd.g f230580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, ifd.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f230580w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j0(this.v, this.f230580w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = this.v;
        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            vkm.d dVarB = rd0.e.b(xv5.c.b(bVar.C));
            this.u = 1;
            obj2 = vkm.q.x(dVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        xi0.a aVar2 = xi0.b.Companion;
        ifd.g gVar = this.f230580w;
        String str = gVar.a().f86898a.f86863a;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str);
        xi0.b bVarA2 = xi0.a.a(gVar.a().f86899b);
        return bVar.C1(zh9.u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, !Intrinsics.f((xi0.b) obj2, bVarA2) ? new RateDetailsKompotFeatureConfig.RateDetailsDestination(bVarA, bVarA2, true, true, cryptoTradeFlowContract$InputData.f71552a, 112) : new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(bVarA, cryptoTradeFlowContract$InputData.f71552a, 2), false, (Integer) null, 0, 61)));
    }
}
