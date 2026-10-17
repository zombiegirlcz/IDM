package km9;

import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import jq9.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesFlowType f185737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f185738b;

    public f(PayeesFlowType flowType, t paymentRecipient) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(paymentRecipient, "paymentRecipient");
        this.f185737a = flowType;
        this.f185738b = paymentRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f185737a, fVar.f185737a) && Intrinsics.f(this.f185738b, fVar.f185738b);
    }

    public final int hashCode() {
        return this.f185738b.hashCode() + (this.f185737a.hashCode() * 31);
    }
}
