package e85;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f123599a;

    public t(List strategies) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        this.f123599a = strategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f123599a.equals(((t) obj2).f123599a);
    }

    public final int hashCode() {
        return this.f123599a.hashCode();
    }
}
