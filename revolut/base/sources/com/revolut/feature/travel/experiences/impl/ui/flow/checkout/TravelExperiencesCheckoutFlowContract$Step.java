package com.revolut.feature.travel.experiences.impl.ui.flow.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.kompot.navigable.flow.FlowStep;
import io3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DatesSelection", "Details", "VisitorsSelection", "Options", "VisitorsDetails", "AdditionalDetails", "PickupDetails", "Checkout", "Search", "DestinationDiscovery", "SearchResults", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$AdditionalDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$DatesSelection;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$DestinationDiscovery;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Details;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Options;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$PickupDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Search;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$VisitorsDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$VisitorsSelection;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesCheckoutFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$AdditionalDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalDetails extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f92940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesBookingContactDetails f92941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f92942c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(AdditionalDetails.class, parcel, arrayList, iE2, 1);
                }
                TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = (TravelExperiencesBookingContactDetails) parcel.readParcelable(AdditionalDetails.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE3 = 0;
                while (iE3 != i2) {
                    iE3 = j6.a.e(AdditionalDetails.class, parcel, arrayList2, iE3, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = j6.a.e(AdditionalDetails.class, parcel, arrayList3, iE, 1);
                }
                return new AdditionalDetails(arrayList, travelExperiencesBookingContactDetails, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalDetails[i];
            }
        }

        public AdditionalDetails(ArrayList questions, TravelExperiencesBookingContactDetails contactDetails, ArrayList userAnswersList, ArrayList languages) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
            Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
            Intrinsics.checkNotNullParameter(languages, "languages");
            this.f92940a = questions;
            this.f92941b = contactDetails;
            this.f92942c = userAnswersList;
            this.d = languages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalDetails)) {
                return false;
            }
            AdditionalDetails additionalDetails = (AdditionalDetails) obj2;
            return this.f92940a.equals(additionalDetails.f92940a) && Intrinsics.f(this.f92941b, additionalDetails.f92941b) && this.f92942c.equals(additionalDetails.f92942c) && this.d.equals(additionalDetails.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92942c, (this.f92941b.hashCode() + (this.f92940a.hashCode() * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f92940a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f92941b, i);
            Iterator itY2 = j6.a.y(this.f92942c, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
            Iterator itY3 = j6.a.y(this.d, dest);
            while (itY3.hasNext()) {
                dest.writeParcelable((Parcelable) itY3.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Checkout;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f92944b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(Checkout.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Checkout(dVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(d pocket, List list) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f92943a = pocket;
            this.f92944b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f92943a, checkout.f92943a) && Intrinsics.f(this.f92944b, checkout.f92944b);
        }

        public final int hashCode() {
            int iHashCode = this.f92943a.hashCode() * 31;
            List list = this.f92944b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92943a);
            List list = this.f92944b;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$DatesSelection;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatesSelection extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DatesSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy f92946b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatesSelection((TravelExperienceDatesSelection) parcel.readParcelable(DatesSelection.class.getClassLoader()), (TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy) parcel.readParcelable(DatesSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatesSelection[i];
            }
        }

        public DatesSelection(TravelExperienceDatesSelection datesSelection, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy availabilityStrategy) {
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(availabilityStrategy, "availabilityStrategy");
            this.f92945a = datesSelection;
            this.f92946b = availabilityStrategy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatesSelection)) {
                return false;
            }
            DatesSelection datesSelection = (DatesSelection) obj2;
            return Intrinsics.f(this.f92945a, datesSelection.f92945a) && Intrinsics.f(this.f92946b, datesSelection.f92946b);
        }

        public final int hashCode() {
            return this.f92946b.hashCode() + (this.f92945a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92945a, i);
            dest.writeParcelable(this.f92946b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$DestinationDiscovery;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DestinationDiscovery extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DestinationDiscovery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92948b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DestinationDiscovery(((LocationId.DestinationId) parcel.readParcelable(DestinationDiscovery.class.getClassLoader())).f92881a, (TravelExperienceDatesSelection) parcel.readParcelable(DestinationDiscovery.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationDiscovery[i];
            }
        }

        public DestinationDiscovery(String destinationId, TravelExperienceDatesSelection datesSelection) {
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92947a = destinationId;
            this.f92948b = datesSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DestinationDiscovery)) {
                return false;
            }
            DestinationDiscovery destinationDiscovery = (DestinationDiscovery) obj2;
            return Intrinsics.f(this.f92947a, destinationDiscovery.f92947a) && Intrinsics.f(this.f92948b, destinationDiscovery.f92948b);
        }

        public final int hashCode() {
            return this.f92948b.hashCode() + (this.f92947a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new LocationId.DestinationId(this.f92947a), i);
            dest.writeParcelable(this.f92948b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Details;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperiencePreview f92951c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new Details((TravelExperiencePreview) parcel.readParcelable(Details.class.getClassLoader()), (TravelExperienceDatesSelection) parcel.readParcelable(Details.class.getClassLoader()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(TravelExperiencePreview travelExperiencePreview, TravelExperienceDatesSelection datesSelection, String experienceId) {
            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92949a = experienceId;
            this.f92950b = datesSelection;
            this.f92951c = travelExperiencePreview;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f92949a, details.f92949a) && Intrinsics.f(this.f92950b, details.f92950b) && Intrinsics.f(this.f92951c, details.f92951c);
        }

        public final int hashCode() {
            int iHashCode = (this.f92950b.hashCode() + (this.f92949a.hashCode() * 31)) * 31;
            TravelExperiencePreview travelExperiencePreview = this.f92951c;
            return iHashCode + (travelExperiencePreview == null ? 0 : travelExperiencePreview.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92949a);
            dest.writeParcelable(this.f92950b, i);
            dest.writeParcelable(this.f92951c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Options;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Options extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Options> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceVisitorsSelection f92953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy f92954c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options((TravelExperienceDatesSelection) parcel.readParcelable(Options.class.getClassLoader()), (TravelExperienceVisitorsSelection) parcel.readParcelable(Options.class.getClassLoader()), (TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy) parcel.readParcelable(Options.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options(TravelExperienceDatesSelection datesSelection, TravelExperienceVisitorsSelection visitorsSelection, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy availabilityStrategy) {
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
            Intrinsics.checkNotNullParameter(availabilityStrategy, "availabilityStrategy");
            this.f92952a = datesSelection;
            this.f92953b = visitorsSelection;
            this.f92954c = availabilityStrategy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Options)) {
                return false;
            }
            Options options = (Options) obj2;
            return Intrinsics.f(this.f92952a, options.f92952a) && Intrinsics.f(this.f92953b, options.f92953b) && Intrinsics.f(this.f92954c, options.f92954c);
        }

        public final int hashCode() {
            return this.f92954c.hashCode() + p.a.e(this.f92952a.hashCode() * 31, 31, this.f92953b.f92916a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92952a, i);
            dest.writeParcelable(this.f92953b, i);
            dest.writeParcelable(this.f92954c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$PickupDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PickupDetails extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PickupDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f92956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceSelectedLanguage f92957c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(PickupDetails.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(PickupDetails.class, parcel, arrayList2, iE, 1);
                }
                return new PickupDetails(arrayList, arrayList2, (TravelExperienceSelectedLanguage) parcel.readParcelable(PickupDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PickupDetails[i];
            }
        }

        public PickupDetails(List questions, List userAnswersList, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
            this.f92955a = questions;
            this.f92956b = userAnswersList;
            this.f92957c = travelExperienceSelectedLanguage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PickupDetails)) {
                return false;
            }
            PickupDetails pickupDetails = (PickupDetails) obj2;
            return Intrinsics.f(this.f92955a, pickupDetails.f92955a) && Intrinsics.f(this.f92956b, pickupDetails.f92956b) && Intrinsics.f(this.f92957c, pickupDetails.f92957c);
        }

        public final int hashCode() {
            int iD = p.a.d(this.f92955a.hashCode() * 31, 31, this.f92956b);
            TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.f92957c;
            return iD + (travelExperienceSelectedLanguage == null ? 0 : travelExperienceSelectedLanguage.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f92955a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f92956b, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            dest.writeParcelable(this.f92957c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$Search;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Search extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceFiltersSelection f92958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92959b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search((TravelExperienceFiltersSelection) parcel.readParcelable(Search.class.getClassLoader()), (TravelExperienceDatesSelection) parcel.readParcelable(Search.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        public Search() {
            this((TravelExperienceDatesSelection) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Search)) {
                return false;
            }
            Search search = (Search) obj2;
            return Intrinsics.f(this.f92958a, search.f92958a) && Intrinsics.f(this.f92959b, search.f92959b);
        }

        public final int hashCode() {
            int iHashCode = this.f92958a.hashCode() * 31;
            TravelExperienceDatesSelection travelExperienceDatesSelection = this.f92959b;
            return iHashCode + (travelExperienceDatesSelection == null ? 0 : travelExperienceDatesSelection.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92958a, i);
            dest.writeParcelable(this.f92959b, i);
        }

        public Search(TravelExperienceFiltersSelection filtersSelection, TravelExperienceDatesSelection travelExperienceDatesSelection) {
            Intrinsics.checkNotNullParameter(filtersSelection, "filtersSelection");
            this.f92958a = filtersSelection;
            this.f92959b = travelExperienceDatesSelection;
        }

        public /* synthetic */ Search(TravelExperienceDatesSelection travelExperienceDatesSelection, int i) {
            this(new TravelExperienceFiltersSelection(31, null), (i & 2) != 0 ? null : travelExperienceDatesSelection);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$VisitorsDetails;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VisitorsDetails extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VisitorsDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceVisitorsSelection f92970b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(VisitorsDetails.class, parcel, arrayList, iE, 1);
                }
                return new VisitorsDetails(arrayList, (TravelExperienceVisitorsSelection) parcel.readParcelable(VisitorsDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VisitorsDetails[i];
            }
        }

        public VisitorsDetails(List questions, TravelExperienceVisitorsSelection visitorsSelection) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
            this.f92969a = questions;
            this.f92970b = visitorsSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VisitorsDetails)) {
                return false;
            }
            VisitorsDetails visitorsDetails = (VisitorsDetails) obj2;
            return Intrinsics.f(this.f92969a, visitorsDetails.f92969a) && Intrinsics.f(this.f92970b, visitorsDetails.f92970b);
        }

        public final int hashCode() {
            return this.f92970b.f92916a.hashCode() + (this.f92969a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f92969a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f92970b, i);
        }
    }

    private TravelExperiencesCheckoutFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$VisitorsSelection;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VisitorsSelection extends TravelExperiencesCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VisitorsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceVisitorsSelection f92971a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VisitorsSelection((TravelExperienceVisitorsSelection) parcel.readParcelable(VisitorsSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VisitorsSelection[i];
            }
        }

        public VisitorsSelection(TravelExperienceVisitorsSelection travelExperienceVisitorsSelection) {
            this.f92971a = travelExperienceVisitorsSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VisitorsSelection) && Intrinsics.f(this.f92971a, ((VisitorsSelection) obj2).f92971a);
        }

        public final int hashCode() {
            TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = this.f92971a;
            if (travelExperienceVisitorsSelection == null) {
                return 0;
            }
            return travelExperienceVisitorsSelection.f92916a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92971a, i);
        }

        public VisitorsSelection() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step;", "<init>", "()V", "Destination", "Attraction", "PreciseLocation", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$Attraction;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$Destination;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$PreciseLocation;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SearchResults extends TravelExperiencesCheckoutFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$PreciseLocation;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PreciseLocation extends SearchResults {

            @NotNull
            public static final Parcelable.Creator<PreciseLocation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Coordinates f92966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TravelExperienceDatesSelection f92967b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TravelExperienceFiltersSelection f92968c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PreciseLocation((Coordinates) parcel.readParcelable(PreciseLocation.class.getClassLoader()), (TravelExperienceDatesSelection) parcel.readParcelable(PreciseLocation.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(PreciseLocation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PreciseLocation[i];
                }
            }

            public PreciseLocation(Coordinates coordinates, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection filtersSelection) {
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
                Intrinsics.checkNotNullParameter(filtersSelection, "filtersSelection");
                this.f92966a = coordinates;
                this.f92967b = datesSelection;
                this.f92968c = filtersSelection;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PreciseLocation)) {
                    return false;
                }
                PreciseLocation preciseLocation = (PreciseLocation) obj2;
                return Intrinsics.f(this.f92966a, preciseLocation.f92966a) && Intrinsics.f(this.f92967b, preciseLocation.f92967b) && Intrinsics.f(this.f92968c, preciseLocation.f92968c);
            }

            public final int hashCode() {
                return this.f92968c.hashCode() + ((this.f92967b.hashCode() + (this.f92966a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f92966a, i);
                dest.writeParcelable(this.f92967b, i);
                dest.writeParcelable(this.f92968c, i);
            }
        }

        private SearchResults() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$Attraction;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Attraction extends SearchResults {

            @NotNull
            public static final Parcelable.Creator<Attraction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f92960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f92961b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TravelExperienceDatesSelection f92962c;
            public final TravelExperienceFiltersSelection d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Attraction(((LocationId.AttractionId) parcel.readParcelable(Attraction.class.getClassLoader())).f92880a, parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(Attraction.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(Attraction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Attraction[i];
                }
            }

            public Attraction(String attractionId, String str, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection filtersSelection) {
                Intrinsics.checkNotNullParameter(attractionId, "attractionId");
                Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
                Intrinsics.checkNotNullParameter(filtersSelection, "filtersSelection");
                this.f92960a = attractionId;
                this.f92961b = str;
                this.f92962c = datesSelection;
                this.d = filtersSelection;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Attraction)) {
                    return false;
                }
                Attraction attraction = (Attraction) obj2;
                return Intrinsics.f(this.f92960a, attraction.f92960a) && Intrinsics.f(this.f92961b, attraction.f92961b) && Intrinsics.f(this.f92962c, attraction.f92962c) && Intrinsics.f(this.d, attraction.d);
            }

            public final int hashCode() {
                int iHashCode = this.f92960a.hashCode() * 31;
                String str = this.f92961b;
                return this.d.hashCode() + ((this.f92962c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(new LocationId.AttractionId(this.f92960a), i);
                dest.writeString(this.f92961b);
                dest.writeParcelable(this.f92962c, i);
                dest.writeParcelable(this.d, i);
            }

            public /* synthetic */ Attraction(String str, String str2, TravelExperienceDatesSelection travelExperienceDatesSelection) {
                this(str, str2, travelExperienceDatesSelection, new TravelExperienceFiltersSelection(31, null));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults$Destination;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/checkout/TravelExperiencesCheckoutFlowContract$Step$SearchResults;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends SearchResults {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f92963a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f92964b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TravelExperienceDatesSelection f92965c;
            public final TravelExperienceFiltersSelection d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(((LocationId.DestinationId) parcel.readParcelable(Destination.class.getClassLoader())).f92881a, parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(Destination.class.getClassLoader()), (TravelExperienceFiltersSelection) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(String destinationId, String str, TravelExperienceDatesSelection datesSelection, TravelExperienceFiltersSelection filtersSelection) {
                Intrinsics.checkNotNullParameter(destinationId, "destinationId");
                Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
                Intrinsics.checkNotNullParameter(filtersSelection, "filtersSelection");
                this.f92963a = destinationId;
                this.f92964b = str;
                this.f92965c = datesSelection;
                this.d = filtersSelection;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f92963a, destination.f92963a) && Intrinsics.f(this.f92964b, destination.f92964b) && Intrinsics.f(this.f92965c, destination.f92965c) && Intrinsics.f(this.d, destination.d);
            }

            public final int hashCode() {
                int iHashCode = this.f92963a.hashCode() * 31;
                String str = this.f92964b;
                return this.d.hashCode() + ((this.f92965c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(new LocationId.DestinationId(this.f92963a), i);
                dest.writeString(this.f92964b);
                dest.writeParcelable(this.f92965c, i);
                dest.writeParcelable(this.d, i);
            }

            public /* synthetic */ Destination(String str, String str2, TravelExperienceDatesSelection travelExperienceDatesSelection) {
                this(str, str2, travelExperienceDatesSelection, new TravelExperienceFiltersSelection(31, null));
            }
        }
    }
}
