package ue7;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import gim.i;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import re7.h;
import ve7.g;
import ve7.k;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f279307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f279308x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f279308x = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = (k) obj2;
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(this.f279308x, continuation, 0);
                bVar.v = kVar;
                bVar.f279307w = list;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(this.f279308x, continuation, 1);
                bVar2.v = kVar;
                bVar2.f279307w = list;
                return bVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c cVar = this.f279308x;
        switch (i) {
            case 0:
                k kVar = this.v;
                List list = this.f279307w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.i(kVar, "null cannot be cast to non-null type com.revolut.feature.incentive_experiment.impl.model.IncentiveExperiment.CardOrderReimbursedChecklist");
                cVar.getClass();
                Pair pairC = c.c(((ve7.c) kVar).f288135a, list);
                if (pairC != null) {
                    ChecklistChallenge checklistChallenge = (ChecklistChallenge) pairC.f186385a;
                    ChecklistChallengeReward.PhysicalCard physicalCard = (ChecklistChallengeReward.PhysicalCard) pairC.f186386b;
                    ChecklistChallengeState checklistChallengeState = checklistChallenge.f65777c;
                    if (checklistChallengeState instanceof ChecklistChallengeState.Active) {
                        return new re7.a(c.f(physicalCard), checklistChallenge);
                    }
                    if (!(checklistChallengeState instanceof ChecklistChallengeState.OptIn) && !(checklistChallengeState instanceof ChecklistChallengeState.Completed) && !(checklistChallengeState instanceof ChecklistChallengeState.Purchased) && !(checklistChallengeState instanceof ChecklistChallengeState.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return re7.b.f253532a;
            default:
                k kVar2 = this.v;
                List list2 = this.f279307w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.i(kVar2, "null cannot be cast to non-null type com.revolut.feature.incentive_experiment.impl.model.IncentiveExperiment.FreeCardDeliveryChecklist");
                cVar.getClass();
                Pair pairC2 = c.c(((g) kVar2).f288138a, list2);
                if (pairC2 != null) {
                    ChecklistChallenge checklistChallenge2 = (ChecklistChallenge) pairC2.f186385a;
                    ChecklistChallengeReward.PhysicalCard physicalCard2 = (ChecklistChallengeReward.PhysicalCard) pairC2.f186386b;
                    ChecklistChallengeState checklistChallengeState2 = checklistChallenge2.f65777c;
                    if (checklistChallengeState2 instanceof ChecklistChallengeState.Active) {
                        return new re7.g(c.f(physicalCard2), new re7.d(checklistChallenge2));
                    }
                    if (checklistChallengeState2 instanceof ChecklistChallengeState.Completed) {
                        Instant instant = ((ChecklistChallengeState.Completed) checklistChallengeState2).f65800b;
                        if (instant != null && !instant.isBefore(((f) cVar.f279310b).b())) {
                            return new re7.g(c.f(physicalCard2), new re7.e(instant));
                        }
                    } else if (!(checklistChallengeState2 instanceof ChecklistChallengeState.OptIn) && !(checklistChallengeState2 instanceof ChecklistChallengeState.Purchased) && !(checklistChallengeState2 instanceof ChecklistChallengeState.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return h.f253537a;
        }
    }
}
