package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import ang.f;
import cli.y;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qee.s;
import qr0.i;
import vq5.w;
import vvc.g;
import vvc.q;
import vvc.u;
import wtc.g0;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends h implements q {

    @NotNull
    public static final u Companion = new u();
    public final SetTrustedLocationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w39.b f85688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d49.a f85689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pvc.a f85690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g0 f85691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f85692t;
    public final buc.a u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f85693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85694x;

    public d(s stateMapper, SetTrustedLocationScreenContract$InputData inputData, w39.b locationInteractor, d49.a locationDistanceMeter, pvc.a selectedLocationInteractor, g0 streetModeInteractor, i msLatLngBoundsProvider, buc.a locationPermissionControllerProvider, f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(locationDistanceMeter, "locationDistanceMeter");
        Intrinsics.checkNotNullParameter(selectedLocationInteractor, "selectedLocationInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(msLatLngBoundsProvider, "msLatLngBoundsProvider");
        Intrinsics.checkNotNullParameter(locationPermissionControllerProvider, "locationPermissionControllerProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f85688p = locationInteractor;
        this.f85689q = locationDistanceMeter;
        this.f85690r = selectedLocationInteractor;
        this.f85691s = streetModeInteractor;
        this.f85692t = msLatLngBoundsProvider;
        this.u = locationPermissionControllerProvider;
        this.v = userInteractor;
        this.f85693w = mra.d.b(this, new g(0), stateMapper, null, false, 12);
        this.f85694x = e.a(this, new vvc.s(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        SetTrustedLocationScreenContract$InputData setTrustedLocationScreenContract$InputData = this.o;
        Continuation continuation = null;
        if (setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.EditTrustedLocation) {
            l2(new w(this, ((SetTrustedLocationScreenContract$InputData.EditTrustedLocation) setTrustedLocationScreenContract$InputData).f85681a.f85430c, continuation, 10), new yi5.b(26));
        } else if (!(setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.SetTrustedWifiLocation)) {
            if (!(setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.SetTrustedLocation)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new w(this, continuation, continuation, 10), new yi5.b(26));
        }
        l.a1(this, mo3.a.g(this.v.j(w4l.h.f294642c), null, null, 3), null, null, new vrl.d(this, continuation, 10), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85694x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        pvc.a aVar = this.f85690r;
        LocationDomain locationDomain = aVar.f240051a;
        aVar.f240051a = null;
        if (locationDomain != null) {
            H2(this.f85693w, new ch1.f(locationDomain, 3));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85693w;
    }
}
