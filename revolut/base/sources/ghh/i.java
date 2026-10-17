package ghh;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements ozg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f143941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z98.c f143942b;

    public i(k tradingAccountsInteractor, z98.c juniorIsaAddMoneyWarningInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaAddMoneyWarningInteractor, "juniorIsaAddMoneyWarningInteractor");
        this.f143941a = tradingAccountsInteractor;
        this.f143942b = juniorIsaAddMoneyWarningInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ozg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ghh.h
            if (r0 == 0) goto L13
            r0 = r10
            ghh.h r0 = (ghh.h) r0
            int r1 = r0.f143940w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143940w = r1
            goto L1a
        L13:
            ghh.h r0 = new ghh.h
            gim.c r10 = (gim.c) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143940w
            z98.c r3 = r8.f143942b
            r4 = 1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3f
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            yhm.o.b(r10)
            goto La6
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            yhm.o.b(r10)
            goto L87
        L3f:
            yhm.o.b(r10)
            goto L5d
        L43:
            yhm.o.b(r10)
            ybl.k r10 = r8.f143941a
            java.lang.String r9 = r9.getF95657a()
            akg.n r9 = ybl.k.i(r10, r9)
            jhi.b r9 = mo3.a.g(r9, r7, r7, r5)
            r0.f143940w = r4
            java.lang.Object r10 = vkm.q.z(r9, r0)
            if (r10 != r1) goto L5d
            goto La5
        L5d:
            od0.i r10 = (od0.i) r10
            if (r10 == 0) goto L66
            java.lang.Object r9 = r10.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r9 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r9
            goto L67
        L66:
            r9 = r7
        L67:
            boolean r10 = r9 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            if (r10 == 0) goto L6e
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage r9 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage) r9
            goto L6f
        L6e:
            r9 = r7
        L6f:
            boolean r9 = r9 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Personal
            if (r9 != 0) goto L74
            goto Lb0
        L74:
            r0.f143940w = r6
            z98.b r9 = new z98.b
            r10 = 0
            r9.<init>(r3, r7, r10)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r9, r0)
            if (r10 != r1) goto L87
            goto La5
        L87:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto Lb0
            r0.f143940w = r5
            z98.b r9 = new z98.b
            r9.<init>(r3, r7, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r10, r9, r0)
            if (r9 != r1) goto La1
            goto La3
        La1:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        La3:
            if (r9 != r1) goto La6
        La5:
            return r1
        La6:
            com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor r9 = new com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership$Personal r10 = com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership.Personal.f76736a
            t98.e r0 = t98.e.DEPOSIT
            r9.<init>(r10, r0)
            return r9
        Lb0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ghh.i.a(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
