package rh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te8.y f254356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f254357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oh8.b f254358c;

    public n0(te8.y juniorPollingInteractor, hj8.a juniorProfileInteractor, oh8.b juniorOnboardingPollingConfig) {
        Intrinsics.checkNotNullParameter(juniorPollingInteractor, "juniorPollingInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorOnboardingPollingConfig, "juniorOnboardingPollingConfig");
        this.f254356a = juniorPollingInteractor;
        this.f254357b = juniorProfileInteractor;
        this.f254358c = juniorOnboardingPollingConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, kf8.i r16, gim.c r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof rh8.m0
            if (r1 == 0) goto L16
            r1 = r0
            rh8.m0 r1 = (rh8.m0) r1
            int r3 = r1.f254354w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.f254354w = r3
        L14:
            r6 = r1
            goto L1c
        L16:
            rh8.m0 r1 = new rh8.m0
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f254354w
            r7 = 1
            r5 = 0
            if (r1 == 0) goto L36
            if (r1 != r7) goto L2e
            yhm.o.b(r0)
            r2 = r0
            r1 = r5
            goto L84
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            yhm.o.b(r0)
            pe8.e r9 = new pe8.e
            kotlin.ranges.e r0 = new kotlin.ranges.e
            r3 = 100
            r10 = 300000(0x493e0, double:1.482197E-318)
            r0.<init>(r3, r10)
            oh8.b r1 = r14.f254358c
            java.lang.String r3 = "EID_YOUTH_ONBOARDING_POLLING_TIME_MS"
            r12 = 10000(0x2710, double:4.9407E-320)
            long r3 = r1.a(r3, r12, r0)
            kotlin.ranges.e r0 = new kotlin.ranges.e
            r12 = 10
            r0.<init>(r12, r10)
            java.lang.String r10 = "EID_YOUTH_ONBOARDING_POLLING_INTERVAL_MS"
            r11 = 500(0x1f4, double:2.47E-321)
            long r0 = r1.a(r10, r11, r0)
            r9.<init>(r3, r0)
            oqk.h r0 = new oqk.h
            r1 = 27
            r2 = r14
            r4 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r4 = r0
            r1 = r5
            qkg.a r5 = new qkg.a
            r2 = 2
            r3 = 8
            r5.<init>(r2, r3, r1)
            r6.f254354w = r7
            te8.y r2 = r14.f254356a
            r7 = 8
            r3 = r9
            java.lang.Object r2 = te8.y.c(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L84
            return r8
        L84:
            pe8.j r2 = (pe8.j) r2
            boolean r3 = r2 instanceof pe8.i
            if (r3 == 0) goto L91
            yhm.m$a r1 = yhm.m.INSTANCE
            pe8.i r2 = (pe8.i) r2
            java.lang.Object r1 = r2.f235343a
            return r1
        L91:
            boolean r3 = r2 instanceof pe8.h
            if (r3 == 0) goto Lb4
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            pe8.h r2 = (pe8.h) r2
            java.lang.Exception r2 = r2.getException()
            java.lang.String r4 = "Not found active junior profile"
            r3.<init>(r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            java.lang.String r5 = "JuniorProfileRegistrationPollingInteractorImpl"
            rd0.d.a(r4, r5, r1, r3, r2)
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r1 = yhm.o.a(r3)
            return r1
        Lb4:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.n0.a(java.lang.String, kf8.i, gim.c):java.lang.Object");
    }
}
