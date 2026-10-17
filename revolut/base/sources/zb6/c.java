package zb6;

import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OneTimeDonationScreen f320804a;

    public c(OneTimeDonationScreen oneTimeDonationScreen) {
        this.f320804a = oneTimeDonationScreen;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String amountInput, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(amountInput, "formattedValue");
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f320804a.d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        aVar.H2(aVar.z, new z8g.q(aVar, amountInput, 19));
    }
}
