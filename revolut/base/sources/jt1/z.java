package jt1;

import aw0.f4;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import iyg.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends jki.g implements g {

    @NotNull
    public static final s Companion = new s();
    public final a A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b f178305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.d f178306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rt1.a f178307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final st1.b f178308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qt1.a f178309t;
    public final xdk.b u;
    public final s5k.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n60.a f178310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ldd.b f178311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w80.b f178312y;
    public final BizumTransferAmountContract$InputData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b interactor, x02.d router, rt1.a transferDataObserver, st1.b validatorExtension, qt1.a transferExtension, xdk.b pocketExtension, s5k.a transferWalletLimitsExtension, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w80.b amountFormatter, BizumTransferAmountContract$InputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f178305p = interactor;
        this.f178306q = router;
        this.f178307r = transferDataObserver;
        this.f178308s = validatorExtension;
        this.f178309t = transferExtension;
        this.u = pocketExtension;
        this.v = transferWalletLimitsExtension;
        this.f178310w = keyboardExtension;
        this.f178311x = focusRequesterDelegate;
        this.f178312y = amountFormatter;
        this.z = inputData;
        BizumContact f61604a = inputData.getF61604a();
        hrf.f f61605b = inputData.getF61605b();
        hrf.h.Companion.getClass();
        this.A = new a(f61604a, f61605b, null, new b(null, null, hrf.h.d, f0.f322471a), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(jt1.z r4, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jt1.y
            if (r0 == 0) goto L13
            r0 = r6
            jt1.y r0 = (jt1.y) r0
            int r1 = r0.f178304x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178304x = r1
            goto L18
        L13:
            jt1.y r0 = new jt1.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178304x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jt1.z r5 = r0.u
            yhm.o.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            ldd.b r6 = r4.f178311x
            r6.f194072c = r3
            x02.d r6 = r4.f178306q
            x02.c r2 = x02.c.BIZUM
            r0.u = r4
            r0.f178304x = r3
            q12.l r6 = (q12.l) r6
            java.lang.Object r6 = r6.a(r5, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            r0 = r6
            com.revolut.kompot.navigable.flow.BaseFlow r0 = (com.revolut.kompot.navigable.flow.BaseFlow) r0
            jj2.a r1 = new jj2.a
            r2 = 11
            r1.<init>(r4, r2)
            r0.l2(r1)
            dki.p r6 = (dki.p) r6
            jt1.q r0 = new jt1.q
            r1 = 1
            r0.<init>(r4, r1)
            r4 = 0
            yji.l.i2(r5, r6, r4, r0, r3)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jt1.z.A2(jt1.z, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(jt1.z r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jt1.t
            if (r0 == 0) goto L13
            r0 = r6
            jt1.t r0 = (jt1.t) r0
            int r1 = r0.f178298w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178298w = r1
            goto L18
        L13:
            jt1.t r0 = new jt1.t
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178298w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r6 = r5.B2()
            xdk.b r5 = r5.u
            com.revolut.core.model.account.AccountId r2 = r6.f61633c
            com.revolut.feature.transfer.core.models.FundingSource r6 = r6.f61631a
            xi0.b r4 = r6.f92241b
            java.lang.String r6 = r6.f92240a
            r0.f178298w = r3
            java.lang.Object r6 = r5.b3(r2, r4, r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jt1.z.y2(jt1.z, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(jt1.z r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof jt1.u
            if (r0 == 0) goto L13
            r0 = r5
            jt1.u r0 = (jt1.u) r0
            int r1 = r0.f178299w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178299w = r1
            goto L18
        L13:
            jt1.u r0 = new jt1.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178299w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.f178299w = r3
            jt1.w r5 = new jt1.w
            r2 = 0
            r3 = 3
            r5.<init>(r4, r2, r3)
            nki.a r2 = r4.k
            java.lang.String r3 = "BIZUM_INITIATE_TRANSFER_TASK_ID"
            java.lang.Object r5 = pu7.a.B(r2, r3, r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r5 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo) r5
            if (r5 == 0) goto L56
            jt1.e r0 = new jt1.e
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r1 = r4.B2()
            r0.<init>(r1, r5)
            r4.v2(r0)
        L56:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jt1.z.z2(jt1.z, gim.c):java.lang.Object");
    }

    public final BizumTransferData B2() {
        BizumTransferData bizumTransferData = ((a) t2()).f178275c;
        if (bizumTransferData != null) {
            return bizumTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.f178311x;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new x(this, continuation, 0), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new b0(q2(), 8)), new a67.c(continuation, this, 23)), null, null, new jij.h(this, continuation, 25), 3);
    }

    @Override // yji.l
    public final void P1() {
        x2(new q(this, 0));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }
}
