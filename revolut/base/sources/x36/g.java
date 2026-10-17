package x36;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeFiExchangeAmountScreen f302667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f302668b;

    public g(DeFiExchangeAmountScreen deFiExchangeAmountScreen, CenteredAmountDelegate.Model model) {
        this.f302667a = deFiExchangeAmountScreen;
        this.f302668b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f302667a.Q.k(new nqi.a(formattedValue, z, this.f302668b));
    }
}
