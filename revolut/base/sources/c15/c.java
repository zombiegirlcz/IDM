package c15;

import cli.j;
import com.revolut.feature.credit.health.api.models.CreditScore;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScore f20379a;

    public c(CreditScore creditScore) {
        Intrinsics.checkNotNullParameter(creditScore, "creditScore");
        this.f20379a = creditScore;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f20379a, ((c) obj2).f20379a);
    }

    public final int hashCode() {
        return this.f20379a.hashCode();
    }
}
