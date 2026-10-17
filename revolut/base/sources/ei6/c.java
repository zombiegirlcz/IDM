package ei6;

import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingPayment f126443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f126444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OutboundPaymentExtras f126445c;
    public final boolean d;

    public c(OpenBankingPayment payment, AccountWrapper accountWrapper, OutboundPaymentExtras outboundPaymentExtras, boolean z) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f126443a = payment;
        this.f126444b = accountWrapper;
        this.f126445c = outboundPaymentExtras;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f126443a, cVar.f126443a) && Intrinsics.f(this.f126444b, cVar.f126444b) && Intrinsics.f(this.f126445c, cVar.f126445c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f126443a.hashCode() * 31;
        AccountWrapper accountWrapper = this.f126444b;
        int iHashCode2 = (iHashCode + (accountWrapper == null ? 0 : accountWrapper.hashCode())) * 31;
        OutboundPaymentExtras outboundPaymentExtras = this.f126445c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (outboundPaymentExtras != null ? outboundPaymentExtras.hashCode() : 0)) * 31);
    }
}
