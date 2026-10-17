package ble;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import ip0.t80;
import ip0.u80;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabInvestController f16584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(TabInvestController tabInvestController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f16584w = tabInvestController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f16584w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f16584w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f16584w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n(this.f16584w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            case 4:
                n nVar5 = new n(this.f16584w, continuation, 4);
                nVar5.v = obj2;
                return nVar5;
            default:
                n nVar6 = new n(this.f16584w, continuation, 5);
                nVar6.v = obj2;
                return nVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabInvestController tabInvestController = this.f16584w;
        switch (i) {
            case 0:
                ux0.s state = (ux0.s) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR2 = tabInvestController.R2();
                Intrinsics.h(state);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR2;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                if (state.equals(ux0.q.f283796a)) {
                    fVar.n2(new c0(3, fVar, null), new whi.b(6));
                } else if (!state.equals(ux0.r.f283798a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 1:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR22 = tabInvestController.R2();
                Intrinsics.h(message);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar2 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR22;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                fVar2.D.b3(message);
                return Unit.f186387a;
            case 2:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR23 = tabInvestController.R2();
                Intrinsics.h(message2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar3 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR23;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                fVar3.D.c3(message2);
                return Unit.f186387a;
            case 3:
                u80 clickData = (u80) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR24 = tabInvestController.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar4 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR24;
                fVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((cc7.h) fVar4.K).d3(clickData);
                return Unit.f186387a;
            case 4:
                t80 model = (t80) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR25 = tabInvestController.R2();
                Intrinsics.h(model);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar5 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR25;
                fVar5.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                ((cc7.h) fVar5.K).c3(model);
                return Unit.f186387a;
            default:
                t80 model2 = (t80) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR26 = tabInvestController.R2();
                Intrinsics.h(model2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar6 = (com.revolut.feature.tab.invest.impl.ui.home.f) qVarR26;
                fVar6.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                ((cc7.h) fVar6.K).b3(model2);
                return Unit.f186387a;
        }
    }
}
