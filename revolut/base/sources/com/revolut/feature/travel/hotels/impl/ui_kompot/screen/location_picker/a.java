package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker;

import androidx.room.RxRoom;
import cli.g;
import cli.y;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import efm.r;
import f7l.c;
import fag.m0;
import fag.o0;
import i9g.a0;
import i9g.b0;
import i9g.h0;
import i9g.v;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import oki.h;
import p8g.d;
import skm.a2;
import tcg.f;
import tcg.n;
import w39.b;
import wli.x;
import yji.l;
import z55.w;
import z8g.s;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements n {
    public final TravelHotelsLocationPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f93939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0 f93940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f93941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f93942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f93943t;
    public final e u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f93944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f93945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f93946y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(cli.n stateMapper, TravelHotelsLocationPickerScreenContract$InputData inputData, d travelHotelsLocationsInteractor, h0 travelPropertySearchParamsInteractor, b0 travelHotelsPropertyInteractor, b locationInteractor, n60.a keyboardControllerExtension, e dateProvider, gte.a featureToggleInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsLocationsInteractor, "travelHotelsLocationsInteractor");
        Intrinsics.checkNotNullParameter(travelPropertySearchParamsInteractor, "travelPropertySearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f93939p = travelHotelsLocationsInteractor;
        this.f93940q = travelPropertySearchParamsInteractor;
        this.f93941r = travelHotelsPropertyInteractor;
        this.f93942s = locationInteractor;
        this.f93943t = keyboardControllerExtension;
        this.u = dateProvider;
        this.v = featureToggleInteractor;
        this.f93944w = deeplinkHandler;
        this.f93946y = mra.d.b(this, new f(0), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new ta8.a(this, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r5 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tcg.r
            if (r0 == 0) goto L13
            r0 = r6
            tcg.r r0 = (tcg.r) r0
            int r1 = r0.f269802w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269802w = r1
            goto L18
        L13:
            tcg.r r0 = new tcg.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269802w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L4a
        L36:
            yhm.o.b(r6)
            w39.b r6 = r5.f93942s
            z39.b r6 = (z39.b) r6
            ufm.c r6 = r6.b()
            r0.f269802w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4a
            goto L67
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6b
            r0.f269802w = r3
            sb4.i r6 = new sb4.i
            r2 = 0
            r3 = 18
            r6.<init>(r5, r2, r3)
            java.lang.Object r5 = r5.p2(r0, r6)
            if (r5 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L65:
            if (r5 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6b:
            com.revolut.kompot.navigable.vc.modal.a r5 = r5.z
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$ModalStep$LocationPermissionsRequest r6 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$ModalStep.LocationPermissionsRequest.f93938a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r5, r6, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a r4, com.revolut.core.ui_kit.delegates.RowDelegate.Model r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tcg.t
            if (r0 == 0) goto L13
            r0 = r6
            tcg.t r0 = (tcg.t) r0
            int r1 = r0.f269805x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269805x = r1
            goto L18
        L13:
            tcg.t r0 = new tcg.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269805x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_travel_hotels_models.property.search.LocationType r5 = r0.u
            yhm.o.b(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.u
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.LocationSearchItemPayload"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            oag.d r5 = (oag.d) r5
            com.revolut.feature_travel_hotels_models.location.HotelsLocation r5 = r5.f223616a
            com.revolut.feature_travel_hotels_models.property.search.LocationType r5 = ta6.a.X(r5)
            i9g.h0 r6 = r4.f93940q
            pfm.h r6 = r6.m(r5)
            r0.u = r5
            r0.f269805x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            tcg.i r6 = new tcg.i
            r6.<init>(r5)
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData r5 = r4.o
            boolean r5 = r5.f93937b
            if (r5 == 0) goto L63
            r4.B2()
            goto L66
        L63:
            r4.C2(r6)
        L66:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a r4, com.revolut.core.ui_kit.delegates.RowDelegate.Model r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tcg.u
            if (r0 == 0) goto L13
            r0 = r6
            tcg.u r0 = (tcg.u) r0
            int r1 = r0.f269807x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269807x = r1
            goto L18
        L13:
            tcg.u r0 = new tcg.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269807x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ffi.c r5 = r0.u
            yhm.o.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.u
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.RecentLocationSearchItemPayload"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            oag.f r5 = (oag.f) r5
            ffi.c r5 = r5.f223620a
            i9g.h0 r6 = r4.f93940q
            com.revolut.feature_travel_hotels_models.property.search.LocationType r2 = r5.f134810a
            pfm.h r6 = r6.m(r2)
            r0.u = r5
            r0.f269807x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            tcg.h r6 = new tcg.h
            r6.<init>(r5)
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData r5 = r4.o
            boolean r5 = r5.f93937b
            if (r5 == 0) goto L61
            r4.B2()
            goto L64
        L61:
            r4.C2(r6)
        L64:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.K2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a r4, com.revolut.core.ui_kit.delegates.RowDelegate.Model r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tcg.v
            if (r0 == 0) goto L13
            r0 = r6
            tcg.v r0 = (tcg.v) r0
            int r1 = r0.f269808w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269808w = r1
            goto L18
        L13:
            tcg.v r0 = new tcg.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269808w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.u
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.PropertySearchItemPayload"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            oag.e r5 = (oag.e) r5
            dgi.b r5 = r5.f223618a
            r0.f269808w = r3
            java.lang.Object r6 = r4.O2(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r5 = r6.f186385a
            com.revolut.feature_travel_hotels_models.property.search.PropertyType r5 = (com.revolut.feature_travel_hotels_models.property.search.PropertyType) r5
            java.lang.Object r6 = r6.f186386b
            com.revolut.feature_travel_hotels_models.property.HotelsProperty r6 = (com.revolut.feature_travel_hotels_models.property.HotelsProperty) r6
            tcg.k r0 = new tcg.k
            r0.<init>(r5, r6)
            r4.C2(r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.L2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a r5, com.revolut.core.ui_kit.delegates.RowDelegate.Model r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof tcg.w
            if (r0 == 0) goto L13
            r0 = r7
            tcg.w r0 = (tcg.w) r0
            int r1 = r0.f269809w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f269809w = r1
            goto L18
        L13:
            tcg.w r0 = new tcg.w
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f269809w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L74
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Object r6 = r6.u
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.RecentPropertySearchItemPayload"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            oag.g r6 = (oag.g) r6
            dgi.d r6 = r6.f223623a
            i9g.h0 r7 = r5.f93940q
            java.time.LocalDate r2 = r6.f
            java.time.LocalDate r4 = r6.f114682g
            pfm.h r2 = r7.l(r2, r4)
            java.lang.String r4 = r6.f114683h
            java.util.List r4 = v04.b.g(r4)
            pfm.h r7 = r7.k(r4)
            pfm.a r7 = r2.e(r7)
            java.lang.String r2 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.String r6 = r6.f114679a
            efm.r r6 = r5.N2(r6)
            efm.d0 r6 = r6.firstOrError()
            rfm.f0 r6 = r7.f(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f269809w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            com.revolut.feature_travel_hotels_models.property.HotelsProperty r7 = (com.revolut.feature_travel_hotels_models.property.HotelsProperty) r7
            tcg.j r6 = new tcg.j
            kotlin.jvm.internal.Intrinsics.h(r7)
            r6.<init>(r7)
            r5.C2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.M2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        r rVarJust;
        boolean zC = ((jte.d) this.v).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c);
        d dVar = this.f93939p;
        if (zC) {
            r map = RxRoom.createObservable(((a0) dVar).d.f133337a.f320131a, false, new String[]{"hotels_recent_smart_searches"}, new w(28)).map(new f9g.h(new c(15), 19));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            rVarJust = te0.w.f0(map);
        } else {
            rVarJust = r.just(f0.f322471a);
            Intrinsics.h(rVarJust);
        }
        a0 a0Var = (a0) dVar;
        z8g.r rVar = a0Var.f159777a.e;
        r map2 = RxRoom.createObservable(rVar.f320124a, false, new String[]{"hotels_recent_location_searches"}, new z2.a(rVar, 23)).map(new m0(new o0(4), 7));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarF0 = te0.w.f0(map2);
        s sVar = a0Var.f159777a.f;
        r map3 = RxRoom.createObservable(sVar.f320126a, false, new String[]{"hotels_recent_property_searches"}, new z2.a(sVar, 24)).map(new m0(new o0(5), 8));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        l.a1(this, rd0.e.b(te0.w.n(rVarF0, te0.w.f0(map3), rVarJust, a0Var.f159777a.B.f(Boolean.valueOf(((jte.d) ((v) a0Var.e).f159842a).c(TravelHotelsApi$Toggles.StaysTopDestinationsV2.f93620c)), false))), null, null, new t9h.b(this, null, 9), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final r N2(String str) {
        Boolean bool = Boolean.TRUE;
        h0 h0Var = this.f93940q;
        return m70.a.g(this.f93941r.a(new yfi.a(str, bool, h0Var.b(), h0Var.c(), hx7.a.F(h0Var.f159799a.a().d)), false), null, new tc6.b(1), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(dgi.b r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a.O2(dgi.b, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final g getState() {
        return this.f93946y;
    }
}
