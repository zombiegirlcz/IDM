package com.revolut.feature.pix.impl.flow.common;

import b7d.c;
import com.revolut.feature.pix.api.navigation.PixCommonModal;
import com.revolut.feature.pix.impl.flow.common.PixCommonModalsContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements baa.a {
    public final yki.a o;

    public a(PixCommonModalsContract$InputData inputData) {
        FlowStep showMoneyBreakdown;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        PixCommonModal pixCommonModal = inputData.f80625a;
        if (pixCommonModal instanceof PixCommonModal.ShowAdditionalInformation) {
            showMoneyBreakdown = new PixCommonModalsContract$Step.ShowAdditionalInformation(((PixCommonModal.ShowAdditionalInformation) pixCommonModal).f80503a);
        } else if (pixCommonModal instanceof PixCommonModal.ShowAddress) {
            showMoneyBreakdown = new PixCommonModalsContract$Step.ShowAddress(((PixCommonModal.ShowAddress) pixCommonModal).f80504a);
        } else {
            if (!(pixCommonModal instanceof PixCommonModal.ShowMoneyBreakdown)) {
                throw new NoWhenBranchMatchedException();
            }
            PixCommonModal.ShowMoneyBreakdown showMoneyBreakdown2 = (PixCommonModal.ShowMoneyBreakdown) pixCommonModal;
            showMoneyBreakdown = new PixCommonModalsContract$Step.ShowMoneyBreakdown(showMoneyBreakdown2.f80505a, showMoneyBreakdown2.f80506b, showMoneyBreakdown2.f80507c, showMoneyBreakdown2.d);
        }
        this.o = d.a(this, showMoneyBreakdown, f0.f322471a, new c(this, 9));
    }

    @Override // yki.g
    public final b s() {
        return this.o;
    }
}
