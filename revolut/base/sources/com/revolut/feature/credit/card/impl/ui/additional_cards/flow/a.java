package com.revolut.feature.credit.card.impl.ui.additional_cards.flow;

import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mp4.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final AdditionalCardsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69024p;

    public a(AdditionalCardsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        g gVar = new g(this, 3);
        this.f69024p = d.a(this, AdditionalCardsFlowContract$Step.AdditionalCards.f69021a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69024p;
    }
}
