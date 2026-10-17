package p3b;

import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f232713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bfl.g f232714c;
    public final String d;
    public final CfdExposureBreakdownTarget e;

    public f(String instrumentRef, BigDecimal quantity, bfl.g tradeSide, String portfolioId, CfdExposureBreakdownTarget exposureTarget) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(exposureTarget, "exposureTarget");
        this.f232712a = instrumentRef;
        this.f232713b = quantity;
        this.f232714c = tradeSide;
        this.d = portfolioId;
        this.e = exposureTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f232712a, fVar.f232712a) && Intrinsics.f(this.f232713b, fVar.f232713b) && this.f232714c == fVar.f232714c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(y.b(this.f232714c, t61.a.d(this.f232713b, this.f232712a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
