package com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import plb.b;
import plb.f;
import plb.g;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final SavingsInterestRateExplanationContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f83223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f83224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f83225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83226s;

    public a(SavingsInterestRateExplanationContract$InputData inputData, f80.a uriHelper, x deeplinkHandler, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f83223p = uriHelper;
        this.f83224q = deeplinkHandler;
        this.f83225r = d.b(this, new plb.a(inputData.f83221a), stateMapper, null, false, 12);
        this.f83226s = e.a(this, new g(this, 0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83226s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83225r;
    }
}
