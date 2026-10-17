package qb3;

import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashTopUpAmountScreen f244086a;

    public d(CashTopUpAmountScreen cashTopUpAmountScreen) {
        this.f244086a = cashTopUpAmountScreen;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f244086a.f65606a0.onNext(formattedValue);
    }
}
