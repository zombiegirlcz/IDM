package lk7;

import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceFlowContract$Step.Documents f196280a;

    public i(CFACInsuranceFlowContract$Step.Documents nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f196280a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f196280a.equals(((i) obj2).f196280a);
    }

    public final int hashCode() {
        return this.f196280a.f75041a.hashCode();
    }
}
