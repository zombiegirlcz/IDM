package i2i;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarketOrderActivityV2 f157952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f157953b;

    public c(MarketOrderActivityV2 marketOrderActivityV2, CenteredAmountDelegate.Model model) {
        this.f157952a = marketOrderActivityV2;
        this.f157953b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        MarketOrderActivityV2 marketOrderActivityV2 = this.f157952a;
        ihm.f fVar = marketOrderActivityV2.F0;
        nqi.a aVar = new nqi.a(formattedValue, z, this.f157953b);
        marketOrderActivityV2.G0 = aVar;
        fVar.onNext(aVar);
    }
}
