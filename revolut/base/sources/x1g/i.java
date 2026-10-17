package x1g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f302418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myf.a f302419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceDatesSelection f302420c;
    public final TravelExperienceVisitorsSelection d;
    public final TravelExperienceAvailabilitySelection e;
    public final TravelExperiencesBookingContactDetails f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f302421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelExperienceOptionSelection f302422h;
    public final TravelExperiencesPointsOption i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f302423j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f302424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f302425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f302426n;
    public final od0.i o;

    public i(io3.d userPocket, myf.a experience, TravelExperienceDatesSelection dateSelection, TravelExperienceVisitorsSelection visitorsSelection, TravelExperienceAvailabilitySelection availabilitySelection, TravelExperiencesBookingContactDetails contactDetails, List userAnswersList, TravelExperienceOptionSelection optionSelection, TravelExperiencesPointsOption travelExperiencesPointsOption, Boolean bool, boolean z, Data payment, Data quote, Data userCompany, od0.i revPointsOptInInfo) {
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        this.f302418a = userPocket;
        this.f302419b = experience;
        this.f302420c = dateSelection;
        this.d = visitorsSelection;
        this.e = availabilitySelection;
        this.f = contactDetails;
        this.f302421g = userAnswersList;
        this.f302422h = optionSelection;
        this.i = travelExperiencesPointsOption;
        this.f302423j = bool;
        this.k = z;
        this.f302424l = payment;
        this.f302425m = quote;
        this.f302426n = userCompany;
        this.o = revPointsOptInInfo;
    }

    public static i a(i iVar, TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails, ArrayList arrayList, TravelExperiencesPointsOption travelExperiencesPointsOption, Boolean bool, boolean z, Data data, Data data2, Data data3, od0.i iVar2, int i) {
        io3.d userPocket = iVar.f302418a;
        myf.a experience = iVar.f302419b;
        TravelExperienceDatesSelection dateSelection = iVar.f302420c;
        TravelExperienceVisitorsSelection visitorsSelection = iVar.d;
        TravelExperienceAvailabilitySelection availabilitySelection = iVar.e;
        TravelExperiencesBookingContactDetails contactDetails = (i & 32) != 0 ? iVar.f : travelExperiencesBookingContactDetails;
        List userAnswersList = (i & 64) != 0 ? iVar.f302421g : arrayList;
        TravelExperienceOptionSelection optionSelection = iVar.f302422h;
        TravelExperiencesPointsOption travelExperiencesPointsOption2 = (i & 256) != 0 ? iVar.i : travelExperiencesPointsOption;
        Boolean bool2 = (i & 512) != 0 ? iVar.f302423j : bool;
        boolean z3 = (i & 1024) != 0 ? iVar.k : z;
        Data payment = (i & 2048) != 0 ? iVar.f302424l : data;
        Data quote = (i & 4096) != 0 ? iVar.f302425m : data2;
        Data userCompany = (i & 8192) != 0 ? iVar.f302426n : data3;
        od0.i revPointsOptInInfo = (i & 16384) != 0 ? iVar.o : iVar2;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(revPointsOptInInfo, "revPointsOptInInfo");
        return new i(userPocket, experience, dateSelection, visitorsSelection, availabilitySelection, contactDetails, userAnswersList, optionSelection, travelExperiencesPointsOption2, bool2, z3, payment, quote, userCompany, revPointsOptInInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f302418a, iVar.f302418a) && Intrinsics.f(this.f302419b, iVar.f302419b) && Intrinsics.f(this.f302420c, iVar.f302420c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f302421g, iVar.f302421g) && Intrinsics.f(this.f302422h, iVar.f302422h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f302423j, iVar.f302423j) && this.k == iVar.k && Intrinsics.f(this.f302424l, iVar.f302424l) && Intrinsics.f(this.f302425m, iVar.f302425m) && Intrinsics.f(this.f302426n, iVar.f302426n) && Intrinsics.f(this.o, iVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f302422h.hashCode() + p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.e((this.f302420c.hashCode() + ((this.f302419b.hashCode() + (this.f302418a.hashCode() * 31)) * 31)) * 31, 31, this.d.f92916a)) * 31)) * 31, 31, this.f302421g)) * 31;
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.i;
        int iHashCode2 = (iHashCode + (travelExperiencesPointsOption == null ? 0 : travelExperiencesPointsOption.hashCode())) * 31;
        Boolean bool = this.f302423j;
        return this.o.hashCode() + kii.e.c(this.f302426n, kii.e.c(this.f302425m, kii.e.c(this.f302424l, j6.a.c((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.k), 31), 31), 31);
    }
}
