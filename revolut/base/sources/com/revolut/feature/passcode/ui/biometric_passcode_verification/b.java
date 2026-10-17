package com.revolut.feature.passcode.ui.biometric_passcode_verification;

import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$Step;
import ie9.d;
import k3k.k;
import k7c.l0;
import ke9.c;
import ke9.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements c {
    public final BiometricPasscodeVerificationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f78640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wl0.c f78641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fe9.h f78642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final me9.a f78643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oe9.a f78644t;
    public final i u;

    public b(BiometricPasscodeVerificationFlowContract$InputData inputData, d passcodeLockRepository, wl0.c biometricHelper, fe9.h biometricPromptControllerModelExtension, me9.a biometricPasscodeVerificationResultReceiver, oe9.a passcodeVerificationDispatcher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passcodeLockRepository, "passcodeLockRepository");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(biometricPromptControllerModelExtension, "biometricPromptControllerModelExtension");
        Intrinsics.checkNotNullParameter(biometricPasscodeVerificationResultReceiver, "biometricPasscodeVerificationResultReceiver");
        Intrinsics.checkNotNullParameter(passcodeVerificationDispatcher, "passcodeVerificationDispatcher");
        this.o = inputData;
        this.f78640p = passcodeLockRepository;
        this.f78641q = biometricHelper;
        this.f78642r = biometricPromptControllerModelExtension;
        this.f78643s = biometricPasscodeVerificationResultReceiver;
        this.f78644t = passcodeVerificationDispatcher;
        this.u = d8l.d.a(this, new k(this, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r9 == r3) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.passcode.ui.biometric_passcode_verification.b r8, gim.c r9) {
        /*
            ie9.d r0 = r8.f78640p
            com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$InputData r1 = r8.o
            boolean r2 = r9 instanceof ke9.j
            if (r2 == 0) goto L17
            r2 = r9
            ke9.j r2 = (ke9.j) r2
            int r3 = r2.f183058w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f183058w = r3
            goto L1c
        L17:
            ke9.j r2 = new ke9.j
            r2.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f183058w
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3b
            if (r4 == r7) goto L37
            if (r4 != r6) goto L2f
            yhm.o.b(r9)
            goto L8a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L6e
        L3b:
            yhm.o.b(r9)
            com.revolut.feature.passcode.PasscodeScreenContract$InputData r9 = r1.f78637b
            com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode r9 = r9.f78626l
            boolean r9 = r9.getF78629a()
            if (r9 != 0) goto L4b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L4b:
            wl0.c r8 = r8.f78641q
            rm0.j r8 = r8.c()
            rm0.d r9 = rm0.d.f255149a
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L5c
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5c:
            com.revolut.feature.passcode.PasscodeScreenContract$InputData r8 = r1.f78637b
            boolean r8 = r8.f78622c
            if (r8 == 0) goto L93
            r2.f183058w = r7
            r8 = r0
            ie9.h r8 = (ie9.h) r8
            java.lang.Object r9 = r8.b(r2)
            if (r9 != r3) goto L6e
            goto L89
        L6e:
            boolean r8 = r9 instanceof ie9.b
            if (r8 != 0) goto L92
            r2.f183058w = r6
            ie9.h r0 = (ie9.h) r0
            r0.getClass()
            ie9.g r8 = new ie9.g
            r9 = 0
            r8.<init>(r0, r9, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r8, r2)
            if (r9 != r3) goto L8a
        L89:
            return r3
        L8a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L93
        L92:
            r5 = r7
        L93:
            r8 = r5 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.passcode.ui.biometric_passcode_verification.b.I2(com.revolut.feature.passcode.ui.biometric_passcode_verification.b, gim.c):java.lang.Object");
    }

    public final void J2() {
        PasscodeScreenContract$VerificationMode passcodeScreenContract$VerificationMode = this.o.f78637b.f78626l;
        if (passcodeScreenContract$VerificationMode instanceof PasscodeScreenContract$VerificationMode.Default) {
            h.u2(this, this.u, BiometricPasscodeVerificationFlowContract$Step.Passcode.f78638a, null, 6);
        } else {
            if (!Intrinsics.f(passcodeScreenContract$VerificationMode, PasscodeScreenContract$VerificationMode.BiometricsOnly.f78628a)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(e.f183054a);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new l0(this, null, 12), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f78643s.f204633a, null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
