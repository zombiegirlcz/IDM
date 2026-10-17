package j1h;

import aw0.wa;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.math.BigDecimal;
import java.math.RoundingMode;
import jbh.c;
import jbh.d;
import jbh.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vel.f;

/* JADX INFO: loaded from: classes9.dex */
public interface b {
    static /* synthetic */ RowDelegate.Model a(b bVar, f fVar, Object obj2, int i) {
        if ((i & 2) != 0) {
            obj2 = new a(fVar);
        }
        return ((e) bVar).d(fVar, obj2, null);
    }

    static ReferralContactDelegate.Model b(b bVar, f performanceAsset, Object obj2, String str, AnalyticsContext analyticsContext, int i) {
        Object parcel = (i & 2) != 0 ? new a(performanceAsset) : obj2;
        Clause clauseG = null;
        String strC = (i & 4) != 0 ? null : str;
        AnalyticsContext analyticsContext2 = (i & 8) != 0 ? null : analyticsContext;
        e eVar = (e) bVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (strC == null) {
            strC = e.c(performanceAsset);
        }
        Image imageA = c.a(performanceAsset);
        Clause clauseE = eVar.e(performanceAsset);
        if (performanceAsset instanceof vel.e) {
            vel.e eVar2 = (vel.e) performanceAsset;
            BigDecimal bigDecimalB = adh.a.b(eVar2);
            if (bigDecimalB != null) {
                switch (d.f172634a[eVar2.f288355a.f214560a.f214597c.ordinal()]) {
                    case 1:
                        clauseG = new PercentageClause(bigDecimalB, new PercentageClause.Format.Custom(2, 4, null, wa.SHOW_ALL_ZEROES, RoundingMode.DOWN), (Style) null, 4);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        clauseG = e.g(bigDecimalB, eVar2);
                        break;
                    case 11:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (performanceAsset instanceof vel.c) {
            vel.c cVar = (vel.c) performanceAsset;
            BigDecimal bigDecimalB2 = adh.a.b(cVar);
            if (bigDecimalB2 != null) {
                clauseG = e.g(bigDecimalB2, cVar);
            }
        } else if (performanceAsset instanceof vel.b) {
            vel.b bVar2 = (vel.b) performanceAsset;
            BigDecimal bigDecimalB3 = adh.a.b(bVar2);
            if (bigDecimalB3 != null) {
                clauseG = e.g(bigDecimalB3, bVar2);
            }
        } else {
            if (!(performanceAsset instanceof vel.d)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalB4 = adh.a.b(performanceAsset);
            if (bigDecimalB4 != null) {
                clauseG = e.g(bigDecimalB4, performanceAsset);
            }
        }
        return new ReferralContactDelegate.Model(strC, imageA, clauseE, clauseG, null, null, null, null, null, parcel, analyticsContext2, 130288);
    }
}
