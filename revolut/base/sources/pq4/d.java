package pq4;

import cli.j;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditLimitIncreaseStatus f238684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238685b;

    public d(CreditLimitIncreaseStatus creditCardLimitIncreaseStatus, boolean z) {
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseStatus, "creditCardLimitIncreaseStatus");
        this.f238684a = creditCardLimitIncreaseStatus;
        this.f238685b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f238684a, dVar.f238684a) && this.f238685b == dVar.f238685b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238685b) + (this.f238684a.hashCode() * 31);
    }
}
