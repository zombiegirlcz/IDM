package tbk;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbk.f f269558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f269559b;

    public g(wbk.f repository, a5h.g planChangeAppThemeManager, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(planChangeAppThemeManager, "planChangeAppThemeManager");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f269558a = repository;
        this.f269559b = pricingPlanInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof tbk.f
            if (r0 == 0) goto L13
            r0 = r13
            tbk.f r0 = (tbk.f) r0
            int r1 = r0.f269557x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269557x = r1
            goto L18
        L13:
            tbk.f r0 = new tbk.f
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269557x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kbk.f r11 = r0.u
            yhm.o.b(r13)
            goto L6e
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            yhm.o.b(r13)
            goto L5a
        L38:
            yhm.o.b(r13)
            r0.f269557x = r4
            wbk.f r13 = r10.f269558a
            r5 = r13
            wbk.h r5 = (wbk.h) r5
            r5.getClass()
            vq5.w r4 = new vq5.w
            r9 = 25
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L5a
            goto L6d
        L5a:
            r11 = r13
            kbk.f r11 = (kbk.f) r11
            ffk.t r12 = r10.f269559b
            rfm.f0 r12 = r12.y()
            r0.u = r11
            r0.f269557x = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L6e
        L6d:
            return r1
        L6e:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r13 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r13
            jbk.a r12 = new jbk.a
            kotlin.jvm.internal.Intrinsics.h(r13)
            r12.<init>(r13, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tbk.g.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
