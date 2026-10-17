package llc;

import dlc.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tzg.m;
import ybl.l;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends h {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f196704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f196705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f196706n;
    public final zja.a o;

    public f(m wealthAccountsInteractor, l tradingConfigInteractor, gte.a featureToggleInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f196704l = wealthAccountsInteractor;
        this.f196705m = tradingConfigInteractor;
        this.f196706n = featureToggleInteractor;
        this.o = productArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(llc.f r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof llc.d
            if (r0 == 0) goto L16
            r0 = r6
            llc.d r0 = (llc.d) r0
            int r1 = r0.f196702w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f196702w = r1
            goto L1b
        L16:
            llc.d r0 = new llc.d
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196702w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            tzg.m r5 = r5.f196704l
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r6 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.ROBO
            r2 = 6
            r4 = 0
            akg.n r5 = tzg.m.d(r5, r6, r4, r2)
            r6 = 3
            jhi.b r5 = mo3.a.g(r5, r4, r4, r6)
            r0.f196702w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L5f
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5f
            goto L99
        L5f:
            java.util.Iterator r0 = r6.iterator()
        L63:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            com.revolut.feature.wealth.api.domain.model.WealthAccount r1 = (com.revolut.feature.wealth.api.domain.model.WealthAccount) r1
            xzg.o0 r1 = r1.getF95255c()
            xzg.o0 r2 = xzg.o0.AVAILABLE
            if (r1 != r2) goto L63
            if (r5 == 0) goto L83
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L83
            goto L9a
        L83:
            java.util.Iterator r5 = r6.iterator()
        L87:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r5.next()
            com.revolut.feature.wealth.api.domain.model.WealthAccount r6 = (com.revolut.feature.wealth.api.domain.model.WealthAccount) r6
            boolean r6 = r6.Q2()
            if (r6 == 0) goto L87
        L99:
            r3 = 0
        L9a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: llc.f.b3(llc.f, gim.c):java.lang.Object");
    }

    @Override // dlc.h
    public final Object Z2(ikf.g gVar) {
        return pu7.a.B(this.e, "strategies-article", new e(this, null), gVar);
    }
}
