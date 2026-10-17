package pm9;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesFlowType f237484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f237485b;

    public d(PayeesFlowType flowType, Data recipients) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f237484a = flowType;
        this.f237485b = recipients;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237484a, dVar.f237484a) && Intrinsics.f(this.f237485b, dVar.f237485b);
    }

    public final int hashCode() {
        return this.f237485b.hashCode() + (this.f237484a.hashCode() * 31);
    }
}
