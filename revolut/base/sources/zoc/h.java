package zoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements ozg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f323972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tul.b f323973b;

    public h(zjh.f portfolioInteractor, tul.b portfolioMetricsInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        this.f323972a = portfolioInteractor;
        this.f323973b = portfolioMetricsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ozg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zoc.g
            if (r0 == 0) goto L13
            r0 = r7
            zoc.g r0 = (zoc.g) r0
            int r1 = r0.f323971x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323971x = r1
            goto L1a
        L13:
            zoc.g r0 = new zoc.g
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323971x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.f323971x = r4
            zjh.f r7 = r5.f323972a
            java.lang.Object r7 = r7.E(r6, r0)
            if (r7 != r1) goto L4a
            goto L5b
        L4a:
            tul.b r7 = r5.f323973b
            efm.b r6 = r7.j(r6)
            r7 = 0
            r0.u = r7
            r0.f323971x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zoc.h.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
