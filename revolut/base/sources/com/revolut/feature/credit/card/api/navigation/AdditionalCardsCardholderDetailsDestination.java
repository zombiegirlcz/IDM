package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/AdditionalCardsCardholderDetailsDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsCardholderDetailsDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsCardholderDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68893c;
    public final TransitionAnimation d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsCardholderDetailsDestination(parcel.readString(), parcel.readString(), parcel.readString(), (TransitionAnimation) parcel.readParcelable(AdditionalCardsCardholderDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsCardholderDetailsDestination[i];
        }
    }

    public AdditionalCardsCardholderDetailsDestination(String facilityId, String cardholderId, String userName, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f68891a = facilityId;
        this.f68892b = cardholderId;
        this.f68893c = userName;
        this.d = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalCardsCardholderDetailsDestination)) {
            return false;
        }
        AdditionalCardsCardholderDetailsDestination additionalCardsCardholderDetailsDestination = (AdditionalCardsCardholderDetailsDestination) obj2;
        return Intrinsics.f(this.f68891a, additionalCardsCardholderDetailsDestination.f68891a) && Intrinsics.f(this.f68892b, additionalCardsCardholderDetailsDestination.f68892b) && Intrinsics.f(this.f68893c, additionalCardsCardholderDetailsDestination.f68893c) && Intrinsics.f(this.d, additionalCardsCardholderDetailsDestination.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f68891a.hashCode() * 31, 31, this.f68892b), 31, this.f68893c);
        TransitionAnimation transitionAnimation = this.d;
        return iC + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68891a);
        dest.writeString(this.f68892b);
        dest.writeString(this.f68893c);
        dest.writeParcelable(this.d, i);
    }
}
