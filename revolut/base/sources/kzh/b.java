package kzh;

import cli.j;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Limit.UsageLimit f191115a;

    public b(Limit.UsageLimit accountBalanceLimit) {
        Intrinsics.checkNotNullParameter(accountBalanceLimit, "accountBalanceLimit");
        this.f191115a = accountBalanceLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f191115a, ((b) obj2).f191115a);
    }

    public final int hashCode() {
        return this.f191115a.hashCode();
    }
}
