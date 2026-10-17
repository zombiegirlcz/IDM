package c23;

import com.revolut.feature.card_order_new.common.setpin.kompot.b;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$State;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$Step;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.c;
import et6.x0;
import et6.y0;
import f33.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kr6.a;
import o23.x;
import xy2.a;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.c f20615b;

    public /* synthetic */ f(com.revolut.feature.card_order_new.impl.kompot.c cVar, int i) {
        this.f20614a = i;
        this.f20615b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20614a) {
            case 0:
                hha.d currentPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                gr6.h hVar = this.f20615b.f65088y;
                String str = currentPlan.f152289c;
                y0 y0Var = (y0) hVar;
                y0Var.getClass();
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(nim.a.v(nim.a.v(u0.m(rd0.e.b(y0Var.f129381b.n()), y0Var.g(loadingStrategy)), new eq4.c(str, y0Var, 19)), x0.f), kotlin.coroutines.g.f186406a);
            case 1:
                j33.j result = (j33.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.card_order_new.impl.kompot.c cVar = this.f20615b;
                cVar.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar.A2().f98429a, null, null, null, null, null, null, result.f170944a, null, result.f170945b, null, 14614527));
                cVar.E2(CardOrderFlowContract$Step.CreatePin.f65075a, true, null, false);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.card_order_new.common.setpin.kompot.b result2 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof i13.k;
                com.revolut.feature.card_order_new.impl.kompot.c cVar2 = this.f20615b;
                if (z) {
                    cVar2.E2(new CardOrderFlowContract$Step.ConfirmPin(((i13.k) result2).f157538a), true, null, false);
                } else {
                    if (!(result2 instanceof b.a)) {
                        throw new IllegalStateException("Create pin cannot return other output");
                    }
                    cVar2.q2();
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.card_order_new.common.setpin.kompot.b result3 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z3 = result3 instanceof i13.j;
                com.revolut.feature.card_order_new.impl.kompot.c cVar3 = this.f20615b;
                if (z3) {
                    cVar3.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar3.A2().f98429a, null, null, null, null, ((i13.j) result3).f157537a, null, null, null, null, null, 16776191));
                    c93.b bVar = ((CardOrderFlowContract$State) cVar3.A2().f98429a).f65050a;
                    if (bVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar3.l2(new q(cVar3, ce9.m.u(bVar.f22270b), null, 0), new yi5.b(26));
                } else {
                    if (!(result3 instanceof b.a)) {
                        throw new IllegalStateException("Confirm pin cannot return other output");
                    }
                    cVar3.q2();
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.c result4 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.c) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                boolean z4 = result4 instanceof c.a;
                com.revolut.feature.card_order_new.impl.kompot.c cVar4 = this.f20615b;
                if (z4) {
                    cVar4.q2();
                } else {
                    if (!(result4 instanceof q23.r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q23.r rVar = (q23.r) result4;
                    cVar4.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar4.A2().f98429a, rVar.f241518a, null, null, null, null, null, null, rVar.f241519b, null, rVar.f241520c, 12451831));
                    cVar4.l2(new btk.j(cVar4, rVar.f241518a, null, 11), new yi5.b(26));
                }
                return Unit.f186387a;
            case 5:
                f33.l result5 = (f33.l) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                boolean z6 = result5 instanceof l.a;
                com.revolut.feature.card_order_new.impl.kompot.c cVar5 = this.f20615b;
                if (z6) {
                    cVar5.q2();
                } else if (result5 instanceof l.b) {
                    cVar5.a3(true);
                } else if (result5 instanceof f33.k) {
                    cVar5.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar5.A2().f98429a, null, null, null, null, null, ((f33.k) result5).f131895a, null, null, null, null, 16775167));
                    cVar5.l2(new j(cVar5, null, 0), new yi5.b(26));
                } else {
                    if (!(result5 instanceof f33.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f33.m mVar = (f33.m) result5;
                    cVar5.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar5.A2().f98429a, null, null, null, mVar.d, null, mVar.f131898a, null, null, null, null, 16774911));
                    cVar5.l2(new p(cVar5, mVar.f131899b, mVar.f131900c, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 6:
                x result6 = (x) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                boolean z11 = result6.d;
                com.revolut.feature.card_order_new.impl.kompot.c cVar6 = this.f20615b;
                if (z11) {
                    cVar6.Z2();
                } else {
                    cVar6.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar6.A2().f98429a, result6.f221473a, null, null, null, null, null, null, null, null, null, 16777207));
                    cVar6.l2(new btk.j(cVar6, result6.f221473a, null, 11), new yi5.b(26));
                }
                return Unit.f186387a;
            case 7:
                kr6.a result7 = (kr6.a) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                boolean z12 = result7 instanceof a.C1068a;
                com.revolut.feature.card_order_new.impl.kompot.c cVar7 = this.f20615b;
                if (z12) {
                    cVar7.q2();
                } else if (result7 instanceof kr6.b) {
                    cVar7.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar7.A2().f98429a, null, ((kr6.b) result7).f188663a, null, null, null, null, null, null, null, null, 16777199));
                    cVar7.W2();
                } else {
                    if (!(result7 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar7.L2(CardOrderFlowContract$State.a((CardOrderFlowContract$State) cVar7.A2().f98429a, null, null, null, null, null, null, null, null, null, null, 16777199));
                    cVar7.W2();
                }
                return Unit.f186387a;
            default:
                xy2.a result8 = (xy2.a) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                if (!(result8 instanceof a.C1720a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f20615b.Y2();
                return Unit.f186387a;
        }
    }
}
