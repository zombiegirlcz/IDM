package i4b;

import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import d9.e1;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f158393b;

    public /* synthetic */ v(g0 g0Var, int i) {
        this.f158392a = i;
        this.f158393b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158392a) {
            case 0:
                m orderData = (m) obj2;
                Intrinsics.checkNotNullParameter(orderData, "orderData");
                l lVar = orderData instanceof l ? (l) orderData : null;
                a4b.g gVar = lVar != null ? lVar.f158353a : null;
                int i = gVar == null ? -1 : w.f158395b[gVar.ordinal()];
                if (i != -1) {
                    if (i == 1 || i == 2) {
                        return this.f158393b.f158341y.Z2(r2b.b.f251091a);
                    }
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return zi0.c.i(new g5b.e(null, null, zhm.f0.f322471a, null, null));
            case 1:
                CfdOpenPositionsDelegate$OpenPositions positions = (CfdOpenPositionsDelegate$OpenPositions) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                g0 g0Var = this.f158393b;
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = g0Var.f158335q;
                boolean zI = e1.I(cfdOrderReviewScreenContract$InputData.i);
                return g0Var.f158338t.a(zI ? f8l.e.MARKET : u2b.c.b(cfdOrderReviewScreenContract$InputData.f82280h), cfdOrderReviewScreenContract$InputData.f82276a, cfdOrderReviewScreenContract$InputData.f82278c, cfdOrderReviewScreenContract$InputData.f, positions.f82237a, positions.f82238b, cfdOrderReviewScreenContract$InputData.f82279g, zI ? null : cfdOrderReviewScreenContract$InputData.i);
            default:
                CfdOpenPositionsDelegate$OpenPositions openPositions = (CfdOpenPositionsDelegate$OpenPositions) obj2;
                Intrinsics.checkNotNullParameter(openPositions, "openPositions");
                g0 g0Var2 = this.f158393b;
                a4b.h hVar = g0Var2.B;
                CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData2 = g0Var2.f158335q;
                bfl.g gVar2 = cfdOrderReviewScreenContract$InputData2.f;
                BigDecimal bigDecimal = cfdOrderReviewScreenContract$InputData2.f82279g;
                hVar.getClass();
                return a4b.h.a(openPositions, gVar2, bigDecimal);
        }
    }
}
