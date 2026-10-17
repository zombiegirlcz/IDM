package ud3;

import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YourCashbackFlowContract$Step f279114a;

    public j(YourCashbackFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f279114a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f279114a, ((j) obj2).f279114a);
    }

    public final int hashCode() {
        return this.f279114a.hashCode();
    }
}
