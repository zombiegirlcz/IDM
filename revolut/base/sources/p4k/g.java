package p4k;

import c8i.n;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import efm.r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p4c.u;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1k.a f232963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlg.b f232964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f232965c;
    public final ang.f d;
    public final bqf.d e;
    public final n f;

    public g(y1k.a bankTransferInteractor, hlg.b sendChecksInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ang.f userInteractor, bqf.d trustInteractor, n bankTransferChargesDisplayTransformer, h trustFilterProvider) {
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(sendChecksInteractor, "sendChecksInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(bankTransferChargesDisplayTransformer, "bankTransferChargesDisplayTransformer");
        Intrinsics.checkNotNullParameter(trustFilterProvider, "trustFilterProvider");
        this.f232963a = bankTransferInteractor;
        this.f232964b = sendChecksInteractor;
        this.f232965c = transactionsInteractor;
        this.d = userInteractor;
        this.e = trustInteractor;
        this.f = bankTransferChargesDisplayTransformer;
    }

    public static Integer c(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        wi0.b bVarE = f5j.c.e(beneficiary);
        xi0.b bVarF = f5j.c.f(beneficiary);
        wi0.b.Companion.getClass();
        if (!bVarE.equals(wi0.b.p0)) {
            return null;
        }
        xi0.b.Companion.getClass();
        return bVarF.equals(xi0.b.f306273h) ? 18 : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r20, f5j.a r21, com.revolut.feature.transfer.core.models.TransferFlowType r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4k.g.a(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, f5j.a, com.revolut.feature.transfer.core.models.TransferFlowType, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r5, dj0.d r6, f5j.a r7, com.revolut.feature.transfer.core.models.TransferFlowType r8, boolean r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof p4k.c
            if (r0 == 0) goto L13
            r0 = r10
            p4k.c r0 = (p4k.c) r0
            int r1 = r0.f232956w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232956w = r1
            goto L18
        L13:
            p4k.c r0 = new p4k.c
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f232956w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L60
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r10)
            efm.r r5 = r4.h(r5, r6, r7, r8, r9)
            r6 = 3
            r7 = 0
            efm.r r5 = m70.a.g(r5, r7, r7, r6)
            oxd.m r6 = new oxd.m
            r7 = 19
            r6.<init>(r4, r7)
            p30.b r7 = new p30.b
            r8 = 18
            r7.<init>(r8, r6)
            efm.r r5 = r5.map(r7)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            vkm.d r5 = rd0.e.b(r5)
            r0.f232956w = r3
            java.lang.Object r10 = vkm.q.x(r5, r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            java.lang.String r5 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p4k.g.b(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, dj0.d, f5j.a, com.revolut.feature.transfer.core.models.TransferFlowType, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(f5j.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p4k.d
            if (r0 == 0) goto L13
            r0 = r6
            p4k.d r0 = (p4k.d) r0
            int r1 = r0.f232958x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232958x = r1
            goto L18
        L13:
            p4k.d r0 = new p4k.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f232958x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            f5j.a r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.d
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f232958x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            prf.g r0 = new prf.g
            kotlin.jvm.internal.Intrinsics.h(r6)
            wi0.b r6 = do3.q.y(r6)
            wi0.b r5 = f5j.c.e(r5)
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4k.g.d(f5j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(f5j.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p4k.e
            if (r0 == 0) goto L13
            r0 = r8
            p4k.e r0 = (p4k.e) r0
            int r1 = r0.f232961y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232961y = r1
            goto L18
        L13:
            p4k.e r0 = new p4k.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f232959w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f232961y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r7 = r0.v
            yhm.o.b(r8)
            goto L61
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            f5j.a r7 = r0.u
            yhm.o.b(r8)
            goto L4e
        L3a:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f132329a
            iy9.d r2 = iy9.d.BENEFICIARY
            r0.u = r7
            r0.f232961y = r4
            bqf.d r4 = r6.e
            java.lang.Object r8 = r4.b(r8, r2, r0)
            if (r8 != r1) goto L4e
            goto L5d
        L4e:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r8 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r8
            r2 = 0
            r0.u = r2
            r0.v = r8
            r0.f232961y = r3
            java.lang.Object r7 = r6.f(r7, r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r5 = r8
            r8 = r7
            r7 = r5
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r0 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r0.<init>(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4k.g.e(f5j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(f5j.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4k.g.f(f5j.a, gim.c):java.lang.Object");
    }

    public final Flow g(BankTransferData transferData, dj0.d dVar, f5j.a beneficiary, TransferFlowType flowType) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return transferData.f101924a == 0 ? new go.g(null, 2) : rd0.e.b(m70.a.g(h(transferData, dVar, beneficiary, flowType, false), null, null, 3));
    }

    public final r h(BankTransferData bankTransferData, dj0.d dVar, f5j.a aVar, TransferFlowType transferFlowType, boolean z) {
        xi0.b from = bankTransferData.f101926c;
        xi0.b to6 = bankTransferData.f101925b;
        long j2 = bankTransferData.f101924a;
        String strB = f5j.c.b(aVar);
        String strT = czi.c.t(bankTransferData.d);
        AccountId accountId = transferFlowType.getF92255a();
        q2k.e eVar = (q2k.e) this.f232963a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        q2k.f fVar = eVar.f241738b;
        Pair pair = new Pair(from, to6);
        String strC = q2k.e.c(accountId);
        l2k.g gVar = (l2k.g) fVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pair, "pair");
        l2k.b bVar = new l2k.b(pair, j2, dVar, strB, strT, strC);
        r rVarConcatWith = mo3.a.n(gVar.d.f(bVar, true)).concatWith(gVar.e.a(bVar, l2k.g.f191822g, false));
        Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
        if (z) {
            rVarConcatWith = rVarConcatWith.skipWhile(new p30.b(17, new u(14)));
            Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "skipWhile(...)");
        }
        r rVarJ = zi0.c.J(rVarConcatWith);
        if (!Intrinsics.f(to6, from)) {
            return rVarJ;
        }
        if (dVar != null && !Intrinsics.f(to6, dVar.f115083b)) {
            return rVarJ;
        }
        r rVarTake = rVarJ.take(1L);
        Intrinsics.h(rVarTake);
        return rVarTake;
    }
}
