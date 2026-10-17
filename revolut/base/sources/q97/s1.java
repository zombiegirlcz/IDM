package q97;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class s1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ti9.h f243783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq3.u f243784c;
    public final xh9.a d;
    public final gz3.a e;
    public final t97.d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t97.c productCellProvider, ti9.h payLaterProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, xh9.a payLaterInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f243783b = payLaterProductFeatureTogglesInteractor;
        this.f243784c = creditMarketingAvailabilityInteractor;
        this.d = payLaterInteractor;
        this.e = startCreditApplicationNavigationDestinationProvider;
        this.f = t97.d.PAY_LATER;
    }

    @Override // r97.b
    public final Flow d() {
        return cp5.d.h(new vkm.y(mo3.a.g(rd0.e.n(this.f243783b.j(), zhm.h0.f322473a), null, new q92.f(23), 1), new otd.a(3, 23, null)), new p1(this, 1));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof q97.r1
            if (r0 == 0) goto L13
            r0 = r10
            q97.r1 r0 = (q97.r1) r0
            int r1 = r0.f243777w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243777w = r1
            goto L1a
        L13:
            q97.r1 r0 = new q97.r1
            gim.c r10 = (gim.c) r10
            r0.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243777w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L53
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            yhm.o.b(r10)
            w4l.h r10 = w4l.h.f294642c
            xh9.a r2 = r9.d
            ti9.g r2 = (ti9.g) r2
            cxe.u r10 = r2.k(r10)
            q92.f r2 = new q92.f
            r5 = 22
            r2.<init>(r5)
            jhi.b r10 = mo3.a.g(r10, r4, r2, r3)
            r0.f243777w = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L53
            return r1
        L53:
            od0.i r10 = (od0.i) r10
            java.lang.Object r10 = r10.f224257a
            zh9.i0 r10 = (zh9.i0) r10
            if (r10 == 0) goto L65
            zh9.i r10 = r10.f322286b
            if (r10 == 0) goto L65
            zh9.h r10 = r10.f
            if (r10 == 0) goto L65
            java.lang.String r4 = r10.f322267a
        L65:
            if (r4 == 0) goto L77
            o97.l r10 = new o97.l
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig r1 = new com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig
            r1.<init>(r4)
            r0.<init>(r1)
            r10.<init>(r0)
            return r10
        L77:
            o97.d r10 = new o97.d
            ft3.d r2 = ft3.d.INSTANCE
            grl.r2 r1 = grl.r2.GLOBAL_SEARCH
            yp3.e r6 = yp3.e.ALWAYS_CHECK
            r7 = 0
            r8 = 16122(0x3efa, float:2.2592E-41)
            gz3.a r0 = r9.e
            r3 = 0
            r4 = 0
            r5 = 0
            com.revolut.kompot.common.ParcelableDestination r0 = ov3.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.s1.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
