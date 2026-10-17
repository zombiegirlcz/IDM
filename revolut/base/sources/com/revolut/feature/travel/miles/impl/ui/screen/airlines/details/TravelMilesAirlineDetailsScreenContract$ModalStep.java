package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsBottomSheet", "RedeemOptionBottomSheet", "RevPointsGiftcardsPurchase", "AccountRegistrationByTaxId", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$AccountRegistrationByTaxId;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RedeemOptionBottomSheet;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RevPointsGiftcardsPurchase;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelMilesAirlineDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$AccountRegistrationByTaxId;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRegistrationByTaxId implements TravelMilesAirlineDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountRegistrationByTaxId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesAirline f94266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94267b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRegistrationByTaxId((TravelMilesAirline) parcel.readParcelable(AccountRegistrationByTaxId.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRegistrationByTaxId[i];
            }
        }

        public AccountRegistrationByTaxId(TravelMilesAirline airline, String taxId) {
            Intrinsics.checkNotNullParameter(airline, "airline");
            Intrinsics.checkNotNullParameter(taxId, "taxId");
            this.f94266a = airline;
            this.f94267b = taxId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountRegistrationByTaxId)) {
                return false;
            }
            AccountRegistrationByTaxId accountRegistrationByTaxId = (AccountRegistrationByTaxId) obj2;
            return Intrinsics.f(this.f94266a, accountRegistrationByTaxId.f94266a) && Intrinsics.f(this.f94267b, accountRegistrationByTaxId.f94267b);
        }

        public final int hashCode() {
            return this.f94267b.hashCode() + (this.f94266a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94266a, i);
            dest.writeString(this.f94267b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RedeemOptionBottomSheet;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedeemOptionBottomSheet implements TravelMilesAirlineDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RedeemOptionBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelMilesRedeemOption f94268a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedeemOptionBottomSheet((TravelMilesRedeemOption) parcel.readParcelable(RedeemOptionBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedeemOptionBottomSheet[i];
            }
        }

        public RedeemOptionBottomSheet(TravelMilesRedeemOption redeemOption) {
            Intrinsics.checkNotNullParameter(redeemOption, "redeemOption");
            this.f94268a = redeemOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RedeemOptionBottomSheet) && Intrinsics.f(this.f94268a, ((RedeemOptionBottomSheet) obj2).f94268a);
        }

        public final int hashCode() {
            return this.f94268a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94268a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet implements TravelMilesAirlineDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f94269a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f94269a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep$RevPointsGiftcardsPurchase;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsGiftcardsPurchase implements TravelMilesAirlineDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPointsGiftcardsPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsGiftcardsPurchaseController$InputData f94270a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsGiftcardsPurchase((RevPointsGiftcardsPurchaseController$InputData) parcel.readParcelable(RevPointsGiftcardsPurchase.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsGiftcardsPurchase[i];
            }
        }

        public RevPointsGiftcardsPurchase(RevPointsGiftcardsPurchaseController$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f94270a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsGiftcardsPurchase) && Intrinsics.f(this.f94270a, ((RevPointsGiftcardsPurchase) obj2).f94270a);
        }

        public final int hashCode() {
            return this.f94270a.f83671a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94270a, i);
        }
    }
}
