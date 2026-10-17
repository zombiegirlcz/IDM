package com.revolut.feature_travel_hotels_models.booking.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "Lcom/revolut/feature_travel_hotels_models/property/room/TravelHotelsRatePricing;", "<init>", "()V", "Unchanged", "AmountOwed", "Refund", "NewPrice", "Unknown", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$AmountOwed;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$NewPrice;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Refund;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Unchanged;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Unknown;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsBookingAmendmentCost implements TravelHotelsRatePricing {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$AmountOwed;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountOwed extends TravelHotelsBookingAmendmentCost {

        @NotNull
        public static final Parcelable.Creator<AmountOwed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentAmountOwed f97845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentFees f97846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentNewPricing f97847c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountOwed(TravelHotelsBookingAmendmentAmountOwed.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelHotelsBookingAmendmentFees.CREATOR.createFromParcel(parcel), TravelHotelsBookingAmendmentNewPricing.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountOwed[i];
            }
        }

        public AmountOwed(TravelHotelsBookingAmendmentAmountOwed amountOwed, TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees, TravelHotelsBookingAmendmentNewPricing pricing, d dVar) {
            Intrinsics.checkNotNullParameter(amountOwed, "amountOwed");
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            this.f97845a = amountOwed;
            this.f97846b = travelHotelsBookingAmendmentFees;
            this.f97847c = pricing;
            this.d = dVar;
        }

        @Override // com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelHotelsBookingAmendmentFees getF97854a() {
            return this.f97846b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountOwed)) {
                return false;
            }
            AmountOwed amountOwed = (AmountOwed) obj2;
            return Intrinsics.f(this.f97845a, amountOwed.f97845a) && Intrinsics.f(this.f97846b, amountOwed.f97846b) && Intrinsics.f(this.f97847c, amountOwed.f97847c) && Intrinsics.f(this.d, amountOwed.d);
        }

        public final int hashCode() {
            int iHashCode = this.f97845a.hashCode() * 31;
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97846b;
            int iHashCode2 = (this.f97847c.hashCode() + ((iHashCode + (travelHotelsBookingAmendmentFees == null ? 0 : travelHotelsBookingAmendmentFees.hashCode())) * 31)) * 31;
            d dVar = this.d;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97845a.writeToParcel(dest, i);
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97846b;
            if (travelHotelsBookingAmendmentFees == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsBookingAmendmentFees.writeToParcel(dest, i);
            }
            this.f97847c.writeToParcel(dest, i);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$NewPrice;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewPrice extends TravelHotelsBookingAmendmentCost {

        @NotNull
        public static final Parcelable.Creator<NewPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentNewPricing f97848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentFees f97849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f97850c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewPrice(parcel.readInt() == 0 ? null : TravelHotelsBookingAmendmentFees.CREATOR.createFromParcel(parcel), TravelHotelsBookingAmendmentNewPricing.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewPrice[i];
            }
        }

        public NewPrice(TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees, TravelHotelsBookingAmendmentNewPricing pricing, d dVar) {
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            this.f97848a = pricing;
            this.f97849b = travelHotelsBookingAmendmentFees;
            this.f97850c = dVar;
        }

        @Override // com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelHotelsBookingAmendmentFees getF97854a() {
            return this.f97849b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewPrice)) {
                return false;
            }
            NewPrice newPrice = (NewPrice) obj2;
            return Intrinsics.f(this.f97848a, newPrice.f97848a) && Intrinsics.f(this.f97849b, newPrice.f97849b) && Intrinsics.f(this.f97850c, newPrice.f97850c);
        }

        public final int hashCode() {
            int iHashCode = this.f97848a.hashCode() * 31;
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97849b;
            int iHashCode2 = (iHashCode + (travelHotelsBookingAmendmentFees == null ? 0 : travelHotelsBookingAmendmentFees.hashCode())) * 31;
            d dVar = this.f97850c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97848a.writeToParcel(dest, i);
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97849b;
            if (travelHotelsBookingAmendmentFees == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsBookingAmendmentFees.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f97850c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Refund;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends TravelHotelsBookingAmendmentCost {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentRefund f97851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentFees f97852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentNewPricing f97853c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund(TravelHotelsBookingAmendmentRefund.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelHotelsBookingAmendmentFees.CREATOR.createFromParcel(parcel), TravelHotelsBookingAmendmentNewPricing.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(TravelHotelsBookingAmendmentRefund refund, TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees, TravelHotelsBookingAmendmentNewPricing pricing, d dVar) {
            Intrinsics.checkNotNullParameter(refund, "refund");
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            this.f97851a = refund;
            this.f97852b = travelHotelsBookingAmendmentFees;
            this.f97853c = pricing;
            this.d = dVar;
        }

        @Override // com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelHotelsBookingAmendmentFees getF97854a() {
            return this.f97852b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj2;
            return Intrinsics.f(this.f97851a, refund.f97851a) && Intrinsics.f(this.f97852b, refund.f97852b) && Intrinsics.f(this.f97853c, refund.f97853c) && Intrinsics.f(this.d, refund.d);
        }

        public final int hashCode() {
            int iHashCode = this.f97851a.hashCode() * 31;
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97852b;
            int iHashCode2 = (this.f97853c.hashCode() + ((iHashCode + (travelHotelsBookingAmendmentFees == null ? 0 : travelHotelsBookingAmendmentFees.hashCode())) * 31)) * 31;
            d dVar = this.d;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97851a.writeToParcel(dest, i);
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97852b;
            if (travelHotelsBookingAmendmentFees == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsBookingAmendmentFees.writeToParcel(dest, i);
            }
            this.f97853c.writeToParcel(dest, i);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Unchanged;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unchanged extends TravelHotelsBookingAmendmentCost {

        @NotNull
        public static final Parcelable.Creator<Unchanged> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentFees f97854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelHotelsBookingAmendmentNewPricing f97855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f97856c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unchanged(parcel.readInt() == 0 ? null : TravelHotelsBookingAmendmentFees.CREATOR.createFromParcel(parcel), TravelHotelsBookingAmendmentNewPricing.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unchanged[i];
            }
        }

        public Unchanged(TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees, TravelHotelsBookingAmendmentNewPricing pricing, d dVar) {
            Intrinsics.checkNotNullParameter(pricing, "pricing");
            this.f97854a = travelHotelsBookingAmendmentFees;
            this.f97855b = pricing;
            this.f97856c = dVar;
        }

        @Override // com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelHotelsBookingAmendmentFees getF97854a() {
            return this.f97854a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Unchanged)) {
                return false;
            }
            Unchanged unchanged = (Unchanged) obj2;
            return Intrinsics.f(this.f97854a, unchanged.f97854a) && Intrinsics.f(this.f97855b, unchanged.f97855b) && Intrinsics.f(this.f97856c, unchanged.f97856c);
        }

        public final int hashCode() {
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97854a;
            int iHashCode = (this.f97855b.hashCode() + ((travelHotelsBookingAmendmentFees == null ? 0 : travelHotelsBookingAmendmentFees.hashCode()) * 31)) * 31;
            d dVar = this.f97856c;
            return iHashCode + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TravelHotelsBookingAmendmentFees travelHotelsBookingAmendmentFees = this.f97854a;
            if (travelHotelsBookingAmendmentFees == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                travelHotelsBookingAmendmentFees.writeToParcel(dest, i);
            }
            this.f97855b.writeToParcel(dest, i);
            dest.writeSerializable(this.f97856c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost$Unknown;", "Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCost;", "<init>", "()V", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown extends TravelHotelsBookingAmendmentCost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f97857a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f97857a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost
        /* JADX INFO: renamed from: a */
        public final TravelHotelsBookingAmendmentFees getF97854a() {
            return null;
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

    private TravelHotelsBookingAmendmentCost() {
    }

    /* JADX INFO: renamed from: a */
    public abstract TravelHotelsBookingAmendmentFees getF97854a();
}
