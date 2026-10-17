package ble;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f16570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16571c;

    public /* synthetic */ e1(FlowCollector flowCollector, Object obj2, int i) {
        this.f16569a = i;
        this.f16570b = flowCollector;
        this.f16571c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof cul.t1
            if (r0 == 0) goto L13
            r0 = r6
            cul.t1 r0 = (cul.t1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            cul.t1 r0 = new cul.t1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            k4l.r0 r5 = (k4l.r0) r5
            java.lang.Object r6 = r4.f16571c
            k4l.e0 r6 = (k4l.e0) r6
            int r5 = n14.k.j(r6, r5)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f16570b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof cw9.b
            if (r0 == 0) goto L13
            r0 = r6
            cw9.b r0 = (cw9.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            cw9.b r0 = new cw9.b
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
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r4.f16571c
            cw9.d r5 = (cw9.d) r5
            r10.a r5 = r5.f109574c
            boolean r5 = r5.J()
            if (r5 == 0) goto L48
            r5 = r3
            goto L49
        L48:
            r5 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f16570b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f16571c
            d4a.b r0 = (d4a.b) r0
            boolean r1 = r10 instanceof d4a.a
            if (r1 == 0) goto L17
            r1 = r10
            d4a.a r1 = (d4a.a) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            d4a.a r1 = new d4a.a
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r10)
            goto L82
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            java.util.List r9 = (java.util.List) r9
            b4a.a r10 = r0.f111258b
            java.util.ArrayList r9 = b4a.a.a(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L47:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r9.next()
            c4a.a r3 = (c4a.a) r3
            java.lang.String r5 = r3.getId()     // Catch: java.lang.Exception -> L65
            java.lang.String r3 = r3.getType()     // Catch: java.lang.Exception -> L65
            f4a.b r3 = d4a.b.a(r0, r3)     // Catch: java.lang.Exception -> L65
            f4a.a r6 = new f4a.a     // Catch: java.lang.Exception -> L65
            r6.<init>(r3, r5)     // Catch: java.lang.Exception -> L65
            goto L71
        L65:
            r3 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r7 = 0
            rd0.d.a(r6, r7, r7, r3, r5)
            r6 = r7
        L71:
            if (r6 == 0) goto L47
            r10.add(r6)
            goto L47
        L77:
            r1.v = r4
            kotlinx.coroutines.flow.FlowCollector r9 = r8.f16570b
            java.lang.Object r9 = r9.emit(r10, r1)
            if (r9 != r2) goto L82
            return r2
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.f16571c
            d6j.n0 r2 = (d6j.n0) r2
            boolean r3 = r1 instanceof d6j.c0
            if (r3 == 0) goto L1b
            r3 = r1
            d6j.c0 r3 = (d6j.c0) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1b
            int r4 = r4 - r5
            r3.v = r4
            goto L20
        L1b:
            d6j.c0 r3 = new d6j.c0
            r3.<init>(r0, r1)
        L20:
            java.lang.Object r1 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.v
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            yhm.o.b(r1)
            goto L7d
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            l1d.a r2 = r2.f111573r
            com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem r2 = r2.Z2()
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_star_filled
            int r7 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_star_empty
            com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem$a r8 = com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem.INSTANCE
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            if (r1 == 0) goto L54
            r10 = r5
            goto L55
        L54:
            r10 = r7
        L55:
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r14 = 124(0x7c, float:1.74E-43)
            r10 = r9
            java.lang.String r9 = "WATCHLIST_MENU_ITEM_ID"
            com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem r1 = com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem.Companion.a(r8, r9, r10, r11, r12, r13, r14)
            com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem[] r1 = new com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem[]{r2, r1}
            java.util.List r1 = zhm.v.k(r1)
            r3.v = r6
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f16570b
            java.lang.Object r1 = r2.emit(r1, r3)
            if (r1 != r4) goto L7d
            return r4
        L7d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x06e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r42, kotlin.coroutines.Continuation r43) {
        /*
            Method dump skipped, instruction units count: 2898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ble.e1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
