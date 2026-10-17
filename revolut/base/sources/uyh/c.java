package uyh;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreen;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CryptoExchangeScreen f284355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f284356b;

    public c(CryptoExchangeScreen cryptoExchangeScreen, CenteredAmountDelegate.Model model) {
        this.f284355a = cryptoExchangeScreen;
        this.f284356b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        CryptoExchangeScreen cryptoExchangeScreen = this.f284355a;
        z1 z1Var = cryptoExchangeScreen.R;
        nqi.a aVar = new nqi.a(formattedValue, z, this.f284356b);
        cryptoExchangeScreen.S = aVar;
        z1Var.k(aVar);
    }
}
