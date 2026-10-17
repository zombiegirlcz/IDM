package com.revolut.retail.feature.plan_rewards.impl.presentation.flow;

import hdk.e;
import hdk.f;
import hdk.k;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wik.m;
import wli.x;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements e {
    public final MonthlyDrawsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f102553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gdk.d f102554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f102555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hdk.c f102556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f102557t;
    public final i u;

    public d(MonthlyDrawsFlowContract$InputData inputData, x deeplinkHandler, gdk.d monthlyDrawsInteractor, k optOutScreenProvider, hdk.c monthlyDrawsBottomSheetFactory, m pricingPlanOffersInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(monthlyDrawsInteractor, "monthlyDrawsInteractor");
        Intrinsics.checkNotNullParameter(optOutScreenProvider, "optOutScreenProvider");
        Intrinsics.checkNotNullParameter(monthlyDrawsBottomSheetFactory, "monthlyDrawsBottomSheetFactory");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        this.o = inputData;
        this.f102553p = deeplinkHandler;
        this.f102554q = monthlyDrawsInteractor;
        this.f102555r = optOutScreenProvider;
        this.f102556s = monthlyDrawsBottomSheetFactory;
        this.f102557t = pricingPlanOffersInteractor;
        this.u = d8l.d.a(this, new h1c.c(this, 27));
    }

    @Override // yki.j
    public final void M0() {
        l2(new c(this, null), new f(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
