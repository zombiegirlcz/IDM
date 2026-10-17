package jdk;

import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step;
import eii.k;
import iz1.p;
import j4h.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173150a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MilestoneRewardsFlowContract$Step f173151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c f173152c;

    public /* synthetic */ e(MilestoneRewardsFlowContract$Step milestoneRewardsFlowContract$Step, com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar) {
        this.f173151b = milestoneRewardsFlowContract$Step;
        this.f173152c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f173150a) {
            case 0:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i = g.f173153a[result.ordinal()];
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar = this.f173152c;
                if (i == 1) {
                    cVar.l2(new com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.a(cVar, null), new m(cVar, ((MilestoneRewardsFlowContract$Step.ProductArticle) this.f173151b).f102559a, 29));
                } else if (i == 2) {
                    h.t2(cVar, cVar.f102566r, MilestoneRewardsFlowContract$Step.RewardsList.f102561a, false, null, false, 12);
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(cVar.f102566r);
                }
                return Unit.f186387a;
            default:
                k result2 = (k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if ((result2 instanceof eii.g) && (str = ((MilestoneRewardsFlowContract$Step.ShowRewardDetails) this.f173151b).f102563a.f) != null) {
                    com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar2 = this.f173152c;
                    cVar2.l2(new p(cVar2, str, null, 27), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ e(com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar, MilestoneRewardsFlowContract$Step milestoneRewardsFlowContract$Step) {
        this.f173152c = cVar;
        this.f173151b = milestoneRewardsFlowContract$Step;
    }
}
