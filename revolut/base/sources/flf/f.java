package flf;

import elf.s0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f135958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vz1.g f135959m;

    public f(h0 commonDataSource, vz1.g apmPaymentsAuthorisationsRepository) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f135958l = commonDataSource;
        this.f135959m = apmPaymentsAuthorisationsRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof flf.e
            if (r0 == 0) goto L13
            r0 = r6
            flf.e r0 = (flf.e) r0
            int r1 = r0.f135957w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135957w = r1
            goto L18
        L13:
            flf.e r0 = new flf.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135957w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f135958l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f135957w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L63
        L48:
            tof.a3 r6 = (tof.a3) r6
            ibd.i r6 = r6.C
            if (r6 == 0) goto L7c
            java.lang.String r6 = r6.getId()
            if (r6 != 0) goto L55
            goto L7c
        L55:
            vz1.g r2 = r5.f135959m
            vkm.d r6 = r2.b(r6)
            r0.f135957w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r6 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r6
            if (r6 != 0) goto L71
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L71:
            com.revolut.feature.giro.api.navigation.GiroFormDestination$Edit r0 = new com.revolut.feature.giro.api.navigation.GiroFormDestination$Edit
            r0.<init>(r6)
            r5.A2(r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L7c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.f.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof flf.d
            if (r4 == 0) goto L13
            r4 = r6
            flf.d r4 = (flf.d) r4
            int r0 = r4.f135956w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f135956w = r0
            goto L1a
        L13:
            flf.d r4 = new flf.d
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f135956w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "ID_GIRO_LIMIT_EXCEEDED_ADJUST_LIMITS_ACTION"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L45
            r4.f135956w = r2
            java.lang.Object r4 = r3.Z2(r4)
            if (r4 != r0) goto L46
            return r0
        L45:
            r2 = 0
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: flf.f.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
