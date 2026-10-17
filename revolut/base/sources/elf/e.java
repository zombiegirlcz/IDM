package elf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tsi.b f127315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final eqj.g f127316n;

    public e(klf.h0 commonDataSource, tsi.b excludeTransactionSheetMapper, eqj.g transactionAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(excludeTransactionSheetMapper, "excludeTransactionSheetMapper");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        this.f127314l = commonDataSource;
        this.f127315m = excludeTransactionSheetMapper;
        this.f127316n = transactionAnalyticsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof elf.a
            if (r0 == 0) goto L13
            r0 = r5
            elf.a r0 = (elf.a) r0
            int r1 = r0.f127290w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127290w = r1
            goto L18
        L13:
            elf.a r0 = new elf.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127290w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            klf.h0 r5 = r4.f127314l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r0.f127290w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            tof.a3 r5 = (tof.a3) r5
            com.revolut.retail.feature.adjust_analytics.api.AdjustAnalyticsFeatureConfig$AdjustAnalytics$Destination r0 = new com.revolut.retail.feature.adjust_analytics.api.AdjustAnalyticsFeatureConfig$AdjustAnalytics$Destination
            r1 = 0
            r0.<init>(r5, r1)
            r4.A2(r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.e.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.e.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r3.equals("ID_ADJUST_ANALYTICS") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return Z2((gim.c) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r3.equals("ID_MENU_ITEM_ADJUST_FOR_ANALYTICS") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r2, java.lang.String r3, kotlin.coroutines.Continuation r4) {
        /*
            r1 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1882791006: goto L31;
                case -1386136230: goto L21;
                case 699241295: goto L11;
                case 1894641936: goto L8;
                default: goto L7;
            }
        L7:
            goto L39
        L8:
            java.lang.String r2 = "ID_MENU_ITEM_ADJUST_FOR_ANALYTICS"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2a
            goto L39
        L11:
            java.lang.String r0 = "ID_EXCLUDE_TITLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1a
            goto L39
        L1a:
            gim.c r4 = (gim.c) r4
            java.lang.Object r2 = r1.b3(r2, r4)
            return r2
        L21:
            java.lang.String r2 = "ID_ADJUST_ANALYTICS"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2a
            goto L39
        L2a:
            gim.c r4 = (gim.c) r4
            java.lang.Object r2 = r1.Z2(r4)
            return r2
        L31:
            java.lang.String r2 = "ID_CATEGORY"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
        L39:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L3c:
            gim.c r4 = (gim.c) r4
            java.lang.Object r2 = r1.c3(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.e.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof elf.c
            if (r0 == 0) goto L13
            r0 = r5
            elf.c r0 = (elf.c) r0
            int r1 = r0.f127303w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127303w = r1
            goto L18
        L13:
            elf.c r0 = new elf.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127303w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            klf.h0 r5 = r4.f127314l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r0.f127303w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            tof.a3 r5 = (tof.a3) r5
            java.lang.String r0 = r5.f272584c
            if (r0 == 0) goto L57
            java.lang.String r1 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$CategoryManagement$Destination r1 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$CategoryManagement$Destination
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$CategoryManagement$Mode$Select r2 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$CategoryManagement$Mode$Select
            r2.<init>(r5)
            r1.<init>(r0, r2)
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 == 0) goto L5d
            r4.A2(r1)
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.e.c3(gim.c):java.lang.Object");
    }
}
