package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import mhd.p0;
import mk5.s;
import qp7.k;
import qp7.l;
import qp7.m;
import qp7.n;
import qp7.o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        o p0 = (o) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        j jVar = (j) this.receiver;
        jVar.getClass();
        Continuation continuation = null;
        if (p0 instanceof k) {
            k kVar = (k) p0;
            String str = kVar.f248307a;
            jVar.l2(new p0(jVar, str, continuation, 17), new s(jVar, kVar.f248308b, 12));
        } else if (p0 instanceof qp7.j) {
            rr7.c cVarA = rr7.e.a(((qp7.j) p0).f248306a);
            if (cVarA instanceof rr7.a) {
                jVar.C1(((rr7.a) cVarA).f256732a);
            } else {
                if (!(cVarA instanceof rr7.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar.A1(new p0(jVar, (rr7.b) cVarA, continuation, 16), new yi5.b(25));
            }
        } else if (p0 instanceof l) {
            jVar.E2(new CarOnboardingFlowContract$Step.BenefitList(((l) p0).f248309a), true, null, false);
        } else if (p0 instanceof n) {
            yji.l.g2(jVar, new PaymentBreakdownScreen(new PaymentBreakdownScreenContract$InputData(((n) p0).f248311a)), ModalDestination.Style.POPUP.f98311a, null, 2);
        } else {
            if (!(p0 instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar.E2(new CarOnboardingFlowContract$Step.DocumentList(((m) p0).f248310a), true, null, false);
        }
        return Unit.f186387a;
    }
}
