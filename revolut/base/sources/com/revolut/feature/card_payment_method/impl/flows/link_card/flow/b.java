package com.revolut.feature.card_payment_method.impl.flows.link_card.flow;

import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import d8l.d;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements f43.b {
    public final LinkCardFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f65266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f65267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f65268r;

    public b(LinkCardFlowInputData flowInputData, f revolutCardsInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.o = flowInputData;
        this.f65266p = revolutCardsInteractor;
        this.f65267q = jointAccountsInteractor;
        this.f65268r = d.a(this, new eul.f(this, 14));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof f43.d
            if (r0 == 0) goto L13
            r0 = r8
            f43.d r0 = (f43.d) r0
            int r1 = r0.f132000x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132000x = r1
            goto L18
        L13:
            f43.d r0 = new f43.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132000x
            com.revolut.core.model.account.AccountId$Personal r3 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.String r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r7 = move-exception
            goto L6e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)
            com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData r8 = r7.o
            com.revolut.feature.cards.models.card.PocketWithSubaccount r8 = r8.f65238a
            boolean r2 = r8.f
            if (r2 == 0) goto L42
            return r3
        L42:
            io3.d r8 = r8.f65523a
            java.lang.String r8 = r8.f163146b
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c
            g48.r0 r7 = r7.f65267q     // Catch: java.lang.Throwable -> L2c
            r2 = 3
            wkm.l r7 = k38.c.a(r7, r5, r5, r2)     // Catch: java.lang.Throwable -> L2c
            r0.u = r8     // Catch: java.lang.Throwable -> L2c
            r0.f132000x = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = vkm.q.x(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r6 = r8
            r8 = r7
            r7 = r6
        L5d:
            com.revolut.core.model.account.AccountId$Joint r8 = (com.revolut.core.model.account.AccountId.Joint) r8     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L6a
            java.lang.String r0 = r8.f51413b     // Catch: java.lang.Throwable -> L2c
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r7)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L6a
            goto L6b
        L6a:
            r8 = r5
        L6b:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c
            goto L74
        L6e:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r7)
        L74:
            boolean r7 = r8 instanceof yhm.n
            if (r7 == 0) goto L79
            goto L7a
        L79:
            r5 = r8
        L7a:
            com.revolut.core.model.account.AccountId$Joint r5 = (com.revolut.core.model.account.AccountId.Joint) r5
            if (r5 == 0) goto L7f
            r3 = r5
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b.I2(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b r7, gim.c r8) {
        /*
            com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData r0 = r7.o
            boolean r1 = r8 instanceof f43.e
            if (r1 == 0) goto L15
            r1 = r8
            f43.e r1 = (f43.e) r1
            int r2 = r1.f132001w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f132001w = r2
            goto L1a
        L15:
            f43.e r1 = new f43.e
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f132001w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L7d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            w33.a r8 = r0.f65239b
            int[] r3 = f43.c.f131998a
            int r8 = r8.ordinal()
            r8 = r3[r8]
            r3 = 0
            if (r8 == r4) goto L8c
            r5 = 2
            if (r8 != r5) goto L86
            l93.f r7 = r7.f65266p
            com.revolut.feature.cards.models.card.PocketWithSubaccount r8 = r0.f65238a
            io3.d r8 = r8.f65523a
            java.lang.String r8 = r8.f163146b
            b93.d r0 = b93.d.RETAIL
            b93.k r5 = b93.k.CREATED_DATE
            r6 = 0
            ha3.x r7 = (ha3.x) r7
            sfm.b r7 = r7.x(r8, r0, r6, r5)
            vkm.d r7 = rd0.e.b(r7)
            ewh.y r8 = new ewh.y
            r0 = 26
            r8.<init>(r0)
            jhi.b r7 = mo3.a.g(r7, r3, r8, r4)
            eob.e r8 = new eob.e
            r0 = 3
            r5 = 18
            r8.<init>(r0, r5, r3)
            zhm.h0 r0 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r0, r8)
            r1.f132001w = r4
            java.lang.Object r8 = vkm.q.x(r7, r1)
            if (r8 != r2) goto L7d
            return r2
        L7d:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = zhm.d0.o0(r8)
            h93.f0 r7 = (h93.f0) r7
            return r7
        L86:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b.J2(com.revolut.feature.card_payment_method.impl.flows.link_card.flow.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65268r;
    }
}
