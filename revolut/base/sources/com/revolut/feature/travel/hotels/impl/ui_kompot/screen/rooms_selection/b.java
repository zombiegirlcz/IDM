package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import efm.r;
import hx7.e;
import i9g.b0;
import i9g.l;
import i9g.t;
import i9g.v;
import ieg.d0;
import ieg.m;
import ieg.p;
import ieg.s;
import ieg.u;
import java.time.LocalDate;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import p8g.c;
import rfm.f0;
import ufm.i;
import vkm.j2;
import xag.g;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements p {
    public final TravelHotelsRoomsSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f94018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f94019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p8g.b f94020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f94021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f94022t;
    public final g u;
    public final d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xdg.a f94023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f94024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f94025y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(n stateMapper, TravelHotelsRoomsSelectionScreenContract$InputData inputData, l draftInteractor, b0 travelHotelsPropertyInteractor, p8g.b travelHotelsDropoffSearchInteractor, f userInteractor, j60.a bottomExpandableDialogControllerExtension, g roomsSelectionSharedState, d0 selectionOptionsListProvider, xdg.a roomSelectionExtension, c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchInteractor, "travelHotelsDropoffSearchInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(roomsSelectionSharedState, "roomsSelectionSharedState");
        Intrinsics.checkNotNullParameter(selectionOptionsListProvider, "selectionOptionsListProvider");
        Intrinsics.checkNotNullParameter(roomSelectionExtension, "roomSelectionExtension");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.o = inputData;
        this.f94018p = draftInteractor;
        this.f94019q = travelHotelsPropertyInteractor;
        this.f94020r = travelHotelsDropoffSearchInteractor;
        this.f94021s = userInteractor;
        this.f94022t = bottomExpandableDialogControllerExtension;
        this.u = roomsSelectionSharedState;
        this.v = selectionOptionsListProvider;
        this.f94023w = roomSelectionExtension;
        this.f94024x = travelHotelsFeatureInteractor;
        this.f94025y = d.b(this, new m(0), stateMapper, null, false, 12);
        this.z = e.a(this, new i83.m(29));
    }

    @Override // yji.l
    public final void I1() {
        TravelHotelsRoomsSelectionScreenContract$InputData travelHotelsRoomsSelectionScreenContract$InputData = this.o;
        TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams = travelHotelsRoomsSelectionScreenContract$InputData.f94015a;
        TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams2 = travelHotelsRoomsSelectionScreenContract$InputData.f94015a;
        LocalDate localDate = travelHotelsRoomsSelectionParams.f93665c;
        LocalDate localDate2 = travelHotelsRoomsSelectionParams.d;
        List list = travelHotelsRoomsSelectionParams.e;
        Continuation continuation = null;
        String strF = list != null ? hx7.a.F(list) : null;
        if (!((v) this.f94024x).c() || localDate == null || localDate2 == null || strF == null) {
            sfm.b bVar = new sfm.b(this.f94018p.d(travelHotelsRoomsSelectionParams2.f93663a), new icc.c(new i9e.a(this, 20), 19), 1);
            Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
            yji.l.a1(this, rd0.e.b(bVar), null, null, new u(this, continuation, 0), 3);
        } else {
            yji.l.a1(this, rd0.e.b(ue0.e.p(this.f94018p.c(travelHotelsRoomsSelectionParams2.f93663a, travelHotelsRoomsSelectionParams2.f93664b, localDate, localDate2, travelHotelsRoomsSelectionParams2.e, null), h0.f322473a)), null, null, new u(this, continuation, 1), 3);
            r rVarHide = this.u.f303883a.hide();
            Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
            r rVarSwitchMap = rVarHide.switchMap(new icc.c(new dqd.a(this, localDate, localDate2, strF, 24), 23));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new u(this, continuation, 2), 3);
        }
    }

    public final f0 I2(HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection, BedOption bedOption) {
        efm.d0 iVar;
        i25.e eVar = new i25.e(hotelsPropertyRoomOccupancyRatesSelection, bedOption, 20);
        y yVar = this.f94025y;
        H2(yVar, eVar);
        Object content = ((m) ((j2) yVar.f22677a).getValue()).f160720a.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        afi.a aVar = (afi.a) content;
        pfm.a aVarV = ue0.e.v(((t) this.f94020r).a(aVar.f4101b.f97981a, aVar.f));
        if (((v) this.f94024x).c()) {
            iVar = this.f94018p.e(aVar);
        } else {
            efm.d0 d0VarFirstOrError = m70.a.g(this.f94021s.k(true), null, new i83.m(28), 1).firstOrError();
            icc.c cVar = new icc.c(new s(this, aVar, 0), 20);
            d0VarFirstOrError.getClass();
            iVar = new i(d0VarFirstOrError, cVar, 0);
        }
        f0 f0VarF = aVarV.f(iVar);
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94025y;
    }
}
