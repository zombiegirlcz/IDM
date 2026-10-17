package com.revolut.feature.select.payment.impl.ui.flow;

import d8l.d;
import eul.f;
import exc.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yi5.b;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements exc.a {

    @NotNull
    public static final c Companion = new c();
    public final SelectPaymentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f85817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cxc.a f85818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f85819r;

    public a(SelectPaymentFlowContract$InputData inputData, y51.a externalCardsInteractor, cxc.a selectPaymentResultCallback) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(selectPaymentResultCallback, "selectPaymentResultCallback");
        this.o = inputData;
        this.f85817p = externalCardsInteractor;
        this.f85818q = selectPaymentResultCallback;
        this.f85819r = d.a(this, new f(this, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7.K2(r8, r0) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.select.payment.impl.ui.flow.a r7, gim.c r8) {
        /*
            yki.i r1 = r7.f85819r
            boolean r0 = r8 instanceof exc.e
            if (r0 == 0) goto L15
            r0 = r8
            exc.e r0 = (exc.e) r0
            int r2 = r0.f130383w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.f130383w = r2
            goto L1a
        L15:
            exc.e r0 = new exc.e
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f130383w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r8)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L4c
        L38:
            yhm.o.b(r8)
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$InputData r8 = r7.o
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$InputData$Configuration r8 = r8.f85808b
            com.revolut.feature.select.payment.api.models.IntroScreenConfiguration r8 = r8.f85809a
            if (r8 == 0) goto L4f
            r0.f130383w = r5
            java.lang.Object r7 = r7.K2(r8, r0)
            if (r7 != r2) goto L4c
            goto L57
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L4f:
            r0.f130383w = r4
            java.lang.Object r8 = r7.J2(r0)
            if (r8 != r2) goto L58
        L57:
            return r2
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6c
            r5 = 0
            r6 = 12
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$SelectPayment r2 = com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step.SelectPayment.f85816a
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L77
        L6c:
            r0 = r7
            r5 = 0
            r6 = 12
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$AddCard r2 = com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step.AddCard.f85812a
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L77:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.select.payment.impl.ui.flow.a.I2(com.revolut.feature.select.payment.impl.ui.flow.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof exc.d
            if (r0 == 0) goto L13
            r0 = r6
            exc.d r0 = (exc.d) r0
            int r1 = r0.f130382w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130382w = r1
            goto L18
        L13:
            exc.d r0 = new exc.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130382w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            y51.a r6 = r5.f85817p
            e0f.z r6 = (e0f.z) r6
            efm.r r6 = r6.d()
            vkm.d r6 = rd0.e.b(r6)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f130382w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.select.payment.impl.ui.flow.a.J2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(com.revolut.feature.select.payment.api.models.IntroScreenConfiguration r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof exc.f
            if (r0 == 0) goto L13
            r0 = r14
            exc.f r0 = (exc.f) r0
            int r1 = r0.f130385x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130385x = r1
            goto L18
        L13:
            exc.f r0 = new exc.f
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130385x
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$InputData r3 = r12.o
            r4 = 1
            yki.i r6 = r12.f85819r
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.revolut.feature.select.payment.api.models.IntroScreenConfiguration r13 = r0.u
            yhm.o.b(r14)
            goto L52
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            yhm.o.b(r14)
            t61.g r14 = r3.f85807a
            t61.e r2 = t61.g.Companion
            r2.getClass()
            t61.g r2 = t61.g.B
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r14 == 0) goto L69
            r0.u = r13
            r0.f130385x = r4
            java.lang.Object r14 = r12.J2(r0)
            if (r14 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L69
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$NoAddedCards r7 = new com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$NoAddedCards
            r7.<init>(r13)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            r5 = r12
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            goto L8c
        L69:
            t61.g r14 = r3.f85807a
            boolean r14 = r14.f268141h
            if (r14 == 0) goto L7e
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$CardExpired r7 = new com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$CardExpired
            r7.<init>(r13)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            r5 = r12
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            goto L8c
        L7e:
            com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$AtLeastOneAddedCard r7 = new com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step$Intro$AtLeastOneAddedCard
            r7.<init>(r13)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            r5 = r12
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
        L8c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.select.payment.impl.ui.flow.a.K2(com.revolut.feature.select.payment.api.models.IntroScreenConfiguration, gim.c):java.lang.Object");
    }

    public final void L2(ywc.a result) {
        C2(result);
        if (this.o.f85808b.f85810b) {
            return;
        }
        cxc.a aVar = this.f85818q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        aVar.f109909a.onNext(result);
        h.D2(this.f85819r);
    }

    @Override // yki.j
    public final void M0() {
        l2(new ewa.d(this, null, 2), new b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85819r;
    }
}
