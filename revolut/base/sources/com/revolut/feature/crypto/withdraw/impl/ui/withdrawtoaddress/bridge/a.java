package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge;

import a83.z;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.CryptoSendDualChooserBridgeContract$Step;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pp5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(DualChooserContract$InputData inputData, pp5.a balancesFilterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        this.o = d.a(this, new CryptoSendDualChooserBridgeContract$Step.DualChooser(inputData), f0.f322471a, new z(this, 12, inputData, balancesFilterInteractor));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
