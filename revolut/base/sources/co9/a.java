package co9;

import cf9.h;
import com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles;
import fp1.d;
import kotlin.jvm.internal.Intrinsics;
import uw1.c;
import uw1.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo1.c f25497b;

    public a(c apmFeatureChecker, vo1.c billsFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        this.f25496a = apmFeatureChecker;
        this.f25497b = billsFeatureChecker;
    }

    public final boolean a() {
        if (((ty1.b) this.f25496a).b(f.UPI)) {
            return true;
        }
        d dVar = (d) this.f25497b;
        if (dVar.c(cf9.a.f23652c) || dVar.c(h.f23659c)) {
            return true;
        }
        return ((jte.d) dVar.f137040c).c(PayBillsAndTaxesApi$Toggles.NzBills.f78661c);
    }
}
