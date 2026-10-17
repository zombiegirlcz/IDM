package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "CancellationType", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationType f68900b;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType;", "Landroid/os/Parcelable;", "FacilityOwnerCancelAdditionalCard", "FacilityOwnerCancelOwnCard", "AdditionalCardOwnerCancelOwnCard", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$AdditionalCardOwnerCancelOwnCard;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$FacilityOwnerCancelAdditionalCard;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$FacilityOwnerCancelOwnCard;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CancellationType extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$AdditionalCardOwnerCancelOwnCard;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AdditionalCardOwnerCancelOwnCard implements CancellationType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AdditionalCardOwnerCancelOwnCard f68901a = new AdditionalCardOwnerCancelOwnCard();

            @NotNull
            public static final Parcelable.Creator<AdditionalCardOwnerCancelOwnCard> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AdditionalCardOwnerCancelOwnCard.f68901a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AdditionalCardOwnerCancelOwnCard[i];
                }
            }

            private AdditionalCardOwnerCancelOwnCard() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$FacilityOwnerCancelAdditionalCard;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FacilityOwnerCancelAdditionalCard implements CancellationType {

            @NotNull
            public static final Parcelable.Creator<FacilityOwnerCancelAdditionalCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68902a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FacilityOwnerCancelAdditionalCard(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FacilityOwnerCancelAdditionalCard[i];
                }
            }

            public FacilityOwnerCancelAdditionalCard(String cardholderId) {
                Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
                this.f68902a = cardholderId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FacilityOwnerCancelAdditionalCard) && Intrinsics.f(this.f68902a, ((FacilityOwnerCancelAdditionalCard) obj2).f68902a);
            }

            public final int hashCode() {
                return this.f68902a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68902a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType$FacilityOwnerCancelOwnCard;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardCancellationDestination$CancellationType;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FacilityOwnerCancelOwnCard implements CancellationType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FacilityOwnerCancelOwnCard f68903a = new FacilityOwnerCancelOwnCard();

            @NotNull
            public static final Parcelable.Creator<FacilityOwnerCancelOwnCard> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FacilityOwnerCancelOwnCard.f68903a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FacilityOwnerCancelOwnCard[i];
                }
            }

            private FacilityOwnerCancelOwnCard() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellationDestination(parcel.readString(), (CancellationType) parcel.readParcelable(CreditCardCancellationDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationDestination[i];
        }
    }

    public CreditCardCancellationDestination(String facilityId, CancellationType cancellationType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        this.f68899a = facilityId;
        this.f68900b = cancellationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationDestination)) {
            return false;
        }
        CreditCardCancellationDestination creditCardCancellationDestination = (CreditCardCancellationDestination) obj2;
        return Intrinsics.f(this.f68899a, creditCardCancellationDestination.f68899a) && Intrinsics.f(this.f68900b, creditCardCancellationDestination.f68900b);
    }

    public final int hashCode() {
        return this.f68900b.hashCode() + (this.f68899a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68899a);
        dest.writeParcelable(this.f68900b, i);
    }

    public /* synthetic */ CreditCardCancellationDestination(String str) {
        this(str, CancellationType.FacilityOwnerCancelOwnCard.f68903a);
    }
}
