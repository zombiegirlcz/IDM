package com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow;

import a83.z;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ppj.b;
import vh1.d;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(RevolutShopAddressFlowContract$InputData inputData, d addressValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        z zVar = new z(this, 13, inputData, addressValidator);
        this.o = cp5.d.a(this, RevolutShopAddressFlowContract$Step.AddressPicker.f101493a, f0.f322471a, zVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
