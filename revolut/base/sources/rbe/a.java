package rbe;

import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f253025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f253026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f253027c;
    public final q d;
    public final boolean e;

    public a(p subscription, Data transactionsResult, Data apmPaymentAuthorisationSummary, q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationSummary, "apmPaymentAuthorisationSummary");
        this.f253025a = subscription;
        this.f253026b = transactionsResult;
        this.f253027c = apmPaymentAuthorisationSummary;
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
        return Intrinsics.f(this.f253025a, aVar.f253025a) && Intrinsics.f(this.f253026b, aVar.f253026b) && Intrinsics.f(this.f253027c, aVar.f253027c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f253027c, kii.e.c(this.f253026b, this.f253025a.hashCode() * 31, 31), 31);
        q qVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
