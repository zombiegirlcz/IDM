package kkf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class i8 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f184757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f184758c;

    public /* synthetic */ i8(Object obj2, Object obj3, int i) {
        this.f184756a = i;
        this.f184757b = obj2;
        this.f184758c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lkf.g
            if (r0 == 0) goto L13
            r0 = r8
            lkf.g r0 = (lkf.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lkf.g r0 = new lkf.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.f196378y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f196377x
            yhm.o.b(r8)
            goto L57
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f184757b
            r2 = r8
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            tof.a3 r7 = (tof.a3) r7
            java.lang.Object r8 = r6.f184758c
            lkf.h r8 = (lkf.h) r8
            r0.f196377x = r2
            r5 = 0
            r0.f196378y = r5
            r0.v = r4
            java.lang.Object r8 = lkf.h.a(r8, r7, r0)
            if (r8 != r1) goto L56
            goto L64
        L56:
            r7 = r5
        L57:
            r4 = 0
            r0.f196377x = r4
            r0.f196378y = r7
            r0.v = r3
            java.lang.Object r7 = r2.emit(r8, r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof lkf.j
            if (r2 == 0) goto L17
            r2 = r1
            lkf.j r2 = (lkf.j) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            lkf.j r2 = new lkf.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L9e
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f184757b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r4 = r24
            tof.a3 r4 = (tof.a3) r4
            java.lang.Object r6 = r0.f184758c
            lkf.k r6 = (lkf.k) r6
            r6.getClass()
            aim.e r6 = zhm.u.b()
            tof.j5 r7 = r4.f272605o1
            if (r7 == 0) goto L91
            tof.x1 r4 = r4.f272585c1
            tof.x1 r8 = tof.x1.UPI
            if (r4 != r8) goto L91
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r9 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_upi_title
            r8 = 14
            r10 = 0
            r11.<init>(r4, r10, r10, r8)
            com.revolut.core.ui_kit.models.TextClause r12 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r4 = r7.f272848a
            if (r4 != 0) goto L67
            java.lang.String r4 = ""
        L67:
            r13 = r4
            r18 = 0
            r19 = 126(0x7e, float:1.77E-43)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r21 = 0
            r22 = 32760(0x7ff8, float:4.5907E-41)
            java.lang.String r10 = "UPI_ID_LIST_ID"
            r13 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r15 = 0
            r16 = 63
            r10 = 0
            r11 = 0
            r12 = 0
            yp0.b.l(r9, r10, r11, r12, r13, r14, r15, r16)
            r6.add(r9)
        L91:
            aim.e r4 = zhm.u.a(r6)
            r2.v = r5
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto L9e
            return r3
        L9e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof lkf.l
            if (r2 == 0) goto L17
            r2 = r1
            lkf.l r2 = (lkf.l) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            lkf.l r2 = new lkf.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Laa
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f184757b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r4 = r22
            tof.a3 r4 = (tof.a3) r4
            java.lang.Object r6 = r0.f184758c
            lkf.m r6 = (lkf.m) r6
            java.lang.String r4 = r4.f272614t
            if (r4 == 0) goto L9f
            boolean r7 = kotlin.text.d0.W(r4)
            if (r7 == 0) goto L4e
            goto L9f
        L4e:
            wnf.b r6 = r6.f196394b
            wnf.e r6 = (wnf.e) r6
            r6.getClass()
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_note
            r7 = 14
            r8 = 0
            r9.<init>(r6, r8, r8, r7)
            boolean r6 = kotlin.text.d0.W(r4)
            if (r6 != 0) goto L67
            r11 = r4
            goto L68
        L67:
            r11 = r8
        L68:
            if (r11 == 0) goto L79
            com.revolut.core.ui_kit.models.TextClause r10 = new com.revolut.core.ui_kit.models.TextClause
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r11 = r10
            goto L7a
        L79:
            r11 = r8
        L7a:
            com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$Model r7 = new com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate$Model
            java.lang.String r8 = "ID_COMMENT"
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 129012(0x1f7f4, float:1.80784E-40)
            r17 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.List r8 = zhm.u.c(r7)
            r12 = 0
            r13 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            yp0.b.k(r8, r9, r10, r11, r12, r13)
            goto La1
        L9f:
            zhm.f0 r8 = zhm.f0.f322471a
        La1:
            r2.v = r5
            java.lang.Object r1 = r1.emit(r8, r2)
            if (r1 != r3) goto Laa
            return r3
        Laa:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
    
        if (r6.emit(r1, r2) == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r6.emit(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r2.emit(r14, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof lkf.g0
            if (r0 == 0) goto L13
            r0 = r14
            lkf.g0 r0 = (lkf.g0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lkf.g0 r0 = new lkf.g0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L81
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            int r13 = r0.f196381y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f196380x
            yhm.o.b(r14)
            goto L73
        L3a:
            yhm.o.b(r14)
            java.lang.Object r14 = r12.f184757b
            r2 = r14
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            tof.t3 r13 = (tof.t3) r13
            java.lang.Object r14 = r12.f184758c
            lkf.h0 r14 = (lkf.h0) r14
            r0.f196380x = r2
            r5 = 0
            r0.f196381y = r5
            r0.v = r4
            r14.getClass()
            if (r13 == 0) goto L6c
            tof.u3 r13 = r13.N
            if (r13 != 0) goto L59
            goto L6c
        L59:
            wnf.b r14 = r14.f196385b
            wnf.e r14 = (wnf.e) r14
            aim.e r6 = r14.b(r13)
            r10 = 0
            r11 = 31
            r7 = 0
            r8 = 0
            r9 = 0
            yp0.b.k(r6, r7, r8, r9, r10, r11)
            r14 = r6
            goto L6f
        L6c:
            zhm.f0 r13 = zhm.f0.f322471a
            r14 = r13
        L6f:
            if (r14 != r1) goto L72
            goto L80
        L72:
            r13 = r5
        L73:
            r4 = 0
            r0.f196380x = r4
            r0.f196381y = r13
            r0.v = r3
            java.lang.Object r13 = r2.emit(r14, r0)
            if (r13 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof lkf.j0
            if (r2 == 0) goto L17
            r2 = r1
            lkf.j0 r2 = (lkf.j0) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            lkf.j0 r2 = new lkf.j0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L96
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f184757b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r4 = r22
            tof.t3 r4 = (tof.t3) r4
            java.lang.Object r6 = r0.f184758c
            lkf.l0 r6 = (lkf.l0) r6
            r6.getClass()
            if (r4 == 0) goto L4a
            boolean r4 = r4.T
            goto L4b
        L4a:
            r4 = 0
        L4b:
            if (r4 != 0) goto L50
            zhm.f0 r4 = zhm.f0.f322471a
            goto L8d
        L50:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_receipt
            r6 = 0
            r7 = 14
            r8.<init>(r4, r6, r6, r7)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_form_download
            r11.<init>(r4, r6, r6, r7)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r10 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r13 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_download
            int r4 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r19 = 0
            r20 = 246(0xf6, float:3.45E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r12 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model r6 = new com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model
            r17 = 0
            r18 = 32736(0x7fe0, float:4.5873E-41)
            java.lang.String r7 = "ID_TAX_INVOICE"
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r4 = zhm.u.c(r6)
        L8d:
            r2.v = r5
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto L96
            return r3
        L96:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r44, kotlin.coroutines.Continuation r45) {
        /*
            Method dump skipped, instruction units count: 2696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.i8.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ i8(FlowCollector flowCollector, Object obj2, Object obj3, int i) {
        this.f184756a = i;
        this.f184757b = flowCollector;
        this.f184758c = obj3;
    }
}
