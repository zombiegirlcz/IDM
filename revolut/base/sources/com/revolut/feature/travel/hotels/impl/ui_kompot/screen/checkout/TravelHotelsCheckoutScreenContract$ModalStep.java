package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPayPocketSelection", "CardSelection", "BreakdownDisclaimer", "BedOptionsSelection", "TermsReview", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$BedOptionsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$BreakdownDisclaimer;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$CardSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$TermsReview;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$BedOptionsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BedOptionsSelection implements TravelHotelsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BedOptionsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BedOptionSelection f93896a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BedOptionsSelection((BedOptionSelection) parcel.readParcelable(BedOptionsSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BedOptionsSelection[i];
            }
        }

        public BedOptionsSelection(BedOptionSelection bedOptionSelection) {
            Intrinsics.checkNotNullParameter(bedOptionSelection, "bedOptionSelection");
            this.f93896a = bedOptionSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BedOptionsSelection) && Intrinsics.f(this.f93896a, ((BedOptionsSelection) obj2).f93896a);
        }

        public final int hashCode() {
            return this.f93896a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93896a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$BreakdownDisclaimer;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownDisclaimer implements TravelHotelsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BreakdownDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Quote f93897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserCompanyRegion f93898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f93899c;
        public final e d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakdownDisclaimer((Quote) parcel.readParcelable(BreakdownDisclaimer.class.getClassLoader()), UserCompanyRegion.valueOf(parcel.readString()), (d) parcel.readSerializable(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownDisclaimer[i];
            }
        }

        public BreakdownDisclaimer(Quote quote, UserCompanyRegion userCompanyRegion, d price, e assetType) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.f93897a = quote;
            this.f93898b = userCompanyRegion;
            this.f93899c = price;
            this.d = assetType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BreakdownDisclaimer)) {
                return false;
            }
            BreakdownDisclaimer breakdownDisclaimer = (BreakdownDisclaimer) obj2;
            return Intrinsics.f(this.f93897a, breakdownDisclaimer.f93897a) && this.f93898b == breakdownDisclaimer.f93898b && Intrinsics.f(this.f93899c, breakdownDisclaimer.f93899c) && this.d == breakdownDisclaimer.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c((this.f93898b.hashCode() + (this.f93897a.hashCode() * 31)) * 31, 31, this.f93899c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93897a, i);
            dest.writeString(this.f93898b.name());
            dest.writeSerializable(this.f93899c);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$CardSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSelection implements TravelHotelsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PropertyPayment$Card f93900a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSelection(PropertyPayment$Card.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelection[i];
            }
        }

        public CardSelection(PropertyPayment$Card cardPayment) {
            Intrinsics.checkNotNullParameter(cardPayment, "cardPayment");
            this.f93900a = cardPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardSelection) && Intrinsics.f(this.f93900a, ((CardSelection) obj2).f93900a);
        }

        public final int hashCode() {
            return this.f93900a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93900a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements TravelHotelsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f93901a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPayPocketSelection((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPayPocketSelection[i];
            }
        }

        public RevPayPocketSelection(d price) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.f93901a = price;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f93901a, ((RevPayPocketSelection) obj2).f93901a);
        }

        public final int hashCode() {
            return this.f93901a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93901a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep$TermsReview;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/checkout/TravelHotelsCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview implements TravelHotelsCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTermsReviewInputData f93902a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsReview((RevPointsTermsReviewInputData) parcel.readParcelable(TermsReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsReview[i];
            }
        }

        public TermsReview(RevPointsTermsReviewInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f93902a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsReview) && Intrinsics.f(this.f93902a, ((TermsReview) obj2).f93902a);
        }

        public final int hashCode() {
            return this.f93902a.f83546a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93902a, i);
        }
    }
}
