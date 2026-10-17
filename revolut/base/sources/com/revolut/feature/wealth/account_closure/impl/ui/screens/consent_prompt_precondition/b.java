package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition;

import ael.q0;
import cli.y;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import hx7.e;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kug.g;
import kug.i;
import kug.j;
import kug.n;
import kug.p;
import kug.r;
import kug.v;
import mra.d;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import oki.h;
import vkm.j2;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements r {
    public final kug.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConsentPromptPreconditionScreenContract$InputData f94938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ktg.a f94939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f94940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f94941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f94942t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(kug.h mapper, ConsentPromptPreconditionScreenContract$InputData inputData, ktg.a interactor, k tradingAccountsInteractor, l tradingConfigInteractor, kug.a saveStateDelegate) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = mapper;
        this.f94938p = inputData;
        this.f94939q = interactor;
        this.f94940r = tradingAccountsInteractor;
        this.f94941s = tradingConfigInteractor;
        this.f94942t = d.b(this, new g(null, null), mapper, saveStateDelegate, false, 8);
        this.u = e.a(this, new kj4.c(this, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum I2(com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b r6, com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus r7, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof kug.w
            if (r0 == 0) goto L13
            r0 = r9
            kug.w r0 = (kug.w) r0
            int r1 = r0.f189812w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189812w = r1
            goto L18
        L13:
            kug.w r0 = new kug.w
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189812w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L7c
        L28:
            r6 = move-exception
            goto L87
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r9)
            com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus$HasJointGiaOnboarded r9 = com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus.HasJointGiaOnboarded.f94874a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r9)
            if (r7 == 0) goto L95
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            ybl.l r6 = r6.f94941s     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r8.getF105264c()     // Catch: java.lang.Throwable -> L28
            ael.t0 r6 = (ael.t0) r6     // Catch: java.lang.Throwable -> L28
            d4f.s r8 = r6.f3660b     // Catch: java.lang.Throwable -> L28
            java.util.Set r9 = ael.t0.d     // Catch: java.lang.Throwable -> L28
            kotlinx.coroutines.flow.Flow r8 = r8.a(r9)     // Catch: java.lang.Throwable -> L28
            a09.z r9 = new a09.z     // Catch: java.lang.Throwable -> L28
            r2 = 5
            r5 = 0
            r9.<init>(r6, r5, r7, r2)     // Catch: java.lang.Throwable -> L28
            kotlinx.coroutines.flow.Flow r6 = boh.f.e(r8, r9)     // Catch: java.lang.Throwable -> L28
            ael.r0 r7 = new ael.r0     // Catch: java.lang.Throwable -> L28
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L28
            akg.n r6 = nim.a.v(r6, r7)     // Catch: java.lang.Throwable -> L28
            zhm.h0 r7 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L28
            vkm.q0 r6 = rd0.e.n(r6, r7)     // Catch: java.lang.Throwable -> L28
            ku1.f0 r7 = new ku1.f0     // Catch: java.lang.Throwable -> L28
            r8 = 6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L28
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)     // Catch: java.lang.Throwable -> L28
            r0.f189812w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = vkm.q.z(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r9 != r1) goto L7c
            return r1
        L7c:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r9 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r9     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L83
            hel.b r6 = r9.f105106a     // Catch: java.lang.Throwable -> L28
            goto L84
        L83:
            r6 = r4
        L84:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L8d
        L87:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L8d:
            boolean r7 = r6 instanceof yhm.n
            if (r7 == 0) goto L92
            goto L93
        L92:
            r4 = r6
        L93:
            hel.b r4 = (hel.b) r4
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b.I2(com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b, com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, gim.c):java.lang.Enum");
    }

    public static final void J2(b bVar, TradingAccount tradingAccount, String str, AccountClosurePreconditionsStatus accountClosurePreconditionsStatus, n1 n1Var) {
        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = bVar.f94938p;
        if (consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData) {
            bVar.K2(accountClosurePreconditionsStatus, n1Var, tradingAccount, str);
            return;
        }
        if (!(consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData)) {
            throw new NoWhenBranchMatchedException();
        }
        ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData closeTradingProductInputData = (ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData) consentPromptPreconditionScreenContract$InputData;
        Set set = closeTradingProductInputData.f94931c;
        if (set.isEmpty()) {
            set = null;
        }
        if (set != null ? set.contains(accountClosurePreconditionsStatus) : false) {
            bVar.K2(accountClosurePreconditionsStatus, n1Var, tradingAccount, str);
        } else {
            bVar.C2(new n(closeTradingProductInputData.f94929a, closeTradingProductInputData.f94930b));
        }
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarD;
        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = this.f94938p;
        boolean z = consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData;
        k kVar = this.f94940r;
        if (z) {
            nVarD = ((q0) kVar).o(((ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData) consentPromptPreconditionScreenContract$InputData).f94928a, w4l.h.f294642c);
        } else {
            if (!(consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            nVarD = k.d(kVar, ((ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData) consentPromptPreconditionScreenContract$InputData).f94929a);
        }
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.x("ConsentPromptPreconditionScreenModel", "fetchAccount", nim.a.v(nVarD, new ksk.h(18))), null, null, new krc.h(this, null, 9), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2(AccountClosurePreconditionsStatus accountClosurePreconditionsStatus, n1 n1Var, TradingAccount tradingAccount, String str) {
        boolean zF = Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasNonTradeableStocks.f94876a);
        j jVar = j.f189799a;
        if (zF || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasPendingStockTransfers.f94879a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasRoboOrFlexibleAccountOnboarded.f94880a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasOtherAccountOnboarded.f94878a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasJointGiaOnboarded.f94874a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasTransferOutRequest.f94881a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasWarrants.f94882a) || Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.Unknown.f94884a)) {
            C2(jVar);
            return;
        }
        if (Intrinsics.f(accountClosurePreconditionsStatus, AccountClosurePreconditionsStatus.HasMarginLoan.f94875a)) {
            if (!(n1Var instanceof l1) && !(n1Var instanceof m1) && !(n1Var instanceof j1) && !(n1Var instanceof k1) && n1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            C2(jVar);
            return;
        }
        if (!(accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.HasOpenPositions)) {
            if (!(accountClosurePreconditionsStatus instanceof AccountClosurePreconditionsStatus.OK)) {
                throw new NoWhenBranchMatchedException();
            }
            L2(tradingAccount, str, ((AccountClosurePreconditionsStatus.OK) accountClosurePreconditionsStatus).f94883a);
        } else if (n1Var instanceof j1) {
            if (((j1) n1Var).f216180b.d instanceof p) {
                C2(new kug.l());
            }
        } else if ((n1Var instanceof k1) || n1Var == null || (n1Var instanceof l1)) {
            C2(jVar);
        } else {
            if (!(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
            L2(tradingAccount, str, ((AccountClosurePreconditionsStatus.HasOpenPositions) accountClosurePreconditionsStatus).f94877a);
        }
    }

    public final void L2(TradingAccount tradingAccount, String str, AccountClosureFeedbackOptions accountClosureFeedbackOptions) {
        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = this.f94938p;
        if (!(consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData)) {
            if (!(consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData closeTradingProductInputData = (ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData) consentPromptPreconditionScreenContract$InputData;
            C2(new n(closeTradingProductInputData.f94929a, closeTradingProductInputData.f94930b));
            return;
        }
        ltg.a aVar = ((g) ((j2) this.f94942t.f22677a).getValue()).f189795b;
        ltg.b bVar = null;
        if (aVar != null) {
            int i = v.f189811a[aVar.ordinal()];
            if (i == 1) {
                bVar = ltg.b.CONFIRMED;
            } else if (i == 2) {
                bVar = ltg.b.INFORMED;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        C2(new i(accountClosureFeedbackOptions, tradingAccount, str, bVar));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94942t;
    }
}
