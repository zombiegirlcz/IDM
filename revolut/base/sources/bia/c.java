package bia;

import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nce.a f15459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecurringPaymentAccount.Pro f15460b;

    public c(nce.b bVar, RecurringPaymentAccount.Pro recurringPaymentAccount) {
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        this.f15459a = bVar;
        this.f15460b = recurringPaymentAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f15459a, cVar.f15459a) && Intrinsics.f(this.f15460b, cVar.f15460b);
    }

    public final int hashCode() {
        nce.a aVar = this.f15459a;
        return this.f15460b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
