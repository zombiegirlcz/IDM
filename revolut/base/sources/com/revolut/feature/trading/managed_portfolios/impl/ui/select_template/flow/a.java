package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow;

import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.ManagedPortfolioSelectTemplateFlowContract$Step;
import g75.i;
import g8f.b;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final ManagedPortfolioSelectTemplateFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f91464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f91465q;

    public a(ManagedPortfolioSelectTemplateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f91464p = e.b(this, ManagedPortfolioSelectTemplateFlowContract$State.f91460a);
        i iVar = new i(this, 4);
        this.f91465q = cp5.d.a(this, ManagedPortfolioSelectTemplateFlowContract$Step.SelectTemplate.f91462a, f0.f322471a, iVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f91464p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91465q;
    }
}
