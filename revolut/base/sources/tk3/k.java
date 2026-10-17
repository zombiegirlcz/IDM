package tk3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji0.a f271873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f271874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f271875c;

    public k(ji0.a smsRetrieverClient, c otpVerificator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(smsRetrieverClient, "smsRetrieverClient");
        Intrinsics.checkNotNullParameter(otpVerificator, "otpVerificator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f271873a = smsRetrieverClient;
        this.f271874b = otpVerificator;
        this.f271875c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tk3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tk3.f
            if (r0 == 0) goto L13
            r0 = r7
            tk3.f r0 = (tk3.f) r0
            int r1 = r0.f271864w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271864w = r1
            goto L1a
        L13:
            tk3.f r0 = new tk3.f
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271864w
            ji0.a r3 = r6.f271873a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r7)
            return r7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            pfm.h r7 = r3.a()
            r0.f271864w = r5
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L4a
            goto L73
        L4a:
            ihm.j r7 = r3.f174319b
            vkm.d r7 = rd0.e.b(r7)
            com.revolut.feature.confirmation_code.toggles.ESignOtpToggles$SmsOtpExtraction r2 = com.revolut.feature.confirmation_code.toggles.ESignOtpToggles$SmsOtpExtraction.f65950c
            gte.a r3 = r6.f271875c
            jte.d r3 = (jte.d) r3
            boolean r2 = r3.c(r2)
            tk3.c r3 = r6.f271874b
            if (r2 == 0) goto L65
            tk3.i r2 = new tk3.i
            r5 = 1
            r2.<init>(r7, r3, r5)
            goto L6b
        L65:
            tk3.i r2 = new tk3.i
            r5 = 0
            r2.<init>(r7, r3, r5)
        L6b:
            r0.f271864w = r4
            java.lang.Object r7 = vkm.q.x(r2, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tk3.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
