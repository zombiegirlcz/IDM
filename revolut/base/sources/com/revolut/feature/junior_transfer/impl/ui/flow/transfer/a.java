package com.revolut.feature.junior_transfer.impl.ui.flow.transfer;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.R$string;
import com.revolut.feature.junior_transfer.impl.ui.flow.transfer.JuniorTransferFlowContract$Step;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import dki.g;
import dmj.e0;
import dr8.b;
import dr8.c;
import fmc.z;
import kd8.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import org.jetbrains.annotations.NotNull;
import rp0.f1;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements dr8.a {

    @NotNull
    public static final b Companion = new b();
    public final JuniorTransferFlowContract$EmptyState A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JuniorTransferFlowContract$InputData f77446t;
    public final wj0.a u;
    public final z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f77447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vc8.a f77448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qq8.b f77449y;
    public final JuniorTransferFlowContract$Step.Transfer z;

    public a(JuniorTransferFlowContract$InputData inputData, wj0.a idempotencyKeyHolder, z juniorWalletInteractor, p juniorConsentPromptBelowGDPRInteractor, vc8.a juniorConsentPromptProvider, qq8.b juniorTransferInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(juniorWalletInteractor, "juniorWalletInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentPromptBelowGDPRInteractor, "juniorConsentPromptBelowGDPRInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentPromptProvider, "juniorConsentPromptProvider");
        Intrinsics.checkNotNullParameter(juniorTransferInteractor, "juniorTransferInteractor");
        this.f77446t = inputData;
        this.u = idempotencyKeyHolder;
        this.v = juniorWalletInteractor;
        this.f77447w = juniorConsentPromptBelowGDPRInteractor;
        this.f77448x = juniorConsentPromptProvider;
        this.f77449y = juniorTransferInteractor;
        this.z = JuniorTransferFlowContract$Step.Transfer.f77445a;
        this.A = JuniorTransferFlowContract$EmptyState.f77441a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a r13, com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a.O2(com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a, com.revolut.feature.junior_profile.api.models.JuniorBankingProfile, gim.c):java.lang.Object");
    }

    public static final void P2(a aVar, JuniorBankingProfile juniorBankingProfile, d dVar) {
        int i;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        int i2 = c.f117104a[aVar.f77446t.f77443b.ordinal()];
        if (i2 == 1) {
            i = R$string.junior_transfer_topup_tooltip_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.junior_transfer_withdrawal_tooltip_title;
        }
        l.a1(aVar, aVar.X1(new k("id_transfer_success", new TextLocalisedClause(i, u.c(moneyClause), null, 12), null, null, f1.ABOVE_ANCHOR_VIEW, 12)), null, null, new dlk.k(aVar, juniorBankingProfile, null, 18), 3);
    }

    @Override // yji.l
    public final void I1() {
        this.u.a("payments_peer_to_peer_transfer");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        JuniorTransferFlowContract$Step step = (JuniorTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JuniorTransferFlowContract$Step.Transfer)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorTransferFlowContract$InputData juniorTransferFlowContract$InputData = this.f77446t;
        JuniorTransferAmountScreen juniorTransferAmountScreen = new JuniorTransferAmountScreen(new JuniorTransferAmountScreenContract$InputData(juniorTransferFlowContract$InputData.f77442a, juniorTransferFlowContract$InputData.f77443b, juniorTransferFlowContract$InputData.f77444c));
        e0 e0Var = new e0(this, 20);
        Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
        juniorTransferAmountScreen.H = e0Var;
        return juniorTransferAmountScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.A;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.z;
    }
}
