package jq9;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f177501a;

    public g(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f177501a = moneyRequest;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177501a.f60319j.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return this.f177501a.f60322n == MoneyRequestDirection.INCOMING;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f177501a, ((g) obj2).f177501a);
    }

    public final int hashCode() {
        return this.f177501a.hashCode();
    }
}
