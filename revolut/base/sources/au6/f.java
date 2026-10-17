package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAccountService f9523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9525c;
    public final it6.c d;
    public final ft6.b e;
    public final x4l.c f;

    public f(FreelancerAccountService api2, ne0.j memoryCache, ue0.c storageCache, it6.c freelancerServerErrorParser, ft6.b accountDetailsMappers) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(freelancerServerErrorParser, "freelancerServerErrorParser");
        Intrinsics.checkNotNullParameter(accountDetailsMappers, "accountDetailsMappers");
        this.f9523a = api2;
        this.f9524b = memoryCache;
        this.f9525c = storageCache;
        this.d = freelancerServerErrorParser;
        this.e = accountDetailsMappers;
        Continuation continuation = null;
        this.f = new x4l.c(new a09.o(this, continuation, 7), new ar1.c(this, 18), new anc.b(this, 17), new akl.e0(this, continuation, 10), new d(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(au6.f r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof au6.e
            if (r0 == 0) goto L13
            r0 = r5
            au6.e r0 = (au6.e) r0
            int r1 = r0.f9516w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9516w = r1
            goto L18
        L13:
            au6.e r0 = new au6.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f9516w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L4d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService r5 = r4.f9523a     // Catch: java.lang.Throwable -> L27
            r0.f9516w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.getFreelancerAccountDetails(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.freelancer.impl.network.models.b r5 = (com.revolut.feature.freelancer.impl.network.models.b) r5     // Catch: java.lang.Throwable -> L27
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Onboarded r0 = new com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Onboarded     // Catch: java.lang.Throwable -> L27
            ft6.b r1 = r4.e     // Catch: java.lang.Throwable -> L27
            com.revolut.feature.freelancer.common.models.FreelancerAccountDetails r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L27
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L27
            return r0
        L4d:
            it6.c r0 = r4.d
            com.revolut.feature.freelancer.impl.network.errorhandling.b r0 = (com.revolut.feature.freelancer.impl.network.errorhandling.b) r0
            com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError r0 = r0.a(r5)
            ue0.c r4 = r4.f9525c
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "STORAGE_KEY_IS_MERCHANT_ONBOARDED"
            java.lang.Object r4 = r4.v0(r2, r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r0 == 0) goto L8b
            if (r4 != 0) goto L8b
            boolean r4 = r0 instanceof com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError.PendingOnboarding
            if (r4 == 0) goto L77
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Pending r4 = new com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Pending
            lr6.u r5 = lr6.u.OTHER
            r4.<init>(r5)
            goto L89
        L77:
            boolean r4 = r0 instanceof com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError.PendingPreOnboarding
            if (r4 == 0) goto L83
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Pending r4 = new com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$Pending
            lr6.u r5 = lr6.u.PRE_ONBOARDING
            r4.<init>(r5)
            goto L89
        L83:
            boolean r4 = r0 instanceof com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError.NoMerchantFound
            if (r4 == 0) goto L8a
            com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState$NotOnboarded r4 = com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState.NotOnboarded.f73272a
        L89:
            return r4
        L8a:
            throw r5
        L8b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au6.f.a(au6.f, gim.c):java.lang.Object");
    }
}
