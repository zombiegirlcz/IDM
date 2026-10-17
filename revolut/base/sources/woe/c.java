package woe;

import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f298934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StampDutyAccount f298935b;

    public c(StampDutyAccount account, d payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f298934a = payment;
        this.f298935b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f298934a, cVar.f298934a) && Intrinsics.f(this.f298935b, cVar.f298935b);
    }

    public final int hashCode() {
        return this.f298935b.hashCode() + (this.f298934a.hashCode() * 31);
    }
}
