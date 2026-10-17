package com.revolut.retail.feature.payments.bank_transfer.impl.comparison.ui;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hw9.b;
import hx7.e;
import i2k.d;
import i2k.k;
import i2k.l;
import i2k.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements l {

    @NotNull
    public static final n Companion = new n();
    public final PriceComparisonScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h2k.l f102000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f102001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f102002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f102003s;

    public a(PriceComparisonScreenContract$InputData inputData, h2k.l pricingPlanComparisonInteractor, d planInfoExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanComparisonInteractor, "pricingPlanComparisonInteractor");
        Intrinsics.checkNotNullParameter(planInfoExtension, "planInfoExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f102000p = pricingPlanComparisonInteractor;
        this.f102001q = planInfoExtension;
        this.f102002r = mra.d.b(this, new k(new Data(null, null, false, 6, null), inputData.f101997c), stateMapper, null, false, 12);
        this.f102003s = e.a(this, new b(this, 23));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f102003s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        PriceComparisonScreenContract$InputData priceComparisonScreenContract$InputData = this.o;
        xi0.b bVar = priceComparisonScreenContract$InputData.f101995a;
        dj0.d dVar = priceComparisonScreenContract$InputData.f101997c;
        yji.l.b1(this, this.f102000p.a(dVar.f115082a, priceComparisonScreenContract$InputData.f101996b, bVar, dVar.f115083b), null, new i13.d(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f102002r;
    }
}
