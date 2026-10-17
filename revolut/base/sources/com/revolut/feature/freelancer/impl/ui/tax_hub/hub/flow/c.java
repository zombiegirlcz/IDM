package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow;

import ang.f;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$Step;
import d8l.d;
import ds4.y;
import et6.l0;
import gr6.e;
import gr6.p;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements e37.b {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaxHubFlowContract$InputData f74279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f74280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a61.a f74281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f74282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f74283t;

    public c(e freelancerAvailabilityInteractor, TaxHubFlowContract$InputData inputData, p productArticleInteractor, a61.a taxConfigInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(taxConfigInteractor, "taxConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = freelancerAvailabilityInteractor;
        this.f74279p = inputData;
        this.f74280q = productArticleInteractor;
        this.f74281r = taxConfigInteractor;
        this.f74282s = userInteractor;
        this.f74283t = d.a(this, new dt4.p(this, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof e37.d
            if (r0 == 0) goto L13
            r0 = r6
            e37.d r0 = (e37.d) r0
            int r1 = r0.f122201w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122201w = r1
            goto L18
        L13:
            e37.d r0 = new e37.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122201w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cpb.j r6 = new cpb.j
            r2 = 0
            r4 = 26
            r6.<init>(r5, r2, r4)
            r0.f122201w = r3
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "withLoading(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            do3.n r6 = (do3.n) r6
            wi0.b r5 = do3.q.y(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c.I2(com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c, gim.c):java.io.Serializable");
    }

    public final TaxHubFlowContract$Step J2(Set set) {
        return (!((l0) this.o).k() || set.isEmpty()) ? TaxHubFlowContract$Step.Hub.f74266a : new TaxHubFlowContract$Step.TaxProfile(set, false);
    }

    @Override // yki.j
    public final void M0() {
        l2(new y(this, null, 22), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74283t;
    }
}
