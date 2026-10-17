package jr1;

import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr1.b f177927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1.a f177928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pre.c f177929c;

    public e(fr1.b repository, fx1.a apmOnboardingRepository, pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f177927a = repository;
        this.f177928b = apmOnboardingRepository;
        this.f177929c = termsInteractor;
    }

    public final Object a(ApmOnboardingStatus apmOnboardingStatus, String str, int i, gim.c cVar) {
        if (apmOnboardingStatus instanceof ApmOnboardingStatus.Active) {
            fr1.b bVar = this.f177927a;
            bVar.getClass();
            fr1.a aVar = new fr1.a(bVar, str, null, 1);
            p0 p0Var = p0.f264001a;
            return e0.J(elm.f.f127540b, aVar, cVar);
        }
        if (apmOnboardingStatus instanceof ApmOnboardingStatus.NotRegistered) {
            return d((ApmOnboardingStatus.NotRegistered) apmOnboardingStatus, str, i, cVar);
        }
        throw new IllegalStateException("Unexpected APM Status for Postal Checks: " + apmOnboardingStatus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (((iz1.h) r7.f177928b).d(dx1.c.f120514a, null, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.ArrayList r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof jr1.b
            if (r0 == 0) goto L13
            r0 = r13
            jr1.b r0 = (jr1.b) r0
            int r1 = r0.f177921w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177921w = r1
            goto L18
        L13:
            jr1.b r0 = new jr1.b
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f177921w
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r13)
            r7 = r11
            goto L60
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r13)
            goto L50
        L38:
            yhm.o.b(r13)
            if (r12 == 0) goto L50
            ix6.l0 r5 = new ix6.l0
            r10 = 21
            r8 = 0
            r7 = r11
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f177921w = r4
            java.lang.Object r12 = skm.e0.o(r5, r0)
            if (r12 != r1) goto L51
            goto L5f
        L50:
            r7 = r11
        L51:
            r0.f177921w = r3
            fx1.a r12 = r7.f177928b
            iz1.h r12 = (iz1.h) r12
            dx1.c r13 = dx1.c.f120514a
            java.lang.Object r12 = r12.d(r13, r9, r0)
            if (r12 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jr1.e.b(java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jr1.c
            if (r0 == 0) goto L13
            r0 = r7
            jr1.c r0 = (jr1.c) r0
            int r1 = r0.f177923x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177923x = r1
            goto L18
        L13:
            jr1.c r0 = new jr1.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f177923x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f177923x = r4
            fx1.a r7 = r5.f177928b
            dx1.c r2 = dx1.c.f120514a
            java.lang.Object r7 = fx1.a.a(r7, r2, r0)
            if (r7 != r1) goto L4a
            goto L58
        L4a:
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r7 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus) r7
            r2 = 0
            r0.u = r2
            r0.f177923x = r3
            r2 = 0
            java.lang.Object r6 = r5.a(r7, r6, r2, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jr1.e.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[PHI: r11 r12 r14
      0x00aa: PHI (r11v10 int) = (r11v9 int), (r11v13 int) binds: [B:35:0x00a7, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v7 java.lang.String) binds: [B:35:0x00a7, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r14v8 java.lang.Object) = (r14v7 java.lang.Object), (r14v1 java.lang.Object) binds: [B:35:0x00a7, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.NotRegistered r11, java.lang.String r12, int r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof jr1.d
            if (r0 == 0) goto L13
            r0 = r14
            jr1.d r0 = (jr1.d) r0
            int r1 = r0.f177926y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177926y = r1
            goto L18
        L13:
            jr1.d r0 = new jr1.d
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f177924w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f177926y
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r4) goto L41
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r14)
            return r14
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            int r11 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto Laa
        L41:
            int r11 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L99
        L49:
            int r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L89
        L51:
            yhm.o.b(r14)
            if (r13 >= r5) goto Lbc
            java.util.ArrayList r14 = r11.d
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L6c
            com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult$TermsRequired r13 = new com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult$TermsRequired
            java.util.ArrayList r11 = r11.d
            java.lang.Object r11 = zhm.d0.b0(r11)
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms r11 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms) r11
            r13.<init>(r11, r12)
            return r13
        L6c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r14 = "Postal Checks status is NOT_REGISTERED but no Terms were returned"
            r11.<init>(r14)
            zhm.h0 r14 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.WARNING
            rd0.d.a(r2, r7, r7, r11, r14)
            r0.u = r12
            r0.v = r13
            r0.f177926y = r6
            java.lang.Object r11 = r10.b(r7, r0)
            if (r11 != r1) goto L89
            goto Lba
        L89:
            r0.u = r12
            r0.v = r13
            r0.f177926y = r4
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = skm.k0.b(r8, r0)
            if (r11 != r1) goto L98
            goto Lba
        L98:
            r11 = r13
        L99:
            r0.u = r12
            r0.v = r11
            r0.f177926y = r5
            fx1.a r13 = r10.f177928b
            dx1.c r14 = dx1.c.f120514a
            java.lang.Object r14 = fx1.a.a(r13, r14, r0)
            if (r14 != r1) goto Laa
            goto Lba
        Laa:
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r14 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus) r14
            int r13 = r11 + 1
            r0.u = r7
            r0.v = r11
            r0.f177926y = r3
            java.lang.Object r11 = r10.a(r14, r12, r13, r0)
            if (r11 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            return r11
        Lbc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "User has accepted T&Cs but remains unregistered after 3 tries"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jr1.e.d(com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus$NotRegistered, java.lang.String, int, gim.c):java.lang.Object");
    }
}
