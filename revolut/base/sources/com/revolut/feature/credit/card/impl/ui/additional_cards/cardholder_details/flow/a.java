package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow;

import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$Step;
import cp5.d;
import kj4.c;
import kotlin.jvm.internal.Intrinsics;
import kp4.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final AdditionalCardsCardholderDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f69019p;

    public a(AdditionalCardsCardholderDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f69019p = d.a(this, new AdditionalCardsCardholderDetailsFlowContract$Step.CardholderDetails(inputData.f69009b, inputData.f69010c), f0.f322471a, new c(this, 11));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69019p;
    }
}
