package yjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f314457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f314458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.d f314459c;

    public c(ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f314457a = tradingAccountsInteractor;
        this.f314458b = tradingConfigInteractor;
        this.f314459c = portfolioInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yjh.a
            if (r0 == 0) goto L13
            r0 = r6
            yjh.a r0 = (yjh.a) r0
            int r1 = r0.f314452w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f314452w = r1
            goto L18
        L13:
            yjh.a r0 = new yjh.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f314452w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L76
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.j r6 = w4l.j.f294644c
            ybl.d r2 = r4.f314459c
            ael.y r2 = (ael.y) r2
            vkm.d r5 = r2.e(r5, r6)
            kotlin.coroutines.g r6 = kotlin.coroutines.g.f186406a
            efm.r r5 = rd0.e.c(r5, r6)
            yi5.b r6 = new yi5.b
            r2 = 21
            r6.<init>(r2)
            efm.r r5 = nim.a.w(r5, r6)
            yd8.a r6 = new yd8.a
            r6.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r6, r3)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            yi5.b r6 = new yi5.b
            r2 = 22
            r6.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            pfm.z r5 = ue0.e.I(r5, r2, r6)
            r0.f314452w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.c.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x016b -> B:64:0x016e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.wealth.ui.api.actions.WealthAction r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yjh.c.b(com.revolut.feature.wealth.ui.api.actions.WealthAction, gim.c):java.lang.Object");
    }
}
