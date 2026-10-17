package jc6;

import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecurringDonationAmountScreen f172712a;

    public f(RecurringDonationAmountScreen recurringDonationAmountScreen) {
        this.f172712a = recurringDonationAmountScreen;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String amount, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(amount, "formattedValue");
        s sVar = (s) this.f172712a.T2();
        sVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        xi0.b bVar = (xi0.b) ((j) sVar.t2()).f172715c.getContent();
        if (bVar != null) {
            s.A2(sVar, new nqi.c(new dj0.d(sVar.f172730q.b(amount, bVar.f306286a), bVar), amount), null, 6);
        }
    }
}
