package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$Step;
import e52.c;
import jch.p;
import ji6.b;
import kotlin.jvm.internal.Intrinsics;
import oe6.m;
import oki.h;
import pi6.d;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final OpenBankingAuthAccountsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f72495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f72496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f72497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f72498s;

    public a(OpenBankingAuthAccountsFlowContract$InputData inputData, d brexitErrorHandler, m openBankingInteractor, c outboundConsentsServerErrorHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(brexitErrorHandler, "brexitErrorHandler");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(outboundConsentsServerErrorHandler, "outboundConsentsServerErrorHandler");
        this.o = inputData;
        this.f72495p = brexitErrorHandler;
        this.f72496q = openBankingInteractor;
        this.f72497r = outboundConsentsServerErrorHandler;
        p pVar = new p(this, 18);
        this.f72498s = cp5.d.a(this, OpenBankingAuthAccountsFlowContract$Step.AccountsSelection.f72494a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72498s;
    }
}
