package m84;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oc4.i;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b34.b f203423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditInsuranceOfferFlowContract$InputData f203424b;

    public d(b34.b repository, CreditInsuranceOfferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f203423a = repository;
        this.f203424b = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oc4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof m84.b
            if (r0 == 0) goto L13
            r0 = r8
            m84.b r0 = (m84.b) r0
            int r1 = r0.f203422w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203422w = r1
            goto L18
        L13:
            m84.b r0 = new m84.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203422w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L66
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$InputData r8 = r7.f203424b
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r8 = r8.f67400a
            java.lang.String r8 = r8.f66892b
            b34.b r2 = r7.f203423a
            r2.getClass()
            java.lang.String r4 = "applicationId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.lang.String r4 = "loadingStrategy"
            w4l.j r5 = w4l.j.f294644c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            x4l.c r2 = r2.d
            vkm.d r8 = r2.b(r8, r5)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r8 = rd0.e.n(r8, r2)
            m84.c r2 = new m84.c
            r4 = 2
            r5 = 0
            r6 = 0
            r2.<init>(r4, r5, r6)
            r0.f203422w = r3
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            if (r8 == 0) goto L6f
            return r8
        L6f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.d.d(gim.c):java.lang.Object");
    }
}
