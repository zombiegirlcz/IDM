package com.revolut.feature.wealth.ui.impl.actions.handler;

import a83.z;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Step;
import cp5.d;
import yki.k;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends k {
    public final yki.a o;

    public a(WealthTransferFlowControllerFactory$Descriptor wealthTransferFlowControllerFactory$Descriptor, iih.a aVar) {
        z zVar = new z(wealthTransferFlowControllerFactory$Descriptor, 23, this, aVar);
        this.o = d.a(this, WealthTransferFlowControllerFactory$Step.Initial.f95943a, f0.f322471a, zVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
