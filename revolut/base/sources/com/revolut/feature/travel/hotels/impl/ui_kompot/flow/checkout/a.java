package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout;

import cli.g;
import cli.y;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import i90.b;
import i9g.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import tag.c;
import tag.l;
import tag.m;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final p8g.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f93719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f93720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f93721r;

    public a(TravelHotelsCheckoutFlowContract$InputData inputData, b uuidUtils, m saveStateDelegate, p8g.c featureInteractor, j0 smartSearchSharedState) {
        l lVar;
        l lVar2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(smartSearchSharedState, "smartSearchSharedState");
        this.o = featureInteractor;
        this.f93719p = smartSearchSharedState;
        String f93701a = inputData.getF93701a();
        this.f93720q = d.b(this, new TravelHotelsCheckoutFlowContract$DomainState(f93701a == null ? wp5.y.u(uuidUtils, "toString(...)") : f93701a), new a54.b(28), saveStateDelegate, false, 8);
        if (inputData instanceof TravelHotelsCheckoutFlowContract$InputData.SearchResults) {
            TravelHotelsCheckoutFlowContract$InputData.SearchResults searchResults = (TravelHotelsCheckoutFlowContract$InputData.SearchResults) inputData;
            String str = searchResults.e;
            boolean z = searchResults.d;
            boolean z3 = searchResults.f93703c;
            lVar2 = searchResults.f93702b ? new l(new TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsCheckoutFlowContract$Step.SearchResults(str, z3, z))) : new l(new TravelHotelsCheckoutFlowContract$Step.SearchResults(str, z3, z));
        } else if (inputData instanceof TravelHotelsCheckoutFlowContract$InputData.Property) {
            TravelHotelsCheckoutFlowContract$InputData.Property property = (TravelHotelsCheckoutFlowContract$InputData.Property) inputData;
            boolean z4 = property.e;
            boolean z6 = property.d;
            HotelsPropertyInputData hotelsPropertyInputData = property.f93696a;
            lVar2 = property.f93698c ? new l(new TravelHotelsCheckoutFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsCheckoutFlowContract$Step.Property(hotelsPropertyInputData, z6, z4))) : new l(new TravelHotelsCheckoutFlowContract$Step.Property(hotelsPropertyInputData, z6, z4));
        } else {
            if (inputData instanceof TravelHotelsCheckoutFlowContract$InputData.RoomDetails) {
                lVar = new l(new TravelHotelsCheckoutFlowContract$Step.RoomDetails(((TravelHotelsCheckoutFlowContract$InputData.RoomDetails) inputData).f93699a));
            } else if (inputData instanceof TravelHotelsCheckoutFlowContract$InputData.RoomsSelection) {
                lVar = new l(new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(((TravelHotelsCheckoutFlowContract$InputData.RoomsSelection) inputData).f93700a));
            } else if (inputData instanceof TravelHotelsCheckoutFlowContract$InputData.Checkout) {
                lVar = new l(new TravelHotelsCheckoutFlowContract$Step.Checkout(((TravelHotelsCheckoutFlowContract$InputData.Checkout) inputData).f93693a));
            } else {
                if (!(inputData instanceof TravelHotelsCheckoutFlowContract$InputData.DropOff)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavigableTravelHotelsDropoff navigableTravelHotelsDropoff = ((TravelHotelsCheckoutFlowContract$InputData.DropOff) inputData).f93694a;
                if (navigableTravelHotelsDropoff instanceof NavigableTravelHotelsDropoff.PropertyDetails) {
                    lVar = new l(I2(navigableTravelHotelsDropoff));
                } else if (navigableTravelHotelsDropoff instanceof NavigableTravelHotelsDropoff.Rooms) {
                    NavigableTravelHotelsDropoff.Rooms rooms = (NavigableTravelHotelsDropoff.Rooms) navigableTravelHotelsDropoff;
                    lVar = new l(new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(new TravelHotelsRoomsSelectionParams(J2(), rooms.getF(), rooms.getF97912g(), rooms.getF97913h(), rooms.getI())), u.c(new BackStackEntry(I2(navigableTravelHotelsDropoff), TransitionAnimation.SLIDE_END_TO_START.f98395a)));
                } else {
                    if (!(navigableTravelHotelsDropoff instanceof NavigableTravelHotelsDropoff.Checkout)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavigableTravelHotelsDropoff.Checkout checkout = (NavigableTravelHotelsDropoff.Checkout) navigableTravelHotelsDropoff;
                    TravelHotelsCheckoutFlowContract$Step.Checkout checkout2 = new TravelHotelsCheckoutFlowContract$Step.Checkout(new TravelHotelsCheckoutParams(J2(), checkout.f, checkout.f97901g, checkout.f97902h, checkout.i, checkout.f97903j));
                    TravelHotelsCheckoutFlowContract$Step.Property propertyI2 = I2(navigableTravelHotelsDropoff);
                    TransitionAnimation.SLIDE_END_TO_START slide_end_to_start = TransitionAnimation.SLIDE_END_TO_START.f98395a;
                    lVar = new l(checkout2, v.k(new BackStackEntry(propertyI2, slide_end_to_start), new BackStackEntry(new TravelHotelsCheckoutFlowContract$Step.RoomsSelection(new TravelHotelsRoomsSelectionParams(J2(), checkout.getF(), checkout.getF97912g(), checkout.getF97913h(), checkout.getI())), slide_end_to_start)));
                }
            }
            lVar2 = lVar;
        }
        this.f93721r = cp5.d.a(this, lVar2.f269339a, lVar2.f269340b, new ta8.a(this, 1));
    }

    public final TravelHotelsCheckoutFlowContract$Step.Property I2(NavigableTravelHotelsDropoff navigableTravelHotelsDropoff) {
        return new TravelHotelsCheckoutFlowContract$Step.Property(new HotelsPropertyInputData.BookablePreview(new HotelsPropertyPreview(navigableTravelHotelsDropoff.getF(), navigableTravelHotelsDropoff.getE()), navigableTravelHotelsDropoff.getF97912g(), navigableTravelHotelsDropoff.getF97913h(), navigableTravelHotelsDropoff.getI(), J2()), false, false);
    }

    public final String J2() {
        return ((TravelHotelsCheckoutFlowContract$DomainState) ((j2) this.f93720q.f22677a).getValue()).f93692a;
    }

    @Override // cli.z
    public final g getState() {
        return this.f93720q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f93721r;
    }
}
