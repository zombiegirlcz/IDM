package i52;

import com.revolut.domain.models.transactions.ThreeDSTransaction;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f158569c;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f158567a = i;
        this.f158568b = obj2;
        this.f158569c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02bc A[Catch: all -> 0x037e, TryCatch #15 {all -> 0x037e, blocks: (B:53:0x02b5, B:55:0x02bc, B:66:0x02d6, B:57:0x02c1, B:59:0x02c5, B:60:0x02c8, B:62:0x02cc, B:63:0x02cf, B:65:0x02d3), top: B:207:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c1 A[Catch: all -> 0x037e, TryCatch #15 {all -> 0x037e, blocks: (B:53:0x02b5, B:55:0x02bc, B:66:0x02d6, B:57:0x02c1, B:59:0x02c5, B:60:0x02c8, B:62:0x02cc, B:63:0x02cf, B:65:0x02d3), top: B:207:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0313 A[Catch: all -> 0x031b, TryCatch #12 {all -> 0x031b, blocks: (B:73:0x0308, B:75:0x0313, B:90:0x033f, B:80:0x0325, B:82:0x0329, B:84:0x032d, B:87:0x0332, B:88:0x0337, B:89:0x0338), top: B:201:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0325 A[Catch: all -> 0x031b, TryCatch #12 {all -> 0x031b, blocks: (B:73:0x0308, B:75:0x0313, B:90:0x033f, B:80:0x0325, B:82:0x0329, B:84:0x032d, B:87:0x0332, B:88:0x0337, B:89:0x0338), top: B:201:0x0308 }] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.data.model.Data, com.revolut.feature.statements.api.StatementsMode, fna.c, fna.i, java.lang.String, java.util.Collection, java.util.Iterator, java.util.List, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02e8 -> B:201:0x0308). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 1609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jwf.m
            if (r0 == 0) goto L13
            r0 = r6
            jwf.m r0 = (jwf.m) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            jwf.m r0 = new jwf.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f158568b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlin.Unit r5 = (kotlin.Unit) r5
            java.lang.Object r5 = r4.f158569c
            com.revolut.feature.transport.impl.common.TransportHubLocation r5 = (com.revolut.feature.transport.impl.common.TransportHubLocation) r5
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof jwg.g
            if (r0 == 0) goto L13
            r0 = r12
            jwg.g r0 = (jwg.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            jwg.g r0 = new jwg.g
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L5a
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f158568b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            r4 = r11
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r11 = r4.getContent()
            if (r11 != 0) goto L51
            jwg.c r5 = new jwg.c
            java.lang.Object r11 = r10.f158569c
            com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType r11 = (com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType) r11
            r2 = 0
            r5.<init>(r11, r2, r2)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            com.revolut.data.model.Data r4 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
        L51:
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L5a
            return r1
        L5a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof jy5.c
            if (r0 == 0) goto L13
            r0 = r10
            jy5.c r0 = (jy5.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            jy5.c r0 = new jy5.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto La0
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f158568b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r2 = r9.f186385a
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            java.lang.Object r9 = r9.f186386b
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            kotlin.jvm.internal.Intrinsics.h(r2)
            r4 = 0
            java.lang.Object r5 = r2.getContent()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L7f
            xzg.h r5 = (xzg.h) r5     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = r9.getContent()     // Catch: java.lang.Throwable -> L7d
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L80
            java.lang.Object r9 = zhm.d0.d0(r9)     // Catch: java.lang.Throwable -> L7d
            xzg.g r9 = (xzg.g) r9     // Catch: java.lang.Throwable -> L7d
            if (r9 == 0) goto L80
            java.lang.Object r6 = r8.f158569c     // Catch: java.lang.Throwable -> L7d
            jy5.d r6 = (jy5.d) r6     // Catch: java.lang.Throwable -> L7d
            xzg.i r9 = jy5.d.a(r6, r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r9.f310000c     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r5 = r5.f309995b     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r9 = zhm.d0.F0(r9, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "percentageChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "points"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)     // Catch: java.lang.Throwable -> L7d
            xzg.h r5 = new xzg.h     // Catch: java.lang.Throwable -> L7d
            r5.<init>(r6, r9)     // Catch: java.lang.Throwable -> L7d
            goto L80
        L7d:
            r9 = move-exception
            goto L8e
        L7f:
            r5 = r4
        L80:
            java.lang.Throwable r9 = r2.getError()     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r2.getLoading()     // Catch: java.lang.Throwable -> L7d
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r5, r9, r6)     // Catch: java.lang.Throwable -> L7d
            goto L97
        L8e:
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data
            boolean r2 = r2.getLoading()
            r7.<init>(r4, r9, r2)
        L97:
            r0.v = r3
            java.lang.Object r9 = r10.emit(r7, r0)
            if (r9 != r1) goto La0
            return r1
        La0:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f158569c
            com.revolut.feature_crypto_order_flow.impl.order_summary.a r0 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) r0
            boolean r1 = r9 instanceof jzh.m0
            if (r1 == 0) goto L17
            r1 = r9
            jzh.m0 r1 = (jzh.m0) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            jzh.m0 r1 = new jzh.m0
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r9)
            goto L69
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f158568b
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r8 = (com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft) r8
            bzh.m r3 = new bzh.m
            aoa.k r5 = r0.f96785y
            boolean r5 = r5.b(r8)
            rga.c r0 = r0.B
            java.lang.String r6 = "order_summary_price_quote"
            java.lang.String r0 = r0.b(r6)
            if (r0 != 0) goto L4f
            r0 = 0
        L4f:
            r3.<init>(r8, r5, r0)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r8 = kyh.k.d(r8)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r8 = r8.e
            com.revolut.core.model.account.AccountId r8 = oyh.b.b(r8)
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r8 = bzh.l.a(r3, r8)
            r1.v = r4
            java.lang.Object r8 = r9.emit(r8, r1)
            if (r8 != r2) goto L69
            return r2
        L69:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k25.i
            if (r0 == 0) goto L13
            r0 = r8
            k25.i r0 = (k25.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            k25.i r0 = new k25.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f158568b
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            b8d.f0 r2 = new b8d.f0
            java.lang.Object r4 = r6.f158569c
            k25.u r4 = (k25.u) r4
            r5 = 2
            r2.<init>(r4, r5)
            k25.j r4 = k25.j.f180334a
            k25.k r5 = k25.k.f180335a
            java.lang.Object r7 = iii.c.f(r7, r4, r5, r2)
            r0.v = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k3k.n0
            if (r0 == 0) goto L13
            r0 = r7
            k3k.n0 r0 = (k3k.n0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            k3k.n0 r0 = new k3k.n0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f158568b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            k3k.x r6 = (k3k.x) r6
            java.lang.Object r2 = r5.f158569c
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r2 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData) r2
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r6, r2)
            r0.v = r3
            java.lang.Object r6 = r7.emit(r4, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f158569c
            k50.j4 r0 = (k50.j4) r0
            k50.m4 r0 = r0.S
            boolean r1 = r7 instanceof k50.g4
            if (r1 == 0) goto L19
            r1 = r7
            k50.g4 r1 = (k50.g4) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.v = r2
            goto L1e
        L19:
            k50.g4 r1 = new k50.g4
            r1.<init>(r5, r7)
        L1e:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            yhm.o.b(r7)
            goto L5b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f158568b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            v20.n r6 = (v20.n) r6
            boolean r3 = r6 instanceof v20.r2
            if (r3 == 0) goto L48
            v20.r2 r6 = (v20.r2) r6
            r0.e3(r6)
            goto L5b
        L48:
            boolean r3 = r6 instanceof v20.i1
            if (r3 == 0) goto L52
            v20.i1 r6 = (v20.i1) r6
            r0.f3(r6)
            goto L5b
        L52:
            r1.v = r4
            java.lang.Object r6 = r7.emit(r6, r1)
            if (r6 != r2) goto L5b
            return r2
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f158569c
            z45.e r0 = (z45.e) r0
            boolean r1 = r7 instanceof k65.c
            if (r1 == 0) goto L17
            r1 = r7
            k65.c r1 = (k65.c) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            k65.c r1 = new k65.c
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r7)
            goto L6b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f158568b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            nii.n1 r6 = (nii.n1) r6
            boolean r3 = r6 instanceof nii.l1
            if (r3 == 0) goto L45
            z45.b r6 = r0.f319323c
            z45.a r6 = r6.f319314b
            goto L60
        L45:
            boolean r3 = r6 instanceof nii.m1
            if (r3 == 0) goto L54
            z45.b r6 = r0.d
            if (r6 == 0) goto L51
            z45.a r6 = r6.f319314b
            if (r6 != 0) goto L60
        L51:
            z45.a r6 = z45.a.CLOSE
            goto L60
        L54:
            boolean r0 = r6 instanceof nii.k1
            if (r0 == 0) goto L5b
            z45.a r6 = z45.a.CLOSE
            goto L60
        L5b:
            boolean r6 = r6 instanceof nii.j1
            if (r6 == 0) goto L6e
            r6 = 0
        L60:
            if (r6 == 0) goto L6b
            r1.v = r4
            java.lang.Object r6 = r7.emit(r6, r1)
            if (r6 != r2) goto L6b
            return r2
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.emit(cub.a.f108937a, r1) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r0.emit(r9, r1) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f158568b
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            boolean r1 = r9 instanceof jyb.a
            if (r1 == 0) goto L17
            r1 = r9
            jyb.a r1 = (jyb.a) r1
            int r2 = r1.f179357w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f179357w = r2
            goto L1c
        L17:
            jyb.a r1 = new jyb.a
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f179357w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3d
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            yhm.o.b(r9)
            goto L8c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            goto L7b
        L3d:
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L41
            goto L66
        L41:
            r8 = move-exception
            goto L6b
        L43:
            yhm.o.b(r9)
            m1c.z0 r9 = r8.f84028a
            m1c.z0 r3 = m1c.z0.PENDING
            if (r9 != r3) goto L8f
            com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt r8 = r8.f84029b
            if (r8 != 0) goto L7e
            java.lang.Object r8 = r7.f158569c
            jyb.c r8 = (jyb.c) r8
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L41
            nyb.e0 r8 = r8.f179361n     // Catch: java.lang.Throwable -> L41
            r9 = 0
            efm.b r8 = r8.a(r9)     // Catch: java.lang.Throwable -> L41
            r1.f179357w = r6     // Catch: java.lang.Throwable -> L41
            java.lang.Object r8 = nim.a.a(r8, r1)     // Catch: java.lang.Throwable -> L41
            if (r8 != r2) goto L66
            goto L8b
        L66:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L41
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L41
            goto L70
        L6b:
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.o.a(r8)
        L70:
            r1.f179357w = r5
            cub.a r8 = cub.a.f108937a
            java.lang.Object r8 = r0.emit(r8, r1)
            if (r8 != r2) goto L7b
            goto L8b
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7e:
            cub.b r9 = new cub.b
            r9.<init>(r8)
            r1.f179357w = r4
            java.lang.Object r8 = r0.emit(r9, r1)
            if (r8 != r2) goto L8c
        L8b:
            return r2
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.a(com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:557:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r60, kotlin.coroutines.Continuation r61) {
        /*
            Method dump skipped, instruction units count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.l.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public l(FlowCollector flowCollector, ThreeDSTransaction threeDSTransaction, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar) {
        this.f158567a = 10;
        this.f158568b = flowCollector;
        this.f158569c = threeDSTransaction;
    }
}
