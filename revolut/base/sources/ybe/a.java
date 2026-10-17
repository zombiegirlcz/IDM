package ybe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f312282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f312283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f312284c;
    public final q d;
    public final boolean e;

    public a(p subscription, Data transactionsResult, Data apmPaymentAuthorisationSummary, q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(apmPaymentAuthorisationSummary, "apmPaymentAuthorisationSummary");
        this.f312282a = subscription;
        this.f312283b = transactionsResult;
        this.f312284c = apmPaymentAuthorisationSummary;
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
        return Intrinsics.f(this.f312282a, aVar.f312282a) && Intrinsics.f(this.f312283b, aVar.f312283b) && Intrinsics.f(this.f312284c, aVar.f312284c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iC = e.c(this.f312284c, e.c(this.f312283b, this.f312282a.hashCode() * 31, 31), 31);
        q qVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
