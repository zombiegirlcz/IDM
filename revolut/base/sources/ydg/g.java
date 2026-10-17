package ydg;

import cgi.k;
import cgi.p;
import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.common.TravelHotelsRoomDetailsScreenContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.Image;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import y4f.o;
import ybh.a0;
import yji.l;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends h implements f {
    public final TravelHotelsRoomDetailsAmendmentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9g.h f312694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f312695q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f312696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f312697s;

    public g(aeg.b stateMapper, TravelHotelsRoomDetailsAmendmentScreenContract$InputData inputData, i9g.h bookingAmendmentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bookingAmendmentInteractor, "bookingAmendmentInteractor");
        this.o = inputData;
        this.f312694p = bookingAmendmentInteractor;
        this.f312695q = new vii.b();
        this.f312696r = mra.d.b(this, new aeg.c(inputData.e, 1), stateMapper, null, false, 12);
        this.f312697s = hx7.e.a(this, new y8a.g(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(nim.a.v(q.Q(this.f312695q, new o(continuation, this, 12)), new a0(28)), h0.f322473a), null, null, new y83.d(this, continuation, 15), 3);
    }

    public final void I2() {
        cgi.o oVarB;
        p pVarD;
        k kVar = (k) ((aeg.c) ((j2) this.f312696r.f22677a).getValue()).f3577a.getContent();
        if (kVar == null || (oVarB = kVar.b()) == null || (pVarD = oVarB.d()) == null) {
            return;
        }
        List listJ = pVarD.j();
        ArrayList arrayList = new ArrayList(w.t(listJ, 10));
        Iterator it8 = listJ.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Image) it8.next()).f98056c);
        }
        h.v2(this.f312697s, new TravelHotelsRoomDetailsScreenContract$ModalStep.GridGallery(arrayList), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f312697s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312696r;
    }
}
