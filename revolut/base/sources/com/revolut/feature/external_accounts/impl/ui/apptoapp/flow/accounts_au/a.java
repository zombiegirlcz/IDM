package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$Step;
import cp5.d;
import e52.c;
import kotlin.jvm.internal.Intrinsics;
import li6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final OpenBankingAuthAccountsAuFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xg6.b f72504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f72505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f72506r;

    public a(OpenBankingAuthAccountsAuFlowContract$InputData inputData, xg6.b accountSelectionAuInteractor, c outboundConsentsServerErrorHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountSelectionAuInteractor, "accountSelectionAuInteractor");
        Intrinsics.checkNotNullParameter(outboundConsentsServerErrorHandler, "outboundConsentsServerErrorHandler");
        this.o = inputData;
        this.f72504p = accountSelectionAuInteractor;
        this.f72505q = outboundConsentsServerErrorHandler;
        lcc.c cVar = new lcc.c(this, 13);
        this.f72506r = d.a(this, OpenBankingAuthAccountsAuFlowContract$Step.AccountsSelection.f72503a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72506r;
    }
}
