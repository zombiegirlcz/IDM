package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step;
import eh3.s;
import hd.r;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rh8.o0;
import te8.z;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements ei8.b {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final prl.e f77035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f77036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f77037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f77038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f77039t;

    public e(r uiConfigurationProvider, prl.e juniorCreationInteractor, z juniorProductsInteractor, wj0.a idempotencyKeyHolder, o0 termsProvider) {
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(juniorCreationInteractor, "juniorCreationInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(termsProvider, "termsProvider");
        this.o = uiConfigurationProvider;
        this.f77035p = juniorCreationInteractor;
        this.f77036q = juniorProductsInteractor;
        this.f77037r = idempotencyKeyHolder;
        this.f77038s = termsProvider;
        this.f77039t = d8l.d.a(this, new s(this, 4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|37|(1:(1:(6:12|41|13|28|33|34)(2:17|18))(1:19))(3:20|(0)|26)|23|39|24|(4:27|28|33|34)|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e r16, com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm r17, java.util.Map r18, gim.c r19) {
        /*
            r1 = r16
            r0 = r17
            r2 = r19
            boolean r3 = r2 instanceof ei8.e
            if (r3 == 0) goto L19
            r3 = r2
            ei8.e r3 = (ei8.e) r3
            int r4 = r3.f126454x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f126454x = r4
            goto L1e
        L19:
            ei8.e r3 = new ei8.e
            r3.<init>(r1, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f126454x
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L40
            if (r5 == r7) goto L3c
            if (r5 != r6) goto L34
            kf8.d r3 = r3.u
            yhm.o.b(r2)     // Catch: java.lang.Exception -> L32 java.util.concurrent.CancellationException -> L9c
            goto L82
        L32:
            r0 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            yhm.o.b(r2)
            goto L6e
        L40:
            yhm.o.b(r2)
            prl.e r2 = r1.f77035p
            java.lang.String r9 = r0.f77040a
            java.lang.String r5 = r0.f77041b
            java.lang.String r8 = r0.f77042c
            java.lang.String[] r5 = new java.lang.String[]{r5, r8}
            java.lang.String r10 = md6.s.d(r5)
            java.time.LocalDate r5 = r0.d
            org.joda.time.LocalDate r11 = jli.b.i(r5)
            bj0.b r12 = r0.e
            kf8.i r14 = kf8.i.BANKING
            kf8.g r8 = new kf8.g
            r13 = 0
            r15 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3.f126454x = r7
            java.lang.Object r2 = r2.k(r8, r3)
            if (r2 != r4) goto L6e
            goto L80
        L6e:
            kf8.d r2 = (kf8.d) r2
            te8.z r0 = r1.f77036q     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L9c
            pfm.a r0 = te8.z.c(r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L9c
            r3.u = r2     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L9c
            r3.f126454x = r6     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L9c
            java.lang.Object r0 = nim.a.a(r0, r3)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L9c
            if (r0 != r4) goto L81
        L80:
            return r4
        L81:
            r3 = r2
        L82:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L32 java.util.concurrent.CancellationException -> L9c
            goto L91
        L85:
            r0 = move-exception
            r3 = r2
        L87:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            r5 = 0
            rd0.d.a(r4, r5, r5, r0, r2)
        L91:
            ei8.c r0 = new ei8.c
            r0.<init>(r3)
            r1.C2(r0)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L9c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.I2(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e, com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm, java.util.Map, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.f77037r.a("JUNIOR_ACCOUNT_CREATION_TAG");
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f77039t, JuniorPersonalDataCreationFlowContract$Step.PersonalDetails.f77012a, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77039t;
    }
}
