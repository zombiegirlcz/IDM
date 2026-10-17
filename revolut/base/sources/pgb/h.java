package pgb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$ModalStep;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$RewardInfo;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryHubV3Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SalaryHubV3Controller salaryHubV3Controller, Continuation continuation) {
        super(2, continuation);
        this.v = salaryHubV3Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar2 = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) jVarE3;
        aVar2.getClass();
        SalaryHubV3ControllerContract$RewardInfo rewardSalaryDraw = null;
        q qVar = obj3 instanceof q ? (q) obj3 : null;
        if (qVar != null) {
            if (qVar instanceof o) {
                tgb.l lVar = ((o) qVar).f235847a;
                tgb.j jVar = lVar.f271146b;
                tgb.k kVar = lVar.f271145a;
                String str = lVar.f271147c;
                switch (u.f235854a[jVar.ordinal()]) {
                    case 1:
                    case 2:
                        if (str == null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "SalaryHubV3ControllerModel", "Skipping " + kVar + " reward bottom sheet: deeplink is missing.", null, h0Var);
                        } else {
                            int i = u.f235855b[kVar.ordinal()];
                            if (i == 1) {
                                tgb.i iVar = lVar.i;
                                if (iVar == null) {
                                    iVar = null;
                                }
                                if (iVar == null) {
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "SalaryHubV3ControllerModel", "Skipping salary draw reward bottom sheet: metadata is missing.", null, h0Var2);
                                } else {
                                    rewardSalaryDraw = new SalaryHubV3ControllerContract$RewardInfo.RewardSalaryDraw(str, com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a.J2(lVar), iVar.f271143a);
                                }
                            } else if (i == 2) {
                                rewardSalaryDraw = new SalaryHubV3ControllerContract$RewardInfo.FreePremium(str, com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a.J2(lVar));
                            } else if (i == 3) {
                                rewardSalaryDraw = new SalaryHubV3ControllerContract$RewardInfo.SavingsBoost(str, com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a.J2(lVar));
                            } else {
                                if (i != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rewardSalaryDraw = new SalaryHubV3ControllerContract$RewardInfo.IncomeInsurance(str, com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a.J2(lVar));
                            }
                        }
                        if (rewardSalaryDraw != null) {
                            oki.h.v2(aVar2.f83015x, new SalaryHubV3ControllerContract$ModalStep.RewardStep(rewardSalaryDraw), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if (str == null) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "SalaryHubV3ControllerModel", "Skipping " + kVar + " reward: deeplink is missing.", null, h0Var3);
                        } else {
                            aVar2.I2(str);
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!qVar.equals(p.f235848a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C1(AnalyticsFeatureConfig.IncomeSortersList.Destination.f87418a);
            }
        }
        return Unit.f186387a;
    }
}
