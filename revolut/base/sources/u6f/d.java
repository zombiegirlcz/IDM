package u6f;

import cli.j;
import com.revolut.feature.robo.api.model.RiskMetrics;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f277587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RiskMetrics.ReturnBreakDown.OngoingCharges f277588b;

    public d(BigDecimal managementFee, RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges) {
        Intrinsics.checkNotNullParameter(managementFee, "managementFee");
        this.f277587a = managementFee;
        this.f277588b = ongoingCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f277587a, dVar.f277587a) && Intrinsics.f(this.f277588b, dVar.f277588b);
    }

    public final int hashCode() {
        int iHashCode = this.f277587a.hashCode() * 31;
        RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges = this.f277588b;
        return iHashCode + (ongoingCharges == null ? 0 : ongoingCharges.hashCode());
    }
}
