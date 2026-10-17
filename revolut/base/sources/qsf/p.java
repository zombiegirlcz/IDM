package qsf;

import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowContract$Step f248834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f248835b;

    public p(TransferReasonsFlowContract$Step step, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f248834a = step;
        this.f248835b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f248834a.equals(pVar.f248834a) && this.f248835b == pVar.f248835b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248835b) + (this.f248834a.hashCode() * 31);
    }
}
