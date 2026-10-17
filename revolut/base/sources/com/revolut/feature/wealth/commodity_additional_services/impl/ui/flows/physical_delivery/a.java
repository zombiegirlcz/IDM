package com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery;

import com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.PhysicalDeliveryFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o5h.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(PhysicalDeliveryFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        f fVar = new f(this, 20);
        this.o = d.a(this, PhysicalDeliveryFlowContract$Step.ProductArticle.f95445a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
