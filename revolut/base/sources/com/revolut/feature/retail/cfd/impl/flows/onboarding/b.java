package com.revolut.feature.retail.cfd.impl.flows.onboarding;

import com.revolut.feature.retail.cfd.impl.flows.onboarding.CfdOnboardingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u3a.p;
import v2b.c;
import vkm.q;
import ybl.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements v2b.b {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f82167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f82168q;

    public b(l tradingConfigInteractor, zja.a productArticleInternalInteractor, c inputData) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleInternalInteractor, "productArticleInternalInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = tradingConfigInteractor;
        this.f82167p = productArticleInternalInteractor;
        p pVar = new p(this, inputData, 8);
        this.f82168q = d.a(this, CfdOnboardingFlowContract$Step.ProductArticle.f82161a, f0.f322471a, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum I2(com.revolut.feature.retail.cfd.impl.flows.onboarding.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof v2b.d
            if (r0 == 0) goto L13
            r0 = r7
            v2b.d r0 = (v2b.d) r0
            int r1 = r0.f285690w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285690w = r1
            goto L18
        L13:
            v2b.d r0 = new v2b.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f285690w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ybl.l r6 = r6.o
            akg.n r6 = ybl.l.d(r6)
            uw2.n r7 = new uw2.n
            r2 = 8
            r7.<init>(r2)
            v25.g r2 = new v25.g
            r4 = 6
            r2.<init>(r4)
            v25.g r4 = new v25.g
            r5 = 7
            r4.<init>(r5)
            jhi.b r6 = mo3.a.f(r6, r2, r7, r4)
            r0.f285690w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L61
            java.lang.Object r6 = r7.f224257a
            hel.b r6 = (hel.b) r6
            return r6
        L61:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.cfd.impl.flows.onboarding.b.I2(com.revolut.feature.retail.cfd.impl.flows.onboarding.b, gim.c):java.lang.Enum");
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.g(((kka.h) this.f82167p).d), null, null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82168q;
    }
}
