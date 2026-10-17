package com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout;

import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nwi.b;
import oki.h;
import qki.d;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final AirportLoungeCheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f98960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f98961q;

    public a(AirportLoungeCheckoutFlowContract$InputData inputData, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.o = inputData;
        this.f98960p = e.b(this, new AirportLoungeCheckoutFlowContract$State(y.u(uuidUtils, "toString(...)"), inputData.f98955a));
        o oVar = new o(this, 29);
        this.f98961q = cp5.d.a(this, AirportLoungeCheckoutFlowContract$Step.Checkout.f98959a, f0.f322471a, oVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f98960p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98961q;
    }
}
