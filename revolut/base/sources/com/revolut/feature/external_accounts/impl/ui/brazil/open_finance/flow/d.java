package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow;

import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlowContract$Step;
import dk6.e;
import kotlin.jvm.internal.Intrinsics;
import mj6.l;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements dk6.b {

    @NotNull
    public static final e Companion = new e();
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qg6.a f72689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f72690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f72691r;

    public d(com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor, qg6.a inboundConsentDetailsInteractor, l revokeConfirmationProvider) {
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        Intrinsics.checkNotNullParameter(inboundConsentDetailsInteractor, "inboundConsentDetailsInteractor");
        Intrinsics.checkNotNullParameter(revokeConfirmationProvider, "revokeConfirmationProvider");
        this.o = openBankingBrazilInteractor;
        this.f72689p = inboundConsentDetailsInteractor;
        this.f72690q = revokeConfirmationProvider;
        dgj.h hVar = new dgj.h(this, 5);
        this.f72691r = cp5.d.a(this, OpenFinanceFlowContract$Step.OpenFinance.f72679a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72691r;
    }
}
