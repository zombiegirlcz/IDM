package k62;

import kotlin.jvm.internal.Intrinsics;
import tnb.g0;
import vz1.g;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f181616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f181617b;

    public b(g0 repository, g apmPaymentsAuthorisationsRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f181616a = repository;
        this.f181617b = apmPaymentsAuthorisationsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k62.a
            if (r0 == 0) goto L13
            r0 = r7
            k62.a r0 = (k62.a) r0
            int r1 = r0.f181615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181615w = r1
            goto L18
        L13:
            k62.a r0 = new k62.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181615w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            j02.m r7 = new j02.m
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.IRIS
            j02.i r4 = new j02.i
            r4.<init>(r6)
            r7.<init>(r2, r4)
            r0.f181615w = r3
            vz1.g r6 = r5.f181617b
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r7 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r7
            com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails$ConfirmPayment r6 = new com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails$ConfirmPayment
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k62.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}
