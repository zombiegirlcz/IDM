package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import maf.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TransferInPriceUpdateFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new TransferInPriceUpdateFlowContract$Step.AssetPriceUpdate(inputData.f91608a), f0.f322471a, new j1(7));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
