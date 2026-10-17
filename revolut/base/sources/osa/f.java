package osa;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import com.revolut.feature.transfer.core.models.FundingSource;
import efm.d0;
import h30.q;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lqa.x;
import te0.w;
import ufm.i;
import ufm.n;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f229299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f229300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bqf.d f229301c;

    public f(z amountScreenInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, bqf.d trustInteractor) {
        Intrinsics.checkNotNullParameter(amountScreenInteractor, "amountScreenInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        this.f229299a = amountScreenInteractor;
        this.f229300b = transactionsInteractor;
        this.f229301c = trustInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof osa.c
            if (r0 == 0) goto L13
            r0 = r8
            osa.c r0 = (osa.c) r0
            int r1 = r0.f229294y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229294y = r1
            goto L18
        L13:
            osa.c r0 = new osa.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f229292w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229294y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r7 = r0.v
            yhm.o.b(r8)
            goto L5f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L4c
        L3a:
            yhm.o.b(r8)
            iy9.d r8 = iy9.d.CARD_OWNER
            r0.u = r7
            r0.f229294y = r4
            bqf.d r2 = r6.f229301c
            java.lang.Object r8 = r2.b(r7, r8, r0)
            if (r8 != r1) goto L4c
            goto L5b
        L4c:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r8 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r8
            r2 = 0
            r0.u = r2
            r0.v = r8
            r0.f229294y = r3
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r5 = r8
            r8 = r7
            r7 = r5
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r0 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r0.<init>(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: osa.f.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof osa.d
            if (r2 == 0) goto L17
            r2 = r1
            osa.d r2 = (osa.d) r2
            int r3 = r2.f229295w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f229295w = r3
            goto L1c
        L17:
            osa.d r2 = new osa.d
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f229295w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L90
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            tof.i7$c r1 = tof.i7.Companion
            tof.ya r4 = new tof.ya
            r6 = r18
            r4.<init>(r6)
            tof.u9 r6 = new tof.u9
            r7 = 0
            r6.<init>(r7)
            tof.v6 r8 = tof.v6.COMPLETED
            tof.v6[] r8 = new tof.v6[]{r8}
            r1.getClass()
            tof.qb r1 = tof.i7.c.c(r8)
            r8 = 3
            tof.i7[] r9 = new tof.i7[r8]
            r9[r7] = r4
            r9[r5] = r6
            r4 = 2
            r9[r4] = r1
            tof.q7 r11 = tof.i7.c.a(r9)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r5)
            com.revolut.domain.interactors.transactions.TransactionsSort r14 = com.revolut.domain.interactors.transactions.TransactionsSort.NO_SORT
            r15 = 0
            r16 = 18
            com.revolut.domain.interactors.transactions.a r10 = r0.f229300b
            r12 = 0
            ufm.i r1 = com.revolut.domain.interactors.transactions.a.b(r10, r11, r12, r13, r14, r15, r16)
            os9.f r4 = new os9.f
            r4.<init>(r8)
            or2.e r6 = new or2.e
            r7 = 19
            r6.<init>(r4, r7)
            ufm.i r4 = new ufm.i
            r4.<init>(r1, r6, r5)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r2.f229295w = r5
            java.lang.Object r1 = nim.a.b(r4, r2)
            if (r1 != r3) goto L90
            return r3
        L90:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: osa.f.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final v1 c(PushToCardTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        FundingSource fundingSource = transferData.e;
        String pocketCurrency = fundingSource.f92241b.f306286a;
        String strT = czi.c.t(fundingSource);
        dj0.d amount = transferData.f81532j;
        String cardOwnerId = transferData.f81527a;
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        q qVar = (q) this.f229299a.f174461b;
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        String strB = ((rga.c) qVar.d).b("payments_push_to_card_price_quote");
        Continuation continuation = null;
        if (strB == null) {
            strB = null;
        }
        String str = strB;
        d0<x> quoteFees = ((Push2CardAmountService) qVar.f148941b).getQuoteFees(pocketCurrency, amount.f115083b.f306286a, str, amount.f115082a, cardOwnerId, strT, null);
        jof.a aVar = new jof.a(20, new jb8.a(str, 10));
        quoteFees.getClass();
        int i = 1;
        i iVar = new i(quoteFees, aVar, 1);
        jra.b bVar = jra.b.f;
        i iVar2 = new i(iVar, new joe.e(4), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        n nVarI0 = w.i0(ue0.e.t(iVar2, h0.f322473a));
        return transferData.k ? new v1(new e(nVarI0, continuation, 0)) : new v1(new e(nVarI0, continuation, i));
    }
}
