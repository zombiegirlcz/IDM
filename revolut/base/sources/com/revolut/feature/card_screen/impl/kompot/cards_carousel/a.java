package com.revolut.feature.card_screen.impl.kompot.cards_carousel;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l73.d;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements d {
    public final CardsCarouselFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j63.a f65381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.a f65382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f65383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f65384s;

    public a(CardsCarouselFlowContract$InputData inputData, j63.a selectedCardUiConfigProvider, mt8.a kycFeatureToggleProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectedCardUiConfigProvider, "selectedCardUiConfigProvider");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f65381p = selectedCardUiConfigProvider;
        this.f65382q = kycFeatureToggleProvider;
        this.f65383r = featureToggleInteractor;
        v vVar = new v(this, 13);
        this.f65384s = cp5.d.a(this, CardsCarouselFlowContract$Step.CardsCarousel.f65378a, f0.f322471a, vVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f65384s;
    }
}
