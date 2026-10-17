package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view;

import bof.r;
import bq9.d;
import cli.g;
import cli.y;
import hq9.i;
import hq9.j;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements j {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f79282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f79283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79284r;

    public a(i inputData, r stateMapper, d splitItemizationDialogInputDataProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(splitItemizationDialogInputDataProvider, "splitItemizationDialogInputDataProvider");
        this.o = inputData;
        this.f79282p = splitItemizationDialogInputDataProvider;
        this.f79283q = mra.d.b(this, new hq9.h(inputData.f154645c), stateMapper, null, false, 12);
        this.f79284r = e.a(this, new hfb.d(this, 15));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79284r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f79283q;
    }
}
