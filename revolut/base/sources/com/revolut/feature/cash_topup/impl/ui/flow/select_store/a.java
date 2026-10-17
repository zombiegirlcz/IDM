package com.revolut.feature.cash_topup.impl.ui.flow.select_store;

import com.revolut.feature.cash_topup.impl.ui.flow.select_store.CashTopUpSelectStoreFlowContract$Step;
import cp5.d;
import i69.p;
import ic3.b;
import ic3.c;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nb3.c f65674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f65675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f65676r;

    public a(c inputData, nb3.c cashTopUpLocationExplanationProvider, o chooserIntentNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashTopUpLocationExplanationProvider, "cashTopUpLocationExplanationProvider");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        this.o = inputData;
        this.f65674p = cashTopUpLocationExplanationProvider;
        this.f65675q = chooserIntentNavigationCommandFactory;
        p pVar = new p(this, 10);
        this.f65676r = d.a(this, CashTopUpSelectStoreFlowContract$Step.LocationPermissions.f65671a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65676r;
    }
}
