package s56;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeFiSendAmountScreen f259938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f259939b;

    public c(DeFiSendAmountScreen deFiSendAmountScreen, CenteredAmountDelegate.Model model) {
        this.f259938a = deFiSendAmountScreen;
        this.f259939b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f259938a.N.k(new nqi.a(formattedValue, z, this.f259939b));
    }
}
