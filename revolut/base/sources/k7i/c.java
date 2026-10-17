package k7i;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f182061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182062c;

    public /* synthetic */ c(FlowCollector flowCollector, Object obj2, int i) {
        this.f182060a = i;
        this.f182061b = flowCollector;
        this.f182062c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r45, kotlin.coroutines.Continuation r46) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof kkf.k3
            if (r2 == 0) goto L17
            r2 = r1
            kkf.k3 r2 = (kkf.k3) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            kkf.k3 r2 = new kkf.k3
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Lbd
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r1 = r23
            tof.a3 r1 = (tof.a3) r1
            java.lang.Object r4 = r0.f182062c
            kkf.l3 r4 = (kkf.l3) r4
            r4.getClass()
            aim.e r4 = zhm.u.b()
            tof.e1 r1 = r1.f272580a0
            r6 = 0
            if (r1 == 0) goto L4e
            tof.f1 r1 = r1.f272706b
            goto L4f
        L4e:
            r1 = r6
        L4f:
            if (r1 == 0) goto Lae
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r7 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            aw0.t0 r8 = new aw0.t0
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.credit.core.R$string.credit_loan_transaction_details_repayment_type
            r14 = 14
            r9.<init>(r10, r6, r6, r14)
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            int[] r9 = kkf.j3.f184771a
            int r1 = r1.ordinal()
            r1 = r9[r1]
            if (r1 == r5) goto L82
            r9 = 2
            if (r1 != r9) goto L7c
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r9 = com.revolut.feature.credit.core.R$string.credit_loan_transaction_details_automatic
            r1.<init>(r9, r6, r6, r14)
        L7a:
            r10 = r1
            goto L8a
        L7c:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L82:
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r9 = com.revolut.feature.credit.core.R$string.credit_loan_transaction_details_manual
            r1.<init>(r9, r6, r6, r14)
            goto L7a
        L8a:
            r20 = 0
            r21 = 32760(0x7ff8, float:4.5907E-41)
            r9 = r8
            java.lang.String r8 = "ID_REPAYMENT_MODE"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r13 = 0
            r14 = 63
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            yp0.b.l(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r7)
        Lae:
            aim.e r1 = zhm.u.a(r4)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f182061b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto Lbd
            return r3
        Lbd:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof kkf.m3
            if (r2 == 0) goto L17
            r2 = r1
            kkf.m3 r2 = (kkf.m3) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            kkf.m3 r2 = new kkf.m3
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L8a
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r23
            od0.i r1 = (od0.i) r1
            java.lang.Object r4 = r0.f182062c
            kkf.n3 r4 = (kkf.n3) r4
            java.lang.Object r1 = r1.f224257a
            x35.e r1 = (x35.e) r1
            c45.b r4 = r4.f184842c
            r6 = 0
            if (r1 == 0) goto L7b
            aw0.t0 r7 = new aw0.t0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r9 = com.revolut.feature.credit.core.R$string.loan_management_transaction_payment_from
            r10 = 14
            r8.<init>(r9, r6, r6, r10)
            r11 = 0
            r12 = 30
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            com.revolut.core.ui_kit.models.Clause r10 = r4.g(r1)
            com.revolut.core.ui_kit_core.displayers.image.Image r16 = r4.d(r1)
            aw0.u0 r14 = aw0.u0.LARGE
            r9 = r7
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r7 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            r20 = 0
            r21 = 31480(0x7af8, float:4.4113E-41)
            java.lang.String r8 = "direct-debit-payment-from"
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = r7
        L7b:
            java.util.List r1 = zhm.v.l(r6)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f182061b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto L8a
            return r3
        L8a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof kkf.o3
            if (r2 == 0) goto L17
            r2 = r1
            kkf.o3 r2 = (kkf.o3) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            kkf.o3 r2 = new kkf.o3
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L8a
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r22
            od0.i r1 = (od0.i) r1
            java.lang.Object r4 = r0.f182062c
            kkf.p3 r4 = (kkf.p3) r4
            java.lang.Object r1 = r1.f224257a
            x35.e r1 = (x35.e) r1
            r4.getClass()
            r4 = 0
            if (r1 == 0) goto L7b
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            aw0.t0 r7 = new aw0.t0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.credit.core.R$string.loan_management_repayment_transfer_type
            r13 = 14
            r8.<init>(r1, r4, r4, r13)
            r11 = 0
            r12 = 30
            r9 = 0
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.credit.core.R$string.loan_management_repayment_transfer_type_direct_debit
            r9.<init>(r1, r4, r4, r13)
            r19 = 0
            r20 = 32760(0x7ff8, float:4.5907E-41)
            r8 = r7
            java.lang.String r7 = "transfer-type_id"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = r6
        L7b:
            java.util.List r1 = zhm.v.l(r4)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f182061b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto L8a
            return r3
        L8a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.revolut.core.ui_kit_core.displayers.image.models.FileImage$Placeholder] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof kkf.d5
            if (r2 == 0) goto L17
            r2 = r1
            kkf.d5 r2 = (kkf.d5) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            kkf.d5 r2 = new kkf.d5
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L92
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r24
            nr6.b r1 = (nr6.b) r1
            java.lang.Object r4 = r0.f182062c
            kkf.e5 r4 = (kkf.e5) r4
            r4.getClass()
            if (r1 == 0) goto L85
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_freelancer_sale
            r8 = 14
            r10 = 0
            r9.<init>(r7, r10, r10, r8)
            r21 = 0
            r22 = 65530(0xfffa, float:9.1827E-41)
            java.lang.String r7 = "ITEM_ID_RELATED_SALE_HEADER"
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            jr6.a r4 = r4.f184656l
            qu6.b r4 = (qu6.b) r4
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r7 = r4.d(r1, r5)
            r13 = 0
            r14 = 63
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            yp0.b.l(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r7}
            java.util.List r1 = zhm.v.k(r1)
            if (r1 != 0) goto L87
        L85:
            zhm.f0 r1 = zhm.f0.f322471a
        L87:
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f182061b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto L92
            return r3
        L92:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kkf.v5
            if (r0 == 0) goto L13
            r0 = r9
            kkf.v5 r0 = (kkf.v5) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            kkf.v5 r0 = new kkf.v5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L68
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r9 = r7.f182062c
            kkf.y5 r9 = (kkf.y5) r9
            fub.f r9 = r9.f185031n
            pyb.h r9 = (pyb.h) r9
            r9.getClass()
            java.lang.String r2 = "optInPlacementBannerData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            px0.a r2 = new px0.a
            r4 = 24
            r2.<init>(r4)
            pyb.g r4 = new pyb.g
            r5 = 0
            r4.<init>(r5)
            pv7.t r5 = new pv7.t
            r6 = 3
            r5.<init>(r9, r6)
            java.lang.Object r8 = iii.c.f(r8, r2, r4, r5)
            java.util.List r8 = (java.util.List) r8
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f182061b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof kkf.n6
            if (r0 == 0) goto L13
            r0 = r14
            kkf.n6 r0 = (kkf.n6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            kkf.n6 r0 = new kkf.n6
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L6e
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            tof.a3 r13 = (tof.a3) r13
            java.lang.Object r14 = r12.f182062c
            kkf.o6 r14 = (kkf.o6) r14
            thf.m r2 = r14.f184868c
            bnf.r r2 = (bnf.r) r2
            java.lang.String r5 = r2.l(r13)
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r13)
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            vlf.b r13 = r14.f184867b
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r13 = r13.j(r4)
            java.util.List r4 = zhm.u.c(r13)
            r9 = 31
            r5 = 0
            r6 = 0
            r7 = 0
            yp0.b.k(r4, r5, r6, r7, r8, r9)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r12.f182061b
            java.lang.Object r13 = r13.emit(r4, r0)
            if (r13 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kkf.y7
            if (r0 == 0) goto L13
            r0 = r6
            kkf.y7 r0 = (kkf.y7) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            kkf.y7 r0 = new kkf.y7
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
            com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r5 = (com.revolut.feature.credit.loan.api.models.rev10.LoanDetails) r5
            java.lang.Object r6 = r4.f182062c
            tof.f4 r6 = (tof.f4) r6
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f182061b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.s(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.t(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
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
    public final java.lang.Object emit(java.lang.Object r63, kotlin.coroutines.Continuation r64) {
        /*
            Method dump skipped, instruction units count: 3178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7i.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
