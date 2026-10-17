package kic;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import com.revolut.feature.rewards.api.navigation.PerkDetailsDestination;
import ggc.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mic.u;
import mic.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.details.flow.b f184202b;

    public /* synthetic */ i(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, int i) {
        this.f184201a = i;
        this.f184202b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f184201a;
        int i2 = 2;
        int i3 = 1;
        int i5 = 0;
        com.revolut.feature.rewards.impl.ui.details.flow.b bVar = this.f184202b;
        Continuation continuation = null;
        switch (i) {
            case 0:
                ggc.l reward = (ggc.l) obj2;
                Intrinsics.checkNotNullParameter(reward, "reward");
                OutletAvailabilityInterval outletAvailabilityInterval = v.f143671a;
                Intrinsics.checkNotNullParameter(reward, "<this>");
                boolean zB = v.b(reward);
                if (!(!zB)) {
                    if (!zB) {
                        throw new NoWhenBranchMatchedException();
                    }
                    efm.r rVarF = z9h.n.f(null, null, false, 7, null);
                    Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                    return rVarF;
                }
                bgc.e eVar = bVar.f84940p;
                fgc.c.Companion.getClass();
                ugc.g gVar = (ugc.g) eVar;
                gVar.getClass();
                fgc.c args = fgc.c.f135030a;
                Intrinsics.checkNotNullParameter(args, "args");
                efm.r rVarSwitchMap = gVar.f280011h.switchMap(new ubj.c(21, new u69.g(gVar, args, 25)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
            case 1:
                w result = (w) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof u) {
                    oki.h.D2(bVar.D);
                } else if (result instanceof mic.q) {
                    mic.q qVar = (mic.q) result;
                    knm.b.j(bVar.l1(), new PerkDetailsDestination(null, qVar.f205675a, hgc.a.SinglePerk.a(), null, false, qVar.f205676b));
                } else if (result instanceof mic.p) {
                    bVar.N2("PERK_DETAILS_REWARD_ACTION_TASK_ID", new n(bVar, result, continuation, i5));
                } else if (result instanceof mic.o) {
                    bVar.N2("PERK_DETAILS_FOOTER_ACTION_TASK_ID", new n(bVar, result, continuation, i3));
                } else if (result instanceof mic.r) {
                    bVar.N2("PERK_DETAILS_CONSENT_ACTION_TASK_ID", new m(bVar, null, 1));
                } else if (result instanceof mic.t) {
                    bVar.P2(((mic.t) result).f205679a);
                } else if (result instanceof mic.n) {
                    bVar.N2("PERK_DETAILS_BANNER_ACTION_TASK_ID", new n(bVar, result, continuation, i2));
                } else if (result instanceof mic.v) {
                    bVar.N2("PERK_DETAILS_AVAILABILITY_ACTION_TASK_ID", new n(bVar, result, continuation, 3));
                } else if (result instanceof mic.l) {
                    bVar.f84946x.b3(((mic.l) result).f205671a);
                } else if (result instanceof mic.m) {
                    knm.b.j(bVar.l1(), new RevPointsOptInDestination(RevPointsOptInNextDestination.Tab.f83531a, RevPointsOptInNextDestination.Default.f83526a, new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.PlanHub.f83998a, false, 6)));
                } else {
                    if (!(result instanceof mic.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.N2("PERK_DETAILS_DESCRIPTION_LINK_ACTION_TASK_ID", new k49.f(bVar, ((mic.s) result).f205678a, null, 10));
                }
                return Unit.f186387a;
            case 2:
                ric.c result2 = (ric.c) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof ric.a) {
                    bVar.N2("PERK_DETAILS_OPT_IN_TASK_ID", new m(bVar, null, 2));
                } else {
                    if (!(result2 instanceof ric.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(bVar.D);
                }
                return Unit.f186387a;
            case 3:
                qic.a result3 = (qic.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof qic.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(bVar.D);
                return Unit.f186387a;
            case 4:
                jic.a output = (jic.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output != null) {
                    bVar.N2("PERK_DETAILS_BOTTOM_SHEET_ACTION_TASK_ID", new k49.f(bVar, output, null, 7));
                }
                return Unit.f186387a;
            default:
                tjc.d result4 = (tjc.d) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof tjc.a) {
                    bVar.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new k49.f(bVar, result4, null, 9));
                } else if (result4 instanceof tjc.b) {
                    bVar.S2();
                } else if (!(result4 instanceof tjc.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
