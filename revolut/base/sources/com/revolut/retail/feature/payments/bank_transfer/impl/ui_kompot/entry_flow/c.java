package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlowContract$Step;
import cp5.d;
import k3k.k;
import k4k.g;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements g {
    public final BankTransferFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f102097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b3a.a f102098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f102099r;

    public c(BankTransferFlowInputData inputData, i balancesFilterInteractor, b3a.a chatTransferNavigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        this.o = inputData;
        this.f102097p = balancesFilterInteractor;
        this.f102098q = chatTransferNavigationProvider;
        k kVar = new k(this, 4);
        this.f102099r = d.a(this, BankTransferNavigatingEntryFlowContract$Step.BankTransfer.f102093a, f0.f322471a, kVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102099r;
    }
}
