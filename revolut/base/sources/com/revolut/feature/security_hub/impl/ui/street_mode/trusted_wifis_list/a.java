package com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tb4.t;
import w39.b;
import wtc.g0;
import zr5.k;
import zvc.f;
import zvc.i;
import zvc.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements f {

    @NotNull
    public static final i Companion = new i();
    public final g0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f85702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f85704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y80.a f85705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s70.a f85706t;
    public final buc.i u;
    public final buc.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ovc.a f85707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f85708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85709y;

    public a(m stateMapper, g0 streetModeInteractor, t connectedWifiInteractor, b locationInteractor, com.revolut.kompot.navigable.a controller, y80.a permissionProvider, s70.a intentProvider, buc.i wifiSettingsIntentProvider, buc.h trustedWifiLocationErrorDialogProvider, ovc.a removeLastTrustedLocationBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(connectedWifiInteractor, "connectedWifiInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(wifiSettingsIntentProvider, "wifiSettingsIntentProvider");
        Intrinsics.checkNotNullParameter(trustedWifiLocationErrorDialogProvider, "trustedWifiLocationErrorDialogProvider");
        Intrinsics.checkNotNullParameter(removeLastTrustedLocationBottomSheetProvider, "removeLastTrustedLocationBottomSheetProvider");
        this.o = streetModeInteractor;
        this.f85702p = connectedWifiInteractor;
        this.f85703q = locationInteractor;
        this.f85704r = controller;
        this.f85705s = permissionProvider;
        this.f85706t = intentProvider;
        this.u = wifiSettingsIntentProvider;
        this.v = trustedWifiLocationErrorDialogProvider;
        this.f85707w = removeLastTrustedLocationBottomSheetProvider;
        this.f85708x = d.b(this, new zvc.d(0), stateMapper, null, false, 12);
        this.f85709y = e.a(this, new zo2.h(this, 20));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85709y;
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new k(this, null, 10), new whi.b(6));
    }

    @Override // cli.z
    public final g getState() {
        return this.f85708x;
    }
}
