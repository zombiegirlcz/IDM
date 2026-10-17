package kd3;

import aii.r;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YourCashbackFlowContract$Step.Home f182785a;

    public g(YourCashbackFlowContract$Step.Home nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f182785a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f182785a.equals(((g) obj2).f182785a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182785a.f65706a);
    }
}
