package uag;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.a;
import ebg.g;
import gcg.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c f278655b;

    public /* synthetic */ r(com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar, int i) {
        this.f278654a = i;
        this.f278655b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f278654a) {
            case 0:
                ebg.g output = (ebg.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof g.b;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar = this.f278655b;
                if (z) {
                    cVar.I2(TravelHotelsHomeFlowContract$PagerItem.DISCOVER);
                } else if (output instanceof g.a) {
                    cVar.C2(a.c.f93729a);
                } else {
                    if (!(output instanceof ebg.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C2(new h(((ebg.f) output).f124338a));
                }
                return Unit.f186387a;
            case 1:
                Data rateData = (Data) obj2;
                Intrinsics.checkNotNullParameter(rateData, "rateData");
                RevPointsEarningRate revPointsEarningRate = (RevPointsEarningRate) rateData.getContent();
                return revPointsEarningRate != null ? new p9g.e(this.f278655b.u.b(new MoneyClause(revPointsEarningRate.f83977c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)).toString()) : p9g.d.f234313a;
            case 2:
                gcg.k output2 = (gcg.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z3 = output2 instanceof k.d;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar2 = this.f278655b;
                if (z3) {
                    cVar2.I2(TravelHotelsHomeFlowContract$PagerItem.BOOKINGS);
                } else if (output2 instanceof k.b) {
                    cVar2.C2(a.b.f93728a);
                } else if (output2 instanceof gcg.m) {
                    cVar2.C2(new h(((gcg.m) output2).f142461a));
                } else if (output2 instanceof k.c) {
                    cVar2.C2(new a.d(((k.c) output2).f142458a));
                } else if (output2 instanceof gcg.n) {
                    cVar2.C2(new i(((gcg.n) output2).f142462a));
                } else if (output2 instanceof gcg.q) {
                    cVar2.C2(new n(((gcg.q) output2).f142465a));
                } else if (output2 instanceof gcg.p) {
                    cVar2.C2(new k(((gcg.p) output2).f142464a));
                } else if (output2 instanceof k.a) {
                    cVar2.C2(a.C0566a.f93727a);
                } else if (output2 instanceof gcg.l) {
                    cVar2.C2(new m(((gcg.l) output2).f142460a));
                } else {
                    if (!(output2 instanceof gcg.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.C2(new j(((gcg.o) output2).f142463a));
                }
                return Unit.f186387a;
            case 3:
                ocg.k output3 = (ocg.k) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                boolean zF = Intrinsics.f(output3, ocg.j.f224239a);
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar3 = this.f278655b;
                if (zF) {
                    cVar3.I2(TravelHotelsHomeFlowContract$PagerItem.DISCOVER);
                } else if (output3 instanceof ocg.i) {
                    cVar3.C2(new o(((ocg.i) output3).f224238a));
                } else {
                    if (!(output3 instanceof ocg.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar3.C2(new l(((ocg.h) output3).f224237a));
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.a output4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.a) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                boolean z4 = output4 instanceof a.C0569a;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar4 = this.f278655b;
                if (z4) {
                    cVar4.I2(TravelHotelsHomeFlowContract$PagerItem.DISCOVER);
                } else {
                    if (!(output4 instanceof mcg.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar4.C2(new o(((mcg.g) output4).f204353a));
                }
                return Unit.f186387a;
        }
    }
}
