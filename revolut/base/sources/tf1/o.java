package tf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f270189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final elb.b f270190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f270191c;
    public volatile uib.c d;
    public final hlm.c e;

    public o(ang.f userInteractor, elb.b savingsFeatureConfigInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        this.f270189a = userInteractor;
        this.f270190b = savingsFeatureConfigInteractor;
        this.e = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof tf1.j
            if (r0 == 0) goto L13
            r0 = r5
            tf1.j r0 = (tf1.j) r0
            int r1 = r0.f270171w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270171w = r1
            goto L18
        L13:
            tf1.j r0 = new tf1.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270171w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f270189a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f270171w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            boolean r0 = te0.w.V(r5)
            if (r0 == 0) goto L4d
            int r5 = com.revolut.feature.add.new_product.api.R$string.add_new_product_category_accounts_name_mx
            goto L62
        L4d:
            kotlin.jvm.internal.Intrinsics.h(r5)
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            boolean r5 = te0.w.S(r5, r0)
            if (r5 == 0) goto L60
            int r5 = com.revolut.feature.add.new_product.api.R$string.add_new_product_category_accounts_name_co
            goto L62
        L60:
            int r5 = com.revolut.feature.add.new_product.api.R$string.add_new_product_category_accounts_name
        L62:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.o.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof tf1.k
            if (r0 == 0) goto L13
            r0 = r8
            tf1.k r0 = (tf1.k) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            tf1.k r0 = new tf1.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f270174x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            tf1.o r1 = r0.v
            hlm.a r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L70
        L2f:
            r8 = move-exception
            goto L85
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            int r2 = r0.f270173w
            hlm.a r4 = r0.u
            yhm.o.b(r8)
            r8 = r4
            goto L59
        L42:
            yhm.o.b(r8)
            int r8 = r7.f270191c
            if (r8 != 0) goto L89
            hlm.c r8 = r7.e
            r0.u = r8
            r2 = 0
            r0.f270173w = r2
            r0.z = r4
            java.lang.Object r4 = r8.lock(r5, r0)
            if (r4 != r1) goto L59
            goto L6b
        L59:
            int r4 = r7.f270191c     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L7e
            r0.u = r8     // Catch: java.lang.Throwable -> L79
            r0.v = r7     // Catch: java.lang.Throwable -> L79
            r0.f270173w = r2     // Catch: java.lang.Throwable -> L79
            r0.z = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r7.a(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r7
        L70:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L2f
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L2f
            r1.f270191c = r8     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L79:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L85
        L7e:
            r0 = r8
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2f
            r0.unlock(r5)
            goto L89
        L85:
            r0.unlock(r5)
            throw r8
        L89:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = r7.f270191c
            r1 = 14
            r8.<init>(r0, r5, r5, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.o.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(qf1.e r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tf1.l
            if (r0 == 0) goto L13
            r0 = r8
            tf1.l r0 = (tf1.l) r0
            int r1 = r0.f270177w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270177w = r1
            goto L18
        L13:
            tf1.l r0 = new tf1.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270177w
            r3 = 14
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            yhm.o.b(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            int[] r8 = tf1.i.f270166b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r5) goto L50
            r8 = 2
            if (r7 != r8) goto L4a
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.feature.add.new_product.api.R$string.add_new_product_item_group_pockets
            r7.<init>(r8, r4, r4, r3)
            return r7
        L4a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L50:
            r0.f270177w = r5
            java.lang.Enum r8 = r6.e(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            uib.c r8 = (uib.c) r8
            if (r8 == 0) goto L62
            int r7 = oc.c.r(r8)
            goto L64
        L62:
            int r7 = com.revolut.feature.add.new_product.api.R$string.add_new_product_category_save_name
        L64:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r8.<init>(r7, r4, r4, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.o.c(qf1.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof tf1.m
            if (r0 == 0) goto L13
            r0 = r5
            tf1.m r0 = (tf1.m) r0
            int r1 = r0.f270181w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270181w = r1
            goto L18
        L13:
            tf1.m r0 = new tf1.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270181w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f270181w = r3
            java.lang.Enum r5 = r4.e(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            uib.c r5 = (uib.c) r5
            r0 = -1
            if (r5 != 0) goto L42
            r5 = r0
            goto L4a
        L42:
            int[] r1 = tf1.i.f270167c
            int r5 = r5.ordinal()
            r5 = r1[r5]
        L4a:
            if (r5 == r0) goto L69
            if (r5 == r3) goto L66
            r0 = 2
            if (r5 == r0) goto L63
            r0 = 3
            if (r5 == r0) goto L63
            r0 = 4
            if (r5 == r0) goto L63
            r0 = 5
            if (r5 != r0) goto L5d
            int r5 = com.revolut.feature.add.new_product.api.R$string.savings_account_switcher_new_account_category_ias
            goto L6b
        L5d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L63:
            int r5 = com.revolut.feature.add.new_product.api.R$string.savings_account_switcher_new_account_category_mmf
            goto L6b
        L66:
            int r5 = com.revolut.feature.add.new_product.api.R$string.savings_account_switcher_new_account_category_multiple_products
            goto L6b
        L69:
            int r5 = com.revolut.feature.add.new_product.api.R$string.add_new_product_category_save_name
        L6b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r1 = 14
            r2 = 0
            r0.<init>(r5, r2, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.o.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum e(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof tf1.n
            if (r0 == 0) goto L13
            r0 = r11
            tf1.n r0 = (tf1.n) r0
            int r1 = r0.f270186y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270186y = r1
            goto L18
        L13:
            tf1.n r0 = new tf1.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f270184w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270186y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r0 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L7f
        L2d:
            r11 = move-exception
            goto L92
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            int r2 = r0.v
            hlm.a r6 = r0.u
            yhm.o.b(r11)
            r11 = r6
            goto L58
        L41:
            yhm.o.b(r11)
            uib.c r11 = r10.d
            if (r11 != 0) goto L96
            hlm.c r11 = r10.e
            r0.u = r11
            r2 = 0
            r0.v = r2
            r0.f270186y = r4
            java.lang.Object r6 = r11.lock(r5, r0)
            if (r6 != r1) goto L58
            goto L7b
        L58:
            uib.c r6 = r10.d     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L8b
            elb.b r6 = r10.f270190b     // Catch: java.lang.Throwable -> L86
            w4l.h r7 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L86
            cxe.u r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L86
            tc6.b r7 = new tc6.b     // Catch: java.lang.Throwable -> L86
            r8 = 18
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L86
            jhi.b r4 = mo3.a.g(r6, r5, r7, r4)     // Catch: java.lang.Throwable -> L86
            r0.u = r11     // Catch: java.lang.Throwable -> L86
            r0.v = r2     // Catch: java.lang.Throwable -> L86
            r0.f270186y = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = vkm.q.x(r4, r0)     // Catch: java.lang.Throwable -> L86
            if (r0 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r9 = r0
            r0 = r11
            r11 = r9
        L7f:
            uib.a r11 = (uib.a) r11     // Catch: java.lang.Throwable -> L2d
            uib.c r11 = r11.f280366a     // Catch: java.lang.Throwable -> L2d
            r10.d = r11     // Catch: java.lang.Throwable -> L2d
            goto L8c
        L86:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L92
        L8b:
            r0 = r11
        L8c:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r0.unlock(r5)
            goto L96
        L92:
            r0.unlock(r5)
            throw r11
        L96:
            uib.c r11 = r10.d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.o.e(gim.c):java.lang.Enum");
    }
}
