package qbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f244227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f244228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f244229c;
    public final q d;
    public final boolean e;

    public a(p recurringPayment, Data transactionsResult, Data apmPaymentAuthorisationSummary, q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationSummary, "apmPaymentAuthorisationSummary");
        this.f244227a = recurringPayment;
        this.f244228b = transactionsResult;
        this.f244229c = apmPaymentAuthorisationSummary;
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
        return Intrinsics.f(this.f244227a, aVar.f244227a) && Intrinsics.f(this.f244228b, aVar.f244228b) && Intrinsics.f(this.f244229c, aVar.f244229c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = e.c(this.f244229c, e.c(this.f244228b, this.f244227a.hashCode() * 31, 31), 31);
        q qVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
