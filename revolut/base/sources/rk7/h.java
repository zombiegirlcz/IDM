package rk7;

import aii.r;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceFlowContract$Step f254760a;

    public h(CFACInsuranceFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f254760a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f254760a, ((h) obj2).f254760a);
    }

    public final int hashCode() {
        return this.f254760a.hashCode();
    }
}
