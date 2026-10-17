package dne;

import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StampDutyAccount f116288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f116289b;

    public a(StampDutyAccount account, d money) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f116288a = account;
        this.f116289b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f116288a, aVar.f116288a) && Intrinsics.f(this.f116289b, aVar.f116289b);
    }

    public final int hashCode() {
        return this.f116289b.hashCode() + (this.f116288a.hashCode() * 31);
    }
}
