package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import hx7.e;
import java.time.LocalDate;
import kj4.c;
import klj.i;
import klj.l;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements l {
    public final EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f101336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101337q;

    public a(n stateMapper, EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        LocalDate localDate = inputData.f101332c;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = inputData.d;
        this.f101336p = d.b(this, new i(localDate, esimPhoneNumberPortingScheduleOption == null ? (EsimPhoneNumberPortingScheduleOption) d0.d0(inputData.f101331b) : esimPhoneNumberPortingScheduleOption), stateMapper, null, false, 12);
        this.f101337q = e.a(this, new c(this, 7));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101337q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f101336p;
    }
}
