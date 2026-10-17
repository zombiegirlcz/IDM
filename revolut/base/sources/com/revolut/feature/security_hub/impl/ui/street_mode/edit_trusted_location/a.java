package com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mvc.c;
import mvc.d;
import mvc.i;
import mvc.j;
import oki.h;
import wtc.g0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements i {
    public final g0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ovc.a f85652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f85653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85654r;

    public a(d inputData, j stateMapper, g0 streetModeInteractor, ovc.a removeLastTrustedLocationBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(removeLastTrustedLocationBottomSheetProvider, "removeLastTrustedLocationBottomSheetProvider");
        this.o = streetModeInteractor;
        this.f85652p = removeLastTrustedLocationBottomSheetProvider;
        this.f85653q = mra.d.b(this, new c(inputData.f209215a, inputData.f209216b), stateMapper, null, false, 12);
        this.f85654r = e.a(this, new g(this, 22));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85654r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85653q;
    }
}
