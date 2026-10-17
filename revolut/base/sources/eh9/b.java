package eh9;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f125770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r02.e f125771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentPocketInfo f125772c;
    public final hrf.h d;
    public final List e;

    public b(ApmQuote apmQuote, r02.e eVar, PaymentPocketInfo paymentPocketInfo, hrf.h errorState, List suggestions) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f125770a = apmQuote;
        this.f125771b = eVar;
        this.f125772c = paymentPocketInfo;
        this.d = errorState;
        this.e = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f125770a, bVar.f125770a) && Intrinsics.f(this.f125771b, bVar.f125771b) && Intrinsics.f(this.f125772c, bVar.f125772c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f125770a;
        int iHashCode = (apmQuote == null ? 0 : apmQuote.hashCode()) * 31;
        r02.e eVar = this.f125771b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        PaymentPocketInfo paymentPocketInfo = this.f125772c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (paymentPocketInfo != null ? paymentPocketInfo.hashCode() : 0)) * 31)) * 31);
    }
}
