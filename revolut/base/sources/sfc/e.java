package sfc;

import et6.h;
import gr6.i;
import gr6.m;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements ad1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f262393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f262394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f262395c;
    public final i d;
    public final n e;

    public e(gr6.a freelancerAccountDetailsInteractor, h freelancerAccountSelectionInteractor, m freelancerPocketsInteractor, i freelancerCurrencyInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountSelectionInteractor, "freelancerAccountSelectionInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f262393a = freelancerAccountDetailsInteractor;
        this.f262394b = freelancerAccountSelectionInteractor;
        this.f262395c = freelancerPocketsInteractor;
        this.d = freelancerCurrencyInteractor;
        this.e = walletInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof sfc.a
            if (r0 == 0) goto L13
            r0 = r7
            sfc.a r0 = (sfc.a) r0
            int r1 = r0.f262388w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262388w = r1
            goto L18
        L13:
            sfc.a r0 = new sfc.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262388w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L52
        L36:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            gr6.a r2 = r6.f262393a
            et6.g r2 = (et6.g) r2
            vkm.d r7 = r2.d(r7)
            r2 = 3
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r5, r2)
            r0.f262388w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L52
            goto L74
        L52:
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState r7 = (com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState) r7
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$NotOnboarded r2 = com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.NotOnboarded.f73272a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r2 != 0) goto L83
            boolean r2 = r7 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Pending
            if (r2 != 0) goto L83
            boolean r7 = r7 instanceof com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.Onboarded
            if (r7 == 0) goto L7d
            wsg.n r7 = r6.e
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r7 = r7.x(r2)
            r0.f262388w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            xi0.b r7 = (xi0.b) r7
            return r7
        L7d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not onboarded freelancers are not supported"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sfc.e.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sfc.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xi0.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sfc.c
            if (r0 == 0) goto L13
            r0 = r7
            sfc.c r0 = (sfc.c) r0
            int r1 = r0.f262392x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f262392x = r1
            goto L18
        L13:
            sfc.c r0 = new sfc.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f262392x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            xi0.b r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            gr6.i r7 = r5.d
            et6.a1 r7 = (et6.a1) r7
            vkm.d r7 = r7.b()
            r2 = 3
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)
            r0.u = r6
            r0.f262392x = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L94
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r7.next()
            r1 = r0
            lr6.f r1 = (lr6.f) r1
            lr6.d0 r1 = r1.f199400a
            lr6.d0 r2 = lr6.d0.CARD_PRESENT
            if (r1 != r2) goto L57
            goto L6c
        L6b:
            r0 = r4
        L6c:
            lr6.f r0 = (lr6.f) r0
            if (r0 == 0) goto L94
            java.util.ArrayList r7 = r0.f199401b
            java.util.Iterator r7 = r7.iterator()
        L76:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r7.next()
            r1 = r0
            lr6.t r1 = (lr6.t) r1
            xi0.b r1 = r1.f199416a
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L76
            goto L8d
        L8c:
            r0 = r4
        L8d:
            lr6.t r0 = (lr6.t) r0
            if (r0 == 0) goto L94
            dj0.d r6 = r0.f199417b
            return r6
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sfc.e.c(xi0.b, gim.c):java.lang.Object");
    }
}
