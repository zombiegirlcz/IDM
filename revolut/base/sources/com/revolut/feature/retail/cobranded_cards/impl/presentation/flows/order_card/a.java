package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.CobrandedCardsOrderCardFlowContract$Step;
import cp5.d;
import h6b.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qh3.c;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final CobrandedCardsOrderCardFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e6b.b f82522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f82523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f82524r;

    public a(CobrandedCardsOrderCardFlowContract$InputData inputData, e6b.b cardOrderNavigationResolver, c checkoutControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardOrderNavigationResolver, "cardOrderNavigationResolver");
        Intrinsics.checkNotNullParameter(checkoutControllerExtension, "checkoutControllerExtension");
        this.o = inputData;
        this.f82522p = cardOrderNavigationResolver;
        this.f82523q = checkoutControllerExtension;
        h1c.c cVar = new h1c.c(this, 12);
        this.f82524r = d.a(this, CobrandedCardsOrderCardFlowContract$Step.TypeSelection.f82521a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82524r;
    }
}
