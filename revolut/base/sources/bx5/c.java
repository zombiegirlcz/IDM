package bx5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 f19490a;

    public c(CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2) {
        this.f19490a = cryptoCommodityBuyCollectionAmountScreenV2;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f19490a.c0.k(formattedValue);
    }
}
