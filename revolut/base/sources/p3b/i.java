package p3b;

import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import d9.t0;
import java.math.BigDecimal;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232717a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CfdExposureBreakdownTarget.Order f232718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f232719c;
    public final /* synthetic */ l d;

    public /* synthetic */ i(CfdExposureBreakdownTarget.Order order, n nVar, l lVar) {
        this.f232718b = order;
        this.f232719c = nVar;
        this.d = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f8l.e eVar;
        BigDecimal bigDecimal;
        ej0.b bVar;
        switch (this.f232717a) {
            case 0:
                CfdOpenPositionsDelegate$OpenPositions positions = (CfdOpenPositionsDelegate$OpenPositions) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                l lVar = this.d;
                t2b.f fVar = lVar.f232729t;
                CfdExposureBreakdownTarget.Order order = this.f232718b;
                r0 f82099b = order.f82100a.getF82099b();
                Intrinsics.checkNotNullParameter(f82099b, "<this>");
                int i = u2b.b.f276597b[f82099b.ordinal()];
                if (i == 1) {
                    eVar = f8l.e.MARKET;
                } else if (i == 2) {
                    eVar = f8l.e.LIMIT;
                } else if (i == 3) {
                    eVar = f8l.e.STOP;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = f8l.e.RECURRING;
                }
                f fVar2 = lVar.f232727r;
                f8l.e eVar2 = eVar;
                String str = fVar2.d;
                bfl.g gVar = fVar2.f232714c;
                BigDecimal bigDecimal2 = positions.f82237a;
                BigDecimal bigDecimal3 = positions.f82238b;
                BigDecimal bigDecimal4 = fVar2.f232713b;
                CfdExposureBreakdownOrderType cfdExposureBreakdownOrderType = order.f82100a;
                if (Intrinsics.f(cfdExposureBreakdownOrderType, CfdExposureBreakdownOrderType.Market.f82096a)) {
                    bigDecimal = null;
                } else if (cfdExposureBreakdownOrderType instanceof CfdExposureBreakdownOrderType.Limit) {
                    bigDecimal = ((CfdExposureBreakdownOrderType.Limit) cfdExposureBreakdownOrderType).f82094a.f126703a;
                } else {
                    if (!(cfdExposureBreakdownOrderType instanceof CfdExposureBreakdownOrderType.Stop)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimal = ((CfdExposureBreakdownOrderType.Stop) cfdExposureBreakdownOrderType).f82098a.f126703a;
                }
                return fVar.a(eVar2, str, this.f232719c, gVar, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal);
            default:
                MarginQuote it8 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                CfdExposureBreakdownOrderType cfdExposureBreakdownOrderType2 = this.f232718b.f82100a;
                boolean zF = Intrinsics.f(cfdExposureBreakdownOrderType2, CfdExposureBreakdownOrderType.Market.f82096a);
                n nVar = this.f232719c;
                if (zF) {
                    bVar = new ej0.b(it8.f.f104793b, nVar.i);
                } else if (cfdExposureBreakdownOrderType2 instanceof CfdExposureBreakdownOrderType.Limit) {
                    bVar = ((CfdExposureBreakdownOrderType.Limit) cfdExposureBreakdownOrderType2).f82094a;
                } else {
                    if (!(cfdExposureBreakdownOrderType2 instanceof CfdExposureBreakdownOrderType.Stop)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = ((CfdExposureBreakdownOrderType.Stop) cfdExposureBreakdownOrderType2).f82098a;
                }
                dj0.d dVarD = t0.D(bVar, nVar);
                l lVar2 = this.d;
                BigDecimal bigDecimal5 = lVar2.f232727r.f232713b;
                l4i.a aVar = lVar2.o;
                Amount amount = it8.f82112c;
                aVar.getClass();
                return new d(dVarD, l4i.a.b(amount), bigDecimal5);
        }
    }

    public /* synthetic */ i(l lVar, CfdExposureBreakdownTarget.Order order, n nVar) {
        this.d = lVar;
        this.f232718b = order;
        this.f232719c = nVar;
    }
}
