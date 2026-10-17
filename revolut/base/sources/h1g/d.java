package h1g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import h30.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f148556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myf.a f148557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesBookingContactDetails f148558c;
    public final io3.d d;
    public final xi0.b e;
    public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f148559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelExperienceAvailabilitySelection f148560h;
    public final TravelExperienceOptionSelection i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f148561j;
    public final TravelExperienceSelectedLanguage k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f148562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TravelExperienceFiltersSelection f148563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TravelExperienceDatesSelection f148564n;

    public d(TravelExperienceDatesSelection datesSelection, myf.a aVar, TravelExperiencesBookingContactDetails contactDetails, io3.d userPocket, xi0.b baseCurrency, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy datesAvailabilityStrategy, TravelExperienceVisitorsSelection visitorsSelection, TravelExperienceAvailabilitySelection availabilitySelection, TravelExperienceOptionSelection optionsSelection, List userAnswersList, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, List additionalAnswersList, TravelExperienceFiltersSelection selectedFilters, TravelExperienceDatesSelection datesSelectionFilter) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(datesAvailabilityStrategy, "datesAvailabilityStrategy");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(optionsSelection, "optionsSelection");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(additionalAnswersList, "additionalAnswersList");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(datesSelectionFilter, "datesSelectionFilter");
        this.f148556a = datesSelection;
        this.f148557b = aVar;
        this.f148558c = contactDetails;
        this.d = userPocket;
        this.e = baseCurrency;
        this.f = datesAvailabilityStrategy;
        this.f148559g = visitorsSelection;
        this.f148560h = availabilitySelection;
        this.i = optionsSelection;
        this.f148561j = userAnswersList;
        this.k = travelExperienceSelectedLanguage;
        this.f148562l = additionalAnswersList;
        this.f148563m = selectedFilters;
        this.f148564n = datesSelectionFilter;
    }

    public static d a(d dVar, TravelExperienceDatesSelection travelExperienceDatesSelection, myf.a aVar, TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails, io3.d dVar2, xi0.b bVar, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.OnlyAvailable onlyAvailable, TravelExperienceVisitorsSelection travelExperienceVisitorsSelection, TravelExperienceAvailabilitySelection.Availability availability, TravelExperienceOptionSelection travelExperienceOptionSelection, List list, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, ArrayList arrayList, TravelExperienceDatesSelection travelExperienceDatesSelection2, int i) {
        TravelExperienceDatesSelection datesSelection = (i & 1) != 0 ? dVar.f148556a : travelExperienceDatesSelection;
        myf.a aVar2 = (i & 2) != 0 ? dVar.f148557b : aVar;
        TravelExperiencesBookingContactDetails contactDetails = (i & 4) != 0 ? dVar.f148558c : travelExperiencesBookingContactDetails;
        io3.d userPocket = (i & 8) != 0 ? dVar.d : dVar2;
        xi0.b baseCurrency = (i & 16) != 0 ? dVar.e : bVar;
        TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy datesAvailabilityStrategy = (i & 32) != 0 ? dVar.f : onlyAvailable;
        TravelExperienceVisitorsSelection visitorsSelection = (i & 64) != 0 ? dVar.f148559g : travelExperienceVisitorsSelection;
        TravelExperienceAvailabilitySelection availabilitySelection = (i & 128) != 0 ? dVar.f148560h : availability;
        TravelExperienceOptionSelection optionsSelection = (i & 256) != 0 ? dVar.i : travelExperienceOptionSelection;
        List userAnswersList = (i & 512) != 0 ? dVar.f148561j : list;
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage2 = (i & 1024) != 0 ? dVar.k : travelExperienceSelectedLanguage;
        List additionalAnswersList = (i & 2048) != 0 ? dVar.f148562l : arrayList;
        TravelExperienceFiltersSelection selectedFilters = dVar.f148563m;
        TravelExperienceDatesSelection datesSelectionFilter = (i & 8192) != 0 ? dVar.f148564n : travelExperienceDatesSelection2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(datesAvailabilityStrategy, "datesAvailabilityStrategy");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(optionsSelection, "optionsSelection");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(additionalAnswersList, "additionalAnswersList");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        Intrinsics.checkNotNullParameter(datesSelectionFilter, "datesSelectionFilter");
        return new d(datesSelection, aVar2, contactDetails, userPocket, baseCurrency, datesAvailabilityStrategy, visitorsSelection, availabilitySelection, optionsSelection, userAnswersList, travelExperienceSelectedLanguage2, additionalAnswersList, selectedFilters, datesSelectionFilter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f148556a, dVar.f148556a) && Intrinsics.f(this.f148557b, dVar.f148557b) && Intrinsics.f(this.f148558c, dVar.f148558c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f148559g, dVar.f148559g) && Intrinsics.f(this.f148560h, dVar.f148560h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f148561j, dVar.f148561j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f148562l, dVar.f148562l) && Intrinsics.f(this.f148563m, dVar.f148563m) && Intrinsics.f(this.f148564n, dVar.f148564n);
    }

    public final int hashCode() {
        int iHashCode = this.f148556a.hashCode() * 31;
        myf.a aVar = this.f148557b;
        int iD = p.a.d((this.i.hashCode() + ((this.f148560h.hashCode() + p.a.e((this.f.hashCode() + l.j(this.e, l.g(this.d, (this.f148558c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31), 31)) * 31, 31, this.f148559g.f92916a)) * 31)) * 31, 31, this.f148561j);
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.k;
        return this.f148564n.hashCode() + ((this.f148563m.hashCode() + p.a.d((iD + (travelExperienceSelectedLanguage != null ? travelExperienceSelectedLanguage.hashCode() : 0)) * 31, 31, this.f148562l)) * 31);
    }
}
