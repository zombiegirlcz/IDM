package ks7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[Catch: Exception -> 0x0082, TryCatch #0 {Exception -> 0x0082, blocks: (B:23:0x005e, B:25:0x0066, B:27:0x006d, B:35:0x007e, B:38:0x0084, B:39:0x008b, B:28:0x0070, B:31:0x0075, B:32:0x007a), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: Exception -> 0x0082, TryCatch #0 {Exception -> 0x0082, blocks: (B:23:0x005e, B:25:0x0066, B:27:0x006d, B:35:0x007e, B:38:0x0084, B:39:0x008b, B:28:0x0070, B:31:0x0075, B:32:0x007a), top: B:48:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.insurance_credit.impl.data.model.BottomSheet a(zr7.l r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.f324634a
            java.lang.String r3 = r12.f324635b
            java.lang.String r4 = r12.f324636c
            java.util.List r1 = r12.d
            r5 = 0
            if (r1 == 0) goto L4b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r1.next()
            zr7.k r7 = (zr7.k) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r8 = r7 instanceof zr7.k.a
            if (r8 == 0) goto L3a
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Item$Cell r8 = new com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Item$Cell
            zr7.k$a r7 = (zr7.k.a) r7
            java.lang.String r9 = r7.f324630b
            java.lang.String r7 = r7.f324631c
            r8.<init>(r9, r7)
            goto L3f
        L3a:
            boolean r7 = r7 instanceof zr7.k.c
            if (r7 == 0) goto L45
            r8 = r5
        L3f:
            if (r8 == 0) goto L1b
            r6.add(r8)
            goto L1b
        L45:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L4b:
            r6 = r5
        L4c:
            zr7.i r12 = r12.e
            if (r12 == 0) goto L9e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Footer r1 = new com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Footer
            java.lang.String r7 = r12.f324627a
            zr7.e r12 = r12.f324628b
            if (r12 == 0) goto L95
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Button r8 = new com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Button     // Catch: java.lang.Exception -> L82
            java.lang.String r9 = r12.f324624a     // Catch: java.lang.Exception -> L82
            zr7.b r10 = r12.f324625b     // Catch: java.lang.Exception -> L82
            if (r10 == 0) goto L7b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Exception -> L82
            boolean r0 = r10 instanceof zr7.b.C1801b     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto L70
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Action$Dismiss r0 = com.revolut.feature.insurance_credit.impl.data.model.BottomSheet.Action.Dismiss.f75737a     // Catch: java.lang.Exception -> L82
            goto L7c
        L70:
            boolean r0 = r10 instanceof zr7.b.c     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto L75
            goto L7b
        L75:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L82
            r0.<init>()     // Catch: java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Exception -> L82
        L7b:
            r0 = r5
        L7c:
            if (r0 == 0) goto L84
            r8.<init>(r9, r0)     // Catch: java.lang.Exception -> L82
            goto L96
        L82:
            r0 = move-exception
            goto L8c
        L84:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L82
            r8.<init>(r0)     // Catch: java.lang.Exception -> L82
            throw r8     // Catch: java.lang.Exception -> L82
        L8c:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r5, r5, r0, r8)
        L95:
            r8 = r5
        L96:
            r1.<init>(r7, r8)
            if (r7 != 0) goto L9d
            if (r12 == 0) goto L9e
        L9d:
            r5 = r1
        L9e:
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet r1 = new com.revolut.feature.insurance_credit.impl.data.model.BottomSheet
            r11 = r6
            r6 = r5
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ks7.a.a(zr7.l):com.revolut.feature.insurance_credit.impl.data.model.BottomSheet");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zr7.l b(com.revolut.feature.insurance_credit.impl.data.model.BottomSheet r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r2 = r12.f75734a
            java.lang.String r3 = r12.f75735b
            java.lang.String r4 = r12.f75736c
            java.util.List r1 = r12.d
            r5 = 0
            if (r1 == 0) goto L49
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = zhm.w.t(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r1.next()
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Item r7 = (com.revolut.feature.insurance_credit.impl.data.model.BottomSheet.Item) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r8 = r7 instanceof com.revolut.feature.insurance_credit.impl.data.model.BottomSheet.Item.Cell
            if (r8 == 0) goto L43
            zr7.k$a r8 = new zr7.k$a
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Item$Cell r7 = (com.revolut.feature.insurance_credit.impl.data.model.BottomSheet.Item.Cell) r7
            java.lang.String r9 = r7.f75742a
            java.lang.String r7 = r7.f75743b
            r8.<init>(r9, r7)
            r6.add(r8)
            goto L21
        L43:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L49:
            r6 = r5
        L4a:
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Footer r12 = r12.e
            if (r12 == 0) goto L89
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            zr7.i r1 = new zr7.i
            java.lang.String r7 = r12.f75740a
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Button r12 = r12.f75741b
            if (r12 == 0) goto L80
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            zr7.e r8 = new zr7.e     // Catch: java.lang.Exception -> L6f
            java.lang.String r9 = r12.f75738a     // Catch: java.lang.Exception -> L6f
            com.revolut.feature.insurance_credit.impl.data.model.BottomSheet$Action r10 = r12.f75739b     // Catch: java.lang.Exception -> L6f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Exception -> L6f
            boolean r0 = r10 instanceof com.revolut.feature.insurance_credit.impl.data.model.BottomSheet.Action.Dismiss     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L71
            zr7.b$b r0 = zr7.b.C1801b.INSTANCE     // Catch: java.lang.Exception -> L6f
            r8.<init>(r9, r0)     // Catch: java.lang.Exception -> L6f
            goto L81
        L6f:
            r0 = move-exception
            goto L77
        L71:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L6f
            r0.<init>()     // Catch: java.lang.Exception -> L6f
            throw r0     // Catch: java.lang.Exception -> L6f
        L77:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r5, r5, r0, r8)
        L80:
            r8 = r5
        L81:
            r1.<init>(r7, r8)
            if (r7 != 0) goto L88
            if (r12 == 0) goto L89
        L88:
            r5 = r1
        L89:
            zr7.l r1 = new zr7.l
            r11 = r6
            r6 = r5
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ks7.a.b(com.revolut.feature.insurance_credit.impl.data.model.BottomSheet):zr7.l");
    }
}
