package com.revolut.feature.cash_topup.impl.ui.flow.select;

import com.revolut.feature.cash_topup.impl.ui.flow.select.SelectCashTopUpFlowContract$Step;
import cp5.d;
import g75.i;
import gc3.b;
import gc3.c;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dj3.a f65666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f65667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nb3.c f65668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f65669s;

    public a(c inputData, dj3.a chooseScreenCommandFactory, o chooserIntentNavigationCommandFactory, nb3.c cashTopUpLocationExplanationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chooseScreenCommandFactory, "chooseScreenCommandFactory");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(cashTopUpLocationExplanationProvider, "cashTopUpLocationExplanationProvider");
        this.o = inputData;
        this.f65666p = chooseScreenCommandFactory;
        this.f65667q = chooserIntentNavigationCommandFactory;
        this.f65668r = cashTopUpLocationExplanationProvider;
        i iVar = new i(this, 14);
        this.f65669s = d.a(this, SelectCashTopUpFlowContract$Step.Guide.f65663a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65669s;
    }
}
