package jdk;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ldk.k;
import ldk.l;
import ldk.m;
import ldk.n;
import ldk.o;
import ldk.p;
import ldk.q;
import ldk.r;
import oki.h;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c f173149b;

    public /* synthetic */ d(com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar, int i) {
        this.f173148a = i;
        this.f173149b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f173148a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f173149b.f102566r);
                return Boolean.TRUE;
            case 1:
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar = this.f173149b;
                i iVar = cVar.f102566r;
                r result = (r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, k.f194169a)) {
                    h.D2(iVar);
                } else if (result instanceof l) {
                    cVar.C1(u0.c(new FaqFeatureConfig.Starter(((l) result).f194170a, 2)));
                } else if (result instanceof o) {
                    h.t2(cVar, cVar.f102566r, new MilestoneRewardsFlowContract$Step.Reveal(((o) result).f194173a), false, null, false, 12);
                } else {
                    boolean z = result instanceof q;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (z) {
                        h.w2(iVar, new MilestoneRewardsFlowContract$Step.ShowRewardDetails(((q) result).f194175a), bottom_dialog);
                    } else if (result instanceof p) {
                        h.w2(iVar, new MilestoneRewardsFlowContract$Step.ShowAdditionalRewards(((p) result).f194174a), bottom_dialog);
                    } else if (result instanceof m) {
                        cVar.l2(new iz1.p(cVar, ((m) result).f194171a, null, 27), new yi5.b(26));
                    } else {
                        if (!(result instanceof n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.u2(cVar, iVar, new MilestoneRewardsFlowContract$Step.OptOut(((n) result).f194172a), TransitionAnimation.FADE.f98392a, 4);
                    }
                }
                return Unit.f186387a;
            default:
                aii.q it9 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.D2(this.f173149b.f102566r);
                return Unit.f186387a;
        }
    }
}
