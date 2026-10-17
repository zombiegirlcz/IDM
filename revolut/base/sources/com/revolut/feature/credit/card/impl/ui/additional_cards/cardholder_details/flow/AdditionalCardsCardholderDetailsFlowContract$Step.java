package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardholderDetails", "SetUpMonthlySpendingLimit", "SetUpSinglePurchaseSpendingLimit", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$CardholderDetails;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$SetUpMonthlySpendingLimit;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$SetUpSinglePurchaseSpendingLimit;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdditionalCardsCardholderDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$CardholderDetails;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardholderDetails extends AdditionalCardsCardholderDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardholderDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69012b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardholderDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardholderDetails[i];
            }
        }

        public CardholderDetails(String cardholderId, String userName) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.f69011a = cardholderId;
            this.f69012b = userName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardholderDetails)) {
                return false;
            }
            CardholderDetails cardholderDetails = (CardholderDetails) obj2;
            return Intrinsics.f(this.f69011a, cardholderDetails.f69011a) && Intrinsics.f(this.f69012b, cardholderDetails.f69012b);
        }

        public final int hashCode() {
            return this.f69012b.hashCode() + (this.f69011a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69011a);
            dest.writeString(this.f69012b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$SetUpMonthlySpendingLimit;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetUpMonthlySpendingLimit extends AdditionalCardsCardholderDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetUpMonthlySpendingLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69015c;
        public final d d;
        public final b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetUpMonthlySpendingLimit(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetUpMonthlySpendingLimit[i];
            }
        }

        public SetUpMonthlySpendingLimit(String cardholderId, d limitAmount, d limitMin, d limitMax, b currency) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
            Intrinsics.checkNotNullParameter(limitMin, "limitMin");
            Intrinsics.checkNotNullParameter(limitMax, "limitMax");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f69013a = cardholderId;
            this.f69014b = limitAmount;
            this.f69015c = limitMin;
            this.d = limitMax;
            this.e = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetUpMonthlySpendingLimit)) {
                return false;
            }
            SetUpMonthlySpendingLimit setUpMonthlySpendingLimit = (SetUpMonthlySpendingLimit) obj2;
            return Intrinsics.f(this.f69013a, setUpMonthlySpendingLimit.f69013a) && Intrinsics.f(this.f69014b, setUpMonthlySpendingLimit.f69014b) && Intrinsics.f(this.f69015c, setUpMonthlySpendingLimit.f69015c) && Intrinsics.f(this.d, setUpMonthlySpendingLimit.d) && Intrinsics.f(this.e, setUpMonthlySpendingLimit.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + v7.c(v7.c(v7.c(this.f69013a.hashCode() * 31, 31, this.f69014b), 31, this.f69015c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69013a);
            dest.writeSerializable(this.f69014b);
            dest.writeSerializable(this.f69015c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step$SetUpSinglePurchaseSpendingLimit;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetUpSinglePurchaseSpendingLimit extends AdditionalCardsCardholderDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetUpSinglePurchaseSpendingLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69018c;
        public final d d;
        public final b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetUpSinglePurchaseSpendingLimit(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetUpSinglePurchaseSpendingLimit[i];
            }
        }

        public SetUpSinglePurchaseSpendingLimit(String cardholderId, d dVar, d limitMin, d limitMax, b currency) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            Intrinsics.checkNotNullParameter(limitMin, "limitMin");
            Intrinsics.checkNotNullParameter(limitMax, "limitMax");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f69016a = cardholderId;
            this.f69017b = dVar;
            this.f69018c = limitMin;
            this.d = limitMax;
            this.e = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetUpSinglePurchaseSpendingLimit)) {
                return false;
            }
            SetUpSinglePurchaseSpendingLimit setUpSinglePurchaseSpendingLimit = (SetUpSinglePurchaseSpendingLimit) obj2;
            return Intrinsics.f(this.f69016a, setUpSinglePurchaseSpendingLimit.f69016a) && Intrinsics.f(this.f69017b, setUpSinglePurchaseSpendingLimit.f69017b) && Intrinsics.f(this.f69018c, setUpSinglePurchaseSpendingLimit.f69018c) && Intrinsics.f(this.d, setUpSinglePurchaseSpendingLimit.d) && Intrinsics.f(this.e, setUpSinglePurchaseSpendingLimit.e);
        }

        public final int hashCode() {
            int iHashCode = this.f69016a.hashCode() * 31;
            d dVar = this.f69017b;
            return this.e.hashCode() + v7.c(v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f69018c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69016a);
            dest.writeSerializable(this.f69017b);
            dest.writeSerializable(this.f69018c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    private AdditionalCardsCardholderDetailsFlowContract$Step() {
    }
}
