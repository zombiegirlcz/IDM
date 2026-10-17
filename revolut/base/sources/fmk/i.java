package fmk;

import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import h93.f0;
import h93.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a f136471b;

    public /* synthetic */ i(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar, int i) {
        this.f136470a = i;
        this.f136471b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        switch (this.f136470a) {
            case 0:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar = this.f136471b;
                return nim.a.w(l93.f.k(aVar.f103534p, wallet.f136801a, b93.d.RETAIL, true, 8), new i(aVar, 2));
            case 1:
                List<RevPointsEarningRate> list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                for (RevPointsEarningRate revPointsEarningRate : list) {
                    if (revPointsEarningRate.f83975a == this.f136471b.I2()) {
                        return revPointsEarningRate;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar2 = this.f136471b;
                PlanRevPointsCardsScreenContract$InputData planRevPointsCardsScreenContract$InputData = aVar2.o;
                a aVar3 = aVar2.u;
                PlanRevPointsCardsScreenContract$RevPointsCardType planRevPointsCardsScreenContract$RevPointsCardType = planRevPointsCardsScreenContract$InputData.f103531a;
                if (Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a)) {
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(cards, "cards");
                    arrayList = new ArrayList();
                    for (Object obj3 : cards) {
                        if (((f0) obj3).C()) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    if (!Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(cards, "cards");
                    arrayList = new ArrayList();
                    for (Object obj4 : cards) {
                        f0 f0Var = (f0) obj4;
                        if (!f0Var.C() && !f0Var.b0() && f0Var.G != l0.CRYPTO && !f0Var.S()) {
                            arrayList.add(obj4);
                        }
                    }
                }
                return arrayList;
        }
    }
}
