package hy5;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RewardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RewardDelegate.Model model = (RewardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Intrinsics.h(model);
        Object obj3 = model.f53195h;
        if (obj3 instanceof zv5.a) {
            String str = ((zv5.a) obj3).f325574a;
            xi0.b.Companion.getClass();
            xi0.b bVarA = xi0.a.a(str);
            boolean z = cp5.d.z(bVarA);
            h hVar = this.v;
            if (z) {
                hVar.A2(u0.b(new FeatureCommand(new CryptoAssetDetailsFeatureConfig.AssetDetails(bVarA, (BuyFundingCurrencyPrefill) null, 6))));
            } else {
                hVar.A2(u0.b(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(bVarA, null, null, null, 62))));
            }
        }
        return Unit.f186387a;
    }
}
