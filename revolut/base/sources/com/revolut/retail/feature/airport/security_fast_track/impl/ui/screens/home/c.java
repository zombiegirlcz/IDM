package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import hu1.h0;
import hui.a0;
import hui.s;
import hui.w;
import i4b.f;
import i7d.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.p;
import mra.d;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import uti.g;
import vkm.q;
import yji.l;
import zhm.f0;
import zsi.e;
import zsi.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements s {

    @NotNull
    private static final w Companion = new w();
    public boolean A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f98837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mti.a f98838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f98839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pti.k f98840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rui.a f98841t;
    public final g u;
    public final o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jvi.c f98842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AsftHomeScreenContract$InputData f98843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f98844y;
    public final vii.b z;

    public c(n stateMapper, k revPointsInteractor, e passesInteractor, mti.a airportsInteractor, i termsInteractor, pti.k configRepository, rui.a passCancelBookingSuccessDialogMapper, g productArticleParamsProvider, o helpWidgetControllerModelExtension, jvi.c passAvailabilityMapper, AsftHomeScreenContract$InputData inputData, f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(airportsInteractor, "airportsInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        Intrinsics.checkNotNullParameter(passCancelBookingSuccessDialogMapper, "passCancelBookingSuccessDialogMapper");
        Intrinsics.checkNotNullParameter(productArticleParamsProvider, "productArticleParamsProvider");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(passAvailabilityMapper, "passAvailabilityMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = revPointsInteractor;
        this.f98837p = passesInteractor;
        this.f98838q = airportsInteractor;
        this.f98839r = termsInteractor;
        this.f98840s = configRepository;
        this.f98841t = passCancelBookingSuccessDialogMapper;
        this.u = productArticleParamsProvider;
        this.v = helpWidgetControllerModelExtension;
        this.f98842w = passAvailabilityMapper;
        this.f98843x = inputData;
        this.f98844y = legalEntityContextProvider;
        this.z = new vii.b(w4l.i.f294643c);
        this.B = d.b(this, new hui.k(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), f0.f322471a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new hfb.d(this, 26));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.z, new hui.y(1, this, continuation)), null, null, new a0(1, this, continuation), 3);
        l.a1(this, pti.k.a(this.f98840s), null, null, new a0(2, this, continuation), 3);
        l.a1(this, this.f98844y.j(new md6.q(p.ASFT, false)), null, null, new a0(3, this, continuation), 3);
        l.a1(this, q.Q(q.q(new g4b.a0(this.B.B(new h0(10)), 18)), new hui.y(0, this, continuation)), null, null, new a0(0, this, continuation), 3);
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, rd0.e.b(this.o.c(true)), null, new a0(4, this, continuation), 3);
        l.b1(this, q.Q(this.z, new hui.y(2, this, continuation)), null, new a0(5, this, continuation), 3);
        AsftPass asftPass = this.f98843x.f98828a;
        if (asftPass == null || this.A || this.f98842w.a(asftPass) != ati.a.AVAILABLE_SOON) {
            return;
        }
        l.b1(this, this.B.B(new h0(9)), null, new a(this, asftPass, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
