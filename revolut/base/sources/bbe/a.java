package bbe;

import com.revolut.data.model.Data;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f14258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f14259c;
    public final Data d;

    public a(Data transactions, Data recurringPaymentSplitStatus, q qVar, p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(recurringPaymentSplitStatus, "recurringPaymentSplitStatus");
        this.f14257a = subscription;
        this.f14258b = transactions;
        this.f14259c = qVar;
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
        return Intrinsics.f(this.f14257a, aVar.f14257a) && Intrinsics.f(this.f14258b, aVar.f14258b) && Intrinsics.f(this.f14259c, aVar.f14259c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = e.c(this.f14258b, this.f14257a.hashCode() * 31, 31);
        q qVar = this.f14259c;
        return this.d.hashCode() + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
