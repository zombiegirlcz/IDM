package beg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import ieg.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends oki.h implements j {
    public final TravelHotelsRoomsSelectionAmendmentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fag.o f14845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xag.g f14846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f14847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9g.c f14848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f14849t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public s(t stateMapper, TravelHotelsRoomsSelectionAmendmentScreenContract$InputData inputData, fag.o bookingAmendmentRepository, xag.g roomsSelectionSharedState, d0 selectionOptionsListProvider, i9g.c filtersInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bookingAmendmentRepository, "bookingAmendmentRepository");
        Intrinsics.checkNotNullParameter(roomsSelectionSharedState, "roomsSelectionSharedState");
        Intrinsics.checkNotNullParameter(selectionOptionsListProvider, "selectionOptionsListProvider");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        this.o = inputData;
        this.f14845p = bookingAmendmentRepository;
        this.f14846q = roomsSelectionSharedState;
        this.f14847r = selectionOptionsListProvider;
        this.f14848s = filtersInteractor;
        this.f14849t = new vii.b();
        this.u = mra.d.b(this, new feg.e(0), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new bb2.t(18));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, yh5.b.d(vkm.q.Q(this.f14849t, new m(1, this, continuation)), rd0.e.b(this.f14848s.a())), null, null, new l(0, this, continuation), 3);
        efm.r rVarHide = this.f14846q.f303883a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        yji.l.a1(this, vkm.q.Q(rd0.e.b(rVarHide), new m(0, this, continuation)), null, null, new l(1, this, continuation), 3);
    }

    public final TravelHotelsRoomsInformation I2(cgi.o oVar) {
        BedOption bedOption = (BedOption) zhm.d0.d0(oVar.c().b());
        if (bedOption != null) {
            return new TravelHotelsRoomsInformation(oVar.d().getF98098a(), bedOption.f98087a, oVar.a().getF98115a(), v04.b.M(oVar.c().getF98112a()));
        }
        String str = this.o.f94001a;
        String f98098a = oVar.d().getF98098a();
        String f98115a = oVar.a().getF98115a();
        StringBuilder sbM = v0.a.m("Room should have at least one bed option. bookingId={", str, "}, roomId={", f98098a, "}, rateId={");
        sbM.append(f98115a);
        sbM.append("}");
        throw new IllegalStateException(sbM.toString().toString());
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
