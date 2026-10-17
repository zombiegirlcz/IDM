package nbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f214072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f214073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f214074c;
    public final q d;
    public final boolean e;

    public a(p recurringPayment, Data transactionsResult, Data apmPaymentAuthorisationSummary, q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationSummary, "apmPaymentAuthorisationSummary");
        this.f214072a = recurringPayment;
        this.f214073b = transactionsResult;
        this.f214074c = apmPaymentAuthorisationSummary;
        this.d = qVar;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f214072a, aVar.f214072a) && Intrinsics.f(this.f214073b, aVar.f214073b) && Intrinsics.f(this.f214074c, aVar.f214074c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = e.c(this.f214074c, e.c(this.f214073b, this.f214072a.hashCode() * 31, 31), 31);
        q qVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
