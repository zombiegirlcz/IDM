package com.revolut.feature.salary_switch.impl.ui.brazil.flow;

import aqc.j;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import oki.h;
import omg.e;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements oqc.b {
    public final SalarySwitchBrFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f85274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f85275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f85276r;

    public b(SalarySwitchBrFlowContract$InputData inputData, j interactor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f85274p = interactor;
        this.f85275q = productArticleInteractor;
        this.f85276r = d.a(this, new c(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.salary_switch.impl.ui.brazil.flow.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof oqc.f
            if (r0 == 0) goto L13
            r0 = r5
            oqc.f r0 = (oqc.f) r0
            int r1 = r0.f227887w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227887w = r1
            goto L18
        L13:
            oqc.f r0 = new oqc.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227887w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$InputData r5 = r4.o
            java.lang.String r2 = r5.f85266a
            if (r2 == 0) goto L47
            boolean r2 = kotlin.text.d0.W(r2)
            if (r2 == 0) goto L3f
            goto L47
        L3f:
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$SalaryStatus r4 = new com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$SalaryStatus
            java.lang.String r5 = r5.f85266a
            r4.<init>(r5)
            return r4
        L47:
            aqc.j r4 = r4.f85274p
            r0.f227887w = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L5d
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$RequestsList r4 = com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step.RequestsList.f85270a
            return r4
        L5d:
            com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step$EnterEmployerDetails r4 = com.revolut.feature.salary_switch.impl.ui.brazil.flow.SalarySwitchBrFlowContract$Step.EnterEmployerDetails.f85268a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.salary_switch.impl.ui.brazil.flow.b.I2(com.revolut.feature.salary_switch.impl.ui.brazil.flow.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 8), new oqc.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85276r;
    }
}
