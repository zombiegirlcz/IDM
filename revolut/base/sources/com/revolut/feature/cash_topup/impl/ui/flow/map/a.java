package com.revolut.feature.cash_topup.impl.ui.flow.map;

import com.revolut.feature.cash_topup.impl.ui.flow.map.CashTopUpMapFlowContract$Step;
import cp5.d;
import e54.r;
import ec3.b;
import kotlin.jvm.internal.Intrinsics;
import nb3.c;
import nd.o;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final dj3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f65659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f65660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f65661r;

    public a(dj3.a chooserScreenCommandsFactory, o chooserIntentNavigationCommandFactory, c cashTopUpLocationExplanationProvider) {
        Intrinsics.checkNotNullParameter(chooserScreenCommandsFactory, "chooserScreenCommandsFactory");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(cashTopUpLocationExplanationProvider, "cashTopUpLocationExplanationProvider");
        this.o = chooserScreenCommandsFactory;
        this.f65659p = chooserIntentNavigationCommandFactory;
        this.f65660q = cashTopUpLocationExplanationProvider;
        r rVar = new r(this, 24);
        this.f65661r = d.a(this, CashTopUpMapFlowContract$Step.LocationPermissions.f65657a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65661r;
    }
}
