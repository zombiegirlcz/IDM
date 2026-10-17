package ov1;

import aii.q;
import com.revolut.feature.apm.breb.impl.flow.BrebFlowContract$Step;
import com.revolut.feature.apm.core.api.ApmToggles$BrebSkipOnboarding;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.l;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.breb.impl.flow.a f229950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f229951c;

    public /* synthetic */ f(com.revolut.feature.apm.breb.impl.flow.a aVar, l lVar, int i) {
        this.f229949a = i;
        this.f229950b = aVar;
        this.f229951c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FlowStep flowStepI2;
        switch (this.f229949a) {
            case 0:
                d12.d output = (d12.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ApmOnboardingStatus apmOnboardingStatus = ((tv1.a) output).f274686a;
                com.revolut.feature.apm.breb.impl.flow.a aVar = this.f229950b;
                if (aVar.f61719p.a(ApmToggles$BrebSkipOnboarding.f61794c) && (apmOnboardingStatus instanceof ApmOnboardingStatus.NotRegistered)) {
                    ArrayList arrayList = ((ApmOnboardingStatus.NotRegistered) apmOnboardingStatus).d;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        a0.x(((ApmOnboardingStatusTerms) it8.next()).f61979c, arrayList2);
                    }
                    flowStepI2 = new BrebFlowContract$Step.Onboarding(d0.U(arrayList2));
                } else {
                    flowStepI2 = com.revolut.feature.apm.breb.impl.flow.a.I2(aVar.o);
                }
                FlowStep flowStep = flowStepI2;
                h.t2(aVar, this.f229951c, flowStep, false, TransitionAnimation.FADE.f98392a, false, 8);
                break;
            case 1:
                Intrinsics.checkNotNullParameter((q) obj2, "it");
                com.revolut.feature.apm.breb.impl.flow.a aVar2 = this.f229950b;
                h.t2(aVar2, this.f229951c, com.revolut.feature.apm.breb.impl.flow.a.I2(aVar2.o), false, null, false, 12);
                break;
            default:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.t2(this.f229950b, this.f229951c, new BrebFlowContract$Step.Register(it9), false, TransitionAnimation.FADE.f98392a, false, 8);
                break;
        }
        return Unit.f186387a;
    }
}
