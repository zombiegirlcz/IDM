package bs5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListParcel$TokenClicked;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListScreen;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoTokensListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoTokensListScreen cryptoTokensListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoTokensListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model row = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.P.getValue();
        Intrinsics.h(row);
        e eVar = (e) aVar2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(row, "row");
        Object obj3 = row.u;
        CryptoTokensListParcel$TokenClicked cryptoTokensListParcel$TokenClicked = obj3 instanceof CryptoTokensListParcel$TokenClicked ? (CryptoTokensListParcel$TokenClicked) obj3 : null;
        if (cryptoTokensListParcel$TokenClicked != null) {
            xi0.a aVar3 = xi0.b.Companion;
            String str = cryptoTokensListParcel$TokenClicked.f71370a;
            aVar3.getClass();
            eVar.C1(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(xi0.a.a(str), (BuyFundingCurrencyPrefill) null, 6));
        }
        return Unit.f186387a;
    }
}
