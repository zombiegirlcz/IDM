package t05;

import com.revolut.feature.credit.health.api.models.CreditScore;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScore f266927a;

    public p(CreditScore creditScore) {
        Intrinsics.checkNotNullParameter(creditScore, "creditScore");
        this.f266927a = creditScore;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f266927a, ((p) obj2).f266927a);
    }

    public final int hashCode() {
        return this.f266927a.hashCode();
    }
}
