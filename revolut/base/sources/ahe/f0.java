package ahe;

import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f4990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4991c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i, Object obj2, Object obj3, Object obj4, FlowCollector flowCollector) {
        this.f4989a = i;
        this.f4990b = flowCollector;
        this.f4991c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dfj.g
            if (r0 == 0) goto L13
            r0 = r9
            dfj.g r0 = (dfj.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dfj.g r0 = new dfj.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L6d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r8 = r0.f113973y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f113972x
            yhm.o.b(r9)
            goto L5f
        L3a:
            yhm.o.b(r9)
            pej.c r8 = (pej.c) r8
            java.lang.Object r9 = r7.f4991c
            dfj.j r9 = (dfj.j) r9
            kej.d r9 = r9.f
            java.lang.Object r2 = r7.d
            dfj.a r2 = (dfj.a) r2
            kej.a r2 = r2.f113901b
            kotlinx.coroutines.flow.FlowCollector r5 = r7.f4990b
            r0.f113972x = r5
            r6 = 0
            r0.f113973y = r6
            r0.v = r4
            kej.f r9 = (kej.f) r9
            java.lang.Object r9 = r9.a(r2, r8, r0)
            if (r9 != r1) goto L5d
            goto L6c
        L5d:
            r2 = r5
            r8 = r6
        L5f:
            r4 = 0
            r0.f113972x = r4
            r0.f113973y = r8
            r0.v = r3
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dyh.d
            if (r0 == 0) goto L13
            r0 = r8
            dyh.d r0 = (dyh.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dyh.d r0 = new dyh.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L66
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r8 = r7.f186385a
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r7 = r7.f186386b
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            dyh.a r2 = new dyh.a
            java.lang.Object r4 = r6.f4991c
            r10.q r4 = (r10.q) r4
            java.lang.Object r4 = r4.f250849b
            r39.a r4 = (r39.a) r4
            java.lang.Object r5 = r6.d
            com.revolut.feature.exchange.models.ExchangeOrder r5 = (com.revolut.feature.exchange.models.ExchangeOrder) r5
            com.revolut.feature.exchange.models.ExchangeOrderInfo r5 = r5.getF72134a()
            java.lang.Object r8 = r8.getContent()
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r8 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r8
            myh.i r8 = r4.i(r5, r8)
            r2.<init>(r8, r7)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f4990b
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r7.emit(r1, r2) != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof ei3.l
            if (r2 == 0) goto L17
            r2 = r1
            ei3.l r2 = (ei3.l) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            ei3.l r2 = new ei3.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 2
            r6 = 1
            r11 = 0
            if (r4 == 0) goto L43
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            yhm.o.b(r1)
            goto L98
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            int r4 = r2.z
            com.revolut.data.model.Data r6 = r2.f126384y
            kotlinx.coroutines.flow.FlowCollector r7 = r2.f126383x
            yhm.o.b(r1)
            r12 = r6
            goto L77
        L43:
            yhm.o.b(r1)
            r1 = r19
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            java.lang.Object r4 = r1.getContent()
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            r4 = 0
            kotlinx.coroutines.flow.FlowCollector r13 = r0.f4990b
            if (r8 == 0) goto L88
            dp4.p r7 = new dp4.p
            java.lang.Object r9 = r0.f4991c
            ei3.m r9 = (ei3.m) r9
            java.lang.Object r10 = r0.d
            com.revolut.core.model.account.AccountId r10 = (com.revolut.core.model.account.AccountId) r10
            r12 = 15
            r7.<init>(r8, r9, r10, r11, r12)
            r2.f126383x = r13
            r2.f126384y = r1
            r2.z = r4
            r2.v = r6
            java.lang.Object r6 = skm.e0.o(r7, r2)
            if (r6 != r3) goto L74
            goto L97
        L74:
            r12 = r1
            r1 = r6
            r7 = r13
        L77:
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            com.revolut.data.model.Data r1 = com.revolut.data.model.Data.copy$default(r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L89
            r13 = r7
            r1 = r12
        L88:
            r7 = r13
        L89:
            r2.f126383x = r11
            r2.f126384y = r11
            r2.z = r4
            r2.v = r5
            java.lang.Object r1 = r7.emit(r1, r2)
            if (r1 != r3) goto L98
        L97:
            return r3
        L98:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r8.emit(r3, r1) != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            pr6.e r0 = (pr6.e) r0
            boolean r1 = r11 instanceof et6.y
            if (r1 == 0) goto L17
            r1 = r11
            et6.y r1 = (et6.y) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            et6.y r1 = new et6.y
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L44
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r11)
            goto La8
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r1.z
            com.revolut.data.model.Data r3 = r1.f129379y
            kotlinx.coroutines.flow.FlowCollector r5 = r1.f129378x
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L42
            goto L74
        L42:
            r11 = move-exception
            goto L8f
        L44:
            yhm.o.b(r11)
            r3 = r10
            com.revolut.data.model.Data r3 = (com.revolut.data.model.Data) r3
            java.lang.Throwable r10 = r3.getError()
            java.lang.Object r11 = r3.getContent()
            r7 = 0
            kotlinx.coroutines.flow.FlowCollector r8 = r9.f4990b
            if (r11 != 0) goto L99
            if (r10 == 0) goto L99
            java.lang.Object r10 = r9.f4991c     // Catch: java.lang.Throwable -> L8c
            r10.r r10 = (r10.r) r10     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.f250853c     // Catch: java.lang.Throwable -> L8c
            et6.f1 r10 = (et6.f1) r10     // Catch: java.lang.Throwable -> L8c
            dj0.d r11 = r0.f     // Catch: java.lang.Throwable -> L88
            r1.f129378x = r8     // Catch: java.lang.Throwable -> L88
            r1.f129379y = r3     // Catch: java.lang.Throwable -> L88
            r1.z = r7     // Catch: java.lang.Throwable -> L88
            r1.v = r5     // Catch: java.lang.Throwable -> L88
            java.lang.Object r11 = r10.a(r11, r1)     // Catch: java.lang.Throwable -> L88
            if (r11 != r2) goto L72
            goto La7
        L72:
            r10 = r7
            r5 = r8
        L74:
            dj0.d r11 = (dj0.d) r11     // Catch: java.lang.Throwable -> L42
            pr6.g r7 = new pr6.g     // Catch: java.lang.Throwable -> L42
            r7.<init>(r0, r6, r11)     // Catch: java.lang.Throwable -> L42
            boolean r11 = r3.getLoading()     // Catch: java.lang.Throwable -> L42
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L42
            r0.<init>(r7, r6, r11)     // Catch: java.lang.Throwable -> L42
        L84:
            r7 = r10
            r3 = r0
            r8 = r5
            goto L99
        L88:
            r11 = move-exception
        L89:
            r10 = r7
            r5 = r8
            goto L8f
        L8c:
            r10 = move-exception
            r11 = r10
            goto L89
        L8f:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            boolean r3 = r3.getLoading()
            r0.<init>(r6, r11, r3)
            goto L84
        L99:
            r1.f129378x = r6
            r1.f129379y = r6
            r1.z = r7
            r1.v = r4
            java.lang.Object r10 = r8.emit(r3, r1)
            if (r10 != r2) goto La8
        La7:
            return r2
        La8:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fi6.e
            if (r0 == 0) goto L13
            r0 = r9
            fi6.e r0 = (fi6.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fi6.e r0 = new fi6.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L7f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r7.f4991c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r7.d
            java.util.List r2 = (java.util.List) r2
            r4 = 2
            java.util.List[] r5 = new java.util.List[r4]
            r6 = 0
            r5[r6] = r9
            r5[r3] = r2
        L44:
            if (r6 >= r4) goto L74
            r2 = r5[r6]
            if (r2 != 0) goto L4d
            int r6 = r6 + 1
            goto L44
        L4d:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L58:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.revolut.feature.credit.card.models.CreditCard r5 = (com.revolut.feature.credit.card.models.CreditCard) r5
            if (r9 == 0) goto L58
            java.lang.String r5 = r5.f69793b
            boolean r5 = r9.contains(r5)
            if (r5 != r3) goto L58
            r2.add(r4)
            goto L58
        L73:
            r8 = r2
        L74:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f4990b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L7f
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r5.emit(r9, r1) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4991c
            fla.g r0 = (fla.g) r0
            boolean r1 = r9 instanceof fla.e
            if (r1 == 0) goto L17
            r1 = r9
            fla.e r1 = (fla.e) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            fla.e r1 = new fla.e
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r9)
            goto L7c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            int r8 = r1.z
            com.revolut.data.model.Data r3 = r1.f135923y
            kotlinx.coroutines.flow.FlowCollector r5 = r1.f135922x
            yhm.o.b(r9)
            goto L5a
        L40:
            yhm.o.b(r9)
            r3 = r8
            com.revolut.data.model.Data r3 = (com.revolut.data.model.Data) r3
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f4990b
            r1.f135922x = r8
            r1.f135923y = r3
            r9 = 0
            r1.z = r9
            r1.v = r5
            java.lang.Object r5 = r0.a(r1)
            if (r5 != r2) goto L58
            goto L7b
        L58:
            r5 = r8
            r8 = r9
        L5a:
            java.lang.Object r9 = r3.getContent()
            jla.f r9 = (jla.f) r9
            r3 = 0
            if (r9 == 0) goto L6c
            java.lang.Object r6 = r7.d
            java.lang.String r6 = (java.lang.String) r6
            jla.c r9 = r0.c(r9, r6, r3)
            goto L6d
        L6c:
            r9 = r3
        L6d:
            r1.f135922x = r3
            r1.f135923y = r3
            r1.z = r8
            r1.v = r4
            java.lang.Object r8 = r5.emit(r9, r1)
            if (r8 != r2) goto L7c
        L7b:
            return r2
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g0c.a
            if (r0 == 0) goto L13
            r0 = r15
            g0c.a r0 = (g0c.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            g0c.a r0 = new g0c.a
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L6f
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r6 = r14.booleanValue()
            od0.h r14 = od0.i.Companion
            java.lang.Object r15 = r13.f4991c
            g0c.b r15 = (g0c.b) r15
            java.lang.Object r15 = r15.f139415b
            r4 = r15
            h0c.a r4 = (h0c.a) r4
            m1c.i1 r5 = m1c.i1.CREDIT_CARD
            java.lang.Object r15 = r13.d
            r7 = r15
            m1c.h1 r7 = (m1c.h1) r7
            int r8 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit_card
            int r9 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_credit_card_title
            int r10 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_credit_card_subtitle
            int r15 = com.revolut.feature.rev_points.api.R$string.rev_points_earn_disabled
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r15)
            r12 = 320(0x140, float:4.48E-43)
            m1c.j1 r15 = h0c.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.getClass()
            od0.i r14 = od0.h.a(r15)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f4990b
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L6f
            return r1
        L6f:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g0c.d
            if (r0 == 0) goto L13
            r0 = r15
            g0c.d r0 = (g0c.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            g0c.d r0 = new g0c.d
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L66
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r6 = r14.booleanValue()
            od0.h r14 = od0.i.Companion
            java.lang.Object r15 = r13.f4991c
            g0c.f r15 = (g0c.f) r15
            h0c.a r4 = r15.f139426c
            m1c.i1 r5 = m1c.i1.CRYPTO
            java.lang.Object r15 = r13.d
            r7 = r15
            m1c.h1 r7 = (m1c.h1) r7
            int r8 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_bitcoin
            int r9 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_crypto_title
            int r10 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_crypto_subtitle
            r11 = 0
            r12 = 448(0x1c0, float:6.28E-43)
            m1c.j1 r15 = h0c.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.getClass()
            od0.i r14 = od0.h.a(r15)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f4990b
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g0c.g
            if (r0 == 0) goto L13
            r0 = r15
            g0c.g r0 = (g0c.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            g0c.g r0 = new g0c.g
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L69
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r6 = r14.booleanValue()
            od0.h r14 = od0.i.Companion
            java.lang.Object r15 = r13.f4991c
            g0c.b r15 = (g0c.b) r15
            java.lang.Object r15 = r15.f139415b
            r4 = r15
            h0c.a r4 = (h0c.a) r4
            m1c.i1 r5 = m1c.i1.DONATIONS
            java.lang.Object r15 = r13.d
            r7 = r15
            m1c.h1 r7 = (m1c.h1) r7
            int r8 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart
            int r9 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_donations_title
            int r10 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_donations_subtitle
            r11 = 0
            r12 = 448(0x1c0, float:6.28E-43)
            m1c.j1 r15 = h0c.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.getClass()
            od0.i r14 = od0.h.a(r15)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f4990b
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L69
            return r1
        L69:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g0c.j
            if (r0 == 0) goto L13
            r0 = r15
            g0c.j r0 = (g0c.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            g0c.j r0 = new g0c.j
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L66
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r6 = r14.booleanValue()
            od0.h r14 = od0.i.Companion
            java.lang.Object r15 = r13.f4991c
            g0c.l r15 = (g0c.l) r15
            h0c.a r4 = r15.d
            m1c.i1 r5 = m1c.i1.ESIM
            java.lang.Object r15 = r13.d
            r7 = r15
            m1c.h1 r7 = (m1c.h1) r7
            int r8 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_sim_card
            int r9 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_esim_title
            int r10 = com.revolut.feature.rev_points.api.R$string.rev_points_redeem_redeem_ways_esim_subtitle
            r11 = 0
            r12 = 448(0x1c0, float:6.28E-43)
            m1c.j1 r15 = h0c.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.getClass()
            od0.i r14 = od0.h.a(r15)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f4990b
            java.lang.Object r14 = r15.emit(r14, r0)
            if (r14 != r1) goto L66
            return r1
        L66:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0af5 A[LOOP:9: B:514:0x0ac4->B:527:0x0af5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0bcb  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0af9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:280:0x0606 -> B:281:0x0611). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r43, kotlin.coroutines.Continuation r44) {
        /*
            Method dump skipped, instruction units count: 3144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.f0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ f0(FlowCollector flowCollector, Object obj2, Object obj3, int i) {
        this.f4989a = i;
        this.f4990b = flowCollector;
        this.f4991c = obj2;
        this.d = obj3;
    }

    public f0(FlowCollector flowCollector, Set set, io3.l lVar, ft4.i0 i0Var) {
        this.f4989a = 24;
        this.f4990b = flowCollector;
        this.f4991c = set;
        this.d = lVar;
    }
}
