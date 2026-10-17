package t6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRule;
import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f268297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f268298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f268299c;
    public final RevPointsEarningRule d;
    public final RevPointsEarningRule e;

    public i(long j2, BigDecimal bigDecimal, LocalDate localDate, RevPointsEarningRule revPointsEarningRule, RevPointsEarningRule revPointsEarningRule2) {
        this.f268297a = j2;
        this.f268298b = bigDecimal;
        this.f268299c = localDate;
        this.d = revPointsEarningRule;
        this.e = revPointsEarningRule2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return RevPoints.a(this.f268297a, iVar.f268297a) && Intrinsics.f(this.f268298b, iVar.f268298b) && Intrinsics.f(this.f268299c, iVar.f268299c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f268297a) * 31;
        BigDecimal bigDecimal = this.f268298b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        LocalDate localDate = this.f268299c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        RevPointsEarningRule revPointsEarningRule = this.d;
        int iHashCode4 = (iHashCode3 + (revPointsEarningRule == null ? 0 : revPointsEarningRule.hashCode())) * 31;
        RevPointsEarningRule revPointsEarningRule2 = this.e;
        return iHashCode4 + (revPointsEarningRule2 != null ? revPointsEarningRule2.hashCode() : 0);
    }
}
