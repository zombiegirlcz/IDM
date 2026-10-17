package qsf;

import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowContract$Step f248836a;

    public q(TransferReasonsFlowContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f248836a = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f248836a, ((q) obj2).f248836a);
    }

    public final int hashCode() {
        return this.f248836a.hashCode();
    }
}
