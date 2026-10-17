package od3;

import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YourCashbackFlowContract$Step f224289a;

    public p(YourCashbackFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f224289a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f224289a, ((p) obj2).f224289a);
    }

    public final int hashCode() {
        return this.f224289a.hashCode();
    }
}
