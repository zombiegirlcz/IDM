package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_info.CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsPlanHubRewardInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CobrandedCardsPlanHubRewardInfoScreen cobrandedCardsPlanHubRewardInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsPlanHubRewardInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper.SubtitleClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper.SubtitleClickData clickData = (CobrandedCardsPlanHubRewardInfoSubtitleClauseMapper.SubtitleClickData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) ((b) this.v.Q.getValue());
        cVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        cVar.l2(new b0(cVar, clickData.f82601a, null, 7), new yi5.b(26));
        return Unit.f186387a;
    }
}
