package qaj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.crypto.newlyadded.impl.ui.controller.NewlyAddedCryptoController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewlyAddedCryptoController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NewlyAddedCryptoController newlyAddedCryptoController, Continuation continuation) {
        super(2, continuation);
        this.v = newlyAddedCryptoController;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarD3 = this.v.R2();
        Intrinsics.h(model);
        g gVar = (g) eVarD3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        gaj.b bVar = gVar.f244045p;
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.crypto.newlyadded.api.domain.model.NewlyAddedCrypto");
        xi0.b currency = ((haj.a) obj3).f150521a;
        ((paj.a) bVar).getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        gVar.C1(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(currency, (BuyFundingCurrencyPrefill) null, 6));
        return Unit.f186387a;
    }
}
