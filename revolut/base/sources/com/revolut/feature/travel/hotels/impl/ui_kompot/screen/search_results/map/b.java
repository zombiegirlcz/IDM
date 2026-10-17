package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map;

import android.os.SystemClock;
import chj.p;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import e4k.m0;
import i9g.c;
import i9g.h0;
import i9g.i0;
import i9g.j0;
import i9g.u;
import ihm.f;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import lk0.g;
import mx0.q9;
import nyb.p0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import te0.w;
import ueg.d;
import ueg.f0;
import ueg.g0;
import ueg.q0;
import ueg.r0;
import ueg.s0;
import ueg.t0;
import ueg.v;
import vkm.j2;
import weg.m;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements f0 {

    @NotNull
    public static final q0 Companion = new q0();
    public final cf0.a A;
    public final e B;
    public final i0 C;
    public final p0 D;
    public final c E;
    public final meg.h F;
    public final fcg.e G;
    public final x H;
    public final f I;
    public long J;
    public q9 K;
    public final vii.b L;
    public int M;
    public a2 N;
    public a2 O;
    public boolean P;
    public String Q;
    public a2 R;
    public long S;
    public dgi.c T;
    public a2 U;
    public final Object V;
    public final y W;
    public final com.revolut.kompot.navigable.vc.modal.a X;
    public final TravelHotelsSearchResultsMapScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f94060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f94061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9g.y f94062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h0 f94063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p8g.d f94064t;
    public final j0 u;
    public final ueg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f94065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p8g.c f94066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final xcg.b f94067y;
    public final m z;

    public b(n stateMapper, TravelHotelsSearchResultsMapScreenContract$InputData inputData, d travelHotelsPagingInteractor, u travelHotelsFavoritesInteractor, i9g.y travelHotelsInventoryProvider, h0 travelSearchParamsInteractor, p8g.d travelHotelsLocationsInteractor, j0 smartSearchSharedState, ueg.a loyaltyInfoControllerExtension, j60.a expandableControllerExtension, p8g.c travelHotelsFeatureInteractor, xcg.b packageRatesDetailsDialogFactory, m analyticsContextMapper, cf0.a systemElapsedTimeProvider, e dateProvider, i0 travelHotelsSearchSessionInteractor, p0 revPointsUpgradeBannerInfoInteractor, c filtersInteractor, meg.h filtersReducer, fcg.e filtersRejectedDialogFactory, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsPagingInteractor, "travelHotelsPagingInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFavoritesInteractor, "travelHotelsFavoritesInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsInventoryProvider, "travelHotelsInventoryProvider");
        Intrinsics.checkNotNullParameter(travelSearchParamsInteractor, "travelSearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsLocationsInteractor, "travelHotelsLocationsInteractor");
        Intrinsics.checkNotNullParameter(smartSearchSharedState, "smartSearchSharedState");
        Intrinsics.checkNotNullParameter(loyaltyInfoControllerExtension, "loyaltyInfoControllerExtension");
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(packageRatesDetailsDialogFactory, "packageRatesDetailsDialogFactory");
        Intrinsics.checkNotNullParameter(analyticsContextMapper, "analyticsContextMapper");
        Intrinsics.checkNotNullParameter(systemElapsedTimeProvider, "systemElapsedTimeProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(travelHotelsSearchSessionInteractor, "travelHotelsSearchSessionInteractor");
        Intrinsics.checkNotNullParameter(revPointsUpgradeBannerInfoInteractor, "revPointsUpgradeBannerInfoInteractor");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        Intrinsics.checkNotNullParameter(filtersReducer, "filtersReducer");
        Intrinsics.checkNotNullParameter(filtersRejectedDialogFactory, "filtersRejectedDialogFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f94060p = travelHotelsPagingInteractor;
        this.f94061q = travelHotelsFavoritesInteractor;
        this.f94062r = travelHotelsInventoryProvider;
        this.f94063s = travelSearchParamsInteractor;
        this.f94064t = travelHotelsLocationsInteractor;
        this.u = smartSearchSharedState;
        this.v = loyaltyInfoControllerExtension;
        this.f94065w = expandableControllerExtension;
        this.f94066x = travelHotelsFeatureInteractor;
        this.f94067y = packageRatesDetailsDialogFactory;
        this.z = analyticsContextMapper;
        this.A = systemElapsedTimeProvider;
        this.B = dateProvider;
        this.C = travelHotelsSearchSessionInteractor;
        this.D = revPointsUpgradeBannerInfoInteractor;
        this.E = filtersInteractor;
        this.F = filtersReducer;
        this.G = filtersRejectedDialogFactory;
        this.H = deeplinkHandler;
        this.I = v0.a.d("create(...)");
        this.L = new vii.b();
        this.M = -1;
        this.V = w.y0(new u9a.b(15));
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.W = mra.d.a(this, new v(new g(f0Var), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new zfi.a(0), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), null, null, null, f0Var, ueg.i0.FILTERS_EXPANDED, ueg.u.ANCHORED, zhm.h0.f322473a, null, null, null, true, ueg.h0.IDLE, null, null, f0Var), stateMapper, null, true);
        this.X = hx7.e.a(this, new u7k.w(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b r22, java.lang.String r23, long r24, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b, java.lang.String, long, gim.c):java.lang.Object");
    }

    public static final Coordinates J2(b bVar, ah0.a aVar) {
        return new Coordinates(aVar.f4847a, aVar.f4848b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0082  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b.I1():void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.X;
    }

    public final void K2(HotelsProperty hotelsProperty) {
        Set set = (Set) ((v) ((j2) this.W.f22677a).getValue()).f279423b.getContent();
        if (set != null) {
            Continuation continuation = null;
            if (set.contains(h9g.e.b(hotelsProperty.f97981a))) {
                n2(new s0(this, hotelsProperty, continuation, 0), new whi.b(6));
            } else {
                n2(new s0(this, hotelsProperty, continuation, 1), new whi.b(6));
            }
        }
    }

    public final void L2() {
        a2 a2Var = this.U;
        if (a2Var == null || !a2Var.d()) {
            this.U = l2(new t0(0, this, null), new yi5.b(26));
        }
    }

    public final void M2(g0 direction) {
        ueg.i0 i0Var;
        Intrinsics.checkNotNullParameter(direction, "direction");
        getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (SystemClock.elapsedRealtime() - this.J < 500) {
            return;
        }
        this.J = jElapsedRealtime;
        int i = r0.f279415a[direction.ordinal()];
        if (i == 1) {
            i0Var = ueg.i0.FILTERS_EXPANDED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i0Var = ueg.i0.COLLAPSED;
        }
        H2(this.W, new ud3.n(i0Var, 15));
    }

    public final void N2() {
        a2 a2Var = this.U;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.U = null;
        ueg.e eVar = (ueg.e) this.f94060p;
        eVar.f.onNext(Unit.f186387a);
        eVar.f279383c.onNext(new g(zhm.f0.f322471a));
    }

    public final void O2(String str) {
        if (((jte.d) ((i9g.v) this.f94066x).f159842a).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c)) {
            long j2 = this.S + 1;
            this.S = j2;
            a2 a2Var = this.R;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.T = this.f94063s.d();
            this.Q = str;
            H2(this.W, new ueg.p0(1));
            N2();
            this.R = l2(new p(this, str, j2, (Continuation) null, 11), new m0(j2, this, 12));
        }
    }

    public final void P2() {
        this.G.getClass();
        l.a1(this, X1(fcg.e.a()), null, null, null, 7);
    }

    public final void Q2(String str, List list, boolean z) {
        if (z) {
            this.S++;
            a2 a2Var = this.R;
            if (a2Var != null) {
                a2Var.f(null);
            }
            this.R = null;
            N2();
        }
        this.T = this.f94063s.d();
        this.Q = str;
        H2(this.W, new amh.n(str, list, 14));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.W;
    }
}
