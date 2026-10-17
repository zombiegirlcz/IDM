package qx4;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f250017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f250018c;

    public /* synthetic */ b(FlowCollector flowCollector, Object obj2, int i) {
        this.f250016a = i;
        this.f250017b = flowCollector;
        this.f250018c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rmf.c
            if (r0 == 0) goto L13
            r0 = r9
            rmf.c r0 = (rmf.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rmf.c r0 = new rmf.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L82
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r9 = r8.f186385a
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r8.f186386b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r7.f250018c
            rmf.d r2 = (rmf.d) r2
            ekf.y r2 = r2.f255277q
            r2.getClass()
            java.lang.String r2 = "actions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            if (r8 == 0) goto L77
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r9, r2)
            r8.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L5d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r9.next()
            com.revolut.core.ui_kit.views.ActionsView$Item r2 = (com.revolut.core.ui_kit.views.ActionsView.Item) r2
            mx0.d r4 = mx0.d.CONTEXTUAL
            r5 = 0
            r6 = 32765(0x7ffd, float:4.5914E-41)
            com.revolut.core.ui_kit.views.ActionsView$Item r2 = com.revolut.core.ui_kit.views.ActionsView.Item.e(r2, r4, r5, r6)
            r8.add(r2)
            goto L5d
        L76:
            r9 = r8
        L77:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f250017b
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L82
            return r1
        L82:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r9 == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (r9 == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r9 == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0157, code lost:
    
        if (r0.emit(r9, r1) == r2) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[PHI: r0 r8 r9
      0x00af: PHI (r0v17 kotlinx.coroutines.flow.FlowCollector) = (r0v8 kotlinx.coroutines.flow.FlowCollector), (r0v18 kotlinx.coroutines.flow.FlowCollector) binds: [B:68:0x0143, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r8v29 int) = (r8v18 int), (r8v30 int) binds: [B:68:0x0143, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r9v36 com.revolut.retail.feature.api.AnalyticsAccount) = (r9v28 com.revolut.retail.feature.api.AnalyticsAccount), (r9v40 com.revolut.retail.feature.api.AnalyticsAccount) binds: [B:68:0x0143, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[PHI: r0 r4 r8
      0x00b4: PHI (r0v13 kotlinx.coroutines.flow.FlowCollector) = 
      (r0v8 kotlinx.coroutines.flow.FlowCollector)
      (r0v8 kotlinx.coroutines.flow.FlowCollector)
      (r0v10 kotlinx.coroutines.flow.FlowCollector)
      (r0v10 kotlinx.coroutines.flow.FlowCollector)
      (r0v10 kotlinx.coroutines.flow.FlowCollector)
      (r0v18 kotlinx.coroutines.flow.FlowCollector)
      (r0v18 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:66:0x013b, B:68:0x0143, B:57:0x0113, B:59:0x011b, B:60:0x011d, B:35:0x00a4, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r4v3 com.revolut.retail.feature.api.AnalyticsAccount) = 
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v2 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
      (r4v0 com.revolut.retail.feature.api.AnalyticsAccount)
     binds: [B:66:0x013b, B:68:0x0143, B:57:0x0113, B:59:0x011b, B:60:0x011d, B:35:0x00a4, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r8v23 int) = (r8v18 int), (r8v18 int), (r8v20 int), (r8v20 int), (r8v20 int), (r8v30 int), (r8v30 int) binds: [B:66:0x013b, B:68:0x0143, B:57:0x0113, B:59:0x011b, B:60:0x011d, B:35:0x00a4, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rrk.c
            if (r0 == 0) goto L13
            r0 = r8
            rrk.c r0 = (rrk.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rrk.c r0 = new rrk.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto La2
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r8 = r7.getContent()
            if (r8 != 0) goto L97
            boolean r8 = r7.getLoading()
            if (r8 != 0) goto L97
            java.lang.Object r8 = r6.f250018c
            trk.a r8 = (trk.a) r8
            java.lang.String r2 = "assetType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            int[] r2 = rrk.a.f256883a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r3) goto L7e
            r2 = 2
            if (r8 == r2) goto L6f
            r2 = 3
            if (r8 != r2) goto L69
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Bonds r8 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Bonds.DIRTY_PRICE
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Bonds r2 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Bonds.CURRENT_YIELD
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Bonds r4 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Bonds.YIELD_TO_MATURITY
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Bonds[] r8 = new com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Bonds[]{r8, r2, r4}
            java.util.List r8 = zhm.v.k(r8)
            goto L8e
        L69:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L6f:
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Etf r8 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Etf.NET_ASSET_VALUE
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Etf r2 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Etf.DIVIDEND_YIELD
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Etf r4 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Etf.NET_EXPENSE_RATIO
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Etf[] r8 = new com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Etf[]{r8, r2, r4}
            java.util.List r8 = zhm.v.k(r8)
            goto L8e
        L7e:
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Stocks r8 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Stocks.MARKET_CAP
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Stocks r2 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Stocks.PRICE_TO_EARNINGS_RATIO_RFY
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Stocks r4 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Stocks.EARNINGS_PER_SHARE_RFY
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Stocks r5 = com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Stocks.DIVIDEND_YIELD
            com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId$Stocks[] r8 = new com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId.Stocks[]{r8, r2, r4, r5}
            java.util.List r8 = zhm.v.k(r8)
        L8e:
            java.lang.Throwable r7 = r7.getError()
            r2 = 0
            com.revolut.data.model.Data r7 = zi0.c.P(r8, r2, r7, r3)
        L97:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f250017b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto La2
            return r1
        La2:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r7.emit(r10, r1) != r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f250018c
            rsk.f r0 = (rsk.f) r0
            boolean r1 = r11 instanceof rsk.e
            if (r1 == 0) goto L17
            r1 = r11
            rsk.e r1 = (rsk.e) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            rsk.e r1 = new rsk.e
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L40
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r11)
            goto L9f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r1.f257105y
            kotlinx.coroutines.flow.FlowCollector r0 = r1.f257104x
            yhm.o.b(r11)
            goto L7d
        L40:
            yhm.o.b(r11)
            com.revolut.core.ui_kit.delegates.t r10 = (com.revolut.core.ui_kit.delegates.t) r10
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r11 = r10.f54722b
            java.lang.Object r11 = r11.f51596l
            boolean r3 = r11 instanceof com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date.CallDateWidgetContract$WidgetParcel
            if (r3 == 0) goto L50
            com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date.CallDateWidgetContract$WidgetParcel r11 = (com.revolut.retail.feature.stockdetails.impl.ui.delegates.call_date.CallDateWidgetContract$WidgetParcel) r11
            goto L51
        L50:
            r11 = r6
        L51:
            r3 = 0
            kotlinx.coroutines.flow.FlowCollector r7 = r9.f250017b
            if (r11 != 0) goto L59
            kotlin.Unit r10 = kotlin.Unit.f186387a
            goto L92
        L59:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r10 = r10.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$a r8 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.C0395a.f51607a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r10, r8)
            if (r8 == 0) goto L83
            r1.f257104x = r7
            r1.f257105y = r3
            r1.v = r5
            qrk.d r10 = r0.e
            tqk.a r0 = tqk.a.CALL_DATE
            java.lang.String r11 = r11.f103814a
            java.lang.Object r10 = r10.b(r0, r11, r1)
            if (r10 != r2) goto L76
            goto L78
        L76:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L78:
            if (r10 != r2) goto L7b
            goto L9e
        L7b:
            r10 = r3
            r0 = r7
        L7d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            r3 = r10
            r10 = r11
            r7 = r0
            goto L92
        L83:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$b r5 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.b.f51608a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r5)
            if (r10 == 0) goto L90
            rsk.b r10 = r0.f257106c
            r10.Z2(r11)
        L90:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L92:
            r1.f257104x = r6
            r1.f257105y = r3
            r1.v = r4
            java.lang.Object r10 = r7.emit(r10, r1)
            if (r10 != r2) goto L9f
        L9e:
            return r2
        L9f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru5.t
            if (r0 == 0) goto L13
            r0 = r6
            ru5.t r0 = (ru5.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ru5.t r0 = new ru5.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ru5.j r5 = (ru5.j) r5
            com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig$CurrencyMode r6 = r5.f257422l
            java.util.List r5 = r5.f257420h
            if (r5 == 0) goto L45
            java.lang.Object r2 = r4.f250018c
            ru5.z r2 = (ru5.z) r2
            lu5.d r2 = r2.v
            tof.q7 r5 = r2.a(r5)
            goto L46
        L45:
            r5 = 0
        L46:
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f250017b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rx5.h
            if (r0 == 0) goto L13
            r0 = r6
            rx5.h r0 = (rx5.h) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rx5.h r0 = new rx5.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r6 = r4.f250018c
            java.util.Map r6 = (java.util.Map) r6
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f250017b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws ryd.m {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ryd.t
            if (r0 == 0) goto L13
            r0 = r6
            ryd.t r0 = (ryd.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ryd.t r0 = new ryd.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r6 = r4.f250018c
            ryd.w r6 = (ryd.w) r6
            ryd.n r2 = ryd.w.Companion
            r6.getClass()
            java.lang.Object r6 = r5.getContent()
            boolean r6 = r6 instanceof com.revolut.feature.statements.api.models.StatementUrlState.InPreparation
            if (r6 != 0) goto L53
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f250017b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L53:
            ryd.m r5 = new ryd.m
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ryj.u
            if (r0 == 0) goto L13
            r0 = r6
            ryj.u r0 = (ryj.u) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ryj.u r0 = new ryj.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r6 = r4.f250018c
            ryj.p r6 = (ryj.p) r6
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f250017b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof s56.r0
            if (r0 == 0) goto L13
            r0 = r15
            s56.r0 r0 = (s56.r0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            s56.r0 r0 = new s56.r0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L92
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            s56.m0 r14 = (s56.m0) r14
            if (r14 == 0) goto L86
            java.lang.Object r15 = r13.f250018c
            r4 = r15
            com.revolut.feature.defi.remittances.impl.ui.send.amount.b r4 = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) r4
            s56.n r15 = r14.f259968b
            java.lang.String r5 = r14.f259967a
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r6 = r14.f259969c
            com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails r7 = r14.d
            xi0.b r9 = r14.e
            wk5.a r8 = r14.f
            s56.n r14 = s56.n.ASSET_OUT
            if (r15 != r14) goto L5e
            com.revolut.feature.defi.asset_details.api.model.DefiCurrency r14 = r7.f71665a
            xi0.b r9 = r14.getCurrency()
            com.revolut.feature.defi.asset_details.api.model.DefiCurrency r14 = r7.f71665a
            int r10 = r14.d
            b36.d r11 = b36.d.BUY
            b36.a r12 = b36.a.ASSET
            s56.s r14 = com.revolut.feature.defi.remittances.impl.ui.send.amount.b.K2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L87
        L5e:
            java.lang.String r14 = r6.f71635a
            com.revolut.feature.defi.asset_details.api.model.DefiCurrency r15 = r7.f71665a
            java.lang.String r15 = r15.f71671a
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r15)
            if (r14 == 0) goto L77
            int r10 = r9.c()
            b36.d r11 = b36.d.BUY
            b36.a r12 = b36.a.FIAT
            s56.s r14 = com.revolut.feature.defi.remittances.impl.ui.send.amount.b.K2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L87
        L77:
            xi0.b r9 = r6.getCurrency()
            int r10 = r6.f71637c
            b36.d r11 = b36.d.SELL
            b36.a r12 = b36.a.ASSET
            s56.s r14 = com.revolut.feature.defi.remittances.impl.ui.send.amount.b.K2(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L87
        L86:
            r14 = 0
        L87:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f250017b
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L92
            return r1
        L92:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof s6e.u
            if (r0 == 0) goto L13
            r0 = r11
            s6e.u r0 = (s6e.u) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            s6e.u r0 = new s6e.u
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L8e
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r11 = 10
            int r11 = zhm.w.t(r10, r11)
            int r11 = zhm.q0.b(r11)
            r2 = 16
            if (r11 >= r2) goto L45
            r11 = r2
        L45:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L83
            java.lang.Object r11 = r10.next()
            com.revolut.feature.subaccount.api.models.Subaccount r11 = (com.revolut.feature.subaccount.api.models.Subaccount) r11
            pcd.s r4 = r11.getF88959a()
            java.lang.String r4 = r4.f234881a
            o61.a r5 = new o61.a
            pcd.s r6 = r11.getF88959a()
            java.lang.String r6 = r6.f234881a
            java.lang.String r7 = r11.getName()
            java.lang.Object r8 = r9.f250018c
            s6e.z r8 = (s6e.z) r8
            g6e.b r8 = r8.f260328l
            com.revolut.feature.subaccount.api.models.SubaccountType r11 = r11.c()
            s6e.d r8 = (s6e.d) r8
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r11 = r8.c(r11)
            r5.<init>(r6, r7, r11)
            r2.put(r4, r5)
            goto L4e
        L83:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r10 = r9.f250017b
            java.lang.Object r10 = r10.emit(r2, r0)
            if (r10 != r1) goto L8e
            return r1
        L8e:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sb0.d
            if (r0 == 0) goto L13
            r0 = r6
            sb0.d r0 = (sb0.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            sb0.d r0 = new sb0.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = r5
            kotlin.Unit r6 = (kotlin.Unit) r6
            java.lang.Object r6 = r4.f250018c
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
            boolean r2 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L44
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L45
        L44:
            r6 = 0
        L45:
            if (r6 != 0) goto L48
            goto L5f
        L48:
            int r2 = r6.findLastCompletelyVisibleItemPosition()
            int r6 = r6.getItemCount()
            int r6 = r6 + (-5)
            if (r2 <= r6) goto L5f
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f250017b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r3.emit(r12, r1) == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f250018c
            skm.a2 r0 = (skm.a2) r0
            boolean r1 = r13 instanceof se0.b
            if (r1 == 0) goto L17
            r1 = r13
            se0.b r1 = (se0.b) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            se0.b r1 = new se0.b
            r1.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            int r12 = r1.f262078x
            yhm.o.b(r13)
            goto L92
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            yhm.o.b(r13)
            goto L97
        L3d:
            yhm.o.b(r13)
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            boolean r13 = r0.d()
            kotlinx.coroutines.flow.FlowCollector r3 = r11.f250017b
            if (r13 == 0) goto L5c
            kotlin.jvm.internal.Intrinsics.h(r12)
            boolean r13 = zi0.c.E(r12)
            if (r13 == 0) goto L97
            r1.v = r5
            java.lang.Object r12 = r3.emit(r12, r1)
            if (r12 != r2) goto L97
            goto L90
        L5c:
            boolean r13 = r12.getLoading()
            r6 = 0
            if (r13 != 0) goto L6a
            java.lang.String r13 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            r13 = r5
            goto L6b
        L6a:
            r13 = r6
        L6b:
            boolean r7 = r12.getLoading()
            if (r7 != 0) goto L7c
            if (r13 == 0) goto L7a
            java.lang.Throwable r7 = r12.getError()
            if (r7 == 0) goto L7a
            goto L7c
        L7a:
            r8 = r6
            goto L7d
        L7c:
            r8 = r5
        L7d:
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r12
            com.revolut.data.model.Data r12 = com.revolut.data.model.Data.copy$default(r5, r6, r7, r8, r9, r10)
            r1.f262078x = r13
            r1.v = r4
            java.lang.Object r12 = r3.emit(r12, r1)
            if (r12 != r2) goto L91
        L90:
            return r2
        L91:
            r12 = r13
        L92:
            if (r12 == 0) goto L97
            r0.start()
        L97:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x08ea A[PHI: r0
      0x08ea: PHI (r0v38 dj0.d) = (r0v37 dj0.d), (r0v53 dj0.d) binds: [B:468:0x08b9, B:489:0x08e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:762:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r43, kotlin.coroutines.Continuation r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b(FlowCollector flowCollector, Object obj2, Object obj3, int i) {
        this.f250016a = i;
        this.f250017b = flowCollector;
        this.f250018c = obj3;
    }
}
