package com.revolut.feature.add_card_to_google_pay_shared.impl.card_security;

import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlowContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlowContract$Step;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p5f.c;
import pg1.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(CardSecurityFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (!(inputData instanceof CardSecurityFlowContract$InputData.CardSecurityPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        CardSecurityFlowContract$InputData.CardSecurityPrompt cardSecurityPrompt = (CardSecurityFlowContract$InputData.CardSecurityPrompt) inputData;
        this.o = d.a(this, new CardSecurityFlowContract$Step.CardSecurityPrompt(cardSecurityPrompt.f60866a, cardSecurityPrompt.f60867b, cardSecurityPrompt.f60868c), f0.f322471a, new c(this, 20));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
