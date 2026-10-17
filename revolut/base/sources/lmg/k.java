package lmg;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f197053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f197054c;

    public /* synthetic */ k(FlowCollector flowCollector, Object obj2, int i) {
        this.f197052a = i;
        this.f197053b = flowCollector;
        this.f197054c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n6j.b
            if (r0 == 0) goto L13
            r0 = r6
            n6j.b r0 = (n6j.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            n6j.b r0 = new n6j.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r4.f197054c
            l6j.a r6 = (l6j.a) r6
            java.lang.String r6 = foh.i.J(r6)
            boolean r5 = r5.contains(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f197053b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof n97.j
            if (r0 == 0) goto L13
            r0 = r15
            n97.j r0 = (n97.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            n97.j r0 = new n97.j
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r15)
            goto L96
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L30:
            yhm.o.b(r15)
            kotlinx.coroutines.flow.FlowCollector r15 = r13.f197053b
            com.revolut.data.model.Data r14 = (com.revolut.data.model.Data) r14
            java.lang.Object r2 = r14.getContent()
            koi.j r2 = (koi.j) r2
            java.lang.Object r4 = r13.f197054c
            n97.k r4 = (n97.k) r4
            r5 = 0
            if (r2 == 0) goto L5c
            boolean r6 = r2 instanceof qv0.p
            if (r6 == 0) goto L56
            r6 = r2
            qv0.p r6 = (qv0.p) r6
            java.lang.Object r6 = r6.getD()
            boolean r7 = r6 instanceof o97.y
            if (r7 == 0) goto L56
            o97.y r6 = (o97.y) r6
            goto L57
        L56:
            r6 = r5
        L57:
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r6.f
            goto L5d
        L5c:
            r6 = r5
        L5d:
            boolean r7 = r6 instanceof n97.g
            if (r7 == 0) goto L64
            r5 = r6
            n97.g r5 = (n97.g) r5
        L64:
            r4.f = r5
            if (r2 == 0) goto L7e
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            o97.e0 r4 = new o97.e0
            r4.<init>(r2)
            java.util.List r7 = zhm.u.c(r4)
            boolean r9 = r14.getLoading()
            r10 = 2
            r11 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L8d
        L7e:
            com.revolut.data.model.Data r7 = new com.revolut.data.model.Data
            zhm.f0 r8 = zhm.f0.f322471a
            boolean r10 = r14.getLoading()
            r11 = 2
            r12 = 0
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r6 = r7
        L8d:
            r0.v = r3
            java.lang.Object r14 = r15.emit(r6, r0)
            if (r14 != r1) goto L96
            return r1
        L96:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n9k.a
            if (r0 == 0) goto L13
            r0 = r6
            n9k.a r0 = (n9k.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            n9k.a r0 = new n9k.a
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
            hrf.c r5 = (hrf.c) r5
            l9k.j r6 = new l9k.j
            java.lang.Object r2 = r4.f197054c
            prf.g r2 = (prf.g) r2
            r6.<init>(r5, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f197053b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r3.emit(r9, r1) != r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f197054c
            nd1.i r0 = (nd1.i) r0
            boolean r1 = r10 instanceof nd1.g
            if (r1 == 0) goto L17
            r1 = r10
            nd1.g r1 = (nd1.g) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            nd1.g r1 = new nd1.g
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L50
            if (r3 == r6) goto L42
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            yhm.o.b(r10)
            goto L9a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r1.f214290y
            kotlinx.coroutines.flow.FlowCollector r0 = r1.f214289x
            yhm.o.b(r10)
            goto L84
        L42:
            int r9 = r1.z
            int r3 = r1.f214290y
            kotlinx.coroutines.flow.FlowCollector r6 = r1.f214289x
            yhm.o.b(r10)
            r7 = r10
            r10 = r9
            r9 = r3
            r3 = r7
            goto L6c
        L50:
            yhm.o.b(r10)
            xi0.b r9 = (xi0.b) r9
            r10 = 0
            kotlinx.coroutines.flow.FlowCollector r3 = r8.f197053b
            if (r9 != 0) goto L8c
            r1.f214289x = r3
            r1.f214290y = r10
            r1.z = r10
            r1.v = r6
            java.lang.Object r9 = nd1.i.a(r0, r1)
            if (r9 != r2) goto L69
            goto L99
        L69:
            r6 = r3
            r3 = r9
            r9 = r10
        L6c:
            xi0.b r3 = (xi0.b) r3
            if (r3 != 0) goto L89
            ad1.a r0 = r0.f214293a
            r1.f214289x = r6
            r1.f214290y = r9
            r1.z = r10
            r1.v = r5
            sfc.e r0 = (sfc.e) r0
            java.io.Serializable r10 = r0.a(r1)
            if (r10 != r2) goto L83
            goto L99
        L83:
            r0 = r6
        L84:
            r3 = r10
            r10 = r9
            r9 = r3
            r3 = r0
            goto L8c
        L89:
            r10 = r9
            r9 = r3
            r3 = r6
        L8c:
            r0 = 0
            r1.f214289x = r0
            r1.f214290y = r10
            r1.v = r4
            java.lang.Object r9 = r3.emit(r9, r1)
            if (r9 != r2) goto L9a
        L99:
            return r2
        L9a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        if (r2.emit(r14, r4) == r5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[LOOP:0: B:30:0x00d9->B:32:0x00df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8 A[LOOP:1: B:34:0x00f2->B:36:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f A[LOOP:2: B:38:0x0119->B:40:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r2.emit(r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof njk.b
            if (r0 == 0) goto L13
            r0 = r9
            njk.b r0 = (njk.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            njk.b r0 = new njk.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L6f
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            int r8 = r0.f216597y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f216596x
            yhm.o.b(r9)
            goto L60
        L3b:
            yhm.o.b(r9)
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            r9 = 0
            kotlinx.coroutines.flow.FlowCollector r2 = r7.f197053b
            if (r8 == 0) goto L4c
            r8 = r9
            r9 = r5
            goto L62
        L4c:
            java.lang.Object r8 = r7.f197054c
            fdi.c r8 = (fdi.c) r8
            r0.f216596x = r2
            r0.f216597y = r9
            r0.v = r4
            java.lang.Object r8 = fdi.c.c(r8, r0)
            if (r8 != r1) goto L5d
            goto L6e
        L5d:
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            ggk.j r9 = (ggk.j) r9
        L62:
            r0.f216596x = r5
            r0.f216597y = r8
            r0.v = r3
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r27, kotlin.coroutines.Continuation r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            boolean r2 = r1 instanceof nkf.b
            if (r2 == 0) goto L17
            r2 = r1
            nkf.b r2 = (nkf.b) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            nkf.b r2 = new nkf.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Laf
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r1 = r27
            whf.p r1 = (whf.p) r1
            java.lang.Object r4 = r0.f197054c
            nkf.c r4 = (nkf.c) r4
            r4.getClass()
            aim.e r6 = zhm.u.b()
            r7 = 0
            if (r1 == 0) goto L4c
            java.util.List r8 = r1.f297646a
            goto L4d
        L4c:
            r8 = r7
        L4d:
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto La0
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L58
            goto La0
        L58:
            com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model r9 = new com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.transactions.impl.R$string.transaction_cryptocollectiontrading_linked_subheader
            r10 = 14
            r12.<init>(r8, r7, r7, r10)
            r24 = 0
            r25 = 65530(0xfffa, float:9.1827E-41)
            java.lang.String r10 = "COLLECTION_EXCHANGE_LINKED_SUBHEADER"
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
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.add(r9)
            whf.n r4 = r4.f216803m
            whf.l r7 = new whf.l
            r8 = 0
            r7.<init>(r8)
            whf.j$a r8 = whf.j.a.f297643a
            anf.w r4 = (anf.w) r4
            java.util.ArrayList r9 = r4.c(r1, r7, r8)
            r13 = 0
            r14 = 31
            r10 = 0
            r11 = 0
            r12 = 0
            yp0.b.k(r9, r10, r11, r12, r13, r14)
            r6.addAll(r9)
        La0:
            aim.e r1 = zhm.u.a(r6)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r4 = r0.f197053b
            java.lang.Object r1 = r4.emit(r1, r2)
            if (r1 != r3) goto Laf
            return r3
        Laf:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof nkf.e
            if (r0 == 0) goto L13
            r0 = r14
            nkf.e r0 = (nkf.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nkf.e r0 = new nkf.e
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
            java.lang.Object r14 = r12.f197054c
            nkf.f r14 = (nkf.f) r14
            thf.m r2 = r14.f216808n
            bnf.r r2 = (bnf.r) r2
            java.lang.String r5 = r2.l(r13)
            vlf.b r13 = r14.f216807m
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r14)
            com.revolut.core.ui_kit.models.TextClause r4 = new com.revolut.core.ui_kit.models.TextClause
            r10 = 0
            r11 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r13 = r13.j(r4)
            java.util.List r4 = zhm.u.c(r13)
            r9 = 31
            r5 = 0
            r6 = 0
            r7 = 0
            yp0.b.k(r4, r5, r6, r7, r8, r9)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r12.f197053b
            java.lang.Object r13 = r13.emit(r4, r0)
            if (r13 != r1) goto L6e
            return r1
        L6e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nme.a
            if (r0 == 0) goto L13
            r0 = r6
            nme.a r0 = (nme.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nme.a r0 = new nme.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L58
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = r5
            kotlin.Unit r6 = (kotlin.Unit) r6
            java.lang.Object r6 = r4.f197054c
            jul.o r6 = (jul.o) r6
            java.lang.Object r6 = r6.f178695b
            mp.r r6 = (mp.r) r6
            ola.b r2 = ola.b.LIFESTYLE_REVPOINTS
            boolean r2 = r6.h(r2)
            if (r2 == 0) goto L4d
            ola.b r2 = ola.b.LIFESTYLE_NON_REVPOINTS
            boolean r6 = r6.h(r2)
            if (r6 != 0) goto L58
        L4d:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f197053b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof nqd.j
            if (r0 == 0) goto L13
            r0 = r12
            nqd.j r0 = (nqd.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nqd.j r0 = new nqd.j
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L72
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            r4 = r11
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r11 = r4.getContent()
            if (r11 != 0) goto L67
            java.lang.Object r11 = r10.f197054c
            nqd.o r11 = (nqd.o) r11
            cli.y r11 = r11.f218426t
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            nqd.a r11 = (nqd.a) r11
            com.revolut.data.model.Data r11 = r11.f218404a
            java.lang.Object r11 = r11.getContent()
            nqd.c r11 = (nqd.c) r11
            if (r11 == 0) goto L5c
            java.util.List r11 = r11.e
            if (r11 != 0) goto L5a
            goto L5c
        L5a:
            r5 = r11
            goto L5f
        L5c:
            zhm.f0 r11 = zhm.f0.f322471a
            goto L5a
        L5f:
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            com.revolut.data.model.Data r4 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
        L67:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f197053b
            java.lang.Object r11 = r11.emit(r4, r0)
            if (r11 != r1) goto L72
            return r1
        L72:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v17 */
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
    public final java.lang.Object emit(java.lang.Object r41, kotlin.coroutines.Continuation r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
