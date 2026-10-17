package h54;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationFlowContract$Step f149455b;

    public d(CreditApplicationFlowContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f149455b = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f149455b, ((d) obj2).f149455b);
    }

    public final int hashCode() {
        return this.f149455b.hashCode();
    }
}
