package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow;

import ang.f;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$Step;
import ewh.x;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r10.d;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements c37.b {
    public final ex6.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f74262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f74263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f74264r;

    public b(ex6.b serverErrorHandlerExtension, d taxHubCalendarEventsInteractor, f userInteractor, TaxHubAssessmentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(serverErrorHandlerExtension, "serverErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = serverErrorHandlerExtension;
        this.f74262p = taxHubCalendarEventsInteractor;
        this.f74263q = userInteractor;
        this.f74264r = cp5.d.a(this, new TaxHubAssessmentFlowContract$Step.TaxAssessment(inputData.f74250b, inputData.f74249a), f0.f322471a, new bwd.a(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof c37.d
            if (r0 == 0) goto L13
            r0 = r6
            c37.d r0 = (c37.d) r0
            int r1 = r0.f20918w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20918w = r1
            goto L18
        L13:
            c37.d r0 = new c37.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20918w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            a3i.q r6 = new a3i.q
            r2 = 0
            r4 = 26
            r6.<init>(r5, r2, r4)
            r0.f20918w = r3
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "withLoading(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            do3.n r6 = (do3.n) r6
            wi0.b r5 = do3.q.y(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b.I2(com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ex6.a aVar = ex6.b.Companion;
        ((ex6.d) this.o).Z2(throwable, new x(6));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74264r;
    }
}
