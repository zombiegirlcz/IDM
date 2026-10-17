package com.revolut.feature.onboarding.selfie.impl.intro.flow;

import ang.f;
import com.revolut.feature.onboarding.selfie.impl.intro.flow.OnboardingSelfieIntroFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v48.d;
import vd9.c;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements vd9.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uq.a f78605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f78606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f78607r;

    public b(c inputData, uq.a biometricVerificationSelfieIntroScreenFactory, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieIntroScreenFactory, "biometricVerificationSelfieIntroScreenFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f78605p = biometricVerificationSelfieIntroScreenFactory;
        this.f78606q = userInteractor;
        d dVar = new d(this, 14);
        this.f78607r = cp5.d.a(this, OnboardingSelfieIntroFlowContract$Step.SelfieIntro.f78603a, f0.f322471a, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.onboarding.selfie.impl.intro.flow.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof vd9.e
            if (r0 == 0) goto L13
            r0 = r5
            vd9.e r0 = (vd9.e) r0
            int r1 = r0.f287832w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287832w = r1
            goto L18
        L13:
            vd9.e r0 = new vd9.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287832w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ang.f r4 = r4.f78606q
            w4l.j r5 = w4l.j.f294644c
            akg.n r4 = r4.j(r5)
            v78.d r5 = new v78.d
            r2 = 22
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.f287832w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            do3.n r5 = (do3.n) r5
            wi0.b r4 = do3.q.y(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.selfie.impl.intro.flow.b.I2(com.revolut.feature.onboarding.selfie.impl.intro.flow.b, gim.c):java.io.Serializable");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78607r;
    }
}
