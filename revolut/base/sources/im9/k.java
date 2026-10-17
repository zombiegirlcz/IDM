package im9;

import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f162333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f162334c;
    public final /* synthetic */ Object d;

    public k(jhi.b bVar, Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector) {
        this.f162332a = 1;
        this.f162334c = bVar;
        this.d = ref$ObjectRef;
        this.f162333b = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r6.emit(r9, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o65.j
            if (r0 == 0) goto L13
            r0 = r10
            o65.j r0 = (o65.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            o65.j r0 = new o65.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            goto L96
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            int r9 = r0.f222514y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f222513x
            yhm.o.b(r10)
            goto L6c
        L3e:
            yhm.o.b(r10)
            nii.n1 r9 = (nii.n1) r9
            boolean r10 = r9 instanceof nii.j1
            r2 = 0
            kotlinx.coroutines.flow.FlowCollector r6 = r8.f162333b
            if (r10 == 0) goto L4d
            o65.b$b r9 = o65.b.C1235b.f222502a
            goto L88
        L4d:
            boolean r10 = r9 instanceof nii.k1
            o65.b$a r7 = o65.b.a.f222501a
            if (r10 == 0) goto L55
            r9 = r7
            goto L88
        L55:
            boolean r10 = r9 instanceof nii.l1
            if (r10 == 0) goto L70
            java.lang.Object r9 = r8.f162334c
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0.f222513x = r6
            r0.f222514y = r2
            r0.v = r5
            java.lang.Object r10 = r9.invoke(r0)
            if (r10 != r1) goto L6a
            goto L95
        L6a:
            r9 = r2
            r2 = r6
        L6c:
            r6 = r2
            r2 = r9
            r9 = r10
            goto L88
        L70:
            boolean r9 = r9 instanceof nii.m1
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.d
            o65.l r9 = (o65.l) r9
            r0.f222513x = r6
            r0.f222514y = r2
            r0.v = r4
            r9.invoke(r0)
            if (r7 != r1) goto L84
            goto L95
        L84:
            r9 = r2
            r2 = r6
            r10 = r7
            goto L6c
        L88:
            r10 = 0
            r0.f222513x = r10
            r0.f222514y = r2
            r0.v = r3
            java.lang.Object r9 = r6.emit(r9, r0)
            if (r9 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L99:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r27, kotlin.coroutines.Continuation r28) throws java.lang.Throwable {
        /*
            r26 = this;
            r1 = r26
            r0 = r28
            boolean r2 = r0 instanceof okf.n
            if (r2 == 0) goto L17
            r2 = r0
            okf.n r2 = (okf.n) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            okf.n r2 = new okf.n
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r0)
            goto Lc3
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L34:
            yhm.o.b(r0)
            r0 = r27
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            java.lang.Object r4 = r1.f162334c
            okf.o r4 = (okf.o) r4
            java.lang.Object r0 = r0.getContent()
            od0.i r0 = (od0.i) r0
            r6 = 0
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r0.f224257a
            vl4.g r0 = (vl4.g) r0
            goto L4e
        L4d:
            r0 = r6
        L4e:
            java.lang.Object r7 = r1.d
            java.lang.String r7 = (java.lang.String) r7
            r4.getClass()
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            if (r0 != 0) goto L60
            zhm.f0 r0 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            goto Lb8
        L5c:
            r0 = move-exception
            goto L9b
        L5e:
            r0 = move-exception
            goto Lc6
        L60:
            cm4.j r4 = r4.f226027c     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            sv4.b r4 = (sv4.b) r4     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r8 = r4.a(r7, r0)     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r9 = new com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            java.lang.String r10 = "id_transaction_details_credit_card_statement"
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            int r0 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_related_statement_section_title     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            r4 = 14
            r12.<init>(r0, r6, r6, r4)     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            r24 = 0
            r25 = 65530(0xfffa, float:9.1827E-41)
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            java.util.List r0 = yp0.b.i(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5c java.util.concurrent.CancellationException -> L5e
            goto La1
        L9b:
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
        La1:
            java.lang.Throwable r4 = yhm.m.a(r0)
            if (r4 == 0) goto Laa
            hx7.e.n(r4)
        Laa:
            boolean r4 = r0 instanceof yhm.n
            if (r4 == 0) goto Laf
            goto Lb0
        Laf:
            r6 = r0
        Lb0:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto Lb7
            zhm.f0 r0 = zhm.f0.f322471a
            goto Lb8
        Lb7:
            r0 = r6
        Lb8:
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r1.f162333b
            java.lang.Object r0 = r4.emit(r0, r2)
            if (r0 != r3) goto Lc3
            return r3
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        Lc6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r28, kotlin.coroutines.Continuation r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            boolean r2 = r1 instanceof okf.q
            if (r2 == 0) goto L17
            r2 = r1
            okf.q r2 = (okf.q) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            okf.q r2 = new okf.q
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Lb7
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r1 = r28
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            java.lang.Object r4 = r0.f162334c
            okf.r r4 = (okf.r) r4
            java.lang.Object r1 = r1.getContent()
            od0.i r1 = (od0.i) r1
            r6 = 0
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r1.f224257a
            whf.p r1 = (whf.p) r1
            goto L4e
        L4d:
            r1 = r6
        L4e:
            java.lang.Object r7 = r0.d
            tof.v r7 = (tof.v) r7
            tof.w r7 = r7.f273110a
            r4.getClass()
            tof.w r8 = tof.w.CASH_LIKE_INTEREST
            if (r7 != r8) goto Laa
            if (r1 == 0) goto Laa
            java.util.List r7 = r1.f297646a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L66
            goto Laa
        L66:
            whf.n r4 = r4.f226031c
            whf.l r7 = new whf.l
            r8 = 0
            r7.<init>(r8)
            whf.j$a r8 = whf.j.a.f297643a
            anf.w r4 = (anf.w) r4
            java.util.ArrayList r9 = r4.c(r1, r7, r8)
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r10 = new com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_related_transaction_section_title
            r4 = 14
            r13.<init>(r1, r6, r6, r4)
            r25 = 0
            r26 = 65530(0xfffa, float:9.1827E-41)
            java.lang.String r11 = "id_header_related_transactions"
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = 0
            r14 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            java.util.ArrayList r1 = yp0.b.g(r9, r10, r11, r12, r13, r14)
            goto Lac
        Laa:
            zhm.f0 r1 = zhm.f0.f322471a
        Lac:
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f162333b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto Lb7
            return r3
        Lb7:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r12, kotlin.coroutines.Continuation r13) throws java.io.IOException {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ook.e
            if (r0 == 0) goto L13
            r0 = r13
            ook.e r0 = (ook.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ook.e r0 = new ook.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L73
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            java.lang.Throwable r13 = r12.getError()
            boolean r2 = r13 instanceof retrofit2.HttpException
            r4 = 0
            if (r2 == 0) goto L40
            retrofit2.HttpException r13 = (retrofit2.HttpException) r13
            goto L41
        L40:
            r13 = r4
        L41:
            if (r13 == 0) goto L5b
            int r2 = r13.code()
            r5 = 403(0x193, float:5.65E-43)
            if (r2 != r5) goto L5b
            java.lang.Object r2 = r11.f162334c
            hd.r r2 = (hd.r) r2
            java.lang.Object r2 = r2.d
            kl.b0 r2 = (kl.b0) r2
            java.lang.Object r4 = r11.d
            com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry r4 = (com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry) r4
            com.revolut.retail.feature.pricing_plans.waitlist.impl.interactor.WaitlistDomainException r4 = r2.g(r4, r13)
        L5b:
            r7 = r4
            if (r7 == 0) goto L68
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 5
            r10 = 0
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = r5
        L68:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r11.f162333b
            java.lang.Object r12 = r13.emit(r12, r0)
            if (r12 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r49, kotlin.coroutines.Continuation r50) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pkf.x1
            if (r0 == 0) goto L13
            r0 = r9
            pkf.x1 r0 = (pkf.x1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            pkf.x1 r0 = new pkf.x1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L5d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            n8i.b1 r9 = new n8i.b1
            java.lang.Object r2 = r7.f162334c
            pkf.y1 r2 = (pkf.y1) r2
            r4 = 16
            r9.<init>(r2, r4)
            kg7.e r4 = new kg7.e
            java.lang.Object r5 = r7.d
            tof.a3 r5 = (tof.a3) r5
            r6 = 1
            r4.<init>(r2, r5, r6)
            pkf.w1 r2 = pkf.w1.f237150a
            java.lang.Object r8 = iii.c.f(r8, r9, r2, r4)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f162333b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:614:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r31, kotlin.coroutines.Continuation r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im9.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ k(FlowCollector flowCollector, Object obj2, Object obj3, int i) {
        this.f162332a = i;
        this.f162333b = flowCollector;
        this.f162334c = obj2;
        this.d = obj3;
    }

    public k(FlowCollector flowCollector, k7i.g gVar, Set set, String str) {
        this.f162332a = 3;
        this.f162333b = flowCollector;
        this.f162334c = set;
        this.d = str;
    }
}
