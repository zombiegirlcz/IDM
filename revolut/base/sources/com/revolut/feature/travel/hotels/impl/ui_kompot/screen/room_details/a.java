package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreenContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.Image;
import com.revolut.kompot.common.ModalDestination;
import gaa.g;
import geg.i;
import hx7.e;
import i9g.l;
import i9g.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import p8g.c;
import vkm.j2;
import yi5.b;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements i {
    public final TravelHotelsRoomDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f94010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xdg.a f94011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f94012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f94013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94014t;

    public a(n stateMapper, TravelHotelsRoomDetailsScreenContract$InputData inputData, l travelHotelsBookingDraftInteractor, xdg.a roomSelectionExtension, c featureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsBookingDraftInteractor, "travelHotelsBookingDraftInteractor");
        Intrinsics.checkNotNullParameter(roomSelectionExtension, "roomSelectionExtension");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.o = inputData;
        this.f94010p = travelHotelsBookingDraftInteractor;
        this.f94011q = roomSelectionExtension;
        this.f94012r = featureInteractor;
        this.f94013s = d.b(this, new geg.d(inputData.f94008a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f94014t = e.a(this, new g75.i(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f94013s;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        String str = ((geg.d) j2Var.getValue()).f143287a.e;
        if (str != null) {
            Continuation continuation = null;
            if (!((v) this.f94012r).c()) {
                l2(new ga9.v(this, str, (Continuation) null, 19), new b(26));
                return;
            }
            yji.l.a1(this, rd0.e.n(rd0.e.b(this.f94010p.c(str, ((geg.d) j2Var2.getValue()).f143287a.f93659g, ((geg.d) j2Var2.getValue()).f143287a.f93660h, ((geg.d) j2Var2.getValue()).f143287a.i, ((geg.d) j2Var2.getValue()).f143287a.f93661j, ((geg.d) j2Var2.getValue()).f143287a.k)), h0.f322473a), null, null, new g(this, continuation, 16), 3);
        }
    }

    public final void I2() {
        ArrayList arrayList = ((geg.d) ((j2) this.f94013s.f22677a).getValue()).f143287a.f93658c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((Image) it8.next()).f98056c);
        }
        h.v2(this.f94014t, new TravelHotelsRoomDetailsScreenContract$ModalStep.GridGallery(arrayList2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94014t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94013s;
    }
}
