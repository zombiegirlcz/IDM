package u2b;

import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType;
import f8l.e;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private c() {
    }

    public static CfdExposureBreakdownOrderType a(e2b.a aVar, ej0.b targetPrice) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        int i = b.f276596a[aVar.ordinal()];
        if (i == 1) {
            return CfdExposureBreakdownOrderType.Market.f82096a;
        }
        if (i == 2) {
            return new CfdExposureBreakdownOrderType.Limit(targetPrice);
        }
        if (i == 3) {
            return new CfdExposureBreakdownOrderType.Stop(targetPrice);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static e b(e2b.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = b.f276596a[aVar.ordinal()];
        if (i == 1) {
            return e.MARKET;
        }
        if (i == 2) {
            return e.LIMIT;
        }
        if (i == 3) {
            return e.STOP;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static e2b.a c(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int i = b.f276597b[r0Var.ordinal()];
        if (i == 1) {
            return e2b.a.MARKET;
        }
        if (i == 2) {
            return e2b.a.LIMIT;
        }
        if (i == 3) {
            return e2b.a.STOP;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("RECURRING order type is not supported for Margin trading");
    }

    public static r0 d(e2b.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = b.f276596a[aVar.ordinal()];
        if (i == 1) {
            return r0.MARKET;
        }
        if (i == 2) {
            return r0.LIMIT;
        }
        if (i == 3) {
            return r0.STOP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
