package ane;

import aii.e;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f7727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StampDutyAccount f7728b;

    public a(StampDutyAccount account, d payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f7727a = payment;
        this.f7728b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f7727a, aVar.f7727a) && Intrinsics.f(this.f7728b, aVar.f7728b);
    }

    public final int hashCode() {
        return this.f7728b.hashCode() + (this.f7727a.hashCode() * 31);
    }
}
