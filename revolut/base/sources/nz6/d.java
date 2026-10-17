package nz6;

import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import til.n;
import til.q;
import til.r;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b f220958b;

    public /* synthetic */ d(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, int i) {
        this.f220957a = i;
        this.f220958b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220957a) {
            case 0:
                r output = (r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof n;
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar = this.f220958b;
                if (z || (output instanceof q)) {
                    bVar.l2(new h(bVar, null, 1), new d(bVar, 3));
                } else {
                    oki.h.D2(bVar.D);
                }
                return Unit.f186387a;
            case 1:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar2 = this.f220958b;
                Set set = bVar2.B;
                yki.i iVar = bVar2.D;
                if (set.contains(result)) {
                    oki.h.t2(bVar2, iVar, bVar2.L2(), false, null, false, 12);
                } else {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 2:
                m90.b result2 = (m90.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof m90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar3 = this.f220958b;
                oki.h.t2(bVar3, bVar3.D, FreelancerOnboardingFlowContract$Step.TermsAndConditions.f73989a, true, null, false, 12);
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar4 = this.f220958b;
                bVar4.C1(bVar4.M2());
                return Boolean.TRUE;
        }
    }
}
