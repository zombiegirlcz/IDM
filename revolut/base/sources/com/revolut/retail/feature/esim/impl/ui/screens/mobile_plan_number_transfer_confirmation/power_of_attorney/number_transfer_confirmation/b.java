package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import plb.g;
import plj.e;
import plj.i;
import rd0.c;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements i {
    public final EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f101355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101356q;

    public b(n stateMapper, EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f101355p = d.b(this, new e(null, null, null, null, (EsimPhoneNumberPortingOwnerAccountType) d0.d0(inputData.e.f)), stateMapper, null, false, 12);
        this.f101356q = hx7.e.a(this, new g(this, 4));
    }

    public static void I2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, "EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenModel", null, illegalStateException, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101356q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101355p;
    }
}
