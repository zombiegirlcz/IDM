package com.revolut.feature.recurring_buys.schedule.impl.ui;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import lua.b;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81648p;

    public a(iua.a inputData, lua.h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, new lua.a(inputData.f168539a, inputData.f168540b), stateMapper, null, false, 12);
        this.f81648p = e.a(this, new c(this, 8));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81648p;
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
