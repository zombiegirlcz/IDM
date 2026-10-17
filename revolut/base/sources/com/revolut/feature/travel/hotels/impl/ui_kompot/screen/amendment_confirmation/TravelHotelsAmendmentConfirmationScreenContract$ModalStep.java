package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPayPocketSelection", "CardSelection", "TermsReview", "BedOptionsSelection", "BreakdownDisclaimer", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$BedOptionsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$BreakdownDisclaimer;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$CardSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$TermsReview;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsAmendmentConfirmationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$BedOptionsSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BedOptionsSelection implements TravelHotelsAmendmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BedOptionsSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BedOption f93817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f93818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TravelHotelsRoomsInformation f93819c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BedOption bedOption = (BedOption) j6.a.f(parcel, "parcel", BedOptionsSelection.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BedOptionsSelection.class, parcel, arrayList, iE, 1);
                }
                return new BedOptionsSelection(bedOption, arrayList, (TravelHotelsRoomsInformation) parcel.readParcelable(BedOptionsSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BedOptionsSelection[i];
            }
        }

        public BedOptionsSelection(BedOption selectedBedOption, List bedOptions, TravelHotelsRoomsInformation selection) {
            Intrinsics.checkNotNullParameter(selectedBedOption, "selectedBedOption");
            Intrinsics.checkNotNullParameter(bedOptions, "bedOptions");
            Intrinsics.checkNotNullParameter(selection, "selection");
            this.f93817a = selectedBedOption;
            this.f93818b = bedOptions;
            this.f93819c = selection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BedOptionsSelection)) {
                return false;
            }
            BedOptionsSelection bedOptionsSelection = (BedOptionsSelection) obj2;
            return Intrinsics.f(this.f93817a, bedOptionsSelection.f93817a) && Intrinsics.f(this.f93818b, bedOptionsSelection.f93818b) && Intrinsics.f(this.f93819c, bedOptionsSelection.f93819c);
        }

        public final int hashCode() {
            return this.f93819c.hashCode() + p.a.d(this.f93817a.f98087a.hashCode() * 31, 31, this.f93818b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93817a, i);
            Iterator itV = p.a.v(this.f93818b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f93819c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$BreakdownDisclaimer;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownDisclaimer implements TravelHotelsAmendmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BreakdownDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Quote f93820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserCompanyRegion f93821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f93822c;
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
            this.f93820a = quote;
            this.f93821b = userCompanyRegion;
            this.f93822c = price;
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
            return Intrinsics.f(this.f93820a, breakdownDisclaimer.f93820a) && this.f93821b == breakdownDisclaimer.f93821b && Intrinsics.f(this.f93822c, breakdownDisclaimer.f93822c) && this.d == breakdownDisclaimer.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c((this.f93821b.hashCode() + (this.f93820a.hashCode() * 31)) * 31, 31, this.f93822c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93820a, i);
            dest.writeString(this.f93821b.name());
            dest.writeSerializable(this.f93822c);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$CardSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSelection implements TravelHotelsAmendmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PropertyPayment$Card f93823a;

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
            this.f93823a = cardPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardSelection) && Intrinsics.f(this.f93823a, ((CardSelection) obj2).f93823a);
        }

        public final int hashCode() {
            return this.f93823a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93823a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements TravelHotelsAmendmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f93824a;

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
            this.f93824a = price;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f93824a, ((RevPayPocketSelection) obj2).f93824a);
        }

        public final int hashCode() {
            return this.f93824a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93824a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep$TermsReview;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview implements TravelHotelsAmendmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTermsReviewInputData f93825a;

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
            this.f93825a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsReview) && Intrinsics.f(this.f93825a, ((TermsReview) obj2).f93825a);
        }

        public final int hashCode() {
            return this.f93825a.f83546a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93825a, i);
        }
    }
}
