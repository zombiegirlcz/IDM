package a2b;

import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bfl.g f720c;
    public final String d;
    public final CfdExposureBreakdownTarget e;

    public a(String instrumentRef, BigDecimal quantity, bfl.g tradeSide, String portfolioId, CfdExposureBreakdownTarget exposureTarget) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(exposureTarget, "exposureTarget");
        this.f718a = instrumentRef;
        this.f719b = quantity;
        this.f720c = tradeSide;
        this.d = portfolioId;
        this.e = exposureTarget;
    }

    public final CfdExposureBreakdownTarget b() {
        return this.e;
    }

    public final String c() {
        return this.f718a;
    }

    public final String d() {
        return this.d;
    }

    public final BigDecimal e() {
        return this.f719b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f718a, aVar.f718a) && Intrinsics.f(this.f719b, aVar.f719b) && this.f720c == aVar.f720c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final bfl.g f() {
        return this.f720c;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(y.b(this.f720c, t61.a.d(this.f719b, this.f718a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
