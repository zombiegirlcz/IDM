package v4k;

import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthDisclaimersContract$Disclaimer$Investment.BankTransferWithdraw f286126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f286127b;

    public f(WealthDisclaimersContract$Disclaimer$Investment.BankTransferWithdraw wealthDisclaimer, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(wealthDisclaimer, "wealthDisclaimer");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f286126a = wealthDisclaimer;
        this.f286127b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f286126a.equals(fVar.f286126a) && this.f286127b == fVar.f286127b;
    }

    public final int hashCode() {
        return this.f286127b.hashCode() + (this.f286126a.f95329a.hashCode() * 31);
    }
}
