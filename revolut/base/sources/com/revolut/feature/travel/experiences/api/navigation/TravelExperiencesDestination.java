package com.revolut.feature.travel.experiences.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0007\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "Home", "ExperienceDetails", "BookingDetails", "ExperiencesSearchResults", "ExperiencesDestinationDiscovery", "ExperiencesSearch", "ActiveBookings", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$BookingDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperienceDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesDestinationDiscovery;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesSearch;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesSearchResults;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$Home;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveBookings extends TravelExperiencesDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ActiveBookings f92919b = new ActiveBookings(0);

        @NotNull
        public static final Parcelable.Creator<ActiveBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveBookings.f92919b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveBookings[i];
            }
        }

        private ActiveBookings() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$BookingDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingDetails extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<BookingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92920b;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BookingDetails(String bookingId) {
            super(0);
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f92920b = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BookingDetails) && Intrinsics.f(this.f92920b, ((BookingDetails) obj2).f92920b);
        }

        public final int hashCode() {
            return this.f92920b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92920b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperienceDetails;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperienceDetails extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<ExperienceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransitionAnimation f92922c;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExperienceDetails(parcel.readString(), (TransitionAnimation) parcel.readParcelable(ExperienceDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperienceDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperienceDetails(String experienceId, TransitionAnimation transitionAnimation) {
            super(0);
            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
            this.f92921b = experienceId;
            this.f92922c = transitionAnimation;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF92928b() {
            return this.f92922c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExperienceDetails)) {
                return false;
            }
            ExperienceDetails experienceDetails = (ExperienceDetails) obj2;
            return Intrinsics.f(this.f92921b, experienceDetails.f92921b) && Intrinsics.f(this.f92922c, experienceDetails.f92922c);
        }

        public final int hashCode() {
            int iHashCode = this.f92921b.hashCode() * 31;
            TransitionAnimation transitionAnimation = this.f92922c;
            return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92921b);
            dest.writeParcelable(this.f92922c, i);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesDestinationDiscovery;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperiencesDestinationDiscovery extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<ExperiencesDestinationDiscovery> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92924c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExperiencesDestinationDiscovery(parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(ExperiencesDestinationDiscovery.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperiencesDestinationDiscovery[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperiencesDestinationDiscovery(String destinationId, TravelExperienceDatesSelection datesSelection) {
            super(0);
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92923b = destinationId;
            this.f92924c = datesSelection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TravelExperienceDatesSelection getF92924c() {
            return this.f92924c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF92923b() {
            return this.f92923b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExperiencesDestinationDiscovery)) {
                return false;
            }
            ExperiencesDestinationDiscovery experiencesDestinationDiscovery = (ExperiencesDestinationDiscovery) obj2;
            return Intrinsics.f(this.f92923b, experiencesDestinationDiscovery.f92923b) && Intrinsics.f(this.f92924c, experiencesDestinationDiscovery.f92924c);
        }

        public final int hashCode() {
            return this.f92924c.hashCode() + (this.f92923b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92923b);
            dest.writeParcelable(this.f92924c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesSearch;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperiencesSearch extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<ExperiencesSearch> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92925b;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExperiencesSearch((TravelExperienceDatesSelection) parcel.readParcelable(ExperiencesSearch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperiencesSearch[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperiencesSearch(TravelExperienceDatesSelection datesSelection) {
            super(0);
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92925b = datesSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExperiencesSearch) && Intrinsics.f(this.f92925b, ((ExperiencesSearch) obj2).f92925b);
        }

        public final int hashCode() {
            return this.f92925b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92925b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$Home;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransitionAnimation f92928b;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((TransitionAnimation) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home() {
            this(null);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF92928b() {
            return this.f92928b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f92928b, ((Home) obj2).f92928b);
        }

        public final int hashCode() {
            TransitionAnimation transitionAnimation = this.f92928b;
            if (transitionAnimation == null) {
                return 0;
            }
            return transitionAnimation.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92928b, i);
        }

        public Home(TransitionAnimation transitionAnimation) {
            super(0);
            this.f92928b = transitionAnimation;
        }
    }

    public /* synthetic */ TravelExperiencesDestination(int i) {
        this();
    }

    private TravelExperiencesDestination() {
        super(IOData$EmptyInput.f98299a);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination$ExperiencesSearchResults;", "Lcom/revolut/feature/travel/experiences/api/navigation/TravelExperiencesDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperiencesSearchResults extends TravelExperiencesDestination {

        @NotNull
        public static final Parcelable.Creator<ExperiencesSearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92927c;
        public final TravelExperienceDatesSelection d;
        public final Set e;

        /* JADX INFO: loaded from: classes9.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                TravelExperienceDatesSelection travelExperienceDatesSelection = (TravelExperienceDatesSelection) parcel.readParcelable(ExperiencesSearchResults.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new ExperiencesSearchResults(string, string2, travelExperienceDatesSelection, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperiencesSearchResults[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperiencesSearchResults(String destinationId, String str, TravelExperienceDatesSelection datesSelection, Set categoryIds) {
            super(0);
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
            this.f92926b = destinationId;
            this.f92927c = str;
            this.d = datesSelection;
            this.e = categoryIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExperiencesSearchResults)) {
                return false;
            }
            ExperiencesSearchResults experiencesSearchResults = (ExperiencesSearchResults) obj2;
            return Intrinsics.f(this.f92926b, experiencesSearchResults.f92926b) && Intrinsics.f(this.f92927c, experiencesSearchResults.f92927c) && Intrinsics.f(this.d, experiencesSearchResults.d) && Intrinsics.f(this.e, experiencesSearchResults.e);
        }

        public final int hashCode() {
            int iHashCode = this.f92926b.hashCode() * 31;
            String str = this.f92927c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92926b);
            dest.writeString(this.f92927c);
            dest.writeParcelable(this.d, i);
            Iterator itV = n.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }

        public ExperiencesSearchResults(String str, String str2, TravelExperienceDatesSelection travelExperienceDatesSelection) {
            this(str, str2, travelExperienceDatesSelection, h0.f322473a);
        }
    }
}
