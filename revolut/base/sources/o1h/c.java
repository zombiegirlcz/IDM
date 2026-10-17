package o1h;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositInfo f221388a;

    public c(DepositInfo.OneOffDeposit depositInfo) {
        Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
        this.f221388a = depositInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f221388a, ((c) obj2).f221388a);
    }

    public final int hashCode() {
        return this.f221388a.hashCode();
    }
}
