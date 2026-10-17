package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest;

import ack.f;
import adg.g;
import adg.j;
import adg.m;
import cli.y;
import fcg.d;
import hx7.e;
import i9g.h0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f93962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f93964r;

    public a(TravelHotelsGuestPickerScreenContract$InputData inputData, m stateMapper, d dialogProvider, h0 travelHotelsPropertySearchParamsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(travelHotelsPropertySearchParamsInteractor, "travelHotelsPropertySearchParamsInteractor");
        this.o = dialogProvider;
        this.f93962p = travelHotelsPropertySearchParamsInteractor;
        this.f93963q = e.a(this, new f(this, 3));
        this.f93964r = mra.d.b(this, new g(d0.d1(inputData.f93958a)), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93963q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93964r;
    }
}
