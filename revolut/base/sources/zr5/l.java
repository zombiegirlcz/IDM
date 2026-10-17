package zr5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.CryptoTokensChatWidgetParcel$TokenClicked;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f324598a;

    public l(n nVar) {
        this.f324598a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        r rVar = this.f324598a.f324600a;
        if (!Intrinsics.f(str, rVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        Object obj3 = ((RowDelegate.Model) i3Var.f54274b).u;
        if (obj3 instanceof CryptoTokensChatWidgetParcel$TokenClicked) {
            String symbol = ((CryptoTokensChatWidgetParcel$TokenClicked) obj3).f71360a;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            xi0.b.Companion.getClass();
            rVar.A2(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(xi0.a.a(symbol), (BuyFundingCurrencyPrefill) null, 6));
        }
        return Unit.f186387a;
    }
}
