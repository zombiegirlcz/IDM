package lah;

import aii.r;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositInfo f193397a;

    public c(DepositInfo depositInfo) {
        this.f193397a = depositInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f193397a, ((c) obj2).f193397a);
    }

    public final int hashCode() {
        DepositInfo depositInfo = this.f193397a;
        if (depositInfo == null) {
            return 0;
        }
        return depositInfo.hashCode();
    }
}
