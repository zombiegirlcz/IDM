package ghh;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements m1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f143931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f143932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f143933c;

    public d(l tradingConfigInteractor, kpj.f wealthAccountHeaderUiMapper, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f143931a = tradingConfigInteractor;
        this.f143932b = wealthAccountHeaderUiMapper;
        this.f143933c = tradingAccountsInteractor;
    }

    @Override // m1h.a
    public final Object a() {
        throw new IllegalStateException("Recurring add money feature is not available for tax advantage accounts!");
    }

    @Override // m1h.a
    public final Object b(TransferSubjectId transferSubjectId, dj0.d dVar, iah.h hVar) {
        throw new IllegalStateException("Recurring add money feature is not available for tax advantage accounts!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r0 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // m1h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r15, dj0.d r16, kotlin.coroutines.Continuation r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof ghh.b
            if (r1 == 0) goto L15
            r1 = r0
            ghh.b r1 = (ghh.b) r1
            int r2 = r1.f143928y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f143928y = r2
            goto L1c
        L15:
            ghh.b r1 = new ghh.b
            gim.c r0 = (gim.c) r0
            r1.<init>(r14, r0)
        L1c:
            java.lang.Object r0 = r1.f143926w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f143928y
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L41
            if (r3 == r4) goto L37
            if (r3 != r5) goto L2f
            yhm.o.b(r0)
            goto L84
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            dj0.d r3 = r1.v
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r4 = r1.u
            yhm.o.b(r0)
            r7 = r3
            r3 = r4
            goto L63
        L41:
            yhm.o.b(r0)
            ybl.k r0 = r14.f143933c
            java.lang.String r3 = r15.getF95657a()
            akg.n r0 = ybl.k.i(r0, r3)
            r3 = 3
            jhi.b r0 = mo3.a.g(r0, r6, r6, r3)
            r3 = r15
            r1.u = r3
            r7 = r16
            r1.v = r7
            r1.f143928y = r4
            java.lang.Object r0 = vkm.q.z(r0, r1)
            if (r0 != r2) goto L63
            goto L83
        L63:
            od0.i r0 = (od0.i) r0
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r0.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r0
            goto L6d
        L6c:
            r0 = r6
        L6d:
            boolean r4 = r0 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            if (r4 == 0) goto L74
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage) r0
            goto L75
        L74:
            r0 = r6
        L75:
            if (r0 == 0) goto L99
            r1.u = r6
            r1.v = r6
            r1.f143928y = r5
            java.lang.Object r0 = r14.d(r7, r0, r1)
            if (r0 != r2) goto L84
        L83:
            return r2
        L84:
            r2 = r0
            com.revolut.core.ui_kit.models.Clause r2 = (com.revolut.core.ui_kit.models.Clause) r2
            nii.j0 r1 = new nii.j0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 4094(0xffe, float:5.737E-42)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L99:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.getF95657a()
            java.lang.String r2 = "Trading account with portfolio id "
            java.lang.String r3 = " is not TaxAdvantage type"
            java.lang.String r1 = a10.b.s(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ghh.d.c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dj0.d r19, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ghh.d.d(dj0.d, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage, gim.c):java.lang.Object");
    }
}
