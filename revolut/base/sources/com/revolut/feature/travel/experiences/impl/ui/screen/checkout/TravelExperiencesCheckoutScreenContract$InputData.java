package com.revolut.feature.travel.experiences.impl.ui.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceOptionSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.kompot.common.IOData$Input;
import io3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/checkout/TravelExperiencesCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f93049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f93050c;
    public final TravelExperienceAvailabilitySelection d;
    public final TravelExperiencesBookingContactDetails e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperienceSelectedLanguage f93051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelExperienceOptionSelection f93052h;
    public final List i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            TravelExperienceDatesSelection travelExperienceDatesSelection = (TravelExperienceDatesSelection) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = (TravelExperienceVisitorsSelection) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection = (TravelExperienceAvailabilitySelection) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = (TravelExperiencesBookingContactDetails) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(TravelExperiencesCheckoutScreenContract$InputData.class, parcel, arrayList2, iE2, 1);
            }
            TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = (TravelExperienceSelectedLanguage) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            TravelExperienceOptionSelection travelExperienceOptionSelection = (TravelExperienceOptionSelection) parcel.readParcelable(TravelExperiencesCheckoutScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(TravelExperiencesCheckoutScreenContract$InputData.class, parcel, arrayList3, iE, 1);
                }
                arrayList = arrayList3;
            }
            return new TravelExperiencesCheckoutScreenContract$InputData(dVar, travelExperienceDatesSelection, travelExperienceVisitorsSelection, travelExperienceAvailabilitySelection, travelExperiencesBookingContactDetails, arrayList2, travelExperienceSelectedLanguage, travelExperienceOptionSelection, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesCheckoutScreenContract$InputData[i];
        }
    }

    public TravelExperiencesCheckoutScreenContract$InputData(d userPocket, TravelExperienceDatesSelection dateSelection, TravelExperienceVisitorsSelection visitorsSelection, TravelExperienceAvailabilitySelection availabilitySelection, TravelExperiencesBookingContactDetails contactDetails, ArrayList userAnswersList, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, TravelExperienceOptionSelection optionSelection, List list) {
        Intrinsics.checkNotNullParameter(userPocket, "userPocket");
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(availabilitySelection, "availabilitySelection");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        this.f93048a = userPocket;
        this.f93049b = dateSelection;
        this.f93050c = visitorsSelection;
        this.d = availabilitySelection;
        this.e = contactDetails;
        this.f = userAnswersList;
        this.f93051g = travelExperienceSelectedLanguage;
        this.f93052h = optionSelection;
        this.i = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesCheckoutScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData = (TravelExperiencesCheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93048a, travelExperiencesCheckoutScreenContract$InputData.f93048a) && Intrinsics.f(this.f93049b, travelExperiencesCheckoutScreenContract$InputData.f93049b) && Intrinsics.f(this.f93050c, travelExperiencesCheckoutScreenContract$InputData.f93050c) && Intrinsics.f(this.d, travelExperiencesCheckoutScreenContract$InputData.d) && Intrinsics.f(this.e, travelExperiencesCheckoutScreenContract$InputData.e) && this.f.equals(travelExperiencesCheckoutScreenContract$InputData.f) && Intrinsics.f(this.f93051g, travelExperiencesCheckoutScreenContract$InputData.f93051g) && Intrinsics.f(this.f93052h, travelExperiencesCheckoutScreenContract$InputData.f93052h) && Intrinsics.f(this.i, travelExperiencesCheckoutScreenContract$InputData.i);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + p.a.e((this.f93049b.hashCode() + (this.f93048a.hashCode() * 31)) * 31, 31, this.f93050c.f92916a)) * 31)) * 31, 31);
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.f93051g;
        int iHashCode = (this.f93052h.hashCode() + ((iB + (travelExperienceSelectedLanguage == null ? 0 : travelExperienceSelectedLanguage.hashCode())) * 31)) * 31;
        List list = this.i;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93048a);
        dest.writeParcelable(this.f93049b, i);
        dest.writeParcelable(this.f93050c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f93051g, i);
        dest.writeParcelable(this.f93052h, i);
        List list = this.i;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
