package l96;

import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositAmount f193042a;

    public c(DepositAmount depositAmount) {
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        this.f193042a = depositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f193042a, ((c) obj2).f193042a);
    }

    public final int hashCode() {
        return this.f193042a.hashCode();
    }
}
