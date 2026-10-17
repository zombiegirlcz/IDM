package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import wti.b;
import yki.i;
import zsi.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final AsftWidgetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rui.a f98799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f98800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f98801r;

    public a(AsftWidgetFlowContract$InputData inputData, rui.a passCancelBookingSuccessDialogMapper, e passesInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passCancelBookingSuccessDialogMapper, "passCancelBookingSuccessDialogMapper");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        this.o = inputData;
        this.f98799p = passCancelBookingSuccessDialogMapper;
        this.f98800q = passesInteractor;
        this.f98801r = d.a(this, new f(this, 29));
    }

    @Override // yki.j
    public final void M0() {
        AsftWidgetFlowContract$InputData asftWidgetFlowContract$InputData = this.o;
        if (!(asftWidgetFlowContract$InputData instanceof AsftWidgetFlowContract$InputData.PassAvailableSoon)) {
            throw new NoWhenBranchMatchedException();
        }
        AsftWidgetFlowContract$InputData.PassAvailableSoon passAvailableSoon = (AsftWidgetFlowContract$InputData.PassAvailableSoon) asftWidgetFlowContract$InputData;
        h.u2(this, this.f98801r, new AsftWidgetFlowContract$Step.PassAvailableSoonModal(passAvailableSoon.f98793a, passAvailableSoon.f98794b), null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98801r;
    }
}
