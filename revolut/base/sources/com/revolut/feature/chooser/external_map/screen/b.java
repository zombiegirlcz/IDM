package com.revolut.feature.chooser.external_map.screen;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yi3.c;
import yi3.d;
import yi3.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements c {
    public final yi3.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q70.a f65921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f65922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zi3.c f65923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65924s;

    public b(yi3.b inputData, q70.a externalMapAppProvider, e externalMapAppsDialogMapper, zi3.c mapDeeplinkProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalMapAppProvider, "externalMapAppProvider");
        Intrinsics.checkNotNullParameter(externalMapAppsDialogMapper, "externalMapAppsDialogMapper");
        Intrinsics.checkNotNullParameter(mapDeeplinkProvider, "mapDeeplinkProvider");
        this.o = inputData;
        this.f65921p = externalMapAppProvider;
        this.f65922q = externalMapAppsDialogMapper;
        this.f65923r = mapDeeplinkProvider;
        this.f65924s = hx7.e.a(this, new d(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65924s;
    }
}
