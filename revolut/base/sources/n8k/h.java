package n8k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f213510a;

    public h(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f213510a = moneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f213510a, ((h) obj2).f213510a);
    }

    public final int hashCode() {
        return this.f213510a.hashCode();
    }
}
