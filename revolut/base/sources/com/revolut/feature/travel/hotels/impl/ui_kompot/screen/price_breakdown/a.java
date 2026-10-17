package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown;

import cli.g;
import cli.k;
import cli.y;
import edg.d;
import edg.f;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements d {
    public final com.revolut.kompot.navigable.vc.modal.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f93972p;

    public a(f stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = e.a(this, new e6e.a(27));
        this.f93972p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.o;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93972p;
    }
}
