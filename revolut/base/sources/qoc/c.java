package qoc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.robo.impl.navigation.RoboInternalDestination;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlow;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import ip0.mj;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f248100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f248100w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f248100w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f248100w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f248100w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f248100w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f248100w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            default:
                c cVar6 = new c(this.f248100w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((c0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        alc.f fVar;
        int i2 = this.u;
        f fVar2 = this.f248100w;
        switch (i2) {
            case 0:
                u parcel = (u) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = fVar2.f248119c;
                Intrinsics.h(parcel);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof t) {
                    yji.n.P2(rVar, new EditGoalFlow(new jmc.b(((t) parcel).f248151a, false)), null, null, 3);
                } else {
                    if (!(parcel instanceof s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar.A2(new RoboInternalDestination.ManageGoalDestination(((s) parcel).f248144a));
                }
                return Unit.f186387a;
            case 1:
                a0 a0Var = (a0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = fVar2.f248119c;
                Intrinsics.h(a0Var);
                rVar2.g3(a0Var);
                return Unit.f186387a;
            case 2:
                a0 a0Var2 = (a0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar3 = fVar2.f248119c;
                Intrinsics.h(a0Var2);
                rVar3.g3(a0Var2);
                return Unit.f186387a;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mj mjVar = (mj) pair.f186386b;
                r rVar4 = fVar2.f248119c;
                rVar4.d3(new qce.a(mjVar != null ? new Integer(mjVar.f165387a) : null, rVar4, 28));
                return Unit.f186387a;
            case 4:
                a0 a0Var3 = (a0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar5 = fVar2.f248119c;
                Intrinsics.h(a0Var3);
                rVar5.g3(a0Var3);
                return Unit.f186387a;
            default:
                c0 parcel2 = (c0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar6 = fVar2.f248119c;
                Intrinsics.h(parcel2);
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                toc.a aVar7 = parcel2.f248101a;
                alc.g gVar = parcel2.f248103c;
                int i3 = n.f248129a[aVar7.ordinal()];
                if (i3 == 1) {
                    i = R$string.wealth_robo_portfolio_projection_starting_amount;
                    fVar = gVar.f6196a;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_robo_portfolio_projection_monthly_contribution;
                    fVar = gVar.f6197b;
                }
                yji.n.O2(rVar6, new PenContributionScreen(new PenContributionScreenContract$InputData(new TextLocalisedClause(i, null, null, 14), null, parcel2.f248102b, fVar.f6193a, null)), new qce.a(parcel2, rVar6, 27), 1);
                return Unit.f186387a;
        }
    }
}
