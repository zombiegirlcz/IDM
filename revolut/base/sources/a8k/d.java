package a8k;

import i1l.f;
import i1l.h;
import i1l.i;
import i1l.l;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import opf.c0;
import wt9.e;
import yji.n;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final twg.c f2281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p8k.a f2282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f2283n;
    public final vo9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f2284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2285q;

    public d(twg.c paymentLinksAmountInteractor, p8k.a validatorExtension, c0 transferSuggestedAmountsInteractor, vo9.a pocketMapper, e transferAvailableBalanceInteractor) {
        Intrinsics.checkNotNullParameter(paymentLinksAmountInteractor, "paymentLinksAmountInteractor");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(transferAvailableBalanceInteractor, "transferAvailableBalanceInteractor");
        this.f2281l = paymentLinksAmountInteractor;
        this.f2282m = validatorExtension;
        this.f2283n = transferSuggestedAmountsInteractor;
        this.o = pocketMapper;
        this.f2284p = transferAvailableBalanceInteractor;
        p0 p0Var = o0.f186429a;
        this.f2285q = r0.k(new Pair(p0Var.b(urf.b.class), 1), new Pair(p0Var.b(urf.a.class), 2), new Pair(p0Var.b(i1l.d.class), 3), new Pair(p0Var.b(x7k.a.class), 4), new Pair(p0Var.b(j1l.a.class), 5), new Pair(p0Var.b(k1l.a.class), 6), new Pair(p0Var.b(i1l.a.class), 7), new Pair(p0Var.b(i.class), 8), new Pair(p0Var.b(f.class), 9), new Pair(p0Var.b(h.class), 10), new Pair(p0Var.b(l.class), 11), new Pair(p0Var.b(i1l.c.class), 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a8k.a
            if (r0 == 0) goto L13
            r0 = r10
            a8k.a r0 = (a8k.a) r0
            int r1 = r0.f2275x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2275x = r1
            goto L18
        L13:
            a8k.a r0 = new a8k.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f2275x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r9 = r0.u
            yhm.o.b(r10)
        L28:
            r5 = r9
            goto L42
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            r0.u = r9
            r0.f2275x = r3
            twg.c r10 = r8.f2281l
            java.lang.Object r10 = r10.x(r9, r0)
            if (r10 != r1) goto L28
            return r1
        L42:
            r6 = r10
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r6 = (com.revolut.shared.feature.market_data.models.domain.models.OrderQuote) r6
            com.revolut.feature.transfer.core.models.FundingSource r9 = r5.d
            com.revolut.core.model.account.AccountId r10 = r5.e
            vo9.a r0 = r8.o
            yt9.g r0 = (yt9.g) r0
            kotlinx.coroutines.flow.Flow r9 = r0.g(r9, r10)
            wt9.e r10 = r8.f2284p
            com.revolut.feature.transfer.core.models.FundingSource r0 = r5.d
            kotlinx.coroutines.flow.Flow r10 = r10.a(r0)
            j23.b r9 = yh5.b.d(r9, r10)
            a67.c r2 = new a67.c
            r3 = 0
            r7 = 1
            r4 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            wkm.l r9 = vkm.q.Q(r9, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a8k.d.Z2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData, gim.c):java.lang.Object");
    }
}
