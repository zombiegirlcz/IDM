package z1l;

import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import z63.j;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f318897a;

    public d(j function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f318897a = function;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r22, gim.c r23) throws java.lang.Exception {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.Object r3 = r1.f318897a
            r4 = r3
            w5i.d r4 = (w5i.d) r4
            boolean r3 = r2 instanceof z7i.f
            if (r3 == 0) goto L1e
            r3 = r2
            z7i.f r3 = (z7i.f) r3
            int r5 = r3.f320015w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1e
            int r5 = r5 - r6
            r3.f320015w = r5
            goto L23
        L1e:
            z7i.f r3 = new z7i.f
            r3.<init>(r1, r2)
        L23:
            java.lang.Object r2 = r3.u
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f320015w
            r12 = 1
            if (r5 == 0) goto L3c
            if (r5 != r12) goto L34
            yhm.o.b(r2)     // Catch: java.lang.Exception -> L32
            goto L84
        L32:
            r0 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            yhm.o.b(r2)
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r2 = r0.f97402b
            j8l.d r5 = r0.f
            r6 = 0
            if (r2 == 0) goto L67
            com.revolut.feature_move_money.api.model.AccountWrapper r14 = r0.d
            com.revolut.feature_move_money.api.model.AccountWrapper r15 = r0.e
            long r7 = r0.f97403c
            com.revolut.feature_move_money.api.model.OrderMode r9 = r0.f97401a
            j8l.d r10 = j8l.d.SELL
            if (r5 != r10) goto L55
            r18 = r12
            goto L57
        L55:
            r18 = r6
        L57:
            r13 = r4
            c8i.z r13 = (c8i.z) r13
            r19 = r2
            r16 = r7
            r20 = r9
            boolean r2 = r13.h(r14, r15, r16, r18, r19, r20)
            if (r2 == 0) goto L67
            return r19
        L67:
            com.revolut.feature_move_money.api.model.AccountWrapper r2 = r0.d     // Catch: java.lang.Exception -> L32
            r7 = r6
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r0.e     // Catch: java.lang.Exception -> L32
            r9 = r7
            long r7 = r0.f97403c     // Catch: java.lang.Exception -> L32
            com.revolut.feature_move_money.api.model.OrderMode r10 = r0.f97401a     // Catch: java.lang.Exception -> L32
            j8l.d r0 = j8l.d.SELL     // Catch: java.lang.Exception -> L32
            if (r5 != r0) goto L76
            r9 = r12
        L76:
            r5 = r2
            jhi.b r0 = w5i.d.a(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Exception -> L32
            r3.f320015w = r12     // Catch: java.lang.Exception -> L32
            java.lang.Object r2 = vkm.q.x(r0, r3)     // Catch: java.lang.Exception -> L32
            if (r2 != r11) goto L84
            return r11
        L84:
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r2 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r2     // Catch: java.lang.Exception -> L32
            return r2
        L87:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L8c
            throw r0
        L8c:
            com.revolut.feature_move_money.impl.flow.delegate.QuoteLoadingException r0 = new com.revolut.feature_move_money.impl.flow.delegate.QuoteLoadingException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1l.d.a(com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo, gim.c):java.lang.Object");
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return ((j) this.f318897a).invoke(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, java.util.Map r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof z1l.b
            if (r0 == 0) goto L13
            r0 = r14
            z1l.b r0 = (z1l.b) r0
            int r1 = r0.f318893x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318893x = r1
            goto L18
        L13:
            z1l.b r0 = new z1l.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318893x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r14)
            r6 = r11
            goto L6e
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            r6 = r11
            goto L58
        L3b:
            yhm.o.b(r14)
            y65.l r5 = new y65.l
            r10 = 23
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            r0.u = r7
            r0.f318893x = r4
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L57
            goto L6d
        L57:
            r12 = r7
        L58:
            java.lang.Object r13 = r6.f318897a
            u1l.e r13 = (u1l.e) r13
            r0.u = r9
            r0.f318893x = r3
            x4l.c r13 = r13.d
            java.lang.Object r12 = r13.d(r12, r4, r0)
            if (r12 != r1) goto L69
            goto L6b
        L69:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L6b:
            if (r12 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z1l.d.b(java.lang.String, java.util.Map, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof z1l.c
            if (r0 == 0) goto L13
            r0 = r8
            z1l.c r0 = (z1l.c) r0
            int r1 = r0.f318896y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318896y = r1
            goto L18
        L13:
            z1l.c r0 = new z1l.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f318894w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f318896y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            a2l.a r7 = r0.v
            yhm.o.b(r8)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            a2l.a r7 = r0.v
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L58
        L3f:
            yhm.o.b(r8)
            z1l.a r8 = new z1l.a
            r8.<init>(r6, r7, r5, r4)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.u = r7
            r0.v = r5
            r0.f318896y = r4
            java.lang.Object r8 = skm.e0.J(r2, r8, r0)
            if (r8 != r1) goto L58
            goto L71
        L58:
            a2l.a r8 = (a2l.a) r8
            java.lang.Object r2 = r6.f318897a
            u1l.e r2 = (u1l.e) r2
            r0.u = r5
            r0.v = r8
            r0.f318896y = r3
            x4l.c r2 = r2.d
            java.lang.Object r7 = r2.d(r7, r4, r0)
            if (r7 != r1) goto L6d
            goto L6f
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6f:
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1l.d.c(java.lang.String, gim.c):java.lang.Object");
    }

    public d(w5i.d quoteInteractor) {
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        this.f318897a = quoteInteractor;
    }

    public d(u1l.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f318897a = repository;
    }

    public d(hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f318897a = juniorProfileInteractor;
    }
}
