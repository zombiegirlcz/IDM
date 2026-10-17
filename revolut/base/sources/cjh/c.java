package cjh;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f24681a;

    public c(l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f24681a = tradingConfigInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ixg.b r13, java.lang.String r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof cjh.b
            if (r0 == 0) goto L13
            r0 = r15
            cjh.b r0 = (cjh.b) r0
            int r1 = r0.f24680y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24680y = r1
            goto L18
        L13:
            cjh.b r0 = new cjh.b
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f24678w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24680y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r14 = r0.v
            ixg.b r13 = r0.u
            yhm.o.b(r15)
        L2a:
            r6 = r13
            r5 = r14
            goto L51
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            yhm.o.b(r15)
            ybl.l r15 = r12.f24681a
            akg.n r15 = ybl.l.d(r15)
            r2 = 3
            r4 = 0
            jhi.b r15 = mo3.a.g(r15, r4, r4, r2)
            r0.u = r13
            r0.v = r14
            r0.f24680y = r3
            java.lang.Object r15 = vkm.q.x(r15, r0)
            if (r15 != r1) goto L2a
            return r1
        L51:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r15 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r15
            hel.b r13 = r15.f105106a
            hel.b r14 = hel.b.GB
            if (r13 != r14) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination r4 = new com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination
            if (r3 == 0) goto L63
            ixg.a r13 = ixg.a.PERFORMANCE
        L61:
            r7 = r13
            goto L66
        L63:
            ixg.a r13 = ixg.a.TOTAL_VALUE
            goto L61
        L66:
            grl.k9 r13 = grl.k9.Wealth
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r14 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r14 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = com.google.android.gms.internal.mlkit_vision_face.a.h(r13, r14, r13)
            r10 = 0
            r11 = 32
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cjh.c.a(ixg.b, java.lang.String, gim.c):java.lang.Object");
    }
}
