package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.IncomeSorterTransferDestinationsFlowContract$Step;
import jqd.c;
import jqd.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r3a.b;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f87775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x2k.a f87776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f87777r;

    public a(d inputData, b transferNavigationScreenProvider, x2k.a bankTransferNavigationScreenProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferNavigationScreenProvider, "transferNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(bankTransferNavigationScreenProvider, "bankTransferNavigationScreenProvider");
        this.o = inputData;
        this.f87775p = transferNavigationScreenProvider;
        this.f87776q = bankTransferNavigationScreenProvider;
        jnf.d dVar = new jnf.d(this, 4);
        this.f87777r = cp5.d.a(this, IncomeSorterTransferDestinationsFlowContract$Step.SelectRecipient.f87774a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87777r;
    }
}
