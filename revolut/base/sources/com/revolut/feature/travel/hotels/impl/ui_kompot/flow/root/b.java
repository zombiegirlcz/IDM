package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step;
import d8l.d;
import eub.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import y8a.g;
import yki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements yag.b {
    public final TravelHotelsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f93797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f93798q;

    public b(TravelHotelsFlowContract$InputData inputData, e revPointsCountryOptInPolicyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsCountryOptInPolicyInteractor, "revPointsCountryOptInPolicyInteractor");
        this.o = inputData;
        this.f93797p = revPointsCountryOptInPolicyInteractor;
        this.f93798q = d.a(this, new g(this, 3));
    }

    public static TravelHotelsFlowContract$Step I2(TravelHotelsFlowContract$InputData travelHotelsFlowContract$InputData) {
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.Home) {
            TravelHotelsFlowContract$InputData.Home home = (TravelHotelsFlowContract$InputData.Home) travelHotelsFlowContract$InputData;
            return new TravelHotelsFlowContract$Step.Home(home.f93765a, home.f93766b);
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.RoomDetails) {
            return new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.RoomDetails(((TravelHotelsFlowContract$InputData.RoomDetails) travelHotelsFlowContract$InputData).f93770a));
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.RoomsSelection) {
            return new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.RoomsSelection(((TravelHotelsFlowContract$InputData.RoomsSelection) travelHotelsFlowContract$InputData).f93771a));
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.SearchResults) {
            TravelHotelsFlowContract$InputData.SearchResults searchResults = (TravelHotelsFlowContract$InputData.SearchResults) travelHotelsFlowContract$InputData;
            return new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 25, searchResults.f93772a, searchResults.f93773b));
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.Checkout) {
            return new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Checkout(((TravelHotelsFlowContract$InputData.Checkout) travelHotelsFlowContract$InputData).f93764a));
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.Property) {
            TravelHotelsFlowContract$InputData.Property property = (TravelHotelsFlowContract$InputData.Property) travelHotelsFlowContract$InputData;
            return new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(property.f93767a, property.f93768b, property.f93769c, 18));
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.BookingDetails) {
            return new TravelHotelsFlowContract$Step.BookingDetails(((TravelHotelsFlowContract$InputData.BookingDetails) travelHotelsFlowContract$InputData).f93762a);
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.CampaignHub) {
            return new TravelHotelsFlowContract$Step.CampaignHub(((TravelHotelsFlowContract$InputData.CampaignHub) travelHotelsFlowContract$InputData).f93763a);
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.SuggestedExperiences) {
            return new TravelHotelsFlowContract$Step.SuggestedExperiences(((TravelHotelsFlowContract$InputData.SuggestedExperiences) travelHotelsFlowContract$InputData).f93774a);
        }
        if (travelHotelsFlowContract$InputData instanceof TravelHotelsFlowContract$InputData.ActiveBookings) {
            return TravelHotelsFlowContract$Step.ActiveBookings.f93775a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.j
    public final void M0() {
        l2(new y7i.h(this, null, 2), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f93798q;
    }
}
