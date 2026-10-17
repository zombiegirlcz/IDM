package com.revolut.feature.travel.experiences.impl.ui.flow.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Home", "Booking", "Experience", "SearchResults", "Discovery", "Search", "ActiveBookings", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Booking;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Discovery;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Experience;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Search;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$SearchResults;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesHomeFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$ActiveBookings;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActiveBookings extends TravelExperiencesHomeFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActiveBookings f92976a = new ActiveBookings();

        @NotNull
        public static final Parcelable.Creator<ActiveBookings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActiveBookings.f92976a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveBookings[i];
            }
        }

        private ActiveBookings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Booking;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Booking extends TravelExperiencesHomeFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Booking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92977a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Booking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Booking[i];
            }
        }

        public Booking(String bookingId) {
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            this.f92977a = bookingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Booking) && Intrinsics.f(this.f92977a, ((Booking) obj2).f92977a);
        }

        public final int hashCode() {
            return this.f92977a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92977a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Discovery;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Discovery extends TravelExperiencesHomeFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Discovery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92979b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Discovery(((LocationId.DestinationId) parcel.readParcelable(Discovery.class.getClassLoader())).f92881a, (TravelExperienceDatesSelection) parcel.readParcelable(Discovery.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discovery[i];
            }
        }

        public Discovery(String destinationId, TravelExperienceDatesSelection datesSelection) {
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92978a = destinationId;
            this.f92979b = datesSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Discovery)) {
                return false;
            }
            Discovery discovery = (Discovery) obj2;
            return Intrinsics.f(this.f92978a, discovery.f92978a) && Intrinsics.f(this.f92979b, discovery.f92979b);
        }

        public final int hashCode() {
            return this.f92979b.hashCode() + (this.f92978a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new LocationId.DestinationId(this.f92978a), i);
            dest.writeParcelable(this.f92979b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Experience;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Experience extends TravelExperiencesHomeFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Experience> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92980a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Experience(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experience[i];
            }
        }

        public Experience(String experienceId) {
            Intrinsics.checkNotNullParameter(experienceId, "experienceId");
            this.f92980a = experienceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Experience) && Intrinsics.f(this.f92980a, ((Experience) obj2).f92980a);
        }

        public final int hashCode() {
            return this.f92980a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92980a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Home;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends TravelExperiencesHomeFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f92981a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f92981a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$Search;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Search extends TravelExperiencesHomeFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92982a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search((TravelExperienceDatesSelection) parcel.readParcelable(Search.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        public Search(TravelExperienceDatesSelection datesSelection) {
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f92982a = datesSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Search) && Intrinsics.f(this.f92982a, ((Search) obj2).f92982a);
        }

        public final int hashCode() {
            return this.f92982a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92982a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData$SearchResults;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/home/TravelExperiencesHomeFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults extends TravelExperiencesHomeFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelExperienceDatesSelection f92985c;
        public final Set d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                String str = ((LocationId.DestinationId) j6.a.f(parcel, "parcel", SearchResults.class)).f92881a;
                String string = parcel.readString();
                TravelExperienceDatesSelection travelExperienceDatesSelection = (TravelExperienceDatesSelection) parcel.readParcelable(SearchResults.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new SearchResults(str, string, travelExperienceDatesSelection, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        public SearchResults(String destinationId, String str, TravelExperienceDatesSelection datesSelection, Set categoryIds) {
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
            this.f92983a = destinationId;
            this.f92984b = str;
            this.f92985c = datesSelection;
            this.d = categoryIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SearchResults)) {
                return false;
            }
            SearchResults searchResults = (SearchResults) obj2;
            return Intrinsics.f(this.f92983a, searchResults.f92983a) && Intrinsics.f(this.f92984b, searchResults.f92984b) && Intrinsics.f(this.f92985c, searchResults.f92985c) && Intrinsics.f(this.d, searchResults.d);
        }

        public final int hashCode() {
            int iHashCode = this.f92983a.hashCode() * 31;
            String str = this.f92984b;
            return this.d.hashCode() + ((this.f92985c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new LocationId.DestinationId(this.f92983a), i);
            dest.writeString(this.f92984b);
            dest.writeParcelable(this.f92985c, i);
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    private TravelExperiencesHomeFlowContract$InputData() {
    }
}
