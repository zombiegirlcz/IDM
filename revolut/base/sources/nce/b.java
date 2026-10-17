package nce;

import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringPaymentFilter.And f214180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214181b;

    public b(RecurringPaymentFilter.And recurringPaymentFilter, String baseCurrencyCode) {
        Intrinsics.checkNotNullParameter(recurringPaymentFilter, "recurringPaymentFilter");
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        this.f214180a = recurringPaymentFilter;
        this.f214181b = baseCurrencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f214180a.equals(bVar.f214180a) && Intrinsics.f(this.f214181b, bVar.f214181b);
    }

    public final int hashCode() {
        return this.f214181b.hashCode() + (this.f214180a.f89323a.hashCode() * 31);
    }
}
