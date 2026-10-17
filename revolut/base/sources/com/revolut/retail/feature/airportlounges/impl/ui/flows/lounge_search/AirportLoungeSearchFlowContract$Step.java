package com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AirportSearch", "AirportDetails", "LoungeDetails", "LoungeAmenities", "PassDetails", "PurchasePass", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$AirportDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$AirportSearch;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$LoungeAmenities;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$LoungeDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$PurchasePass;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AirportLoungeSearchFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$AirportDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirportDetails extends AirportLoungeSearchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirportDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98976a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirportDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportDetails[i];
            }
        }

        public AirportDetails(String airportId) {
            Intrinsics.checkNotNullParameter(airportId, "airportId");
            this.f98976a = airportId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirportDetails) && Intrinsics.f(this.f98976a, ((AirportDetails) obj2).f98976a);
        }

        public final int hashCode() {
            return this.f98976a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98976a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$AirportSearch;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportSearch extends AirportLoungeSearchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AirportSearch f98977a = new AirportSearch();

        @NotNull
        public static final Parcelable.Creator<AirportSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportSearch.f98977a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportSearch[i];
            }
        }

        private AirportSearch() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$LoungeAmenities;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoungeAmenities extends AirportLoungeSearchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoungeAmenities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98978a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoungeAmenities(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoungeAmenities[i];
            }
        }

        public LoungeAmenities(String loungeId) {
            Intrinsics.checkNotNullParameter(loungeId, "loungeId");
            this.f98978a = loungeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoungeAmenities) && Intrinsics.f(this.f98978a, ((LoungeAmenities) obj2).f98978a);
        }

        public final int hashCode() {
            return this.f98978a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98978a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$LoungeDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoungeDetails extends AirportLoungeSearchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoungeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98980b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoungeDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoungeDetails[i];
            }
        }

        public LoungeDetails(String loungeId, String str) {
            Intrinsics.checkNotNullParameter(loungeId, "loungeId");
            this.f98979a = loungeId;
            this.f98980b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoungeDetails)) {
                return false;
            }
            LoungeDetails loungeDetails = (LoungeDetails) obj2;
            return Intrinsics.f(this.f98979a, loungeDetails.f98979a) && Intrinsics.f(this.f98980b, loungeDetails.f98980b);
        }

        public final int hashCode() {
            int iHashCode = this.f98979a.hashCode() * 31;
            String str = this.f98980b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98979a);
            dest.writeString(this.f98980b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$PassDetails;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PassDetails extends AirportLoungeSearchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassDetails f98981a = new PassDetails();

        @NotNull
        public static final Parcelable.Creator<PassDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PassDetails.f98981a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PassDetails[i];
            }
        }

        private PassDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step$PurchasePass;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/lounge_search/AirportLoungeSearchFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PurchasePass extends AirportLoungeSearchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PurchasePass f98982a = new PurchasePass();

        @NotNull
        public static final Parcelable.Creator<PurchasePass> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PurchasePass.f98982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchasePass[i];
            }
        }

        private PurchasePass() {
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

    private AirportLoungeSearchFlowContract$Step() {
    }
}
