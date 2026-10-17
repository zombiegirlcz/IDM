package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "Gallery", "Amenities", "AdditionalDetails", "GuestsReviews", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$AdditionalDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Amenities;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Details;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Gallery;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$GuestsReviews;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsPropertyFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$AdditionalDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalDetails extends TravelHotelsPropertyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93744a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalDetails[i];
            }
        }

        public AdditionalDetails(String propertyId) {
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            this.f93744a = propertyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalDetails) && Intrinsics.f(this.f93744a, ((AdditionalDetails) obj2).f93744a);
        }

        public final int hashCode() {
            return this.f93744a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93744a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Amenities;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amenities extends TravelHotelsPropertyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amenities f93745a = new Amenities();

        @NotNull
        public static final Parcelable.Creator<Amenities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amenities.f93745a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amenities[i];
            }
        }

        private Amenities() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Details;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends TravelHotelsPropertyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f93746a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f93746a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$Gallery;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gallery extends TravelHotelsPropertyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Gallery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93747a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gallery(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gallery[i];
            }
        }

        public Gallery(ArrayList imageUrls) {
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            this.f93747a = imageUrls;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Gallery) && Intrinsics.f(this.f93747a, ((Gallery) obj2).f93747a);
        }

        public final int hashCode() {
            return this.f93747a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f93747a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step$GuestsReviews;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/property/TravelHotelsPropertyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GuestsReviews extends TravelHotelsPropertyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GuestsReviews> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93748a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GuestsReviews(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GuestsReviews[i];
            }
        }

        public GuestsReviews(String propertyId) {
            Intrinsics.checkNotNullParameter(propertyId, "propertyId");
            this.f93748a = propertyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GuestsReviews) && Intrinsics.f(this.f93748a, ((GuestsReviews) obj2).f93748a);
        }

        public final int hashCode() {
            return this.f93748a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93748a);
        }
    }

    private TravelHotelsPropertyFlowContract$Step() {
    }
}
