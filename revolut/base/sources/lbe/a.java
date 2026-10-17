package lbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f193657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f193658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f193659c;
    public final Data d;

    public a(Data transactionsResult, Data recurringPaymentSplitStatus, q qVar, p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatus, "recurringPaymentSplitStatus");
        this.f193657a = subscription;
        this.f193658b = transactionsResult;
        this.f193659c = qVar;
        this.d = recurringPaymentSplitStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f193657a, aVar.f193657a) && Intrinsics.f(this.f193658b, aVar.f193658b) && Intrinsics.f(this.f193659c, aVar.f193659c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = e.c(this.f193658b, this.f193657a.hashCode() * 31, 31);
        q qVar = this.f193659c;
        return this.d.hashCode() + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
