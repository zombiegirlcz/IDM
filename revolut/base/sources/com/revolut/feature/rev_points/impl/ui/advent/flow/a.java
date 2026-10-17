package com.revolut.feature.rev_points.impl.ui.advent.flow;

import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import uyb.c;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yja.b bVar = (yja.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        yki.a aVar2 = this.v.f83771q;
        RevPointsAdventRewardsFlowContract$Step revPointsAdventRewardsFlowContract$Step = (RevPointsAdventRewardsFlowContract$Step) aVar2.d();
        if (revPointsAdventRewardsFlowContract$Step instanceof RevPointsAdventRewardsFlowContract$Step.WrappedArticle) {
            if (c.f284128a[bVar.ordinal()] == 1) {
                h.w2(aVar2, RevPointsAdventRewardsFlowContract$Step.ConfettiDialog.f83767a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            } else {
                h.D2(aVar2);
            }
        } else if (revPointsAdventRewardsFlowContract$Step instanceof RevPointsAdventRewardsFlowContract$Step.UnwrappedArticle) {
            h.D2(aVar2);
        } else if (!(revPointsAdventRewardsFlowContract$Step instanceof RevPointsAdventRewardsFlowContract$Step.ConfettiDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
