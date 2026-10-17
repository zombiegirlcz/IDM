package pkf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f237037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f237038c;

    public /* synthetic */ d1(Object obj2, Object obj3, int i) {
        this.f237036a = i;
        this.f237037b = obj2;
        this.f237038c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof qq3.f
            if (r0 == 0) goto L13
            r0 = r13
            qq3.f r0 = (qq3.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qq3.f r0 = new qq3.f
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto Lb7
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            java.lang.Object r13 = r11.f237037b
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            nxh.f r12 = (nxh.f) r12
            java.lang.Object r2 = r11.f237038c
            rq3.e r2 = (rq3.e) r2
            rq3.f r2 = (rq3.f) r2
            r2.getClass()
            java.lang.String r4 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            boolean r4 = r12 instanceof qxh.a
            if (r4 == 0) goto L5c
            bs3.h r5 = new bs3.h
            bs3.g r6 = bs3.g.SEON
            qxh.a r12 = (qxh.a) r12
            java.lang.String r7 = r12.f250095a
            java.time.Instant r8 = r12.f250096b
            java.time.Instant r9 = r12.f250097c
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            goto Lac
        L5c:
            boolean r4 = r12 instanceof oxh.a
            if (r4 == 0) goto L72
            bs3.h r5 = new bs3.h
            bs3.g r6 = bs3.g.CREDOLAB
            oxh.a r12 = (oxh.a) r12
            java.lang.String r7 = r12.f230840a
            java.time.Instant r8 = r12.f230842c
            java.time.Instant r9 = r12.d
            java.lang.String r10 = r12.f230841b
            r5.<init>(r6, r7, r8, r9, r10)
            goto Lac
        L72:
            boolean r4 = r12 instanceof pxh.a
            if (r4 == 0) goto L87
            bs3.h r5 = new bs3.h
            bs3.g r6 = bs3.g.INCOGNIA
            pxh.a r12 = (pxh.a) r12
            java.lang.String r7 = r12.f240621a
            java.time.Instant r8 = r12.f240622b
            java.time.Instant r9 = r12.f240623c
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            goto Lac
        L87:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MonitoringResult "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " is not supported"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r12.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            java.lang.String r5 = "DataMonitoringResultMapper"
            r6 = 0
            rd0.d.a(r4, r5, r6, r12, r2)
            r5 = r6
        Lac:
            if (r5 == 0) goto Lb7
            r0.v = r3
            java.lang.Object r12 = r13.emit(r5, r0)
            if (r12 != r1) goto Lb7
            return r1
        Lb7:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.A(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object B(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qqj.c
            if (r0 == 0) goto L13
            r0 = r12
            qqj.c r0 = (qqj.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qqj.c r0 = new qqj.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L97
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f237037b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            java.util.List r11 = (java.util.List) r11
            kotlin.jvm.internal.Intrinsics.h(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L46:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r11.next()
            mqj.b r4 = (mqj.b) r4
            java.lang.Object r5 = r10.f237038c
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.String r6 = r4.f208014b
            java.lang.Object r5 = r5.get(r6)
            nzi.f r5 = (nzi.f) r5
            if (r5 == 0) goto L83
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            nzi.g r6 = new nzi.g
            long r7 = r4.f208013a
            java.time.Instant r7 = java.time.Instant.ofEpochMilli(r7)
            java.lang.String r8 = "ofEpochMilli(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.time.ZoneId r8 = g0m.a.f139502a
            java.time.LocalDate r7 = oi0.d.V(r7, r8)
            long r8 = r4.f208015c
            r6.<init>(r8, r7)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r5, r6)
            goto L84
        L83:
            r4 = 0
        L84:
            if (r4 == 0) goto L46
            r2.add(r4)
            goto L46
        L8a:
            java.util.Map r11 = zhm.r0.t(r2)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r11, r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.B(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object C(java.lang.Object r17, kotlin.coroutines.Continuation r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.f237038c
            ftb.b r2 = (ftb.b) r2
            boolean r3 = r1 instanceof qtb.p
            if (r3 == 0) goto L1b
            r3 = r1
            qtb.p r3 = (qtb.p) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1b
            int r4 = r4 - r5
            r3.v = r4
            goto L20
        L1b:
            qtb.p r3 = new qtb.p
            r3.<init>(r0, r1)
        L20:
            java.lang.Object r1 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.v
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            yhm.o.b(r1)
            goto L8a
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f237037b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r5 = r17
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r15 = r5.booleanValue()
            ptb.f r7 = new ptb.f
            ftb.a r5 = r2.b()
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = r5.f138008a
            java.lang.String r5 = r5.f83420a
            java.lang.String r8 = "CUSTOMIZATION_ITEM_ID_CUSTOMISABLE_TAB_"
            java.lang.String r8 = j6.a.q(r8, r5)
            ftb.a r5 = r2.b()
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r9 = r5.f138008a
            ftb.a r5 = r2.b()
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r5 = r5.f138008a
            java.lang.String r10 = r5.f83420a
            ftb.a r5 = r2.b()
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = r5.f138009b
            ftb.a r5 = r2.b()
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r12 = r5.f138010c
            ftb.a r2 = r2.b()
            if (r15 == 0) goto L7a
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r2.d
        L78:
            r13 = r2
            goto L7d
        L7a:
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r2.e
            goto L78
        L7d:
            r14 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.v = r6
            java.lang.Object r1 = r1.emit(r7, r3)
            if (r1 != r4) goto L8a
            return r4
        L8a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.C(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r44, kotlin.coroutines.Continuation r45) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0221, code lost:
    
        r10 = (java.lang.String) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0223, code lost:
    
        if (r10 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0225, code lost:
    
        r10 = new tih.c(r10, r3, r8.f105106a, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022e, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
    
        r1 = r9;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0246, code lost:
    
        if (r1.emit(r10, r4) == r5) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01b4 -> B:83:0x01b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q09.j0
            if (r0 == 0) goto L13
            r0 = r7
            q09.j0 r0 = (q09.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q09.j0 r0 = new q09.j0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f237037b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            r2 = r6
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            java.lang.Object r2 = r2.getContent()
            if (r2 != 0) goto L54
            java.lang.Object r2 = r5.f237038c
            q09.m0 r2 = (q09.m0) r2
            q09.i0 r4 = q09.m0.Companion
            jki.i r2 = r2.t2()
            q09.l r2 = (q09.l) r2
            com.revolut.data.model.Data r2 = r2.f241192a
            java.lang.Object r2 = r2.getContent()
            if (r2 == 0) goto L54
            goto L5d
        L54:
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof q4h.c
            if (r0 == 0) goto L13
            r0 = r10
            q4h.c r0 = (q4h.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q4h.c r0 = new q4h.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L53
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f237037b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            java.lang.Object r2 = r8.f237038c
            q4h.d r2 = (q4h.d) r2
            vki.a r4 = r2.f242166p
            b8d.d0 r5 = new b8d.d0
            r6 = 7
            r7 = 0
            r5.<init>(r6, r9, r7)
            r2.X2(r4, r5)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            r0.v = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[RETURN] */
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
            boolean r2 = r1 instanceof q55.a
            if (r2 == 0) goto L17
            r2 = r1
            q55.a r2 = (q55.a) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            q55.a r2 = new q55.a
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
            java.lang.Object r1 = r0.f237037b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r4 = r22
            com.revolut.feature.credit.loan.api.models.rev10.Loan r4 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r4
            java.lang.Object r6 = r0.f237038c
            q55.b r6 = (q55.b) r6
            m35.g r6 = r6.f242293a
            c55.o r6 = (c55.o) r6
            r6.getClass()
            java.lang.String r6 = "loan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            wi0.b r4 = r4.f70112h
            wi0.a r6 = wi0.b.Companion
            r6.getClass()
            wi0.b r6 = wi0.b.L0
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r4, r6)
            r7 = 0
            if (r6 == 0) goto L6d
            com.revolut.core.ui_kit.models.HtmlLocalisedClause r8 = new com.revolut.core.ui_kit.models.HtmlLocalisedClause
            int r9 = com.revolut.feature.credit.core.R$string.loan_home_warning_ie
            r12 = 0
            r13 = 30
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
        L6b:
            r11 = r8
            goto L82
        L6d:
            wi0.b r6 = wi0.b.f297750h0
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r6)
            if (r4 == 0) goto L9d
            com.revolut.core.ui_kit.models.HtmlLocalisedClause r8 = new com.revolut.core.ui_kit.models.HtmlLocalisedClause
            int r9 = com.revolut.feature.credit.core.R$string.application_config_bank_disclaimer_es
            r12 = 0
            r13 = 30
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            goto L6b
        L82:
            ip0.ak0 r13 = new ip0.ak0
            r4 = 3
            r13.<init>(r7, r7, r4)
            int r16 = com.revolut.core.ui_kit_resources.R$attr.uikit_dp32
            com.revolut.core.ui_kit.delegates.TextDelegate$Model r9 = new com.revolut.core.ui_kit.delegates.TextDelegate$Model
            r15 = 0
            r20 = 116(0x74, float:1.63E-43)
            java.lang.String r10 = "LOAN_DISCLAIMER_FOOTER_ID"
            r12 = 0
            r14 = 0
            r17 = r16
            r18 = r16
            r19 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r7 = r9
        L9d:
            java.util.List r4 = zhm.v.l(r7)
            r2.v = r5
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto Laa
            return r3
        Laa:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof q76.a
            if (r0 == 0) goto L13
            r0 = r12
            q76.a r0 = (q76.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q76.a r0 = new q76.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L5d
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f237037b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            r4 = r11
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Throwable r11 = r4.getError()
            if (r11 == 0) goto L54
            java.lang.Object r11 = r4.getContent()
            com.revolut.feature.derivatives.models.BalanceWithPnl r11 = (com.revolut.feature.derivatives.models.BalanceWithPnl) r11
            if (r11 != 0) goto L4b
            java.lang.Object r11 = r10.f237038c
            com.revolut.feature.derivatives.models.BalanceWithPnl r11 = (com.revolut.feature.derivatives.models.BalanceWithPnl) r11
        L4b:
            r5 = r11
            r8 = 4
            r9 = 0
            r6 = 0
            r7 = 0
            com.revolut.data.model.Data r4 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
        L54:
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof q97.c
            if (r0 == 0) goto L13
            r0 = r14
            q97.c r0 = (q97.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q97.c r0 = new q97.c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L81
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            java.lang.Object r14 = r12.f237037b
            kotlinx.coroutines.flow.FlowCollector r14 = (kotlinx.coroutines.flow.FlowCollector) r14
            r10 = r13
            com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState r10 = (com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState) r10
            boolean r13 = r10 instanceof com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.Available
            if (r13 == 0) goto L72
            r13 = r10
            com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState$Available r13 = (com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.Available) r13
            yw4.l r13 = r13.f69811c
            int[] r2 = q97.b.f243651a
            int r13 = r13.ordinal()
            r13 = r2[r13]
            if (r13 == r3) goto L6f
            r2 = 2
            if (r13 != r2) goto L69
            java.lang.Object r13 = r12.f237038c
            q97.d r13 = (q97.d) r13
            t97.d r13 = r13.f243668c
            p97.a r4 = t97.c.a(r13)
            r9 = 0
            r11 = 63
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            p97.a r13 = p97.a.a(r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List r13 = zhm.u.c(r13)
            goto L78
        L69:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L6f:
            zhm.f0 r13 = zhm.f0.f322471a
            goto L78
        L72:
            boolean r13 = r10 instanceof com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.NotAvailable
            if (r13 == 0) goto L84
            zhm.f0 r13 = zhm.f0.f322471a
        L78:
            r0.v = r3
            java.lang.Object r13 = r14.emit(r13, r0)
            if (r13 != r1) goto L81
            return r1
        L81:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L84:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f237038c
            q97.x r0 = (q97.x) r0
            boolean r1 = r15 instanceof q97.w
            if (r1 == 0) goto L17
            r1 = r15
            q97.w r1 = (q97.w) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            q97.w r1 = new q97.w
            r1.<init>(r13, r15)
        L1c:
            java.lang.Object r15 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r15)
            goto L76
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            yhm.o.b(r15)
            java.lang.Object r15 = r13.f237037b
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            kotlin.Pair r14 = (kotlin.Pair) r14
            java.lang.Object r3 = r14.f186385a
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r3 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r3
            java.lang.Object r14 = r14.f186386b
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L6b
            t97.d r14 = t97.d.CFD
            p97.a r5 = t97.c.a(r14)
            kpj.f r14 = r0.d
            hel.b r0 = r3.f105106a
            r3 = 0
            n2l.a r6 = n2l.a.f211583a
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = r14.h(r6, r0, r3)
            r11 = 0
            r12 = 123(0x7b, float:1.72E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            p97.a r14 = p97.a.a(r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List r14 = zhm.u.c(r14)
            goto L6d
        L6b:
            zhm.f0 r14 = zhm.f0.f322471a
        L6d:
            r1.v = r4
            java.lang.Object r14 = r15.emit(r14, r1)
            if (r14 != r2) goto L76
            return r2
        L76:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.p(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r2.emit(r3, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof q97.b3
            if (r0 == 0) goto L13
            r0 = r15
            q97.b3 r0 = (q97.b3) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q97.b3 r0 = new q97.b3
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r15)
            goto Lb1
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L34:
            int r14 = r0.f243658y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f243657x
            yhm.o.b(r15)
            goto L95
        L3c:
            yhm.o.b(r15)
            java.lang.Object r15 = r13.f237037b
            r2 = r15
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.util.List r14 = (java.util.List) r14
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L4c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L5b
            java.lang.Object r15 = r14.next()
            boolean r6 = r15 instanceof com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount.JIsa
            if (r6 == 0) goto L4c
            goto L5c
        L5b:
            r15 = r5
        L5c:
            com.revolut.feature.wealth.api.domain.model.WealthAccount$TaxAdvantageWealthAccount$JIsa r15 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount.JIsa) r15
            r14 = 0
            if (r15 == 0) goto La2
            java.lang.Object r6 = r13.f237038c
            q97.e3 r6 = (q97.e3) r6
            oih.k r6 = r6.f243684c
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r8 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r9 = s49.a.AS_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r10 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r11 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r12 = ibb.c.f160141b
            java.lang.String r12 = r12.f83420a
            r11.<init>(r12, r5)
            r12 = 6
            r10.<init>(r11, r5, r5, r12)
            r8.<init>(r9, r10)
            r7.<init>(r8)
            llh.l r6 = (llh.l) r6
            efm.d0 r15 = r6.b(r15, r7)
            r0.f243657x = r2
            r0.f243658y = r14
            r0.v = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L95
            goto Lb0
        L95:
            java.lang.String r3 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r3)
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            o97.l r3 = new o97.l
            r3.<init>(r15)
            goto La4
        La2:
            o97.e r3 = o97.e.f223096a
        La4:
            r0.f243657x = r5
            r0.f243658y = r14
            r0.v = r4
            java.lang.Object r14 = r2.emit(r3, r0)
            if (r14 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.q(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f237038c
            t6c.f r0 = (t6c.f) r0
            boolean r1 = r7 instanceof q9c.y
            if (r1 == 0) goto L17
            r1 = r7
            q9c.y r1 = (q9c.y) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            q9c.y r1 = new q9c.y
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r7)
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f237037b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection r6 = (com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection) r6
            com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection r6 = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(r0, r6)
            if (r6 != 0) goto L44
            com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection$PayNow r6 = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection.PayNow.f84446a
        L44:
            q9c.u r3 = new q9c.u
            r3.<init>(r0, r6)
            r1.v = r4
            java.lang.Object r6 = r7.emit(r3, r1)
            if (r6 != r2) goto L52
            return r2
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.r(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q9c.z
            if (r0 == 0) goto L13
            r0 = r6
            q9c.z r0 = (q9c.z) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q9c.z r0 = new q9c.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f237037b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            t6c.f r5 = (t6c.f) r5
            java.lang.Object r2 = r4.f237038c
            t6c.o r2 = (t6c.o) r2
            java.util.List r2 = r2.f268306a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r2 = zhm.d0.T(r2, r5)
            if (r2 == 0) goto L47
            goto L48
        L47:
            r5 = 0
        L48:
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.s(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qf3.a
            if (r0 == 0) goto L13
            r0 = r12
            qf3.a r0 = (qf3.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qf3.a r0 = new qf3.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L54
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f237037b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            java.lang.Object r2 = r10.f237038c
            qf3.b r2 = (qf3.b) r2
            zjh.j r2 = r2.f245235b
            java.util.List r5 = zjh.j.v(r2, r11)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.t(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qje.b
            if (r0 == 0) goto L13
            r0 = r7
            qje.b r0 = (qje.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qje.b r0 = new qje.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f237037b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            r2 = r6
            kotlin.Unit r2 = (kotlin.Unit) r2
            java.lang.Object r2 = r5.f237038c
            qje.c r2 = (qje.c) r2
            mp.r r2 = r2.f246830a
            ola.c r4 = ola.c.CRYPTO
            boolean r2 = r2.h(r4)
            if (r2 != 0) goto L50
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.u(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qkf.c
            if (r0 == 0) goto L13
            r0 = r12
            qkf.c r0 = (qkf.c) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qkf.c r0 = new qkf.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto La3
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f237037b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            tof.a3 r11 = (tof.a3) r11
            java.lang.Object r2 = r10.f237038c
            qkf.d r2 = (qkf.d) r2
            qkf.f r2 = r2.f246992b
            java.lang.String r4 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r4)
            tof.l0 r4 = r11.Q1
            if (r4 == 0) goto L6c
            tof.i0 r4 = r4.f272903n
            if (r4 != 0) goto L4d
            goto L6c
        L4d:
            int r5 = com.revolut.feature.transactions.impl.R$string.transaction_details_crypto_deposit_sent_from_title
            java.lang.String r6 = r4.f272792a
            com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction$AddressAction r7 = new com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction$AddressAction
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl r8 = new com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl
            java.lang.String r4 = r4.f272793b
            r8.<init>(r4)
            r7.<init>(r8, r6)
            sj5.b r4 = r2.f246994a
            hk5.b r4 = (hk5.b) r4
            java.lang.String r4 = r4.a(r6)
            java.lang.String r6 = "ID_DEFI_SENDER_WALLET_ADDRESS"
            com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model r4 = pkf.l1.a(r6, r5, r4, r7)
            goto L6d
        L6c:
            r4 = 0
        L6d:
            com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model r5 = r2.d(r11)
            int r6 = com.revolut.feature.transactions.impl.R$string.transaction_details_cryptodeposit_amount
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r6 = qkf.f.b(r11, r6)
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r11 = r2.c(r11)
            r2 = 4
            qv0.i[] r2 = new qv0.i[r2]
            r7 = 0
            r2[r7] = r4
            r2[r3] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r11
            java.lang.String r11 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)
            java.util.List r4 = kotlin.collections.d.L(r2)
            r8 = 0
            r9 = 31
            r5 = 0
            r6 = 0
            yp0.b.k(r4, r5, r6, r7, r8, r9)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto La3
            return r1
        La3:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.v(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qkf.o
            if (r0 == 0) goto L13
            r0 = r12
            qkf.o r0 = (qkf.o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qkf.o r0 = new qkf.o
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L99
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f237037b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            tof.a3 r11 = (tof.a3) r11
            java.lang.Object r2 = r10.f237038c
            qkf.p r2 = (qkf.p) r2
            qkf.f r2 = r2.f247005b
            com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model r4 = r2.d(r11)
            java.lang.String r5 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r5)
            tof.l0 r5 = r11.Q1
            if (r5 == 0) goto L6f
            tof.i0 r5 = r5.f272902m
            if (r5 != 0) goto L50
            goto L6f
        L50:
            int r6 = com.revolut.feature.transactions.impl.R$string.transaction_details_cryptowithdrawal_wallet_address
            java.lang.String r7 = r5.f272792a
            com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction$AddressAction r8 = new com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction$AddressAction
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl r9 = new com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl
            java.lang.String r5 = r5.f272793b
            r9.<init>(r5)
            r8.<init>(r9, r7)
            sj5.b r5 = r2.f246994a
            hk5.b r5 = (hk5.b) r5
            java.lang.String r5 = r5.a(r7)
            java.lang.String r7 = "ID_DEFI_WALLET_ADDRESS"
            com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model r5 = pkf.l1.a(r7, r6, r5, r8)
            goto L70
        L6f:
            r5 = 0
        L70:
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r11 = r2.c(r11)
            r2 = 3
            qv0.i[] r2 = new qv0.i[r2]
            r6 = 0
            r2[r6] = r4
            r2[r3] = r5
            r4 = 2
            r2[r4] = r11
            java.lang.String r11 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)
            java.util.List r4 = kotlin.collections.d.L(r2)
            r8 = 0
            r9 = 31
            r5 = 0
            r7 = 0
            yp0.b.k(r4, r5, r6, r7, r8, r9)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r4, r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.w(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qmd.i
            if (r0 == 0) goto L13
            r0 = r6
            qmd.i r0 = (qmd.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qmd.i r0 = new qmd.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f237037b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            od0.i r5 = (od0.i) r5
            java.lang.Object r5 = r5.f224257a
            kmd.a r5 = (kmd.a) r5
            if (r5 == 0) goto L44
            yld.c r5 = com.google.crypto.tink.shaded.protobuf.t1.T(r5)
            if (r5 != 0) goto L4c
        L44:
            java.lang.Object r5 = r4.f237038c
            qmd.a r5 = (qmd.a) r5
            yld.c r5 = r5.a()
        L4c:
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.x(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f237038c
            tla.a r0 = (tla.a) r0
            boolean r1 = r13 instanceof qna.m
            if (r1 == 0) goto L17
            r1 = r13
            qna.m r1 = (qna.m) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            qna.m r1 = new qna.m
            r1.<init>(r11, r13)
        L1c:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r13)
            goto L5e
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r13)
            java.lang.Object r13 = r11.f237037b
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            qna.d r5 = new qna.d
            java.lang.String r6 = r0.getId()
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = r0.getTitle()
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = r0.d(r10)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = r0.getIcon()
            r5.<init>(r6, r7, r8, r9, r10)
            r1.v = r4
            java.lang.Object r12 = r13.emit(r5, r1)
            if (r12 != r2) goto L5e
            return r2
        L5e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.y(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(bs3.h r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof qq3.e
            if (r0 == 0) goto L13
            r0 = r6
            qq3.e r0 = (qq3.e) r0
            int r1 = r0.f248467w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248467w = r1
            goto L18
        L13:
            qq3.e r0 = new qq3.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248467w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L49
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f237037b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            qq3.g r6 = (qq3.g) r6     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            xq3.c r6 = r6.f248470b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r2 = r4.f237038c     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f248467w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.a(r2, r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L55
            return r1
        L49:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            java.lang.String r2 = "CreditDataMonitoringFacade"
            rd0.d.a(r0, r2, r1, r5, r6)
        L55:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.z(bs3.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v47, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v58 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instruction units count: 3826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.d1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public d1(FlowCollector flowCollector, kdh.b bVar, ftb.b bVar2) {
        this.f237036a = 28;
        this.f237037b = flowCollector;
        this.f237038c = bVar2;
    }
}
