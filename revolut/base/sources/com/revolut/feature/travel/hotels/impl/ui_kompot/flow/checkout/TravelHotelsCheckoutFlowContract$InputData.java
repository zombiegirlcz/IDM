package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomsSelectionParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SearchResults", "DropOff", "Property", "RoomDetails", "RoomsSelection", "Checkout", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$DropOff;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$SearchResults;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsCheckoutFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$Checkout;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCheckoutParams f93693a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(TravelHotelsCheckoutParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(TravelHotelsCheckoutParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f93693a = params;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9 */
        public final String getF93701a() {
            return this.f93693a.f93650a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f93693a, ((Checkout) obj2).f93693a);
        }

        public final int hashCode() {
            return this.f93693a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93693a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$DropOff;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropOff implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DropOff> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableTravelHotelsDropoff f93694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93695b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropOff((NavigableTravelHotelsDropoff) parcel.readParcelable(DropOff.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropOff[i];
            }
        }

        public DropOff(NavigableTravelHotelsDropoff dropOff, String str) {
            Intrinsics.checkNotNullParameter(dropOff, "dropOff");
            this.f93694a = dropOff;
            this.f93695b = str;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9, reason: from getter */
        public final String getF93701a() {
            return this.f93695b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropOff)) {
                return false;
            }
            DropOff dropOff = (DropOff) obj2;
            return Intrinsics.f(this.f93694a, dropOff.f93694a) && Intrinsics.f(this.f93695b, dropOff.f93695b);
        }

        public final int hashCode() {
            int iHashCode = this.f93694a.hashCode() * 31;
            String str = this.f93695b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93694a, i);
            dest.writeString(this.f93695b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$RoomDetails;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomDetails implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RoomDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomDetailsParams f93699a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomDetails(TravelHotelsRoomDetailsParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomDetails[i];
            }
        }

        public RoomDetails(TravelHotelsRoomDetailsParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f93699a = params;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9 */
        public final String getF93701a() {
            return this.f93699a.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomDetails) && Intrinsics.f(this.f93699a, ((RoomDetails) obj2).f93699a);
        }

        public final int hashCode() {
            return this.f93699a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93699a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$RoomsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoomsSelection implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RoomsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsRoomsSelectionParams f93700a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoomsSelection(TravelHotelsRoomsSelectionParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoomsSelection[i];
            }
        }

        public RoomsSelection(TravelHotelsRoomsSelectionParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f93700a = params;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9 */
        public final String getF93701a() {
            return this.f93700a.f93663a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RoomsSelection) && Intrinsics.f(this.f93700a, ((RoomsSelection) obj2).f93700a);
        }

        public final int hashCode() {
            return this.f93700a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93700a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$SearchResults;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchResults implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SearchResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93703c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                return new SearchResults(string, parcel.readString(), z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchResults[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SearchResults() {
            boolean z = false;
            this(null, 31, z, z);
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9, reason: from getter */
        public final String getF93701a() {
            return this.f93701a;
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
            return Intrinsics.f(this.f93701a, searchResults.f93701a) && this.f93702b == searchResults.f93702b && this.f93703c == searchResults.f93703c && this.d == searchResults.d && Intrinsics.f(this.e, searchResults.e);
        }

        public final int hashCode() {
            String str = this.f93701a;
            int iC = j6.a.c(j6.a.c(j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f93702b), 31, this.f93703c), 31, this.d);
            String str2 = this.e;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93701a);
            dest.writeInt(this.f93702b ? 1 : 0);
            dest.writeInt(this.f93703c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }

        public /* synthetic */ SearchResults(String str, int i, boolean z, boolean z3) {
            this(null, (i & 16) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3, false);
        }

        public SearchResults(String str, String str2, boolean z, boolean z3, boolean z4) {
            this.f93701a = str;
            this.f93702b = z;
            this.f93703c = z3;
            this.d = z4;
            this.e = str2;
        }
    }

    /* JADX INFO: renamed from: c9 */
    String getF93701a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData$Property;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/flow/checkout/TravelHotelsCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Property implements TravelHotelsCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotelsPropertyInputData f93696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93698c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                HotelsPropertyInputData hotelsPropertyInputData = (HotelsPropertyInputData) parcel.readParcelable(Property.class.getClassLoader());
                String string = parcel.readString();
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Property(hotelsPropertyInputData, string, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Property[i];
            }
        }

        public Property(HotelsPropertyInputData propertyInputData, String str, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(propertyInputData, "propertyInputData");
            this.f93696a = propertyInputData;
            this.f93697b = str;
            this.f93698c = z;
            this.d = z3;
            this.e = z4;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData
        /* JADX INFO: renamed from: c9, reason: from getter */
        public final String getF93701a() {
            return this.f93697b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Property)) {
                return false;
            }
            Property property = (Property) obj2;
            return Intrinsics.f(this.f93696a, property.f93696a) && Intrinsics.f(this.f93697b, property.f93697b) && this.f93698c == property.f93698c && this.d == property.d && this.e == property.e;
        }

        public final int hashCode() {
            int iHashCode = this.f93696a.hashCode() * 31;
            String str = this.f93697b;
            return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f93698c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93696a, i);
            dest.writeString(this.f93697b);
            dest.writeInt(this.f93698c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }

        public /* synthetic */ Property(HotelsPropertyInputData hotelsPropertyInputData, boolean z, boolean z3, int i) {
            this(hotelsPropertyInputData, null, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z3, false);
        }
    }
}
