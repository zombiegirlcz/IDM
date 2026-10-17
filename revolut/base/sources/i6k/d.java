package i6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f159043a;

    public d(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f159043a = moneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f159043a, ((d) obj2).f159043a);
    }

    public final int hashCode() {
        return this.f159043a.hashCode();
    }
}
