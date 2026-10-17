package u1k;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentOptionsVaultWithdrawalScreen f276417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f276418b;

    public c(PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen, AmountEditDelegate.Model model) {
        this.f276417a = paymentOptionsVaultWithdrawalScreen;
        this.f276418b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f276417a.W.onNext(new nqi.a(formattedValue, z, this.f276418b));
    }
}
