package et6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 implements gr6.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f129198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.k f129199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.e f129200c;

    public b4(gr6.a freelancerAccountDetailsInteractor, gr6.k freelancerKymInteractor, gr6.e freelancerAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerKymInteractor, "freelancerKymInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        this.f129198a = freelancerAccountDetailsInteractor;
        this.f129199b = freelancerKymInteractor;
        this.f129200c = freelancerAvailabilityInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof et6.a4
            if (r0 == 0) goto L13
            r0 = r11
            et6.a4 r0 = (et6.a4) r0
            int r1 = r0.f129194x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129194x = r1
            goto L18
        L13:
            et6.a4 r0 = new et6.a4
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129194x
            r3 = 3
            r4 = 2
            com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility$NotEligible r5 = com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility.NotEligible.f73341a
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L45
            if (r2 == r7) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r11)
            goto Lac
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            boolean r2 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L3f
            goto L80
        L3f:
            r11 = move-exception
            goto L84
        L41:
            yhm.o.b(r11)
            goto L57
        L45:
            yhm.o.b(r11)
            r0.f129194x = r7
            gr6.e r11 = r10.f129200c
            et6.l0 r11 = (et6.l0) r11
            yoj.c r2 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 != r1) goto L57
            goto Lab
        L57:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r2 = r11.booleanValue()
            if (r2 != 0) goto L60
            goto L8f
        L60:
            gr6.a r11 = r10.f129198a     // Catch: java.lang.Exception -> L3f
            w4l.h r8 = w4l.h.f294642c     // Catch: java.lang.Exception -> L3f
            et6.g r11 = (et6.g) r11     // Catch: java.lang.Exception -> L3f
            vkm.d r11 = r11.d(r8)     // Catch: java.lang.Exception -> L3f
            en6.a r8 = new en6.a     // Catch: java.lang.Exception -> L3f
            r9 = 28
            r8.<init>(r9)     // Catch: java.lang.Exception -> L3f
            jhi.b r11 = mo3.a.g(r11, r6, r8, r7)     // Catch: java.lang.Exception -> L3f
            r0.u = r2     // Catch: java.lang.Exception -> L3f
            r0.f129194x = r4     // Catch: java.lang.Exception -> L3f
            java.lang.Object r11 = vkm.q.x(r11, r0)     // Catch: java.lang.Exception -> L3f
            if (r11 != r1) goto L80
            goto Lab
        L80:
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState r11 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState) r11     // Catch: java.lang.Exception -> L3f
            r6 = r11
            goto L8d
        L84:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r6, r6, r11, r8)
        L8d:
            if (r6 != 0) goto L90
        L8f:
            return r5
        L90:
            boolean r11 = r6 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Onboarded
            if (r11 == 0) goto Lbc
            gr6.k r11 = r10.f129199b
            et6.v1 r11 = (et6.v1) r11
            et6.r1 r6 = new et6.r1
            r6.<init>(r4)
            et6.u1 r11 = r11.a(r6)
            r0.u = r2
            r0.f129194x = r3
            java.lang.Object r11 = vkm.q.z(r11, r0)
            if (r11 != r1) goto Lac
        Lab:
            return r1
        Lac:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r0)
            if (r11 == 0) goto Lc2
            com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility$Eligible r5 = new com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility$Eligible
            r5.<init>(r7)
            goto Lc2
        Lbc:
            com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility$Eligible r5 = new com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility$Eligible
            r11 = 0
            r5.<init>(r11)
        Lc2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.b4.a(gim.c):java.lang.Object");
    }
}
