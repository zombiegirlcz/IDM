package com.revolut.feature.apm.bills.boleto.impl.finder.onboarding;

import ack.f;
import an1.b;
import an1.c;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.BoletoFinderOnboardingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final BoletoFinderOnboardingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final en1.a f61174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f61175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f61176r;

    public a(BoletoFinderOnboardingFlowContract$InputData inputData, en1.a interactor, c dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f61174p = interactor;
        this.f61175q = dialogProvider;
        f fVar = new f(this, 28);
        this.f61176r = d.a(this, BoletoFinderOnboardingFlowContract$Step.Article.f61173a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61176r;
    }
}
