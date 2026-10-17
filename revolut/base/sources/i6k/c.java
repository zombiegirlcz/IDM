package i6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f159042a;

    public c(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f159042a = moneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f159042a, ((c) obj2).f159042a);
    }

    public final int hashCode() {
        return this.f159042a.hashCode();
    }
}
