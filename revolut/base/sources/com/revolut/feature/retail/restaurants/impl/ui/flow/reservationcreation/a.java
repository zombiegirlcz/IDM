package com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation;

import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import g75.i;
import geb.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(ReservationCreationFlowContract$InputData inputData) {
        FlowStep details;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof ReservationCreationFlowContract$InputData.Creation) {
            details = new ReservationCreationFlowContract$Step.Creation(((ReservationCreationFlowContract$InputData.Creation) inputData).f82849a);
        } else if (inputData instanceof ReservationCreationFlowContract$InputData.Confirmation) {
            details = new ReservationCreationFlowContract$Step.Confirmation(((ReservationCreationFlowContract$InputData.Confirmation) inputData).f82848a);
        } else {
            if (!(inputData instanceof ReservationCreationFlowContract$InputData.Details)) {
                throw new NoWhenBranchMatchedException();
            }
            details = new ReservationCreationFlowContract$Step.Details(((ReservationCreationFlowContract$InputData.Details) inputData).f82850a);
        }
        this.o = d.a(this, details, f0.f322471a, new i(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
