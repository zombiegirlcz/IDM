package com.revolut.feature.cash_topup.impl.ui.amount;

import fb3.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public d u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f65616x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f65616x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f65616x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r14 == r0) goto L16;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.f65615w
            java.lang.String r2 = "map(...)"
            com.revolut.feature.cash_topup.impl.ui.amount.c r6 = r13.f65616x
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            xi0.b r0 = r13.v
            fb3.d r1 = r13.u
            yhm.o.b(r14)
            r8 = r0
        L18:
            r5 = r1
            goto La1
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            yhm.o.b(r14)
            goto L62
        L27:
            yhm.o.b(r14)
            nb3.b r14 = r6.f65618q
            jb3.j r14 = r14.f213980c
            com.revolut.feature.cash_topup.impl.data.service.CashTopUpService r14 = r14.f172588a
            efm.d0 r14 = r14.getCurrentTopupLimits()
            jb3.h r1 = jb3.h.f
            h35.c r1 = new h35.c
            r5 = 27
            r1.<init>(r5)
            r14.getClass()
            ufm.i r5 = new ufm.i
            r5.<init>(r14, r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            ufm.n r14 = te0.w.i0(r5)
            q97.q2 r1 = new q97.q2
            r5 = 23
            r1.<init>(r5)
            r7 = 2000(0x7d0, double:9.88E-321)
            qfm.i2 r14 = mra.d.K(r14, r7, r1)
            r13.f65615w = r4
            java.lang.Object r14 = nim.a.b(r14, r13)
            if (r14 != r0) goto L62
            goto La0
        L62:
            r1 = r14
            fb3.d r1 = (fb3.d) r1
            dj0.d r14 = r1.f133438b
            xi0.b r8 = r14.f115083b
            wsg.n r7 = r6.f65617p
            r11 = 0
            r12 = 62
            r9 = 0
            r10 = 0
            efm.d0 r14 = osg.b.r(r7, r8, r9, r10, r11, r12)
            qb3.m r5 = qb3.m.f
            q2j.k r5 = new q2j.k
            r7 = 6
            r5.<init>(r7)
            r14.getClass()
            ufm.i r7 = new ufm.i
            r7.<init>(r14, r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            ou5.a r14 = new ou5.a
            r2 = 10
            r14.<init>(r2, r8)
            zhm.h0 r2 = zhm.h0.f322473a
            pfm.z r14 = ue0.e.I(r7, r2, r14)
            r13.u = r1
            r13.v = r8
            r13.f65615w = r3
            java.lang.Object r14 = nim.a.b(r14, r13)
            if (r14 != r0) goto L18
        La0:
            return r0
        La1:
            r4 = r14
            dj0.d r4 = (dj0.d) r4
            com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData$CreateBarcodeData r14 = r6.f65621t
            if (r14 == 0) goto Lb7
            dj0.d r7 = r5.f133438b
            kwg.e r3 = new kwg.e
            r9 = 25
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r6.x2(r3)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        Lb7:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.cash_topup.impl.ui.amount.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
